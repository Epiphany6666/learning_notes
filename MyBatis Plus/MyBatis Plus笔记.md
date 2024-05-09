## MyBatis Plus

# 第 1 章 简介

 

## 01.MyBatisPlus 介绍

![img](.\img\MyBatis Plus Logo.jpg)

**MyBatis-Plus(简称MP),是一个MyBatis** **的增强工具包，只做增强不做改变。为简化开发工作、提高生产率而生**。

**我们的愿景是成为** **Mybatis** **最好的搭档，就像 魂斗罗 中的** 1P、2P，基友搭配，效率翻倍。

## 2.MyBatis-plus特性

## 代码及文档发布地址

官方地址: http://mp.baomidou.com 

代码发布地址: 
Github: https://github.com/baomidou/mybatis-plus 
Gitee: https://gitee.com/baomidou/mybatis-plus 
文档发布地址: https://baomidou.com/pages/24112f

##  3.MyBatis-Plus支持的数据库以及框架结构

4.入门案例之开发环境

## 1.3   前置知识

IDE：idea 2019.2 

JDK：JDK8+ 

构建工具：maven 3.5.4 

MySQL版本：MySQL 5.7

Spring Boot：2.6.3 

MyBatis-Plus：3.5.1

## 05.创建测试数据库和表

### 2、创建数据库及表

a>创建表

```mysql
CREATE DATABASE `mybatis_plus` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
use `mybatis_plus`;
CREATE TABLE `user` (
`id` bigint(20) NOT NULL COMMENT '主键ID',
`name` varchar(30) DEFAULT NULL COMMENT '姓名',
`age` int(11) DEFAULT NULL COMMENT '年龄',
`email` varchar(50) DEFAULT NULL COMMENT '邮箱',
PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
```

b>添加数据

```mysql
INSERT INTO user (id, name, age, email) VALUES
(1, 'Jone', 18, 'test1@baomidou.com'),
(2, 'Jack', 20, 'test2@baomidou.com'),
(3, 'Tom', 28, 'test3@baomidou.com'),
(4, 'Sandy', 21, 'test4@baomidou.com'),
(5, 'Billie', 24, 'test5@baomidou.com');
```

## 06.创建Spring Boot工程

1.检查全局maven配置信息

![image-20231003184623603](.\img\检查全局maven配置信息.png)

3、创建Spring Boot工程

a>初始化工程 

使用 Spring Initializr 快速初始化一个 Spring Boot 工程

![image-20231003190041568](.\img\创建springBoot工程.png)

b>引入依赖

```xml
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>

    <!--mybatis-plus启动器-->
    <dependency>
        <groupId>com.baomidou</groupId>
        <artifactId>mybatis-plus-boot-starter</artifactId>
        <version>3.5.1</version>
    </dependency>

    <!--lombok用于简化实体类开发-->
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <optional>true</optional>
    </dependency>

    <!--mysql驱动-->
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
        <version>5.1.43</version>
        <scope>runtime</scope>
    </dependency>
</dependencies>
```

c.>idea中安装lombok插件

![image-20231003191712073](.\img\image-20231003191712073.png)

07.配置application.yml

![image-20231003192101033](.\img\SpringBoot项目结构.png)

**4**、编写代码

a>配置application.yml

> 在property和yml中，如果想要来表示注释，就应该使用#

```yml
spring:
  # 配置数据源信息
  datasource:
    # 配置数据源类型
    type: com.zaxxer.hikari.HikariDataSource
    # 配置链接数据库的各个信息
    driver-class-name: com.mysql.jdbc.Driver
    # characterEncoding：连接、操作数据库时的编码格式
    # 8版本中还需要添加上时区
    url: jdbc:mysql://localhost:3306/mybatis_plus?characterEncoding=utf-8&userSSL=false
    username: root
    password: 123456
```

properties配置文件的配置方式：

```properties
# 设置数据源，这里直接使用SpringBoot中默认使用的数据源HikariDataSource
spring.datasource.type=com.zaxxer.hikari.HikariDataSource

# 设置驱动类
spring.datasource.driver-class-name=com.mysql.jdbc.Driver
```

PS：

> 1. 驱动类driver-class-name
>
>    spring boot 2.0（内置jdbc5驱动），驱动类使用
>
>    driver-class-name: com.mysql.jdbc.Driver
>
>    spring boot 2.1及以上（内置jdbc8驱动），驱动类使用： driver-class-name: com.mysql.cj.jdbc.Driver
>
>    否则运行测试用例的时候会有 WARN 信息
>
> 2. 连接地址url
>
>    MySQL5.7 版 本 的 url： jdbc:mysql://localhost:3306/mybatis_plus?characterEncoding=utf-8&useSSL=false
>
>    MySQL8.0版本的url：
>
>    jdbc:mysql://localhost:3306/mybatis_plus? serverTimezone=GMT%2B8（中国的时区）&characterEncoding=utf-8&useSSL=false
>
>    否则运行测试用例报告如下错误：
>
>    java.sql.SQLException: The server time zone value 'ÖÐ¹ú±ê×¼Ê±¼ä' is unrecognized or represents more

## 08.创建实体类以及lombok的简单使用

> orm：对象关系映射。
> 操作数据库中的表要和实体类之间创建映射关系。

> @NoArgsConstructor：相当于无参构造，此时编译，然后再target里面可以看见无参构造

![image-20231003194640540](.\img\lombok.png)

User类：

```java
package com.atguigu.mybatisplus.pojo;

import lombok.*;

/*
//创建无参构造
@NoArgsConstructor
//创建所有参数的有参构造
@AllArgsConstructor
//设置get方法
@Getter
//设置Set方法
@Setter
//重写equals和hashCode方法
@EqualsAndHashCode
*/

//以上所有的注解都可以通过@Data注解来代替构造，还包括toString方法，除了有参构造以外
@Data
public class User {
    //由于之前创建表的类型的时候是bigint类型，所以这里用long
    private Long id;

    private String name;

    private Integer age;

    private String email;
}
```

## 09.创建mapper接口并扫描

> BaseMapper是MyBatis-Plus提供的模板mapper，其中包含了基本的CRUD方法，泛型为操作的实体类型

BaseMapper中的T，从添加的方法可以看出，表示的是操作的实体类的类型

![image-20231003200610987](.\img\BaseMapper.png)

> 在SpringBoot工程中来使用MyBatis的功能的时候，一定要设置Mapper接口所在的包，以及映射文件所在的包。
>
> 所以说需要在启动类上添加上注解@MapperScan，里面写的是Mapper接口所在的包

## 10.测试

> 在MyBatis-plus中不需要自己手动来写sql语句了，直接套用BaseMapper的模板。
>
> 如下图：
> Wrapper：条件构造器。
> 如果有条件的话，就可以通过Wrapper来实现，没有条件的话，直接在里面写一个null。

![image-20231003201547035](.\img\BaseMapper里面的selectList方法.png)

## 11.加入日志功能

在application.yml中加入：

```yml
mybatis-plus:
  configuration:
    log-impl: org.apache.ibatis.logging.stdout.StdOutImpl
```

![image-20231004191141943](.\img\加入日志功能.png)

> 在我们使用mybatis-plus时，并没有设置去操作哪张表。
>
> MyBatis-Plus所操控的表以及表中的字段，由实体类以及实体类中的属性决定。

## 12.BaseMapper

MyBatis-Plus中的基本CRUD在内置的BaseMapper中都已得到了实现，我们可以直接使用，接口如下：

```java

package com.baomidou.mybatisplus.core.mapper;

public interface BaseMapper<T> extends Mapper<T> {

/**
*	插入一条记录
*	@param entity 实体对象
*/
int insert(T entity);

/**
*	根据 ID 删除
*	@param id 主键ID
*/
int deleteById(Serializable id);

/**
*	根据实体(ID)删除
*	@param entity 实体对象
* @since 3.4.4
*/
 int deleteById(T entity);


/**
*	根据 columnMap 条件，删除记录
*	@param columnMap 表字段 map 对象
*/
int deleteByMap(@Param(Constants.COLUMN_MAP) Map<String, Object> columnMap);


/**
*	根据 entity 条件，删除记录
*	@param queryWrapper 实体对象封装操作类（可以为 null,里面的 entity 用于生成 where
语句）
*/
int delete(@Param(Constants.WRAPPER) Wrapper<T> queryWrapper);


/**
*	删除（根据ID 批量删除）
*	@param idList 主键ID列表(不能为 null 以及 empty)
*/
int deleteBatchIds(@Param(Constants.COLLECTION) Collection<? extends Serializable> idList);

/**
*	根据 ID 修改
*	@param entity 实体对象
*/
int updateById(@Param(Constants.ENTITY) T entity);


/**
*	根据 whereEntity 条件，更新记录
*	@param entity	实体对象 (set 条件值,可以为 null)
*	@param updateWrapper 实体对象封装操作类（可以为 null,里面的 entity 用于生成
where 语句）
*/
int update(@Param(Constants.ENTITY) T entity, @Param(Constants.WRAPPER) Wrapper<T> updateWrapper);

/**
*	根据 ID 查询
*	@param id 主键ID
*/
T selectById(Serializable id);


/**
*	查询（根据ID 批量查询）
*	@param idList 主键ID列表(不能为 null 以及 empty)
*/
List<T> selectBatchIds(@Param(Constants.COLLECTION) Collection<? extends Serializable> idList);

/**
*	查询（根据 columnMap 条件）
*	@param columnMap 表字段 map 对象
*/
List<T> selectByMap(@Param(Constants.COLUMN_MAP) Map<String, Object> columnMap);

```

## 13.测试BaseMapper的新增功能

```java
@Test
public void testInsert(){
    User user = new User(null, "张三", 23, "zhangsan@atguigu.com");
    //INSERT INTO user ( id, name, age, email ) VALUES ( ?, ?, ?, ? ) 
    int result = userMapper.insert(user); 
    System.out.println("受影响行数："+result);
    //1475754982694199298
    System.out.println("id自动获取："+user.getId());
}
```

> 最终执行的结果，所获取的id为1475754982694199298
>
> 这是因为MyBatis-Plus在实现插入数据时，会默认基于雪花算法的策略生成id，这也是表中id字段类型为bigint和属性类型为long类型的原因。

## 14.测试BaseMapper的删除功能

### a>通过id删除记录

```java
@Test
public void testDeleteById(){
    //通过id删除用户信息
    //DELETE FROM user WHERE id=?
    //不加L这里会报错，因为这个数据已经超出了int类型的范围
    int result = userMapper.deleteById(1709529089216647170L);
    System.out.println("受影响行数："+result);
}
```

**b>通过id批量删除记录**

```java
@Test
public void testDeleteBatchIds(){
    //通过多个id批量删除
    //DELETE FROM user WHERE id IN ( ? , ? , ? )
    //Arrays.asList方法：把数据直接转化为集合
    //写L是因为id本身就是long类型的
    List<Long> idList = Arrays.asList(1L, 2L, 3L);
    int result = userMapper.deleteBatchIds(idList);
    System.out.println("受影响行数："+result);
}
```

**c>通过map条件删除记录**

```java
@Test
public void testDeleteByMap(){
    Map<String, Object> map = new HashMap<>();
    map.put("name", "张三");
    map.put("age", 23);
    //delte方法是需要根据条件来进行删除的，所以map集合里放的就是删除的条件
    int result = userMapper.deleteByMap(map);
    System.out.println("result:" +  result);
}
```

## **15.测试BaseMapper的修改功能**

```java
@Test
public void testUpdateById(){
    User user = new User(4L, "admin", 22, null);
    //UPDATE user SET name=?, age=? WHERE id=? 
    int result = userMapper.updateById(user);
    System.out.println("受影响行数："+result);
}
```

**5****、查询**

**a>****根据****id****查询用户信息**

```java
@Test
public void testSelectById(){
    //根据id查询用户信息
    //SELECT id,name,age,email FROM user WHERE id=? 
    User user = userMapper.selectById(4L); 
    System.out.println(user);
}
```

**b>****根据多个****id****查询多个用户信息**

```java
@Test
public void testSelectBatchIds(){
    //根据多个id查询多个用户信息
    //SELECT id,name,age,email FROM user WHERE id IN ( ? , ? ) 
    List<Long> idList = Arrays.asList(4L, 5L);
	List<User> list = userMapper.selectBatchIds(idList); 
    list.forEach(System.out::println);
}
```

**c>****通过****map****条件查询用户信息**

```java
@Test
public void testSelectByMap(){
    //通过map条件查询用户信息
    //SELECT id,name,age,email FROM user WHERE name = ? AND age = ? 
    Map<String, Object> map = new HashMap<>();
    map.put("age", 22);
    map.put("name", "admin");
    List<User> list = userMapper.selectByMap(map); 
    list.forEach(System.out::println);
}
```

d**>****查询所有数据**

```java
@Test
public void testSelectList(){
    //查询所有用户信息
    //SELECT id,name,age,email FROM user 
    List<User> list = userMapper.selectList(null); 
    list.forEach(System.out::println);
}
```

> 通过观察BaseMapper中的方法，大多方法中都有Wrapper类型的形参，此为条件构造器，可针对于SQL语句设置不同的条件，若没有条件，则可以为该形参赋值null，即查询（删除/修改）所有数据

## 17.测试自定义功能

> 在mybatis-plus中，如果想要来设置映射文件的位置，需要通过mapper-locations来进行配置的。
>
> 这个配置有一个默认的位置：类路径下的mapper下的任意目录的xml文件

![image-20231004194833709](.\img\映射文件默认位置.png)

UserMapper接口：

```java
/**
* 根据id查询用户信息为map集合
* @param id
* @return
*/
Map<String, Object> selectMapById(@Param("id") Long id);
```

UserMapper.xml：

```xml
<!--Map<String, Object> selectMapById(@Param("id") Long id);-->
<select id="selectMapById" resultType="map">
	select id, name, age, email from user where id = #{id}
</select>
```

Test：

```java
@Test
public void testSelectMapById() {
    Map<String, Object> map = userMapper.selectMapById(1L);
    System.out.println(map);
}
```

## 6、通用Service

> 说明:
>
> - 通用 Service CRUD 封装[IService (opens new window)](https://gitee.com/baomidou/mybatis-plus/blob/3.0/mybatis-plus-extension/src/main/java/com/baomidou/mybatisplus/extension/service/IService.java)接口，进一步封装 CRUD 采用 `get 查询单行` `remove 删除` `list 查询集合` `page 分页` 前缀命名方式区分 `Mapper` 层避免混淆
> - 泛型 `T` 为任意实体对象
> - 建议如果存在自定义通用 Service 方法的可能，请创建自己的 `IBaseService` 继承 `Mybatis-Plus` 提供的基类
> - 对象 `Wrapper` 为 [条件构造器](https://baomidou.com/pages/10c804/)
> - [官网地址：https://baomidou.com/pages/49cc81/#service-crud-%E6%8E%A5%E5%8F%](https://baomidou.com/pages/49cc81/#service-crud-接口)

### a>IService

MyBatis-Plus中有一个接口 IService和其实现类 ServiceImpl，封装了常见的业务层逻辑详情查看源码IService和ServiceImpl

> IService中，save开头的就是添加 / 保存的的方法
>
> saveOrUpdate：添加和修改的方法，这个方法会对id进行一个检测，如果有id，就是修改；如果没有id就是添加。
>
> IService中的泛型是我们操作的实体类对象。
>
> ServiceImpl中的泛型：
>
> > public class ServiceImpl<M extends BaseMapper<T>, T> implements IService<T> {
> >
> > M指的是 我们当前自己所写的Mapper
> >
> > T指的是 我们当前要操作的实体类对象

>  这里不建议直接使用ServiceImpl，因为以后的业务逻辑是非常复杂的。
> 我们需要根据自己的需求来完成业务逻辑，所以说ServiceImpl肯定是无法满足我们的需求的，此时我们可以自己创建Service接口，然后让它去继承IService接口。
>
> 所以这里建议自己创建一个Service，这个时候我们可以使用它们所提供的功能，也可以使用自定义的功能。

### b>创建Service接口和实现类

1. 首先创建Service接口，让它去继承IService接口

   ```java
   public interface UserService extends IService<User> {
   }
   ```

2. 在service包下创建impl包，里面创建实现类UserServiceImpl，让它去实现接口UserService，但由于实现接口就需要实现接口里的所有方法，所以此时还需要去继承ServiceImpl实现类！

   ```java
   public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
   }
   ```

## 19.测试通用Service之查询总记录数

1. 在UserService实现类UserServiceImpl上添加注解：@Service

2. 编写测试类：

   ```java
   //一定要记得加上这两个注解！！！
   @SpringBootTest
   @RunWith(SpringRunner.class)
   public class MyBatisPlusServiceTest {
       @Autowired
       private UserService userService;
   
       @Test
       public void testGetCount() {
           //查询总记录数
           //SELECT COUNT( * ) FROM user
           long count = userService.count();
           System.out.println("总记录数：" + count);
       }
   }
   ```

## 20.测试通用Service之批量添加

> 由于批量添加是需要后面跟大量的sql语句。所以Mapper里面是没有批量添加的方法的，在Service中有

```java
@Test
public void testInsertMore() {
    // SQL长度有限制，海量数据插入单条SQL无法实行，
	// 因此MP将批量插入放在了通用Service中实现，而不是通用Mapper
    List<User> list = new ArrayList<>();
    for (int i = 1; i < 10; i++) {
        User user = new User();
        user.setName("ybc" + i);
        user.setAge(20 + i);
        list.add(user);
    }
    boolean b = userService.saveBatch(list);
    System.out.println(b);
}
```

> 执行完观察执行的sql语句：
>
> ```sql
> INSERT INTO user ( id, name, age ) VALUES ( ?, ?, ? )
> ```
>
> 后面没有逗号，这是因为Service中的功能也是通过BaseMapper来实现的，而BaseMapper中都没有添加的方法，所以Service也是通过单个添加进行循环来添加的。

## 21.MyBatis-Plus的常用注解@TableName

> 经过以上的测试，在使用MyBatis-Plus实现基本的CRUD时，我们并没有指定要操作的表，只是在Mapper接口继承BaseMapper时，设置了泛型User，而操作的表为user表
>
> 由此得出结论，MyBatis-Plus在确定操作的表时，由BaseMapper的泛型决定，即实体类型决 定，且默认操作的表名和实体类型的类名一致

### a>问题

> 若实体类类型的类名和要操作的表的表名不一致，会出现什么问题?
>
> 我们将表user更名为t_user，测试查询功能
>
> 程序抛出异常，Table 'mybatis_plus.user' doesn't exist，因为现在的表名为t_user，而默认操作的表名和实体类型的类名一致，即user表

![image-20231004205934569](.\img\@TableName.png)

### b>通过@TableName解决问题

> 实体类类型上添加@TableName("t_user")，标识实体类对应的表，即可成功执行SQL语句

![image-20231004210242800](.\img\@TableName2.png)

c>通过全局配置解决问题

> 在开发的过程中，我们经常遇到以上的问题，即实体类所对应的表都有固定的前缀，例如t_或tbl_
>
> 此时，可以使用MyBatis-Plus提供的全局配置，为实体类所对应的表名设置默认的前缀，那么就不需要在每个实体类上通过@TableName标识实体类对应的表

```yml
mybatis-plus: 
  configuration:
# 配置MyBatis日志
    log-impl: org.apache.ibatis.logging.stdout.StdOutImpl
  # 设置MyBatis-Plus的全局配置
  global-config:
    db-config:
      table-prefix: t_
```

![image-20231004210412803](.\img\@TableName3.png)

## 22.MyBatis-Plus的常用注解@TableId

> 经过以上的测试，MyBatis-Plus在实现CRUD时，会默认将id作为主键列，并在插入数据时，默认基于雪花算法的策略生成id

### a>问题

> 若实体类和表中表示主键的不是id，而是其他字段，例如uid，MyBatis-Plus会自动识别uid为主键列吗？
>
> 我们实体类中的属性id改为uid，将表中的字段id也改为uid，测试添加功能
>
> 程序抛出异常，Field 'uid' doesn't have a default value，说明MyBatis-Plus没有将uid作为主键赋值

![image-20231004210847316](.\img\主键报错.png)

### b>通过@TableId解决问题

> 在实体类中uid属性上通过@TableId将其标识为主键，即可成功执行SQL语句

![image-20231004210943712](.\img\@Table.png)

## 23.

### c>@TableId的value属性

> 若实体类中主键对应的属性为id，而表中表示主键的字段为uid，此时若只在属性id上添加注解@TableId，则抛出异常Unknown column 'id' in 'field list'，即MyBatis-Plus仍然会将id作为表的主键操作，而表中表示主键的是字段uid
>
> 此时需要通过@TableId注解的value属性，指定表中的主键字段，@TableId("uid")或
>
> @TableId(value="uid")，如果只设置value属性的话，可以直接写""，不用写属性名

![image-20231004211032485](.\img\@Table2.png)

## 24.

> MyBatis-Plus默认生成id的策略就是雪花算法，如果在数据库里将id设置为自动递增的也是没有作用的。

### d>@TableId的type属性

> type属性用来定义主键策略
>
> 注意，如果需要来测试这个功能，需要先truncate（截断）这个表

#### 常用的主键策略：

| **值**                   | **描述**                                                     |
| ------------------------ | ------------------------------------------------------------ |
| IdType.ASSIGN_ID（默认） | 基于雪花算法的策略生成数据id，与数据库id是否设置自增无关     |
| IdType.AUTO              | 使用数据库的自增策略，注意，该类型请确保数据库设置了id自增， 否则无效 |

![image-20231004212222639](.\img\主键自增.png)

## 25.

**配置全局主键策略：**

```yml
mybatis-plus:
  configuration:
    log-impl: org.apache.ibatis.logging.stdout.StdOutImpl
  # 设置MyBatis-Plus的全局配置
  global-config:
    db-config:
      #设置实体类所对应的表的统一前缀
      table-prefix: t_
      # 设置统一的主键生成策略
      id-type: auto
```

## 26.

**e>雪花算法**

**背景**

需要选择合适的方案去应对数据规模的增长，以应对逐渐增长的访问压力和数据量。 数据库的扩展方式主要包括：业务分库、主从复制（主服务器实现写的功能，从服务器实现读的功能，从而实现读写分离），数据库分表。

#### 数据库分表

将不同业务数据分散存储到不同的数据库服务器，能够支撑百万甚至千万用户规模的业务，但如果业务 继续发展，同一业务的单表数据也会达到单台数据库服务器的处理瓶颈。例如，淘宝的几亿用户数据， 如果全部存放在一台数据库服务器的一张表中，肯定是无法满足性能要求的，此时就需要对单表数据进 行拆分。

单表数据拆分有两种方式：垂直分表和水平分表。示意图如下：

![image-20231004212742363](.\img\雪花算法.png)

#### 垂直分表

垂直分表适合将表中某些不常用且占了大量空间的列拆分出去。

例如，前面示意图中的 nickname 和 description 字段，假设我们是一个婚恋网站，用户在筛选其他用户的时候，主要是用 age 和 sex 两个字段进行查询，而 nickname 和 description 两个字段主要用于展示，一般不会在业务查询中用到。description 本身又比较长，因此我们可以将这两个字段独立到另外一张表中，这样在查询 age 和 sex 时，就能带来一定的性能提升。

#### 水平分表

水平分表适合表行数特别大的表，有的公司要求单表行数超过 5000 万就必须进行分表，这个数字可以作为参考，但并不是绝对标准，关键还是要看表的访问性能。对于一些比较复杂的表，可能超过 1000万就要分表了；而对于一些简单的表，即使存储数据超过 1 亿行，也可以不分表。

但不管怎样，当看到表的数据量达到千万级别时，作为架构师就要警觉起来，因为这很可能是架构的性 能瓶颈或者隐患。

水平分表相比垂直分表，会引入更多的复杂性，例如要求全局唯一的数据id该如何处理

##### 主键自增

①以最常见的用户 ID 为例，可以按照 1000000 的范围大小进行分段，1 ~ 999999 放到表 1中， 1000000 ~ 1999999 放到表2中，以此类推。

②复杂点：分段大小的选取。分段太小会导致切分后子表数量过多，增加维护复杂度；分段太大可能会 导致单表依然存在性能问题，一般建议分段大小在 100 万至 2000 万之间，具体需要根据业务选取合适的分段大小。

③优点：可以随着数据的增加平滑地扩充新的表。例如，现在的用户是 100 万，如果增加到 1000 万， 只需要增加新的表就可以了，原有的数据不需要动。

④缺点：分布不均匀。假如按照 1000 万来进行分表，有可能某个分段实际存储的数据量只有 1 条，而

另外一个分段实际存储的数据量有 1000 万条。

##### 取模

①同样以用户 ID 为例，假如我们一开始就规划了 10 个数据库表，可以简单地用 user_id % 10 的值来表示数据所属的数据库表编号，ID 为 985 的用户放到编号为 5 的子表中，ID 为 10086 的用户放到编号

为 6 的子表中。

②复杂点：初始表数量的确定。表数量太多维护比较麻烦，表数量太少又可能导致单表性能存在问题。

③优点：表分布比较均匀。

④缺点：扩充新的表很麻烦，所有数据都要重分布。

##### 雪花算法

雪花算法是由Twitter公布的分布式主键生成算法，它能够保证不同表的主键的不重复性，以及相同表的主键的有序性（后算出来的id一定比之前雪花算法算出来的id要大）。

并且一般情况是不会重复的。

①核心思想：

长度共64bit（一个long型）。

首先是一个符号位，1bit标识，由于long基本类型在Java中是带符号的，最高位是符号位，正数是0，负数是1，所以id一般是正数，最高位是0。

41bit时间截(毫秒级)，存储的是时间截的差值（当前时间截 - 开始时间截)，结果约等于69.73年。

10bit作为机器的ID（5个bit是数据中心，5个bit的机器ID，可以部署在1024个节点）。

12bit作为毫秒内的流水号（意味着每个节点在每毫秒可以产生 4096 个 ID）。

![image-20231004213217651](.\img\雪花算法2.png)

②优点：整体上按照时间自增排序，并且整个分布式系统内不会产生ID碰撞，并且效率较高。

## 27.

@TableField

> 经过以上的测试，我们可以发现，MyBatis-Plus在执行SQL语句时，要保证实体类中的属性名和表中的字段名一致
>
> 如果实体类中的属性名和字段名不一致的情况，会出现什么问题呢？

### a>情况1

> 若实体类中的属性使用的是驼峰命名风格，而表中的字段使用的是下划线命名风格 例如实体类属性userName，表中字段user_name
>
> 此时MyBatis-Plus会自动将下划线命名风格转化为驼峰命名风格
>
> 相当于在MyBatis中配置

### b>情况2

> 若实体类中的属性和表中的字段不满足情况1 例如实体类属性name，表中字段username
>
> 此时需要在实体类属性上使用@TableField("username")设置属性所对应的字段名

![image-20231004213527862](.\img\TableField.png)

## 28.

@TableLogic

### a>逻辑删除

> 物理删除：真实删除，将对应数据从数据库中删除，之后查询不到此条被删除的数据
>
> 逻辑删除：假删除，将对应数据中代表是否被删除字段的状态修改为“被删除状态”，之后在数据库中仍旧能看到此条数据记录
> 				所以此时逻辑删除并不是删除功能，而是修改功能
>
> 使用场景：可以进行数据恢复

b>实现逻辑删除

> **step1：**数据库中创建逻辑删除状态列，设置默认值为0

![image-20231004213706908](.\img\逻辑删除.png)

> **step2****：**实体类中添加逻辑删除属性

> 如下图，可以看见执行的sql语句是更新的sql语句，并且把is_deleted修改为了1，说明1表示已删除状态。
>
> 并且它还在这里加上了一个条件：`AND is_deleted=0`，即它本身处于未删除的状态

![image-20231004214246449](.\img\@TableLogic.png)

> 再次查询时，已经查不到逻辑删除的数据了，因为它填上了一个条件：`WHERE is_deleted=0`
>
> 所以在使用了MyBatis-Plus之后，不需要手动的将is_deleted修改为1，并且在查询的sql语句添加上条件`WHERE is_deleted=0`

## 29.条件构造器简介

## 1、wapper介绍

![image-20231004214952809](.\img\Wrapper接口.png)

> Wrapper ： 条件构造抽象类，最顶端父类
>
> AbstractWrapper ： 用于查询条件封装，生成 sql 的 where 条件
>
> QueryWrapper ： 查询条件封装	
>
> UpdateWrapper ： Update 条件封装
> UpdateWrapper不仅可以封装修改的条件，还可以封装修改的字段
>
> AbstractLambdaWrapper ：使用Lambda 语法
>
> LambdaQueryWrapper ：用于Lambda语法使用的查询
>
> Wrapper LambdaUpdateWrapper ： Lambda 更新封装Wrapper
>
> 删除跟查询是一样的，用的都是QueryWrapper以及LambdaQueryWrapper

## 30.组装查询条件

QueryWrapper

### a>例1：组装查询条件

```java
@Test
public void test01() {
    //查询用户名包含a，年龄在20-30之间，邮箱信息不为null的用户信息

    //这里面的泛型是和实体类保持一致的
    QueryWrapper<User> queryWrapper = new QueryWrapper<>();
    //PS：这里面写的并不是属性名，而是字段名
    /*queryWrapper.like("name", "a");
        queryWrapper.between("age", 20, 30);
        queryWrapper.isNotNull("email");*/
    //ge：大于等于 le：小于等于
    //链式结构用and链接
    queryWrapper.like("name", "a")
        .between("age", 20, 30)
        .isNotNull("email");
    //查询的前提条件：WHERE is_deleted=0
    //SELECT id,name,age,email,is_deleted FROM t_user WHERE is_deleted=0 AND (name LIKE ? AND age BETWEEN ? AND ? AND email IS NOT NULL)
    List<User> users = userMapper.selectList(queryWrapper);
    users.forEach(System.out::println);
}
```

## 31.**b>例2：组装排序条件**

```java
@Test
public void test02() {
    //按年龄降序查询用户，如果年龄相同则按id升序排列
    QueryWrapper<User> queryWrapper = new QueryWrapper<>();
    queryWrapper.orderByDesc("age")
        .orderByAsc("id");
    List<User> list = userMapper.selectList(queryWrapper);
    list.forEach(System.out::println);
}
```

## 32.**例3：组装删除条件**

> 注意这里不是真正的删除，而是逻辑删除

```java
@Test
public void test03() {
    QueryWrapper<User> queryWrapper = new QueryWrapper<>();
    queryWrapper.isNull("email");
    int result = userMapper.delete(queryWrapper);
    System.out.println("result：" + result);
}
```

## 33.使用QueryWrapper实现修改功能

> 对于修改，有两种用法：
>
> 1. 通过User实体类对象设置修改的内容，通过QueryWrapper来设置修改的条件
> 2. 实体类对象可以设置为null，因为update方法既可以设置修改的条件，也可以设置来修改的字段

![image-20231005104334784](.\img\QueryWrapper实现查询功能.png)

```java
@Test
public void test04() {
    //将（年龄大于20并且用户名中包含有a）或邮箱为null的用户信息修改
    //UPDATE t_user SET age=?, email=? WHERE (username LIKE ? AND age > ? OR email IS NULL)
    QueryWrapper<User> queryWrapper = new QueryWrapper<>();
    queryWrapper.gt("age", 10)
        .like("name", "a")
        .or()
        .isNotNull("email");
    User user = new User();
    user.setName("小明");
    user.setEmail("test@atguigu.com");
    userMapper.update(user, queryWrapper);
}
```

修改语句：

> 因为我们只设置了name和email属性

```sql
UPDATE t_user SET name=?, email=? WHERE is_deleted=0 AND (age > ? AND name LIKE ? OR email IS NOT NULL)
```

## 34.条件的优先级

> consumer：lambda表达式中的消费者接口

![image-20231005110248779](.\img\and方法.png)

```java
@Test
public void test05() {
    //将用户名中包含有a并且（年龄大于20或邮箱为null）的用户信息修改
    //UPDATE t_user SET age=?, email=? WHERE (username LIKE ? AND (age > ? OR email IS NULL))
    QueryWrapper<User> queryWrapper = new QueryWrapper<>();
    //MyBatis-Plus中，and方法或or方法中lambda中的条件优先执行
    //or方法里也有一个consumer，它的功能和and的功能是一样的！
    queryWrapper.like("name", "a")
    .and(i->i.gt("age", 20).or().isNull("email"));
    User user = new User();
    user.setName("小红");
    user.setEmail("test@atguigu.com1");
    int result = userMapper.update(user, queryWrapper);
    System.out.println("result：" + result);
}
```

## 35.组装select子句

> 此方法通过条件构造器都会以map集合的方式获取

![image-20231005111735362](.\img\selectMaps.png)

> 该方法的形参是一个长度可变的字段列表

![image-20231005111940954](.\img\QueryMapper的select方法.png)

> selectMaps()返回Map集合列表，通常配合select()使用，避免User对象中没有被查询到的列值为null

```java
@Test
public void test06() {
    //查询用户的用户名、年龄、邮箱信息
    QueryWrapper<User> queryWrapper = new QueryWrapper<>();
    //通过select方法来设置要查询的字段
    queryWrapper.select("name", "age", "email");
    //此时把条件构造器放在参数的的位置，就可以来获取一个list集合了
    //SELECT name,age,email FROM t_user WHERE is_deleted=0
    List<Map<String, Object>> maps = userMapper.selectMaps(queryWrapper);
    maps.forEach(System.out::println);
}
```

## 36.组装子查询

子查询sql语句：

```sql
select id from t_user where id <= 100;
select * from t_user where id in(select id from t_user where id <= 100);
```

对应的测试方法：

```java
@Test
public void test07() {
    //查询id小于等于100的用户信息
    QueryWrapper<User> queryWrapper = new QueryWrapper<>();
    //column：通过什么来进行判断
    //inValue：当前要比较的数据，这些数据要通过sql语句查出来
    //SELECT id,name,age,email,is_deleted FROM t_user WHERE is_deleted=0 AND (id IN (select id from t_user where id <= 100))
    queryWrapper.inSql("id", "select id from t_user where id <= 100");
    List<User> list = userMapper.selectList(queryWrapper);
    list.forEach(System.out::println);
}
```

## 37.使用UpdateWrapperWrapper实现修改功能

> set方法中可以设置我们要修改的字段以及它所对应的值

![image-20231005113651367](.\img\UpdateWrapper.png)

```java
@Test
public void test08() {
    //将用户名中包含有a并且（年龄大于20或邮箱为null）的用户信息修改
    UpdateWrapper<User> userUpdateWrapper = new UpdateWrapper<>();
    //UPDATE t_user SET name=?,email=? WHERE is_deleted=0 AND (name LIKE ? AND (age > ? OR email IS NULL))
    userUpdateWrapper.like("name", "a")
    .and(i->i.gt("age", 20).or().isNull("email"));
    userUpdateWrapper.set("name", "小黑").set("email", "abc@atguigu.com");
    int result = userMapper.update(null, userUpdateWrapper);
    System.out.println("result：" + result);
}
```

> 修改使用updateWrapper和queryWrapper都可以，但updateWrapper更简单，不需要创建实体类对象了。

## 38.模拟开发中组装条件的情况

> 在真正开发的过程中，组装条件是常见的功能，而这些条件数据来源于用户输入，是可选的，因此我们在组装这些条件时，必须先判断用户是否选择了这些条件，若选择则需要组装该条件，若 没有选择则一定不能组装，以免影响SQL执行的结果

> 判断字符串是否为空，可以使用MyBatisPlus中的StringUtils

```java
@Test
public void test09() {
    String name = "a";
    Integer ageBegin = 20;
    Integer ageEnd = 30;
    //SELECT id,name,age,email,is_deleted FROM t_user WHERE is_deleted=0 AND (name LIKE ? AND age >= ? AND age <= ?)
    QueryWrapper<User> queryWrapper = new QueryWrapper<>();
    if (StringUtils.isNotBlank(name)) {
        //idNotBlank判断某个字符串是否不为空字符串，不为null、不为空白符
        queryWrapper.like("name", name);
    }
    if (ageBegin != null) {
    	queryWrapper.ge("age", ageBegin);
    }
    if (ageEnd != null) {
    	queryWrapper.le("age", ageEnd);
    }
    List<User> list = userMapper.selectList(queryWrapper);
    list.forEach(System.out::println);
}
```

## 39.使用condition组装条件

> condition是布尔类型的条件。如果条件满足，则组装这个条件，如果条件不满足则不组装

![image-20231005123736312](.\img\使用condition组装条件.png)

```java
@Test
public void test10() {
    String name = "a";
    Integer ageBegin = 20;
    Integer ageEnd = 30;
    QueryWrapper<User> queryWrapper = new QueryWrapper<>();
    queryWrapper.like(StringUtils.isNotBlank(name), "name", name)
        .gt(ageBegin != null, "age", ageBegin)
        .le(ageEnd != null, "age", ageEnd);
    //SELECT id,name,age,email,is_deleted FROM t_user WHERE is_deleted=0 AND (name LIKE ? AND age > ? AND age <= ?)
    List<User> list = userMapper.selectList(queryWrapper);
    list.forEach(System.out::println);
}
```

## 40.LambdaQueryWrapper//推荐这个

> QueryWrapper里是String类型的字段名。
>
> LambdaQueryWrapper里面是函数式接口，它的功能就是防止我们把字段名写错，我们通过这个函数就可以访问到实体类中的属性所对应的字段名

![image-20231005124758357](.\img\LambdaQueryWrapper.png)

```java
@Test
public void test11() {
    String name = "a";
    Integer ageBegin = 20;
    Integer ageEnd = 30;
    LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
    queryWrapper.like(StringUtils.isNotBlank(name), User::getName, name)
        .ge(ageBegin != null, User::getAge, ageBegin)
        .le(ageEnd != null, User::getAge, ageEnd);
    List<User> list = userMapper.selectList(queryWrapper);
    list.forEach(System.out::println);
}
```

## 41.LambdaUpdateWrapper

```java
@Test
public void test12() {
    //将用户名中包含有a并且（年龄大于20或邮箱为null）的用户信息修改
    LambdaUpdateWrapper<User> userUpdateWrapper = new LambdaUpdateWrapper<>();
    //UPDATE t_user SET name=?,email=? WHERE is_deleted=0 AND (name LIKE ? AND (age > ? OR email IS NULL))
    userUpdateWrapper.like(User::getName, "a")
        .and(i->i.gt(User::getAge, 20).or().isNull(User::getEmail));
    userUpdateWrapper.set(User::getName, "小黑").set(User::getEmail, "abc@atguigu.com");
    int result = userMapper.update(null, userUpdateWrapper);
    System.out.println("result：" + result);
}
```

## 42MyBatis-Plus分页插件的配置和使用

> MyBatis Plus自带分页插件，只要简单的配置即可实现分页功能

### a>添加配置类

```java
@Configuration
//有了配置类之后，建议直接添加到配置类上
@MapperScan("com.atguigu.mybatisplusdemo1.mapper")
public class MyBatisPlusConfig {
    @Bean
    //之所以叫做Interceptor拦截器，是因为先写了查询功能，然后它会对我们的查询功能进行拦截，然后在我们实现功能的基础上进行一些额外的操作，以达到最终的功能
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        //需要在插件对象中添加一个内部插件
        //由于不同的数据库实现的分页功能是不一样的，所以需要在这里设置数据库的类型
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
        return interceptor;
    }
}
```

**b>测试**

> selectPage方法是用来查询分页数据的
>
> Page：分页对象
>
> Wrapper：条件构造器

![image-20231005131807202](.\img\selectPage.png)

> current：当前页的页码（当前页-1）* 每页的条数
>
> size：每页现实的的条数
>
> limit如果访问的是第一页的话，只需要显示每页显示的条数。

![image-20231005132024587](.\img\image-20231005132024587.png)

```java
@Test
public void testPage() {
    Page<User> page = new Page<>(1, 3);
    userMapper.selectPage(page, null);
    //查询出来的数据就是储存在page里！
    System.out.println(page);
}
```

## 43.分页相关数据获取

```java
@Test
public void testPage() {
    Page<User> page = new Page<>(1, 3);
    userMapper.selectPage(page, null);
    System.out.println("获取当前页的数据：" + page.getRecords());
    System.out.println("获取当前页的页面：" + page.getCurrent());
    System.out.println("获取当前页显示的条数：" + page.getSize());
    System.out.println("获取总页数：" + page.getPages());
    System.out.println("获取总记录数：" + page.getTotal());
    System.out.println("获取有没有下一页：" + page.hasNext());
    System.out.println("判断是否有上一页：" + page.hasPrevious());
}
```

## 44.自定义分页功能

> 在我们自定义的查询语句中实现分页功能
>
> 我们自定义的查询方法可以参考上面selectPage方法

> 如果需要通过类型别名来访问某一个类型的话，需要在yml文件中进行一个简单的配置

```yml
mybatis-plus:
  # 配置类型别名所对应的包
  type-aliases-package: com.atguigu.mybatisplusdemo1.pojo
```

UserMapper接口：

```java
/**
     * 根据年龄查询用户信息并分页
     * @param page：MyBatis-Plus所提供的分页对象，必须位于第一个参数的位置
     *            在自己的sql语句中，实现分页功能，则这个方法的第一个参数就必须是这个page对象！
     * @param age
     * @return
     */
Page<User> selectPageVo(@Param("page") Page<User> page, @Param("age") Integer age);
```

UserMapper.xml：

```xml
<!--Page<User> selectPageVo(@Param("page") Page<User> page, @Param("age") Integer age);-->
<!--由于我们是通过分页插件实现分页功能，所以我们自己不需要写分页功能-->
<select id="selectPageVo" resultType="User">
    select id, name, age, email from t_user where age >  #{age}
</select>
```

Test：

``` java
@Test
public void testPageVo() {
    Page<User> page = new Page<>(1, 3);
    userMapper.selectPageVo(page, 20);
    //查询出来的数据同样是封装在page里面的
    System.out.println("获取当前页的数据：" + page.getRecords());
    System.out.println("获取当前页的页面：" + page.getCurrent());
    System.out.println("获取当前页显示的条数：" + page.getSize());
    System.out.println("获取总页数：" + page.getPages());
    System.out.println("获取总记录数：" + page.getTotal());
    System.out.println("获取有没有下一页：" + page.hasNext());
    System.out.println("判断是否有上一页：" + page.hasPrevious());
}
```

## 45.乐观锁和悲观锁

### a>场景

> ### a>场景
>
> 一件商品，成本价是80元，售价是100元。老板先是通知小李，说你去把商品价格增加50元。小李正在玩游戏，耽搁了一个小时。正好一个小时后，老板觉得商品价格增加到150元，价格太高，可能会影响销量。又通知小王，你把商品价格降低30元。
>
> 此时，小李和小王同时操作商品后台系统。小李操作的时候，系统先取出商品价格100元；小王 也在操作，取出的商品价格也是100元。小李将价格加了50元，并将100+50=150元存入了数据库；小王将商品减了30元，并将100-30=70元存入了数据库。是的，如果没有锁，小李的操作就完全被小王的覆盖了。
>
> 现在商品价格是70元，比成本价低10元。几分钟后，这个商品很快出售了1千多件商品，老板亏1万多。

### b>乐观锁与悲观锁

> 上面的故事，如果是乐观锁，小王保存价格前，会检查下价格是否被人修改过了。如果被修改过 了，则重新取出的被修改后的价格，150元，这样他会将120元存入数据库。
>
> 如果是悲观锁，小李取出数据后，小王只能等小李操作完之后，才能对价格进行操作，也会保证 最终的价格是120元

## 46.**c>模拟修改冲突**

#### 数据库中增加商品表

``` mysql
CREATE TABLE t_product (
id BIGINT(20) NOT NULL COMMENT '主键ID',
NAME VARCHAR(30) NULL DEFAULT NULL COMMENT '商品名称', price INT(11) DEFAULT 0 COMMENT '价格',
VERSION INT(11) DEFAULT 0 COMMENT '乐观锁版本号', PRIMARY KEY (id)
);
```

**添加数据**

``` mysql
INSERT INTO t_product (id, NAME, price) VALUES (1, '外星人笔记本', 100);
```

**添加实体**

``` java
import lombok.Data;

@Data
public class Product {
    private Long id;
    private String name;
    private Integer price;
    private Integer version;
}
```

**添加mapper**

``` java
public interface ProductMapper extends BaseMapper<Product> {
}
```

测试

> 更新有两种方法：
>
> 这里直接使用updateById即可，里面传入小李查询出来的实体类对象。
>
> ![image-20231005154551775](.\img\BaseMapper的updateById.png)

``` java
@Test
public void testConcurrentUpdate() {

//1、小李
Product p1 = productMapper.selectById(1L); System.out.println("小李取出的价格：" + p1.getPrice());

//2、小王
Product p2 = productMapper.selectById(1L); System.out.println("小王取出的价格：" + p2.getPrice());
//3、小李将价格加了50元，存入了数据库
p1.setPrice(p1.getPrice() + 50);
int result1 = productMapper.updateById(p1); System.out.println("小李修改结果：" + result1);

//4、小王将商品减了30元，存入了数据库
p2.setPrice(p2.getPrice() - 30);
int result2 = productMapper.updateById(p2);
System.out.println("小王修改结果：" + result2);

//最后的结果
Product p3 = productMapper.selectById(1L);
// 价 格 覆 盖 ， 最 后 的 结 果 ：70 
    System.out.println("最后的结果：" + p3.getPrice());

```

> 此时就会发现，小王的操作将小李的操作覆盖了！
>
> ![image-20231005155032868](.\img\无锁.png)

## 47.**d>乐观锁实现流程**

> 数据库中添加version字段
>
> 取出记录时，获取当前version
>
> ``` mysql
> SELECT id,`name`,price,`version` FROM product WHERE id=1
> ```
>
> 更新时，version + 1，如果where语句中的version版本不对，则更新失败
>
> ``` mysql
> UPDATE product SET price=price+50, `version`=`version` + 1 WHERE id=1 AND
> `version`=1
> ```

### e>Mybatis-Plus实现乐观锁

#### 修改实体类

``` java
import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;

@Data
public class Product {
    private Long id;
    private String name;
    private Integer price;
    @Version//标识乐观锁版本号字段
    private Integer version;
}
```

**添加乐观锁插件配置**

``` java
@Configuration
//有了配置类之后，建议直接添加到配置类上
@MapperScan("com.atguigu.mybatisplusdemo1.mapper")
public class MyBatisPlusConfig {
    @Bean
    //之所以叫做Interceptor拦截器，是因为先写了查询功能，然后它会对我们的查询功能进行拦截，然后在我们实现功能的基础上进行一些额外的操作，以达到最终的功能
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        //需要在插件对象中添加一个内部插件
        //由于不同的数据库实现的分页功能是不一样的，所以需要在这里设置数据库的类型
        //添加分页插件
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
        //添加乐观锁插件
        interceptor.addInnerInterceptor(new OptimisticLockerInnerInterceptor());
        return interceptor;
    }
}
```

**测试修改冲突**

> 小李查询商品信息：
>
> SELECT id,name,price,version FROM t_product WHERE id=?
>
> 小王查询商品信息：
>
> SELECT id,name,price,version FROM t_product WHERE id=?
>
> 小李修改商品价格，自动将version+1
>
> UPDATE t_product SET name=?, price=?, version=? WHERE id=? AND version=? Parameters: 外星人笔记本(String), 150(Integer), 1(Integer), 1(Long), 0(Integer) 小王修改商品价格，此时version已更新，条件不成立，修改失败
>
> UPDATE t_product SET name=?, price=?, version=? WHERE id=? AND version=?
>
> Parameters: 外星人笔记本(String), 70(Integer), 1(Integer), 1(Long), 0(Integer)
>
> 最终，小王修改失败，查询价格：150
>
> SELECT id,name,price,version FROM t_product WHERE id=?

## 48.优化流程

``` java
@Test
public void testProduct01() {
    //小李查询商品价格
    Product productLi = productMapper.selectById(1);
    System.out.println("小李查询的商品价格：" + productLi.getPrice());
    //小王查询商品价格
    Product productWang = productMapper.selectById(1);
    System.out.println("小李查询的商品价格：" + productWang.getPrice());
    //小李将价格+50
    productLi.setPrice(productLi.getPrice() + 50);
    productMapper.updateById(productLi);
    //小王将商品价格-30
    productWang.setPrice(productWang.getPrice() - 30);
    int result = productMapper.updateById(productWang);
    /**修改的地方
        if (result == 0) {
            //操作失败，重试
            //小王查询商品价格
            Product productNew = productMapper.selectById(1);
            productNew.setPrice(productNew.getPrice() - 30);
            productMapper.updateById(productNew);
        }
        **/

    Product productLaoban = productMapper.selectById(1);
    System.out.println("老板查询的商品价格：" + productLaoban.getPrice());
}
```

## 49.**七、通用枚举**

> 表中的有些字段值是固定的，例如性别（男或女），此时我们可以使用MyBatis-Plus的通用枚举来实现

## a>数据库表添加字段sex

> 注意这里是int类型的

![image-20231005161524547](.\img\添加字段sex.png)

**b>创建通用枚举类型**

> 创建enums包，并在此包下创建SexEnum枚举对象：

``` java
import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.Getter;

@Getter
public enum SexEnum {
    MALE(1, "男"),
    FEMALE(2, "女");

    @EnumValue //将注解所标识的属性的值存储到数据库中
    private Integer sex;
    private String sexName;

    SexEnum() {
    }

    SexEnum(Integer sex, String sexName) {
        this.sex = sex;
        this.sexName = sexName;
    }
}
```

**c>配置扫描通用枚举**

``` yml
mybatis-plus:
  # 扫描通用枚举的包
  type-enums-package: com.atguigu.mybatisplusdemo1.enums
```

**d>测试**

Test类：

``` java
@Test
public void test() {
    User user = new User();
    user.setName("admin");
    user.setAge(33);
    user.setSex(SexEnum.MALE);
    //注意，此时这里会直接报错，因为它是把枚举的name存到了数据库中！
    //Cause: java.sql.SQLException: Incorrect integer value: 'MALE' for column 'sex' at row 1
    int result = userMapper.insert(user);
    System.out.println("result： " + result);
}
```

## 50.**八、代码生成器**

**1、引入依赖**

``` xml
<dependency>
    <groupId>com.baomidou</groupId>
    <artifactId>mybatis-plus-generator</artifactId>
    <version>3.5.1</version>
</dependency>
<dependency>
    <groupId>org.freemarker</groupId>
    <artifactId>freemarker</artifactId>
    <version>2.3.31</version>
</dependency>
```

**2****、快速生成**

```java
FastAutoGenerator.create("jdbc:mysql://localhost:3306/mybatis_plus? serverTimezone=GMT%2B8&characterEncoding=utf-8&useSSL=false", "root", "123456")
                .globalConfig(builder -> {
                    builder.author("atguigu") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("F://BaiduSyncdisk/other/MyBatisPlus/MyBatisPlus-demo1"); // 指定输出目录，不能有空格！
                })
                .packageConfig(builder -> {
                    builder.parent("com.atguigu") // 设置父包名
                            .moduleName("MyBatisPlus-demo1") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml, "F://BaiduSyncdisk/other/MyBatisPlus/MyBatisPlus-demo1")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("t_user") // 设置需要生成的表名
                            .addTablePrefix("t_", "c_"); // 设置过滤表前缀，可以设置多个
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
```

## 51.**九、多数据源**

> 适用于多种场景：纯粹多库、 读写分离、 一主多从、 混合模式等目前我们就来模拟一个纯粹多库的一个场景，其他场景类似
>
> 场景说明：
>
> 我们创建两个库，分别为：mybatis_plus（以前的库不动）与mybatis_plus_1（新建），将
>
> mybatis_plus库的product表移动到mybatis_plus_1库，这样每个库一张表，通过一个测试用例分别获取用户数据与商品数据，如果获取到说明多库模拟成功

## 1、创建数据库及表

>  创建数据库mybatis_plus_1和表product

``` mysql
CREATE DATABASE `mybatis_plus_1` /*!40100 DEFAULT CHARACTER SET utf8mb4 */; 
use `mybatis_plus_1`;
CREATE TABLE product (
id BIGINT(20) NOT NULL COMMENT '主键ID',
name VARCHAR(30) NULL DEFAULT NULL COMMENT '商品名称', price INT(11) DEFAULT 0 COMMENT '价格',
version INT(11) DEFAULT 0 COMMENT '乐观锁版本号', PRIMARY KEY (id)
);
```

```mysql
INSERT INTO product (id, NAME, price) VALUES (1, '外星人笔记本', 100);
```

> 删除mybatis_plus库product表

```mysql
use mybatis_plus;
DROP TABLE IF EXISTS product;
```

## 2、引入依赖

```xml
<dependency>
    <groupId>com.baomidou</groupId>
    <artifactId>dynamic-datasource-spring-boot-starter</artifactId>
    <version>3.5.0</version>
</dependency>
```

## 52.**3、配置多数据源**

> 说明：注释掉之前的数据库连接，添加新配置

``` yml
spring:
# 配置数据源信息
datasource:
  dynamic:
  # 设置默认的数据源或者数据源组,默认值即为master，这里的名字和底下的名字是一致的
  primary: master
  # 严格匹配数据源,默认false.true未匹配到指定数据源时抛异常,false使用默认数据源
  strict: false
  datasource:
    master:
      url: jdbc:mysql://localhost:3306/mybatis_plus?characterEncoding=utf-8&useSSL=false
      driver-class-name: com.mysql.cj.jdbc.Driver
      username: root
      password: 123456
      # 从数据源
      slave_1:
        url: jdbc:mysql://localhost:3306/mybatis_plus_1?characterEncoding=utf- 8&useSSL=false
        driver-class-name: com.mysql.cj.jdbc.Driver 
        username: root
        password: 123456
```

## 4、创建用户service

```java
public interface UserService extends IService<User> {
}
@DS("master") //指定所操作的数据源@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
```

**5、创建商品service**

```java
public interface ProductService extends IService<Product> {
}

@DS("slave_1") @Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {
}
```

**6、测试**

```java
@Autowired
private UserService userService; @Autowired
private ProductService productService;

@Test
public void testDynamicDataSource(){ System.out.println(userService.getById(1L)); System.out.println(productService.getById(1L));
}
```

> 结果：
>
> 1、都能顺利获取对象，则测试成功
>
> 2、如果我们实现读写分离，将写操作方法加上主库数据源，读操作方法加上从库数据源，自动切 换，是不是就能实现读写分离



**@DS** 可以注解在方法上或类上，**同时存在就近原则 方法上注解 优先于 类上注解**。

|     注解      |                   结果                   |
| :-----------: | :--------------------------------------: |
|    没有@DS    |                默认数据源                |
| @DS("dsName") | dsName可以为组名也可以为具体某个库的名称 |

## 54.十、MyBatisX插件

> MyBatis-Plus为我们提供了强大的mapper和service模板，能够大大的提高开发效率
>
> 但是在真正开发过程中，MyBatis-Plus并不能为我们解决所有问题，例如一些复杂的SQL，多表  联查，我们就需要自己去编写代码和SQL语句，我们该如何快速的解决这个问题呢，这个时候可以使用MyBatisX插件
>
> MyBatisX一款基于 IDEA 的快速开发插件，为效率而生。

MyBatisX插件用法：https://baomidou.com/pages/ba5b24/