package com.hmdp.utils;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.StrUtil;
import com.hmdp.dto.UserDTO;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static com.hmdp.utils.RedisConstants.LOGIN_USER_KEY;
import static com.hmdp.utils.RedisConstants.LOGIN_USER_TTL;

public class RefreshTokenInterceptor implements HandlerInterceptor {

    private StringRedisTemplate stringRedisTemplate;
    // 这里只能使用构造函数，因为这个类的对象是我们手动new出来的，而不是通过Component一些注解构建的，即不是spring创建的，此时是没有人帮你自动做依赖注入的，因此不能再使用@Autowired或者@Resource之类的注解。
    // 那么我们使用构造函数注入，谁来帮我们注入？那就看是谁使用了RefreshTokenInterceptor，即在MvcConfig拦截器中用到它了。在MvcConfig类上加了@Configuration，代表这个类将来是spring帮我们注入的，那么由spring来构建这个类的对象，它可以直接做依赖注入。
    public RefreshTokenInterceptor(StringRedisTemplate stringRedisTemplate) {
        this.stringRedisTemplate = stringRedisTemplate;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 1.获取请求头中的token
        String token = request.getHeader("authorization");
        // 使用hutool中的StrUtil类
        if (StrUtil.isBlank(token)) {
            return true;
        }
        // 2.基于TOKEN获取redis中的用户
        String key = LOGIN_USER_KEY + token;
        // 注意取的时候不能用get方法，因为get方法只能取哈希中的一个键值。但我们现在想取的是哈希中所有的键值对，此时就应该使用entries()，它的返回值就是一个Map，一个key中整个哈希键值都会返回。
        Map<Object, Object> userMap = stringRedisTemplate.opsForHash().entries(key);
        // 3.判断用户是否存在
        if (userMap.isEmpty()) {
            return true;
        }
        // 5.将查询到的hash数据转为UserDTO，由于存进去的时候是一个Map，因此取出来的时候肯定也是一个Map。存进去的时候使用的是BeanUtil，因此取出来的时候应该也使用BeanUtil。
        // 第三个参数：isIgnoreError，你要不要忽略转换中的错误。那肯定不忽略，因此写false
        UserDTO userDTO = BeanUtil.fillBeanWithMap(userMap, new UserDTO(), false);
        // 6.存在，保存用户信息到 ThreadLocal
        UserHolder.saveUser(userDTO);
        // 7.刷新token有效期
        stringRedisTemplate.expire(key, LOGIN_USER_TTL, TimeUnit.MINUTES);
        // 8.放行
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        // 移除用户
        UserHolder.removeUser();
    }
}
	