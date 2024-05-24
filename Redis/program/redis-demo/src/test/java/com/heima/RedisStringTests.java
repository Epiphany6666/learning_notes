package com.heima;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.itheima.Main;
import com.itheima.redis.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.Map;

@SpringBootTest(classes = Main.class)
public class RedisStringTests {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    void testString() {
// 写入一条String数据
        stringRedisTemplate.opsForValue().set("name", "虎哥");
        // 获取string数据
        Object name = stringRedisTemplate.opsForValue().get("name");
        System.out.println("name = " + name);
    }

    // ObjectMapper是SpringMVC中默认使用的JSON处理工具，因此这里就用它了，跟以前接触的fastjson是一样的，它的作用就是将对象转成JSON，这里当然也可以使用fastjson
    private static final ObjectMapper mapper = new ObjectMapper();

    // 存对象
    @Test
    void testSaveUser() throws JsonProcessingException {
        // 创建对象
        User user = new User("虎哥", 21);
        // 手动序列化，这里可能会有异常，碰见异常直接往外面抛即可
        // mapper是JSON的工具，跟以前接触的fastjson是一样的，它的作用就是将对象转成JSON
        String json = mapper.writeValueAsString(user);
        // 写入数据
        stringRedisTemplate.opsForValue().set("user:200", json);

        // 获取数据的时候默认就是字符串
        String jsonUser = stringRedisTemplate.opsForValue().get("user:200");
        // 手动反序列化
        User user1 = mapper.readValue(jsonUser, User.class);
        System.out.println("user1 = " + user1);
    }

    @Test
    void testHash() {
        stringRedisTemplate.opsForHash().put("user:400", "name", "虎哥");
        stringRedisTemplate.opsForHash().put("user:400", "age", "21");

        // 取一个字段是get方法，取好多字段是entries方法，Java是entrySet方法，也是类似的。
        // values方法就是获取里面的值
        Map<Object, Object> entries = stringRedisTemplate.opsForHash().entries("user:400");
        System.out.println("entries = " + entries);
    }
}
