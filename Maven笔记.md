50.maven-课程介绍

- Maven是apache旗下的一个开源项目，是一款用于管理和构建java项目的工具。
- Apache 软件基金会，成立于1999年7月，是目前世界上最大的最受欢迎的开源软件基金会，也是一个专门为支持开源项目而生的非盈利性阻止。
- 开源项目：https://www.apache.org/index.html#projects-list
- Maven的作用：
    依赖管理：方便快捷的管理项目依赖的资源（jar包），避免版本冲突问题
    统一项目结构：提供标准、统一的项目结构
    项目构建：标准跨平台（Linux、Windows、MacOS）的自动化项目构建方式

51.Maven-概述-介绍&安装
· Apache Maven是一个项目管理和构建工具，它基于项目对象模型（POM - project object model）的概念，通过一小段描述信息来管理项目的构建。
· 官网：http://maven.apache.org/
· 仓库：用于存储资源，管理各种jar包。
  本地仓库：自己计算机上的一个目录。
  中央仓库：由Maven团队维护的全球唯一的。仓库地址：https://repo1.maven.org/maven2/
  远程仓库（私服）：一般由公司团队搭建的私有仓库。

· Maven作用：
  1. 管理规模庞大的jar包，需要专门的工具
  2. 脱离 IDE 环境执行构建操作，需要专门工具

> 集成开发环境（IDE，Integrated Development Environment ）

1. 构建：（与创建不同！）
    Java项目开发过程中，构建指的是使用[原材料生产产品]的过程。
    · 原材料：Java源代码等等
    · 产品：一个可以在服务器上运行的项目
  
2. 构建过程包含的主要的环节：
	· 清理：删除上一次构建的结果，为下一次构建做好准备
	· 编译：Java源程序编译成*.class字节码文件
	· 测试：运行提前准备好的测试程序
	· 报告：针对刚才测试的结果生成一个全面的信息
	· 打包
		1. Java工程：jar包
		2. Web工程：war包
    · 安装：把一个Maven工程经过打包操作生成的jar包或war包存入Maven仓库
	· 部署：
	  1. 部署jar包：把一个jar包部署到Nexus私服服务器上
	  2. 部署war包：借助相关Maven插件（例如cargo），将war包部署到Tomcat服务器上

· MAVEN安装及配置
  1.Maven核心程序解压与配置

1. 官网：http://maven.apache.org/
    带 tar.gz ：Linux用的
    windows用的：zip
    如果要看源码：就用带src的

> PS:解压需要解压到非中文、没有空格的目录！
>  解压完就ok，不需要安装
>
> 重点关注：conf/settings.xml

2. 指定本地仓库

```xml
 <!-- localRepository
   | The path to the local repository maven will use to store artifacts.
   |
   | Default: ${user.home}/.m2/repository ：当前用户的家目录！C:\Users\52837\.m2\repository
  <localRepository>/path/to/local/repo</localRepository>
  -->

  <!-- 配置 Maven 本地仓库 -->
  <!-- 这里的目录也不需要我们去建，这个目录可以等执行构建命令时有Maven创建 -->
  <localRepository>D:\develop\apache-maven-3.6.1\mvn_repo</localRepository>
```

3. 配置阿里云提供的镜像仓库
     Maven下载jar包默认访问境外的中央仓库，而国外网站速度很慢。改成阿里云提供的镜像仓库，访问国内网站，可以让Maven下载jar包的时候速度更快。配置的方式是：

 1. 将原有的例子注释掉

 2. 将下面mirror标签整体复制到`settings.xml`文件的`mirrors`标签内部。

    ```xml
    <mirror>  
    	<id>alimaven</id>  
    	<name>aliyun maven</name>  
    	<url>http://maven.aliyun.com/nexus/content/groups/public/</url>
    	<mirrorOf>central</mirrorOf>          
    </mirror>
    ```

4. 配置Maven工程的基础JDK版本
   如果按照默认配置运行，Java 工程使用的默认 JDK 版本是 1.5，而我们熟悉和常用的是 JDK 1.8 版本。修改配置的方式是：将 profile 标签整个复制到 settings.xml 文件的 profiles 标签内。

   ```xml
   <profile>
     <id>jdk-1.8</id>
     <activation>
   	<activeByDefault>true</activeByDefault>
   	<jdk>1.8</jdk>
     </activation>
     <properties>
   	<maven.compiler.source>1.8</maven.compiler.source>
   	<maven.compiler.target>1.8</maven.compiler.target>
   	<maven.compiler.compilerVersion>1.8</maven.compiler.compilerVersion>
     </properties>
   </profile>
   ```

   5. 配置环境变量

1. 检查 JAVA_HOME 配置是否正确
   	   Maven 是一个用 Java 语言开发的程序，它必须基于 `JDK` 来运行，需要通过 JAVA_HOME 来找到 `JDK` 的安装位置。
      	   可以使用下面的命令验证：

```cmd
C:\Users\Administrator>echo %JAVA_HOME%
D:\software\Java
C:\Users\Administrator>java -version
java version "1.8.0_141"
Java(TM) SE Runtime Environment (build 1.8.0_141-b15)
Java HotSpot(TM) 64-Bit Server VM (build 25.141-b15, mixed mode)
```

2. 配置 MAVEN_HOME
   tip:
   配置环境变量的规律：
   `XXX_HOME` 通常指向的是 bin 目录的上一级
   PATH 指向的是 bin 目录，即：`%XXX_HOME%\bin`

3. 验证：

  ```cmd
  C:\Users\Administrator>mvn -v
  Apache Maven 3.6.1 (d66c9c0b3152b2e69ee9bac180bb8fcc8e6af555; 2019-04-05T03:00:29+08:00)
  Maven home: D:\develop\apache-maven-3.6.1\bin\..
  Java version: 17, vendor: Oracle Corporation, runtime: D:\develop\jdk
  Default locale: zh_CN, platform encoding: GBK
  OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows"
  ```

  

#### 52.maven-idea集成-配置及创建maven项目

1.项目坐标（由大到小，越来越精确的找到）
	使用三个[向量]在[Maven的仓库]中唯一的定位到一个[jar]包。

    1. `groupId`：公司或组织的id
       公司或组织域名的倒序，通常也会加上项目名称（因为一个项目可能有很多工程）
    2. `artifactId`：一个项目或者是项目中的一个模块id（更倾向于一个模块）
       项目可能会包含很多个工程

  3. `version`：版本号，根据自己的需要设定
	例如：SNAPSHOT 表示快照版本，正在迭代过程中，不稳定的版本
	例如：RELEASE 表示正式版本

    eg：
    <groupId>com.itheima</groupId>
    <artifactId>maven-project01</artifactId>
    <version>1.0-SNAPSHOT</version>//SNAPSHOT：快照

2.坐标和仓库中 jar 包的存储路径之间的对应关系
坐标：

```xml
<groupId>javax.servlet</groupId> 
  <artifactId>servlet-api</artifactId> 
  <version>2.5</version>
```


​	上面坐标对应的 jar 包在 Maven 本地仓库中的位置：

​	`Maven本地仓库根目录\javax\servlet\servlet-api\2.5\servlet-api-2.5.jar`

>PS!:一定要学会根据坐标到本地仓库中找到对应的 jar 包。


3. 创建目录作为后面操作的工作空间
	
	> ### WARNING
	>
	> 此时我们已经有了三个目录，分别是：
	> Maven 核心程序：中军大帐
	> Maven 本地仓库：兵营
	> 本地工作空间：战场
	> 在工作空间目录下打
	
4. 使用命令生成Maven工程
运行 `mvn（主命令） archetype:generate（子命令）` 命令
`archetype：插件（一个插件可以有很多目标），maven具体干活都是插件在干
generate：目标，用':'分开`

运行 `mvn archetype:generate` 命令
下面根据提示操作

```
TIP
Choose a number or apply filter (format: [groupId:]artifactId, case sensitive contains): 7:【直接回车，使用默认值】
Define value for property 'groupId': com.atguigu.maven
Define value for property 'artifactId': pro01-maven-java
Define value for property 'version' 1.0-SNAPSHOT: :【直接回车，使用默认值】
Define value for property 'package' com.atguigu.maven: :【直接回车，使用默认值】
Confirm properties configuration: groupId: com.atguigu.maven artifactId: pro01-maven-java version: 1.0-SNAPSHOT package: com.atguigu.maven Y: :【直接回车，表示确认。如果前面有输入错误，想要重新输入，则输入 N 再回车。】
```

> PS:你在哪个目录下执行的这个指令，则maven工程就会创建到哪


1. 调整
    Maven 默认生成的工程，对 `junit `依赖的是较低的 3.8.1 版本，我们可以改成较适合的 4.12 版本。
    自动生成的 `App.java` 和` AppTest.java` 可以删除。
2. `xml`解读

  ```xml
<!-- 根标签：project，表示对当前工程进行配置、管理 -->
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  
  <!-- modelVersion 标签：从 Maven 2 开始，固定是4.0.0. -->
  <!-- 代表当前 pom.xml 所采用的标签结构 -->
  <modelVersion>4.0.0</modelVersion>

  <!-- 坐标信息 -->
  <!-- 在本地仓库中安装后对应的路径： -->
  <!-- D:\develop\apache-maven-3.6.1\mvn_repo\com\atguigu\maven\pro01-maven-java\1.0-SNAPSHOT\pro01-maven-java-1.0-SNAPSHOT.pom -->
  <!-- groupId 标签：坐标向量之一，代表公司或组织开发的某一个项目 -->
  <groupId>com.atguigu.maven</groupId>
  
  <!-- artifactId 标签：坐标向量之一：代表项目下的某一个模块 -->
  <artifactId>pro01-maven-java</artifactId>
  
  <!-- version 标签：坐标向量之一；代表当前模块的版本 -->
  <version>1.0-SNAPSHOT</version>
  
  <!-- packaging 标签：打包的方式 -->
  <!-- 取值 jar：生成jar包，说明这是一个 Java工程 -->
  <!-- 取值 war：生成 war 包，说明这是一个Web 工程 -->
  <!-- 取值 pom：说明这个工程是用来管理其他工程的工程 -->
  <packaging>jar</packaging>

  <name>pro01-maven-java</name>
  <url>http://maven.apache.org</url>

  <!-- 在Maven 中定义属性值 -->
  <properties>
    <!-- 在构建过程中读取源码时使用的字符集 -->
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
  </properties>

  <!-- 配置具体依赖信息，可以包含多个 dependency 子标签 -->
  <dependencies>
    <!-- dependency 标签：配置一个具体的依赖信息 -->
	<dependency>
	  <!-- 坐标信息：导入哪个 jar包，就配置它的坐标信息即可 -->
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.12</version>
	  
	  <!-- scope 标签：配置当前依赖的范围 -->
      <scope>test</scope>
    </dependency>
  </dependencies>
</project>
  ```

7. Maven核心概念：POM

   - 含义
     POM：**P**roject **O**bject **M**odel，项目对象模型。和 POM 类似的是：DOM（Document Object Model），文档对象模型。它们都是模型化思想的具体体现。

   - 模型化思想
     POM 表示将工程抽象为一个模型，再用程序中的对象来描述这个模型。这样我们就可以用程序来管理项目了。我们在开发过程中，最基本的做法就是将现实生活中的事物抽象为模型，然后封装模型相关的数据作为一个对象，这样就可以在程序中计算与现实事物相关的数据。

   - 对应的配置文件

     POM 理念集中体现在 Maven 工程根目录下 **pom.xml** 这个配置文件中。所以这个 pom.xml 配置文件就是 Maven 工程的核心配置文件。其实学习 Maven 就是学这个文件怎么配置，各个配置有什么用。

8. 约定的目录结构

   - 各个目录的作用：

     ```
     pro01-maven-java(目录名)
     src：源码目录
     main：主题程序目录
     java：Java源代码
     com：package目录
     resources：配置文件
     test：测试程序目录
     java：Java源代码
     com：package目录
     ```

     另外还有一个target目录，专门存放构建操作输出的结果。

   - #### 约定目录结构的意义

     Maven 为了让构建过程能够尽可能自动化完成，所以必须约定目录结构的作用。例如：Maven 执行编译操作，必须先去 Java 源程序目录读取 Java 源代码，然后执行编译，最后把编译结果存放在 target 目录。

   - #### 约定大于配置Maven 

     对于目录结构这个问题，没有采用配置的方式，而是基于约定。这样会让我们在开发过程中非常方便。如果每次创建 Maven 工程后，还需要针对各个目录的位置进行详细的配置，那肯定非常麻烦。

     目前开发领域的技术发展趋势就是：约定大于配置，配置大于编码。

9. ##### 在 Maven 工程中编写代码

   1. 主体程序：Calculator放在
      `maven-workspace\spaceVideo\pro01-maven-java\src\main\java\com\atguigu\maven`

     ``` java
      	public class Calculator {
      	
      	public int sum(int i, int j){
      		return i + j;
      	}
   
   }
     ```

   2. 测试程序：CalculatorTest放在
      ` maven-workspace\spaceVideo\pro01-maven-java\src\test\java\com\atguigu\maven`

      ```java
      package com.atguigu.maven;
      	
      import org.junit.Test;
      import com.atguigu.maven.Calculator;
      	
      // 静态导入的效果是将Assert类中的静态资源导入当前类
      // 这样一来，在当前类中就可以直接使用Assert类中的静态资源，不需要写类名
      import static org.junit.Assert.*;
      	
      public class CalculatorTest{
      	
      	@Test
      	public void testSum(){
      		
      		// 1.创建Calculator对象
      		Calculator calculator = new Calculator();
      		
      		// 2.调用Calculator对象的方法，获取到程序运行实际的结果
      		int actualResult = calculator.sum(5, 3);
      		
      		// 3.声明一个变量，表示程序运行期待的结果
      		int expectedResult = 8;
      		
      		// 4.使用断言来判断实际结果和期待结果是否一致
      		// 如果一致：测试通过，不会抛出异常
      		// 如果不一致：抛出异常，测试失败
      		assertEquals(expectedResult, actualResult);
      		
      	}
      	
      }
      ```

   3. 执行 Maven 的构建命令

      - 要求
        运行 Maven 中和构建操作相关的命令时，必须进入到 pom.xml 所在的目录。如果没有在 pom.xml 所在的目录运行 Maven 的构建命令，那么会看到下面的错误信息：
        ` The goal you specified requires a project to execute but there is no POM in this directory`
        tip:

        > mvn -v 命令和构建操作无关，只要正确配置了 PATH，在任何目录下执行都可以。而构建相关的命令要在 pom.xml 所在目录下运行——操作哪个工程，就进入这个工程的 pom.xml 目录。

      - 清理操作：
        mvn clean 
        效果：删除target目录

      - 编译操作：
        主程序编译：mvn compile

        测试程序编译：mvn test-compile

        主体程序编译结果存放的目录：target/classes

        测试程序编译结果存放的目录：target/test-classes

      - PS：编译前一定要进入到：`cd pro01-maven-java`项目工程目录里面！
        注意一定要将源文件保存，否则不会产生target文件

      - 测试操作：mvn test

        > PS:如果源文件.java被修改了，也不需要重新`mvn test-compile`
        > 因为它会自动重新编译：
        > ` [INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ pro01-maven-java ---
        > [INFO] Changes detected - recompiling the module!
        > [INFO] Compiling 1 source file to D:\develop\maven-workspace\spaceVideo\pro01-maven-java\target\test-classes`

        >补充：
        >
        >1. target下的`surefile-reports`文件：会存放测试的报告

      - 打包操作：`mvn package`
        打包结果--jar包（java工程），存放的目录：target

        > 1. jar包的默认值：artifactId - version（就是两个坐标）
        >    ` Building jar: D:\develop\maven-workspace\spaceVideo\pro01-maven-java\target\pro01-maven-java-1.0-SNAPSHOT.jar`
        > 2. jar包其实就是压缩文件，可以使用电脑上的压缩工具去打开它，它里面放的就是对应的字节码文件。
        >    而且你会发现只有这个主体程序的，测试的并没有放在里面。
        >    正式使用的是主体程序。

      - 安装操作：`mvn install`
                           有时候还会使用：`mvn clean install`，即：先删除，后安装

        > 1. 安装的效果是将本地构建过程中生成的jar包存入Maven本地仓库。这个jar包在Maven仓库中的路径是根据它的坐标生成的。
        > 2. 在本地仓库中安装后对应的路径：
        >    `D:\develop\apache-maven-3.6.1\mvn_repo\com\atguigu\maven\pro01-maven-java\1.0-SNAPSHOT\pro01-maven-java-1.0-SNAPSHOT.pom`
        > 3. 另外，安装操作还会将 `pom.xml` 文件转换为 `XXX.pom` 文件一起存入本地仓库。所以我们在 Maven 的本地仓库中想看一个 jar 包原始的 `pom.xml` 文件时，查看对应 `XXX.pom` 文件即可，它们是名字发生了改变，本质上是同一个文件。
        > 4. 上述操作产生的结果对应的命令行：
        >    `[INFO] Installing D:\develop\maven-workspace\spaceVideo\pro01-maven-java\target\pro01-maven-java-1.0-SNAPSHOT.jar to D:\develop\apache-maven-3.6.1\mvn_repo\com\atguigu\maven\pro01-maven-java\1.0-SNAPSHOT\pro01-maven-java-1.0-SNAPSHOT.jar
        >    [INFO] Installing D:\develop\maven-workspace\spaceVideo\pro01-maven-java\pom.xml to D:\develop\apache-maven-3.6.1\mvn_repo\com\atguigu\maven\pro01-maven-java\1.0-SNAPSHOT\pro01-maven-java-1.0-SNAPSHOT.pom`

                       # 27-创建Maven版的Web工程
                    
                       - 说明
                    
                         1. 使用`mvm archetype:generate`命令生成Web工程时，需要使用一个专门的`archetype`。这个专门生成WEb工程骨架的`archetype`可以参照官网看到它的说法。
                    
                         2. Usage：
                            `mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DarchetypeArtifactId=maven-archetype-webapp -DarchetypeVersion=1.4`
                    
                            分析：
                    
                            ``` 
                            主命令：mvn
                            子命令：archetype:generate
                            -D：表示后面要写参数的名字了，参数的名字和-D是紧挨着的。
                            ```
        
        
        ​                    
        ​            
                         3. 参数` archetypeGroupId`、`archetypeArtifactId`、`archetypeVersion` 用来指定现在使用的 `maven-archetype-webapp` 的坐标。
                    
                       - 值得注意的是：一定要先从当前的java工程里出来，我们不允许在一个java工程里再去创建一个web工程
        
        
        ​               
        ​            
                       实验六：测试依赖的范围
                    
                       1. compile 和 test 对比
                    
                          |         | main目录（空间） | test目录（空间） | 开发过程（时间） | 部署到服务器（时间） |
                          | :-----: | ---------------- | ---------------- | ---------------- | -------------------- |
                          | compile | 有效             | 有效             | 有效             | 有效                 |
                          |  test   | 无效             | 有效             | 有效             | 无效                 |
                    
                       2. compile 和 provided对比
                    
                          |          | main目录（空间） | test目录（空间） | 开发过程（时间） | 部署到服务器（时间） |
                          | :------: | :--------------: | :--------------: | :--------------: | :------------------: |
                          | compile  |       有效       |       有效       |       有效       |         有效         |
                          | provided |       有效       |       有效       |       有效       |         无效         |
        
        
        ​                  
        ​            
                       3. 测试方式：
                    
                          - 通过 import 语句将要测试的类引入当前类，引入后：
                            1. 编译通过：说明可以使用，这个范围的依赖对当前类有效
                            2. 编译失败：说明不能使用，这个范围的依赖对当前类无效
                          - 开发过程的测试方式：
                            看看IDEA能否识别它
                          - 能否部署到服务器的测试方式：
                            看看文件打包的时候是否有将它打包为war包，因为放到服务器上肯定是把war包放到服务器上
                          - 结论：
                            - compile：通常使用的第三方框架的 jar 包这样在项目实际运行时真正要用到的 jar 包都是以 compile 范围进行依赖的。比如 SSM 框架所需jar包。
                            - test：测试过程中使用的 jar 包，以 test 范围依赖进来。比如 junit。
                            - provided：在开发过程中需要用到的“服务器上的 jar 包”通常以 provided 范围依赖进来。比如 servlet-api、jsp-api。而这个范围的 jar 包之所以不参与部署、不放进 war 包，就是避免和服务器上已有的同类 jar 包产生冲突，同时减轻服务器的负担。说白了就是：“**服务器上已经有了，你就别带啦！**”
        
   
4. 实验七：测试依赖的传递性
   
   1. 依赖的传递性
   
         - 概念
        A 依赖 B，B 依赖 C，那么在 A 没有配置对 C 的依赖的情况下，A 里面能不能直接使用 C？
   
      - 传递的原则
   
        在 A 依赖 B，B 依赖 C 的前提下，C 是否能够传递到 A，取决于 B 依赖 C 时使用的依赖范围。
   
           - B 依赖 C 时使用 compile 范围：可以传递
        - B 依赖 C 时使用 test 或 provided 范围：不能传递，所以需要这样的 jar 包时，就必须在需要的地方明确配置依赖才可以。
   
5. 实验八：测试依赖的排除
   
      - 概念
        当 A 依赖 B，B 依赖 C 而且 C 可以传递到 A 的时候，A 不想要 C，需要在 A 里面把 C 排除掉。而往往这种情况都是为了避免 jar 包之间的冲突。
     <img src="http://heavy_code_industry.gitee.io/code_heavy_industry/assets/img/img027.2faff879.png" alt="./images" style="zoom: 50%;" />
     
     
   所以配置依赖的排除其实就是阻止某些 jar 包的传递。因为这样的 jar 包传递过来会和其他 jar 包冲突。
   
   - 配置方式
   
        ```xml
        <dependency>
        	<groupId>com.atguigu.maven</groupId>
        	<artifactId>pro01-maven-java</artifactId>
        	<version>1.0-SNAPSHOT</version>
        	<scope>compile</scope>
        	<!-- 使用excludes标签配置依赖的排除	-->
        	<exclusions>
        		<!-- 在exclude标签中配置一个具体的排除 -->
        		<exclusion>
        			<!-- 指定要排除的依赖的坐标（不需要写version） -->
        			<groupId>commons-logging</groupId>
        			<artifactId>commons-logging</artifactId>
        		</exclusion>
        	</exclusions>
        </dependency>
     ```
   
6. 实验九：继承
   
   - 概念：
   
     Maven工程之间，A 工程继承 B 工程
   
        - B 工程：父工程
     - A 工程：子工程
   
     本质上是 A 工程的 `pom.xml` 中的配置继承了 B 工程中` pom.xml` 的配置。
   
      - 作用：
     在父工程中统一管理项目中的依赖信息，具体来说是**管理依赖信息的版本**。
   
      - 创建父工程
     创建的过程和前面创建 `pro01-maven-java` 一样。
   
     工程名称：`pro03-maven-parent`
   
     工程创建好之后，要修改它的打包方式：
   
        ```xml
     <groupId>com.atguigu.maven</groupId>
          <artifactId>pro03-maven-parent</artifactId>
          <version>1.0-SNAPSHOT</version>
        
          <!-- 当前工程作为父工程，它要去管理子工程，所以打包方式必须是 pom -->
          <packaging>pom</packaging>
        ```
   
     只有打包方式为 `pom` 的 Maven 工程能够管理其他 Maven 工程。打包方式为 `pom` 的 Maven 工程中不写业务代码，它是专门管理其他 Maven 工程的工程。
   
   - 创建模块工程
   
     模块工程类似于 IDEA 中的 module，所以需要**进入 pro03-maven-parent 工程的根目录**，然后运行 mvn archetype:generate 命令来创建模块工程。
   
   - 查看被添加新内容的父工程 pom.xml
   
     下面 modules 和 module 标签是聚合功能的配置
   
        ```xml
        <modules>  
        	<module>pro04-maven-module</module>
        	<module>pro05-maven-module</module>
        	<module>pro06-maven-module</module>
        </modules>
        ```
   
   - 解读子工程的 `pom.xml`
   
        ```xml
        <!-- 使用parent标签指定当前工程的父工程 -->
        <parent>
        	<!-- 父工程的坐标 -->
        	<groupId>com.atguigu.maven</groupId>
        	<artifactId>pro03-maven-parent</artifactId>
        	<version>1.0-SNAPSHOT</version>
        </parent>
        
        <!-- 子工程的坐标 -->
        <!-- 如果子工程坐标中的groupId和version与父工程一致，那么可以省略 -->
        <!-- <groupId>com.atguigu.maven</groupId> -->
        <artifactId>pro04-maven-module</artifactId>
        <!-- <version>1.0-SNAPSHOT</version> -->
     ```
   
   - 在父工程中配置依赖的统一管理
   
        ```xml
        <!-- 使用dependencyManagement标签配置对依赖的管理 -->
        <!-- 被管理的依赖并没有真正被引入到工程 -->
        <!-- 注意：即使在父工程配置了对依赖的管理，子工程需要使用具体哪一个依赖还是要明确配置 -->
        <dependencyManagement>
        	<dependencies>
        		<dependency>
        			<groupId>org.springframework</groupId>
        			<artifactId>spring-core</artifactId>
        			<version>4.0.0.RELEASE</version>
        		</dependency>
        		<dependency>
        			<groupId>org.springframework</groupId>
        			<artifactId>spring-beans</artifactId>
        			<version>4.0.0.RELEASE</version>
        		</dependency>
        		<dependency>
        			<groupId>org.springframework</groupId>
        			<artifactId>spring-context</artifactId>
        			<version>4.0.0.RELEASE</version>
        		</dependency>
        		<dependency>
        			<groupId>org.springframework</groupId>
        			<artifactId>spring-expression</artifactId>
        			<version>4.0.0.RELEASE</version>
        		</dependency>
        		<dependency>
        			<groupId>org.springframework</groupId>
        			<artifactId>spring-aop</artifactId>
        			<version>4.0.0.RELEASE</version>
        		</dependency>
        	</dependencies>
        </dependencyManagement>
     ```
   
   - 子工程中引用那些被父工程管理的依赖
   
     关键点：省略版本号
   
        ```xml
        <!-- 子工程引用父工程中的依赖信息时，可以把版本号去掉。	-->
        <!-- 把版本号去掉就表示子工程中这个依赖的版本由父工程决定。 -->
        <!-- 具体来说是由父工程的dependencyManagement来决定。 -->
        <!-- A.这里配置了 version 和父工程管理的版本一致，最终还是采纳这个版本
             B.这里配置了 version，但是和父工程管理的版本不一致，那么这里子工程配置的版本会覆盖父工程管理的版本并最终采纳。绝大部分情况下子工程还是遵从父工程统一管理的依赖。
        -->
        <dependencies>
        	<dependency>
        		<groupId>org.springframework</groupId>
        		<artifactId>spring-core</artifactId>
        	</dependency>
        	<dependency>
        		<groupId>org.springframework</groupId>
        		<artifactId>spring-beans</artifactId>
        	</dependency>
        	<dependency>
        		<groupId>org.springframework</groupId>
        		<artifactId>spring-context</artifactId>
        	</dependency>
        	<dependency>
        		<groupId>org.springframework</groupId>
        		<artifactId>spring-expression</artifactId>
        	</dependency>
        	<dependency>
        		<groupId>org.springframework</groupId>
        		<artifactId>spring-aop</artifactId>
        	</dependency>
        </dependencies>
        ```
   
   - 在父工程中升级依赖信息的版本
   
        ```xml
        ……
        			<dependency>
        				<groupId>org.springframework</groupId>
        				<artifactId>spring-beans</artifactId>
        				<version>4.1.4.RELEASE</version>
        			</dependency>
        ……
     ```
   
   - 在父工程中声明自定义属性//这种方式在子工程里也是可以这样做的
   
        ```xml
        <!-- 通过自定义属性，统一指定Spring的版本 -->
        <!-- 标签名 就是 属性名 -->
        <!-- 标签值 就是 属性值 -->
        <!-- ${atguigu.spring.version} -->
        <properties>
        	<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        	
        	<!-- 自定义标签，维护Spring版本数据 -->
        	<atguigu.spring.version>4.3.6.RELEASE</atguigu.spring.version>
        </properties>
     ```
   
   - 在需要的地方使用`${}`的形式来引用自定义的属性名
   
        ```xml
        <dependency>
        	<groupId>org.springframework</groupId>
        	<artifactId>spring-core</artifactId>
        	<version>${atguigu.spring.version}</version>
        </dependency>
     ```
   
     真正实现“一处修改，处处生效”。
   
      - 实际意义
     <img src="http://heavy_code_industry.gitee.io/code_heavy_industry/assets/img/img037.53c95c38.jpg" alt="./images" style="zoom:50%;" />
   
      > 编写一套符合要求、开发各种功能都能正常工作的依赖组合并不容易。如果公司里已经有人总结了成熟的组合方案，那么再开发新项目时，如果不使用原有的积累，而是重新摸索，会浪费大量的时间。为了提高效率，我们可以使用工程继承的机制，让成熟的依赖组合方案能够保留下来。
      >
   > 如上图所示，公司级的父工程中管理的就是成熟的依赖组合方案，各个新项目、子系统各取所需即可。
   
7. 实验十：聚合
   
      - 聚合本身的含义：
     部分组成整体
     
   - 好处
   
     1. 一键执行 Maven 命令：很多构建命令都可以在“总工程”中一键执行。
   
        以 mvn install 命令为例：Maven 要求有父工程时先安装父工程；有依赖的工程时，先安装被依赖的工程。我们自己考虑这些规则会很麻烦。但是工程聚合之后，在总工程执行 mvn install 可以一键完成安装，而且会自动按照正确的顺序执行。
   
     2. 配置聚合之后，各个模块工程会在总工程中展示一个列表，让项目中的各个模块一目了然。
   
      - 聚合的配置
     在总工程中配置 modules 即可：
   
        ```xml
        <modules>  
        		<module>pro04-maven-module</module>
        		<module>pro05-maven-module</module>
        		<module>pro06-maven-module</module>
        	</modules>
        ```
     ```
     
      - 依赖循环问题
     如果 A 工程依赖 B 工程，B 工程依赖 C 工程，C 工程又反过来依赖 A 工程，那么在执行构建操作时会报下面的错误：
     
        ```cmd
        DANGER
        [ERROR] [ERROR] The projects in the reactor contain a cyclic reference:
        这个错误的含义是：循环引用。
     ```
   
   - IDEA-创建父工程并初步配置
   
     在父工程里创建了子工程后，idea会自动给父工程的文件加上
   
        ```xml
        <packaging>pom</packaging>
          <name>Archetype - pro02-maven-idea-parent</name>
          <url>http://maven.apache.org</url>
          <modules>
            <module>pro03-module-java</module>
          </modules>
        ```
   
     子工程也自动加了：
   
        ```xml
        <parent>
                <groupId>com.atguigu.maven</groupId>
                <artifactId>pro02-maven-idea-parent</artifactId>
                <version>1.0-SNAPSHOT</version>
            </parent>
        ```
   
        

· idea连包带类一次性创建：

- IDEA中去执行命令：
  <img src="C:\Users\52837\AppData\Roaming\Typora\typora-user-images\image-20230828105228200.png" alt="image-20230828105228200" style="zoom:33%;" />

```cmd
-D 表示后面要附加命令的参数，字母 D 和后面的参数是紧挨着的，中间没有任何其他字符
-Dmaven.test.skip=true 表示在执行命令的过程中跳过测试
```

<img src="http://heavy_code_industry.gitee.io/code_heavy_industry/assets/img/img029.7b9c7a12.png" alt="images" style="zoom:50%;" />

##### 工程导入

Maven工程除了自己创建的，还有很多情况是别人创建的。而为了参与开发或者是参考学习，我们都需要导入到 IDEA 中。下面我们分几种不同情况来说明：

### ①来自版本控制系统

目前我们通常使用的都是 Git（本地库） + 码云（远程库）的版本控制系统，结合 IDEA 的相关操作方式请点[**这里** (opens new window)](http://heavy_code_industry.gitee.io/code_heavy_industry/pro008-Git/lecture/chapter05/verse03.html)查看**克隆远程库**部分。
②来自工程目录
直接使用 IDEA 打开工程目录即可。

#### 设置 Maven 核心程序位置

打开一个新的 Maven 工程，和新创建一个 Maven 工程是一样的，此时 IDEA 的 settings 配置中关于 Maven 仍然是默认值：

<img src="http://heavy_code_industry.gitee.io/code_heavy_industry/assets/img/img011.d7914ffd.png" alt="./images" style="zoom:50%;" />
所以我们还是需要像新建 Maven 工程那样，指定一下 Maven 核心程序位置：

<img src="http://heavy_code_industry.gitee.io/code_heavy_industry/assets/img/img012.a62a48e8.png" alt="./images" style="zoom:50%;" />

## 模块导入

### ②三个生命周期

| 生命周期名称 |     作用     |                           各个环节                           |
| :----------: | :----------: | :----------------------------------------------------------: |
|    Clean     | 清理操作相关 |                  pre-clean clean post-clean                  |
|     Site     | 生成站点相关 |             pre-site site post-site deploy-site              |
|   Default    | 主要构建过程 | validate generate-sources process-sources generate-resources process-resources 复制并处理资源文件，至目标目录，准备打包。 compile 编译项目 main 目录下的源代码。 process-classes generate-test-sources process-test-sources generate-test-resources process-test-resources 复制并处理资源文件，至目标测试目录。 test-compile 编译测试源代码。 process-test-classes test 使用合适的单元测试框架运行测试。这些测试代码不会被打包或部署。 prepare-package package 接受编译好的代码，打包成可发布的格式，如JAR。 pre-integration-test integration-test post-integration-test verify install将包安装至本地仓库，以让其它项目依赖。 deploy将最终的包复制到远程的仓库，以让其它开发人员共享；或者部署到服务器上运行（需借助插件，例如：cargo）。 |



在终端中打开
<img src="C:\Users\52837\AppData\Roaming\Typora\typora-user-images\image-20230828105517790.png" alt="image-20230828105517790" style="zoom:33%;" />

xml的目录结构必须要记住![image-20230828111643651](C:\Users\52837\AppData\Roaming\Typora\typora-user-images\image-20230828111643651.png)

- 创建Web模块工程

  1. 创建模块
     按照前面的同样操作创建模块，**此时**这个模块其实还是一个**Java模块**。

  2. 修改打包方式

     ```xml
     <packaging>war</packaging>
     ```

  3. Web设定
     首先打开项目结构菜单：
     ![images](data:image/png;base64,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)

     然后到 Facets 下查看 IDEA 是否已经帮我们自动生成了 Web 设定。正常来说只要我们确实设置了打包方式为 war，那么 IDEA 2019 版就会自动生成 Web 设定。<img src="http://heavy_code_industry.gitee.io/code_heavy_industry/assets/img/img006.969793b4.png" alt="images" style="zoom: 67%;" />

     另外，对于 IDEA 2018 诸版本没有自动生成 Web 设定，那么请参照下面两图，我们自己创建：
     <img src="http://heavy_code_industry.gitee.io/code_heavy_industry/assets/img/img042.32a9d794.png" alt="./images" style="zoom:50%;" />
     <img src="http://heavy_code_industry.gitee.io/code_heavy_industry/assets/img/img043.0a913d5c.png" alt="./images" style="zoom: 33%;" />

   4. 借助IDEA生成web.xml
      ![./images](data:image/png;base64,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)


      <img src="http://heavy_code_industry.gitee.io/code_heavy_industry/assets/img/img045.dd04540f.png" alt="./images" style="zoom:67%;" />
    
          5. 设置 Web 资源的根目录
             结合 Maven 的目录结构，Web 资源的根目录需要设置为 src/main/webapp 目录。
             <img src="http://heavy_code_industry.gitee.io/code_heavy_industry/assets/img/img046.71c20d43.png" alt="./images" style="zoom:50%;" />

## 插件和目标

1. 插件

   Maven 的核心程序仅仅负责宏观调度，不做具体工作。具体工作都是由 Maven 插件完成的。例如：编译就是由 maven-compiler-plugin-3.1.jar 插件来执行的。

2. 目标

   一个插件可以对应多个目标，而每一个目标都和生命周期中的某一个环节对应。

   Default 生命周期中有 compile 和 test-compile 两个和编译相关的环节，这两个环节对应 compile 和 test-compile 两个目标，而这两个目标都是由 maven-compiler-plugin-3.1.jar 插件来执行的。

## 仓库

- 本地仓库：在当前电脑上，为电脑上所有 Maven 工程服务
- 远程仓库：需要联网
  - 局域网：我们自己搭建的 Maven 私服，例如使用 Nexus 技术。
  - Internet
    - 中央仓库
    - 镜像仓库：内容和中央仓库保持一致，但是能够分担中央仓库的负载，同时让用户能够就近访问提高下载速度，例如：Nexus aliyun

建议：不要中央仓库和阿里云镜像混用，否则 jar 包来源不纯，彼此冲突。

专门搜索 Maven 依赖信息的网站：https://mvnrepository.com/

com.itheima.HelloWorld
· 什么是坐标？
  · Maven中的坐标是资源的唯一标识，通过该坐标可以唯一定位资源位置。
  · 使用坐标来定义项目或引入项目中需要的依赖。

· Maven的坐标主要组成
  · groupId：定义当前Maven项目隶属组织名称（通常是域名反写，例如：com.itheima）
  · artifactId：定义当前Maven项目名称（通常是项目名称，例如 order-service、goods-service）
  · version：定义当前项目版本号

53.//maven-idea集成-导入maven项目
方式一：打开IDEA，选择右侧Maven面板，点击+号，选中对应项目的pom.xml文件，双击即可

54.//maven-依赖管理-以来配置
· 依赖：指当前项目运行所需要的jar包，一个项目可以引入多个依赖。
		如果A工程里面用到了B工程的类、接口、配置文件等等这样的资源，那么我们就可以说A 依赖 B。
		
· 依赖管理中要解决的具体问题：
  · jar包的下载：使用Maven 之后，jar包会从规范的远程仓库下载到本地
  · jar包之间的依赖：通过依赖的传递性自动完成
  · jar包之间的冲突：通过对依赖的配置进行调整，让某些jar包不会被导入
		
· 配置：
  1. 在pom.xml中编写<dependencies>标签
  2. 在<dependencies>标签中 使用<dependency>引入坐标
  3. 定义坐标的groupId，artifactId，version
  4. 点击刷新按钮，引入最新加入的坐标

PS：
  1. 如果引入的依赖，在本地仓库不存在，将会链接远程仓库/中央仓库，然后下载依赖。（这个过程比价耗时，耐心等待）
  2. 如果不知道依赖的坐标信息，可以到https://mvnrepository.com/中搜索

55.//maven-依赖管理-依赖传递
· 依赖具有传递性
  · 直接依赖：在当前项目中通过依赖配置建立的依赖关系
  · 间接依赖：被依赖的资源如果依赖其他资源，当前项目间接依赖其他资源

· 排除依赖
  排除依赖指主动断开依赖的资源，被排除的资源无需指定版本。

56.//maven-依赖管理-依赖范围
· 依赖的jar包，默认情况下，可以在任何地方使用。
  可以通过<scope>...</scope>设置其作用范围。
· 作用范围：
  · 主程序范围有效。（main文件夹范围内）
  · 测试程序范围有效。（test文件夹范围内）
  · 是否参与打包运行。（package指定范围内）

  scope值		主程序		测试程序	打包（运行）	范例
compile（默认）  Y				Y			Y			log4j
test			 -				Y			-			junit
provided		 Y				Y			-			servlet-api
routime			 -				Y			Y			jdbc驱动

57.//maven-依赖管理-生命周期
· Maven的生命周期就是为了对所有的maven项目构建过程进行抽象和统一。
· Maven中有3套相互独立的生命周期：
  clean：清理工作
  default：核心工作，如：编译、测试、打包、安装、部署等。
  site：生成报告、发布站点等

· 每套生命周期包含一些阶段（phase），阶段是有顺序的，后面的阶段依赖于前面的阶段。

· 生命周期阶段：
  clean：移除上一次构建生成的文件
  compile：编译项目源代码
  test：使用合适的单元测试框架运行测试（junit）
  package：将编译后的文件打包，如：jar、war等
  install：安装项目到本地仓库

· 执行指定生命周期的两种方式：
  在idea中，右侧的maven工具栏，选中对应的生命周期，双击执行。
  在命令行中，通过命令执行：mvn compile                                                                                                    