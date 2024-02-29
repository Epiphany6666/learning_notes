package com.atguigu.api.statement.utils;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.*;

/**
 * 封装Dao数据库重复代码！
 * TODO：
 *  封装两个方法  一个简化非DQL
 *              一个简化DQL
 *
 *              List<Object> params
 */

public class BaseDao {
    /**
     * 封装简化非SQL 语句
     * @param sql   带占位符的SQL语句
     * @param params    占位符的值   PS:传入占位符的值，必须等于SQL语句？位置！
     * @return  执行影响的行数
     */
    public int executeUpdate(String sql, Objects... params) throws Exception {//可变参数必须存在于形参列表的最后一位
        //获取连接
        Connection connection = JdbcUtilsV2.getConnection();

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        //5.占位符赋值
        //可变参数可以当数组使用
        for (int i = 1; i <= params.length; i++) {
            preparedStatement.setObject(i, params[i - 1]);//注意一定要是i - 1，否则会数组下标越界
        }

        int rows = preparedStatement.executeUpdate();

        preparedStatement.close();
        //是否回收连接，需要考虑是不是事务
        if (connection.getAutoCommit()) {
            //没有开启事务
            //没有开启事务 正常回收连接！
            JdbcUtilsV2.freeConnection();
        }
//        connection.setAutoCommit(false);//开启事务了 不要管连接即可！ 由业务层来处理

        return rows;
    }

    /**
     * 非DQL语句封装方法 ->返回值 固定位int
     *
     * DQL语句封装方法 -> 返回值 是什么类型呢？
     *      DQL -> List<Map> -> 一行 -> map ->List<Map>
     *      but,并不是List<Map> map key 和 value都是自定义的，不用先设定好！
     *                  但是map是没有数据校验机制的
     *                  map 不支持反射操作
     *
     *         实际上：  数据库中的数据 -> 对应到java的实体类
     *         数据库中的表等于 java类中的一个对象
     *         多行数据可以等于Java实体类中的集合
     *
     * 所以DQL语句返回值应该为List<T> list
     *
     * <T> 声明一个泛型，不确定类型
     *          1.确定泛型 User.class T = User
     *          2.要使用反射技术属性赋值
     * public <T>  List<T> executeQuery(Class<T> clazz, String sql, Object... params);
     */

    /**
     * 将查询结果封装到一个实体类集合！
     * @param clazz 要接值的实体类集合的模板对象
     * @param sql   查询语句，要求列名或者别名等于实体类的属性名！
     * @param params  占位符的值，要和？位置对象传递
     * @return 查询的实体类集合
     * @param <T> 声明的结果的泛型
     * @throws Exception
     */

    public <T> List<T> executeQuery(Class<T> clazz, String sql, Object... params) throws Exception {
        //获取连接
        Connection connection = JdbcUtilsV2.getConnection();

        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        if (params == null && params.length != 0) {
            for (int i = 1; i <= params.length; i++) {
                preparedStatement.setObject(i, params[i - 1]);
            }
        }

        ResultSet resultSet = preparedStatement.executeQuery();

        List<T> list = new ArrayList<>();

        //TODO:metaData 装的当前 结果集 列的信息对象！（他可以获取列的名称 根据下角标，可以获取列的数量）
        ResultSetMetaData metaData = resultSet.getMetaData();

        //有了它以后，我们可以水平遍历列！
        int columnCount = metaData.getColumnCount();
        //一行数据对应一个 T 类型的对象

        while(resultSet.next()) {
            T t = clazz.newInstance();//调用类的无参构造函数实例化对象！

            for (int i = 1; i <= columnCount; i++) {
                //对象的属性值
                Object value = resultSet.getObject(i);

                //对象的属性名
                String propertyName = metaData.getColumnLabel(i);

                //反射给对象的属性值
                Field field = clazz.getDeclaredField(propertyName);
                field.setAccessible(true);//属性可以设置，打破private的修饰限制
                /**
                 * 参数1：要赋值的对象 如果属性是静态属性，第一个参数 可以为null！
                 * 参数2：具体的属性值
                 *
                 */
                field.set(t, value);
            }
            list.add(t);
        }

        //关闭资源
        resultSet.close();
        preparedStatement.close();
        if (connection.getAutoCommit()) {
            //没有事务，可以关闭
            JdbcUtilsV2.freeConnection();
        }

        return list;
    }
}
