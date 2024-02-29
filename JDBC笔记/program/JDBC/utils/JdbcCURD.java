package com.atguigu.api.statement.utils;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * 基于jdbc的工具类
 */

public class JdbcCURD {
    public void testInsert() throws SQLException {
        Connection connection = JdbcUtils.getConnection();

        //数据库curd动作

        JdbcUtils.freeConnection(connection);
    }
}
