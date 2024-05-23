package com.heima;

import com.itheima.Main;
import com.itheima.redis.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest(classes = Main.class)
public class RedisDemoApplicationTests {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Test
    void testString() {
        // 写入一条String数据
        redisTemplate.opsForValue().set("name", "虎哥");
        // 获取string数据
        Object name = redisTemplate.opsForValue().get("name");
        System.out.println("name = " + name);
    }

    @Test
    void testSavaUser() {
        // 写入数据
        redisTemplate.opsForValue().set("user:100", new User("虎哥", 21));
        // 获取数据，返回的是一个Object，因为它不知道我们取出来的是什么类型的对象，但是由于我们自己知道，因此完全可以做一个强转
        Object user = redisTemplate.opsForValue().get("user:100");
        System.out.println("user = " + user);
    }
}
