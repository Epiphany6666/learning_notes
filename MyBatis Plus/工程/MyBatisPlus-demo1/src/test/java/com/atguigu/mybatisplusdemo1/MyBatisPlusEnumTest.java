package com.atguigu.mybatisplusdemo1;

import com.atguigu.mybatisplusdemo1.enums.SexEnum;
import com.atguigu.mybatisplusdemo1.mapper.UserMapper;
import com.atguigu.mybatisplusdemo1.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MyBatisPlusEnumTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void test() {
        User user = new User();
        user.setName("admin");
        user.setAge(33);
        user.setSex(SexEnum.MALE);
        //注意，此时这里会直接报错，因为它是把枚举的name存到了数据库中！
        //Cause: java.sql.SQLException: Incorrect integer value: 'MALE' for column 'sex' at row 1
        int result = userMapper.insert(user);
        System.out.println("result： " + result);
    }
}
