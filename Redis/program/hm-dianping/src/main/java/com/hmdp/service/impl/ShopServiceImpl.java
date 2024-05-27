package com.hmdp.service.impl;

import cn.hutool.core.util.BooleanUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.hmdp.dto.Result;
import com.hmdp.entity.Shop;
import com.hmdp.mapper.ShopMapper;
import com.hmdp.service.IShopService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hmdp.utils.CacheClient;
import com.hmdp.utils.RedisConstants;
import com.hmdp.utils.RedisData;
import com.hmdp.utils.SystemConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static com.hmdp.utils.RedisConstants.*;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 虎哥
 * @since 2021-12-22
 */
@Service
public class ShopServiceImpl extends ServiceImpl<ShopMapper, Shop> implements IShopService {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Resource // 注入
    private CacheClient cacheClient;

    @Override
    public Result queryById(Long id) {
        // 解决缓存穿透
        // this::getById：传入的应该是一个查询数据库的函数，并且这个函数的参数，id是Long类型的，返回值是你要查询的结果，这里即Shop，如果用Lambda表达式可以写成这样：id2 -> getById(id2)，但是像这样的Lambda表达式是可以简写的：this::getById
        // 也就是说我们以后在做缓存穿透的时候，这一行代码就搞定了，因为我们已经有工具类了，而且以后任意的对象都能使用这个工具类
        Shop shop = cacheClient
                .queryWithPassThrough(CACHE_SHOP_KEY, id, Shop.class, this::getById, CACHE_SHOP_TTL, TimeUnit.MINUTES);

        // 互斥锁解决缓存击穿
        // Shop shop = cacheClient
        //         .queryWithMutex(CACHE_SHOP_KEY, id, Shop.class, this::getById, CACHE_SHOP_TTL, TimeUnit.MINUTES);

        // 逻辑过期解决缓存击穿，为了测试缓存击穿，时间就设置为20s
        // Shop shop = cacheClient
        //         .queryWithLogicalExpire(CACHE_SHOP_KEY, id, Shop.class, this::getById, 20L, TimeUnit.SECONDS);

        if (shop == null) {
            return Result.fail("店铺不存在！");
        }
        // 7.返回
        return Result.ok(shop);
    }

    public Shop queryWithMutex(Long id)  {
        String key = CACHE_SHOP_KEY + id;
        // 1、从redis中查询商铺缓存
        String shopJson = stringRedisTemplate.opsForValue().get(key);
        // 2、判断是否存在
        if (StrUtil.isNotBlank(shopJson)) {
            // 存在,直接返回
            return JSONUtil.toBean(shopJson, Shop.class);
        }
        //判断命中的值是否是空值
        if (shopJson != null) {
            //返回一个错误信息
            return null;
        }
        // 4.实现缓存重构，缓存重建业务比较复杂，不是一步两步就能搞定的
        // 4.1 获取互斥锁，是一个key
        String lockKey = "lock:shop:" + id;
        Shop shop = null;
        try {
            boolean isLock = tryLock(lockKey);
            // 4.2 判断否获取成功
            if(!isLock){
                // 4.3 失败，则休眠并重试
                // 休眠不要花费太长时间，这里可以先休眠50毫秒试一试，这个方法有异常，最后解决它
                Thread.sleep(50);
                // 重试就是递归即可
                return queryWithMutex(id);
            }
            // PS：获取锁成功应该再次检测redis缓存是否存在，做DoubleCheck。如果存在则无需重建缓存。但是这里先不检查了。
            // 4.4 成功，根据id查询数据库
            shop = getById(id);
            // 模拟重建的延迟
            Thread.sleep(200);
            // 5.不存在，返回错误 // 这个是解决缓存穿透的
            if(shop == null){
                //将空值写入redis
                stringRedisTemplate.opsForValue().set(key,"",CACHE_NULL_TTL,TimeUnit.MINUTES);
                //返回错误信息
                return null;
            }
            // 6.写入redis
            stringRedisTemplate.opsForValue().set(key,JSONUtil.toJsonStr(shop),CACHE_NULL_TTL,TimeUnit.MINUTES);
            // 最后ctrl + T用try-catch-finally将代码包起来
        } catch (Exception e){
            // 这里异常我们就不去做处理了，因为sleep是打断的异常，直接往外抛即可
            throw new RuntimeException(e);
        }
        finally {
            // 7.释放互斥锁，因为抛异常的情况下，也是需要执行unlock的，因此需要放到unlock
            unlock(lockKey);
        }
        // 返回
        return shop;
    }

    private static final ExecutorService CACHE_REBUILD_EXECUTOR = Executors.newFixedThreadPool(10);
    public Shop queryWithLogicalExpire( Long id ) {
        String key = CACHE_SHOP_KEY + id;
        // 1.从redis查询商铺缓存
        String json = stringRedisTemplate.opsForValue().get(key);
        // 2.判断是否存在
        if (StrUtil.isBlank(json)) {
            // 3.存在，直接返回
            return null;
        }
        // 4.命中，需要先把json反序列化为对象
        RedisData redisData = JSONUtil.toBean(json, RedisData.class);
        Shop shop = JSONUtil.toBean((JSONObject) redisData.getData(), Shop.class);
        LocalDateTime expireTime = redisData.getExpireTime();
        // 5.判断是否过期
        if(expireTime.isAfter(LocalDateTime.now())) {
            // 5.1.未过期，直接返回店铺信息
            return shop;
        }
        // 5.2.已过期，需要缓存重建
        // 6.缓存重建
        // 6.1.获取互斥锁
        String lockKey = LOCK_SHOP_KEY + id;
        boolean isLock = tryLock(lockKey);
        // 6.2.判断是否获取锁成功
        if (isLock){
            CACHE_REBUILD_EXECUTOR.submit( ()->{

                try{
                    //重建缓存
                    this.saveShop2Redis(id,20L);
                }catch (Exception e){
                    throw new RuntimeException(e);
                }finally {
                    unlock(lockKey);
                }
            });
        }
        // 6.4.返回过期的商铺信息
        return shop;
    }

    private Shop queryWithPassThrough(Long id) {
        // 1.从redis查询商铺缓存，查询的时候需要选择一个数据结构，应该选哈希还是string呢？这里存的商铺肯定是一个对象，存储一个对象很多同学会说选哈希。
        // 没错，选哈希完全可以，因为之前演示的时候都是用哈希来演示，这里就用string来演示。
        // 店铺key的选择要确保唯一，现在传店铺，每一个店铺都要有一个唯一的key，店铺的id就是唯一的，因此在这里直接使用id作为key。当然我们需要一个前缀
        String key = CACHE_SHOP_KEY + id;
        String shopJson = stringRedisTemplate.opsForValue().get(key);
        // 2.判断是否存在
        if (StrUtil.isNotBlank(shopJson)) {
            // 3.存在，直接返回
            return JSONUtil.toBean(shopJson, Shop.class);
        }
        //\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        // 判断命中的是否是空值
        if (shopJson != null) {
            // 返回一个错误信息，由于抽成了方法，因此返回null即可
//            return Result.fail("店铺信息不存在！");
            return null;
        }
        //\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

        // 4.不存在，根据id查询数据库
        Shop shop = getById(id);
        // 5.查询数据库不存在，直接返回错误
        if (shop == null) {
            //\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
            // 将空值写入redis，并且有效期不能像真实数据那么长(30分钟)
            stringRedisTemplate.opsForValue().set(key, "", CACHE_NULL_TTL, TimeUnit.MINUTES);
            //返回错误信息
//            return Result.fail("店铺不存在！");
            return null;
            //\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        }
        // 6.存在，写入redis
        stringRedisTemplate.opsForValue().set(key, JSONUtil.toJsonStr(shop), CACHE_SHOP_TTL, TimeUnit.MINUTES);
        // 7.返回
        return shop;
    }

    // tryLock：尝试获取锁。锁就是redis中的一个key，所以key由使用者传给我们，我们就不在这写死了
    private boolean tryLock(String key) {
        // 执行setnx，ctrl + p查看参数，可以发现它在存的时候是可以同时设置有效期的
        // 有效期的时长跟你的业务有关，一般正常你的业务执行时间是多少，你这个锁的有效期就比它长一点，长个10倍20倍(避免异常情况)，例如这里就设置为10秒钟
        Boolean flag = stringRedisTemplate.opsForValue().setIfAbsent(key, "1", 10, TimeUnit.SECONDS);
        // 这里不要直接将flag返回，因为直接返回它是会做拆箱的，在拆箱的过程中是有可能出现空指针的，因此这里建议大家使用一个工具类BooleanUtil，是hutool包中的，它可以帮你做一个判断（isTrue、isFalse方法），或者它也可以直接帮你拆箱（isBollean方法）
        return BooleanUtil.isTrue(flag);
    }

    // unlock：释放锁
    private void unlock(String key) {
        // 之前分析过了，方法锁就是将锁删掉
        stringRedisTemplate.delete(key);
    }

    // saveShop2Redis：将shop添加到redis中
    public void saveShop2Redis(Long id, Long expireSeconds) throws InterruptedException {
        // 1.查询店铺数据
        Shop shop = getById(id);
        Thread.sleep(200);
        // 2.封装逻辑过期时间
        RedisData redisData = new RedisData();
        redisData.setData(shop);
        // 过期时间由参数传进来
        redisData.setExpireTime(LocalDateTime.now().plusSeconds(expireSeconds));
        // 3.写入Redis
        stringRedisTemplate.opsForValue().set(CACHE_SHOP_KEY + id, JSONUtil.toJsonStr(redisData));
    }

    // 将来删除缓存的时候如果抛异常，那么更新数据库的也应该回滚，因此整个方法应该有一个统一的事物
    @Transactional
    @Override
    public Result update(Shop shop) {
        Long id = shop.getId();
        if (id == null) {
            return Result.fail("店铺id不能为空");
        }
        // 1.更新数据库
        updateById(shop);
        // 2.删除缓存
        stringRedisTemplate.delete(CACHE_SHOP_KEY + id);

        return Result.ok();
    }
}
