package com.itheima.jedis.util;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class JedisConnectionFactory {
    private static final JedisPool jedisPool;

    static {
        //配置连接池
        JedisPoolConfig poolConfig = new JedisPoolConfig();
        //配置最大连接数
        poolConfig.setMaxTotal(8);
        //最大空闲链接，即便没有人来访问池子，池子里也可以预备8个连接，这样的话有人来了就可以直接用，不用临时创建
        poolConfig.setMaxIdle(8);
        //最小空闲连接。但是这些连接一直放那里也不太好，因此这些连接放置一段时间后如果没有人用，就会被清理，直到它为0为止
        poolConfig.setMinIdle(0);
        //等待连接时长：当连接池中没有连接可用的时候，要不要等待？等多长时间？默认值为-1，即一直等，直到有新的空闲连接为止，过了1000毫秒，还没连接，就会报错
        poolConfig.setMaxWaitMillis(1000);
        //创建连接池对象，第一个参数是它的连接池config对象，config显然是做配置的；然后是IP地址，端口号，超时时间，密码。
        // 也就是说JedisPool传入的都是一些连接的参数，而前面config对象中传的是池的一些参数。
        jedisPool = new JedisPool(poolConfig, "43.136.85.110", 6379, 1000,  "123321");
    }

    public static Jedis getJedis() {
        return jedisPool.getResource();
    }
}
