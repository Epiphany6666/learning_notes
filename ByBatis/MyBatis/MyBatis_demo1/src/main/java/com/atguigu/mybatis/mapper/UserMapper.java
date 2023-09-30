package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.Result;

import java.util.List;

public interface UserMapper {
    /**
     * MyBatis面向接口编程的两个一致：
     * 1.映射文件的namespace（命名空间）的值要和mapper接口的全类名保持一致
     * 2.映射文件中SQL语句的id要和mapper接口中的方法名一致
     *
     * 表---实体类---mapper接口---映射文件
     */
    /**
     * 添加用户信息
     */
    int insertUser();
    int updateUser();
    int deleteUser();

    /**
     * 根据id查询用户信息
     * @return
     */
    User getUserById();

    /**
     * 查询所有用户信息
     */
    List<User> getAllUser();
}