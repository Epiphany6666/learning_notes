package com.hmdp.utils;

import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

@Component // 定义成spring中的一个bean，方便我们后续使用
public class RedisIdWorker {
    /**
     * 开始时间戳，这个是使用main方法测试出来的
     LocalDateTime now = LocalDateTime.of(2022, 1, 1, 0, 0 ,0);
     long second = now.toEpochSecond(ZoneOffset.UTC);
     System.out.println("second = " + second);
     */
    private static final long BEGIN_TIMESTAMP = 1640995200L;
    /**
     * 序列号的位数
     */
    private static final int COUNT_BITS = 32;

    private StringRedisTemplate stringRedisTemplate;

    public RedisIdWorker(StringRedisTemplate stringRedisTemplate) {
        this.stringRedisTemplate = stringRedisTemplate;
    }

    // 方法的返回值是Long，因为按照之前的策略，我们最终的id是一个64位的数字就是对应了Java的Long
    // 参数keyPrefix：生成策略是基于redis的自增长，redis的自增肯定是需要有一个key，然后值不断自增。不同的业务肯定有不同的key，大家不能都去用同一个自增长，因此这里需要有前缀去区分不同的业务，例如订单业务可以传order过来
    public long nextId(String keyPrefix) {
        // 1.生成时间戳，时间戳是一个31位的数字，单位是秒，它的值需要有一个基础的日期作为开始时间，时间戳的值就是用基础时间减去当前时间得到的秒数
        LocalDateTime now = LocalDateTime.now();
        long nowSecond = now.toEpochSecond(ZoneOffset.UTC);
        long timestamp = nowSecond - BEGIN_TIMESTAMP;

        // 2.生成序列号
        // 2.1.获取当前日期，精确到天yyyyMMdd。这里用冒号分开，因为在redis中如果你的key用冒号分隔，这样在redis中就是分层级的
        // 当我要统计某天、某月、某年的订单量的时候，就可以很方便的利用前缀统计，例如统计一个月就可以使用yyyy:MM作为前缀
        String date = now.format(DateTimeFormatter.ofPattern("yyyy:MM:dd"));
        // 2.2.自增长
        // icr表示自增长，然后拼上业务(keyPrefix)，但是到这key还不能结束。
        // 假设keyPrefix传进来的是order，就意味着整个订单业务它永远采用的是一个key来做自增长。也就是说不管你这个业务是经历了1年、2年，那么永远都是同一个key，但随着我们的业务逐渐发展，订单越来越多，那么自增的值也会越来越大。而redis单个key的自增长对应的数值是有一个上限的，2的64次方。虽然这个值已经非常非常大了，但是它也是有一个上限的，万一超过了这个上限怎么办？
        // 而且你不要忘了，我们的key的策略里面，真正用来记录序列号的只有32个比特位，而reids是64比特位，超过64位很难，但是超过32位还是有可能的
        // 所以尽管是同一个业务，也不能使用同一个key，否则就很有可能会超过上限。办法：在业务前缀的后面，拼上一个时间戳，这个时间戳精确到天。这样的好处是将来如果想统计这一天一共下了多少单，那么直接看key的日期对应的值就行了，因此它还有一个统计效果
        // PS：这里可能会报黄，说你这里拆箱可能会有空指针。但实际上这个方法并不会导致空指针，因为如果这个key不存在，它就会自动取给你创建一个key，所以你根本不用管
        long count = stringRedisTemplate.opsForValue().increment("icr:" + keyPrefix + ":" + date);

        // 3.拼接并返回，这个移动的位数COUNT_BITS最好别写死，定义为一个变量，因为现在是移动32位，但万一以后算法有变。因此可以定义为常量COUNT_BITS
        return timestamp << COUNT_BITS | count;
    }
}