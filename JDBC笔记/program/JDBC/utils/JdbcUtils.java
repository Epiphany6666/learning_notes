package com.atguigu.api.statement.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

/**
 * v1.0版本工具类
 *  内部包含一个连接池对象，并且对外提供获取连接和回收连接的方法！
 *
 *  小建议：
 *       工具类的方法，推荐写成静态，外部调用会更加方便！
 *
 *  实现：
 *      属性 -> 连接池对象 [实例化一次]
 *          两种处理方式：
 *             1.单例模式
 *             2.静态代码块（静态代码块是单例模式的一种实现方式）
 *
 *      两个方法：
 *          对外提供连接的方法
 *          回收外部传入连接方法
 */
public class JdbcUtils {
    private static DataSource dataSource = null;//连接池对象

    static {
        //初始化连接池对象
        Properties properties = new Properties();

        InputStream isp = JdbcUtils.class.getClassLoader().getResourceAsStream("druid.properties");

        /*try {
            properties.load(isp);//static代码块里的异常没地方抛，只能try-catch
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        }*/

        //直接一个try-catch包围
        try {
            properties.load(isp);//static代码块里的异常没地方抛，只能try-catch
            DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    /**
     * 对外听连接的方法
     * @return
     */
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    /**
     *
     */

    public static void freeConnection(Connection connection) throws SQLException {
        connection.close();//连接池的连接，调用close就是回收！
    }
}
