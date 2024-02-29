package com.atguigu.api.statement.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * TODO:
 *      利用线程本地变量，存储连接信息！确保一个线程的多个方法可以获取同一个connection！
 *      优势：实务操作的时候 service 和 dao 属于同一个线程，不同再传递参数了！
 *      大家都可以调用getConnection自动获取的是相同的连接池！
 */
public class JdbcUtilsV2 {
    private static DataSource dataSource = null;//连接池对象

    //声明一个全局的线程本地变量
    private static ThreadLocal<Connection> tl = new ThreadLocal<>();

    static {
        //初始化连接池对象
        Properties properties = new Properties();

        InputStream isp = JdbcUtilsV2.class.getClassLoader().getResourceAsStream("druid.properties");

        try {
            properties.load(isp);//static代码块里的异常没地方抛，只能try-catch
            dataSource = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    /**
     * 对外听连接的方法
     * @return
     */
    public static Connection getConnection() throws SQLException {
        //先查看线程本地变量中是否存在
        Connection connection = tl.get();

        //第一次没有
        if (connection == null) {
            //线程本地变量没有，连接池获取
            connection = dataSource.getConnection();

            tl.set(connection);
        }
        return connection;
    }

    public static void freeConnection() throws SQLException {
        Connection connection = tl.get();
        if (connection != null) {
            tl.remove();//清空线程本地变量数据
            connection.setAutoCommit(true);//回归事务状态 false
            connection.close();//回收到连接池即可

        }

    }
}
