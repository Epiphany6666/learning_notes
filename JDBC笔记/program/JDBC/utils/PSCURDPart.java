package com.atguigu.api.statement.utils;

import org.junit.Test;

import java.sql.*;
import java.util.*;

/**
 * 写四个Test方法（public开头 并且 Test方法不能有返回值，方法名随便写，但不能有形参列表）
 */
public class PSCURDPart extends BaseDao{

    //测试方法需要导入junit的测试包
    @Test
    public void testInsert() throws ClassNotFoundException, SQLException {
        String sql = "insert into employee(id, salary) values(?, ?);";

        int rows = executeUpdate(sql, 1, 111);
    }

    @Test
    public void testUpdate() throws ClassNotFoundException, SQLException {
        //1.注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        //2.获取连接
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/itcast?user=root&password=123456");

        //3.编写sql语句
        String sql = "update employee set id = ?, salary = ? where id = ?";

        //4.创建preparedstatement对象，并传入sql语句
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        //5.给?赋值
        preparedStatement.setObject(1, 10);
        preparedStatement.setObject(2, 199);
        preparedStatement.setObject(3, 1);

        //6.发送sql语句
        int rows = preparedStatement.executeUpdate();

        //7.处理返回结果
        if (rows > 0) {
            System.out.println("修改成功");
        } else {
            System.out.println("修改失败");
        }

        //8.关闭资源
        connection.close();
        preparedStatement.close();
    }

    @Test
    public void testDelete() throws ClassNotFoundException, SQLException {
        //1.注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        //2.提供连接
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/itcast?user=root&password=123456");

        //3.编写sql语句
        String sql = "delete from Employee where id = ?;";

        //4.创建preparedStatement对象
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        //5.给?赋值
        preparedStatement.setObject(1, 3);

        //6.发送sql语句
        int rows = preparedStatement.executeUpdate();

        //7.处理返回结果
        if (rows > 0) {
            System.out.println("删除成功");
        } else {
            System.out.println("删除失败");
        }

        //8.关闭资源
        connection.close();
        preparedStatement.close();
    }


    /**
     * TODO:查询所有用户数据，并且封装到一个List<Map> list 集合中
     *
     * 解释：
     *      查询的数据一定有很多行
     *      数据库 -> resultSet ->java -> ->一行 - map（key=列名，value=列的内容） -> List<Map> list
     *
     *  实现思路：
     *      遍历行数据，一行对应一个map？获取一行的列名和对应的属性，装配即可！
     *      将map装到一个集合就可以了！
     *
     *  难点：
     *      如何获取列的名称？
     */
    @Test
    public void testSelect() throws ClassNotFoundException, SQLException {
        /*HashMap<String, Objects> map = new HashMap<>();
        List<HashMap<Objects, Objects>> list = new ArrayList<>();*/
        //1.注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        //2.获取连接
        Connection connection = DriverManager.getConnection("jdbc:mysql:///itcast?user=root&password=123456");

        //3.编写sql语句
//        String sql = "select * from Employee where id = ?;";
        String sql = "select * from Employee;";

        //4.创建preparedStatement对象
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        //5.给占位符赋值
//        preparedStatement.setObject(1, 5);

        //6.发送sql
        ResultSet resultSet = preparedStatement.executeQuery();

        //7.处理返回结果
        List<Map> list = new ArrayList<>();

        //获取列的信息对象
        //TODO:metaData 装的当前 结果集 列的信息对象！（他可以获取列的名称 根据下角标，可以获取列的数量）
        ResultSetMetaData metaData = resultSet.getMetaData();

        //有了它以后，我们可以水平遍历列！
        int columnCount = metaData.getColumnCount();

        while(resultSet.next()) {
            Map map = new HashMap();
            //注释掉的是我乱写的。。。
            /*int id = resultSet.getInt("id");
            Object o1 = new Object(id);
            String name = resultSet.getString(2);
            map.put("id", id);
            map.put("name", name);
            System.out.println(id);*/

            //一行数据对应一个map
            //纯手动写值//不推荐！
            /*map.put("id", resultSet.getInt("id"));
            map.put("name", resultSet.getString(2));
            list.add(map);*/

            //智能一点：自动遍历列，注意，要从1开始，并且小于等于总列数！
            for (int i = 1; i <= columnCount; i++) {
                //获取指定列下角标的值都是通过resultSet对象
                Object value = resultSet.getObject(i);
                /**
                 * 获取指定列下角标的列的名称！如果要获取列中下角标的名称，都要使用ResultSetMetaData对象
                 * 选的时候会碰到 getColumnLabel 和 getColumnName：但一定要选择 getColumnLabel
                 * 因为：getColumnLabel：会获取别名，如果没有写别名才是列的名称 不用用getColumnName：只会获取列的名称！
                 */
                String columnLabel = metaData.getColumnLabel(i);
                map.put(columnLabel, value);
            }
            list.add(map);
        }
        System.out.println(list);

        //8.关闭资源
        connection.close();
        preparedStatement.close();
    }

    @Test
    public void testSelect2() throws ClassNotFoundException, SQLException {
//        DriverManager.registerDriver(new Driver());
        Class.forName("com.mysql.cj.jdbc.Driver");

        Properties info = new Properties();
        info.put("user", "root");
        info.put("password", "123456");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/itcast", info);

        String sql = "select * from employee;";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        ResultSet resultSet = preparedStatement.executeQuery();

        ResultSetMetaData metaData = resultSet.getMetaData();
        int columnCount = metaData.getColumnCount();

        List<Map> list = new ArrayList<>();
        while(resultSet.next()) {
            Map map = new HashMap();
            for (int i = 1; i <= columnCount; i++) {
                String columnLabel = metaData.getColumnLabel(i);
                map.put(columnLabel, resultSet.getObject(i));
            }
            list.add(map);
        }
        System.out.println(list);

        connection.close();
        preparedStatement.close();
    }
}
