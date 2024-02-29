MyBatis笔记

jdbc:mysql://localhost:3306/mybatis_plus_1?characterEncoding=utf-8&useSSL=false

## 一、MyBatis简介

### 1、MyBatis历史

MyBatis最初是Apache的一个开源项目iBatis, 2010年6月这个项目由Apache Software Foundation迁 移到了Google Code。随着开发团队转投Google Code旗下， iBatis3.x正式更名为MyBatis。代码于 2013年11月迁移到Github。

iBatis一词来源于“internet”和“abatis”的组合，是一个基于Java的持久层框架。 iBatis提供的持久层框架 包括SQL Maps和Data Access Objects（DAO）。

### 2、MyBatis特性

1.  MyBatis 是支持定制化 SQL、存储过程以及高级映射（比如解决了多对多的关系）的优秀的持久层框架

2.  MyBatis 避免了几乎所有的 JDBC 代码和手动设置参数以及获取结果集

3. MyBatis可以使用简单的XML（以后用的比较多）或注解用于配置和原始映射（面向接口编程，以前dao会有接口层和实现类，但是Mybatis中直接为我们提供了面向接口编程的功能，也就是说dao里面只需要有接口，而不需要有实现类，我们只需要使用Mybatis的功能调用接口中方法的时候，让它直接去对应我们的SQL语句，并且去执行），将接口和Java的POJO（Plain Old Java Objects，普通的Java对象）映射成数据库中的记录（即Mybatis操作数据库的一个过程）

4. MyBatis 是一个 半自动的ORM（Object Relation Mapping对象（指的是实体类对象）关系（指的是关系型数据库）映射）框架、

   > 因为SQL语句需要自己去写，可以自己处理映射关系 。
   >
   > ORM其实就是将实体类对象和关系型数据库中的这些数据来创建映射关系。

### 3、MyBatis下载

MyBatis下载地址：https://github.com/mybatis/mybatis-3

![image-20230923215454778](.\img\Mybatis下载1.png)

![image-20230923215622045](.\img\Mybatis下载2.png)

![image-20230923220138116](.\img\Mybatis下载3.png)

## 5.和其它持久化层技术对比

- JDBC

  > 1. SQL 夹杂在Java代码中耦合度高，导致硬编码内伤
  > 2. 维护不易且实际开发需求中 SQL 有变化，频繁修改的情况多见
  > 3. 代码冗长，开发效率低

- Hibernate 和 JPA

  > 1. 操作简便，开发效率高
  > 2. 程序中的长难复杂 SQL 需要绕过框架
  > 3. 内部自动生产的 SQL，不容易做特殊优化
  > 4. 基于全映射的全自动框架，大量字段的 POJO 进行部分映射时比较困难。
  > 5. 反射操作太多，导致数据库性能下降

- MyBatis

  > 1. 轻量级，性能出色
  > 2. SQL 和 Java 编码分开，功能边界清晰。Java代码专注业务、SQL语句专注数据开发
  > 3. 效率稍逊于HIbernate，但是完全能够接受

## 6.搭建MyBatis框架之开发环境

### 1、开发环境

IDE：idea 2019.2

构建工具：maven 3.5.4

MySQL版本：MySQL 5.7

MyBatis版本：MyBatis 3.5.7

## 7.搭建MyBatis框架之创建maven工程

### 2、创建maven工程

#### a>打包方式：jar

> 因为访问数据库的时候直接通过java代码访问即可，它不需要有服务器的支持

#### b>引入依赖

```xml
<dependencies>
    <!-- Mybatis核心 -->
    <dependency>
        <groupId>org.mybatis</groupId>
        <artifactId>mybatis</artifactId>
        <version>3.5.7</version>
    </dependency>

    <!-- junit测试 -->
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.12</version>
        <scope>test</scope>
    </dependency>

    <!-- MySQL驱动 -->
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
        <version>5.1.3</version>
    </dependency>
</dependencies>
```

## 08.搭建MyBatis框架之创建MyBatis的核心配置文件

> MyBatis的配置文件分为两种：
>
> 1. 核心配置文件
>    主要来设置的是连接数据库的信息，以及MyBatis的全局配置信息
> 2. 映射文件
>    主要来写的是sql语句

> 习惯上命名为mybatis-config.xml，这个文件名仅仅只是建议，并非强制要求。将来整合Spring 之后，这个配置文件可以省略，所以大家操作时可以直接复制、粘贴。
>
> 核心配置文件主要用于配置连接数据库的环境以及MyBatis的全局配置信息

核心配置文件存放的位置是src/main/resources目录下

具体的配置文件在官方文档中

```xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE configuration
        PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
        "https://mybatis.org/dtd/mybatis-3-config.dtd">
<configuration>
    <!--配置连接数据库的环境-->
    <environments default="development">
        <environment id="development">
            <transactionManager type="JDBC"/>
            <dataSource type="POOLED">
                <property name="driver" value="${driver}"/>
                <property name="url" value="${url}"/>
                <property name="username" value="${username}"/>
                <property name="password" value="${password}"/>
            </dataSource>
        </environment>
    </environments>
    <!--引入映射文件-->
    <mappers>
        <mapper resource="org/mybatis/example/BlogMapper.xml"/>
    </mappers>
</configuration>
```

## 09.搭建MyBatis框架之创建mapper接口

> MyBatis中的mapper接口相当于以前的dao。但是区别在于，mapper仅仅是接口，我们不需要  提供实现类。因为MyBatis中有面向接口编程，当我们去调用接口中的方法，它就可以自动的去对应某个SQL语句并且去执行。

1. 创建表

2. 创建User类：

   ```java
   package com.atguigu.mybatis.pojo;
   
   public class User {
       private Integer id;
   
       private  String username;
   
       private String password;
       
       private Integer age;
       
       private String sex;
       
       private String email;
   
       public User(Integer id, String username, String password, Integer age, String sex, String email) {
           this.id = id;
           this.username = username;
           this.password = password;
           this.age = age;
           this.sex = sex;
           this.email = email;
       }
   
       public User() {
       }
   
       public Integer getId() {
           return id;
       }
   
       public void setId(Integer id) {
           this.id = id;
       }
   
       public String getUsername() {
           return username;
       }
   
       public void setUsername(String username) {
           this.username = username;
       }
   
       public String getPassword() {
           return password;
       }
   
       public void setPassword(String password) {
           this.password = password;
       }
   
       public Integer getAge() {
           return age;
       }
   
       public void setAge(Integer age) {
           this.age = age;
       }
   
       public String getSex() {
           return sex;
       }
   
       public void setSex(String sex) {
           this.sex = sex;
       }
   
       public String getEmail() {
           return email;
       }
   
       public void setEmail(String email) {
           this.email = email;
       }
   
       @Override
       public String toString() {
           return "User{" +
                   "id=" + id +
                   ", username='" + username + '\'' +
                   ", password='" + password + '\'' +
                   ", age=" + age +
                   ", sex='" + sex + '\'' +
                   ", email='" + email + '\'' +
                   '}';
       }
   }
   ```

   

3. 创建mapper接口

   > 原来的dao是这样取名的：
   > 根据操作的表和实体类是有关系的。
   >
   > 比如说表叫：t_user，实体类叫User，那我们当前的dao应该叫UserDao。

   mapper接口叫UserMapper，它存放在mapper包下。

   ```java
   public interface UserMapper {
       /**
   	* 添加用户信息
   	*/
   }
   ```

## 10.搭建MyBatis框架之创建MyBatis的映射文件

相关概念：**ORM**（**O**bject **R**elationship **M**apping）对象关系映射。对象：Java的实体类对象

关系：关系型数据库

映射：二者之间的对应关系

| **Java**概念 | **数据库概念** |
| ------------ | -------------- |
| 类           | 表             |
| 属性         | 字段/列        |
| 对象         | 记录/行        |

> 1、映射文件的命名规则：
>
> 尽量和Mapper接口保持一致。表所对应的实体类的类名+Mapper.xml
>
> 例如：表t_user，映射的实体类为User，所对应的映射文件为UserMapper.xml 因此一个映射文件对应一个实体类，对应一张表的操作。一张表的操作也只对应一个DAO。
>
> 映射文件在MyBatis的官方文档中也有。

ps：`DOCTYPE`后面的值必定是映射文件中的根标签

```xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "https://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="org.mybatis.example.BlogMapper">
    <select id="selectBlog" resultType="Blog">
        select * from Blog where id = #{id}
    </select>
</mapper>
```

其中里面写的就是增删改查的SQL语句

![image-20230924163234685](.\img\MyBatis映射配置文件.png)

> MyBatis映射文件用于编写SQL，访问以及操作表中的数据
>
> MyBatis映射文件存放的位置是src/main/resources/mappers目录下
>
> 2、MyBatis中可以面向接口操作数据，要保证两个一致：
>
> a>mapper接口的全类名和映射文件的命名空间（namespace）保持一致
>
> b>mapper接口中方法的方法名和映射文件中编写SQL的标签的id属性保持一致

UserMapper类接口：

```java
package com.atguigu.mybatis.mapper;

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
}
```

修改MyBatis的配置文件：

```xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE configuration
        PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
        "https://mybatis.org/dtd/mybatis-3-config.dtd">
<configuration>
    <!--配置链接数据库的环境-->
    <environments default="development">
        <environment id="development">
            <!--设置事务管理器为JDBC，所以事务的开启、提交与回滚都需要手动来进行处理-->
            <transactionManager type="JDBC"/>
            <!--type="POOLED"：表示的是使用数据库连接池，它会对数据库连接进行保存。等到我们下次进行使用的时候就可以直接从缓存里取了-->
            <dataSource type="POOLED">
                <property name="driver" value="com.mysql.jdbc.Driver"/>
                <property name="url" value="jdbc:mysql://local:3306/mybatis"/>
                <property name="username" value="root"/>
                <property name="password" value="123456"/>
            </dataSource>
        </environment>
    </environments>
    <!--引入映射文件-->
    <mappers>
        <!--如果映射文件写在java下，就能以包的方式来写这个路径，但是它在resource下，就需要以目录的方式来写这个路径-->
        <mapper resource="mappers/UserMapper.xml"/>
    </mappers>
</configuration>
```

MyBatis的映射文件：

```xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "https://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="com.atguigu.mybatis.mapper.UserMapper">
    <!--id表示的是映射文件的唯一标识-->
    <!--int insertUser();-->
    <insert id="insertUser">
        insert into t_user values(null, 'admin', '123456', 23, '男', '12345@qq.com')
    </insert>
</mapper>
```

## 11.搭建MyBatis框架之  测试添加功能

首先在test的java下创建包：com.atguigu.mybatis.test.MyBatisTest

> MyBatis中为我们提供了一个操作数据库的会话对象：sqlSession
>
> 所以首先我们需要先来获取SQLSession对象，步骤：见测试类注释

测试类：

```java
package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.UserMapper;
import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisTest {
    @Test
    public void testMyBatis() throws IOException {
        //加载核心配置文件
        //需要用到Resources类（org.apache.ibatis.io包中的）。
        //其中有个静态方法：getResourceAsStream()，用来获取所对应的字节输入流。
        //里面写的是核心配置文件的名字
        //由于它是跟流相关，所以需要处理异常，直接声明出去即可
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        //获取sqlSessionFactoryBuilder对象，是我们提供sqlSession工厂的一个构建对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //获取sqlSessionFactory的一个工厂对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        //由于java中的类是见名识义的，它既然以Factory为后缀，那它必定是一个工厂类，所以它用到的就是工厂模式，将我们创建一个对象的过程进行一个封装，直接来提供我们当前的一个对象
        //获取MyBatis操作数据库的一个会话对象，叫做：sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //sqlSession：代表Java程序和数据库之间的会话。（HttpSession是Java程序和浏览器之间的会话）
        //此时我们就可以通过sqlSession来操作MyBatis中的功能
        //MyBatis可以面向接口编程，调用Mapper接口中的方法，然后它就会自动去匹配一个sql语句来进行执行
        //所以说我们现在的目标就是要获取mapper接口的对象
        //接口想要创建对象，就必须要有实现类，但我们现在没有
        //通过sqlSession中的一个方法getMapepr(Class<T> var1)，里面传递的是一个类型的class对象，类型的泛型是T，返回值是T对象
        //即当我们传进去一个类型的class对象后，这个方法可以帮助我们获取这个类型的实例化对象
        //换句话说，在我们getMapper方法的底层，它会去创建一个UserMapper接口的实现类，并且返回这个实现类的对象
        //底层用的就是一个代理模式
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //测试功能
        //此时它就会根据mapper接口找到映射文件，然后根据调用的方法，去找到当前的sql语句
        int result = mapper.insertUser();
        System.out.println("result：" + result);
    }
}
```

点击运行，会发现运行成功，但是数据库里并没有增加数据

原因：

> 我们刚刚在创建核心文件时，设置环境时，有这么一行：

```xml
<!--设置事务管理器为JDBC，所以事务的开启、提交与回滚都需要手动来进行处理-->
<transactionManager type="JDBC"/>
```

所以说我们需要提交事务：

```java
//测试功能
//此时它就会根据mapper接口找到映射文件，然后根据调用的方法，去找到当前的sql语句
int result = mapper.insertUser();
//提交事务
sqlSession.commit();
```

> 此时数据库里面就有数据了，但是id是3。这是因为执行添加操作但没有提交事务，id也是会被占用的！

## 12.搭建MyBatis框架之优化功能

> 在获取SqlSession对象的时候：
>
> ```java
> SqlSession sqlSession = sqlSessionFactory.openSession(true);
> ```
>
> openSession()方法里有个参数：autoCommit，它的默认值为true。
> 此时只需要将它设置为true即可实现自动提交

- SqlSession：代表Java程序和**数据库**之间的**会话**。（HttpSession是Java程序和浏览器之间的   会话）
- SqlSessionFactory：是“生产”SqlSession的“工厂”。
- 工厂模式：如果创建某一个对象，使用的过程基本固定，那么我们就可以把创建这个对象的 相关代码封装到一个“工厂类”中，以后都使用这个工厂类来“生产”我们需要的对象。

### 加入log4j日志功能

#### a>加入依赖

```xml
<!-- log4j日志 -->
<dependency>
    <groupId>log4j</groupId>
    <artifactId>log4j</artifactId>
    <version>1.2.17</version>
</dependency>
```

#### b>加入log4j的配置文件

log4j的配置文件名为log4j.xml，存放的位置是src/main/resources目录下

```xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE log4j:configuration SYSTEM "log4j.dtd">

<!-- 这里可能会爆红，但是没关系 -->
<log4j:configuration xmlns:log4j="http://jakarta.apache.org/log4j/">

    <appender name="STDOUT" class="org.apache.log4j.ConsoleAppender">
        <param name="Encoding" value="UTF-8" />
        <layout class="org.apache.log4j.PatternLayout">
            <param name="ConversionPattern" value="%-5p %d{MM-dd HH:mm:ss,SSS}
%m	(%F:%L) \n" />
        </layout>
    </appender>
    <!-- sql中的日志 -->
    <logger name="java.sql">
        <level value="debug" />
    </logger>
    <!-- MyBatis中的日志 -->
    <logger name="org.apache.ibatis">
        <!-- 当前日志的输出级别的info和debug -->
        <level value="info" />
    </logger>
    <root>
        <level value="debug" />
        <appender-ref ref="STDOUT" />
    </root>
</log4j:configuration>
```

**日志的级别**

> FATAL(致命)>ERROR(错误)>WARN(警告)>INFO(信息)>DEBUG(调试)
>
> 从左到右打印的内容越来越详细

## 13.搭建MyBatis框架之测试修改和删除功能

编程好习惯：

> 每写一个接口方法，就在其对应的映射的sql语句前写一个注释，这样方便以后的查看

```xml
<!--int deleteUser();-->
<update id="updateUser">
	update t_user set username='jfdks' where id = 4;
</update>
```

删除修改对应的方法

```java
@Test
public void testUpdate() throws IOException {
	InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
	SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
	SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
	SqlSession sqlSession = sqlSessionFactory.openSession(true);
	UserMapper mapper = sqlSession.getMapper(UserMapper.class);
	mapper.updateUser();
}

@Test
	public void testDelete() throws IOException {
	InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
	SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
	SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
	SqlSession sqlSession = sqlSessionFactory.openSession(true);
	UserMapper mapper = sqlSession.getMapper(UserMapper.class);
	mapper.deleteUser();
}
```

删除修改对应的Mapper配置类

```xml
<!--int deleteUser();-->
<update id="updateUser">
	update t_user set username='jfdks' where id = 4;
</update>
<delete id="deleteUser">
	delete from t_user where id=6;
</delete>
```

## 14.搭建MyBatis框架之测试查询功能

> 增删改方法的返回值有两种
>
> 1. int：返回的是操作的行数
> 2. void
>
> 而select必定是有返回值的
>
> 1. 查询一条数据，对应的是一个实体类对象
> 2. 查询所有数据，对应的是一个实体类对象的集合
> 3. 有时候查询查来的是单行单列的，则需要考虑查询出来的结果对应的是java中的什么类型

UserMapper接口添加方法：

```java
/**
* 根据id查询用户信息
* @return
*/
User getUserById();

/**
* 查询所有用户信息
*/
List<User> getAllUser();
```

UserMapper配置文件中添加sql语句：

```java
<!--User getUserById();-->
<!--
查询功能的标签必须设置resultType或resultMap
resultType：设置默认的映射关系（会自动把字段名作为属性名进行赋值，如果能匹配到则赋值，如果不能匹配到则不赋值
所以我们尽量保证实体类中的属性要跟数据库中的字段名保持一致）

resultMap：设置自定义的映射关系（如果字段名和属性名不一致的情况，我们才需要用到resultMap）
比如字段名和属性名真的不一样，还有多对一的关系和一对多的关系，我们都需要用到resultMap来实现
-->
<select id="getUserById" resultType="com.atguigu.mybatis.pojo.User">
select * from t_user where id=4;
</select>
<!--List<User> getAllUser();-->
<select id="getAllUser" resultType="com.atguigu.mybatis.pojo.User">
select * from t_user
</select>
```

添加测试类方法：

```java
@Test
public void testSelect() throws IOException {
    InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
    SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
    SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
    SqlSession sqlSession = sqlSessionFactory.openSession(true);
    UserMapper mapper = sqlSession.getMapper(UserMapper.class);
    User user = mapper.getUserById();
    System.out.println(user);
}

@Test
public void testSelectAllUser() throws IOException {
    InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
    SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
    SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
    SqlSession sqlSession = sqlSessionFactory.openSession(true);
    UserMapper mapper = sqlSession.getMapper(UserMapper.class);
    List<User> list = mapper.getAllUser();
    //        System.out.println(allUser);
    list.forEach(user -> System.out.println(user));//lamda表达式
}
```

> 当查询的数据为多条时，不能使用实体类作为返回值，只能使用集合，否则会抛出异常
>
> TooManyResultsException；但是若查询的数据只有一条，可以使用实体类或集合作为返回值

## 15.MyBatis核心配置文件之 environment

## 16.MyBatis核心配置文件之 properties

![image-20230925200638656](.\img\properties文件创建.png)

创建properties文件：jdbc.properties

> 由于一个项目中可能会有多个properties文件，并且每个properties文件互相可能会有同名的，此时我们只需要加上对应的前缀即可。

```properties
jdbc.driver=com.mysql.jdbc.Driver
jdbc.url=jdbc:mysql://localhost:3306/mybatis
jdbc.username=root
jdbc.password=123456
```

把properties文件引入到核心配置文件中：

```java
<!--引入properties文件，此时就可以${属性名}的方式访问属性值-->
<properties resource="jdbc.properties" />
```

使用${}的方式来读取properties文件的数据：

```xml
<dataSource type="POOLED">
    <!--设置驱动类的全类名-->
    <property name="driver" value="${jdbc.driver}"/>
    <!--设置连接数据库的连接地址-->
    <property name="url" value="${jdbc.url}"/>
    <!--设置连接数据库的用户名-->
    <property name="username" value="${jdbc.username}"/>
    <!--设置连接数据库的密码-->
    <property name="password" value="${jdbc.password}"/>
</dataSource>
```

## 17.MyBatis核心配置文件之 typeAliases

> 由于每次Mapper映射文件里写查询功能的时候，resultType都需要写全类名。就导致非常麻烦，MyBatis就提供了类型别名的功能。

> 核心配置文件中的标签必须按照固定的顺序：
>
> properties?,settings?,typeAliases?,typeHandlers?,objectFactory?,objectWrapperFactory?,reflectorF actory?,plugins?,environments?,databaseIdProvider?,mappers?

## 18.MyBatis核心配置文件之 mappers

> 以包为单位引入映射文件

![image-20230925204201580](.\img\resources下创建目录.png)

MyBatis完整配置文件：

```xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE configuration
        PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
        "https://mybatis.org/dtd/mybatis-3-config.dtd">

<configuration>
    <!--引入properties文件，此时就可以${属性名}的方式访问属性值-->
    <properties resource="jdbc.properties" />

    <typeAliases>
        <!--
        用的少
        typeAlias：设置某个具体的类型的别名
        属性：
               type：需要设置别名的类型的全类名
               alias：可写可不写。
                      设置此类型的别名，若不设置此属性，该类型拥有默认的别名，即类名且不区分大小。
                      但建议也要见名识义，建议使用类名。

        若设置此属性，此时该类型的别名只能使用alias所设置的值
        如果不设置，则会有默认的别名，而这个别名是它的类名，且不区分大小写
        -->

        <!--<typeAlias type="com.atguigu.mybatis.bean.User"></typeAlias>-->
        <!--<typeAlias type="com.atguigu.mybatis.bean.User" alias="abc">
        </typeAlias>-->
        <!--以包为单位，设置改包下所有的类型都拥有默认的别名，即类名且不区分大小写，这种方式用的多-->
        <package name="com.atguigu.mybatis.pojo"/>
    </typeAliases>


    <!--
    environments：设置多个连接数据库的环境

    一个工程用的一定是一个统一的数据库环境，计算这里配置了两个环境，我们用的也只是其中的一个
    我们只需要把某一个环境的id放到default中，来表示来默认使用某一个环境

    属性：
        default：设置默认使用的环境的id
    -->
    <environments default="mysql_test">
        <!--
        environment：设置具体的连接数据库的环境信息
        属性：
            id：表示连接数据库环境的唯一标识，可通过environments标签中的default设置某一个环境的id，表示默认使用的环境
            唯一要注意的就是它不能重复
        -->
        <environment id="mysql_test">
            <!--
            transactionManager：设置事务管理方式
            属性：
                type：设置事务管理方式，type="JDBC|MANAGED"
                type="JDBC"：设置当前环境的事务管理都必须手动处理
                             表示当前环境中，执行SQL时，使用的是JDBC中原生的事务管理方式（如果要实现提交，就是commit，如果要实现回滚，那就是rollback，即事务的提交回滚需要手动来处理）

                type="MANAGED"：设置事务被管理，谁能管理就让谁管理。
                                例如spring中的AOP，AOP里的重要应用就是声明事务，当MyBatis和spring进行整合之后，我们可以通过spring中的声明事务来管理MyBatis的事务
            -->
            <transactionManager type="JDBC"/>
            <!--
            dataSource：设置数据源
            属性：
                type：设置数据源的类型，type="POOLED|UNPOOLED|JNDI"
                type="POOLED"：使用数据库连接池，即会将创建的连接进行缓存，下次使用可以从 缓存中直接获取，不需要重新创建
                type="UNPOOLED"：不使用数据库连接池，即每次使用连接都需要重新创建
                type="JNDI"：调用上下文中的数据源

                spring里的数据源就是一个对象，我们可以让spring来管理数据源。MyBatis再来使用spring管理的数据源
            -->
            <dataSource type="POOLED">
                <!--设置驱动类的全类名-->
                <property name="driver" value="${jdbc.driver}"/>
                <!--设置连接数据库的连接地址-->
                <property name="url" value="${jdbc.url}"/>
                <!--设置连接数据库的用户名-->
                <property name="username" value="${jdbc.username}"/>
                <!--设置连接数据库的密码-->
                <property name="password" value="${jdbc.password}"/>
            </dataSource>
        </environment>
    </environments>
    <!--引入映射文件-->
    <mappers>
<!--        <mapper resource="UserMapper.xml"/>-->
        <!--
        以包为单位，将包下所有的映射文件引入核心配置文件
        注意：此方式必须保证
             1.mapper接口和mapper映射文件必须在相同的包下
             2.mapper接口要和映射文件一致
        -->
        <package name="com.atguigu.mybatis.mapper"/>
    </mappers>
</configuration>
```

## 19.思考：映射文件中的SQL该如何拼接？

> 参数获取的是Mapper接口中方法的参数，我们需要在映射文件中来获取这些值，然后把它们拼接到SQL语句中。

## 20.在idea中设置核心配置文件的模板

![image-20230925214846906](.\img\在IDEA中设置核心配置文件的模板.png)

PS:将内容添加进去时，可以将经常变动的地方删掉

![image-20230925215018506](.\img\在IDEA中设置核心配置文件的模板2.png)

![image-20230925215125065](.\img\在IDEA中设置核心配置文件的模板3.png)

创建时可以不写后缀，因为它会自动加上后缀！

![image-20230925215205308](.\img\在IDEA中设置核心配置文件的模板4.png)

## 21.在idea中设置映射文件的模板

> 由于我们操作的表都是User表，所以我们在创建映射文件的时候以功能划分最好，eg：ParameterMapper

## 22.封装SqlSession工具类并测试功能

> 由于获取SqlSession对象的过程是一个固定的过程，所以我们可以将获取SqlSession的过程封装到一个工具类里。
>
> 做法：在com.atguigu.mybatis下创建一个类：utils.SqlSessionUtils
>
> 工具类中一般都是静态的方法。

## 23.MyBatis获取参数值的两种方式（重点）

> MyBatis获取参数值的两种方式：**${}**和**#{}**
>
> ${}的本质就是字符串拼接，#{}的本质就是占位符赋值
>
> ${}使用字符串拼接的方式拼接sql，若为字符串类型或日期类型的字段进行赋值时，需要手动加单引号；但是#{}使用占位符赋值的方式拼接sql，此时为字符串类型或日期类型的字段进行赋值时，可以自 动添加单引号

## 24.Mybatis获取参数值的各种情况（1）

> 1.mapper接口方法的参数为单个的字面量类型
>
> 此时可以使用${}和#{}以任意的名称获取<span class="md-search-hit">参数</span>的值，注意${}需要手动加单引号

> 执行完之后，会发现控制台输出的会用?代替#{}，这个就是占位符赋值！
>
> 并且#{}里面的参数名不重要，值才是最重要的！但最好见名识义。一般就是使用传输过来的参数名。
>
> 并且占位符赋值跟值叫什么也没关系，它只跟位置有关系

![image-20230926165853759](.\img\MyBatis获取参数值的各种情况（1）.png)

```xml
<select id="getUserByUsername" resultType="user">
    <!--select * from t_user where username = #{username}-->
    如果是通过${}的话，单引号需要手动加！
    select * from t_user where username = '${username}'
</select>
```

## 25.Mybatis获取参数值的各种情况（2）

> mapper接口的方法参数为多个字面量类型的参数

若mapper接口中的方法参数为多个时

> 此时MyBatis会自动将这些参数放在一个map集合中，**以arg0,arg1...为键**，以参数为值；**以param1,param2...为键**，以参数为值；因此只需要通过${}和#{}访问map集合的**键**就可以获取相对应的   值，注意${}需要手动加单引号

```xml
<!--User checkLogin(String username, String password)-->
<select id="checkLogin" resultType="user">
	<!--select * from t_user where username = #{arg0} and password = #{arg1}-->
	<!--不一定要用配套的：select * from t_user where username = #{arg0} and password = #{param2}-->
    select * from t_user where username = '${arg0}' and password = '${param2}'
</select>
```

## 26.Mybatis获取参数值的各种情况（3）

> 手动将参数放到map里面，再将map集合作为mapper接口方法的参数

```java
/**
* 验证登录（参数为map）
* 键为String类型，值为Object类型，因为可以传递任意的类型作为参数
*/
User checkLoginByMap(Map<String, Object> map);
```

```xml
<!--User getUserByMap(Map<String, Object> map);-->
<select id="checkLoginByMap" resultType="user">
    select * from t_user where username = '${username}' and password = '${password}'
</select>
```

## 27.Mybatis获取参数值的各种情况（4）

> mapper接口方法的参数是实体类类型的参数。这种情况也是用到最多的。因为从浏览器传过来的都是实体类对象。
>
> 通过以属性的方式来访问属性值即可！
>
> 但是也需要注意${}的单引号问题

```xml
<!--int insertUser(User user);-->
<insert id="insertUser">
    <!--
        直接通过属性名来访问属性值即可
        我们最终访问的属性看的是get跟set方法，跟成员变量关系不大
        如果是取值，就去找get
        如果是赋值，就去找set
        get与set方法去掉get和set，把剩余部分首字母变为小写的结果就是当前的属性名
        eg：spring中的<bean>标签中有个<property>标签，对应的是get跟set方法
        -->
    insert into t_user values(null, #{username}, #{password}, #{age}, #{sex}, #{email})
</insert>
```

```java
@Test
public void testInsertUser() {
	SqlSession sqlSession = SqlSessionUtils.getSqlSession();
	ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
	int row = mapper.insertUser(new User(null, "李四", "123", 1, "男", "123@qq.com"));
	System.out.println(row);
}
```

## 28.Mybatis获取参数值的各种情况（5）- 命名参数

> 第二种情况我们需要通过MyBatis给我们提供的方式来访问。
> 而第三种情况我们需要手动放在map中。
> 一个不符合我们的规则，一个又写的比较麻烦。
> 所以说就有了第五种情况。
>
> 我们可以通过@Param注解来命名参数，也就是说通过这个注解来标识之后，MyBatis任然会把它放到map集合中。但是map集合中的键就是@Param的值，所以它叫做命名参数，也就是说我们当前可以来自定义MyBatis自动用map集合来存储的键了。

> 使用了之后，MyBatis会自动以@Param注解的值为键，以参数为值。

> 如果随便写的话，就会报错。根据错误信息可知，MyBatis将这些参数放到map集合中时是以两种方式来存储的。
>
> 1. 以@Param这个注解的值为键，以参数为值
> 2. 以param1, param2...为键，以参数为值

![image-20230926180937005](.\img\命名参数.png)

```java
/**
* 验证登录（使用@Param）
* 这里为什么要交@Param的值呢？我们在用一个注解的时候，我们直接去写了一个内容，而没有用属性=谁，那我们默认使用的属性就是value。
*/
User checkLoginByParam(@Param("username") String username, @Param("password") String password);

```

```xml
<!--User checkLoginByParam(@Param("username") String username, @Param("password") String password);-->
<select id="checkLoginByParam" resultType="User">
	select * from t_user where username = '${username}' and password = '${password}'
</select>
```

> 总结：
>
> 以上五种情况都可以归为两种：
>
> 1. 实体类
> 2. 传参数
>    这种情况都加上@Param即可

## 29.@Param源码解析

![image-20230926182134632](.\img\断点标识.png)

> 红框框出来的就是某一个sql语句的标识。
>
> 命名空间表示的是映射文件的唯一标识。而sql语句的id，表示的是sql语句的唯一标识。所以sql语句的唯一标识表示方法：
> 命名空间（即mepper接口的全类名）.sql的id（指的是方法名）
>
> type：sql语句的类型

![image-20230927141113182](.\img\@Param源码.png)

MyBatis获取参数值的过程：

![image-20230927141939460](.\img\@Param源码2.png)

## 30.MyBatis各种查询功能（1）

### 1、查询一个实体类对象

```java
/**
* 根据id查询用户信息
* 以后建议就把参数传过来的只当做两种情况：
* 1.实体类
* 2.加@Param的情况
*/
List<User> getUserById(@Param("id") Integer id);
```

```java
/**
* MyBatis的各种查询功能：
* 1.若查出的数据只有一条，可以通过实体类对象或者集合接收
* 2.若查询出的数据有多条，一定不能通过实体类对象接收，此时会抛异常TooManyResultsException
*/
```

## 31.MyBatis各种查询功能（2）

## 2.查询单个数据

> 例如：查询一张表的总记录数，使用的是分组函数

```xml
<!--Integer getCount();

    count(**)和count(1)的区别：
    从查询的结果来说，count(*)和count(1) 查询的结果是一样的。
    而count（字段）查出来的结果是不一样的，因为某个字段为null，那这条记录不会被算到总记入数中。

    resultType中：查询结果是什么，我们就需要在里面写什么，这里写Integer和小写的Integer，int，Int发现都是可以的！
    这些都是类型别名，是MyBatis默认设置的类型别名.
    Java.lang.Integer->int,integer
    int->_int,_integer
    -->
<select id="getCount" resultType="_Integer">
    select count(*) from t_user
</select>
```

32.MyBatis各种查询功能（3）

## 3.查询一条数据为map集合

> Map集合还是挺常用的，比如当前通过sql语句查询出来的结果没有任何一个实体类能够与其相对应，这个时候我们就能直接将我们查询出来的结果转化为一个map集合。
>
> 最终查询出来的结果就是以字段为键，以字段的值为值。

![image-20230927173835089](.\img\查询一条数据为map集合.png)

## 33.MyBatis各种查询功能（4）

> 一条数据对应的是一个map，多条数据每一条数据都会转化为一个map，如果用一个map来接收，就会抛异常TooManyResultsException
>
> 解决办法：
> 方式一：通过map类型的list集合接收
> 方式二：在mapper接口的方法上添加@MapKey注解，此时就可以将每条数据转换的map集合作为值，以某个字段的值作为键，放在同一个map集合中

![image-20230927175604086](.\img\查询多条数据为map集合.png)

## 34.MyBatis处理模糊查询

> 有些地方#{}会出现一些问题，比如模糊查询

### 1.模糊查询

```xml
<!--
    List<User> getUserByLike(@Param("username") String username);

    由于我们使用的是模糊查询，%#{username}%需要写在一对单引号中，单引号在mysql中表示的是一个字符串
    当我们用#{}时，并且在执行时，?会代替#{}的时候，?就存在了#{}里面，这个时候就会把?当做字符串的一部分
    -->
<select id="getUserByLike" resultType="User">
    <!--第一种解决方案：将#改为$-->
    <!--select * from t_user where username like '%${username}%'-->

    <!--第二种方案：mysql里有个comcat函数->字符串拼接
        #{}被解析之后会自动加上单引号！

        select * from t_user where username like concat('%', #{username}, '%')-->

    <!--第三种解决方案：也是以后用的最多的方案-->
    select * from t_user where username like "%"#{username}"%"
</select>
```

## 35.MyBatis处理批量删除

SQLMapper接口：

```java
/**
* 批量删除
*/
int deleteMore(@Param("ids") String ids);
```

SQLMapper.xml：

> 注意这里只能使用${}而不能只用#{}，因为#{}在解析时会自动加上，而如果自动加上了但单引号，在mysql语句里是会报错的！

```xml
<!--int deleteMore(@Param("ids") String ids);-->
<delete id="deleteMore">
	delete from t_user where id in (${ids})
</delete>
```

## 36.MyBatis处理动态设置表名

```xml
<!--List<User> getUserByTableName(@Param("tableName") String tableName);-->
<select id="getUserByTableName" resultType="user">
<!--在MySql里，表名是不能加单引号的！字符串类型的数据、日期类型的数据、字段都是可以加单引号的-->
	select * from ${tableName}
</select>
```

37.MyBatis获取添加功能自增的主键

> 假设我们现在有一个一对多的表关系：
>
> t_clazz(clazz_id,clazz_name) t_student(student_id,student_name,clazz_id)
> 我们一般都把表关系设置在多的一方。
>
> 1、添加班级信息
>
> 2、获取新添加的班级的id
>
> 3、为班级分配学生，即将某学的班级id修改为新添加的班级的id

SQLMapper接口：

```java
/**
* 添加用户信息
*/
void insertUser(User user);
```

SQLMapper.xml：

```xml
<!--void insertUser(User user);-->
<!--如果需要获取自动递增的主键，可以使用useGeneratedKeys属性，设置为true，来表示标签中的这个sql它使用了自动自增的主键

再往下还需要设置一个属性：keyProperty
获取自动自增的主键是不能通过方法的返回值返回的，因为增删改的返回值是固定的，就是受影响的行数。
既然它不能作为方法的返回值，就只能放在我们所传输过来的参数的某个属性中。
而keyProperty就是起：将自增的主键的值赋值给传输到映射文件中参数的某个属性
-->
<insert id="insertUser" useGeneratedKeys="true" keyProperty="id">
<!--获取实体类对象中指定属性的值，只需要通过#{}、${}通过属性名就可以来获取属性值-->
	insert into t_user values(null, #{username}, #{password}, #{age}, #{sex}, #{email})
</insert>
```

Test：

```java
@Test
public void testInsertUser() {
	SqlSession sqlSession = SqlSessionUtils.getSqlSession();
	SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
	User user = new User(null, "王五", "122", 23, "男", "163@14.com");
mapper.insertUser(user);
	System.out.println(user);
}
```

## 38.搭建MyBatis框架

> 用来讲述ResultMap
>
> 表中的字段单词与单词之间使用的是下划线，而属性使用的是驼峰

## 39.通过字段别名解决字段名和属性名的映射关系

>  如下图，当字段名为emp_name，而属性名为empName时，若使用resultType，此时并不会报错，但是值并不会映射到属性值里。

![image-20230927215000603](.\img\字段名和属性名的映射关系.png)

> 方式一：为查询出来的字段设置别名，保持和属性名的一致

## 40.通过全局配置mapUnderscoreToCamelCase解决字段名和属性名

> 通过settings。
>
> 字段顺序写错了没关系，它会报错，再根据报错信息改正即可

```xml
<!--设置MyBatis的全局配置
map（映射）Underscore（下划线）ToCamelCase（驼峰）：将下划线自动映射为驼峰
它的默认值为false
-->
<settings>
<!--将下划线自动映射为驼峰，emp_name：empName-->
<setting name="mapUnderscoreToCamelCase" value="true" />
</settings>
```

```xml
<!--想让这个sql失效，直接让id与方法名不一样即可-->
<select id="getAllEmpOld" resultType="emp">
    <!--select id, emp_name as empName, age, sex, email from t_emp-->
    select * from t_emp
</select>
```

## 41.通过resultMap解决字段名和属性名的映射关系

> resultMap只在查询功能中有用，而增删改不需要设置映射关系
>
> 但它一般用来处理一对多和多对一的关系

```xml
<resultMap id="empResultMap" type="Emp">
    <!--
        这里面有id属性，专门来设置主键的映射关系
        result：来设置普通字段的映射关系。
        property：设置映射关系中的属性名，必须是type属性所设置的实体类类型中的属性名
        column：字段名，sql所查询出来的字段名
        属性名和字段名一样也必须全部设置！

        association：处理多对一的映射关系
        collection：处理一对多的映射关系
        -->
    <id property="eid" column="eid"></id>
    <result property="empName" column="emp_name"></result>
    <result property="age" column="age"></result>
    <result property="sex" column="sex"></result>
    <result property="email" column="email"></result>
</resultMap>

<!--List<Emp> getAllEmp();-->
<!--
resultMap里面写的是某一个resultMap的id，唯一标识，不能重复
type：设置映射关系中的实体类类型
因为是自定义映射，所以一定要设置字段和属性的映射关系
-->
<select id="getAllEmp" resultMap="empResultMap">
    select * from t_emp
</select>
```

## 42.通过级联属性赋值解决多对一的映射关系

首先在Emp实体类对象中设置Dept属性 and get和set方法，和重写toString方法：

```java
private Dept dept;
```

> 目的：要查询员工以及员工所对应的部门信息，部门信息可以通过两表联查，把员工以及员工的部门查出来。
>
> 但是我们查询查来的字段叫做：did，以及d_name。
>
> 此时这两个字段无法与dept属性进行映射。

EmpMapper接口：

```java
/**
* 查询员工以及员工所对应的部门信息
*/
Emp getEmpAndDept(@Param("eid") Integer eid);
```

EmpMapper.xml：

```xml
<!--由于底下sql查出来的就是员工信息，只不过员工里面的一个属性跟我们所查询出来的字段无法映射，所以这里type写的是Emp-->
<resultMap id="empAndDeptResultMapOne" type="Emp">
    <id property="eid" column="eid"></id>
    <result property="empName" column="emp_name"></result>
    <result property="age" column="age"></result>
    <result property="sex" column="sex"></result>
    <result property="email" column="email"></result>
    <result property="dept.did" column="did"></result>
    <result property="dept.deptName" column="dept_name"></result>
</resultMap>
<!--Emp getEmpAndDept(@Param("eid") Integer edi);-->
<select id="getEmpAndDept" resultMap="empAndDeptResultMapOne">
	select * from t_emp e left outer join t_dept d on e.eid = d.did where e.eid = #{eid}
</select>
```

## 43.通过association解决多对一的映射关系

```xml
<resultMap id="empAndDeptResultMapTwo" type="Emp">
    <id property="eid" column="eid"></id>
    <result property="empName" column="emp_name"></result>
    <result property="age" column="age"></result>
    <result property="sex" column="sex"></result>
    <result property="email" column="email"></result>
    <!--
        association：处理多对一的映射关系
        property：需要处理多对一的映射关系的属性名
        javaType里写的是属性的类型，此时就可以通过反射来获取当前类型的属性
        -->
    <association property="dept" javaType="Dept">
        <!--这里赋值完后，就会得到一个dept对象，然后再把这个dept对象赋值给dept属性-->
        <id property="did" column="did"></id>
        <result property="deptName" column="dept_name"></result>
    </association>
</resultMap>
<!--Emp getEmpAndDept(@Param("eid") Integer edi);-->
<select id="getEmpAndDept" resultMap="empAndDeptResultMapTwo">
    select * from t_emp e left outer join t_dept d on e.eid = d.did where e.eid = #{eid}
</select>
```

## 44.通过分步查询解决多对一的映射关系

> 先查询员工信息，找到其部门id，再通过部门id查询到部门信息。再把查询到的部门信息赋值给dept属性即可。

EmpMapper接口：

```java
/**
* 通过分步查询查询员工以及员工所对应的部门信息
* 分步查询第一步：查询员工信息
*/
Emp getEmpAndDeptByStepOne(@Param("eid") Integer eid);
```

EmpMapper.xml：

```xml
<resultMap id="empAndDeptByStepResultMap" type="Emp">
    <id property="eid" column="eid"></id>
    <result property="empName" column="emp_name"></result>
    <result property="age" column="age"></result>
    <result property="sex" column="sex"></result>
    <result property="email" column="email"></result>
    <!--
        property：我们要操作的属性
        select：这个sql语句的唯一标识（namespace.SQLId或mapper接口全类名.方法名）！
        column：设置的是分步查询的条件，这里写的就是员工所对应的did
        -->
    <association property="dept"
                 select="com.atguigu.mybatis.mapper.DeptMapper.getEmpAndDeptByStepTwo"
                 column="did"></association>
</resultMap>

<!--Emp getEmpAndDeptByStepOne(@Param("eid") Integer eid);-->
<select id="getEmpAndDeptByStepOne" resultMap="empAndDeptByStepResultMap">
    select * from t_emp where eid = #{eid}
</select>
```

DeptMapper接口：

```java
/**
* 通过分步查询查询员工以及员工所对应的部门信息
* 分步查询第二步：通过did查询员工所对应的部门信息
*/
Dept getEmpAndDeptByStepTwo(@Param("did") Integer did);
```

DeptMapper.xml：

```xml
<!--Dept getEmpAndDeptByStepTwo(@Param("did") Integer did);-->
<select id="getEmpAndDeptByStepTwo" resultType="Dept">
	select * from t_dept where did = #{did}
</select>
```

> 不把他们放在一块，他们各自就是一个功能

## 45.延迟加载

> 分步查询的优点：可以实现延迟加载，但是必须在核心配置文件中设置全局配置信息（即settings标签：
>
> lazyLoadingEnabled（延迟加载是否可用）：延迟加载的全局开关。当开启时，所有关联对象（即分步查询的第二步以及第三步）都会延迟加载
>
> aggressiveLazyLoading（按需加载）：当开启时，任何方法的调用都会加载该对象的所有属性，此时延迟加载就算开启了也是没有作用的。 否则，每个属性会按需加载。
>
> 按需加载默认就是关闭的。
>
> 此时就可以实现按需加载，获取的数据是什么，就只会执行相应的sql。

```xml
<settings>
        <!--将下划线自动映射为驼峰，emp_name：empName-->
    <setting name="mapUnderscoreToCamelCase" value="true" />
        <!--开启延迟加载-->
    <setting name="lazyLoadingEnabled" value="true" />
</settings>
```

当我们在Test方法里只查询员工信息的时候，它只会执行查询员工信息的sql。并没有执行查询部门信息的sql。

当我们在Test方法只查询部门信息时，如果没有开启延迟加载，sql语句就会先全部都执行，我们再去获取其中的一些数据。

但如果我们开启了延迟加载，此时只会执行部门的sql

![image-20230929171236673](F:\BaiduSyncdisk\other\ByBatis\img\延迟加载.png)

> 此时可通过association和collection中的fetchType属性设置当前的分步查询是否使用延迟加载，fetchType="lazy(延迟加    载)|eager(立即加载)"

```xml
<!--
fetchType：开启延迟加载之后。如果有些属性不需要延迟加载，此时可以通过fetchType属性手动控制延迟加载的效果
延迟或立即加载lazy/eager。
但是如果没有开启延迟加载，这两个属性都是一样的效果，都是立即加载！
-->
<association fetchType="eager"></association>
```

## 46.通过collection解决一对多的映射关系

> 多对一对应的是对象
>
> 一对多，对应的是集合

DeptMapper接口：

```java
/**
* 部门以及部门中所有的员工信息
*/
Dept getDeptAndEmp(@Param("did") Integer did);
```

DeptMapper.xml：

```xml
<resultMap id="deptAndEmpResultMap" type="Dept">
	<id property="did" column="did"></id>
	<result property="deptName" column="dept_name"></result>
    <!--
    collection：处理一对多的映射关系
    ofType：表示该属性所对应的集合中存储数据的类型
    -->
    <collection property="emps" ofType="Emp">
        <id property="eid" column="eid"></id>
        <result property="empName" column="emp_name"></result>
        <result property="age" column="age"></result>
        <result property="sex" column="sex"></result>
        <result property="email" column="email"></result>
        <!--这里注意，我们员工里面并没有设置部门信息，因为员工中有部门，部门中有员工，就套起来了。-->
    </collection>
</resultMap>
<!--Dept getDeptAndEmp(@Param("did") Integer did);-->
<!--法1：把所有的数据都查出来，然后让字段与属性进行映射，然后查询出来所有的数据-->
<select id="getDeptAndEmp" resultMap="deptAndEmpResultMap">
	select * from t_dept left outer join t_emp on t_dept.did = t_emp.eid where t_emp.eid = #{did}
</select>
```

## 47.通过分步查询解决一对多的映射关系

DeptMapper接口：

```java
/**
* 通过分步查询查询部门即部门所对应的员工信息
* 分步查询第一步：查询部门信息
* 方法命名规范：以谁为主表谁在前
*/
Dept getDeptAndEmpByStepOne(@Param("did") Integer did);
```

DeptMapper.xml：

```xml
<!--通过select来设置分步查询的唯一标识-->
<resultMap id="deptAndEmpByStepResultMap" type="Dept">
    <id property="did" column="did"></id>
    <result property="deptName" column="dept_name"></result>
    <collection property="emps"
    select="com.atguigu.mybatis.mapper.EmpMapper.getDeptAndEmpByStep"
    column="eid">
	</collection>
</resultMap>
<!--Dept getDeptAndEmpByStep(@Param("did") Integer did);-->
<!--法2：分步查询-->
<select id="getDeptAndEmpByStepOne" resultMap="deptAndEmpByStepResultMap">
    <!--注意这里也是did-->
	select * from t_dept where did = #{did}
</select>
```

EmpMapper：

```java
/**
* 通过分步查询查询部门即部门所对应的员工信息
* 分步查询第二步：根据did查询员工信息
* 这里返回值一定是个List即可！
*/
List<Emp> getDeptAndEmpByStepTwo(@Param("did") Integer did);
```

EmpMapper.xml

```xml
<!--Emp getDeptAndEmpByStepTwo(@Param("eid") Integer eid);-->
<select id="getDeptAndEmpByStepTwo" resultType="Emp">
    select * from t_emp where did = #{did}
</select>
```

> 这里也是支持延迟加载的。
>
> collection里面也有属性fetchType，可以手动来设置某一个分步查询的立即加载和延迟加载（eager / lazy）

## 48.动态SQL简介

> Mybatis框架的动态SQL技术是一种根据特定条件动态拼装SQL语句的功能，它存在的意义是为了解决    拼接SQL语句字符串时的痛点问题。
>
> ename在页面中可能是个文本框。如果我们在页面中没有设置这个条件。
> 情况一：在页面中第一次访问数据的时候没有传输这个条件，而服务器又去获取了，则此时获取的应该是null。
> 情况二：点击查询按钮的时候，这个文本框是没有任何内容的，此时获取的是空字符串""

DynamicSQLMapper接口：

```java
public interface DynamicSQLMapper {
/**
* 多条件查询
* 由于查询结果有可能有一条，也有可能有多条，所以这里直接使用List集合
* 由于需要把姓名、年龄等都作为查询的条件，所以形参直接写Emp对象
*/
List<Emp> getEmpByCondition(Emp emp);
}
```

> if：根据标签中test属性所对应的表达式决定标签中的内容是否需要拼接到SQL中。

DynamicSQLMapper.xml：

```xml
<!--List<Emp> getEmpByCondition(Emp emp);-->
<select id="getEmpByCondition" resultType="Emp">
    <!--
        此时就需要在这里设置判断条件，因为如果是没有提供的条件这里是不能接上的
        如果符合条件的话，当前的内容就会拼接到SQL中
        注意，从第二个条件开始就需要写and
    -->
    select * from t_emp where
    <if test="empName != null and empName != ''">
        emp_name = #{empName}
    </if>
    <if test="age != null and age != ''">
        and age = #{age}
    </if>
    <if test="sex != null and sex != ''">
        and sex = #{sex}
    </if>
    <if test="email != null and email != ''">
        and email = #{email}
    </if>
</select>
```

DynamicSQLMapperTest类：

```java
public class DynamicSQLMapperTest {
    @Test
    public void testGetEmpByCondition() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        List<Emp> list = mapper.getEmpByCondition(new Emp(null, "张三", 23, "男", "123@.com"));
        System.out.println(list);
    }
}
```

> 但是如果映射文件就这样写的话，如果第一个if不成立，后面就会多出一个and。如果全部条件都不成立，还会多出一个where。
>
> 解决方案：在后面加一个恒成立条件：1 = 1 

## 50.动态SQL之where标签

> where：当where标签中有内容时，会自动生成where关键字，并且将内容前多余的 and 或 or 去掉。
> 注意：不能将其中内容后多余的 and 或 or 去掉。
>
> 当where标签中没有内容时，此时where标签没有任何作用！即不生成where。

```xml
<select id="getEmpByCondition" resultType="Emp">
    select * from t_emp
    <where>
        <if test="empName != null and empName != ''">
            emp_name = #{empName}
        </if>
        <if test="age != null and age != ''">
            and age = #{age}
        </if>
        <if test="sex != null and sex != ''">
            and sex = #{sex}
        </if>
        <if test="email != null and email != ''">
            and email = #{email}
        </if>
    </where>
</select>
```

## 51.动态SQL之trim标签

> 若标签中没有内容时，trim标签也没有任何效果。

```xml
<!--List<Emp> getEmpByCondition(Emp emp);-->
<select id="getEmpByCondition" resultType="Emp">
    select * from t_emp
    <!--
        prifix | suffix：将trim标签中内容前面或后面添加指定内容
        suffixOverriddes | prefixOverrides：将trim标签中内容或后面去掉指定内容
        如果需要写多个内容的话，直接写一个|即可
        -->
    <trim prefix="where" suffixOverrides="and|or">
        <if test="empName != null and empName != ''">
            emp_name = #{empName} and
        </if>
        <if test="age != null and age != ''">
            age = #{age} and
        </if>
        <if test="sex != null and sex != ''">
            sex = #{sex} and
        </if>
        <if test="email != null and email != ''">
            email = #{email}
        </if>
    </trim>
</select>
```

## 52.动态SQL之choose、when、otherwise

> 这是一套标签，相当于java中的if...else if...else
>
> choose是一个父标签，即when和otherwise都需要写在choose里面。它里面没有任何属性。一个choose就表示了一个完整的if..else if...else的结构
>
> when表示选择语句中的多个条件。
> 即if...else if
>
> otherwise表示的是其他情况。
> 即else。
>
> 这组标签只要有一个成立，后面的就不会再判断了！
>
> when至少要有一个，otherwise最多只能有一个。

```xml
<!--List<Emp> getEmpByChoose(Emp emp);-->
<select id="getEmpByChoose" resultType="Emp">
	select * from t_emp
    <where>
        <choose>
            <!--注意，不管是从第二条开始还是第几条不需要加and或or！因为choose只会执行一条！-->
            <when test="empName != null and empName != ''">
            	emp_name = #{empName}
            </when>
            <when test="age != null and age != ''">
            	age = #{age} and
            </when>
            <when test="sex != null and sex != ''">
            	sex = #{sex} and
            </when>
            <when test="email != null and email != ''">
            	email = #{email}
            </when>
            <!--如果上面条件后不满足则查询did为1的员工-->
            <otherwise>
            	did = 1
            </otherwise>
        </choose>
    </where>
</select>
```

## 53.动态SQL之foreach标签（1）

> 用foreach标签实现批量删除

DynamicSQLMapper接口：

>  由于底下需要获取eids这个数组，所以这里也可以加上@Param注解，手动去设置命名参数，方便下面的获取。

```java
/**
* 通过数组实现批量删除
*/
int deleteMoreByArrays(@Param("eids") Integer[] eids);
```

写法1：

```xml
<!--
    collection：我们当前要循环的数组或集合
    item：我们数组当前的每个元素，这里取名为eid
    separator：循环体之间的分隔符
    open：foreach标签所循环的所有内容的开始符
    close：foreach标签所循环的所有内容的结束符

目前只有where id in这种方式才需要使用open和close，其他情况也用不着
-->
delete from t_emp where eid in
<foreach collection="eids" item="eid" separator="," open="(" close=")">
    #{eid}
</foreach>
```

写法2：

```xml
<delete id="deleteMoreByArrays">
        delete from t_emp where
        <foreach collection="eids" item="eid" separator="or">
            eid = #{eid}
        </foreach>
</delete>
```

## 54.动态SQL之foreach标签（2）

> 用foreach标签实现批量添加

DynamicSQLMapper接口：

```java
/**
* 通过list集合实现批量添加
*/
int insertMoreByList(@Param("emps") List<Emp> emps);
```

DynamicSQLMapper.xml：

```xml
<!--int insertMoreByList(List<Emp> emps);-->
<insert id="insertMoreByList">
    insert into t_emp values
    <foreach collection="emps" item="emp" separator=",">
    <!--
    PS：这里不能使用open和close！
    这里的()代表每一个循环都会有一个()
    而open和close表示的是循环体外面加()
    -->
    (null, #{emp.empName}, #{emp.age}, #{emp.sex}, #{emp.email}, null)
    </foreach>
</insert>
```

Test类：

```java
@Test
public void testInsertMoreByList() {
    SqlSession sqlSession = SqlSessionUtils.getSqlSession();
    DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
    Emp emp1 = new Emp(null, "a", 23, "男", "13");
    Emp emp2 = new Emp(null, "b", 23, "男", "13");
    Emp emp3 = new Emp(null, "c", 23, "男", "13");
    List<Emp> emps = Arrays.asList(emp1, emp2, emp3);
    int result = mapper.insertMoreByList(emps);
    System.out.println(result);
}
```

## 55.动态SQL之sql标签

> sql片段，可以记录一段公共sql片段，在使用的地方通过include标签进行引入

```xml
<!--设置sql片段-->
<sql id="empColumns"> eid,ename,age,sex,did
</sql>
<!--引用sql片段-->
select <include refid="empColumns"></include> from t_emp
```

## 56.MyBatis的一级缓存

> 一级缓存是默认开启的。
>
> 一级缓存和二级缓存的级别不一样，即范围不一样。
>
> 缓存只对查询功能有效。

一级缓存是**SqlSession级别**的，通过同一个SqlSession（即使不是同一个mapper对象）查询的数据会被缓存，下次查询相同的数据，就  会从缓存中直接获取，不会从数据库重新访问

> 如下图所示，查询同一个对象的时候只输出了一条sql语句。第二条就是从缓存中获取数据的。

![image-20230930172357359](.\img\MyBatis的一级缓存.png)

> 如下图所示，用的不是同一个mapper对象，依旧是只输出一条sql！

![image-20230930172655140](.\img\MyBatis的一级缓存2.png)

> 但如果！重新创建一个SqlSession对象的话，第二次查询就会重新通过sql语句去查询！

![image-20230930172931809](.\img\MyBatis的一级缓存3.png)

## 57.使一级缓存失效的四种情况

1. 不同的SqlSession对应不同的一级缓存

2.  同一个SqlSession但是查询条件不同

3. 同一个SqlSession两次查询期间执行了任何一次增删改操作。

   > 这是因为增删改会改变数据库中的数据。 执行任意一次增删改的时候一定会将缓存清空的
   >
   > 缓存是来提高我们的速度的，但是并不能改变查询的真实性！
   >
   > 如下图，在增加了添加语句后，即使是使用了同一个SqlSession，但是sql语句又输出了！

   ![image-20230930174748689](.\img\MyBatis的一级缓存4.png)

4. 同一个SqlSession两次查询期间手动清空了缓存

   > SqlSession里有个方法：clearCache()，用来清空缓存。
   >
   > 如下图所示，当缓存被清空时，sql语句同样再次输出了。

![image-20230930174935099](.\img\MyBatis的一级缓存5.png)

## 58.MyBatis的二级缓存

> 二级缓存是需要手动开启的

二级缓存是SqlSessionFactory级别，通过同一个SqlSessionFactory创建的SqlSession查询的结果会被缓存；此后若再次执行相同的查询语句，结果就会从缓存中获取

二级缓存开启的条件：

a>在核心配置文件中，设置全局配置属性cacheEnabled="true"，默认为true，不需要设置

b>在映射文件中设置标签<cache />

c>二级缓存必须在SqlSession关闭或提交之后有效

> 没有关闭或提交数据会保存到一级缓存中。

d>查询的数据所转换的实体类类型必须实现序列化的接口 Serializable

> 其中有一条数据：缓存命中率，主要指的是当前我们所查询出来的这条数据在我们的缓存中是否有。
>
> ```cmd
> Cache Hit Ratio [com.atguigu.mybatis.mapper.CatchMapper]: 0.0 (LoggingCache.java:60)
> ```

![image-20230930182401431](.\img\MyBatis的二级缓存.png)

> 每次使用完sqlSession后都将其关闭，此时会发现缓存率变了，缓存率不为0，所以是存在这条数据的！

![image-20230930182557221](.\img\MyBatis的二级缓存2.png)

使二级缓存失效的情况：

两次查询之间执行了任意的增删改，会使一级和二级缓存同时失效

手动清空缓存只对一级缓存有效！

## 3、二级缓存的相关配置

在mapper配置文件中添加的cache标签可以设置一些属性：

eviction属性：缓存回收策略

LRU（Least Recently Used） – 最近最少使用的：移除最长时间不被使用的对象。

FIFO（First in First out） – 先进先出：按对象进入缓存的顺序来移除它们。

SOFT – 软引用：移除基于垃圾回收器状态和软引用规则的对象。

WEAK – 弱引用：更积极地移除基于垃圾收集器状态和弱引用规则的对象。默认的是 LRU。

flushInterval属性：刷新间隔，单位毫秒

默认情况是不设置，也就是没有刷新间隔，缓存仅仅调用语句时刷新

size属性：引用数目，正整数

代表缓存最多可以存储多少个对象，太大容易导致内存溢出

readOnly属性：只读，true/false

true：只读缓存；会给所有调用者返回缓存对象的相同实例。因此这些对象不能被修改。这提供了很重要的性能优势。

false：读写缓存；会返回缓存对象的拷贝（通过序列化）。这会慢一些，但是安全，因此默认是false。

## 60、MyBatis缓存查询的顺序

先查询二级缓存，因为二级缓存中可能会有其他程序已经查出来的数据，可以拿来直接使用。 如果二级缓存没有命中，再查询一级缓存

如果一级缓存也没有命中，则查询数据库

SqlSession关闭之后，一级缓存中的数据会写入二级缓存

## 61、整合第三方缓存EHCache

> 只能使用其他的第三方技术来代替二级缓存，而一级缓存是没有办法去代替的。

### a>添加依赖

```xml
<!-- Mybatis EHCache整合包 -->
<dependency>
    <groupId>org.mybatis.caches</groupId>
    <artifactId>mybatis-ehcache</artifactId>
    <version>1.2.1</version>
</dependency>
<!-- 
slf4j日志门面的一个具体实现 
日志的门面，提供的是日志的接口，而日志的实现才是具体的日志实现方式
-->
<dependency>
    <groupId>ch.qos.logback</groupId>
    <artifactId>logback-classic</artifactId>
    <version>1.2.3</version>
</dependency>
```

**b>各jar包功能**

| **jar包名称**   | **作用**                        |
| --------------- | ------------------------------- |
| mybatis-ehcache | Mybatis和EHCache的整合包        |
| ehcache         | EHCache核心包                   |
| slf4j-api       | SLF4J日志门面包                 |
| logback-classic | 支持SLF4J门面接口的一个具体实现 |

**c>****创建****EHCache****的配置文件****ehcache.xml**

```xml
<?xml version="1.0" encoding="utf-8" ?>
<ehcache xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:noNamespaceSchemaLocation="../config/ehcache.xsd">
    <!-- 磁盘保存路径 -->
    <diskStore path="D:\atguigu\ehcache"/>
    <defaultCache
                  maxElementsInMemory="1000" maxElementsOnDisk="10000000" eternal="false" overflowToDisk="true" timeToIdleSeconds="120" timeToLiveSeconds="120"
                  diskExpiryThreadIntervalSeconds="120" memoryStoreEvictionPolicy="LRU">
    </defaultCache>
</ehcache>
```

**d>设置二级缓存的类型**

> 使用type属性

```xml
<cache type="org.mybatis.caches.ehcache.EhcacheCache"/>
```

**e>加入logback日志**

存在SLF4J时，作为简易日志的log4j将失效，此时我们需要借助SLF4J的具体实现logback来打印日志。创建logback的配置文件logback.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<configuration debug="true">
    <!-- 指定日志输出的位置 -->
    <appender name="STDOUT" class="ch.qos.logback.core.ConsoleAppender">
        <encoder>
            <!-- 日志输出的格式 -->
            <!-- 按照顺序分别是：时间、日志级别、线程名称、打印日志的类、日志主体内容、换行 -
->
<pattern>[%d{HH:mm:ss.SSS}] [%-5level] [%thread] [%logger] [%msg]%n</pattern>
</encoder>
</appender>

<!-- 设置全局日志级别。日志级别按顺序分别是：DEBUG、INFO、WARN、ERROR -->
            <!-- 指定任何一个日志级别都只打印当前级别和后面级别的日志。 -->
            <root level="DEBUG">
                <!-- 指定打印日志的appender，这里通过“STDOUT”引用了前面配置的appender -->
                <appender-ref ref="STDOUT" />
            </root>

            <!-- 根据特殊需求指定局部日志级别 -->
            <logger name="com.atguigu.crowd.mapper" level="DEBUG"/>

            </configuration>
```

### f>EHCache配置文件说明

| **属性名**                      | **是否必须** | **作用**                                                     |
| ------------------------------- | ------------ | ------------------------------------------------------------ |
| maxElementsInMemory             | 是           | 在内存中缓存的element的最大数目                              |
| maxElementsOnDisk               | 是           | 在磁盘上缓存的element的最大数目，若是0表示无 穷大            |
| eternal                         | 是           | 设定缓存的elements是否永远不过期。 如果为  true，则缓存的数据始终有效， 如果为false那么还要根据timeToIdleSeconds、timeToLiveSeconds  判断 |
| overflowToDisk                  | 是           | 设定当内存缓存溢出的时候是否将过期的element 缓存到磁盘上     |
| timeToIdleSeconds               | 否           | 当缓存在EhCache中的数据前后两次访问的时间超 过timeToIdleSeconds的属性取值时， 这些数据便会删除，默认值是0,也就是可闲置时间无穷大 |
| timeToLiveSeconds               | 否           | 缓存element的有效生命期，默认是0.,也就是  element存活时间无穷大 |
| diskSpoolBufferSizeMB           | 否           | DiskStore(磁盘缓存)的缓存区大小。默认是  30MB。每个Cache都应该有自己的一个缓冲区 |
| diskPersistent                  | 否           | 在VM重启的时候是否启用磁盘保存EhCache中的数据，默认是false。 |
| diskExpiryThreadIntervalSeconds | 否           | 磁盘缓存的清理线程运行间隔，默认是120秒。每  个120s， 相应的线程会进行一次EhCache中数据的清理工作 |
| memoryStoreEvictionPolicy       | 否           | 当内存缓存达到最大，有新的element加入的时  候， 移除缓存中element的策略。 默认是LRU（最近最少使用），可选的有LFU（最不常使用）和FIFO（先进先出） |

 

## **十一、MyBatis的逆向工程**

> 正向：根据实体类去生成表。
> hibernate是支持正向工程的，它不仅可以帮助我们去生成表，还可以帮助我们去生成sql语句

   正向工程：先创建Java实体类，由框架负责根据实体类生成数据库表。Hibernate是支持正向工程的。

   逆向工程：先创建数据库表，由框架负责根据数据库表，反向生成如下资源：

   Java实体类

   Mapper接口

   Mapper映射文件

MBG：MyBatis Generater

## 1、创建逆向工程的步骤           

###           a>添加依赖和插件

```xml
<!-- 依赖MyBatis核心包 -->
<dependencies>
    <dependency>
        <groupId>org.mybatis</groupId>
        <artifactId>mybatis</artifactId>
        <version>3.5.7</version>
    </dependency>
</dependencies>

<!-- 控制Maven在构建过程中相关配置 -->
<build>

    <!-- 构建过程中用到的插件 -->
    <plugins>

        <!-- 具体插件，逆向工程的操作是以构建过程中插件形式出现的 -->
        <plugin>
            <groupId>org.mybatis.generator</groupId>
            <artifactId>mybatis-generator-maven-plugin</artifactId>
            <version>1.3.0</version>

            <!-- 插件的依赖 -->
            <dependencies>

                <!-- 逆向工程的核心依赖 -->
                <dependency>
                    <groupId>org.mybatis.generator</groupId>
                    <artifactId>mybatis-generator-core</artifactId>
                    <version>1.3.2</version>
                </dependency>

                <!-- 数据库连接池 -->
                <dependency>
                    <groupId>com.mchange</groupId>
                    <artifactId>c3p0</artifactId>
                    <version>0.9.2</version>
                </dependency>

                <!-- MySQL驱动 -->
                <dependency>
                    <groupId>mysql</groupId>
                    <artifactId>mysql-connector-java</artifactId>
                    <version>5.1.8</version>
                </dependency>
            </dependencies>
        </plugin>
    </plugins>
</build>
```

b>创建MyBatis的核心配置文件

c>创建逆向工程的配置文件
文件名必须是：generatorConfig.xml

```xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE generatorConfiguration
        PUBLIC "-//mybatis.org//DTD MyBatis Generator Configuration 1.0//EN"
        "http://mybatis.org/dtd/mybatis-generator-config_1_0.dtd">
<generatorConfiguration>
    <!--
    targetRuntime: 执行生成的逆向工程的版本
    MyBatis3Simple: 生成基本的CRUD（清新简洁版）
    MyBatis3: 生成带条件的CRUD（奢华尊享版）
    -->
    <context id="DB2Tables" targetRuntime="MyBatis3Simple">
        <!-- 数据库的连接信息 -->
        <jdbcConnection driverClass="com.mysql.jdbc.Driver"
                        connectionURL="jdbc:mysql://localhost:3306/mybatis" userId="root"
                        password="123456">
        </jdbcConnection>
        <!-- javaBean的生成策略-->
        <javaModelGenerator targetPackage="com.atguigu.mybatis.bean" targetProject=".\src\main\java">
            <property name="enableSubPackages" value="true"/>
            <property name="trimStrings" value="true"/>
        </javaModelGenerator>
        <!-- SQL映射文件的生成策略 -->
        <sqlMapGenerator targetPackage="com.atguigu.mybatis.mapper" targetProject=".\src\main\resources">
            <property name="enableSubPackages" value="true"/>
        </sqlMapGenerator>
        <!-- Mapper接口的生成策略 -->
        <javaClientGenerator type="XMLMAPPER" targetPackage="com.atguigu.mybatis.mapper"
                             targetProject=".\src\main\java">
            <property name="enableSubPackages" value="true"/>
        </javaClientGenerator>
        <!-- 逆向分析的表 -->
        <!-- tableName设置为*号，可以对应所有表，此时不写domainObjectName -->
        <!-- domainObjectName属性指定生成出来的实体类的类名 -->
        <table tableName="t_emp" domainObjectName="Emp"/>
        <table tableName="t_dept" domainObjectName="Dept"/>
    </context>
</generatorConfiguration>
```

d>执行MBG插件的generate目标

效果：

![image-20230930201458940](.\img\逆向工程.png)

## 63.MyBatis逆向工程之奢华尊享版（1）

> 如果要重新生成的话，建议先把之前生成的都删掉，因为有时候重新生成的时候它会以追加的方式生成。

![image-20230930201608248](.\img\MyBatis逆向工程之奢华尊享版.png)

>  只要看见了example这个单词，就是根据条件来进行查询的。
>
> eg下面的方法：countByExample ：根据条件来获取我们的总记录数
>
> deleteByExample：根据条件进行删除
>
> deleteByPrimaryKey：根据主键进行删除
>
> int insert(Emp record)：普通添加，如果某个属性的值是null，此时会直接把null这个值赋值给这个字段。
>
> int insertSelective(Emp record)：选择性添加，只会将我们的属性值，不是空的为相对应的字段赋值。如果某个属性为空，那它就不会出现在字段中。
>
> selectByExample：根据条件进行查询，即可以以任意字段作为条件，而且是以任意字段的任意的需求来作为条件。
> 比如说大于小于、模糊查询、and、in等等。
>
> updateByExampleSelective：根据条件选择性修改。不会去修改属性为null所对应的字段。
>
> updateByExample：普通修改。此时会把null赋值给字段。

![image-20230930201817474](.\img\MyBatis逆向工程之奢华尊享版2.png)

```java
//查询所有数据
//没有条件，里面写个null即可
List<Emp> list = mapper.selectByExample(null);
```

2.、QBC查询

> QBC：网络条件查询(Query By Criteria)，即根据条件来查询
>
> 我们的条件都是直接定义好的，我们只需要来访问相对应的方法，就可以在sql语句中生成相对应的条件。

```java
@Test
public void testMBG() throws IOException {
    InputStream is = Resources.getResourceAsStream("mybatis-config.xml"); SqlSession sqlSession = new
        SqlSessionFactoryBuilder().build(is).openSession(true); EmpMapper mapper = sqlSession.getMapper(EmpMapper.class); EmpExample empExample = new EmpExample();
    //创建条件对象，通过andXXX方法为SQL添加查询添加，每个条件之间是and关系
empExample.createCriteria().andEnameLike("a").andAgeGreaterThan(20).andDidIsNot Null();
    //将之前添加的条件通过or拼接其他条件
    empExample.or().andSexEqualTo("男");
    List<Emp> list = mapper.selectByExample(empExample); for (Emp emp : list) {
        System.out.println(emp);
    }
}
```

## 63.MyBatis逆向工程之奢华尊享版（2）

**十二、分页插件**

**1****、分页插件使用步骤**         

### a>添加依赖

```xml
<!-- https://mvnrepository.com/artifact/com.github.pagehelper/pagehelper -->
<dependency>
    <groupId>com.github.pagehelper</groupId>
    <artifactId>pagehelper</artifactId>
    <version>5.2.0</version>
</dependency>
```

b**>配置分页插件**

在MyBatis的核心配置文件中配置插件

```xml
<plugins>
    <!--设置分页插件-->
    <plugin interceptor="com.github.pagehelper.PageInterceptor"></plugin>
</plugins>
```

## 65.MyBatis的分页插件简介

### a>添加依赖

```xml
<!-- https://mvnrepository.com/artifact/com.github.pagehelper/pagehelper -->
<dependency>
    <groupId>com.github.pagehelper</groupId>
    <artifactId>pagehelper</artifactId>
    <version>5.2.0</version>
</dependency>
```

**b>配置分页插件**

在MyBatis的核心配置文件中配置插件

```xml
<plugins>
    <!--设置分页插件-->
    <plugin interceptor="com.github.pagehelper.PageInterceptor"></plugin>
</plugins>
```

## 66、分页插件的使用

a>在查询功能之前使用PageHelper.startPage(int pageNum, int pageSize)开启分页功能，这个方法的返回值就是一个Page对象

```java
Page<Object> objects = PageHelper.startPage(2, 4);
```

>  pageNum：当前页的页码
> pageSize：每页显示的条数

b>在查询获取list集合之后，使用PageInfo<T> pageInfo = new PageInfo<>(List<T> list, int navigatePages)获取分页相关数据

> 它的泛型就是我们查询之后的数据
>
> list：分页之后的数据
>
> navigatePages：导航分页的页码数，不介意写偶数。
> 导航分页的页码数一般都会以当前页码在中间，-2到+2结束。
> 但是开头和末尾除外。

```java
List<Emp> list = mapper.selectByExample(null);
PageInfo<Emp> page = new PageInfo<>(list, 1);
```

c>分页相关数据

> PageInfo{
> pageNum=8, pageSize=4, size=2, startRow=29, endRow=30, total=30, pages=8,
> list=Page{count=true, pageNum=8, pageSize=4, startRow=28, endRow=32, total=30, pages=8, reasonable=false, pageSizeZero=false},
> prePage=7, nextPage=0, isFirstPage=false, isLastPage=true, hasPreviousPage=true, hasNextPage=false, navigatePages=5, navigateFirstPage4, navigateLastPage8, navigatepageNums=[4, 5, 6, 7, 8]
> }
> 常 用 数 据 ：     
>
> pageNum：当前页的页码
>
> pageSize：每页显示的条数
>
> size：当前页显示的真实条数total： 总 记 录 数  pages： 总 页 数 
>
> prePage：上一页的页码nextPage：下一页的页码







