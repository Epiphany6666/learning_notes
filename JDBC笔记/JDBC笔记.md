1. ## 为什么要JDBC

   - java和数据库必要纽带
   - 数据库层框架底层原理jdbc概念理解

2. ## jbdb概念理解

   - JDBC：Java Datebase Connectivity | Java链接数据库技术的统称！
     通俗点说，在Java代码中，使用JDBC提供的方法，可以发送字符串类型的SQL语句到**数据库管理软件**（MySQL，Oracle等），并且获取语句执行结果！进而实现数据库数据CURD操作的技术
   - java语言只提供规范（接口），规定数据库操作方法！标准的类库存在于java.sql，javax.sql包下
     个数据库厂商，根据java的jdbc规范（接口），完成具体的实现驱动代码（jar）！实现代码可以不同！但是方法都相同！
     JDBC由java提供的jdbc规范（接口）+ 各个数据库厂商的实现驱动jar包（里面装的就是JDBC的实现类）！
   - JDBC是一种典型的面向接口编程！
   - JDBC的优势：
     1. 我们只需要学习jdbc接口规定方法，即可操作所有数据库软件
     2. 项目中期需要切换数据库，我们只需要更新第三方驱动jar包，不需要更改代码！

3. ## 核心api和使用路线

   - jar包是java程序打成的一种压缩包格式，你可以将这些jar包引入你的项目中，然后你可以使用这个java程序中类和方法以及属性了！
   - 设计具体核心类和接口
     1. DriverManager
        - 将第三方数据库厂商的实现驱动jar注册到程序中
        - 可以根据数据库链接信息获取connection
     2. Connection
        - 和数据库建立的链接，在链接对象上，可以多次执行数据库curd动作
        - 可以获取 statement 和 preparedstatement，callablestatement 对象
     3. Statement（查询静态SQL路线（没有动态值语句） | PreparedStatement（预编译SQL路线（有动态值语句） | CallableStatement（执行标准存储过程SQL路线）
        - 具体发送SQL语句到数据库管理软件的对象
        - 不同发送方式稍有不同！**preparedstatement** 使用为重点！
     4. Result
        - 面向对象思维的产物（抽象成数据库的查询结果表）
        - 存储DQL查询数据库结果的对象
        - 需要我们进行解析，获取具体的数据库数据

4. ## 为什么选择8x版本驱动

5. ## 使用步骤总结

   - 驱动jar版本选择

   - java工程导入依赖

     ​	a. 项目创建lib文件夹

     ​	b. 导入驱动依赖jar包

     ​	c. jar包右键-添加为项目依赖（Add as Library）//因为此时和程序还没有什么关联
     ​    如果出现了倒三角，可以展开，即说明关联成功，拥有能链接的环境

   - jdbc基本使用步骤分析（6步）

     1. 注册驱动
     2. 获取链接
     3. 创建发送sql语句对象
     4. 发送sql语句，并获取返回结果
     5. 结果集解析
     6. 自愿关闭

6. ## statement_基本步骤演示

   - PS：在setting-Editor-File and Code Templates--Class里可以设置自动添加注释

     ```java
     package com.atguigu.api.statement;
     
     import com.mysql.cj.jdbc.Driver;
     
     import java.sql.*;
     import java.util.Collection;
     
     public class StatementQueryPart {
         public static void main(String[] args) throws SQLException {
             //1.注册驱动
             /**
              * TODO：
              *   注册驱动
              *   依赖：驱动版本8+ com.mysql.cj.jdbc.Driver
              *        驱动版本5+ com.mysql.jdbc.Driver
              */
             DriverManager.registerDriver(new Driver());
     
             //2.获取连接
             /**
              * TODO
              *   java程序要和数据库创建连接！
              *   java程序，连接数据库，肯定是调用某个方法，方法也需要填入连接数据库的基本信息：
              *         数据库ip地址 127.0.0.1 //本地机ip
              *         数据库端口号 3306
              *         账号 root
              *         密码 123456
              *         连接数据库的名称：atguigu
              * DriverManager.getConnection会返回一个链接，用Connection接口去接收后面的实现类（多态）
              */
     
             /**
              * 参数1：url
              *      jdbc:数据库厂商名://ip地址:prot/数据库名
              *      jdbc:mysql://127.0.0.1:3306/itheima
              * 参数2：username 数据库软件的账号 root
              * 参数3：password 数据库软件的密码 root
              */
             // java.sql 接口 = 实现类
             Connection connection = DriverManager.
                     getConnection("jdbc:mysql://127.0.0.1:3306/itcast", "root", "123456");
     
             //3.创建statement
             Statement statement = connection.createStatement();
     
             //发送sql语句，并获取返回结果
             String sql = "select * from employee;";
             ResultSet resultSet = statement.executeQuery(sql);
     
             //5.进行结果解析
             //看看有没有下一行数据，有，你就可以获取
             while (resultSet.next()) {
                 /*int id = resultSet.getInt("id");
                 String workno = resultSet.getString("workno");
                 String name = resultSet.getString("name");
                 String gender = resultSet.getString("gender");
                 int age = resultSet.getInt("age");
                 String idcard = resultSet.getString("idcard");
                 String work = resultSet.getString("work");
                 System.out.println(id + "--" + workno
                         + "--" + name + "--" + gender + "--" + age + "--" + idcard + "--" + work);*/
     
                 int id = resultSet.getInt("id");
                 int salary = resultSet.getInt("salary");
                 System.out.println(id + "--" + salary);
             }
     
             //关闭资源(从内往外关)
             resultSet.close();
             statement.close();
             connection.close();
         }
     }
     ```

   7. ## and 8. 使用步骤详解_上 and 下

   ```java
   package com.atguigu.api.statement;
   
   import com.mysql.cj.jdbc.Driver;
   
   import java.sql.*;
   import java.util.Properties;
   import java.util.Scanner;
   
   /**
    * TODO:
    *  1.明确jdbc的使用流程 和 详解讲解内部设计api方法
    *  2.发现问题，引出preparedstatement
    *
    * TODO
    *  输入密码账号
    *  进行数据库信息查询
    *  反馈登录成功还是登录失败
    *
    *  TODO：
    *      1.键盘输入事件，收集账号和密码信息
    *      2.注册驱动
    *      3.获取链接
    *      4.创建statement
    *      5.发送查询SQL语句，并获取返回结果
    *      6.结果判断，显示登陆成功还是失败
    *      4.关闭资源
    */
   
   public class StatementUserLoginPart {
       public static void main(String[] args) throws SQLException, ClassNotFoundException {
           //获取用户输入信息
           Scanner scanner = new Scanner(System.in);
           System.out.println("请输入账号");
   //        String account = scanner.nextLine();
           /**
            * PS:next()和nextLine()区别：
            * 相同点是他们返回值都是String类型
            * 不同的是nextLine()支持空格
            */
           System.out.println("请输入密码");
   //        String password = scanner.nextLine();
           //Tabnine Starter插件：按Tab会自动补全
   
   
           //2.注册驱动
           /**
            * 方案1：DriverManager.registerDriver(new com.cj.jdbc.Driver())
            *       注意：8+ com.mysql.cj.jdbc.Driver
            *            5+ com.mysql.jdbc.Driver
            *      问题：在DriverManager.registerDriver方法中，会注册一次驱动： registerDriver(driver, null);
            *           在Driver类中的静态代码块中，也会注册一次驱动：DriverManager.registerDriver(new Driver());
            *           这样就造成了一个性能消耗的问题
            *      解决问题：只想注册一次
            *              只触发静态代码块即可！Driver
            *      触发静态代码块：
            *              类加载机制：类加载的时刻，会触发静态代码块！
            *              加载 [class文件 -> jvm虚拟机的class对象]
            *              链接 [验证（检查文件类型） -> 准备（静态变量默认值） -> 解析（触发静态代码块）]
            *              初始化 （静态属性赋真实值）
            *      触发类加载：
            *          1.new 关键字
            *          2.调用静态方法
            *          3.调用静态属性
            *          4.接口 1.8以后新特性 加default默认实现
            *          5.反射
            *          6.子类触发父类
            *          7.程序的入口main
            */
           //方案1：
   //        DriverManager.registerDriver(new Driver());//填对应驱动的实现对象,注意要选择带cj的，它属于新更新的一个驱动内容，异常抛出即可
   
           //方案2：
           //new Driver();//只会触发一次，但这样写非常不雅，代码就很固定化
           //因为当前导的是mysql新版本的驱动，但如果有一天换成了oracle数据库，这个类就要改成oracle的类，就很不方便
   
           //字符串 -> 提取到外部的配置文件 -> 可以在不改代码的情况下，完成数据库驱动的切换！ -> 这样就很灵活
           Class.forName("com.mysql.cj.jdbc.Driver");//通过反射机制，触发类加载，触发静态代码块的调用
   
           //获取数据库链接
           /**
            * 此时会发现，DriverManager.getConnection()是一个重载方法，即同名不同参，有三种参数传递形式
            * 允许开发者，用不同的形式传入数据库连接的核心参数！
            * PS：这三种只是参数传递的形式不同，但最终选择哪种都无所谓
            *
            * 核心属性：
            *      1.数据库软件所在的主机的ip地址：127.0.0.1，或者本机的主机名：localhost
            *      2.数据库软件所在的主机的端口号：3306//默认的端口号
            *      3.连接的具体库：itcast
            *      4.连接的账号：root
            *      5.连接的密码：123456
            *      6.可选的信息：稍后说
            *
            * 三个参数：
            *   String url         数据库软件所在的信息，连接的具体库，以及其他可选信息
            *                      语法：jdbc:数据库管理软件名称[mysql,oracle]://ip地址 | 主机名:port端口号/数据库名?key=value&key=value 可选信息！
            *                      具体的： jdbc:mysql://127.0.0.1:3306/itcast
            *                              jdbc:mysql://localhost:3306/itcast
            *                      本机的省略写法：(强调：必须是本机，并且端口号是3306方可省略 使用///
            *                      PS:如果没省略却使用了///则一定会报错
            *                      如果你的数据库软件安装到本机，可以进行一些省略
            *                      jdbc:mysql:///itcast
            *
            *
            *
            *                      PS:以jdbc开头：代表与jdbc连接的具体协议
            *   String user       数据库的账号 root
            *   String password    数据库的密码 123456
            *
            * 两个参数（更麻烦一些，推荐三个参数）：
            *    String url :次url和三个参数的url的作用一样！
            *    Properties info:存储账号和密码
            *                    Properties 类似于 Map 只不过key = value 都是字符串形式的
            *                    key user：账号信息
            *                    key password：密码信息
            *
            * 一个参数：
            *  String url：数据库ip，端口号，具体的数据库  可选信息（账号密码）
            *              jdbc:mysql/localhost:3306/itcast?user=root&password=123456;
            *              携带固定的参数名 user password  传递账号和密码信息！[规定！]
            *
            *   url的路径属性可选信息：
            *          url?user=账号&password=密码
            *
            *          8.0.27版本驱动，下面都是一些可选属性！
            *              8.0.25以后，自动识别时区！serverTimezone=Asia/Shanghai 不用添加！8.0.25之前版本，下面一句话还是要加的！
            *              8版本以后，默认使用的就是utf-8格式，useUnicode=true&characterEncoding=utf8&useSSL=true 都可以省略了！
            */
           Connection connection = DriverManager.getConnection("jdbc:mysql:///itcast", "root", "123456");
   
           Properties info = new Properties();
           info.put("user", "root");
           info.put("password", "123456");
           Connection connection1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/itcast", info);
   
           Connection connection2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/itcast?user=root&password=123456");
   
           //3.创建发送SQL语句的statement对象
           //statement 可以发送SQL语句到数据库，并且可以返回结果！
           Statement statement = connection1.createStatement();
   
           //4.发送SQL语句（1.编写SQL语句 2.发送SQL语句）
   //        String sql = "select * from employee where account = '" + account + "' and password = '" + password + "';";
           String sql = "select * from employee;";
   
           /**
            * SQL分类：DDL（容器创建，修改，删除） DML（增删改） DQL（查询） DCL（权限控制） TPL（事务控制语句）
            *
            * 参数：sql 非DQL
            * 返回结果：int
            *      情况1：DML 返回影响的行数，例如；删除了三条数据 return 3；插入了两条 return 2；
            *      情况2：非DML return 0；
            *
            * 参数：sql DQL
            * 返回：resultSet 结果封装对象
            * ResultSet resultSet = executeQuery(sql);
            */
   //        int i = statement.executeUpdate(sql);
           ResultSet resultSet = statement.executeQuery(sql);
   
           //5.查询结果集解析 resultSet
           /**
            * Java是一种面向对象的思维，将查询结果封装成了resultSet对象，我们应该理解，内部一定也是有行和有列的！和可视化工具是一样的！
            *
            * resultSet ->逐行获取数据，行-> 行的列的数据
            * 最初resultSet的cursor（光标）会指向第一行的前一行，next()方法即将cursor移向下一行
            * 若下一行有数据，返回true，若下一行没数据，则返回false
            *
            * tip：Translation插件可以支持源码翻译
            *
            * 想要进行数据解析，我们需要进行两件事情：1.移动游标指定获取数据行  2.获取指定数据行的列数据即可
            * 1.游标移动问题
            *      resultSet内部包含一个邮包，指定当前行数据！
            *      默认游标指定的是第一行数据之前！
            *      我们可以调用next()方法向后移动一行游标！
            *      如果我们有很多行数据，我们可以使用while(next){获取每一行数据}
            *
            *      boolean = next() true：有更多行数据，并且向下移动一行
            *                       false：没有更多行数据，不移动！
            *
            *    TODO：移动光标的方法有很多，只需要记next即可，配合while循环获取全部数据！
            *          resultSet.get类型(String columnLabel | int columnIndex);//columnIndex不用加""
            *              columnLabel：列名 如果有别名 写别名  select * | (id, account, password, nickname)
            *                                               select id as aid, account as ac from
            *              columnIndex：列的下标获取 从左向右 从1开始
            *
            * 2.获取列的数据问题（获取光标指定的行的列的数据）
            */
           while(resultSet.next()) {
               int id = resultSet.getInt("id");
               int salary = resultSet.getInt("salary");
               System.out.println(id + "--" + salary);
           }
   
           //移动一次光标，只要有数据，就代表登录成功
           /*if (resultSet.next()) {
               System.out.println("登陆成功");
           } else {
               System.out.println("登录失败");
           }*/
   
           //关闭资源
           connection1.close();
           statement.close();
           resultSet.close();
       }
   }
   ```

   9. ## preparedstatement基本使用流程

      - 使用statement实现模拟登录会存在以下问题：

        1. SQL语句需要字符串拼接，比较麻烦

        2. 只能凭借字符串类型，其他的数据库类型无法处理

        3. 可能发生注入攻击

           > 动态值充当了SQL语句结构，影响了原有的查询结果！

      - 具体的实现代码以及使用步骤：

        ```java
        package com.atguigu.api.statement.preparedstatement;
        
        import java.sql.*;
        import java.util.Scanner;
        
        /**
         * TODO:防止注入攻击  |   演示ps的使用流程
         */
        
        public class PSUserLoginPart {
            public static void main(String[] args) throws ClassNotFoundException, SQLException {
                Scanner scanner = new Scanner(System.in);
                System.out.println("请输入id");
                int id = scanner.nextInt();
                /*System.out.println("请输入账号：");
                String account = scanner.nextLine();
                System.out.println("请输入密码：");
                String password = scanner.nextLine();*/
        
                Class.forName("com.mysql.cj.jdbc.Driver");
        
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/itcast", "root", "123456");
        
                /**
                 * statement
                 *      1.创建statement
                 *      2.拼接SQL语句
                 *      3.发送SQL语句，并且获取返回结果
                 *
                 *  preparedstatement
                 *      1.编写SQL语句结果 不包含动态值部分的语句，动态值部分使用占位符 ? 替代
                 *        PS：？ 只能替代动态值
                 *      2.创建preparedstatement，并且传入动态值
                 *      3.动态值 占位符 赋值 ？ 单独赋值即可
                 *      4.发送SQL语句即可，并获取返回结果
                 */
        
                //3,。编写SQL语句结果
                String sql = "select * from employee where id = ?;";
        
                //4.创建预编译statement并且设置SQL语句结果
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                //PS：statement是在发送SQL语句的时候传入的sql，而preparedstatement是在创建预编译statement的时候就发送了sql语句！
        
                //5.单独占位符进行赋值
                /**
                 * 参数1：index 占位符的位置 从左向右数 从1 开始
                 * 参数2：object 占位符的值 可以设置任何类型的数据，避免了我们凭借和类型更加丰富
                 */
                //其实是可以写getInt的，但建议统一写Object，因为这样就不需要考虑了
                preparedStatement.setObject(1, id);
                //如果有多个 ? 占位符的话，需要使用多个preparedStatement.set
        
                //6.发送SQL语句，并返回返回结果！
                ResultSet resultSet = preparedStatement.executeQuery();//此时就不需要传sql了，因为它已经知道语句动态值了！
        
                //结果集解析
                while(resultSet.next()) {
                    int id1 = resultSet.getInt("id");
                    String salary = resultSet.getString("salary");
                    System.out.println(id1 + "--" + salary);
                }
        
                //8.关闭资源
                connection.close();
                preparedStatement.close();
                resultSet.close();
            }
        }
        ```

## 10.AND11.preparedstatement执行 **dml** 语句练习

- PS：curd是增删改查的缩写

- 新学知识：如何获取一列的数据

- 具体代码实现：

  ```java
  package com.atguigu.api.statement.preparedstatement;
  
  import org.junit.Test;
  
  import java.sql.*;
  import java.util.*;
  
  /**
   * 写四个Test方法（public开头 并且 Test方法不能有返回值，方法名随便写，但不能有形参列表）
   */
  public class PSCURDPart {
  
      //测试方法需要导入junit的测试包
      @Test
      public void testInsert() throws ClassNotFoundException, SQLException {
          /**
           * employee插入一条数据！
           *      id
           *      salary
           */
  
          //1.注册驱动
          Class.forName("com.mysql.cj.jdbc.Driver");
  
          //2.获取链接
          Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/itcast?user=root&password=123456");
  
          //3.编写sql语句，动态值的部分使用?代替
          String sql = "insert into employee(id, salary) values(?, ?);";
  
          //4.创建preparedStatement，并且传入SQL语句
          PreparedStatement preparedStatement = connection.prepareStatement(sql);
  
          //5.占位符赋值
          //其实是可以写getInt的，但建议统一写Object，因为这样就不需要考虑了
          preparedStatement.setObject(1, 1);
          preparedStatement.setObject(2, 23798347);
  
          //6.发送sql语句
          int rows = preparedStatement.executeUpdate();//返回的是影响的一个行数
  
          //7.输出结果
          if (rows > 0) {
              System.out.println("插入成功");
          } else {
              System.out.println("插入失败");
          }
  
          //8.关闭资源
          connection.close();
          preparedStatement.close();
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
  }
  ```

12. jdbc使用步骤总结和api回顾总结
    1. 注册驱动
    2. 获取链接
    3. 编写sql语句，动态值的部分使用?代替
    4. 创建preparedStatement，并且传入SQL语句
    5. 占位符赋值
    6. 发送sql语句
    7. 输出结果
    8. 关闭资源

13. 拓展提升_主键回显和主键值获取

    - 代码实现：

      ```java
      package com.atguigu.api.statement.preparedstatement;
      
      import org.junit.Test;
      
      import java.sql.*;
      
      /**
       * Description：练习ps的特殊使用情况
       */
      public class PSOtherPart {
          /**
           * TODO:
           *      t_user插入一条数据！并且获取数据库自增长的主键！
           * <p>
           * TODO：使用总结
           *       1. 创建preparedStatement的时候，告知 携带回数据库自增长的主键(sql, Statement.RETURN_GENERATED_KEYS)；
           *       2. 获取司机装主键值的结果集对象，它是一行一列的，
           *          获取对应的数据即可 ResultSet resultSet = statement.getGeneratedKeys();
           */
          @Test
          public void returnPrimaryKey() throws Exception {
              //1.注册驱动
              Class.forName("com.mysql.cj.jdbc.Driver");
      
              //2.获取连接
              Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/itcast?user=root&password=123456");
      
              //3.编写sql语句
              String sql = "insert into employee(name, salary, departmentId) values(?, ?, ?);";
      
              //4.创建statement
              PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
      
              //5.占位符赋值
              preparedStatement.setObject(1, "TOM");
              preparedStatement.setObject(2, 5);
              preparedStatement.setObject(3, 2);
      
              //6.发送sql语句，并且获取结果
              int rows = preparedStatement.executeUpdate();
      
              //7.结果解析
              if (rows > 0) {
                  System.out.println("插入成功");
      
                  //可以获取回显的主键
                  //获取司机装主键的结果集对象，一行 一列 id = 值
                  ResultSet resultSet = preparedStatement.getGeneratedKeys();
                  resultSet.next();//移动下光标,指向第一行！
                  int id = resultSet.getInt(1);//再拿到第一行里的数据
                  System.out.println(id);
              } else {
                  System.out.println("插入失败");
              }
      
              //8.关闭资源
              connection.close();
              preparedStatement.close();
          }
      }
      ```

14. 批量插入数据优化

    - 具体代码实现：

      ```java
      /**
       * 使用普通的方式插入10000条数据
       */
          @Test
          public void testInsert() throws Exception {
              //1.注册驱动
              Class.forName("com.mysql.cj.jdbc.Driver");
      
              //2.获取连接
              Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/itcast?user=root&password=123456");
      
              //3.编写sql语句
              String sql = "insert into employee(name, salary, departmentId) values(?, ?, ?);";
      
              //4.创建statement
              PreparedStatement preparedStatement = connection.prepareStatement(sql);
      
              //5.占位符赋值
              long start = System.currentTimeMillis();
              for (int i = 0; i < 10000; i++) {
                  preparedStatement.setObject(1, "dd" + i);
                  preparedStatement.setObject(2, 5);
                  preparedStatement.setObject(3, 2);
      
                  //6.发送sql语句，并且获取结果
                  preparedStatement.executeUpdate();
              }
      
              long end = System.currentTimeMillis();
      
              System.out.println("执行100000次数据插入消耗的时间" + (end - start) + "ms");
              //8.关闭资源
              connection.close();
              preparedStatement.close();
          }
      --------------------------------------------分隔线--------------------------------------------------------
          /**
           * 使用批量插入的方式插入100000条数据
           * TODO:总结批量插入
           *      1.路径后面添加?rewriteBatchedStatements=true 允许批量插入
           *      2.insert into 必须写values， 语句末尾 不能 添加 “;” 结束
           *      3.不是执行语句每条，是批量添加 addBatch();
           *      4.遍历添加完毕以后，统一批量执行 executeBatch()
           */
          @Test
          public void testBatchInsert() throws Exception {
              //1.注册驱动
              Class.forName("com.mysql.cj.jdbc.Driver");
      
              //2.获取连接
              Connection connection = DriverManager.getConnection(
                      "jdbc:mysql://localhost:3306/itcast?rewriteBatchedStatements=true", "root", "123456");
      
              //3.编写sql语句
              String sql = "insert into employee(name, salary, departmentId) values(?, ?, ?)";
      
              //4.创建statement
              PreparedStatement preparedStatement = connection.prepareStatement(sql);
      
              //5.占位符赋值
              long start = System.currentTimeMillis();
              for (int i = 0; i < 10000; i++) {
                  preparedStatement.setObject(1, "dd" + i);
                  preparedStatement.setObject(2, 5);
                  preparedStatement.setObject(3, 2);
      
      //            preparedStatement.executeUpdate();
                  preparedStatement.addBatch();//不执行，追加到values后面！
              }
              preparedStatement.executeBatch();//执行批量操作！
              //这里可能会有另外的一个方法：statement.executeLargeBatch();//假的，jdbc里面没有任何操作！！
      
              long end = System.currentTimeMillis();
      
              System.out.println("执行100000次数据插入消耗的时间" + (end - start) + "ms");
              //8.关闭资源
              connection.close();
              preparedStatement.close();
          }
      ```

15. 事务回顾和设计转账类结构

    - 前提概要：jdbc技术处理事物的方式是 try-catch

      ```java
      //呼应jdbc技术
      try {
          connection.setAutoCommit(false);//关闭自动提交
          
          //注意，只要当前connection对象，进行数据库操作，都不会自动提交事务
          //数据库动作！
          //statement - 单一的数据库动作 c u r d
          
          connection.commit();
      } catch(Exception e) {
          connection.rollback();
      }
      ```

    - 建表语句

      ```mysql
      create table t_bank(
              id int primary key auto_increment comment '账号主键',
              account varchar(20) not null unique comment '账号',
              money int unsigned comment '金额，不能为负值');
      insert into t_bank(account, money) values ('ergouzi', 1000), ('lvdandan', 1000);
      ```

    - Dao是存数据操作方法的 类的 一个简称。
      `dao = DataBase Access Object` ：数据库访问对象缩写
      一般来说：表名+Dao，代存存储某个表存储数据操作的方法。

16. 转账事务的实现

    - BankDao类代码：
    
      ```java
      package com.atguigu.api.statement.transaction;
      
      import java.sql.Connection;
      import java.sql.DriverManager;
      import java.sql.PreparedStatement;
      import java.sql.SQLException;
      import java.util.Properties;
      
      public class BankDao {
          /**
           * 加钱的数据库操作方法（jdbc）
           * @param account 加钱的账号
           * @param money 加钱的金额
           */
          public void add(String account, int money, Connection connection) throws Exception {
      
      //        String sql = "update t_bank set money = money - money where account = account;";
              //可恶！忘记了后面要给？赋值
              String sql = "update t_bank set money = money + ? where account = ?;";
              PreparedStatement preparedStatement = connection.prepareStatement(sql);
      
              preparedStatement.setObject(1, money);
              preparedStatement.setObject(2, account);
              preparedStatement.executeUpdate();
      
              preparedStatement.close();
              System.out.println("加钱成功");
          }
      
          /**
           * 减钱的数据库操作方法（jdbc）
           * @param account 减钱的账号
           * @param money 减钱的金额
           */
          public void sub(String account, int money, Connection connection) throws Exception {
              String sql = "update t_bank set money = money - ? where account = ?;";
              PreparedStatement preparedStatement = connection.prepareStatement(sql);
      
              preparedStatement.setObject(1, money);
              preparedStatement.setObject(2, account);
              preparedStatement.executeUpdate();
      
      
              preparedStatement.close();
              System.out.println("减钱成功");
          }
      }
      ```
    
      - BankService代码：
    
        ```java
        package com.atguigu.api.statement.transaction;
        
        import org.junit.Test;
        
        import java.sql.Connection;
        import java.sql.DriverManager;
        import java.util.Properties;
        
        /**
         * 银行卡业务方法，调用Dao方法
         */
        public class BankService {
            /**
             * TODO:
             *  事务添加是在业务方法中，利用try catch 代码块，开启事务和提交事务，和事务回滚！
             *  将connection传入dao层即可！dao只负责使用，不要close()!
             *
             *
             * @param addAccount
             * @param subAccount
             * @param money
             * @throws Exception
             */
            public void transfer(String addAccount, String subAccount, int money) throws Exception {
                /**出现的问题：
                 *      减钱的账户没钱时，会报异常
                 *      但是加钱的账户却依旧正常加了，这是因为这两个操作处于两个事务中。
                 *
                 *  解决办法：变成同一个事务
                 *   //一个事务的最基本要求，必须是同一个链接对象 connection
                 */
                Class.forName("com.mysql.cj.jdbc.Driver");
                Properties info = new Properties();
                info.put("user", "root");
                info.put("password", "123456");
                Connection connection = DriverManager.getConnection("jdbc:mysql:///itcast", info);
        
                try {
                    //开启事务
                    connection.setAutoCommit(false);
                    //执行数据库动作
                    BankDao bankDao = new BankDao();
                    bankDao.add(subAccount, money, connection);
                    bankDao.sub(addAccount, money, connection);
        
                    //事务提交
                    connection.commit();
                } catch (Exception e) {
                    //事务回滚
                    connection.rollback();
        
                    throw e;
                } finally {
                    connection.close();
                }
        
            }
        
            @Test
            public void start() throws Exception {
                transfer("lvdandan", "ergouzi", 100);
            }
        }
        ```

17. 连接池介绍和druid连接池使用

    - 连接性能消耗问题分析

      connection 可以复用

    - 数据库连接池作用
      太长了懒得打

    - 创建连接池
      记得导入 Druid 工具类 jar！

      1. 硬编码方式（了解，不推荐）
         程序运行起来之后改不了

      2. 软编码
         具体代码实现：

         ```java
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
         
                 //2.使用连接池的工具类的工厂模式，创建连接池//ps：不是ibatis下的！
                 DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
         
                 Connection connection = dataSource.getConnection();
         
                 //3.数据库curd
         
                 //4.收回连接
                 connection.close();
             }
         }
         ```

18. 获取连接工具类v1

    我们封装一个工具类，内部包含用软编码的形式创建连接池对象，同时对外提供连接的方法和回收连接的方法！

    - 外部配置文件
      位置：src/druid.properties
      具体代码：

      ```java
      # key = value => java Properties??(key | value)
      # druid连接池需要的配置参数，key必须为固定命名
      driverClassName=com.mysql.cj.jdbc.Driver
      username=root
      password=123456
      url=jdbc:mysql://localhost:3306/itcast
      
      ```

    外部可以通过${}获取key的value

    - 工具类具体代码：

      ```java
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
              return dataSource.getConnection();
          }
      
          /**
           *
           */
      
          public static void freeConnection(Connection connection) throws SQLException {
              connection.close();//连接池的连接，调用close就是回收！
          }
      }
      ```

    - 使用的代码：

      ```java
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
      ```

19. 工具类封装_获取连接工具类v2

    - v1版本的问题：同一个线程不同的方法getConnection()拿到的也都是新的一个对象
      v2版本目的：同一个线程不同方法获取同一个连接！

    - 前要知识：ThreadLocal

      > JDK 1.2的版本中就提供java.lang.ThreadLocal，为解决多线程程序的并发问题提供了一种新的思路。
      >
      > 使用这个工具类可以很简洁地编出优美的多线程程序。通常用来在多线程中管理共享数据库连接、Session等。

      > ThreadLocal用于保存某个线程共享变量，原因是在Java中，每一个线程对象中都有一个ThreadLoalMap<ThreadLocal, Object>，其key就是一个ThreadLocal，而Object即为该线程的共享变量。而这个map是通过ThreadLocal的set和get方法操作的。对于同一个staticThreadLocal，不同线程只能从get，set，remove自己的变量，而不会影响其他线程的变量。

      > 1. ThreadLocal对象.get：获取ThreadLocal中当前线程共享变量的值。
      > 2. ThreadLocal对象.set：设置ThreadLoxal中当前线程共享变量的值。
      > 3. ThreadLocal对象.remove：移除ThreadLocal中当前线程共享变量的值。

    具体代码实现：

    ```java
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
    ```

20. 工具类封装_baseDao概念和非DQL方法封装

    - BaseDao完整代码：

      ```java
      package com.atguigu.api.statement.utils;
      
      import java.sql.Connection;
      import java.sql.PreparedStatement;
      import java.sql.SQLException;
      import java.util.List;
      import java.util.Objects;
      
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
                  preparedStatement.setObject(i, params[i]);
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
      }
      ```

    - 使用代码：

      ```java
      package com.atguigu.api.statement.utils;
      
      import org.junit.Test;
      
      import java.sql.*;
      import java.util.*;
      
      public class PSCURDPart extends BaseDao{
      
          @Test
          public void testInsert() throws ClassNotFoundException, SQLException {
              String sql = "insert into employee(id, salary) values(?, ?);";
      
              int rows = executeUpdate(sql, 1, 111);
          }
      }
      ```

21. 工具类封装_DQL查询方法封装

    - 完整BaseDao代码：

      ```java
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
      
              if (params != null && params.length != 0) {
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
      ```

22. 综合练习_cms项目改造jdbc操作
    略。见老师的资料。