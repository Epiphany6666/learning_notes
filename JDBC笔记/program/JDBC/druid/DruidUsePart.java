package com.atguigu.api.statement.druid;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.alibaba.druid.pool.DruidPooledConnection;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * 连接池使用类
 */
public class DruidUsePart {
    /**
     * 直接使用代码设置连接池连接参数方式！
     * 1.创建一个druid连接池对象
     *
     * 2.设置连接池参数 [必须 | 非必须 ]
     *
     * 3.获取连接 [通用方法，所有连接池都一样]
     *
     * 4.回收链接 [通用方法，所有连接池都一样]
     */
    public void testHard() throws SQLException {
        //连接池对象
        DruidDataSource dataSource = new DruidDataSource();

        //设置参数
        //必须 连接数据库驱动类的全限定符[注册驱动] | url | user | password
        dataSource.setUrl("jdbc:mysql://localhost:3306/itcast");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");//帮助我们进行驱动注册和获取连接
        //非必须 初始化连接数量，最大的连接数量...
        dataSource.setInitialSize(5);//初始化连接数量
        dataSource.setMaxActive(10);//最大的数量

        //获取连接
        Connection connection = dataSource.getConnection();

        //数据库curd

        //回收连接
        connection.close();//连接池提供的连接，close，就是回收连接！
    }

    /**
     * 通过读取外部配置稳健的方法，实例化druid连接池对象
     */
    @Test
    public void testSoft() throws Exception {
        //1.读取外部配置文件 到 Properties对象中
        Properties properties = new Properties();

        //获取当前类的类加载器，它有个方法叫getResourceAsStream();只要在里面写 配置的名字即可
        //PS：如果是放在src下的配置文件就可以只写名字，但如果不是放在src下的配置文件，就需要加上路径：xxx/druid.properties
        InputStream ips = DruidUsePart.class.getClassLoader().getResourceAsStream("druid.properties");

        properties.load(ips);

        //2.使用连接池的工具类的工厂模式，创建连接池
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);

        Connection connection = dataSource.getConnection();

        //3.数据库curd

        //4.收回连接
        connection.close();
    }
}
