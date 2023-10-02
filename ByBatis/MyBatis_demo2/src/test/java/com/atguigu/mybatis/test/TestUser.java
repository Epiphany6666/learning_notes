package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.ParameterMapper;
import com.atguigu.mybatis.pojo.User;
import com.atguigu.mybatis.utils.SqlSessionUtils;
import com.mysql.jdbc.Driver;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

public class TestUser {
    /**
     * MyBatis获取参数值的两种方式：${} 和 #{}
     * ${}本质是字符串拼接
     * 问题：1.Sql注入       2.单引号需要自己手动写
     *
     * #{}本质是占位符赋值（一般是用这个）
     */


    @Test
    public void testGetAllUser() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        List<User> allUser = mapper.getAllUser();
        allUser.forEach(user -> System.out.println(user));
    }

    //原生JDBC的操作方式：
    @Test
    public void testJDBC() throws Exception {
        Class clazz = Class.forName("com.mysql.jdbc.Driver");
        Properties info = new Properties();
        info.put("username", "root");
        info.put("password", "123456");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mybatis", info);
        String sql = "select * from t_user where id = ?;";
        //如果是手动的拼接：
        // PreparedStatement preparedStatement = connection.prepareStatement(select * from t_user where id = '" + username + "'";);
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setObject(1, 4);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet);
        }
        connection.close();
        preparedStatement.close();
    }

    @Test
    public void testGetUserByUsername () {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User user = mapper.getUserByUsername("jfdks");
        System.out.println(user);
    }

    @Test
    public void testCheckLogin() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User user = mapper.checkLogin("jfdks", "123456");
        System.out.println(user);
    }

    @Test
    public void testCheckLoginByMap() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("username", "jfdks");
        map.put("password", "123456");
        User user = mapper.checkLoginByMap(map);
        System.out.println(user);
    }

    @Test
    public void testInsertUser() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        int row = mapper.insertUser(new User(null, "李四", "123", 1, "男", "123@qq.com"));
        System.out.println(row);
    }

    @Test
    public void testCheckLoginByParam() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User user = mapper.checkLoginByParam("jfdks", "123456");
        System.out.println(user);
    }
}
