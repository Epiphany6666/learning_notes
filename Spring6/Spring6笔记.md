# Spring6

## 2.Spring是什么?

- Spring 是一款主流的 Java EE 轻量级开源框架 ，Spring 由“Spring 之父”Rod Johnson 提出并创立，**其目的是用于简化 Java 企业级应用的开发难度和开发周期**。Spring的用途不仅限于服务器端的开发。从简单性、可测试性和松耦合的角度而言，任何Java应用都可以从Spring中受益。Spring 框架除了自己提供功能外，还提供整合其他技术和框架的能力。

  > 1. 框架可以理解为：是一个程序的半成品，它帮我们实现了一部分功能
  > 2. 开源：开放源代码
  > 3. 轻量级：
  >    - 它的体积很小
  >    - 不需要依赖于其他的组件就能进行使用

- Spring 自诞生以来备受青睐，一直被广大开发人员作为 Java 企业级应用程序开发的首选。时至今日，Spring 俨然成为了 Java EE 代名词，成为了构建 Java EE 应用的事实标准。

- 自 2004 年 4 月，Spring 1.0 版本正式发布以来，Spring 已经步入到了第 6 个大版本，也就是 Spring 6。本课程采用Spring当前最新发布的正式版本**6.0.2**。

## 3.Spring的划分方式 - 狭义和广义

- 在不同的语境中，Spring 所代表的含义是不同的。下面我们就分别从“广义”和“狭义”两个角度，对 Spring 进行介绍。

1. **广义的 Spring：Spring 技术栈**

   广义上的 Spring 泛指以 Spring Framework 为核心的 Spring 技术栈。
   经过十多年的发展，Spring 已经不再是一个单纯的应用框架，而是逐渐发展成为一个由多个不同子项目（模块）组成的成熟技术，例如 Spring Framework、Spring MVC、SpringBoot、Spring Cloud、Spring Data、Spring Security 等，其中 **Spring Framework** 是其他子项目的基础。

   这些子项目涵盖了从企业级应用开发到云计算等各方面的内容，能够帮助开发人员解决软件发展过程中不断产生的各种实际问题，给开发人员带来了更好的开发体验。

2. **狭义的 Spring：Spring Framework**（一般都是狭义划分）

   狭义的 Spring 特指 Spring Framework，通常我们将它称为 Spring 框架。

   Spring 框架是一个分层的、面向切面的 Java 应用程序的一站式轻量级解决方案，它是 Spring 技术栈的核心和基础，是为了解决企业级应用开发的复杂性而创建的。

   Spring 有两个最核心模块： IoC 和 AOP。

   **IoC**：Inverse of Control 的简写，译为“控制反转”，指把创建对象过程交给 Spring 进行管理。

   **AOP**：（很少改变源代码，可以增加一个功能）
   Aspect Oriented Programming 的简写，译为“面向切面编程”。AOP 用来封装多个类的公共行为，将那些与业务无关，却为业务模块所共同调用的逻辑封装起来，减少系统的重复代码，降低模块间的耦合度。另外，AOP 还解决一些系统层面上的问题，比如日志、事务、权限等。

## 4.SpringFramework特点

- 非侵入式：使用 Spring Framework 开发应用程序时，Spring 对应用程序本身的结构影响非常小。对领域模型可以做到**零污染**；对功能性组件也**只需要使用几个简单的注解进行标记**，完全不会破坏原有结构，反而能将组件结构进一步简化。这就使得基于 Spring Framework 开发应用程序时结构清晰、简洁优雅。
- 控制反转：IoC——Inversion of Control，翻转资源获取方向。把自己创建资源、向环境索取资源变成环境将资源准备好，我们享受资源注入。
- 面向切面编程：AOP——Aspect Oriented Programming，在不修改源代码的基础上增强代码功能。
- 容器：Spring IoC 是一个容器，因为它包含并且管理组件对象的生命周期（从创建到销毁的过程）。组件享受到了容器化的管理，替程序员屏蔽了组件创建过程中的大量细节，极大的降低了使用门槛，大幅度提高了开发效率。
- 组件化：Spring 实现了使用简单的组件配置组合成一个复杂的应用。在 Spring 中可以使用 XML 和 Java 注解组合这些对象。这使得我们可以基于一个个功能明确、边界清晰的组件有条不紊的搭建超大型复杂应用系统。
- 一站式：在 IoC 和 AOP 的基础上可以整合各种企业应用的开源框架和优秀的第三方类库。而且 Spring 旗下的项目已经覆盖了广泛领域，很多方面的功能性需求可以在 Spring Framework 的基础上全部使用 Spring 来实现。


## 5.Spring模块组成和版本要求

官网地址：https://spring.io/

<img src="img\image-20221207142746771.png" alt="img" style="zoom: 50%;" />

<img src="img\2097896352.png" alt="img" style="zoom: 80%;" />

上图中包含了 Spring 框架的所有模块，这些模块可以满足一切企业级应用开发的需求，在开发过程中可以根据需求有选择性地使用所需要的模块。下面分别对这些模块的作用进行简单介绍。

**①Spring Core（核心容器）**

spring core提供了IOC,DI,Bean配置装载创建的核心实现。核心概念： Beans、BeanFactory、BeanDefinitions、ApplicationContext。

- spring-core ：IOC和DI的基本实现

- spring-beans：BeanFactory和Bean的装配管理(BeanFactory)
- spring-context：Spring context上下文，即IOC容器(AppliactionContext)
- spring-expression：spring表达式语言

**②Spring AOP**

- spring-aop：面向切面编程的应用模块，整合ASM，CGLib，JDK Proxy
- spring-aspects：集成AspectJ，AOP应用框架
- spring-instrument：动态Class Loading模块

**③Spring Data Access**

- spring-jdbc：spring对JDBC的封装，用于简化jdbc操作
- spring-orm：java对象与数据库数据的映射框架
- spring-oxm：对象与xml文件的映射框架
- spring-jms： Spring对Java Message Service(java消息服务)的封装，用于服务之间相互通信
- spring-tx：spring jdbc事务管理

**④Spring Web**

- spring-web：最基础的web支持，建立于spring-context之上，通过servlet或listener来初始化IOC容器
- spring-webmvc：实现web mvc
- spring-websocket：与前端的全双工通信协议
- spring-webflux：Spring 5.0提供的，用于取代传统java servlet，非阻塞式Reactive Web框架，异步，非阻塞，事件驱动的服务

**⑤Spring Message**

- Spring-messaging：spring 4.0提供的，为Spring集成一些基础的报文传送服务

**⑥Spring test**

- spring-test：集成测试支持，主要是对junit的封装

#### 1.5.1、版本要求

**（1）Spring6要求JDK最低版本是JDK17**

#### 1.5.2、本课程软件版本

（1）IDEA开发工具：2022.1.2

（2）JDK：Java17**（Spring6要求JDK最低版本是Java17）**

（3）Spring：6.0.2

## 7.入门案例实现步骤

**构建父模块spring6**
在idea中，依次单击 File -> New -> Project -> New Project

![img](img\image-20221205201741893.png)

点击“Create”
![img](img\image-20221205202000198.png)

父工程不需要写代码，所以删除src目录

###### 构建子模块spring6-first

![img](img\image-20221205202117383.png)

点击 Create 完成
![img](img\image-20221205202154225.png)



###### 引入依赖

https://spring.io/projects/spring-framework#learn

```xml
<dependencies>
    <!--spring context依赖-->
    <!--当你引入Spring Context依赖之后，表示将Spring的基础依赖引入了-->
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-context</artifactId>
        <version>6.0.2</version>
    </dependency>

    <!--junit5测试-->
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-api</artifactId>
        <version>5.3.1</version>
    </dependency>
</dependencies>
```

###### 查看依赖

![img](img\image-20221201105416558.png)

###### 创建java类

```java
package com.atguigu.spring6;

public class User {
    public void add() {
        System.out.println("add...");
    }
}
```

###### 创建配置文件

在resources目录创建一个 Spring 配置文件 beans.xml（配置文件名称可随意命名，如：bean.xm）
![img](img\img007.png)

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    <!-- 这是它的一个约束，规定这里面能写什么标签，标签中能写什么属性 -->
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

    <!-- 完成User对象创建
		配置User所对应的bean，即将User的对象交给Spring的IOC容器管理
        通过bean标签配置IOC容器所管理的bean
            id属性：唯一标识，这个名字可以随便起，但一般都是用类的首字母小写起名
            class属性：要创建对象所在类的全类名（包名称＋类名称)
    -->
    <bean id="user" class="com.atguigu.spring6.User"></bean>
</beans>
```

###### 创建测试类测试

```java
package com.atguigu.spring6;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    @Test
    public void testUserObject() {
        //加载spring配置文件，对象创建
        //在spring中，给我们封装了一个对象，叫：ApplicationContext 应用的上下文
        //然后用它new个ClassPathXmlApplicationContext对象，类路径下的xml文件，加上文件名称
        //此时就会进行对象的创建，按照配置完成
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");//如果是在类路径下的话，直接写文件名即可。

        //获取创建的对象，context中有个方法，叫：getBean，在里面加上id的属性值
        //这里创建之后，默认是Object对象，这里给它强转为了User对象
        User user = (User)context.getBean("user");
        //为了测试方便，这里对User进行了一个输出
        System.out.println("1" + user);//输出的是对象的地址

        //使用对象调用方法进行测试
        System.out.print("2:");
        user.add();
    }
}
```

## 08.入门案例程序分析

**1.底层是怎么创建对象的，是通过反射机制调用无参数构造方法吗？**
修改User类：

```java
package com.atguigu.spring6;

public class User {
    public User() {
        System.out.println("无参数构造方法执行");
    }

    public void add() {
        System.out.println("add...");
    }
}
```

测试得知：**创建对象时确实调用了无参数构造方法。**

**2.Spring是如何创建对象的呢？原理是什么？**

> 1. 加载bean.xml配置文件
>
> 2. 对xml文件进行解析操作
>
> 3. 获取xml文件bean标签属性值：id属性值和class属性值
>
> 4. 使用反射根据类全路径创建对象
>
>    ```java
>    @Test
>        public void testUserObject1() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
>            //获取Class对象
>            Class clazz = Class.forName("com.atguigu.spring6.User");
>           1. Constructor constructor = clazz.getDeclaredConstructor(String.class);
>            constructor.setAccessible(true);
>            User user = (User)constructor.newInstance("就解决");
>    
>           2. User user = (User)clazz.getConstructor(String.class).newInstance("dfaj");
>            System.out.println(user);
>        }
>    ```
>

**3. 把创建好的对象存储到一个什么样的数据结构当中了呢？**

bean对象最终存储在spring容器中，在spring源码底层就是一个map集合，存储bean的map在**DefaultListableBeanFactory**类中：

> 1. `DefaultListableBeanFactory`里有属性：
>
>    ```java
>    private final Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>(256);
>    ```
>
>    创建完后，把对象放到了Map集合中
>
>    - key（String）：唯一标识
>    - value（BeanDefinition）：类的定义（描述信息）
>
> 2. Spring容器加载到Bean类时 , 会把这个类的描述信息, 以包名加类名的方式存到beanDefinitionMap 中,
>    Map<String,BeanDefinition> , 其中 String是Key , 默认是类名首字母小写 , BeanDefinition , 存的是类的定义(描述信息) , 我们通常叫BeanDefinition接口为 : bean的定义对象。

## 09.启用Log4j2日志框架

在项目开发中，日志十分的重要，不管是记录运行情况还是定位线上问题，都离不开对日志的分析。日志记录了系统行为的时间、地点、状态等相关信息，能够帮助我们了解并监控系统状态，在发生错误或者接近某种危险状态时能够及时提醒我们处理，同时在系统产生问题时，能够帮助我们快速的定位、诊断并解决问题。

**Apache Log4j2**是一个开源的日志记录组件，使用非常的广泛。在工程中以易用方便代替了 System.out 等打印语句，它是JAVA下最流行的日志输入工具。 

**Log4j2主要由几个重要的组件构成：**

**（1）日志信息的优先级**，日志信息的优先级从高到低有**TRACE < DEBUG < INFO < WARN < ERROR < FATAL**
                TRACE：追踪，是最低的日志级别，相当于追踪程序的执行
                DEBUG：调试，一般在开发中，都将其设置为最低的日志级别
                INFO：信息，输出重要的信息，使用较多
                WARN：警告，输出警告的信息
                ERROR：错误，输出错误信息
                FATAL：严重错误

这些级别分别用来指定这条日志信息的重要程度；级别高的会自动屏蔽级别低的日志，也就是说，设置了WARN的日志，则INFO、DEBUG的日志级别的日志不会显示，但级别比它高的依旧会显示

**（2）日志信息的输出目的地**，日志信息的输出目的地指定了日志将打印到**控制台**还是**文件中**；

**（3）日志信息的输出格式**，而输出格式则控制了日志信息的显示内容。

## 10.整合Log4j2日志框架（下）

1. 引入Log4j2依赖

   ```xml
   <!--log4j2的依赖-->
   <dependency>
       <groupId>org.apache.logging.log4j</groupId>
       <artifactId>log4j-core</artifactId>
       <version>2.19.0</version>
   </dependency>
   <dependency>
       <groupId>org.apache.logging.log4j</groupId>
       <artifactId>log4j-slf4j2-impl</artifactId>
       <version>2.19.0</version>
   </dependency>
   ```

2. 加入日志配置文件

   在类的根路径下提供log4j2.xml配置文件（文件名固定为：log4j2.xml，文件必须放到类根路径下。这里建在Resources路径下创建）

   ```xml
   <?xml version="1.0" encoding="UTF-8"?>
   <configuration>//根标签
       <loggers>
           <!--
               level指定日志级别，从低到高的优先级：
                   TRACE < DEBUG < INFO < WARN < ERROR < FATAL
                   trace：追踪，是最低的日志级别，相当于追踪程序的执行
                   debug：调试，一般在开发中，都将其设置为最低的日志级别
                   info：信息，输出重要的信息，使用较多
                   warn：警告，输出警告的信息
                   error：错误，输出错误信息
                   fatal：严重错误
           -->
           <root level="DEBUG">//当前日志的级别
               //输出的相关信息
               //ref：引入，引用
               <appender-ref ref="spring6log"/>//对应到底下appenders标签里面查看
               <appender-ref ref="RollingFile"/>
               <appender-ref ref="log"/>
           </root>
       </loggers>
   
       <appenders>//输出的目的地和格式
           <!--输出日志信息到控制台-->
           <console name="spring6log" target="SYSTEM_OUT">//在控制台进行输出
               <!--控制日志输出的格式-->
               <PatternLayout pattern="%d{yyyy-MM-dd HH:mm:ss SSS} [%t] %-3level %logger{1024} - %msg%n"/>
           </console>
   
           <!--文件会打印出所有信息，这个log每次运行程序会自动清空，由append属性决定，适合临时测试用-->
           <File name="log" fileName="D:/develop/spring6_log/test.log" append="false">//表示在文件中输出，这里要注意输出的位置,spring6_log/test.log会自动给我们创建，但盘符要写对
               <PatternLayout pattern="%d{HH:mm:ss.SSS} %-5level %class{36} %L %M - %msg%xEx%n"/>//格式
           </File>
   
           <!-- 这个会打印出所有的信息，
               每次大小超过size，
               则这size大小的日志会自动存入按年份-月份建立的文件夹下面并进行压缩，
               作为存档-->
           <RollingFile name="RollingFile" fileName="d:/spring6_log/app.log"
                        filePattern="log/$${date:yyyy-MM}/app-%d{MM-dd-yyyy}-%i.log.gz">
               <PatternLayout pattern="%d{yyyy-MM-dd 'at' HH:mm:ss z} %-5level %class{36} %L %M - %msg%xEx%n"/>
               <SizeBasedTriggeringPolicy size="50MB"/>
               <!-- DefaultRolloverStrategy属性如不设置，
               则默认为最多同一文件夹下7个文件，这里设置了20 -->
               <DefaultRolloverStrategy max="20"/>
           </RollingFile>
       </appenders>
</configuration>
   ```
   
   无笔记的：
   
   ```xml
   <?xml version="1.0" encoding="UTF-8"?>
   <configuration>
       <loggers>
           <!--
               level指定日志级别，从低到高的优先级：
                   TRACE < DEBUG < INFO < WARN < ERROR < FATAL
                   trace：追踪，是最低的日志级别，相当于追踪程序的执行
                   debug：调试，一般在开发中，都将其设置为最低的日志级别
                   info：信息，输出重要的信息，使用较多
                   warn：警告，输出警告的信息
                   error：错误，输出错误信息
                   fatal：严重错误
           -->
           <root level="DEBUG">
               <appender-ref ref="spring6log"/>
               <appender-ref ref="RollingFile"/>
               <appender-ref ref="log"/>
           </root>
       </loggers>
   
       <appenders>
           <!--输出日志信息到控制台-->
           <console name="spring6log" target="SYSTEM_OUT">
               <!--控制日志输出的格式-->
               <PatternLayout pattern="%d{yyyy-MM-dd HH:mm:ss SSS} [%t] %-3level %logger{1024} - %msg%n"/>
           </console>
   
           <!--文件会打印出所有信息，这个log每次运行程序会自动清空，由append属性决定，适合临时测试用-->
           <File name="log" fileName="d:/spring6_log/test.log" append="false">
               <PatternLayout pattern="%d{HH:mm:ss.SSS} %-5level %class{36} %L %M - %msg%xEx%n"/>
           </File>
   
           <!-- 这个会打印出所有的信息，
               每次大小超过size，
               则这size大小的日志会自动存入按年份-月份建立的文件夹下面并进行压缩，
               作为存档-->
           <RollingFile name="RollingFile" fileName="d:/spring6_log/app.log"
                        filePattern="log/$${date:yyyy-MM}/app-%d{MM-dd-yyyy}-%i.log.gz">
               <PatternLayout pattern="%d{yyyy-MM-dd 'at' HH:mm:ss z} %-5level %class{36} %L %M - %msg%xEx%n"/>
               <SizeBasedTriggeringPolicy size="50MB"/>
               <!-- DefaultRolloverStrategy属性如不设置，
               则默认为最多同一文件夹下7个文件，这里设置了20 -->
               <DefaultRolloverStrategy max="20"/>
           </RollingFile>
       </appenders>
   </configuration>
   ```
   
   测试 - 运行原测试程序
   
   ![img](img/image-20221031214305224.png)
   
   运行原测试程序，多了spring打印日志
   
3. ### 使用日志

   1.创建Logger对象

   ```java
   private Logger logger = LoggerFactory.getLogger(TestUser.class);
   ```

   注意不要导错包了！
   ![img](G:\others\Spring6\img\导包.png)

   2. 在Test类中调用其方法

      ```java
      //手动写日志
      logger.info("### 执行调用成功了...");
      ```

## 11.容器：IoC-概述（上)

IoC 是 Inversion of Control 的简写，译为“控制反转”，它不是一门技术，而是一种设计思想，是一个重要的面向对象编程法则，能够指导我们如何设计出松耦合、更优良的程序。

Spring 通过 **IoC 容器**来**管理所有 Java 对象的实例化和初始化，控制对象与对象之间的依赖关系**（eg：A对象要依赖B对象，那A里面应该实例化一个B对象，但这里会交给Spring进行管理！）。我们将由 IoC 容器管理的 Java 对象称为 Spring **Bean**（只是为了和Java中的对象做一个名字上的区别），它与使用关键字 new 创建的 Java 对象没有任何区别。

对象的创建和销毁的过程，都是经过容器进行管理的

- 其中所使用的结构是：map集合
  因为map的特点是：key-value，放和取都很简单。

- 控制反转（IoC）
  - 控制反转是一种思想。
  - 控制反转是为了降低程序耦合度，提高程序扩展力。
  - 控制反转，反转的是什么？

  - - 将对象的创建权利交出去，交给第三方容器负责。
    - 将对象和对象之间关系的维护权交出去，交给第三方容器负责。

  - 控制反转这种思想如何实现呢？

  - - DI（Dependency Injection）：依赖注入

## 12.容器：IoC-概述（中)

#### IoC基本过程：

首先明确：IoC容器里，存放的是一个bean对象，而它所使用的的结构是map集合

1. xml配置文件：配置类的描述信息，另一种方式是：基于注解管理的bean
   Bean定义信息：BeanDefinition（在配置文件中配置好，我想要什么样的对象，把这个信息交给IoC，告诉IoC我想要什么样的对象，由IoC给我创建、返回）。
2. 把Bean的定义信息加载+读取到IoC容器里
   用到一个抽象（接口）：BeanDefinitionReader，接口中有不同的实现类，根据不同方式进行读取和加载。
3. Bean进行实例化 ( 这里可以对类的定义信息进行修改 )
   有很多种方式：1. new 2. 工厂（建个工厂，返回这个对象） 3. 反射
   Spring中有个工厂，叫：BeanFactory工厂+反射
4. 对象初始化
5. 得到最终可以使用的对象
   使用方法：`context.getBean("User");`

## 13.容器：IoC-概述（下)

#### 依赖注入

DI（Dependency Injection）：依赖注入，依赖注入实现了控制反转的思想。

**依赖注入：**

- **指Spring创建对象的过程中，将对象依赖属性通过配置进行注入**

依赖注入常见的实现方式包括两种：

- 第一种：set注入
- 第二种：构造注入

所以结论是：IOC 就是一种控制反转的思想， 而 DI 是对IoC的一种具体实现。

**Bean管理说的是：Bean对象的创建，以及Bean对象中属性的赋值（或者叫做Bean对象之间关系的维护）。**

### IoC容器在Spring的实现

Spring 的 IoC 容器就是 IoC思想的一个落地的产品实现。IoC容器中管理的组件也叫做 bean。在创建 bean 之前，首先需要创建IoC 容器。Spring 提供了IoC 容器的两种实现方式：

**①BeanFactory**

这是 IoC 容器的基本实现，是 Spring 内部使用的接口。面向 Spring 本身，不提供给开发人员使用。

**②ApplicationContext**（BeanFactory的子接口）

BeanFactory 的子接口，提供了更多高级特性。面向 Spring 的使用者，几乎所有场合都使用 ApplicationContext 而不是底层的 BeanFactory。

**③ApplicationContext的主要实现类**
![img](img/img005.png)

| 类型名                          | 简介                                                         |
| ------------------------------- | ------------------------------------------------------------ |
| ClassPathXmlApplicationContext  | 通过读取类路径下的 XML 格式的配置文件创建 IOC 容器对象       |
| FileSystemXmlApplicationContext | 通过文件系统路径读取 XML 格式的配置文件创建 IOC 容器对象     |
| ConfigurableApplicationContext  | ApplicationContext 的子接口，包含一些扩展方法 refresh() 和 close() ，让 ApplicationContext 具有启动、关闭和刷新上下文的能力。 |
| WebApplicationContext           | 专门为 Web 应用准备，基于 Web 环境创建 IOC 容器对象，并将对象引入存入 ServletContext 域中。 |

## 14.IoC - 基于XML管理Bean-环境搭建

## 15.IoC - 基于XML管理Bean-获取Bean（上）

##### ①方式一：根据id获取

由于 id 属性指定了 bean 的唯一标识，所以根据 bean 标签的 id 属性可以精确获取到一个组件对象。上个实验中我们使用的就是这种方式。

##### ②方式二：根据类型获取

**③方式三：根据id和类型**

```java
package com.atguigu.iocxml;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Logger logger = LoggerFactory.getLogger(TestUser.class);

        //1 根据id获取bean
        User user1 = (User)context.getBean("user");
        System.out.println("1 根据id获取bean" + user1);

        //2 根据类型获取bean
        User user2 = context.getBean(User.class);
        System.out.println("2 根据类型获取bean" + user2);

        //3 根据id和类型
        User user3 = context.getBean("user", User.class);
        System.out.println("3 根据id和类型" + user3);
    }
}
```

##### ④注意的地方

当根据类型获取bean时，要求IOC容器中指定类型的bean有且只能有一个对象（这里的对象指的是同一个路径）

当IOC容器中一共配置了两个：

```xml
<bean id="user" class="com.atguigu.spring6.bean.User"></bean>
<bean id="user1" class="com.atguigu.spring6.bean.user"></bean>
```

根据类型获取时会抛出异常：
更改方式：要么根据id属性值，要么根据id属性值＋类型获取

> org.springframework.beans.factory.NoUniqueBeanDefinitionException: No qualifying bean of type 'com.atguigu.spring6.bean.HelloWorld' available: expected single matching bean but found 2: user,user1

##### ⑤扩展知识

如果组件类实现了接口，根据接口类型可以获取 bean 吗？

> 可以，前提是bean唯一，证明代码如下：

UserDaoImpl.java:

```java
package com.atguigu.bean;

public class UserDaoImpl implements UserDao{
    @Override
    public void run() {
        System.out.println("run.....");
    }
}
```

UserDao.java接口：

```java
package com.atguigu.bean;

public interface UserDao {
    public void run();
}
```

TestUserDao.java:

```java
package com.atguigu.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserDao {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        //根据类型获取接口对应的bean
//        UserDaoImpl userDao = context.getBean(UserDaoImpl.class);
        //注意，这里不要写实现类，因为我们的目的就是为了看看接口是否能找到对应的实现类对象
        UserDao userDao = context.getBean(UserDao.class);
        System.out.println(userDao);
        userDao.run();
    }
}
```

如果一个接口有多个实现类，这些实现类都配置了 bean，根据接口类型可以获取 bean 吗？

> 不行，因为bean不唯一

**结论**

根据类型来获取bean时，在满足bean唯一性的前提下，其实只是看：『对象 **instanceof** 指定的类型』的返回结果，只要返回的是true就可以认定为和类型匹配，能够获取到。

java中，instanceof运算符用于判断前面的对象是否是后面的类，或其子类、实现类的实例。如果是返回true，否则返回false。也就是说：用instanceof关键字做判断时， instanceof 操作符的左右操作必须有继承或实现关系

## 18.IoC-基于XML管理Bean-依赖注入-setter注入（上）

普通的两种原生方式：

```java
public static void main(String[] args) {
        //通过set方法注入
        Book book = new Book();
        book.setBname("java");
        book.setAuthor("尚硅谷");

        //通过构造器注入
        Book book1 = new Book("C++", "尚硅谷");
    }
```

## 18.IoC-基于XML管理Bean-依赖注入-setter注入（下）

步骤：

1. 创建类，定义属性，生成属性set方法

   > 其实只要set就可以了，但是为了操作方便，get方法也会一起生成。 

   `Book类：`

   ```java
   package com.atguigu.di;
   
   public class Book {
       private String bname;//图书的名称
       private String author;
   
       public Book() {
           System.out.println("无参构造器执行了。。");
       }
   
       public Book(String bname, String author) {
           this.bname = bname;
           this.author = author;
       }
   
       //生成set方法
       public String getBname() {
           return bname;
       }
   
       public void setBname(String bname) {
           this.bname = bname;
       }
   
       public String getAuthor() {
           return author;
       }
   
       public void setAuthor(String author) {
           this.author = author;
       }
   
       @Override
       public String toString() {
           return "Book{" +
                   "bname='" + bname + '\'' +
                   ", author='" + author + '\'' +
                   '}';
       }
   }
   ```

   `测试类：`

   ```java
   package com.atguigu.di;
   
   import org.junit.jupiter.api.Test;
   import org.springframework.context.ApplicationContext;
   import org.springframework.context.support.ClassPathXmlApplicationContext;
   
   public class TestBook {
       @Test
       public void testStter() {
           ApplicationContext context = new ClassPathXmlApplicationContext("bean-di.xml");
           Book book = context.getBean("book", Book.class);
           System.out.println(book);
       }
   }
   ```

   

2. 在spring配置文件配置
   这里为了方便，重新创建了一个xml文件

   ```xml
   <?xml version="1.0" encoding="UTF-8"?>
   <beans xmlns="http://www.springframework.org/schema/beans"
          xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
          xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">
   
       <!-- 1 set方法注入 -->
       <bean id="book" class="com.atguigu.di.Book">
           <!-- PS：name的属性值是根据set函数后面的，setBname，首字母改成小写得到的-->
           <!-- property就相当于调用set方法设置值 -->
           <!-- 这里只是做一个最基本的注入，后面还会有其他类型：数组、集合等 -->
           <property name="bname" value="前端开发"></property>
           <property name="author" value="尚硅谷"></property>
       </bean>
   </beans>
   ```

## 20.IoC-基于XML管理Bean-依赖注入-构造器注入

步骤：

1. 创建类，定义属性，生成有参构造方法

2. 进行配置

   ```xml
   <?xml version="1.0" encoding="UTF-8"?>
   <beans xmlns="http://www.springframework.org/schema/beans"
          xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
          xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">
       <!-- 2 构造器注入 -->
       <bean id="bookCon" class="com.atguigu.di.Book">
           <constructor-arg name="bname" value="java开发"></constructor-arg>
           <constructor-arg name="author" value="尚硅谷"></constructor-arg>
           <!-- 1：表示第一个参数，2表示第二个参数，但是这样写容易写乱，不推荐 -->
           <constructor-arg index="1" value=""></constructor-arg>
       </bean>
   </beans>
   ```

   测试类：

   ```java
   @Test
       public void testConstructor() {
           //PS：如果通过Setter注入的配置没有注释掉，则这里会多一个：无参构造器执行了。。
           //原因是加载配置文件的时候，会一起加载创建
           ApplicationContext context = new ClassPathXmlApplicationContext("bean-di.xml");
           Book book = context.getBean("bookCon", Book.class);
           System.out.println(book);
       }
   ```

## 21.IoC-基于XML管理Bean-依赖注入-特殊值处理

##### ①字面量赋值

> 什么是字面量？
>
> int a = 10;
>
> 声明一个变量a，初始化为10，此时a就不代表字母a了，而是作为一个变量的名字。当我们引用a的时候，我们实际上拿到的值是10，此时的10就叫做字面量。
>
> 而如果a是带引号的：'a'，那么它现在不是一个变量，它就是代表a这个字母本身，这就是字面量。所以字面量没有引申含义，就是我们看到的这个数据本身。

```xml
<!-- 使用value属性给bean的属性赋值时，Spring会把value属性的值看做字面量 -->
<property name="name" value="张三"/>
```

##### ②null值

```xml
<property name="name">
    <!-- 标签内结束 -->
    <null />
    
    <!-- 两个标签结束 -->
    <null></null>
</property>
```

> 注意：
>
> ```xml
> <property name="name" value="null"></property>
> ```
>
> 以上写法，会把null当成一个字符串！

##### ③xml实体 - 转义

```xml
<!-- 小于号在XML文档中用来定义标签的开始，不能随便使用 -->
<!-- eg:<property name="expression" value="<>"/> 此时就会报错！！！ -->
<!-- 解决方案一：使用XML实体来代替 -->
<!-- &lt; 代表小于
	 &gt; 代表大于 -->
<property name="expression" value="a &lt; b"/>
```

##### ④CDATA节 /CDATE区

```xml
<property name="expression">
    <!-- 解决方案二：使用CDATA节 -->
    <!-- CDATA中的C代表Character，是文本、字符的含义，CDATA就表示纯文本数据 -->
    <!-- XML解析器看到CDATA节就知道这里是纯文本，就不会当作XML标签或属性来解析 -->
    <!-- 所以CDATA节中写什么符号都随意 -->
    <value><![CDATA[a < b]]></value>
</property>
```

## 22.IoC-基于XML管理Bean-依赖注入-特殊类型属性 - 准备

部门类：

```java
package com.atguigu.ditest;
//部门类
public class Dept {
    private String dname;

    public void info() {
        System.out.println("部门名称：" + dname);
    }
}
```

员工类：

```java
package com.atguigu.ditest;
//员工类
public class emp {
    //对象类型属性：员工属于某个部门
    private Dept dept;//把部门作为对象类型属性配给它

    private String ename;
    private Integer age;

    public void work() {
        System.out.println(ename + "emp work..." + age);
        dept.info();
    }
}
```

## 22.IoC-基于XML管理Bean-依赖注入-对象类型属性（上）

这里为了方便，重新创了一个xml配置文件：`bean-di.xml`

1. 引用外部bean

   配置xml文件：

   ```xml
   <?xml version="1.0" encoding="UTF-8"?>
   <beans xmlns="http://www.springframework.org/schema/beans"
          xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
          xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">
   
       <!--
       第一种方式：引入外部bean
           1 创建两个类对象：dept 和 emp
           2 在emp的bean标签里，使用property引入dept的bean
        -->
       <bean id="dept" class="com.atguigu.ditest.Dept">
           <property name="dname" value="安保部"></property>
       </bean>
   
       <bean id="emp" class="com.atguigu.ditest.Emp">
           <!-- 普通属性注入 -->
           <property name="ename" value="lucy"></property>
           <property name="age" value="50"></property>
   
           <!--
           注入对象类型属性
               private Dept dept;
               name后面记得跟set方法后面的名字保持一致！
   
               在emp的bean标签里面，引入部门dept的bean对象；
               ref表示引用/引入，表示引用外部been
               里面的属性值添加的就是dept这个对象的id，要跟been的id值保持一致！
            -->
           <property name="dept" ref="dept"></property>
       </bean>
   </beans>
   ```

   创建测试方法：

   ```java
   package com.atguigu.ditest;
   
   import org.springframework.context.ApplicationContext;
   import org.springframework.context.support.ClassPathXmlApplicationContext;
   
   public class TestEmp {
       public static void main(String[] args) {
           //加载配置文件
           ApplicationContext context = new ClassPathXmlApplicationContext("bean-ditest.xml");
   
           //员工对象
           Emp emp = context.getBean("emp", Emp.class);
           emp.work();
       }
   }
   ```

   







111



