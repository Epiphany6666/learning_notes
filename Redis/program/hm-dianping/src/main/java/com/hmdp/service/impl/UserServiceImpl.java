package com.hmdp.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import cn.hutool.core.lang.UUID;
import cn.hutool.core.util.RandomUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hmdp.dto.LoginFormDTO;
import com.hmdp.dto.Result;
import com.hmdp.dto.UserDTO;
import com.hmdp.entity.User;
import com.hmdp.mapper.UserMapper;
import com.hmdp.service.IUserService;
import com.hmdp.utils.RedisConstants;
import com.hmdp.utils.RegexUtils;
import com.hmdp.utils.SystemConstants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static com.hmdp.utils.RedisConstants.*;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author 虎哥
 * @since 2021-12-22
 */
@Service
@Slf4j
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Autowired
    private UserMapper userMapper;
    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public Result sendCode(String phone, HttpSession session) {
        // 1.校验手机号
        if (RegexUtils.isPhoneInvalid(phone)) {
            // 2.如果不符合，返回错误信息
            return Result.fail("手机号格式错误！");
        }
        // 3.符合，生成验证码
        String code = RandomUtil.randomNumbers(6);

        // 4.保存验证码到redis
        // 4.1 跟之前保存到session的代码差不多，不过要注意的是，这个key需要加一个业务前缀，形成层次。因为之前也分析过了，redis是大家都来存的一个空间，如果大家都直接将手机号作为key，很有可能其他业务也是这么做的，就产生冲突了
        // 这里是做login业务，然后这个业务是做code验证的
        // 4.2 这里的key最好设置一个有效期，例如：验证码五分钟内有效。如果有人没事干，一直在这里狂点，redis中就存了无数条数据，而且还不删除，终有一天redis就会被占满。因此为了避免这样的问题发生，我们存入redis的key一定要设置一个有效期
        // set方法参数列表中就可以传入有效期，ctrl + p可以查看参数。第一种方式：时间(long) + 单位(TimeUnit)；第二种方式：Duration
        // 这里就设置为2分钟。这个有点类似于redis中的 set key value ex

        // 但是需要注意的是：login:code 和 2 尽量都给它定义为常量。这样写看起来有点漏，万一取的时候key写错了怎么办。
        // stringRedisTemplate.opsForValue().set("login:code:" + phone, code, 2, TimeUnit.MINUTES);
        // 因此我们就可以将常量定义在在utils.RedisConstants
        stringRedisTemplate.opsForValue().set(LOGIN_CODE_KEY + phone, code, LOGIN_CODE_TTL, TimeUnit.MINUTES);
        log.debug("发送短信验证码成功，验证码：{}", code);

        return Result.ok();
    }

    @Override
    public Result login(LoginFormDTO loginForm, HttpSession session) {
        // 1.校验手机号
        String phone = loginForm.getPhone();
        if (RegexUtils.isPhoneInvalid(phone)) {
            // 2.如果不符合，返回错误信息
            return Result.fail("手机号格式错误！");
        }
        // 3.从redis获取验证码并校验
        String cacheCode = stringRedisTemplate.opsForValue().get(LOGIN_CODE_KEY + phone);
        String code = loginForm.getCode();
        if (cacheCode == null || !cacheCode.equals(code)) {
            // 不一致，报错
            return Result.fail("验证码错误");
        }

        // 4.一致，根据手机号查询用户 select * from tb_user where phone = ?
        User user = query().eq("phone", phone).one();

        // 5.判断用户是否存在
        if (user == null) {
            // 6.不存在，创建新用户并保存
            user = createUserWithPhone(phone);
        }

        // 7.保存用户信息到 redis中
        // 7.1.随机生成token，这里使用的是UUID，作为登录令牌
        // UUID有两：一个Java自带的，一个Hutool提供的。toString()有两个重载方法，toString(true)表示不带下划线，参数名叫isSimple。如果是toString()，那就是带下划线。
        String token = UUID.randomUUID().toString(true);
        // 7.2.以token为key，将User对象转为HashMap存储
        UserDTO userDTO = BeanUtil.copyProperties(user, UserDTO.class);
        // 使用BeanUtil（hutool提供的），它里面有个方法叫beanToMap，它的作用就是将一个bean转为Map
        // 随着时间增长，用户会越来越多
        Map<String, Object> userMap = BeanUtil.beanToMap(userDTO, new HashMap<>(),
                CopyOptions.create()
                        .setIgnoreNullValue(true)
                        .setFieldValueEditor((fieldName, fieldValue) -> fieldValue.toString()));
        // 7.3.存储
        // token最好也加一个前缀
        String tokenKey = LOGIN_USER_KEY + token;
        stringRedisTemplate.opsForHash().putAll(tokenKey, userMap);
        // 7.4.设置token有效期，那这个有效期设置多久呢？
        stringRedisTemplate.expire(tokenKey, LOGIN_USER_TTL, TimeUnit.MINUTES);

        // 8.返回token
        return Result.ok(token);
    }

    private User createUserWithPhone(String phone) {
        // 创建用户
        User user = new User();
        user.setPhone(phone);
        // 这里用户名就随机生成，由于工具类随机生成的字符串会看起来很混乱，因此加一个前缀，这样用户名会看起来更统一一些
        // 这个前缀最好也定义成常量，在我们在自己定义的常量类SystemConstants中有一个USER_NICK_NAME_PREFIX，它的值就是user_，即前缀
        // 像京东那些，如果你第一次使用手机号登录，它都会给你生成一个有规律的用户名称
        user.setNickName(SystemConstants.USER_NICK_NAME_PREFIX + RandomUtil.randomString(10));
        // 调用MybatisPlus的save方法保存用户到数据库
        save(user);
        // 返回已经创建的用户
        return user;
    }
}
