# gradle

## gradle入门

1. 目录：
   bin：二进制执行脚本所在的目录
   docs：gradle文档所在的目录
   lib：运行gradle所需要的一些jar包
   src：gradle一些源码信息

   <img src="G:\others\Gradle\img\gradle目录.png" alt="img" style="zoom: 67%;" />

   > Tips:
   >
   > 1.只有war工程才有webapp目录，对于普通的jar工程并没有webapp目录
   >
   > gradlew 与 gradlew.bat执行的指定wrapper版本中的gradle指定，不是本地安装的gradle指令哦！

2. 配置gradle环境变量
   GRADLE_HOME

3. 配置gradle的本地仓库，这里可以和maven共用一个仓库
   在配置环境变量的地方，

   新建一个：GRADLE_USER_HOME
   D:\develop\apache-maven-3.6.1\mvn_repo

   >GRADLE_USER_HOME相当于配置Gradle本地仓库位置和Gradle Wrapper缓存目录
   >
   >但严格来说gradle是没有本地仓库的。

   ```cmd
   gradle -v 或者 gradle --version: 通过gradle -v或者 gradle --version检测是否安装成功
   ```

## Gradle 创建第一个项目

1. ### 借助于spring脚手架创建gradle第一个项目：[Spring Initializr](https://start.spring.io/)

![img](G:\others\Gradle\img\使用SpringBoot创建Grandle工程.png)

- 创建完以后，并不会看见build目录。

- 这是因为当我们对java源码，生成对应的class文件之后，它才会生成这个build目录。

- 以下选择的两个文档可以删掉。

- 通常test目录下的resources目录基本上不用，这里没有自带，如果有需要的话，可以自己创建一个。

  ![img](G:\others\Gradle\img\创建完之后的gradle目录.png)

2. ### 使用gradle命令行的方式

   1. 首先创建一个文件夹，叫：gradle02
   2. 然后，来到这个文件夹的根目录底下，使用：`gradle init`
   3. 然后这里会让你选择，是生成一个应用，还是一个lib库，咱们这里选择应用，所以选`application`
   4. 选择java语言
   5. 创建单应用即可，不需要`multiple`
   6. 路径脚本选择：`Groovy`语言
   7. 选择测试框架：JUnit 4
   8. 指定项目名字，如果不指定，默认的就是指定文件夹的名字，直接回车即可。
   9. 指定源码包的名字（即主启动类所在的那个包）：`com.atguigu.gradle`
   10. 然后会问：需不需要选择新的API方法：这里选择默认的`no`即可

   > 1. 使用命令行创建的gradle项目，它也有gradle目录，但是它没有src目录
   > 2. 它有`settings.gradle`文件，但是它没有`build.gradle`文件，但上面两个没有的，它放在了app目录下
   > 3. app目录可以理解成`gradle02`的一个子project（子工程）
   > 4. `.gitignore`和`.gitattributes`都是给`git`文件使用的，没有用可以删掉

## gradle中的常用指令

|    常用gradle指令    |                             作用                             |
| :------------------: | :----------------------------------------------------------: |
|     gradle clean     |                        清空build目录                         |
|    gradle classes    | 编译业务代码和配置文件<br />(执行src main目录底下所有的代码和配置文件的) |
|     gradle test      | 编译测试代码，生成测试报告<br />（执行src test目录底下所有的代码和配置文件的) |
|     gradle build     |                           构建项目                           |
| gradle build -x test |                       跳过测试构建构建                       |

> PS:
>
> 1. gradle的指令要在含有`build.gradle`的目录执行
> 2. `gradle test`执行完毕后，它会把生成的测试报告放在`build/repors/tests/test/index.html`里面存放的就是测试报告
> 3. `gradle build`执行的时候也会执行`gradle classes`和`gradle test`的，它是依赖这两个的。

## 修改 **`maven`**下载源

> Gradle 自带的 Maven 源地址是国外的，该 Maven 源在国内的访问速度是很慢的，除非使用了特别的手段。一般情况下， 我们建议使用国内的第三方开放的 Maven 源或企业内部自建 Maven 源

1. 认识 init.d 文件夹
   `D:\develop\gradle-8.2\init.d`

   > 我们可以在 gradle 的 init.d 目录下创建以.gradle 结尾的文件，.gradle 文件可以实现在 build 开始之前执行，所以你可以在 这个文件配置一些你想预先加载的操作。

   ```gradle
   allprojects {
       repositories {
           mavenLocal()
           maven { name "Alibaba"; url "https://maven.aliyun.com/repository/public" }
           maven { name "Bstek"; url "https://nexus.bsdn.org/content/groups/public/" }
           mavenCentral()
       }
       buildscript {
           repositories {
               maven { name "Alibaba"; url 'https://maven.aliyun.com/repository/public' }
               maven { name "Bstek"; url 'https://nexus.bsdn.org/content/groups/public/' }
               maven { name "M2"; url 'https://plugins.gradle.org/m2/' }
           }
       }
   }
   ```

   > 1. 项目所对应的jar包，它会从`repositories`里面下载
   >
   > 2. 而`buildscript`是给`build.gradle`构建脚本使用的，如果构建脚本本身需要一些依赖，它可以去`buildscript/repositories`中下载
   >
   > 3. 这些仓库有：
   >
   >    - maven的本地仓库（它要求我们在电脑上必须配置过`M2_HOME`这个环境变量，就是`maven`的家目录
   >    - 或者使用maven指定它去 阿里云或者其他Bstek第三方镜像仓库进行下载
   >    - 如果上面都找不着的话，也可以让它去maven的中央仓库`mavenCentral()`去下载
   >
   >    > 值得注意的是，它下载jar包的时候是从上到下依次执行的，直到找到为止，如果找完这些仓库都没有找到对应的jar包，它就会报错。

## 拓展

1. 启用 init.gradle 文件的方法有：

```
在命令行指定文件,例如：gradle --init-script yourdir/init.gradle -q taskName。你可以多次输入此命令来指定多个init文件
2.把init.gradle文件放到 USER_HOME/.gradle/ 目录下
3.把以.gradle结尾的文件放到 USER_HOME/.gradle/init.d/ 目录下
4.把以.gradle结尾的文件放到 GRADLE_HOME/init.d/ 目录下
如果存在上面的4种方式的2种以上，gradle会按上面的1-4序号依次执行这些文件，如果给定目录下存在多个init脚本，会按拼音a-z顺序执行这些脚本，每个init脚本都存在一个对应的gradle实例,你在这个文件中调用的所有方法和属性，都会委托给这个gradle实例，每个init脚本都实现了Script接口。

一般使用第4种就ok了
```

2. 仓库地址说明

   ```
   avenLocal(): 指定使用maven本地仓库，而本地仓库在配置maven时settings文件指定的仓库位置。如E:/repository，gradle 查找jar包顺序如下：USER_HOME/.m2/settings.xml >> M2_HOME/conf/settings.xml >> USER_HOME/.m2/repository 
   
   maven { url 地址}，指定maven仓库，一般用私有仓库地址或其它的第三方库【比如阿里镜像仓库地址】。
   
   mavenCentral()：这是Maven的中央仓库，无需配置，直接声明就可以使用。
   
   jcenter():JCenter中央仓库，实际也是是用的maven搭建的，但相比Maven仓库更友好，通过CDN分发，并且支持https访问,在新版本中已经废弃了，替换为了mavenCentral()。
   
   但通常情况下使用的是M2_HOME/conf/settings.xml
   ```

   >总之, gradle可以通过指定仓库地址为本地maven仓库地址和远程仓库地址相结合的方式，避免每次都会去远程仓库下载 依赖库。这种方式也有一定的问题，如果本地maven仓库有这个依赖，就会从直接加载本地依赖，如果本地仓库没有该 依赖，那么还是会从远程下载。但是下载的jar不是存储在本地maven仓库中，而是放在自己的缓存目录中，默认：USER_HOME/.gradle/caches目录,当然如果我们配置过GRADLE_USER_HOME环境变量，则会放在GRADLE_USER_HOME/caches目录,那么可不可以将gradle caches指向maven repository。我们说这是不行的，caches下载 文件不是按照maven仓库中存放的方式。

   > PS:
   >
   > 1. gradle定位jar包的时候它有两种方式，一种是使用maven的方式，另一种是使用gradle自己的方式。
   > 2. `D:\develop\apache-maven-3.6.1\mvn_repo\caches\modules-2\files-2.1`就是gradle存放jar包的位置
   > 3. gradle管理jar包的方式是这样的：在某一个版本低下，它通常有三个文件夹，一个放pom文件，一个文件夹存放的是这个包的源码包.module文件，一个文件夹存放对应的jar包。
   >    如果是maven的话，一个文件夹底下有pom，源码包，jar包

3. 阿里云仓库地址请参考：[仓库服务 (aliyun.com)](https://developer.aliyun.com/mvn/guide)

   ```
   # name属性不是必须的，但是url属性是必须的
   # 但要注意插件的url记得放在buildscript中的repositories中
   maven { name "Bstek"; url "https://nexus.bsdn.org/content/groups/public/" }
   ```

## Wrapper 包装器

1. Gradle Wrapper 实际上就是对 Gradle 的一层包装，用于解决实际开发中可能会遇到的不同的项目需要不同版本的 Gradle 问题。例如：把自己的代码共享给其他人使用，可能出现如下情况:

   > 1. 对方电脑没有安装 gradle 
   > 2. 对方电脑安装过 gradle，但是版本太旧了

2. 那如何使用 Gradle Wrapper 呢？

   > 项目中的gradlew、gradlew.cmd脚本用的就是wrapper中规定的gradle版本。参见源码 而我们上面提到的gradle指令用的是本地gradle,所以gradle指令和gradlew指令所使用的gradle版本有可能是不一样的。 gradlew、gradlew.cmd的使用方式与gradle使用方式完全一致，只不过把gradle指令换成了gradlew指令。

3. 当然,我们也可在终端执行 gradlew 指令时，指定指定一些参数,来控制 Wrapper 的生成，比如依赖的版本等，如下：

   | 参数名                    | 说明                              |
   | :------------------------ | --------------------------------- |
   | --gradle-version          | 用于指定使用的Gradle版本          |
   | --gradle-distribution-url | 用于指定下载Gradle发行版的url地址 |

   具体操作如下：

   ```cmd
   gradle wrapper --gradle-version=4.4：升级wrapper版本号,只是修改gradle.properties中wrapper版本，未实际下载
   gradle wrapper --gradle-version 5.2.1 --distribution-type all :关联源码用
   ```

   GradleWrapper 的执行流程：

   > 1. 当我们第一次执行 `./gradlew build `命令的时候，gradlew 会读取 `gradle-wrapper.properties` 文件的配置信息 
   > 2. 准确的将指定版本的 gradle 下载并解压到指定的位置(GRADLE_USER_HOME目录下的wrapper/dists目录中)
   > 3. 并构建本地缓存(GRADLE_USER_HOME目录下的caches目录中),下载再使用相同版本的gradle就不用下载了
   > 4. 之后执行的 ./gradlew 所有命令都是使用指定的 gradle 版本。如下图所示

   `gradle-wrapper.properties`

   ```properties
   # 这里是压缩包解压之后存放的目录
   # 这里就是压缩包解压之后存放的位置
   # 存放在GRADLE_USER_HOME所配置的环境变量的wrapper/dists目录下
   distributionBase=GRADLE_USER_HOME
   distributionPath=wrapper/dists
   
   distributionUrl=https\://services.gradle.org/distributions/gradle-8.2-bin.zip
   networkTimeout=10000
   validateDistributionUrl=true
   
   zipStoreBase=GRADLE_USER_HOME
   # 这里是压缩包所存放的目录
   # 把上面的压缩包，下载到GRADLE_USER_HOME所配置的环境变量里面的wrapper/dists这个目录底下，这两个目录是结合使用的
   zipStorePath=wrapper/dists
   ```

   ![img](G:\others\Gradle\img\GradleWrapper的执行流程.png)

   - gradle-wrapper.properties 文件解读:

     | 字段名           | 说明                                               |
     | ---------------- | -------------------------------------------------- |
     | distributionBase | 下载的Gradle压缩包解压后存储的主目录               |
     | distributionPath | 相对于distributionBase的解压后的Gradle压缩包的路径 |
     | zipStoreBase     | 同distributionBase，只不过是存放zip压缩包的        |
     | zipStorePath     | 同distributionPath，只不过是存放zip压缩包的        |
     | distributionUrl  | Gradle发行版压缩包的下载地址                       |

   - > 注意：前面提到的 GRALE_USER_HOME 环境变量用于这里的 Gradle Wrapper 下载的特定版本的 gradle 存储目录。如 果我们没有配置过 GRALE_USER_HOME 环境变量,默认在当前用户家目录下的.gradle 文件夹中。

4. 下载别人的项目或者使用操作以前自己写的不同版本的gradle项目时：用Gradle wrapper,也即:gradlew 什么时候使用本地gradle?新建一个项目时: 使用gradle指令即可。

   > 下载别人的项目或者使用操作以前自己写的不同版本的gradle项目时：用Gradle wrapper,也即:gradlew 什么时候使用本地gradle?新建一个项目时: 使用gradle指令即可。

