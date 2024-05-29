package com.hmdp.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RedissonConfig {

    @Bean
    // 这个类就是Redission的工厂类了，从它里面可以拿到Redission中各种各样的工具，因此这里将RedissionClient定义成了一个Bean，方便我们后续去使用
    public RedissonClient redissonClient(){
        // 配置
        Config config = new Config();
        // useSingleServer：表示我们这个Redission用的是单节点的redis，因为我们目前没有做集群
        // 如果将来你是集群，也可以使用config.useClusterServers()添加集群地址，然后配置多个地址
        // redis:/ 代表redis协议
        config.useSingleServer().setAddress("redis://43.136.85.110:6379")
            .setPassword("123321");
        // 创建RedissonClient对象
        return Redisson.create(config);
    }
}
