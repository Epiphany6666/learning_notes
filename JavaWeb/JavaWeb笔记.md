JAVA WEB

# 03. Web前端开发-课程安排

网页有哪些部分组成?

> 文字、图片、音频、视频、超链接 …

我们看到的网页，背后的本质是什么？

> 程序员写的前端代码

前端的代码是如何转换成用户眼中的网页的？

> 通过浏览器转化（解析和渲染）成用户看到的网页
>
> 浏览器中对代码进行解析渲染的部分，称为浏览器内核

提示：不同的浏览器，内核不同，对于相同的前端代码解析的效果会存在差异。



**Web标准**

> Web标准也称为网页标准，由一系列的标准组成，大部分由 W3C（ World Wide Web Consortium，万维网联盟）负责制定。
>
> 三个组成部分：
>
> HTML：负责网页的结构（页面元素和内容）。
>
> CSS：负责网页的表现（页面元素的外观、位置等页面样式，如：颜色、大小等）。
>
> JavaScript：负责网页的行为（交互效果）。轮播图

# 04.HTML-快速入门

> 学习HTML就是学习里面的标签
>
> 学习CSS就是学习里面有哪些样式
>
> 前端HTML、CSS、JS的官方文档：[w3school 在线教程](https://www.w3school.com.cn/)

**HTML**

HTML（HyperText Markup Language）：超文本标记语言。

> XML是可扩展的标记语言

- 超文本：超越了文本的限制，比普通文本更强大。除了文字信息，还可以定义图片、音频、视频等内容。

- 标记语言：由标签构成的语言

  HTML标签都是预定义好的。例如：使用<a>展示超链接，使用<img>展示图片，<video>展示视频。

  HTML代码直接在浏览器中运行，HTML标签由浏览器解析。

**CSS**

CSS（Cascading Style Sheet）：层叠样式表，用于控制页面的样式（表现）。

- **查看HTML的所有标签：**

  HTML5是现在的主流版本

  <img src="./assets/image-20231019194742083.png" alt="image-20231019194742083" style="zoom:33%;" />

  点击右侧的参考书

  <img src="./assets/image-20231019195301536.png" alt="image-20231019195301536" style="zoom: 33%;" />

- 查看CSS有哪些样式：

  点击W3school回到主页，然后点击CSS3

  <img src=".\assets\image-20231020133518950.png" alt="image-20231020133518950" style="zoom:50%;" />

  老样子，点击右侧的参考书

  <img src="./assets/image-20231019200758859.png" alt="image-20231019200758859" style="zoom:33%;" />

**HTML快速入门**

1. 新建文本文件，后缀名改为 .html

2. 编写 HTML 结构标签

   ![image-20231019201002802](./assets/image-20231019201002802.png)

3. 在<body>中填写内容

   ![image-20231019201032911](./assets/image-20231019201032911.png)

> `<img src="1.jpg"/>`支持自闭合

HTML结构标签：

``` html
<html>
	<head>
		<title>HTML快速入门</title>
	</head>
	<body>
		<h1>Hello HTML</h1>
		<img src="1.jpg"/>
	</body>

</html>
```

特点：

- HTML标签不区分大小写，但是在项目开发中一般都是使用小写
- HTML标签属性值单双引号都可以
- HTML语法松散 (建议大家编写HTML标签的时候尽量严谨一些)

# 05.VSCode安装

Visual Studio Code（简称 VS Code ）是 Microsoft 于2015年4月发布的一款代码编辑器。

VS Code 对前端代码有非常强大的支持，同时也其他编程语言（例如：C++、Java、Python、PHP、Go等）。

VS Code 提供了非常强大的插件库，大大提高了开发效率。

官网： [https://code.visualstudio.com](https://code.visualstudio.com/)

> 作为一名软件开发工程师，建议以后安装所有与开发相关的软件，尽量安装在一个没有中文，不带空格的目录下。

**安装文档**

**一、下载**

进入VS Code官网：https://code.visualstudio.com，点击 `DownLoad for Windows`下载windows版本

![image-20220913194205681](./assets/image-20220913194205681.png) 

当然也可以点击旁边的箭头，下载Windows版本 或 Mac OS 版本

![image-20220913194235945](./assets/image-20220913194235945.png) 

- Stable：稳定版
- Insiders：内测版



### 二、安装

 ![image-20220913194303018](./assets/image-20220913194303018.png) 

双击安装包，选择`我同意此协议`，再点击`下一步`

![image-20220522162046996](./assets/image-20220522162046996.png) 

选择安装路径，点击`下一步` 。也可以使用默认值: C:\Users\super\AppData\Local\Programs\Microsoft VS Code

![image-20220522162201640](./assets/image-20220522162201640.png) 

继续点击下一步

![image-20220522162315843](./assets/image-20220522162315843.png) 

可以勾选创建桌面快捷方式，如果不想使用vscode作为代码默认打开方式，可以取消`将code注册为受支持的文件类型的编辑器`，点击下一步

![image-20220522162528751](./assets/image-20220522162528751.png) 

点击安装，开始安装 

![image-20220522162606538](./assets/image-20220522162606538.png) 

![image-20220522162623828](./assets/image-20220522162623828.png) 

![image-20220522162633671](./assets/image-20220522162633671.png) 

安装完成，运行VS Code。

![image-20220522163326948](./assets/image-20220522163326948.png)



### 三、VS Code插件安装

![image-20220812153551951](./assets/image-20220812153551951.png) 

VS Code提供了非常丰富的插件功能，根据你的需要，安装对应的插件可以大大提高开发效率。

完成前端开发，常见插件介绍：



1、Chinese (Simplified) Language Pack

适用于 VS Code 的中文（简体）语言包

![image-20220522163955686](./assets/image-20220522163955686.png) 



2、Code Spell Checker

拼写检查器。比如 banana 单词写错成 banane ，会提示你是否修改成 banana ，也可以将 banane 添加至检查器的字典中。

![image-20220812153723201](./assets/image-20220812153723201.png) 



3、HTML CSS Support

在编写样式表的时候，自动补全功能大大缩减了编写时间。

![image-20220522164137867](./assets/image-20220522164137867.png) 



4、JavaScript (ES6) code snippets

支持ES6语法提示

![image-20220522164226989](./assets/image-20220522164226989.png) 



5、Mithril Emmet

一个能大幅度提高前端开发效率的一个工具，用于补全代码

![image-20220522164445770](./assets/image-20220522164445770.png) 



6、Path Intellisense

路径提示插件

![image-20220522164542982](./assets/image-20220522164542982.png) 



7、Vue 3 Snippets

在 Vue 2 或者 Vue 3 开发中提供代码片段，语法高亮和格式化的 VS Code 插件，能极大提高你的开发效率。

![image-20220522164651541](./assets/image-20220522164651541.png) 



8、VueHelper

vscode最好的vue代码提示插件，不仅包括了vue2所有api，还含有vue-router2和vuex2的代码

![image-20220522164918079](./assets/image-20220522164918079.png) 



9、uto Close Tag

自动闭合HTML/XML标签

![image-20220522183524341](./assets/image-20220522183524341.png) 



10、Auto Rename Tag

自动完成另一侧标签的同步修改

![image-20220522183633805](./assets/image-20220522183633805.png) 



11、Beautify

格式化 html ,js,css

![image-20220522183703756](./assets/image-20220522183703756.png) 

安装过程中, 如果提示是否需要继续安装, 选择 "仍要安装"。



12、Bracket Pair Colorizer

给括号加上不同的颜色，便于区分不同的区块，使用者可以定义不同括号类型和不同颜色 

![image-20220522183845187](./assets/image-20220522183845187.png) 

安装过程中, 如果提示是否需要继续安装, 选择 "仍要安装"。



13、open in browser

vscode不像IDE一样能够直接在浏览器中打开html，而该插件支持快捷键与鼠标右键快速在浏览器中打开html文件，支持自定义打开指定的浏览器，包括：Firefox，Chrome，Opera，IE以及Safari

![image-20220522183954255](./assets/image-20220522183954255.png) 



14、Vetur

Vue多功能集成插件，包括：语法高亮，智能提示，emmet，错误提示，格式化，自动补全，debugger。vscode官方钦定Vue插件，Vue开发者必备。 

![image-20220522184107715](./assets/image-20220522184107715.png) 



15、File Utils

File Utils插件,可以方便快捷的来创建、复制、移动、重命名文件和目录。

![image-20230306101339092](./assets/image-20230306101339092.png) 



16、IntelliJ IDEA Keybindings

安装VSCode的插件 IntelliJ IDEA Keybindings 即可在VSCode中使用IDEA的快捷键。

![image-20220913194549794](./assets/image-20220913194549794.png)



17、File Utils

![image-20231020113858460](./assets/image-20231020113858460.png)

右击文件，方便复制 

![image-20231020113951372](./assets/image-20231020113951372.png)



### 四、VS Code 配置

打开配置面板，根据自己的喜好，可以修改字体、背景样式等偏好设置

**修改颜色主题**：

<img src="./assets/image-20231019203912941.png" alt="image-20231019203912941" style="zoom:50%;" />

**字体**：

![image-20220522165758191](./assets/image-20220522165758191.png)

<img src="./assets/image-20231019204055492.png" alt="image-20231019204055492" style="zoom:70%;" />



### 五、VS Code 快捷键

![image-20220522164918079](./assets/20200103175529269.png)



### 六、使用

或者直接拖进来

<img src="./assets/image-20231019204810658.png" alt="image-20231019204810658" style="zoom:50%;" />

![image-20231019205547037](./assets/image-20231019205547037.png) 

基本的结构：输入一个 ! ，然后直接敲回车

![image-20231019205659263](./assets/image-20231019205659263.png)

ctrl + shift + /注释，和idea已经是一样的了

完整结构：

``` html
<!-- 文档类型为HTML -->
<!DOCTYPE html>
<html lang="en">
<head>
    <!-- 字符集为UTF-8 -->
    <meta charset="UTF-8">
    <!-- 设置浏览器的兼容性 -->
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    
</body>
</html>
```

### 七、快捷键

1. ![image-20230309224645231](./assets/image-20230309224645231.png)
2. ctrl + y：删除一行
3. 



# 06.img标签

- 图片标签：<img>

  src：指定图像的url（绝对路径 / 相对路径）

  width：图像的宽度（px：像素 ; % , 相对于父元素的百分比）

  height：图像的高度（px：像素 ; % , 相对于父元素的百分比）

  > 买电脑的时候屏幕会有一个分辨率：
  >
  > eg：1920 * 1980，说明你的屏幕上有1920 * 1980个像素点，一个ps就代表一个像素点
  >
  > 
  >
  > 查看图片的高度和宽度：
  >
  > ```html
  > <img src="img\news_logo.png" width="300px"/>
  > ```
  >
  > ![image-20231019214457444](./assets/image-20231019214457444.png)
  >
  > 
  >
  > 但由于设置宽度和高度很容易变形，所以一般只设置宽度或者高度，因为另一个会等比例缩放。
  >
  > 
  >
  > **%单位**：
  >
  > 占父元素的80%
  >
  > ``` html
  > <img src="img\news_logo.png" width="80%"/>
  > ```

- 标题标签：<h1> - <h6>

- 水平线标签：<hr>



> 在默认的浏览器打开：alt + b

路径书写方式:

> ```html
> <!-- 绝对路径: -->
> 1. 绝对磁盘路径（D:/xxxx）
> 2. 绝对网络路径（https://xxxx）
> 
> <!-- 相对路径: -->
> ./ : 当前目录 , ./ 可以省略的
> ../: 上一级目录
> ```
>
> 如果使用的是绝对网络路径，必须要保证互联网上有这张图片，并且在访问的的时候必须联网。
>
> 这里最推荐使用相对路径。

# 07.CSS引入方式

**CSS引入方式**

> 1. 行内样式：仅仅只针对当前一个标签有效，，不方便后期的维护，不推荐。
> 2. 内嵌样式：可以写在页面任何位置，但通常约定写在head标签中。
>    通过定义css选择器，让样式作用于当前页面的指定的标签上。
>    内嵌样式针对当前html页面中所有的h1标签都生效。
> 3. 外联样式，html和css实现了完全的分离，企业开发常用方式。

| 名称     | 语法描述                                          | 示例                                           |
| -------- | ------------------------------------------------- | ---------------------------------------------- |
| 行内样式 | 在标签内使用style属性，属性值是css属性键值对      | &lt;h1 style="xxx:xxx;">中国新闻网&lt;/h1>     |
| 内嵌样式 | 定义&lt;style&gt;标签，在标签内部定义css样式      | &lt;style> h1 {xxx:xxx;} &lt;/style>           |
| 外联样式 | 定义&lt;link&gt;标签，通过href属性引入外部css文件 | &lt;link rel="stylesheet" href="css/news.css"> |

对于上述3种引入方式，企业开发的使用情况如下：

1. 内联样式会出现大量的代码冗余，不方便后期的维护，所以不常用。
2. 内部样式，通过定义css选择器，让样式作用于当前页面的指定的标签上。
3. 外部样式，html和css实现了完全的分离，企业开发常用方式。



**颜色表示**

在前端程序开发中，颜色的表示方式常见的有如下三种：

| **表示方式**   | **表示含义**                      | **取值**                                    |
| -------------- | --------------------------------- | ------------------------------------------- |
| 关键字         | 预定义的颜色名                    | red、green、blue...                         |
| rgb表示法      | 红绿蓝三原色，每项取值范围：0-255 | rgb(0,0,0)、rgb(255,255,255)、rgb(255,0,0)  |
| 十六进制表示法 | #开头，将数字转换成十六进制表示   | #000000、#ff0000、#cccccc，简写：#000、#ccc |

> 十六进制表示法中，如果ff，即某个颜色被拉满了，00则表示没有
>
> 如果两位都为f，则可以直接简写为f
>
> 一般使用的都是第一种和第三种。



**标题字体颜色**

> <span></span>：
>
> 是一个在开发网页时大量会用到的没有语义的布局标签
>
> 特点：一行可以显示多个(组合行内元素)，宽度和高度默认由内容撑开

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>焦点访谈：中国底气 新思想夯实大国粮仓</title>
    <!-- 
	方式二: 内嵌样式 
	如果写个h1：表示只针对当前页面的h1标签，这个称之为标签/元素选择器
	-->
    <style>
        h1 {
            /* color: red; */
            /* color: rgb(0, 0, 255); */
            color: #4D4F53;
        }
    </style>

    <!-- 方式三: 外联样式 stylesheet：层叠样式表，href：指定引入的CSS路径 -->
    <!-- <link rel="stylesheet" href="css/news.css"> -->
</head>
<body>
    <img src="img/news_logo.png"> 新浪政务 > 正文

    <!-- 方式一: 行内样式 -->
    <!-- <h1 style="color: red;">焦点访谈：中国底气 新思想夯实大国粮仓</h1> -->
    
    <h1>焦点访谈：中国底气 新思想夯实大国粮仓</h1>

    <hr>
    2023年03月02日 21:50 央视网
    <hr>

</body>
</html>
```

快捷方式：link，直接选择css

![image-20231020132308385](./assets/image-20231020132308385.png)

备注: 要想拾取某一个网页中的颜色，我们可以借助于浏览器的拾色器插件来完成。【拾色器插件的安装，参照资料中提供的文档即可】

**CSS选择器**

顾名思义：选择器是选取需设置样式的元素（标签），但是我们根据业务场景不同，选择的标签的需求也是多种多样的，所以选择器有很多种，因为我们是做后台开发的，所以对于css选择器，我们只学习最基本的3种。

**选择器通用语法如下**：

```css
选择器名   {
    css样式名：css样式值;
    css样式名：css样式值;
}
```



我们需要学习的3种选择器是元素选择器，id选择器，class选择器，语法以及作用如下：

> 优先级：id选择器 > 类选择器 > 元素选择器

**1.元素（标签）选择器：** 

- 选择器的名字必须是标签的名字
- 作用：选择器中的样式会作用于所有同名的标签上

~~~
元素名称 {
    css样式名:css样式值；
}
~~~

例子如下：

~~~css
 div{
     color: red;
 }
~~~

```html
<h1> Hello CSS </h1>
```





**2.id选择器:**

- 选择器的名字前面需要加上#
- 作用：选择器中的样式会作用于指定id的标签上，而且有且只有一个标签（由于id是唯一的）

~~~
#id属性值 {
    css样式名:css样式值；
}
~~~

例子如下：

~~~css
#did {
    color: blue;
}
~~~

``` html
<h1 id="hid"> CSS id Selector</h1>
```



**3.类选择器：**

- 选择器的名字前面需要加上 .
- 作用：选择器中的样式会作用于所有class的属性值和该名字一样的标签上，可以是多个

~~~
.class属性值 {
    css样式名:css样式值；
}
~~~

例子如下：

~~~css
.cls{
     color: green;
 }
~~~

```html
<h1 class="cls">CSS class Selector</h1>
```



**3.设置字体大小**：`font-size：字体大小 （注意：记得加px）`



# 09.实现标题-超链接

同样，直接写a，就会有对应的快捷方式，如果后面有文字，先空一格，在前面写a即可

> 标签: &lt;a href="..." target="...">央视网</a>
>
> 属性:
>
> - href: 指定资源访问的url
>
> - target: 指定在何处打开资源链接
>
>   __self: 默认值，在当前页面打开_（默认值）
>
>   _blank: 在空白页面打开



**2.text-decoration：规定添加到文本的修饰，none表示定义标准的文本。**

在[CSS 参考手册 (w3school.com.cn)](https://www.w3school.com.cn/cssref/index.asp)找到它

<img src="./assets/image-20231020144939196.png" alt="image-20231020144939196" style="zoom: 50%;" />



<img src="./assets/image-20231020145257771.png" alt="image-20231020145257771" style="zoom:50%;" />

如果不需要超链接下的下划线的话，就把这个属性值置为none

![image-20231020145500508](./assets/image-20231020145500508.png)

具体操作如下：

![image-20231020145718354](./assets/image-20231020145718354.png)



# 10.实现正文-排版

视频标签：<video>

> src：规定视频的url
>
> controls：显示播放控件（即视频的播放按钮、音量调节按钮等等）
>
> ```html
> <video src="video/1.mp4" controls="controls"></video>
> <!-- 如果属性名和属性值一样，则可以直接写一个controls -->
> <video src="video/1.mp4" controls></video>
> ```
>
> 
>
> width：播放器的宽度
>
> height：播放器的高度

音频标签：<audio>

> src：规定音频的url
>
> controls：显示播放控件

段落标签：<p>

> 在HTML中无论输入多少个空格，只会显示一个。 可以使用空格占位符：&nbsp。如果需要多个空格，就使用多次占位符。
>
> > - 那在HTML中，除了空格占位符以外，还有一些其他的占位符(了解, 只需要知道空格的占位符写法即可)，如下：
> >
> >   - | 显示结果 | 描述   | 占位符  |
> >     | :------- | :----- | :------ |
> >     |          | 空格   | \&nbsp; |
> >     | <        | 小于号 | \&lt;   |
> >     | >        | 大于号 | \&gt;   |
> >     | &        | 和号   | \&amp;  |
> >     | "        | 引号   | \&quot; |
> >     | '        | 撇号   | \&apos; |
>
> 
>
> 在HTML页面中,我们在编辑器中通过回车实现的换行, 仅仅在文本编辑器中会看到换行效果, 浏览器是不会解析的, HTML中换行需要通过br标签。
>
> 要想实现换行的效果就必须通过<br>标签来实现。
>
> 通过CSS样式来实现首行缩进和行高：
>
> 1. **首行缩进**
>
> ![image-20231020151502927](./assets/image-20231020151502927.png)
>
> ![image-20231020151535199](./assets/image-20231020151535199.png)
>
> 2. **设置段落行高：<line-height>**
>
>    文本格式标签
>
>    | 效果   | 标签 | 标签(强调) |
>    | ------ | ---- | ---------- |
>    | 加粗   | b    | strong     |
>    | 倾斜   | i    | em         |
>    | 下划线 | u    | ins        |
>    | 删除线 | s    | del        |
>
>    前面的标签 b、i、u、s 就仅仅是实现加粗、倾斜、下划线、删除线的效果，是没有强调语义的。 而后面的strong、em、ins、del在实现加粗、倾斜、下划线、删除线的效果的同时，还带有强调语义。
>
> 3. **设置文本对齐：**
>
>    ![image-20231020152301859](./assets/image-20231020152301859.png)
>
>    ![image-20231020152514107](./assets/image-20231020152514107.png)

文本加粗标签: <b> / <strong>

> <strong>带有强调语义，但最终呈现出来的效果是一样的



# 11.实现正文-布局

1. **盒子模型**

   - 盒子：页面中所有的元素（标签），都可以看做是一个 盒子，由盒子将页面中的元素包含在一个矩形区域内，通过盒子的视角更方便的进行页面布局

   - 盒子模型组成：内容区域（content）、内边距区域（padding）、边框区域（border）、外边距区域（margin）

     <img src="./assets/image-20230310092820616.png" alt="image-20230310092820616" style="zoom:80%;" />

     CSS盒子模型，其实和日常生活中的包装盒是非常类似的，就比如：

     >  margin并不包含在盒子之内

   <img src="./assets/image-20230310093247265.png" alt="image-20230310093247265" style="zoom:80%;" />

2. **布局标签**

   1）布局标签：实际开发网页中，会大量频繁的使用 div 和 span 这两个没有语义的布局标签。

   2）标签：<div> <span>

   3）特点：

   - div标签：

     - 一行只显示一个（独占一行）

     - 宽度默认是父元素的宽度，高度默认由内容撑开

     - 可以设置宽高（width、height）

   - span标签：

     - 一行可以显示多个
     - 宽度和高度默认由内容撑开
     - **不**可以设置宽高（width、height）

   4）验证：

   盒子模型代码：

   ```html
   <!DOCTYPE html>
   <html lang="en">
   <head>
       <meta charset="UTF-8">
       <meta http-equiv="X-UA-Compatible" content="IE=edge">
       <meta name="viewport" content="width=device-width, initial-scale=1.0">
       <title>盒子模型</title>
       <style>
           div {
               width: 200px;  /* 宽度 */
               height: 200px;  /* 高度 */
               box-sizing: border-box; /* 指定width height为盒子的高宽 */
               background-color: aquamarine; /* 背景色 */
               
               padding: 20px 20px 20px 20px; /* 内边距, 上 右 下 左 , 边距都一行, 可以简写: padding: 20px;*/ 
               border: 10px solid red; /* 边框, 宽度 线条类型 颜色 */
               margin: 30px 30px 30px 30px; /* 外边距, 上 右 下 左 , 边距都一行, 可以简写: margin: 30px; */
           }
       </style>
   </head>
   
   <body>
       
       <div>
           A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A 
       </div>
   
   </body>
   </html>
   ```

   F12，对于这个html页面来说，父元素就是body，即整个浏览器的宽度，所以div这个标签的宽度会独占一行

   ![image-20231020155920979](./assets/image-20231020155920979.png)

   查看盒子：

   ![image-20230310094312355](./assets/image-20230310094312355.png)

   我们也可以，通过浏览器的开发者工具，清晰的看到这个盒子，以及每一个部分的大小：

   ![image-20230310094412539](./assets/image-20230310094412539.png)

3. 整个页面都居中，有一个专业的术语：版心居中

4. **布局实现**

   CSS属性：

   > width：设置宽度
   >
   > height：设置高度
   >
   > border：设置边框的属性，如：1px solid #000；
   >
   > padding：内边距
   >
   > margin：外边距
   >
   > 
   >
   > 注意：如果只需要设置某一个方位的边框、内边距、外边距，可以在属性名后加上 –位置，如：padding-top、padding-left、padding-right …

   - 第一步：需要将body中的新闻标题部分、正文部分使用一个 div 布局标签将其包裹起来，方便通过css设置内容占用的宽度，比如：65%。
   - 第二步：通过css为该div设置外边距，左右的外边距分别为：17.5%，上下外边距靠边展示即可，为：0%。

   代码：

   ``` css
   #center {
               width: 65%;
               /* margin: 0% 17.5% 0% 17.5% ; */ /* 外边距, 上 右 下 左 */
               margin: 0 auto;
           }
   ```

   ![image-20231020161339483](./assets/image-20231020161339483.png)

   ![image-20231020161437102](./assets/image-20231020161437102.png)

   ![image-20231020161455657](./assets/image-20231020161455657.png)

   所以下面代码的意思是：上面和下面都是0，左边和右边让浏览器自动计算。

   自动计算的结果就是左边一半，右边一半

   ```css
   margin: 0 auto;
   ```



# 12.表格标签

> - &lt;table> : 用于定义整个表格, 可以包裹多个 &lt;tr>， 常用属性如下： 
>
>   - border：规定表格边框的宽度
>
>     效果为出现边框
>
>   - width：规定表格的宽度
>
>     如果没有设置width，则默认由内容撑开
>
>   - cellspacing: 规定单元之间的空间
>
> - &lt;tr> : 表格的行，可以包裹多个 &lt;td>  （table row表格行）
>
> - &lt;td> : 表格单元格(普通)，可以包裹内容 , 如果是表头单元格，可以替换为 &lt;th>  （table data表格数据）（tableheadercell 表头单元格）
>
>   表头单元格具有加粗并居中展示的效果

```html
<table border="1px" cellspacing="0"  width="600px">
    <tr>
        <th>序号</th>
        <th>品牌Logo</th>
        <th>品牌名称</th>
        <th>企业名称</th>
    </tr>
    <tr>
        <td>1</td>
        <td> <img src="img/huawei.jpg" width="100px"> </td>
        <td>华为</td>
        <td>华为技术有限公司</td>
    </tr>
    <tr>
        <td>2</td>
        <td> <img src="img/alibaba.jpg"  width="100px"> </td>
        <td>阿里</td>
        <td>阿里巴巴集团控股有限公司</td>
    </tr>
</table>
```



# 13.表单标签

<img src="./assets/image-20230309175941128.png" alt="image-20230309175941128" style="zoom:50%;" /> 

那其实，上述的整个窗口是一个表单，而表单是一项一项的，这个我们称为表单项 或 表单元素。

- 表单标签: &lt;form>

- 表单属性:

  - action: 规定表单提交时，向何处发送表单数据，表单提交的URL。

    没有设置的时候，默认提交到当前页面。

  - method: 规定用于发送表单数据的方式，常见为： GET、POST。

    - GET：表单数据是拼接在url后面的， 如： xxxxxxxxxxx?username=Tom&age=12，url中能携带的表单数据大小是有限制的。

      并且get是method的默认值。

      <img src="./assets/image-20230309191725329.png" alt="image-20230309191725329" style="zoom:80%;" />

    - POST： 表单数据是在请求体（消息体）中携带的，大小没有限制。

      打开F12：

      这里可以看见表单的请求方式是post

      ![image-20231020165501257](./assets/image-20231020165501257.png)

      在Payload里可以看见表单的提交数据

      ![image-20230309192625939](./assets/image-20230309192625939.png)

      点击view source可以看到原始的数据格式

      ![image-20231020165630040](./assets/image-20231020165630040.png)

      这一部分我们叫做消息体 / 请求体

- 表单项标签: 不同类型的input元素、下拉列表、文本域等。

  - input: 定义表单项，通过type属性控制输入形式
  - select: 定义下拉列表
  - textarea: 定义文本域

同样，直接输入form

![image-20231020164651918](./assets/image-20231020164651918.png)

PS：

表单中的所有表单项，要想能够正常的采集数据，在提交的时候能提交到服务端，表单项必须指定name属性。 否则，无法提交该表单项。

```html
用户名: <input type="text" name="username">
```



# 14.表单项标签

**1）介绍**

在一个表单中，可以存在很多的表单项，而虽然表单项的形式各式各样，但是表单项的标签其实就只有三个，分别是：

- &lt;input>: 表单项 , 通过type属性控制输入形式。

  | type取值                 | **描述**                             |
  | ------------------------ | ------------------------------------ |
  | text                     | 默认值，定义单行的输入字段           |
  | password                 | 定义密码字段                         |
  | radio                    | 定义单选按钮                         |
  | checkbox                 | 定义复选框                           |
  | file                     | 定义文件上传按钮                     |
  | date/time/datetime-local | 定义日期/时间/日期时间               |
  | number                   | 定义数字输入框                       |
  | email                    | 定义邮件输入框                       |
  | hidden                   | 定义隐藏域                           |
  | submit / reset / button  | 定义提交按钮 / 重置按钮 / 可点击按钮 |

  > radio中的一组，name属性值必须一样！
  >
  > <label>：聚焦到被包围的身上
  >
  > number：除了数字以外的都录不进去
  >
  > ``` html
  > <input type="hidden" name="id" value="1">
  > ```

- &lt;select>: 定义下拉列表, &lt;option> 定义列表项

  <option>需要给value赋值

  ```html
  学历: <select name="degree">
                 <option value="">----------- 请选择 -----------</option>
                 <option value="1">大专</option>
                 <option value="2">本科</option>
                 <option value="3">硕士</option>
                 <option value="4">博士</option>
            </select>  <br><br>
  ```

  

- &lt;textarea>: 文本域

  里面有cols、rows属性

  ```html
  <textarea name="description" cols="30" rows="10"></textarea> 
  ```

  

**2）演示**

创建一个新的表单项的html文件，具体内容如下：

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>HTML-表单项标签</title>
</head>
<body>

<!-- value: 表单项提交的值 -->
<form action="" method="post">
     姓名: <input type="text" name="name"> <br><br>
     密码: <input type="password" name="password"> <br><br> 
     性别: <input type="radio" name="gender" value="1"> 男
          <label><input type="radio" name="gender" value="2"> 女 </label> <br><br>
     爱好: <label><input type="checkbox" name="hobby" value="java"> java </label>
          <label><input type="checkbox" name="hobby" value="game"> game </label>
          <label><input type="checkbox" name="hobby" value="sing"> sing </label> <br><br>
     图像: <input type="file" name="image">  <br><br>
     生日: <input type="date" name="birthday"> <br><br>
     时间: <input type="time" name="time"> <br><br>
     日期时间: <input type="datetime-local" name="datetime"> <br><br>
     邮箱: <input type="email" name="email"> <br><br>
     年龄: <input type="number" name="age"> <br><br>
     学历: <select name="degree">
               <option value="">----------- 请选择 -----------</option>
               <option value="1">大专</option>
               <option value="2">本科</option>
               <option value="3">硕士</option>
               <option value="4">博士</option>
          </select>  <br><br>
     描述: <textarea name="description" cols="30" rows="10"></textarea>  <br><br>
     <input type="hidden" name="id" value="1">
	 	
     <!-- 表单常见按钮 -->
     <input type="button" value="按钮">
     <input type="reset" value="重置"> 
     <input type="submit" value="提交">   
     <br>
</form>

</body>
</html>
```



通过浏览器打开上述的表单项html文件，最终展示出的表单信息如下：

![image-20230309221308252](./assets/image-20230309221308252.png) 

而对于input type="hidden"，是一个隐藏域，在表单中并不会显示出来，但是在提交表单的时候，是会提交到服务端的。 接下来，我们就点击提交按钮，来提交当前表单，看看提交的数据：

![image-20230309221530214](./assets/image-20230309221530214.png) 



# 15.JS介绍

Web标准也称为网页标准，由一系列的标准组成，大部分由W3C（ World Wide Web Consortium，万维网联盟）负责制定。

>  三个组成部分：
>
>  HTML：负责网页的基本结构（页面元素和内容）。
>
>  CSS：负责网页的表现效果（页面元素的外观、位置等页面样式，如：颜色、大小等）。
>
>  JavaScript：负责网页的行为（交互效果）。

- JavaScript（简称：JS） 是一门跨平台、面向对象的脚本语言。是用来控制网页行为的，它能使网页可交互。

  > 脚本语言：将来不需要经过编译，直接通过浏览器的解析就行了
  >
  > 而java需要经过编译，将我们编写好的源代码java编写成字节码文件，然后再由虚拟机去运行

- JavaScript 和 Java 是完全不同的语言，不论是概念还是设计。但是基础语法类似。

- JavaScript 在 1995 年由 Brendan Eich 发明，并于 1997 年成为 ECMA 标准。

- ECMAScript6 (ES6) 是最主流的 JavaScript 版本（发布于 2015 年)。

> **ECMA：** ECMA国际（前身为欧洲计算机制造商协会），制定了标准化的脚本程序设计语言 ECMAScript，这种语言得到广泛应用。而JavaScript是遵守ECMAScript的标准的。

# 16.JS-引入方式

- **第一种方式：**内部脚本，将JS代码定义在HTML页面中

  - JavaScript代码必须位于&lt;script&gt;&lt;/script&gt;标签之间
  - 在HTML文档中，可以在任意地方，放置任意数量的&lt;script&gt;
  - 一般会把脚本置于&lt;body&gt;元素的下面，可改善显示速度

  例子：

  ~~~html
  <script>
      //调用里面的方法
      alert("Hello JavaScript")
  </script>
  ~~~

  

  **第二种方式：**外部脚本将， JS代码定义在外部 JS文件中，然后引入到 HTML页面中

  - 外部JS文件中，只包含JS代码，不包含<script&gt;标签

  - <script>标签不能自闭合

  例子：

  ~~~html
  <script src="js/demo.js"></script>
  ~~~

  注意：demo.js中只有js代码，没有&lt;script&gt;标签



# 17.JS-基础语法-书写语法

1. **书写语法**

- 区分大小写：与 Java 一样，变量名、函数名以及其他一切东西都是区分大小写的

- 每行结尾的分号可有可无（但建议写上）

- 大括号表示代码块

- 注释：

  - 单行注释：// 注释内容

  - 多行注释：/* 注释内容 */

    

2. **输出语句**

| api              | 描述                  |
| ---------------- | --------------------- |
| window.alert()   | 浏览器弹出警告框      |
| document.write() | 写入HTML,在浏览器展示 |
| console.log()    | 写入浏览器控制台      |

> console是浏览器里的控制台对象，调用里面的方法就可以将数据写入浏览器的控制台
>
> ![1668101840992](./assets/1668101840992.png)

# 18.JS-基础语法-变量

在js中，变量的声明和java中还是不同的。首先js中主要通过如下3个关键字来声明变量的：

| 关键字          | 解释                                                         |
| --------------- | ------------------------------------------------------------ |
| var（Variable） | 早期ECMAScript5中用于变量声明的关键字                        |
| let             | ECMAScript6中新增的用于变量声明的关键字，相比较var，let只在代码块内生效 |
| const           | 声明常量的，常量一旦声明，不能修改                           |

在js中声明变量还需要注意如下几点：

- JavaScript 是一门弱类型语言，变量可以存放不同类型的值 。
- 变量名需要遵循如下规则：
  - 组成字符可以是任何字母、数字、下划线（_）或美元符号（$）
  - 数字不能开头
  - 建议使用驼峰命名

> lECMAScript 6 新增了 let 关键字来定义变量。它的用法类似于 var，但是所声明的变量，只在 let 关键字所在的代码块内有效，且不允许重复声明。
>
> lECMAScript 6 新增了 const 关键字，用来声明一个只读的常量。一旦声明，常量的值就不能改变。

- 声明：

  • var：声明变量，全局作用域/函数作用域，允许重复声明

  ``` js
  //var定义变量
  var a = 10;
  a = "张三";
  alert(a);
  
  //特点1 : 作用域比较大, 全局变量
  {
      var x = 1;
  }
  alert(x);
  
  //特点2 : 可以重复定义
  {
       var x = 1;
       var x = "A";
  }
  alert(x);
  ```

  

  • let：声明变量，块级作用域，不允许重复声明

  ```js
  //let : 局部变量 ; 不能重复定义 
  {
      let x = 1;
  }
  alert(x);
  ```

  ![1668102527993](./assets/1668102527993.png)

  • const：声明常量，一旦声明，常量的值不能改变

  ```js
  const pi = 3.14;
  pi = 3.15;
  alert(p);
  ```

  浏览器f12抓包，来到控制台页面发现直接报错了，

  ![1668102736759](./assets/1668102736759.png)

  

# 19.JS-基础语法-数据类型&运算符

虽然js是弱数据类型的语言，但是js中也存在数据类型，js中的数据类型分为 ：原始类型（类似于java中的基本数据类型） 和 引用类型，具体有如下类型

| 数据类型  | 描述                                               |
| --------- | -------------------------------------------------- |
| number    | 数字（整数、小数、NaN(Not a Number)）              |
| string    | 字符串，单双引皆可                                 |
| boolean   | 布尔。true，false                                  |
| null      | 对象为空                                           |
| undefined | 当声明的变量未初始化时，该变量的默认值是 undefined |

> 使用typeof函数可以返回变量的数据类型

```html
<script>

    //原始数据类型
    alert(typeof 3); //number
    alert(typeof 3.14); //number

    alert(typeof "A"); //string
    alert(typeof 'Hello');//string

    alert(typeof true); //boolean
    alert(typeof false);//boolean

    alert(typeof null); //object 

    var a ;
    alert(typeof a); //undefined
    
</script>
```

1. **查看官方文档：**

   <img src="./assets/image-20231020191243270.png" alt="image-20231020191243270" style="zoom:50%;" />

   <img src="./assets/image-20231020191338976.png" alt="image-20231020191338976" style="zoom:50%;" />

   滑到底

   ![image-20231020191427759](./assets/image-20231020191427759.png)

   ![image-20231020191456646](./assets/image-20231020191456646.png)

   

2. **运算符：**

   | 运算规则   | 运算符                               |
   | ---------- | ------------------------------------ |
   | 算术运算符 | + , - , * , / , % , ++ , --          |
   | 赋值运算符 | = , += , -= , *= , /= , %=           |
   | 比较运算符 | &gt; , < , >= , <= , != , == , ===   |
   | 逻辑运算符 | && , \|\| , !                        |
   | 三元运算符 | 条件表达式 ? true_value: false_value |

   > - ==：只比较值是否相等，不区分数据类型，哪怕类型不一致，==也会自动转换类型进行值得比较
   > - ===：不光比较值，还要比较类型，如果类型不一致，直接返回false

   ```js
   alert(age == _age);//true ，只比较值
   alert(age === _age);//false ，类型不一样
   alert(age === $age);//true ，类型一样，值一样
   ```

   

   1. 字符串类型转为数字：

      js中可以通过parseInt()函数来进行将其他类型转换成数值类型。如果字面值不是数字，则转为NaN。

      ```js
      // 类型转换 - 其他类型转为数字
      alert(parseInt("12")); //12
      alert(parseInt("12A45")); //12
      alert(parseInt("A45"));//NaN (not a number)，因为前面一个数字都没有
      ```

   2. 其他类型转为boolean：

      > Number：0 和 NaN 为false，其他均转为true。
      >
      > String：空字符串为false，其他均转为true。即使" "（空格字符串也是true）
      >
      > Null 和 undefined ：均转为false。

3. **流程控制语句**

   if…else if …else…

   switch

   for 

   while

   do … while

   参考官方文档：https://www.w3school.com.cn/jsref/jsref_statements.asp



# 20.JS-函数

**第一种定义格式**

~~~js
function 函数名(参数1,参数2..){
    要执行的代码（这个也称之为函数体）
}
~~~

因为JavaScript是弱数据类型的语言，所以有如下几点需要注意：

- 形式参数不需要声明类型，并且JavaScript中不管什么类型都是let或者var去声明，加上也没有意义。
- 返回值也不需要声明类型，直接return即可

如下示例：

~~~js
function add(a, b){
    return a + b;
}
~~~

演示：

~~~html
<script>
     function add(a,b){
        return  a + b;
     }
</script>
~~~

但是上述只是定义函数，**函数需要被调用才能执行！**

第二步：因为定义的add函数有返回值，所以我们可以接受返回值，并且输出到浏览器上，添加如下代码：

~~~js
let result = add(10,20);
alert(result); 
~~~



**第二种定义格式**

第二种可以通过var去定义函数的名字，具体格式如下：

~~~js
var functionName = function (参数1,参数2..){   
	//要执行的代码
}
~~~

~~~html
<script>

    //定义函数 - 1
    // function add(a,b){
    //    return  a + b;
    // }

    //定义函数 - 2
    var add = function(a,b){
        return  a + b;
    }


    //函数调用
    var result = add(10,20);
    alert(result);
    
</script> 
~~~



JS中，函数调用可以传递任意个数的参数。

我们在调用add函数时，再添加2个参数，修改代码如下：

~~~js
var result = add(10,20,30,40);
~~~

浏览器打开，发现没有错误，并且依然弹出30，这是为什么呢？

因为在JavaScript中，函数的调用只需要名称正确即可，参数列表不管的。如上述案例，10传递给了变量a，20传递给了变量b,而30和40没有变量接受，但是不影响函数的正常调用。



# 21.JS-对象-Array数组

JavaScript中的对象有很多，主要可以分为如下3大类，我们可以打开[W3school在线学习文档](https://www.w3school.com.cn/)，来到首页，在左侧栏找到浏览器脚本下的JavaScript，如下图所示：

![1668587524509](./assets/1668587524509.png)



然后进入到如下界面，点击右侧的参考书

![1668587661914](./assets/1668587661914.png) 

可以大体分页3大类：

第一类：基本对象,我们主要学习Array和JSON和String

![1668587953841](./assets/1668587953841.png) 

第二类：BOM（Browser Object Model）对象,主要是和浏览器相关的几个对象

![1668588039871](./assets/1668588039871.png) 

第三类：DOM（Document Object Model）对象，JavaScript中将html的每一个标签都封装成一个对象

![1668588141399](./assets/1668588141399.png) 



**基本对象**

**Array对象**

语法格式

Array对象时用来定义数组的。常用语法格式有如下2种：

方式1：

~~~js
var 变量名 = new Array(元素列表); 
~~~

例如：

~~~js
var arr = new Array(1,2,3,4); //1,2,3,4 是存储在数组中的数据（元素）
~~~



方式2：

~~~js
var 变量名 = [ 元素列表 ]; 
~~~

例如：

~~~js
var arr = [1,2,3,4]; //1,2,3,4 是存储在数组中的数据（元素）
~~~

数组定义好了，那么我们该如何获取数组中的值呢？和java中一样，需要通过索引来获取数组中的值。语法如下：

~~~js
arr[索引] = 值;
~~~

接下来，我们在VS Code中创建名为02. JS-对象-Array.html的文件，按照上述的语法定义数组，并且通过索引来获取数组中的值。

~~~html
<script>
    //定义数组
     var arr = new Array(1,2,3,4);
     var arr = [1,2,3,4];
	//获取数组中的值，索引从0开始计数
     console.log(arr[0]);
     console.log(arr[1]);
</script>
~~~

浏览器控制台观察的效果如下：输出1和2

![1668590655291](./assets/1668590655291.png) 

console.log的快捷方式：

![image-20231020195741262](./assets/image-20231020195741262.png)



**特点**

与java中不一样的是，JavaScript中数组相当于java中的集合，数组的长度是可以变化的。而且JavaScript是弱数据类型的语言，所以数组中可以存储任意数据类型的值。

~~~js
//特点: 长度可变 类型可变
var arr = [1,2,3,4];
arr[10] = 50;

console.log(arr[10]);
console.log(arr[9]);
console.log(arr[8]);
~~~

上述代码定义的arr变量中，数组的长度是4，但是我们直接再索引10的位置直接添加了数据10，并且输出索引为10的位置的元素，浏览器控制台数据结果如下：

![1668590614787](./assets/1668590614787.png) 

因为索引8和9的位置没有值，所以输出内容undefined,当然，我们也可以给数组添加其他类型的值，添加代码如下：注释掉之前控制台输出的代码

~~~js
//特点: 长度可变 类型可变
var arr = [1,2,3,4];
arr[10] = 50;

// console.log(arr[10]);
// console.log(arr[9]);
// console.log(arr[8]);

arr[9] = "A";
arr[8] = true;

console.log(arr);
~~~

浏览器控制台输出结果如下：

![1668590895662](./assets/1668590895662.png) 



##### 属性和方法

属性：

| 属性   | 描述                         |
| :----- | :--------------------------- |
| length | 设置或返回数组中元素的数量。 |

方法：

| 方法方法  | 描述                                             |
| :-------- | :----------------------------------------------- |
| forEach() | 遍历数组中的每个有值得元素，并调用一次传入的函数 |
| push()    | 将新元素添加到数组的末尾，并返回新的长度         |
| splice()  | 从数组中删除元素                                 |

- length属性：

  length属性可以用来获取数组的长度，所以我们可以借助这个属性，来遍历数组中的元素，添加如下代码：

  ~~~js
  var arr = [1,2,3,4];
  arr[10] = 50;
  	for (let i = 0; i < arr.length; i++) {
  	console.log(arr[i]);
  }
  ~~~

  浏览器控制台输出结果如图所示：

  ![1668591566013](./assets/1668591566013.png) 

for的快捷方式：

![image-20231020200210469](./assets/image-20231020200210469.png)



- forEach()函数

  这个方法的参数，需要传递一个函数，而且这个函数接受一个参数，就是遍历时数组的值。每遍历一次都会调用一次这个方法修改之前的遍历代码如下：

  ~~~js
  //e是形参，接受的是数组遍历时的值
  arr.forEach(function(e){
       console.log(e);
  })
  ~~~

  当然了，在ES6中，引入**箭头函数**的写法，语法类似java中lambda表达式，修改上述代码如下：function关键字可以省略，小括号里代表的是方法的形参列表，没有形参就不写。

  > **箭头函数(ES6)**：是用来简化函数定义语法的。具体形式为: (…) => { … } ，如果需要给箭头函数起名字： var xxx = (…) => { … }

  ~~~js
  arr.forEach((e) => {
       console.log(e);
  }) 
  ~~~

浏览器输出结果如下：注意的是，**没有元素的内容是不会输出的**，因为forEach只会遍历有值的元素，而for循环是遍历里面的所有的元素，包括undefined  



- push()函数

  push()函数是用于向数组的末尾添加元素的，其中函数的参数就是需要添加的元素，编写如下代码：向数组的末尾添加3个元素

  ~~~js
  //push: 添加元素到数组末尾
  arr.push(7,8,9);
  console.log(arr); 
  ~~~

  

- splice()函数

  splice()函数用来数组中的元素，函数中填入2个参数。

  参数1：表示从哪个索引位置删除

  参数2：表示删除元素的个数

  如下代码表示：从索引2的位置开始删，删除2个元素

  ~~~js
  //splice: 删除元素
  arr.splice(2,2);
  console.log(arr);
  ~~~




# 22.JS-对象-String字符串

**语法格式**

String对象的创建方式有2种：

方式1：

~~~js
var 变量名 = new String("…") ; //方式一
~~~

例如：

~~~js
var str = new String("Hello String");
~~~



> JS中使用单引号双引号都可以

方式2：

~~~js
var 变量名 = "…" ; //方式二
~~~

例如：

~~~js
var str = 'Hello String';
~~~

~~~html
<script>
    //创建字符串对象
    //var str = new String("Hello String");
    var str = "  Hello String    ";

    console.log(str);
</script>
~~~



**属性和方法**

String对象也提供了一些常用的属性和方法，如下表格所示：

属性（属性后面不用加括号）：

| 属性   | 描述           |
| ------ | -------------- |
| length | 字符串的长度。 |

方法：

| 方法        | 描述                                                 |
| ----------- | ---------------------------------------------------- |
| charAt()    | 返回在指定位置的字符。                               |
| indexOf()   | 检索字符串。                                         |
| trim()      | 去除字符串两边的空格                                 |
| substring() | 提取字符串中两个指定的索引号之间的字符。（左闭右开） |

- length属性：

  length属性可以用于返回字符串的长度，添加如下代码：

  ~~~js
  //length
  console.log(str.length);
  ~~~

- charAt()函数：

  charAt()函数用于返回在指定索引位置的字符，函数的参数就是索引。添加如下代码：

  ~~~js
  console.log(str.charAt(4));
  ~~~

- indexOf()函数

  indexOf()函数用于检索指定内容在字符串中的索引位置的，返回值是索引，参数是指定的内容。添加如下代码：

  ~~~js
  console.log(str.indexOf("lo"));
  ~~~

- trim()函数

  trim()函数用于去除字符串两边的空格的。添加如下代码：

  ~~~js
  var s = str.trim();
  console.log(s.length);
  ~~~

- substring()函数

  substring()函数用于截取字符串的。

  ~~~js
  console.log(s.substring(0,5));
  ~~~



# 23.JSON对象

##### 自定义对象

在 JavaScript 中自定义对象特别简单，其语法格式如下：多个属性之间使用逗号分隔

~~~js
var 对象名 = {
    属性名1: 属性值1, 
    属性名2: 属性值2,
    属性名3: 属性值3,
    函数名称: function(形参列表){}
};

~~~

我们可以通过如下语法调用属性：

~~~js
对象名.属性名
~~~

通过如下语法调用函数：

~~~js
对象名.函数名()
~~~

~~~html
<script>
    //自定义对象
    var user = {
        name: "Tom",
        age: 10,
        gender: "male",
        eat: function(){
             console.log("用膳~");
         }
    }

    console.log(user.name);
    user.eat();
<script>
~~~



其中上述函数定义的语法可以简化成如下格式：

~~~js
    var user = {
        name: "Tom",
        age: 10,
        gender: "male",
        // eat: function(){
        //      console.log("用膳~");
        //  }
        eat(){
            console.log("用膳~");
        }
    }
~~~



##### json对象

JSON对象：**J**ava**S**cript **O**bject **N**otation，JavaScript对象标记法。是通过JavaScript标记法书写的文本。其格式如下：

~~~js
{
    "key":value,
    "key":value,
    "key":value
}
~~~

其中，**key必须使用引号并且是双引号标记，value可以是任意数据类型。**

JSON字符串：

- 首先是1个字符串
- 属性名使用双引号引起来，不能单引号
- 属性值如果是字符串型也必须双引号

> value 的数据类型为：
>
> 数字（整数或浮点数）
>
> 字符串（在双引号中）
>
> 逻辑值（true 或 false）
>
> 数组（在方括号中）
>
> 对象（在花括号中）
>
> null

由于其语法简单，层次结构鲜明，现多用于作为数据载体，在网络中进行数据传输。

如下图所示：前后台交互时，我们需要传输数据，但是java中的对象我们该怎么去描述呢？我们可以使用如图所示的xml格式，可以清晰的描述java中需要传递给前端的java对象。

![1668597000013](./assets/1668597000013.png) 



但是xml格式存在如下问题：

- 标签需要编写双份，占用带宽，浪费资源
- 解析繁琐

所以我们可以使用json来替代，如下图所示：

![1668597176685](./assets/1668597176685.png) 



接下来我们通过代码来演示json对象：注释掉之前的代码，编写代码如下：

~~~js
var jsonstr = '{"name":"Tom", "age":18, "addr":["北京","上海","西安"]}';
alert(jsonstr.name);
~~~

浏览器输出结果如下：

![1668597352197](./assets/1668597352197.png) 

为什么呢？**因为上述是一个json字符串，不是json对象，所以我们需要借助如下函数来进行json字符串和json对象的转换。**添加代码如下：

~~~js
var obj = JSON.parse(jsonstr);
alert(obj.name);
~~~

此时浏览器输出结果如下：

![1668597489911](./assets/1668597489911.png) 

当然了，我们也可以通过如下函数将json对象再次转换成json字符串。添加如下代码：

~~~js
alert(JSON.stringify(obj));
~~~

浏览器输出结果如图所示：

![1668597624263](./assets/1668597624263.png) 



# 24.JS-对象-BOM

BOM的全称是Browser Object Model,翻译过来是浏览器对象模型。也就是JavaScript将浏览器的各个组成部分封装成了对象。我们要操作浏览器的部分功能，可以通过操作BOM对象的相关属性或者函数来完成。例如：我们想要将浏览器的地址改为`http://www.baidu.com`,我们就可以通过BOM中提供的location对象的href属性来完成，代码如下：`location.href='http://www.baidu.com'`

查询参考手册：

点击JavaScript，然后一直往下翻

<img src="./assets/image-20231021130431695.png" alt="image-20231021130431695" style="zoom:50%;" />

BOM中提供了如下5个对象：

| 对象名称  | 描述           |
| :-------- | :------------- |
| Window    | 浏览器窗口对象 |
| Navigator | 浏览器对象     |
| Screen    | 屏幕对象       |
| History   | 历史记录对象   |
| Location  | 地址栏对象     |

> Navigator主要封装浏览器的应用名称、浏览器的版本、浏览器的内核等信息

上述5个对象与浏览器各组成对应的关系如下图所示：

![](Z:/资料/day02-JavaScript-Vue/讲义/assets/image-20210815194911914.png) 

对于上述5个对象，我们重点学习的是Window对象、Location对象这2个。



### **Window对象**

window对象指的是浏览器窗口对象，是JavaScript的全部对象，所以对于window对象，我们可以直接使用，并且对于window对象的方法和属性，我们可以省略window.例如：我们之前学习的alert()函数其实是属于window对象的,其完整的代码如下：

> 直接写window就拿到了浏览器中的window对象

~~~
window.alert('hello');
~~~

其可以省略window.  所以可以简写成

~~~
alert('hello')
~~~

所以对于window对象的属性和方法，我们都是采用简写的方式。window提供了很多属性和方法，下表列出了常用属性和方法

window对象提供了获取其他BOM对象的属性：

| 属性      | 描述                  |
| --------- | --------------------- |
| history   | 用于获取history对象   |
| location  | 用于获取location对象  |
| Navigator | 用于获取Navigator对象 |
| Screen    | 用于获取Screen对象    |

也就是说我们要使用location对象，只需要通过代码`window.location`或者简写`location`即可使用

window也提供了一些常用的函数，如下表格所示：

| 函数          | 描述                                                   |
| ------------- | ------------------------------------------------------ |
| alert()       | 显示带有一段消息和一个确认按钮的警告框。               |
| comfirm()     | 显示带有一段消息以及确认按钮和取消按钮的对话框。       |
| setInterval() | 按照指定的周期（以毫秒计）来调用函数或计算表达式。     |
| setTimeout()  | 在指定的毫秒数后调用函数或计算表达式（只会调用一次）。 |

接下来，我们通过VS Code中创建名为05. JS-对象-BOM.html文件来编写代码来演示上述函数：

- alert()函数：弹出警告框，函数的内容就是警告框的内容

  ~~~html
  <script>
      //window对象是全局对象，window对象的属性和方法在调用时可以省略window.
      window.alert("Hello BOM");
      alert("Hello BOM Window");
  </script> 
  ~~~

  

- confirm()函数：弹出确认框，并且提供用户2个按钮，分别是确认和取消。

  添加如下代码：

  ~~~js
  confirm("您确认删除该记录吗?"); 
  ~~~

  

  但是我们怎么知道用户点击了确认还是取消呢？所以这个函数有一个返回值，当用户点击确认时，返回true，点击取消时，返回false。我们根据返回值来决定是否执行后续操作。修改代码如下：再次运行，可以查看返回值true或者false

  ~~~js
  var flag = confirm("您确认删除该记录吗?");
  alert(flag);
  ~~~

- setInterval(fn,毫秒值)：定时器，用于周期性的执行某个功能，并且是**循环执行**。该函数需要传递2个参数：

  fn:函数，需要周期性执行的功能代码

  毫秒值：间隔时间

  注释掉之前的代码，添加代码如下：

  ~~~js
  //定时器 - setInterval -- 周期性的执行某一个函数
  var i = 0;
  setInterval(function(){
       i++;
       console.log("定时器执行了"+i+"次");
  },2000);
  ~~~

  刷新页面，浏览器每个一段时间都会在控制台输出，结果如下：

  ![1668795435780](Z:/资料/day02-JavaScript-Vue/讲义/assets/1668795435780.png) 

- setTimeout(fn,毫秒值) ：定时器，只会在一段时间后**执行一次功能**。参数和上述setInterval一致

  注释掉之前的代码，添加代码如下：

  ~~~js
  //定时器 - setTimeout -- 延迟指定时间执行一次 
  setTimeout(function(){
  	alert("JS");
  },3000);
  ~~~

  浏览器打开，3s后弹框，关闭弹框，发现再也不会弹框了。



### Location对象

location是指代浏览器的地址栏对象，对于这个对象，我们常用的是href属性，用于获取或者设置浏览器的地址信息，添加如下代码：

~~~js
//获取浏览器地址栏信息
alert(location.href);
//设置浏览器地址栏信息
location.href = "https://www.itcast.cn";
~~~

浏览器效果如下：首先弹框展示浏览器地址栏信息，

![1668796236628](Z:/资料/day02-JavaScript-Vue/讲义/assets/1668796236628.png) 

然后点击确定后，因为我们设置了地址栏信息，所以浏览器跳转到传智首页



## DOM对象

DOM介绍

DOM：Document Object Model 文档对象模型。也就是 JavaScript 将 HTML 文档的各个组成部分封装为对象。

DOM 其实我们并不陌生，之前在学习 XML 就接触过，只不过 XML 文档中的标签需要我们写代码解析，而 HTML 文档是浏览器解析。封装的对象分为

- Document：整个文档对象

  在F12的元素里，我们可以看见所有的元素

  <img src="./assets/image-20231021134049246.png" alt="image-20231021134049246" style="zoom: 33%;" />

- Element：元素对象（元素就是标签）

- Attribute：属性对象

- Text：文本对象

- Comment：注释对象

如下图，左边是 HTML 文档内容，右边是 DOM 树

![1668796698067](./assets/1668796698067.png) 

主要作用如下：

- 改变 HTML 元素的内容
- 改变 HTML 元素的样式（CSS）
- 对 HTML DOM 事件作出反应
- 添加和删除 HTML 元素



DOM是 W3C（万维网联盟）的标准，定义了访问HTML和XML文档的标准，分为3个不同的部分：

1.Core DOM - 所有文档类型的标准模型

Document：整个文档对象

Element：元素对象

Attribute：属性对象

Text：文本对象（标签之间的文本对象）

Comment：注释对象

2.XML DOM - XML 文档的标准模型 

3.HTML DOM - HTML 文档的标准模型（HTML DOM是在核心DOM上进行了扩充），将所有的HTML标签都封装成了一个单独的对象

Image：<img>

Button ：<input type='button'>

> 我们学习的是属于HTM DOM，是用来操作HTML文档的标准模型。



**获取DOM对象**

我们知道DOM的作用是通过修改HTML元素的内容和样式等来实现页面的各种动态效果，但是我们要操作DOM对象的前提是先获取元素对象，然后才能操作。所以学习DOM,主要的核心就是学习如下2点：

- 如何获取DOM中的元素对象（Element对象 ，也就是标签）
- 如何操作Element对象的属性,也就是标签的属性。

HTML中的Element对象可以通过Document对象获取，而Document对象是通过window对象获取的。document对象提供的用于获取Element元素对象的api如下表所示：

| 函数                              | 描述                                     |
| --------------------------------- | ---------------------------------------- |
| document.getElementById()         | 根据id属性值获取，返回单个Element对象    |
| document.getElementsByTagName()   | 根据标签名称获取，返回Element对象数组    |
| document.getElementsByName()      | 根据name属性值获取，返回Element对象数组  |
| document.getElementsByClassName() | 根据class属性值获取，返回Element对象数组 |

接下来我们通过VS Code中创建名为07. JS-对象-DOM-获取元素.html的文件来演示上述api，首先在准备如下页面代码：

~~~html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>JS-对象-DOM</title>
</head>

<body>
    <img id="h1" src="img/off.gif">  <br><br>

    <div class="cls">传智教育</div>   <br>
    <div class="cls">黑马程序员</div>  <br>

    <input type="checkbox" name="hobby"> 电影
    <input type="checkbox" name="hobby"> 旅游
    <input type="checkbox" name="hobby"> 游戏
</body>

</html>
~~~

- document.getElementById()： 根据标签的id属性获取标签对象，id是唯一的，所以获取到是单个标签对象。

  添加如下代码：

  ~~~html
  <script>
  //1. 获取Element元素
  
  //1.1 获取元素-根据ID获取
   var img = document.getElementById('h1');
   alert(img);
  </script>
  ~~~

  浏览器打开，效果如图所示：从弹出的结果能够看出，这是一个图片标签对象

  ![1668798266255](Z:/资料/day02-JavaScript-Vue/讲义/assets/1668798266255.png) 

- document.getElementsByTagName() :  根据标签的名字获取标签对象，同名的标签有很多，所以返回值是数组。

  添加如下代码:

  ~~~js
  //1.2 获取元素-根据标签获取 - div
  var divs = document.getElementsByTagName('div');
  for (let i = 0; i < divs.length; i++) {
       alert(divs[i]);
  }
  ~~~

  浏览器输出2次如下所示的弹框

  ![1668799227223](Z:/资料/day02-JavaScript-Vue/讲义/assets/1668799227223.png) 

- document.getElementsByName() ：根据标签的name的属性值获取标签对象，name属性值可以重复，所以返回值是一个数组。

  添加如下代码：

  ~~~js
  //1.3 获取元素-根据name属性获取
  var ins = document.getElementsByName('hobby');
  for (let i = 0; i < ins.length; i++) {
      alert(ins[i]);
  }
  ~~~

  浏览器会有3次如下图所示的弹框：

  ![1668799393592](Z:/资料/day02-JavaScript-Vue/讲义/assets/1668799393592.png)  

- document.getElementsByClassName() : 根据标签的class属性值获取标签对象，class属性值也可以重复，返回值是数组。

  添加如下图所示的代码：

  ~~~js
  //1.4 获取元素-根据class属性获取
  var divs = document.getElementsByClassName('cls');
  for (let i = 0; i < divs.length; i++) {
       alert(divs[i]);
  }
  ~~~

  浏览器会弹框2次，都是div标签对象

  ![1668799564602](Z:/资料/day02-JavaScript-Vue/讲义/assets/1668799564602.png) 

- 操作属性

  那么获取到标签了，我们如何操作标签的属性呢？通过查询文档资料，如下图所示：

  ![1668800047162](Z:/资料/day02-JavaScript-Vue/讲义/assets/1668800047162.png) 

  得出我们可以通过div标签对象的innerHTML属性来修改标签的内容。此时我们想把页面中的**传智教育替换成传智教育666**，所以要获取2个div中的第一个，所以可以通过下标0获取数组中的第一个div，注释之前的代码，编写如下代码：

  ~~~js
  var divs = document.getElementsByClassName('cls');
  var div1 = divs[0];
  
  div1.innerHTML = "传智教育666";
  ~~~

  浏览器刷新页面，展示效果如下图所示：

  ![1668800387791](Z:/资料/day02-JavaScript-Vue/讲义/assets/1668800387791.png) 

  发现页面内容变成了传智教育666

# 26.DOM案例

```js
//1. 点亮灯泡
var img = document.getElementById("light");
img.src = "img/on.gif";

//2. 将所有的 div 标签的标签体内容替换为 非常好
var divs = document.getElementsByClassName("cls");
for (let i = 0; i < divs.length; i++) {
    divs[i].innerHTML += "<font color='red'>very good</font>";
}

//3. 使所有的复选框呈现被选中的状态
var ins = document.getElementsByTagName('input');
for (let i = 0; i < ins.length; i++) {
    const check = ins[i];
    check.checked = true;
}
```



# 27.JavaScript事件

**事件介绍** 

什么是事件呢？HTML事件是发生在HTML元素上的 “事情”，例如：

- 按钮被点击
- 鼠标移到元素上
- 输入框失去焦点
- ........

而我们可以给这些事件绑定函数，当事件触发时，可以自动的完成对应的功能。这就是事件监听。例如：对于我们所说的百度注册页面，我们给用户名输入框的失去焦点事件绑定函数，当我们用户输入完内容，在标签外点击了鼠标，对于用户名输入框来说，失去焦点，然后执行绑定的函数，函数进行用户名内容的校验等操作。JavaScript事件是js非常重要的一部分，接下来我们进行事件的学习。那么我们对于JavaScript事件需要学习哪些内容呢？我们得知道有哪些常用事件，然后我们得学会如何给事件绑定函数。所以主要围绕2点来学习：

- 事件绑定
- 常用事件



**事件绑定** 

JavaScript对于事件的绑定提供了2种方式：

- 方式1：通过html标签中的事件属性进行绑定

  例如一个按钮，我们对于按钮可以绑定单机事件，可以借助标签的onclick属性，属性值指向一个函数。

  在VS Code中创建名为09. JS-事件-事件绑定.html，添加如下代码：

  ~~~html
  <input type="button" id="btn1" value="事件绑定1" onclick="on()">
  ~~~

  很明显没有on函数，所以我们需要创建该函数，代码如下：

  ~~~html
  <script>
      function on(){
          alert("按钮1被点击了...");
      }
  </script> 
  ~~~

  

- 方式2：通过DOM中Element元素的事件属性进行绑定

  依据我们学习过得DOM的知识点，我们知道html中的标签被加载成element对象，所以我们也可以通过element对象的属性来操作标签的属性。此时我们再次添加一个按钮，代码如下：

  ~~~html
  <input type="button" id="btn2" value="事件绑定2">
  ~~~

  我们可以先通过id属性获取按钮对象，然后操作对象的onclick属性来绑定事件，代码如下：

  ~~~js
  document.getElementById('btn2').onclick = function(){
      alert("按钮2被点击了...");
  } 
  ~~~

  

  **需要注意的是：事件绑定的函数，只有在事件被触发时，函数才会被调用。**

  

  整体代码如下：

  ~~~html
  <!DOCTYPE html>
  <html lang="en">
  <head>
      <meta charset="UTF-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <title>JS-事件-事件绑定</title>
  </head>
  
  <body>
      <input type="button" id="btn1" value="事件绑定1" onclick="on()">
      <input type="button" id="btn2" value="事件绑定2">
  </body>
  
  <script>
      function on(){
          alert("按钮1被点击了...");
      }
  
      document.getElementById('btn2').onclick = function(){
          alert("按钮2被点击了...");
      }
  
  </script>
  </html>
  ~~~

  

**常见事件**

| 事件属性名  | 说明                     |
| ----------- | ------------------------ |
| onclick     | 鼠标单击事件             |
| onblur      | 元素失去焦点             |
| onfocus     | 元素获得焦点             |
| onload      | 某个页面或图像被完成加载 |
| onsubmit    | 当表单提交时触发该事件   |
| onmouseover | 鼠标被移到某元素之上     |
| onmouseout  | 鼠标从某元素移开         |

- onfocus:获取焦点事件，鼠标点击输入框，输入框中光标一闪一闪的，就是输入框获取焦点了

  ![1668805346551](./assets/1668805346551.png) 

- onblur:失去焦点事件，前提是输入框获取焦点的状态下，在输入框之外的地方点击，光标从输入框中消失了，这就是失去焦点。

  ![1668805498416](./assets/1668805498416.png) 

其他事件的效果，同学们可以通过提供好的代码去演示，亲身体会事件在什么时候触发。

# 28.案例

需求如下3个：

1. 点击 “点亮”按钮 点亮灯泡，点击“熄灭”按钮 熄灭灯泡
2. 输入框鼠标聚焦后，展示小写；鼠标离焦后，展示大写。
3. 点击 “全选”按钮使所有的复选框呈现被选中的状态，点击 “反选”按钮使所有的复选框呈现取消勾选的状态。

效果如图所示：

![1668806049390](Z:/资料/day02-JavaScript-Vue/讲义/assets/1668806049390.png) 

 

 **资料准备**

~~~html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>JS-事件-案例</title>
</head>
<body>

    <img id="light" src="img/off.gif"> <br>

    <input type="button" value="点亮" > 
    <input type="button"  value="熄灭" >

    <br> <br>

    <input type="text" id="name" value="ITCAST" >
    <br> <br>

    <input type="checkbox" name="hobby"> 电影
    <input type="checkbox" name="hobby"> 旅游
    <input type="checkbox" name="hobby"> 游戏
    <br>

    <input type="button" value="全选" > 
    <input type="button" value="反选" >

</body>

</html>
~~~

> 转大小写使用的是String当中的方法
>
> <img src="./assets/image-20231021193924018.png" alt="image-20231021193924018" style="zoom:30%;" />
>
> ![image-20231021194010583](./assets/image-20231021194010583.png)



**需求2**

> 一定要注意还需要赋值给value属性

~~~html
<input type="text" id="name" value="ITCAST" onfocus="lower()" onblur="upper()">
~~~

lower()和upper()函数

~~~js
//2. 输入框聚焦后, 展示小写; 输入框离焦后, 展示大写; -- onfocus , onblur
function lower(){//小写
    //a. 获取输入框元素对象
    var input = document.getElementById("name");

    //b. 将值转为小写
    input.value = input.value.toLowerCase();
}

function upper(){//大写
    //a. 获取输入框元素对象
    var input = document.getElementById("name");

    //b. 将值转为大写
    input.value = input.value.toUpperCase();
}
~~~



# 29.Vue-概述

Vue.js（读音 /vjuː/, 类似于 **view**） 是一套构建用户界面的 **渐进式框架**。与其他重量级框架不同的是，Vue 采用自底向上增量开发的设计。Vue 的核心库只关注视图层，并且非常容易学习，非常容易与其它库或已有项目整合。Vue.js 的目标是通过尽可能简单的 API 实现**响应的数据绑定**和**组合的视图组件**。

免除原生JavaScript中的DOM操作，简化书写。

基于MVVM(Model-View-ViewModel)思想，实现数据的双向绑定，将编程的关注点放在数据上。

官网： https://v2.cn.vuejs.org/

> 框架：是一个半成品软件，是一套可重用的、通用的、软件基础代码模型。基于框架进行开发，更加快捷、更加高效。

通过我们学习的html+css+js已经能够开发美观的页面了，但是开发的效率还有待提高，那么如何提高呢？我们先来分析下页面的组成。一个完整的html页面包括了视图和数据，数据是通过请求 从后台获取的，那么意味着我们需要将后台获取到的数据呈现到页面上，很明显， 这就需要我们使用DOM操作。正因为这种开发流程，所以我们引入了一种叫做**MVVM(Model-View-ViewModel)的前端开发思想**，即让我们开发者更加关注数据，而非数据绑定到视图这种机械化的操作。那么具体什么是MVVM思想呢？

MVVM:其实是Model-View-ViewModel的缩写，有3个单词，具体释义如下：

- Model: 数据模型，特指前端中通过请求从后台获取的数据
- View: 视图，用于展示数据的页面，可以理解成我们的html+css搭建的页面，但是没有数据（其实就是html的标签，也可以理解为DOM元素）
- ViewModel: 数据绑定到视图，负责将数据（Model）通过JavaScript的DOM技术，将数据展示到视图（View）上

如图所示就是MVVM开发思想的含义：

![1668857055058](./assets/1668857055058.png) 

基于上述的MVVM思想，其中的Model我们可以通过Ajax来发起请求从后台获取;对于View部分，我们将来会学习一款ElementUI框架来替代HTML+CSS来更加方便的搭建View;而今天我们要学习的就是侧重于ViewModel部分开发的vue前端框架，用来替代JavaScript的DOM操作，让数据展示到视图的代码开发变得更加的简单。可以简单到什么程度呢？可以参考下图对比：

![1668858213508](./assets/1668858213508.png) 

在更加复杂的dom操作中，vue只会变得更加的简单！在上述的代码中，我们看不到之前的DOM操作，因为vue全部帮我们封装好了。



**快速入门**

第一步：在VS Code中创建名为12. Vue-快速入门.html的文件，并且在html文件同级创建js目录，将**资料/vue.js文件**目录下得vue.js拷贝到js目录，如下图所示：

![1668858952627](./assets/1668858952627.png) 

第二步：然后编写&lt;script&gt;标签来引入vue.js文件

第三步：在js代码区域定义vue对象

> 定义vue的时候，new Vue({})，外面的new Vew( )是定一个Vue对象，里面的{ }表示的是传递一个对象。
>
> 创建Vue的简化写法：
>
> ![image-20231021214226187](./assets/image-20231021214226187.png)

在创建vue对象时，有几个常用的属性：

- el:  用来指定哪儿些标签受 Vue 管理。 该属性取值 `#app` 中的 `app` 需要是受管理的标签的id属性值

  "#app"：类似于CSS中的选择器，#打头，就是id选择器

- data: 用来定义数据模型

  > 这里定义的模型就叫message，它的值就叫"Hello Vue"
  >
  > 一旦进行了数据绑定，那么数据模型的数据就会直接在视图层中展示出来，而且模型的数据变化和视图层当中的数据变化都会互相影响。

- methods: 用来定义函数。这个我们在后面就会用到

> 这里通过vue当中的一个指令：v-model来绑定了一个数据模型，这里就是message，此时message就会在这个输入框内展现出来，因为vue的双向绑定特性。
>
> 以v打头的，我们在Vue中叫指令

第四步：在html区域编写视图.

其中{{}}是插值表达式，用来将vue对象中定义的model展示到页面上的

> 形式：{{ 表达式 }}。
>
> 内容可以是：
>
> 变量（最为常见）
>
> 三元运算符
>
> 函数调用
>
> 算术运算

整体代码如下：

~~~html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Vue-快速入门</title>
    <script src="js/vue.js"></script>
</head>
<body>

    <div id="app">
        <input type="text" v-model="message">
        {{message}}
    </div>

</body>
<script>
    //定义Vue对象
    new Vue({
        el: "#app", //vue接管区域
        data:{
            message: "Hello Vue"
        }
    })
</script>
</html>
~~~





# 30.Vue指令- v-bind & v-model & v-on

**指令：**HTML 标签上带有 v- 前缀的特殊属性，不同指令具有不同含义。例如：v-if，v-for…

在vue中，通过大量的指令来实现数据绑定到视图的。

vue的常用指令，如下表所示：

| **指令**  | **作用**                                            |
| --------- | --------------------------------------------------- |
| v-bind    | 为HTML标签绑定属性值，如设置  href , css样式等      |
| v-model   | 在表单元素上创建双向数据绑定                        |
| v-on      | 为HTML标签绑定事件                                  |
| v-if      | 条件性的渲染某元素，判定为true时渲染,否则不渲染     |
| v-else    |                                                     |
| v-else-if |                                                     |
| v-show    | 根据条件展示某元素，区别在于切换的是display属性的值 |
| v-for     | 列表渲染，遍历容器的元素或者对象的属性              |



**v-bind和v-model**

| **指令** | **作用**                                       |
| -------- | ---------------------------------------------- |
| v-bind   | 为HTML标签绑定属性值，如设置  href , css样式等 |
| v-model  | 在表单元素上创建双向数据绑定                   |

- v-bind:  为HTML标签绑定属性值，如设置  href , css样式等。当vue对象中的数据模型发生变化时，标签的属性值会随之发生变化。

  ``` html
  <script>
        new Vue({
          el: "#app",
            data:{
                url: "https://www.baidu.com"
            }
        })
    </script>
  ```

  


  我们需要给&lt;a&gt;标签的href属性赋值，并且值应该来自于vue对象的数据模型中的url变量。

  ~~~html
  <a v-bind:href="url">链接1</a>
  ~~~

  在上述的代码中，v-bind指令是可以省略的，但是:不能省略

  ~~~html
  <a :href="url">链接2</a> 
  ~~~

  

  **注意：html属性前面有:表示采用的vue的属性绑定！**

- v-model： 在表单元素上创建双向数据绑定。什么是双向？

  -  vue对象的data属性中的数据变化，视图展示会一起变化
  -  视图数据发生变化，vue对象的data属性中的数据也会随着变化。

  data属性中数据变化，我们知道可以通过赋值来改变，但是视图数据为什么会发生变化呢？**只有表单项标签！所以双向绑定一定是使用在表单项标签上的**。编写如下代码：

  ~~~html
  <input type="text" v-model="url">
  ~~~

  打开浏览器，我们修改表单项标签，发现vue对象data中的数据也发生了变化，如下图所示：

  ![1668861009068](./assets/1668861009068.png) 

  通过上图我们发现，我们只是改变了表单数据，那么我们之前超链接的绑定的数据值也发生了变化，为什么？

  就是因为我们双向绑定，在视图发生变化时，同时vue的data中的数据模型也会随着变化。那么这个在企业开发的应用场景是什么？

  **双向绑定的作用：可以获取表单的数据的值，然后提交给服务器**

  

  整体代码如下:

  ~~~html
  <!DOCTYPE html>
  <html lang="en">
  <head>
      <meta charset="UTF-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <title>Vue-指令-v-bind</title>
      <script src="js/vue.js"></script>
  </head>
  <body>
      <div id="app">
  
          <a v-bind:href="url">链接1</a>
          <a :href="url">链接2</a>
  
          <input type="text" v-model="url">
  
      </div>
  </body>
  <script>
      //定义Vue对象
      new Vue({
          el: "#app", //vue接管区域
          data:{
             url: "https://www.baidu.com"
          }
      })
  </script>
  </html>
  ~~~

  > PS：通过v-bind或者v-model绑定的变量，必须在数据模型中声明。
  >
  > 否则会报错。



### **v-on**

v-on: 用来给html标签绑定事件的。**需要注意的是如下2点**：

- v-on语法给标签的事件绑定的函数，必须是vue对象种声明的函数

- v-on语法绑定事件时，事件名相比较js中的事件名，没有on

  例如：在js中，事件绑定demo函数

  ~~~html
  <input onclick="demo()">
  ~~~

  vue中，事件绑定demo函数

  ~~~html
  <input v-on:click="demo()">
  ~~~

首先在VS Code中创建名为14. Vue-指令-v-on.html的文件，提前准备如下代码：

我们需要在vue对象的methods属性中定义事件绑定时需要的handle()函数，代码如下：

~~~js
 methods: {
        handle: function(){
           alert("你点我了一下...");
        }
}
~~~

然后我们给第一个按钮，通过v-on指令绑定单击事件，代码如下：

> 如果handle里面没有传递参数，是可以不加括号的

~~~html
 <input type="button" value="点我一下" v-on:click="handle()">
~~~

同样，v-on也存在简写方式，即v-on: 可以替换成@，所以第二个按钮绑定单击事件的代码如下：

~~~html
<input type="button" value="点我一下" @click="handle()">
~~~

> v-on快捷方式：
>
> ![image-20231022145831569](./assets/image-20231022145831569.png)

完整代码如下：

~~~html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Vue-指令-v-on</title>
    <script src="js/vue.js"></script>
</head>
<body>
    <div id="app">

        <input type="button" value="点我一下" v-on:click="handle()">

        <input type="button" value="点我一下" @click="handle()">

    </div>
</body>
<script>
    //定义Vue对象
    new Vue({
        el: "#app", //vue接管区域
        data:{
           
        },
        methods: {
            handle: function(){
                alert("你点我了一下...");
            }
        }
    })
</script>
</html>
~~~



## 31.v-if 和 v-show

| 指令      | 描述                                                         |
| --------- | ------------------------------------------------------------ |
| v-if      | 条件性的渲染某元素，判定为true时渲染,否则不渲染              |
| v-if-else |                                                              |
| v-else    |                                                              |
| v-show    | 根据条件展示某元素，区别在于v-show是通过控制CSS的样式display属性来控制是否展示 / 隐藏 |

通过v-if指令编写如下代码：

~~~html
年龄<input type="text" v-model="age">经判定,为:
<span v-if="age <= 35">年轻人(35及以下)</span>
<span v-else-if="age > 35 && age < 60">中年人(35-60)</span>
<span v-else>老年人(60及以上)</span>
~~~

v-show和v-if的作用效果是一样的，只是原理不一样。复制上述html代码，修改v-if指令为v-show指令，代码如下：

~~~html
年龄<input type="text" v-model="age">经判定,为:
<span v-show="age <= 35">年轻人(35及以下)</span>
<span v-show="age > 35 && age < 60">中年人(35-60)</span>
<span v-show="age >= 60">老年人(60及以上)</span>
~~~

打开浏览器，展示效果如下所示：

> 只展示一个span标签

![1668864558419](./assets/1668864558419.png)

可以发现，浏览器呈现的效果是一样的，但是浏览器中html源码不一样。v-if指令，不满足条件的标签代码直接没了，而v-show指令中，不满足条件的代码依然存在，只是添加了css样式来控制标签不去显示。



完整代码如下：

~~~html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Vue-指令-v-if与v-show</title>
    <script src="js/vue.js"></script>
</head>
<body>
    <div id="app">
        
        年龄<input type="text" v-model="age">经判定,为:
        <span v-if="age <= 35">年轻人(35及以下)</span>
        <span v-else-if="age > 35 && age < 60">中年人(35-60)</span>
        <span v-else>老年人(60及以上)</span>

        <br><br>

        年龄<input type="text" v-model="age">经判定,为:
        <span v-show="age <= 35">年轻人(35及以下)</span>
        <span v-show="age > 35 && age < 60">中年人(35-60)</span>
        <span v-show="age >= 60">老年人(60及以上)</span>

    </div>
</body>
<script>
    //定义Vue对象
    new Vue({
        el: "#app", //vue接管区域
        data:{
           age: 20
        },
        methods: {
            
        }
    })
</script>
</html>
~~~



### v-for

v-for: 从名字我们就能看出，这个指令是用来遍历的。其语法格式如下：

~~~html
<标签 v-for="变量名 in 集合模型数据">
    {{变量名}}
</标签>
~~~

需要注意的是：需要循环那个标签，v-for 指令就写在那个标签上。

有时我们遍历时需要使用索引，那么v-for指令遍历的语法格式如下：

~~~html
<标签 v-for="(变量名,索引变量) in 集合模型数据">
    <!--索引变量是从0开始，所以要表示序号的话，需要手动的加1-->
   {{索引变量 + 1}} {{变量名}}
</标签>
~~~

~~~html
 <div id="app">
     <div v-for="addr in addrs">{{addr}}</div>
     <hr>
     <div v-for="(addr,index) in addrs">{{index + 1}} : {{addr}}</div>
</div> 
~~~



### 32.Vue-指令-案例

- 需求：

  ![1668868100828](./assets/1668868100828.png) 

- 分析：

  首先我们肯定需要遍历数组的，所以需要使用v-for标签；然后我们每一条数据对应一行，所以v-for需要添加在tr标签上；其次我们需要将编号，所以需要使用索引的遍历语法；然后我们要将数据展示到表格的单元格中，所以我们需要使用{{}}插值表达式；最后，我们需要转换内容，所以我们需要使用v-if指令，进行条件判断和内容的转换

- 步骤：

  - 使用v-for的带索引方式添加到表格的&lt;tr&gt;标签上
  - 使用{{}}插值表达式展示内容到单元格
  - 使用索引+1来作为编号
  - 使用v-if来判断，改变性别和等级这2列的值

- 代码实现：

  在&lt;tr&gt;上添加v-for进行遍历，以及通过插值表达式{{}}和v-if指令来填充内容和改变内容，其代码如下：

  ~~~html
   <tr align="center" v-for="(user,index) in users">
       <td>{{index + 1}}</td>
       <td>{{user.name}}</td>
       <td>{{user.age}}</td>
       <td>
           <span v-if="user.gender == 1">男</span>
           <span v-if="user.gender == 2">女</span>
       </td>
       <td>{{user.score}}</td>
       <td>
           <span v-if="user.score >= 85">优秀</span>
           <span v-else-if="user.score >= 60">及格</span>
           <span style="color: red;" v-else>不及格</span>
       </td>
  </tr>
  ~~~



其完整代码如下：

~~~html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Vue-指令-案例</title>
    <script src="js/vue.js"></script>
</head>
<body>
    
    <div id="app">
        
        <table border="1" cellspacing="0" width="60%">
            <tr>
                <th>编号</th>
                <th>姓名</th>
                <th>年龄</th>
                <th>性别</th>
                <th>成绩</th>
                <th>等级</th>
            </tr>

            <tr align="center" v-for="(user,index) in users">
                <td>{{index + 1}}</td>
                <td>{{user.name}}</td>
                <td>{{user.age}}</td>
                <td>
                    <span v-if="user.gender == 1">男</span>
                    <span v-if="user.gender == 2">女</span>
                </td>
                <td>{{user.score}}</td>
                <td>
                    <span v-if="user.score >= 85">优秀</span>
                    <span v-else-if="user.score >= 60">及格</span>
                    <span style="color: red;" v-else>不及格</span>
                </td>
            </tr>
        </table>

    </div>

</body>

<script>
    new Vue({
        el: "#app",
        data: {
            users: [{
                name: "Tom",
                age: 20,
                gender: 1,
                score: 78
            },{
                name: "Rose",
                age: 18,
                gender: 2,
                score: 86
            },{
                name: "Jerry",
                age: 26,
                gender: 1,
                score: 90
            },{
                name: "Tony",
                age: 30,
                gender: 1,
                score: 52
            }]
        },
        methods: {
            
        },
    })
</script>
</html>
~~~





## 33.生命周期

vue的生命周期：指的是vue对象从创建到销毁的过程。vue的生命周期包含8个阶段：每触发一个生命周期事件，会自动执行一个生命周期方法，这些生命周期方法也被称为钩子方法。其完整的生命周期如下图所示：

| 状态          | 阶段周期 |
| ------------- | -------- |
| beforeCreate  | 创建前   |
| created       | 创建后   |
| beforeMount   | 挂载前   |
| mounted       | 挂载完成 |
| beforeUpdate  | 更新前   |
| updated       | 更新后   |
| beforeDestroy | 销毁前   |
| destroyed     | 销毁后   |

下图是 Vue 官网提供的从创建 Vue 到效果 Vue 对象的整个过程及各个阶段对应的钩子函数：

![1668867134683](./assets/1668867134683.png)

其中我们需要重点关注的是**mounted,**其他的我们了解即可。

mounted：挂载完成，Vue初始化成功，HTML页面渲染成功。**以后我们一般用于页面初始化自动的ajax请求后台数据**

我们在VS Code中创建名为18. Vue-生命周期.html的文件编写代码来演示效果

然后我们编写mounted声明周期的钩子函数，与methods同级，代码如下：

~~~html
<script>
    //定义Vue对象
    new Vue({
        el: "#app", //vue接管区域
        data:{
           
        },
        methods: {
            
        },
        mounted () {
            alert("vue挂载完成,发送请求到服务端")
        }
    })
</script>
~~~

浏览器打开，运行结果如下：我们发现，自动打印了这句话，因为页面加载完成，vue对象创建并且完成了挂在，此时自动触发mounted所绑定的钩子函数，然后自动执行，弹框。 



## 34.Ajax-介绍

**概述**

我们前端页面中的数据，如下图所示的表格中的学生信息，应该来自于后台，那么我们的后台和前端是互不影响的2个程序，那么我们前端应该如何从后台获取数据呢？因为是2个程序，所以必须涉及到2个程序的交互，所以这就需要用到我们接下来学习的Ajax技术。

![1669103527446](./assets/1669103527446.png) 

Ajax: 全称Asynchronous JavaScript And XML，异步的JavaScript和XML。其作用有如下2点：

- 与服务器进行数据交换：通过Ajax可以给服务器发送请求，并获取服务器响应的数据。
- 异步交互：可以在**不重新加载整个页面**的情况下，与服务器交换数据并**更新部分网页**的技术，如：搜索联想、用户名是否可用的校验等等。



**Ajax作用**

我们详细的解释一下Ajax技术的2个作用

- 与服务器进行数据交互

  如下图所示前端资源被浏览器解析，但是前端页面上缺少数据，前端可以通过Ajax技术，向后台服务器发起请求，后台服务器接受到前端的请求，从数据库中获取前端需要的资源，然后响应给前端，前端在通过我们学习的vue技术，可以将数据展示到页面上，这样用户就能看到完整的页面了。此处可以对比JavaSE中的网络编程技术来理解。

  ![1669104661340](./assets/1669104661340.png)

- 异步交互：可以在**不重新加载整个页面**的情况下，与服务器交换数据并**更新部分网页**的技术。

  如下图所示，当我们再百度搜索java时，下面的联想数据是通过Ajax请求从后台服务器得到的，在整个过程中，我们的Ajax请求不会导致整个百度页面的重新加载，并且只针对搜索栏这局部模块的数据进行了数据的更新，不会对整个页面的其他地方进行数据的更新，这样就大大提升了页面的加载速度，用户体验高。

  ![1669105041533](./assets/1669105041533.png)  

 

**同步异步**

针对于上述Ajax的局部刷新功能是因为Ajax请求是异步的，与之对应的有同步请求。接下来我们介绍一下异步请求和同步请求的区别。

- 同步请求发送过程如下图所示：

  ![1669105385944](./assets/1669105385944.png)

  浏览器页面在发送请求给服务器，在服务器处理请求的过程中，浏览器页面不能做其他的操作。只能等到服务器响应结束后才能，浏览器页面才能继续做其他的操作。 

- 异步请求发送过程如下图所示：

  ![1669105479350](./assets/1669105479350.png) 

  浏览器页面发送请求给服务器，在服务器处理请求的过程中，浏览器页面还可以做其他的操作。



查看参考手册：

<img src="./assets/image-20231022164251974.png" alt="image-20231022164251974" style="zoom:33%;" />

![image-20231022164527239](./assets/image-20231022164527239.png)

![image-20231022164602132](./assets/image-20231022164602132.png)

这一节就详细介绍了XMLHttpRequest这个对象

![image-20231022164634247](./assets/image-20231022164634247.png)

![image-20231022164721295](./assets/image-20231022164721295.png)



**原生Ajax**

对于Ajax技术有了充分的认知了，我们接下来通过代码来演示Ajax的效果。此处我们先采用原生的Ajax代码来演示。因为Ajax请求是基于客户端发送请求，服务器响应数据的技术。所以为了完成快速入门案例，我们需要提供服服务器端和编写客户端。

- 服务器端

  因为我们暂时还没学过服务器端的代码，所以此处已经直接提供好了服务器端的请求地址，我们前端直接通过Ajax请求访问该地址即可。**后台服务器地址**：http://yapi.smart-xwork.cn/mock/169327/emp/list

  上述地址我们也可以直接通过浏览器来访问，访问结果如图所示：只截取部分数据

  ![1669105963948](./assets/1669105963948.png)

- 客户端

  客户端的Ajax请求代码如下有如下4步

  第一步：首先我们再VS Code中创建AJAX的文件夹，并且创建名为01. Ajax-原生方式.html的文件，提供如下代码，主要是按钮绑定单击事件，我们希望点击按钮，来发送ajax请求

  ~~~html
  <!DOCTYPE html>
  <html lang="en">
  <head>
      <meta charset="UTF-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <title>原生Ajax</title>
  </head>
  <body>
      
      <input type="button" value="获取数据" onclick="getData()">
  
      <div id="div1"></div>
      
  </body>
  <script>
      function getData(){
       
      }
  </script>
  </html>
  ~~~

  第二步：创建XMLHttpRequest对象，用于和服务器交换数据，也是原生Ajax请求的核心对象，提供了各种方法。代码如下：

  ~~~js
  //1. 创建XMLHttpRequest 
  var xmlHttpRequest  = new XMLHttpRequest();
  ~~~

  第三步：调用对象的open()方法设置请求的参数信息，例如请求地址，请求方式。然后调用send()方法向服务器发送请求，代码如下：

  ~~~js
  //2. 发送异步请求
  xmlHttpRequest.open('GET','http://yapi.smart-xwork.cn/mock/169327/emp/list');
  xmlHttpRequest.send();//发送请求
  ~~~

  第四步：我们通过绑定事件的方式，来获取服务器响应的数据。

  ~~~js
  //3. 获取服务响应数据
  xmlHttpRequest.onreadystatechange = function(){
      //此处判断 4表示浏览器已经完全接受到Ajax请求得到的响应， 200表示这是一个正确的Http请求，没有错误
      if(xmlHttpRequest.readyState == 4 && xmlHttpRequest.status == 200){
          document.getElementById('div1').innerHTML = xmlHttpRequest.responseText;
      }
  }
  ~~~



  最后我们通过浏览器打开页面，请求点击按钮，发送Ajax请求，最终显示结果如下图所示：

  XHR是XMLHttpRequest单词的简写，代表的就是一次异步请求![1669106705778](./assets/1669106850383.png) 

  并且通过浏览器的f12抓包，我们点击网络中的XHR请求，发现可以抓包到我们发送的Ajax请求。XHR代表的就是异步请求



## 35.Axios

上述原生的Ajax请求的代码编写起来还是比较繁琐的，所以接下来我们学习一门更加简单的发送Ajax请求的技术Axios 。Axios是对原生的AJAX进行封装，简化书写。Axios官网是：`https://www.axios-http.cn`

### 1.3.1 Axios的基本使用

Axios的使用比较简单，主要分为2步：

- 引入Axios文件

  ~~~html
  <script src="js/axios-0.18.0.js"></script>
  ~~~

- 使用Axios发送请求，并获取响应结果，官方提供的api很多，此处给出2种，如下

  > axios()中需要传递js当中的对象

  - 发送 get 请求

    ~~~js
    axios({
        method:"get",
        url:"http://localhost:8080/ajax-demo1/aJAXDemo1?username=zhangsan"
    }).then(function (resp){
        alert(resp.data);
    })
    
    //箭头函数的写法：
    axios({
        method:"get",
        url:"http://localhost:8080/ajax-demo1/aJAXDemo1?username=zhangsan"
    }).then((resp)=>{
        alert(resp.data);
    })
    ~~~

  - 发送 post 请求

    ```js
    axios({
        method:"post",
        url:"http://localhost:8080/ajax-demo1/aJAXDemo1",
        data:"username=zhangsan"
    }).then(function (resp){
        alert(resp.data);
    });
    ```

  axios()是用来发送异步请求的，小括号中使用 js的JSON对象传递请求相关的参数：

  - method属性：用来设置请求方式的。取值为 get 或者 post。
  - url属性：用来书写请求的资源路径。如果是 get 请求，需要将请求参数拼接到路径的后面，格式为： url?参数名=参数值&参数名2=参数值2。
  - data属性：作为请求体被发送的数据。也就是说如果是 post 请求的话，数据需要作为 data 属性的值。

  then() 需要传递一个匿名函数。我们将 then()中传递的匿名函数称为 **回调函数**，意思是该匿名函数在发送请求时不会被调用，而是在成功响应后自动调用的函数。而该回调函数中的 resp 参数是对响应的数据进行封装的对象，通过 resp.data 可以获取到响应的数据。

  

### 1.3.2 Axios快速入门

- 后端实现

  查询所有员工信息服务器地址：http://yapi.smart-xwork.cn/mock/169327/emp/list 

  根据员工id删除员工信息服务器地址：http://yapi.smart-xwork.cn/mock/169327/emp/deleteById

- 前端实现

  首先在VS Code中创建js文件夹，与html同级，然后将**资料/axios-0.18.0.js** 文件拷贝到js目录下，然后创建名为02. Ajax-Axios.html的文件，工程结果如图所示：

  ![1669108792555](./assets/1669108792555.png) 

   

  然后在html中引入axios所依赖的js文件，并且提供2个按钮，绑定单击事件，分别用于点击时发送ajax请求，完整代码如下：

  ~~~html
  <!DOCTYPE html>
  <html lang="en">
  <head>
      <meta charset="UTF-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <title>Ajax-Axios</title>
      <script src="js/axios-0.18.0.js"></script>
  </head>
  <body>
      
      <input type="button" value="获取数据GET" onclick="get()">
  
      <input type="button" value="删除数据POST" onclick="post()">
  
  </body>
  <script>
      function get(){
          //通过axios发送异步请求-get
      }
  
      function post(){
          //通过axios发送异步请求-post
      }
  </script>
  </html>
  ~~~

  然后分别使用Axios的方法，完整get请求和post请求的发送

  get请求代码如下：

  ~~~js
  //通过axios发送异步请求-get
   axios({
       method: "get",
       url: "http://yapi.smart-xwork.cn/mock/169327/emp/list"
   }).then(result => {
       console.log(result.data);
   })
  ~~~

  post请求代码如下：

  ~~~js
  //通过axios发送异步请求-post
   axios({
       method: "post",
       url: "http://yapi.smart-xwork.cn/mock/169327/emp/deleteById",
       data: "id=1"
   }).then(result => {
       console.log(result.data);
   })
  ~~~

  浏览器打开，f12抓包，然后分别点击2个按钮，查看控制台效果如下：

  ![1669109382408](./assets/1669109382408.png) 

  

  完整代码如下：

  ~~~html
  <!DOCTYPE html>
  <html lang="en">
  <head>
      <meta charset="UTF-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <title>Ajax-Axios</title>
      <script src="js/axios-0.18.0.js"></script>
  </head>
  <body>
      
      <input type="button" value="获取数据GET" onclick="get()">
  
      <input type="button" value="删除数据POST" onclick="post()">
  
  </body>
  <script>
      function get(){
          //通过axios发送异步请求-get
          axios({
              method: "get",
              url: "http://yapi.smart-xwork.cn/mock/169327/emp/list"
          }).then(result => {
              console.log(result.data);
          })
  
  
      }
  
      function post(){
         // 通过axios发送异步请求-post
          axios({
              method: "post",
              url: "http://yapi.smart-xwork.cn/mock/169327/emp/deleteById",
              data: "id=1"
          }).then(result => {
              console.log(result.data);
          })
  
      }
  </script>
  </html>
  ~~~



**请求方法的别名**

Axios还针对不同的请求，提供了别名方式的api,具体如下：

| 方法                               | 描述           |
| ---------------------------------- | -------------- |
| axios.get(url [, config])          | 发送get请求    |
| axios.delete(url [, config])       | 发送delete请求 |
| axios.post(url [, data[, config]]) | 发送post请求   |
| axios.put(url [, data[, config]])  | 发送put请求    |

在请求头中携带数据

~~~js
axios.put('https://api.example.com/users/789', {
  username: 'new_username',
  email: 'new.email@example.com'
}, {
  headers: {
    'Content-Type': 'application/json'
  }
})
~~~

我们目前只关注get和post请求，所以在上述的入门案例中，我们可以将get请求代码改写成如下：

~~~js
axios.get("http://yapi.smart-xwork.cn/mock/169327/emp/list").then(result => {
    console.log(result.data);
})
~~~

post请求改写成如下：

~~~js
axios.post("http://yapi.smart-xwork.cn/mock/169327/emp/deleteById","id=1").then(result => {
    console.log(result.data);
})
~~~



### 1.3.4 案例

- 需求：基于Vue及Axios完成数据的动态加载展示，如下图所示

  ![1669139756551](./assets/1669139756551.png) 

  其中数据是来自于后台程序的，地址是：http://yapi.smart-xwork.cn/mock/169327/emp/list

  

- 分析：

  前端首先是一张表格，我们缺少数据，而提供数据的地址已经有了，所以意味这我们需要使用Ajax请求获取后台的数据。但是Ajax请求什么时候发送呢？页面的数据应该是页面加载完成，自动发送请求，展示数据，所以我们需要借助vue的mounted钩子函数。那么拿到数据了，我们该怎么将数据显示表格中呢？这里就得借助v-for指令来遍历数据，展示数据。

- 步骤：

  1. 首先创建文件，提前准备基础代码，包括表格以及vue.js和axios.js文件的引入
  2. 我们需要在vue的mounted钩子函数中发送ajax请求，获取数据
  3. 拿到数据，数据需要绑定给vue的data属性
  4. 在&lt;tr&gt;标签上通过v-for指令遍历数据，展示数据

- 代码实现：

  1. 首先创建文件，提前准备基础代码，包括表格以及vue.js和axios.js文件的引入

     ![1669140682300](./assets/1669140682300.png)

     提供初始代码如下：

     ~~~html
     <!DOCTYPE html>
     <html lang="en">
     <head>
         <meta charset="UTF-8">
         <meta http-equiv="X-UA-Compatible" content="IE=edge">
         <meta name="viewport" content="width=device-width, initial-scale=1.0">
         <title>Ajax-Axios-案例</title>
         <script src="js/axios-0.18.0.js"></script>
         <script src="js/vue.js"></script>
     </head>
     <body>
         <div id="app">
             <table border="1" cellspacing="0" width="60%">
                 <tr>
                     <th>编号</th>
                     <th>姓名</th>
                     <th>图像</th>
                     <th>性别</th>
                     <th>职位</th>
                     <th>入职日期</th>
                     <th>最后操作时间</th>
                 </tr>
     
                 <tr align="center" >
                     <td>1</td>
                     <td>Tom</td>
                     <td>
                         <img src="" width="70px" height="50px">
                     </td>
                     <td>
                         <span>男</span>
                        <!-- <span>女</span>-->
                     </td>
                     <td>班主任</td>
                     <td>2009-08-09</td>
                     <td>2009-08-09 12:00:00</td>
                 </tr>
             </table>
         </div>
     </body>
     <script>
         new Vue({
            el: "#app",
            data: {
             
            }
         });
     </script>
     </html>
     ~~~

  2. 在vue的mounted钩子函数，编写Ajax请求，请求数据，代码如下：

     ~~~js
     mounted () {
         //发送异步请求,加载数据
         axios.get("http://yapi.smart-xwork.cn/mock/169327/emp/list").then(result => {
             
         })
     }
     ~~~

  3. ajax请求的数据我们应该绑定给vue的data属性，之后才能进行数据绑定到视图；并且浏览器打开后台地址，数据返回格式如下图所示：

     ![1669141982809](./assets/1669141982809.png) 

     因为服务器响应的json中的data属性才是我们需要展示的信息，所以我们应该将员工列表信息赋值给vue的data属性，代码如下：

     > 赋值给当前vue对象的属性，需要使用this，代表的是当前vue对象

     ~~~js
      //发送异步请求,加载数据
     axios.get("http://yapi.smart-xwork.cn/mock/169327/emp/list").then(result => {
         //绝对错误的写法
         // users = JSON.parse(resp.data)
         this.emps = result.data.data;//（data是所有数据！
     })
     ~~~

     data对应的本身就是一个数组，这里可以直接通过result.data.data将data取出来

     ![image-20231022175417847](./assets/image-20231022175417847.png)

     其中，data中生命emps变量，代码如下：

     ~~~js
     data: {
         emps:[]
     },
     ~~~

  4. 在&lt;tr&gt;标签上通过v-for指令遍历数据，展示数据，其中需要注意的是图片的值，需要使用vue的属性绑定，男女的展示需要使用条件判断，其代码如下：

     ~~~html
     <tr align="center" v-for="(emp,index) in emps">
         <td>{{index + 1}}</td>
         <td>{{emp.name}}</td>
         <td>
             <!-- 这里需要属性绑定的指令：v-bind，emp.image，这里不需要加{{}} -->
             <img :src="emp.image" width="70px" height="50px">
         </td>
         <td>
             <span v-if="emp.gender == 1">男</span>
             <span v-if="emp.gender == 2">女</span>
         </td>
         <td>{{emp.job}}</td>
         <td>{{emp.entrydate}}</td>
         <td>{{emp.updatetime}}</td>
     </tr>
     ~~~

完整代码如下：

~~~html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ajax-Axios-案例</title>
    <script src="js/axios-0.18.0.js"></script>
    <script src="js/vue.js"></script>
</head>
<body>
    <div id="app">
        <table border="1" cellspacing="0" width="60%">
            <tr>
                <th>编号</th>
                <th>姓名</th>
                <th>图像</th>
                <th>性别</th>
                <th>职位</th>
                <th>入职日期</th>
                <th>最后操作时间</th>
            </tr>

            <tr align="center" v-for="(emp,index) in emps">
                <td>{{index + 1}}</td>
                <td>{{emp.name}}</td>
                <td>
                    <img :src="emp.image" width="70px" height="50px">
                </td>
                <td>
                    <span v-if="emp.gender == 1">男</span>
                    <span v-if="emp.gender == 2">女</span>
                </td>
                <td>{{emp.job}}</td>
                <td>{{emp.entrydate}}</td>
                <td>{{emp.updatetime}}</td>
            </tr>
        </table>
    </div>
</body>
<script>
    new Vue({
       el: "#app",
       data: {
         emps:[]
       },
       mounted () {
          //发送异步请求,加载数据
          axios.get("http://yapi.smart-xwork.cn/mock/169327/emp/list").then(result => {
            console.log(result.data);
            this.emps = result.data.data;
          })
       }
    });
</script>
</html>
~~~



## 36.前端工程化

**前后台分离开发介绍**

在之前的课程中，我们介绍过，前端开发有2种方式：**前后台混合开发**和**前后台分离开发**。

前后台混合开发，顾名思义就是前台后台代码混在一起开发，如下图所示：

![1669142636044](./assets/1669142636044.png) 

这种开发模式有如下缺点：

- 沟通成本高：后台人员发现前端有问题，需要找前端人员修改，前端修改成功，再交给后台人员使用
- 分工不明确：后台开发人员需要开发后台代码，也需要开发部分前端代码。很难培养专业人才
- 不便管理：所有的代码都在一个工程中
- 不便维护和扩展：前端代码更新，和后台无关，但是需要整个工程包括后台一起重新打包部署。



所以我们目前基本都是采用的前后台分离开发方式，如下图所示：

> 删除员工是一个接口，查询员工也是一个接口，一个接口就是一个业务功能

![1669143264499](./assets/1669143264499.png) 

我们将原先的工程分为前端工程和后端工程这2个工程，然后前端工程交给专业的前端人员开发，后端工程交给专业的后端人员开发。前端页面需要数据，可以通过发送异步请求，从后台工程获取。但是，我们前后台是分开来开发的，那么前端人员怎么知道后台返回数据的格式呢？后端人员开发，怎么知道前端人员需要的数据格式呢？所以针对这个问题，我们前后台统一指定一套规范！我们前后台开发人员都需要遵循这套规范开发，这就是我们的**接口文档**。接口文档有离线版和在线版本，接口文档示可以查询今天提供**资料/接口文档示例**里面的资料。那么接口文档的内容怎么来的呢？是我们后台开发者根据产品经理提供的产品原型和需求文档所撰写出来的，产品原型示例可以参考今天提供**资料/页面原型**里面的资料。

那么基于前后台分离开发的模式下，我们后台开发者开发一个功能的具体流程如何呢？如下图所示：

![1669143781533](./assets/1669143781533.png) 

1. 需求分析：首先我们需要阅读需求文档，分析需求，理解需求。
2. 接口定义：查询接口文档中关于需求的接口的定义，包括地址，参数，响应数据类型等等
3. 前后台并行开发：各自按照接口文档进行开发，实现需求
4. 测试：前后台开发完了，各自按照接口文档进行测试
5. 前后段联调测试：前段工程请求后端工程，测试功能



### YAPI

**YAPI介绍**

前后台分离开发中，我们前后台开发人员都需要遵循接口文档，所以接下来我们介绍一款撰写接口文档的平台。

YApi 是高效、易用、功能强大的 api 管理平台，旨在为开发、产品、测试人员提供更优雅的接口管理服务。

其官网地址：https://yapi.pro/

YApi主要提供了2个功能：

- API接口管理：根据需求撰写接口，包括接口的地址，参数，响应等等信息。
- Mock服务：模拟真实接口，生成接口的模拟测试数据，用于前端的测试。

**接口文档管理**

接下来我们演示一下YApi是如何管理接口文档的。

首先我们登录YAPI的官网，然后使用github或者百度账号登录，没有的话去注册一个，如下图所示：

![1669198315061](./assets/1669198315061.png) 

登录进去后，在个人空间中，选择项目列表->添加测试项目，效果如图所示：

![1669198453566](./assets/1669198453566.png) 

然后点击创建的项目，进入到项目中，紧接着先添加接口的分类，如下图所示

![1669198630531](./assets/1669198630531.png) 

然后我们选择当前创建的分类，创建接口信息，如下图所示：

![1669289187162](./assets/1669289187162.png) 

紧接着，我们来到接口的编辑界面，对接口做生层次的定制，例如：接口的参数，接口的返回值等等，效果图下图所示：

![1669289350540](./assets/1669289350540.png) 

添加接口的请求参数，如下图所示：

![1669289410729](./assets/1669289410729.png)

添加接口的返回值，如下图所示：

![1669289514661](./assets/1669289514661.png) 

然后保存上述设置，紧接着我们可以来到接口的预览界面，查询接口的信息，其效果如下图所示：篇幅有限，只截取部分

![1669289623957](./assets/1669289623957.png) 

最后，我们还可以设置接口的mock信息，

![1669289857670](./assets/1669289857670.png) 

来到接口的Mock设置窗口，如下图所示：

![1669290093854](./assets/1669290093854.png) 

紧接着我们来到接口的预览界面，直接点击Mock地址，如下图所示：

![1669290162900](./assets/1669290162900.png)

我们发现浏览器直接打开，并返回如下数据：

![1669290210749](./assets/1669290210749.png)

如上步骤就是YAPI接口平台中对于接口的配置步骤。



## 37.前端工程化

**前端工程化介绍**

我们目前的前端开发中，当我们需要使用一些资源时，例如：vue.js，和axios.js文件，都是直接再工程中导入的，如下图所示：

![1669291953746](./assets/1669291953746.png)

但是上述开发模式存在如下问题：

- 每次开发都是从零开始，比较麻烦
- 多个页面中的组件共用性不好
- js、图片等资源没有规范化的存储目录，没有统一的标准，不方便维护



所以现在企业开发中更加讲究前端工程化方式的开发，主要包括如下4个特点

- 模块化：将js和css等，做成一个个可复用模块
- 组件化：我们将UI组件，css样式，js行为封装成一个个的组件，便于管理
- 规范化：我们提供一套标准的规范的目录接口和编码规范，所有开发人员遵循这套规范
- 自动化：项目的构建，测试，部署全部都是自动完成

所以对于前端工程化，说白了，就是在企业级的前端项目开发中，把前端开发所需要的工具、技术、流程、经验进行规范化和标准化。从而提升开发效率，降低开发难度等等。



**前端工程化入门**

**环境准备**

我们的前端工程化是通过vue官方提供的脚手架Vue-cli来完成的，用于快速的生成一个Vue的项目模板。Vue-cli主要提供了如下功能：

- 统一的目录结构
- 本地调试
- 热部署
- 单元测试
- 集成打包上线

我们需要运行Vue-cli，需要依赖NodeJS，NodeJS是前端工程化依赖的环境。所以我们需要先安装NodeJS，然后才能安装Vue-cli

NodeJS是一个开源、跨平台的JavaScript运行环境。

- NodeJS安装和Vue-cli安装

  ![1669293955527](./assets/1669293955527.png) 


## NodeJS安装

这里不使用最新版本，因为最新版本不是稳定版本。

我们要用的是长期维护版，也就是最新的稳定版本。

![image-20231022190413657](./assets/image-20231022190413657.png)

**1. 双击资料中提供的安装包** 

![image-20221008213131316](./assets/image-20221008213131316.png)  

 ![image-20220818155659933](./assets/image-20220818155659933.png) 



**2. 选择安装目录**

选择安装到一个，没有中文，没有空格的目录下

比如这里新建一个文件夹，用来专门存放NodeJS

![image-20231022190822554](./assets/image-20231022190822554.png)

![image-20220818160024929](./assets/image-20220818160024929.png) 

![image-20220818160241172](./assets/image-20220818160241172.png) 



**3. 验证NodeJS环境变量**

NodeJS 安装完毕后，会自动配置好环境变量，我们验证一下是否安装成功，通过： node -v

![image-20220818160357897](./assets/image-20220818160357897.png) 



**4. 配置NodeJS中的资源管理器，npm的全局安装路径**

> npm 是 **Node Package Manager** 的缩写，意思是 Node 的包管理系统。

<img src="./assets/image-20220818161218016.png" alt="image-20220818161218016" style="zoom:67%;" />

使用管理员身份运行命令行，在命令行中，执行如下指令：

```
npm config set prefix "D:\develop\NodeJS"
```

注意：D:\develop\NodeJS 这个目录是NodeJS的安装目录

查看是否设置成功

``` 
npm config get prefix
```

![image-20231022191353643](./assets/image-20231022191353643.png)



**5. 切换npm的淘宝镜像**

使用管理员身份运行命令行，在命令行中，执行如下指令：

```
npm config set registry https://registry.npm.taobao.org
```



**6. 安装Vue-cli**

Vue-cli，即vue的脚手架工具

使用管理员身份运行命令行，在命令行中，执行如下指令：

```
npm install -g @vue/cli
```

这个过程中，会联网下载，可能会耗时几分钟，耐心等待。

![image-20220818161134576](./assets/image-20220818161134576.png) 



**Vue项目简介**

环境准备好了，接下来我们需要通过Vue-cli创建一个vue项目，然后再学习一下vue项目的目录结构。Vue-cli提供了如下2种方式创建vue项目:

- 图形化界面：通过命令先进入到图形化界面，然后再进行vue工程的创建

  ~~~
  vue ui
  ~~~

  图形化界面如下：

  ![1669294586147](./assets/1669294586147.png) 



## 38.创建vue项目

**方式一：**命令行

``` 
vue create vue-project01 
```



**方式二：**图形化界面

首先，我们在桌面创建vue文件夹，然后双击进入文件夹，来到地址目录，输入cmd，然后进入到vue文件夹的cmd窗口界面，如下图所示：

![1669294790640](./assets/1669294790640.png)

然后进入如下界面：

![1669294846601](./assets/1669294846601.png)

然后再当前目录下，直接输入命令`vue ui`进入到vue的图形化界面，如下图所示：

![1669294939067](./assets/1669294939067.png) 

然后我门选择创建按钮，在vue文件夹下创建项目，如下图所示：

![1669295020228](./assets/1669295020228.png)

然后来到如下界面，进行vue项目的创建

![1669301661722](./assets/1669301661722.png)

然后预设模板选择手动，如下图所示：

 ![1669301737491](./assets/1669301737491.png) 

然后再功能页面开启路由功能，如下图所示：

![1669301859936](./assets/1669301859936.png) 

然后再配置页面选择语言版本和语法检查规范，如下图所示：

![1669301965095](./assets/1669301965095.png) 

然后创建项目，进入如下界面：

![1669302091090](./assets/1669302091090.png)

最后我们只需要等待片刻，即可进入到创建创建成功的界面，如下图所示：

![1669302171975](./assets/1669302171975.png) 

 到此，vue项目创建结束

### **vue项目目录结构介绍**

我们通过VS Code打开之前创建的vue文件夹，打开之后，呈现如下图所示页面：

![1669302718419](./assets/1669302718419.png)

vue项目的标准目录结构以及目录对应的解释如下图所示:

![1669302973198](./assets/1669302973198.png)

其中我们平时开发代码就是在**src目录**下



### 运行vue项目

- 第一种方式：通过VS Code提供的图形化界面 ，如下图所示：（注意：NPM脚本窗口默认不显示，可以参考本节的最后调试出来）

  ![1669303687468](./assets/1669303687468.png)

  点击之后，我们等待片刻，即可运行，在终端界面中，我们发现项目是运行在本地服务的8080端口，我们直接通过浏览器打开地址

  ![1669303846100](./assets/1669303846100.png)

  ![image-20231022194430648](./assets/image-20231022194430648.png) 

  最终浏览器打开后，呈现如下界面，表示项目运行成功

  ![1669304009602](./assets/1669304009602.png)

  其实此时访问的是 **src/App.vue**这个根组件，此时我们打开这个组件，修改代码：添加内容Vue

  ![1669304267724](./assets/1669304267724.png)

  只要我们保存更新的代码，我们直接打开浏览器，不需要做任何刷新，发现页面呈现内容发生了变化，如下图所示：

  ![1669304385826](./assets/1669304385826.png)

  这就是我们vue项目的热更新功能 

  对于8080端口，经常被占用，所以我们可以去修改默认的8080端口。我们修改vue.config.js文件的内容，添加如下代码：

  > 这是一个对象，在对象中只需要配置一个属性：port，端口号为7000

  ~~~json
  devServer:{
      port:7000
  }
  ~~~

  如下图所示，然后我们关闭服务器（ctrl + c，然后输入y），并且重新启动，

  ![1669305444633](./assets/1669305444633.png)

​       重新启动如下图所示：

![1669305570022](./assets/1669305570022.png) 

​	端口更改成功，可以通过浏览器访问7000端口来访问我们之前的项目

- 第二种方式：命令行方式

  直接基于cmd命令窗口，在vue目录下，执行输入命令`npm run serve`即可，如下图所示：

  ![1669304694076](./assets/1669304694076.png) 



补充：NPM脚本窗口调试出来

第一步：通过**设置/用户设置/扩展/MPM**更改NPM默认配置，如下图所示

![1669304930336](./assets/1669304930336.png)

然后重启VS Code，并且**双击打开package.json文件**，然后点击**资源管理器处的3个小点**，**勾选npm脚本选项**，如图所示

![1669305068434](./assets/1669305068434.png) 

然后就能都显示NPM脚本小窗口了。



## 39.Vue项目开发流程

那么我们访问的首页是index.html，但是我们找到public/index.html文件，打开之后发现，里面没有什么代码，但是能够呈现内容丰富的首页：如下图所示：

![1669308098856](./assets/1669308098856.png) 

我们仔细观察发现，index.html的代码很简洁，但是浏览器所呈现的index.html内容却很丰富，代码和内容不匹配，所以vue是如何做到的呢？接下来我们学习一下vue项目的开发流程。

原生代码：

![image-20231022195917447](./assets/image-20231022195917447.png)

> 下面只写了router，这是es6当中的写法，如果属性名和属性值是一致的，那么冒号后面的部分是可以省略的。

对于vue项目，index.html文件默认是引入了入口函数main.js文件，我们找到**src/main.js**文件，其代码如下：

~~~js
import Vue from 'vue'
import App from './App.vue'
import router from './router'

Vue.config.productionTip = false

new Vue({
  router,
  render: h => h(App)
}).$mount('#app')

~~~

上述代码中，包括如下几个关键点：

- import: 导入指定文件，并且重新起名。例如上述代码`import App from './App.vue'`导入当前目录下得App.vue并且起名为App

  > 还有个对立的：export，将对象/函数导出为模块
  >
  > 然后在使用的地方再通过import关键字将其导入进来

- new Vue(): 创建vue对象

- $mount('#app');将vue对象创建的dom对象挂在到id=app的这个标签区域中，作用和之前学习的vue对象的le属性一致。

- router:  路由，详细在后面的小节讲解

- render: 主要使用视图的渲染的。render是一个函数，将上面APP所导入的视图，创建出虚拟的dom元素，而这部分的DOM元素是在App.vue这个根组件当中定义的。挂载到#app这个区域。



来到**public/index.html**中，我们**删除div的id=app属性**，打开浏览器，发现之前访问的首页一片空白，如下图所示，这样就证明了，我们main.js中通过代码挂在到index.html的id=app的标签区域的。



此时我们知道了vue创建的dom对象挂在到id=app的标签区域，但是我们还是没有解决最开始的问题：首页内容如何呈现的？这就涉及到render中的App了，如下图所示：

![1669313364004](./assets/1669313364004.png) 

那么这个App对象怎么回事呢，我们打开App.vue,注意的是.vue结尾的都是vue组件。而vue的组件文件包含3个部分：

- template: 模板部分，主要是HTML代码，用来展示页面主体结构的，也就相当于页面的视图部分
- script: js代码区域，主要是通过js代码来控制模板的数据来源和行为的
- style: css样式部分，主要通过css样式控制模板的页面效果得

如下图所示就是一个vue组件的小案例：

![1669313699186](./assets/1669313699186.png)



此时我们可以打开App.vue，观察App.vue的代码，其中可以发现，App.vue组件的template部分内容，和我们浏览器访问的首页内容是一致的，如下图所示：

![1669313894258](./assets/1669313894258.png)

接下来我们可以简化模板部分内容，添加script部分的数据模型，删除css样式，完整代码如下：

> 模板中一般都有一对根标签，这对根标签一般都是div
>
> ![image-20231022202128633](./assets/image-20231022202128633.png)
>
> ![image-20231022202431015](./assets/image-20231022202431015.png)
>
> 前面加上export关键字代表的是要将我们定义的这部分对象导出去，我们只有在这里把它导成一个模块，在别的地方才可以通过import关键字导入进来。

> 之前指定vue当中的数据模型都是new一个Vue对象，然后里面声明一个data，然后在里面制定一个对象就完事了。
>
> 但是现在不能制定一个对象，而是要指定一个函数，在function中要指定一个对象，js中的对象都是一个{}，然后在里面声明一个数据模型：message。但是在这里需要把这个对象return回去，所以直接在这里加上一个：return
>
> ```vue
> <script>
>  export default {
>        data: function() {
>             return {
>                 message: "Hello Vue"
>             }
>        }
>  }
> </script>
> ```

> 快捷方式：
>
> ![image-20231022203559159](./assets/image-20231022203559159.png)

> 当我们定义好数据模型之后，需要在上面的模板，也就是视图部分通过差值表达式来展示出来数据模型的数据

~~~html
<template>
  <div id="app">
    {{message}}
  </div>
</template>

<script>
export default {
  data(){
    return {
      "message":"hello world"
    }
  }
}
</script>
<style>

</style>
~~~

保存直接，回到浏览器，我们发现首页展示效果发生了变化，如下图所示：

![1669314115641](./assets/1669314115641.png)



# 40.Vue组件库Element

**Element介绍**

不知道同学们还否记得我们之前讲解的前端开发模式MVVM，我们之前学习的vue是侧重于VM开发的，主要用于数据绑定到视图的，那么接下来我们学习的ElementUI就是一款侧重于V开发的前端框架，主要用于开发美观的页面的。

Element：是饿了么公司前端开发团队提供的一套基于 Vue 的网站组件库，用于快速构建网页。

Element 提供了很多组件（组成网页的部件）供我们使用。例如 超链接、按钮、图片、表格等等。如下图所示就是我们开发的页面和ElementUI提供的效果对比：可以发现ElementUI提供的各式各样好看的按钮

![1669357961971](./assets/1669357961971.png) 

ElementUI的学习方式和我们之前的学习方式不太一样，对于ElementUI，我们作为一个后台开发者，只需要**学会如何从ElementUI的官网拷贝组件到我们自己的页面中，并且做一些修改即可**。其官网地址：https://element.eleme.cn/#/zh-CN，我们主要学习的是ElementUI中提供的常用组件，至于其他组件同学们可以通过我们这几个组件的学习掌握到ElementUI的学习技巧，然后课后自行学习。



**快速入门**

首先，我们先要安装ElementUI的组件库，打开VS Code，**停止之前的项目**

在集成终端中打开

![1669358653297](./assets/1669358653297.png)

然后在命令行输入如下命令：

~~~
npm install element-ui@2.15.3 
~~~

> 此时它会联网下载2.15.3这个版本，并且将其安装在当前项目中，会存放在node_modules这个目录下
>
> ![image-20231022204632578](./assets/image-20231022204632578.png)



然后我们需要在main.js这个入口js文件中引入ElementUI的组件库

参考官方文档：

![image-20231022204737554](./assets/image-20231022204737554.png)

> 两个import是引入element-ui这个组件
>
> Vue.use(ElementUI);代表我们要使用ElementUI这个组件

其代码如下：

~~~js
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';

Vue.use(ElementUI);
~~~

具体操作如图所示：

![1669358935188](./assets/1669358935188.png)

然后我们需要按照vue项目的开发规范，在**src/views**目录下创建一个vue组件文件，注意组件名称后缀是.vue，并且在组件文件中编写之前介绍过的基本组件语法，代码如下：

~~~html
<template>

</template>

<script>
export default {

}
</script>

<style>

</style>
~~~

具体操作如图所示：

> 在Vue项目当中，这个组件的名字一般采用驼峰命名，如果不采用驼峰命名语法检查可能会报错。

![1669359450896](./assets/1669359450896.png) 

最后我们只需要去ElementUI的官网，找到组件库，然后找到按钮组件，抄写代码即可，具体操作如下图所示：

![1669359839574](./assets/1669359839574.png)

然后找到按钮的代码，如下图所示：

![1669359904272](./assets/1669359904272.png) 



紧接着我们复制组件代码到我们的vue组件文件中，操作如下图所示：

> 这里还需要注意，如果复制的组件比较繁琐，还需要将里面的数据模型和方法定义一并复制过来

![1669360120385](./assets/1669360120385.png)

由于默认情况下展示的是根组件的当中的内容

我们需要在默认访问的根组件**src/App.vue**中引入我们自定义的组件，具体操作步骤如下：

> 当写完<element-view></element-view>此时，在script标签中，它会自动通过import关键字，将这个组件导入进来。
>
> 此时我们可以通过<element-view></element-view>这个标签就可以展现出<element-view></element-view>当中的内容。

![1669360320983](./assets/1669360320983.png) 

然后App.vue组件中的具体代码如下，**代码是我们通过上述步骤引入element-view组件时自动生成的**。

~~~html
<template>
  <div id="app">
    <!-- {{message}} -->
    <element-view></element-view>
  </div>
</template>

<script>
import ElementView from './views/Element/ElementView.vue'
export default {
  components: { ElementView },
  data(){
    return {
      "message":"hello world"
    }
  }
}
</script>
<style>

</style>

~~~

然后运行我们的vue项目，浏览器直接访问之前的7000端口，展示效果如下图所示：

![1669360502407](./assets/1669360502407.png)

到此，我们ElementUI的入门程序编写成功

# 41.Element组件

接下来我们来学习一下ElementUI的常用组件，对于组件的学习比较简单，我们只需要参考官方提供的代码，然后复制粘贴即可。

## table表格

**组件演示**

Table 表格：用于展示多条结构类似的数据，可对数据进行排序、筛选、对比或其他自定义操作。

接下来我们通过代码来演示。

首先我们需要来到ElementUI的组件库中，找到表格组件，如下图所示：

![1669361564197](./assets/1669361564197.png)



然后复制代码到我们之前的ElementVue.vue组件中，需要注意的是，我们组件包括了3个部分，如果官方有除了template部分之外的style和script都需要复制。然后格式化一下。具体操作如下图所示：

template模板部分：

![1669362225501](./assets/1669362225501.png) 

script脚本部分

![1669362382846](./assets/1669362382846.png)

ElementView.vue组件文件整体代码如下：

~~~html
<template>
    <div>
    <!-- Button按钮 -->
        <el-row>
            <el-button>默认按钮</el-button>
            <el-button type="primary">主要按钮</el-button>
            <el-button type="success">成功按钮</el-button>
            <el-button type="info">信息按钮</el-button>
            <el-button type="warning">警告按钮</el-button>
            <el-button type="danger">危险按钮</el-button>
        </el-row>

        <!-- Table表格 -->
        <el-table
        :data="tableData"
        style="width: 100%">
            <el-table-column
                prop="date"
                label="日期"
                width="180">
            </el-table-column>
            <el-table-column
                prop="name"
                label="姓名"
                width="180">
            </el-table-column>
            <el-table-column
                prop="address"
                label="地址">
            </el-table-column>
        </el-table>
    </div>
</template>

<script>
export default {
     data() {
        return {
          tableData: [{
            date: '2016-05-02',
            name: '王小虎',
            address: '上海市普陀区金沙江路 1518 弄'
          }, {
            date: '2016-05-04',
            name: '王小虎',
            address: '上海市普陀区金沙江路 1517 弄'
          }, {
            date: '2016-05-01',
            name: '王小虎',
            address: '上海市普陀区金沙江路 1519 弄'
          }, {
            date: '2016-05-03',
            name: '王小虎',
            address: '上海市普陀区金沙江路 1516 弄'
          }]
        }
      }
}
</script>

<style>

</style>

~~~

此时回到浏览器，我们页面呈现如下效果：

![1669362451236](./assets/1669362451236.png) 



#### 组件属性详解

那么我们的ElementUI是如何将数据模型绑定到视图的呢？主要通过如下几个属性：

- data: 主要定义table组件的数据模型
- prop: 定义列的数据应该绑定data中定义的具体的数据模型
- label: 定义列的标题
- width: 定义列的宽度

其具体示例含义如下图所示：

![1669363098610](./assets/1669363098610.png) 

**PS:Element组件的所有属性都可以在组件页面的最下方找到**，如下图所示：

![1669363190361](./assets/1669363190361.png) 



## 42. Pagination分页

**组件演示**

Pagination: 分页组件，主要提供分页工具条相关功能。其展示效果图下图所示：

![1669363631302](./assets/1669363631302.png) 

首先在官网找到分页组件，我们选择带背景色分页组件，如下图所示：

![1669363746409](./assets/1669363746409.png) 

然后复制代码到我们的ElementView.vue组件文件的template中，拷贝如下代码：

~~~html
<el-pagination
    background
    layout="prev, pager, next"
    :total="1000">
</el-pagination>
~~~

浏览器打开呈现如下效果：

![1669363921750](./assets/1669363921750.png) 



**组件属性详解**

对于分页组件我们需要关注的是如下几个重要属性（可以通过查阅官网组件中最下面的组件属性详细说明得到）：

- background: 添加背景颜色，也就是上图蓝色背景色效果。
- layout: 分页工具条的布局，其具体值包含`sizes`, `prev`, `pager`, `next`, `jumper`, `->`, `total`, `slot` 这些值
- total: 数据的总数量



然后根据官方分页组件提供的layout属性说明，如下图所示：

![1669364288179](./assets/1669364288179.png) 

我们修改layout属性如下：

~~~js
 layout="sizes,prev, pager, next,jumper,total"
~~~

浏览器打开呈现如下效果：

![1669364403079](./assets/1669364403079.png)

发现在原来的功能上，添加了一些额外的功能，其具体对应关系如下图所示：

> 这些组件的顺序是根据写的顺序排列的

![1669364533849](./assets/1669364533849.png) 



**组件事件详解**

对于分页组件，除了上述几个属性，还有2个非常重要的事件我们需要去学习：

- size-change ： pageSize 改变时会触发 
- current-change ：currentPage 改变时会触发 

其官方详细解释含义如下图所示：

![1669364990991](./assets/1669364990991.png) 

对于这2个事件的参考代码，我们同样可以通过官方提供的完整案例中找到，如下图所示：

![1669365117644](./assets/1669365117644.png) 



然后我们找到对应的代码，首先复制事件，复制代码如下：

![image-20231022213136380](./assets/image-20231022213136380.png)

> 调用方法handleSizeChange、handleCurrentChange后面的括号加也可以，不加也可以

~~~js
@size-change="handleSizeChange"//每页展示的记录数发生变化时触发
@current-change="handleCurrentChange"//当前页码发生变化时触发
~~~

此时Panigation组件的template完整代码如下：

~~~html
<!-- Pagination分页 -->
<el-pagination
               @size-change="handleSizeChange"
               @current-change="handleCurrentChange"
               background
               layout="sizes,prev, pager, next,jumper,total"
               :total="1000">
</el-pagination>
~~~

> 这两个方法是可以接收参数的
>
> ![image-20231022213550408](./assets/image-20231022213550408.png)

紧接着需要复制事件需要的2个函数，需要注意methods属性和data同级，其代码如下：

~~~json
methods: {
      handleSizeChange(val) {
        console.log(`每页 ${val} 条`);
      },
      handleCurrentChange(val) {
        console.log(`当前页: ${val}`);
      }
    },
~~~

此时Panigation组件的script部分完整代码如下：

~~~html
<script>
export default {
    methods: {
      handleSizeChange(val) {
        console.log(`每页 ${val} 条`);
      },
      handleCurrentChange(val) {
        console.log(`当前页: ${val}`);
      }
    },
     data() {
        return {
          tableData: [{
            date: '2016-05-02',
            name: '王小虎',
            address: '上海市普陀区金沙江路 1518 弄'
          }, {
            date: '2016-05-04',
            name: '王小虎',
            address: '上海市普陀区金沙江路 1517 弄'
          }, {
            date: '2016-05-01',
            name: '王小虎',
            address: '上海市普陀区金沙江路 1519 弄'
          }, {
            date: '2016-05-03',
            name: '王小虎',
            address: '上海市普陀区金沙江路 1516 弄'
          }]
        }
      }
}
</script>
~~~

回到浏览器中，我们f12打开开发者控制台，然后切换当前页码和切换每页显示的数量，呈现如下效果：

![1669365585379](./assets/1669365585379.png) 



## 43.Dialog对话框

**组件演示**

Dialog: 在保留当前页面状态的情况下，告知用户并承载相关操作。其企业开发应用场景示例如下图所示：

![1669365791037](./assets/1669365791037.png)

首先我们需要在ElementUI官方找到Dialog组件，如下图所示：

![1669365950945](./assets/1669365950945.png) 



然后复制如下代码到我们的组件文件的template模块中

~~~html
<br><br>
<!--Dialog 对话框 -->
<!-- Table -->
<el-button type="text" @click="dialogTableVisible = true">打开嵌套表格的 Dialog</el-button>

<el-dialog title="收货地址" :visible.sync="dialogTableVisible">
    <el-table :data="gridData">
        <el-table-column property="date" label="日期" width="150"></el-table-column>
        <el-table-column property="name" label="姓名" width="200"></el-table-column>
        <el-table-column property="address" label="地址"></el-table-column>
    </el-table>
</el-dialog>
~~~



并且复制数据模型script模块中：

~~~js
 gridData: [{
          date: '2016-05-02',
          name: '王小虎',
          address: '上海市普陀区金沙江路 1518 弄'
        }, {
          date: '2016-05-04',
          name: '王小虎',
          address: '上海市普陀区金沙江路 1518 弄'
        }, {
          date: '2016-05-01',
          name: '王小虎',
          address: '上海市普陀区金沙江路 1518 弄'
        }, {
          date: '2016-05-03',
          name: '王小虎',
          address: '上海市普陀区金沙江路 1518 弄'
        }],
        dialogTableVisible: false,
~~~

其完整的script部分代码如下：

~~~html
<script>
export default {
    methods: {
      handleSizeChange(val) {
        console.log(`每页 ${val} 条`);
      },
      handleCurrentChange(val) {
        console.log(`当前页: ${val}`);
      }
    },
     data() {
        return {
        gridData: [{
          date: '2016-05-02',
          name: '王小虎',
          address: '上海市普陀区金沙江路 1518 弄'
        }, {
          date: '2016-05-04',
          name: '王小虎',
          address: '上海市普陀区金沙江路 1518 弄'
        }, {
          date: '2016-05-01',
          name: '王小虎',
          address: '上海市普陀区金沙江路 1518 弄'
        }, {
          date: '2016-05-03',
          name: '王小虎',
          address: '上海市普陀区金沙江路 1518 弄'
        }],
        dialogTableVisible: false,
        tableData: [{
            date: '2016-05-02',
            name: '王小虎',
            address: '上海市普陀区金沙江路 1518 弄'
          }, {
            date: '2016-05-04',
            name: '王小虎',
            address: '上海市普陀区金沙江路 1517 弄'
          }, {
            date: '2016-05-01',
            name: '王小虎',
            address: '上海市普陀区金沙江路 1519 弄'
          }, {
            date: '2016-05-03',
            name: '王小虎',
            address: '上海市普陀区金沙江路 1516 弄'
          }]
        }
      }
}
</script>
~~~

然后我们打开浏览器，点击按钮，呈现如下效果：

![1669366365778](./assets/1669366365778.png) 



 **组件属性详解**

那么ElementUI是如何做到对话框的显示与隐藏的呢？是通过如下的属性：

- visible.sync ：是否显示 Dialog 

具体释意如下图所示：

![1669366903107](./assets/1669366903107.png) 

visible属性绑定的dialogTableVisble属性一开始默认是false，所以对话框隐藏；然后我们点击按钮，触发事件，修改属性值为true，

然后对话框visible属性值为true，所以对话框呈现出来。



## 44.Form表单

**组件演示**

Form 表单：由输入框、选择器、单选框、多选框等控件组成，用以收集、校验、提交数据。 

表单在我们前端的开发中使用的还是比较多的，接下来我们学习这个组件，与之前的流程一样，我们首先需要在ElementUI的官方找到对应的组件示例：如下图所示：

![1669369751014](./assets/1669369751014.png) 

我们的需求效果是：在对话框中呈现表单内容，类似如下图所示：

![1669365791037](./assets/1669365791037.png)

所以，首先我们先要根据上一小结所学习的内容，制作一个新的对话框，其代码如下：

~~~html
<br><br>
<!-- Dialog对话框-Form表单 -->
<el-button type="text" @click="dialogFormVisible = true">打开嵌套Form的 Dialog</el-button>

<el-dialog title="Form表单" :visible.sync="dialogFormVisible">

</el-dialog>
~~~

还需要注意的是，针对这个新的对话框，我们需要在data中声明新的变量dialogFormVisible来控制对话框的隐藏与显示，代码如下：

~~~
 dialogFormVisible: false,
~~~

打开浏览器，此时呈现如图所示的效果：

![1669370230214](./assets/1669370230214.png) 



然后我们**复制官网提供的template部分代码到我们的vue组件文件的Dialog组件中**，但是，此处官方提供的表单项标签太多，所以我们只需要保留前面3个表单项组件，其他多余的删除，所以最终template部分代码如下：

~~~html
<el-dialog title="Form表单" :visible.sync="dialogFormVisible">
            
            <el-form ref="form" :model="form" label-width="80px">
                <el-form-item label="活动名称">
                    <el-input v-model="form.name"></el-input>
                </el-form-item>
                <el-form-item label="活动区域">
                    <el-select v-model="form.region" placeholder="请选择活动区域">
                    <el-option label="区域一" value="shanghai"></el-option>
                    <el-option label="区域二" value="beijing"></el-option>
                    </el-select>
                </el-form-item>
                <el-form-item label="活动时间">
                    <el-col :span="11">
                    <el-date-picker type="date" placeholder="选择日期" v-model="form.date1" style="width: 100%;"></el-date-picker>
                    </el-col>
                    <el-col class="line" :span="2">-</el-col>
                    <el-col :span="11">
                    <el-time-picker placeholder="选择时间" v-model="form.date2" style="width: 100%;"></el-time-picker>
                    </el-col>
                </el-form-item>
            
                <el-form-item>
                    <el-button type="primary" @click="onSubmit">立即创建</el-button>
                    <el-button>取消</el-button>
                </el-form-item>
            </el-form>
        </el-dialog>
~~~

观察上述代码，我们发现其中表单项标签使用了v-model双向绑定，所以我们需要在vue的数据模型中声明变量，同样可以从官方提供的代码中复制粘贴，但是我们需要去掉我们不需要的属性，通过观察上述代码，我们发现双向绑定的属性有4个，分别是form.name,form.region,form.date1,form.date2,所以最终数据模型如下：

![1669371003680](./assets/1669371003680.png)

~~~
 form: {
          name: '',
          region: '',
          date1: '',
          date2:''
        },
~~~

同样，官方的代码中，在script部分中，还提供了onSubmit函数，表单的立即创建按钮绑定了此函数，我们可以输入表单的内容，而表单的内容是双向绑定到form对象的，所以我们修改官方的onSubmit函数如下即可，而且我们还需要关闭对话框，最终函数代码如下：

![1669371163913](./assets/1669371163913.png) 



~~~
 onSubmit() {
       console.log(this.form); //输出表单内容到控制台
        this.dialogFormVisible=false; //关闭表案例的对话框
      }
~~~

然后打开浏览器，我们打开对话框，并且输入表单内容，点击立即创建按钮，呈现如下效果；

![1669371448683](A:/BaiduSyncdisk/other/资料/黑马/JAVAWeb/day03-Vue-Element/讲义/assets/1669371448683.png) 



最终vue组件完整代码如下，同学们可以针对form表单案例，参考该案例对应的template部分和script部分代码

~~~html
<template>
    <div>
    <!-- Button按钮 -->
        <el-row>
            <el-button>默认按钮</el-button>
            <el-button type="primary">主要按钮</el-button>
            <el-button type="success">成功按钮</el-button>
            <el-button type="info">信息按钮</el-button>
            <el-button type="warning">警告按钮</el-button>
            <el-button type="danger">危险按钮</el-button>
        </el-row>

        <!-- Table表格 -->
        <el-table
        :data="tableData"
        style="width: 100%">
            <el-table-column
                prop="date"
                label="日期"
                width="180">
            </el-table-column>
            <el-table-column
                prop="name"
                label="姓名"
                width="180">
            </el-table-column>
            <el-table-column
                prop="address"
                label="地址">
            </el-table-column>
        </el-table>

        <br>
        <!-- Pagination分页 -->
        <el-pagination
            @size-change="handleSizeChange"
            @current-change="handleCurrentChange"
            background
            layout="sizes,prev, pager, next,jumper,total"
            :total="1000">
        </el-pagination>

        <br><br>
        <!--Dialog 对话框 -->
        <!-- Table -->
        <el-button type="text" @click="dialogTableVisible = true">打开嵌套表格的 Dialog</el-button>

        <el-dialog title="收货地址" :visible.sync="dialogTableVisible">
        <el-table :data="gridData">
            <el-table-column property="date" label="日期" width="150"></el-table-column>
            <el-table-column property="name" label="姓名" width="200"></el-table-column>
            <el-table-column property="address" label="地址"></el-table-column>
        </el-table>
        </el-dialog>

        <br><br>
        <!-- Dialog对话框-Form表单 -->
        <el-button type="text" @click="dialogFormVisible = true">打开嵌套Form的 Dialog</el-button>

        <el-dialog title="Form表单" :visible.sync="dialogFormVisible">
            
            <el-form ref="form" :model="form" label-width="80px">
                <el-form-item label="活动名称">
                    <el-input v-model="form.name"></el-input>
                </el-form-item>
                <el-form-item label="活动区域">
                    <el-select v-model="form.region" placeholder="请选择活动区域">
                    <el-option label="区域一" value="shanghai"></el-option>
                    <el-option label="区域二" value="beijing"></el-option>
                    </el-select>
                </el-form-item>
                <el-form-item label="活动时间">
                    <el-col :span="11">
                    <el-date-picker type="date" placeholder="选择日期" v-model="form.date1" style="width: 100%;"></el-date-picker>
                    </el-col>
                    <el-col class="line" :span="2">-</el-col>
                    <el-col :span="11">
                    <el-time-picker placeholder="选择时间" v-model="form.date2" style="width: 100%;"></el-time-picker>
                    </el-col>
                </el-form-item>
            
                <el-form-item>
                    <el-button type="primary" @click="onSubmit">立即创建</el-button>
                    <el-button>取消</el-button>
                </el-form-item>
            </el-form>
        </el-dialog>
    </div>
</template>

<script>
export default {
    methods: {
      handleSizeChange(val) {
        console.log(`每页 ${val} 条`);
      },
      handleCurrentChange(val) {
        console.log(`当前页: ${val}`);
      },
      //表单案例的提交事件
      onSubmit() {
        console.log(this.form); //输出表单内容到控制台
        this.dialogFormVisible=false; //关闭表案例的对话框
      }
    },
     data() {
        return {
        //表单案例的数据双向绑定
        form: {
          name: '',
          region: '',
          date1: '',
          date2:''
        },
        gridData: [{
          date: '2016-05-02',
          name: '王小虎',
          address: '上海市普陀区金沙江路 1518 弄'
        }, {
          date: '2016-05-04',
          name: '王小虎',
          address: '上海市普陀区金沙江路 1518 弄'
        }, {
          date: '2016-05-01',
          name: '王小虎',
          address: '上海市普陀区金沙江路 1518 弄'
        }, {
          date: '2016-05-03',
          name: '王小虎',
          address: '上海市普陀区金沙江路 1518 弄'
        }],
        dialogTableVisible: false,
        dialogFormVisible: false, //控制form表单案例的对话框
        tableData: [{
            date: '2016-05-02',
            name: '王小虎',
            address: '上海市普陀区金沙江路 1518 弄'
          }, {
            date: '2016-05-04',
            name: '王小虎',
            address: '上海市普陀区金沙江路 1517 弄'
          }, {
            date: '2016-05-01',
            name: '王小虎',
            address: '上海市普陀区金沙江路 1519 弄'
          }, {
            dte: '2016-05-03',
            name: '王小虎',
            address: '上海市普陀区金沙江路 1516 弄'
          }]
        }
      }
}
</script>

<style>

</style>

~~~

# 45.案例

> 注意：一旦组件不使用，而引入了，语法检测就会报错

**案例需求**

参考 **资料/页面原型/tlias智能学习辅助系统/首页.html** 文件，浏览器打开，点击页面中的左侧栏的员工管理，如下所示：

![1669373199181](./assets/1669373199181.png) 

需求说明：

1. 制作类似格式的页面

   即上面是标题，左侧栏是导航，右侧是数据展示区域

2. 右侧需要展示搜索表单

3. 右侧表格数据是动态展示的，数据来自于后台

4. 实际示例效果如下图所示：

   ![1669373639681](./assets/1669373639681.png)



数据Mock地址：http://yapi.smart-xwork.cn/mock/169327/emp/list，浏览器打开，数据格式如下图所示：

![1669373386131](./assets/1669373386131.png) 

通过观察数据，我们发现返回的json数据的data属性中，才是返回的人员列表信息



### 案例分析

> 建议：每写一个组件最好都加一个注解

整个案例相对来说功能比较复杂，需求较多，所以我们需要先整体，后局部细节。整个页面我们可以分为3个部分，如下图所示：

![1669374858620](./assets/1669374858620.png)

一旦这样拆分，那么我们的思路就清晰了，主要步骤如下：

1. 创建页面，完成页面的整体布局规划
2. 然后分别针对3个部分进行各自组件的具体实现
3. 针对于右侧核心内容展示区域，需要使用异步加载数据，以表格渲染数据

**代码实现**

#### 环境搭建

首先我们来到VS Code中，在views目录下创建 tlias/EmpView.vue这个vue组件，并且编写组件的基本模板代码，其效果如下图所示：其中模板代码在之前的案例中已经提供，此处不再赘述

![1669375414710](./assets/1669375414710.png) 

并且需要注意的是，我们默认访问的是App.vue这个组件，而我们App.vue这个组件之前是引入了element-view这个组件，此时我们需要修改成引入emp-view这个组件，并且注释掉之前的element-view这个组件，此时App.vue整体代码如下：

> 这里注意
>
> 1. 注释的地方有三个
> 2. 标签和组件的名字是对应的
>
> ![image-20231025104934125](./assets/image-20231025104934125.png)

~~~html
<template>
  <div id="app">
    <!-- {{message}} -->
    <!-- <element-view></element-view> -->
    <emp-view></emp-view>
  </div>
</template>

<script>
import EmpView  './views/tlias/EmpView.vue'
// import ElementView  './views/Element/ElementView.vue'
export default {
  components: {EmpView },
  data(){
    return {
      "message":"hello world"
    }
  }
}
</script>
<style>

</style>

~~~

打开浏览器，我们发现之前的element案例内容没了，从而呈现的是一片空白，那么接下来我们就可以继续开发了。



#### **整体布局**

此处肯定不需要我们自己去布局的，我们直接来到ElementUI的官网，找到布局组件，如下图所示：

![1669376226430](./assets/1669376226430.png) 

从官网提供的示例，我们发现由现成的满足我们需求的布局，所以我们只需要做一位代码搬运工即可。拷贝官方提供的如下代码直接粘贴到我们EmpView.vue组件的template模块中即可：

~~~html
<el-container>
    <el-header>Header</el-header>
    <el-container>
        <el-aside width="200px">Aside</el-aside>
        <el-main>Main</el-main>
    </el-container>
</el-container>
~~~

打开浏览器，此时呈现如下效果：

![1669376527001](./assets/1669376527001.png)

因为我们没有拷贝官方提供的css样式，所以和官方案例的效果不太一样，但是我们需要的布局格式已经有，具体内容我们有自己的安排。首先我们需要调整整体布局的高度，所以我们需要在&lt;el-container&gt;上添加一些样式。

往下翻，底下有个实例，里面就有我们想要的代码

![image-20231025110054726](./assets/image-20231025110054726.png)

代码如下：

~~~html
<!-- 设置最外层容器高度为700px,在加上一个很细的边框 -->
<el-container style="height: 700px; border: 1px solid #eee">
~~~

仔细看，外面会给我们加个很细的边框！

![image-20231025105704833](./assets/image-20231025105704833.png)

到此我们布局功能就完成了

#### 顶部标题

对于顶部，我们需要实现的效果如下图所示：

![1669376996028](./assets/1669376996028.png)



所以我们需要修改顶部的文本内容，并且提供背景色的css样式，具体代码如下：

~~~html
<el-header style="font-size:40px;background-color: rgb(238, 241, 246)">tlias 智能学习辅助系统</el-header>
~~~

此时浏览器打开，呈现效果如下图所示：

![1669377134623](./assets/1669377134623.png) 

至此，我们的顶部标题就搞定了

此时整体代码如下：

~~~html
<template>
    <div>
        <!-- 设置最外层容器高度为700px,在加上一个很细的边框 -->
        <el-container style="height: 700px; border: 1px solid #eee">
            <el-header style="font-size:40px;background-color: rgb(238, 241, 246)">tlias 智能学习辅助系统</el-header>
            <el-container>
                <el-aside width="200px">Aside</el-aside>
                <el-main>Main</el-main>
            </el-container>
        </el-container>
    </div>
</template>

<script>
export default {
    
}
</script>

<style>

</style>

~~~



#### 左侧导航栏

接下来我们来实现左侧导航栏，那么还是在上述布局组件中提供的案例，找到左侧栏的案例，如下图所示：

![1669377371518](./assets/1669377371518.png) 

所以我们依然只需要搬运代码，然后做简单修改即可。官方提供的导航太多，我们不需要，所以我们需要做删减，在我们的左侧导航栏中粘贴如下代码即可：

~~~html
<el-menu :default-openeds="['1', '3']">
    <el-submenu index="1">
        <template slot="title"><i class="el-icon-message"></i>导航一</template>

        <el-menu-item index="1-1">选项1</el-menu-item>
        <el-menu-item index="1-2">选项2</el-menu-item>


    </el-submenu>
</el-menu>
~~~

删减前后对比图：

![1669377954508](./assets/1669377954508.png)

然后我们打开浏览器，展示如下内容：

![1669378005930](./assets/1669378005930.png)

最后我们只需要替换文字内容即可。



# 46.右侧核心内容

##### **表格编写**

右侧显示的是表单和表格，首先我们先来完成表格的制作，我们同样在官方直接找表格组件，也可以直接通过我们上述容器组件中提供的案例中找到表格相关的案例，如下图所示：

![1669378360527](./assets/1669378360527.png) 

然后找到表格的代码，复制到我们布局容器的主题区域，template模块代码如下：

~~~html
<el-table :data="tableData">
        <el-table-column prop="date" label="日期" width="140">
        </el-table-column>
        <el-table-column prop="name" label="姓名" width="120">
        </el-table-column>
        <el-table-column prop="address" label="地址">
        </el-table-column>
</el-table>
~~~

表格是有数据模型的绑定的，所以我们需要继续拷贝数据模型，代码如下：

~~~js
  data() {
      return {
        tableData: [
            {
                date: '2016-05-02',
                name: '王小虎',
                address: '上海市普陀区金沙江路 1518 弄'
            }
        ]
      }
~~~

浏览器打开，呈现如下效果：

![1669378670102](./assets/1669378670102.png) 

但是这样的表格和数据并不是我们所需要的，所以，接下来我们需要修改表格，添加列，并且修改列名。代码如下：

~~~html
<el-table-column prop="name" label="姓名" width="180"></el-table-column>
<el-table-column prop="image" label="图像" width="180"></el-table-column>
<el-table-column prop="gender" label="性别" width="140"></el-table-column>
<el-table-column prop="job" label="职位" width="140"></el-table-column>
<el-table-column prop="entrydate" label="入职日期" width="180"></el-table-column>
<el-table-column prop="updatetime" label="最后操作时间" width="230"></el-table-column>
<el-table-column label="操作" >
    <el-button type="primary" size="mini">编辑</el-button>
    <el-button type="danger" size="mini">删除</el-button>
</el-table-column>
~~~

需要注意的是，我们列名的prop属性值得内容并不是乱写的，因为我们将来需要绑定后台的数据的，所以如下图所示：

![1669379153961](./assets/1669379153961.png)

并且此时我们data中之前的数据模型就不可用了，所以需要清空数据，设置为空数组，代码 如下：

~~~js
 data() {
      return {
        tableData: [
           
        ]
      }
    }
~~~

此时打开浏览器，呈现如下效果：

![1669379291238](./assets/1669379291238.png) 



##### 表单编写

在表格的上方，还需要如下图所示的表单：

![1669380411564](./assets/1669380411564.png)

所以接下来我们需要去ElementUI官网，在表单组件中找到与之类似的示例，加以修改从而打成我们希望的效果，官方示例如下图所示：

![1669380607025](./assets/1669380607025.png)

所以我们直接拷贝代码主体区域的table组件的上方即可，并且我们需要修改数据绑定的的变量名，最终代码如下：

~~~html
      <!-- 表单 -->
<el-form :inline="true" :model="searchForm" class="demo-form-inline">
    <el-form-item label="姓名">
        <el-input v-model="searchForm.name" placeholder="姓名"></el-input>
    </el-form-item>
    <el-form-item label="性别">
        <el-select v-model="searchForm.gender" placeholder="性别">
            <el-option label="男" value="1"></el-option>
            <el-option label="女" value="2"></el-option>
        </el-select>
    </el-form-item>
    <el-form-item>
        <el-button type="primary" @click="onSubmit">查询</el-button>
    </el-form-item>
</el-form>
~~~



代码修改前后对比图：

![1669381155917](./assets/1669381155917.png)

既然我们表单使用v-model进行数据的双向绑定了，所以我们紧接着需要在data中定义searchForm的数据模型，代码如下：

~~~js
  data() {
      return {
        tableData: [
           
        ],
        searchForm:{
            name:'',
            gender:''
        }
      }
    }
~~~

而且，表单的提交按钮，绑定了onSubmit函数，所以我们还需要在methods中定义onSubmit函数，代码如下：

注意的是methods属性需要和data属性同级

~~~
 methods:{
        onSubmit:function(){
            console.log(this.searchForm);
        }
}
~~~

浏览器打开如图所示：

![1669381520004](./assets/1669381520004.png)

可以发现我们还缺少一个时间，所以可以从elementUI官网找到日期组件，如下图所示：

![1669381732234](./assets/1669381732234.png)

参考官方代码，然后在我们之前的表单中添加一个日期表单

> 这里也需要绑定数据模型： searchForm.entrydate，数据模型entrydate应该声明为数组，因为它既包含开始日期，又包含结束日期

具体代码如下：

~~~html
 </el-form-item>
    <el-form-item label="入职日期">
        <el-date-picker
                        v-model="searchForm.entrydate"
                        type="daterange"
                        range-separator="至"
                        start-placeholder="开始日期"
                        end-placeholder="结束日期">
        </el-date-picker>
 </el-form-item>
~~~



我们添加了双向绑定，所以我们需要在data的searchForm中定义出来，需要注意的是这个日期包含2个值，所以我们定义为数组，代码如下：

~~~
 searchForm:{
            name:'',
            gender:'',
            entrydate:[]
}
~~~

此时我们打开浏览器，填写表单，并且点击查询按钮，查看浏览器控制台，可以看到表单的内容，效果如下图所示：

![1669382161813](./assets/1669382161813.png)

**分页工具栏**

分页条我们之前做过，所以我们直接找到之前的案例，复制即可，代码如下：

其中template模块代码如下：

~~~html
 <!-- Pagination分页 -->
<el-pagination
               @size-change="handleSizeChange"
               @current-change="handleCurrentChange"
               background
               layout="sizes,prev, pager, next,jumper,total"
               :total="1000">
</el-pagination>
~~~

同时methods中需要声明2个函数，代码如下：

~~~js
handleSizeChange(val) {
            console.log(`每页 ${val} 条`);
        },
        handleCurrentChange(val) {
            console.log(`当前页: ${val}`);
        }
~~~

此时打开浏览器，效果如下图所示：

![1669382952832](./assets/1669382952832.png)



# 47.异步数据加载

**异步加载数据**

对于案例，我们只差最后的数据了，而数据的mock地址已经提供：http://yapi.smart-xwork.cn/mock/169327/emp/list

我们最后要做的就是异步加载数据，所以我们需要使用axios发送ajax请求。

在vue项目中，对于axios的使用，分为如下2步：

1. 安装axios: npm install axios
2. 需要使用axios时，导入axios: import axios from 'axios';
   导入axios，从axios组件中导入



接下来我们先来到项目的执行终端，然后输入命令，安装axios，具体操作如下图所示：

![1669383450054](./assets/1669383450054.png) 

然后**重启项目**，来到我们的EmpView.vue组件页面，在<script>中通过import命令导入axios，代码如下：

~~~
import axios from 'axios';
~~~

那么我们什么时候发送axios请求呢？页面加载完成，自动加载，所以可以使用之前的mounted钩子函数，并且我们需要将得到的员工数据要展示到表格，所以数据需要赋值给数据模型tableData，所以我们编写如下代码：

~~~js
 mounted(){
        axios.get("http://yapi.smart-xwork.cn/mock/169327/emp/list")
        .then(resp=>{
            this.tableData=resp.data.data; //响应数据赋值给数据模型
        });
    }
~~~

> 成功回调函数的提示：
>
> ![image-20231025112955179](./assets/image-20231025112955179.png)
>
> 后面的事失败的回调，这里不需要，删掉即可
>
> ![image-20231025112838579](./assets/image-20231025112838579.png)

此时浏览器打开，呈现如下效果：

![1669383786402](./assets/1669383786402.png) 

但是很明显，性别和图片的内容显示不正确，所以我们需要修复。

##### 性别内容展示修复

首先我们来到ElementUI提供的表格组件，找到如下示例：

![1669384072912](./assets/1669384072912.png)

我们仔细对比效果和功能实现代码，发现其中涉及2个非常重要的点：

- &lt;template&gt; : 用于自定义列的内容
  - slot-scope（插槽）: 通过属性的row获取当前行的数据，row指代的就是这一行所有的字段值

所以接下来，我们可以通过上述的标签自定义列的内容即可，修改性别列的内容代码如下：

~~~html
 <el-table-column prop="gender"    label="性别" width="140">
     <template slot-scope="scope">
    	 {{scope.row.gender == 1 ? "男" : "女"}}
     </template>
 </el-table-column>
~~~

此时打开浏览器，效果如下图所示：性别一列的值修复成功

![1669384537662](./assets/1669384537662.png)



##### 图片内容展示修复

图片内容的修复和上述一致，需要借助&lt;template&gt;标签自定义列的内容，需要需要展示图片，直接借助&lt;img&gt;标签即可，并且需要设置图片的宽度和高度，所以直接修改图片列的代码如下：

~~~html
<el-table-column prop="image"     label="图像" width="180">
    <template slot-scope="scope">
        <img :src="scope.row.image" width="100px" height="70px">
    </template>
</el-table-column>
~~~

此时回到浏览器，效果如下图所示：图片展示修复成功

![1669384726550](./assets/1669384726550.png) 

最后解决一个小问题

##### 左边边框栏的边框线问题

此时只需要在aside部分添加css样式即可

``` html
<el-aside width="200px" style="border: 1px solid #eee">
```

具体效果如下：

<img src="./assets/image-20231025113829149.png" alt="image-20231025113829149" style="zoom:25%;" />

但是此时你会发现，它出现了一个滚动条，这是由于我们上面设置的宽度有点小，

```html
<el-aside width="230px" style="border: 1px solid #eee">
```

此时滚动条就没了。

# 48.Vue路由

**路由介绍**

将资代码/vue-project(路由)/vue-project/src/views/tlias/DeptView.vue拷贝到我们当前EmpView.vue同级，其结构如下：

![1669385311576](./assets/1669385311576.png) 

此时我们希望基于4.4案例中的功能，实现点击侧边栏的部门管理，显示部门管理的信息，点击员工管理，显示员工管理的信息，效果如下图所示：

![1669385425617](./assets/1669385425617.png)



![1669385446343](./assets/1669385446343.png)

这就需要借助我们的vue的路由功能了。

前端路由：URL中的hash(#号之后的内容）与组件之间的对应关系

如下图所示：

![1669385782145](./assets/1669385782145.png)

当我们点击左侧导航栏时，浏览器的地址栏会发生变化，路由自动更新显示与url所对应的vue组件。



而我们vue官方提供了路由插件Vue Router,其主要组成如下：

- VueRouter：路由器类，根据路由请求在路由视图中动态渲染选中的组件。

  在它里面维护了一份路由表，这份路由表中就记录了URL的hash片段与组件的对应关系。

  这个路由器的作用就是依据这份路由表，根据路由请求，在路由视图当中更新展示对应的组件。

- &lt;router-link&gt;：请求链接组件，浏览器会解析成&lt;a&gt;

  那此时我们就可以在<router-link&gt指定我们访问的是哪个组件，在这里面我们要指定的是：组件对应的标识，比如标识：/emp，此时路由器会自动找到对应的组件

- &lt;router-view&gt;：动态视图组件，用来渲染展示与路由路径对应的组件

  通过这个组件，我们就可以在任何区域展示URL对应的组件



其工作原理如下图所示：

![1669386261570](./assets/1669386261570.png)

首先VueRouter根据我们配置的url的hash片段和路由的组件关系去维护一张路由表;

然后我们页面提供一个&lt;router-link&gt;组件,用户点击，发出路由请求;

接着我们的VueRouter根据路由请求，在路由表中找到对应的vue组件；

最后VueRouter会切换&lt;router-view&gt;中的组件，从而进行视图的更新



**路由入门**

接下来我们来演示vue的路由功能。

首先我们需要先安装vue-router插件，可以通过如下命令

~~~
npm install vue-router@3.5.1
~~~

**但是我们不需要安装，因为当初我们再创建项目时，已经勾选了路由功能，已经安装好了。**



原有的代码：

``` js
import Vue from 'vue'
import VueRouter from 'vue-router'
import HomeView from '../views/HomeView.vue'

Vue.use(VueRouter)

const routes = [
  {
    /* 如果你访问的地址是/，说明你要访问的组件就是HomeView，这个组件就是上面HomeView导入进来的组件 */
    path: '/',
    name: 'home',
    component: HomeView
  },
  {
    path: '/about',
    name: 'about',
    /* 如果你访问的是/about，这里直接通过import把AboutView这个组件导入进来 */
    component: () => import(/* webpackChunkName: "about" */ '../views/AboutView.vue')
  }
]

const router = new VueRouter({
  routes
})

export default router
```

> name：给它起个名字

然后我们需要在**src/router/index.js**文件中定义路由表，根据其提供的模板代码进行修改，最终代码如下：

~~~js
import Vue  'vue'
import VueRouter  'vue-router'

Vue.use(VueRouter)

const routes = [
  {
    path: '/emp',  //地址hash
    name: 'emp',
    component:  () => import('../views/tlias/EmpView.vue')  //对应的vue组件
  },
  {
    path: '/dept',
    name: 'dept',
    component: () => import('../views/tlias/DeptView.vue')
  }
]

const router = new VueRouter({
  routes
})

export default router

~~~

注意需要去掉没有引用的import模块。

在main.js中，我们已经引入了router功能，如下图所示：

> 已经将路由信息导入进来，并且创建Vue对象的时候，已经指定了路由。所以这份路由信息其实已经生效了。

![1669387519004](./assets/1669387519004.png)

路由基本信息配置好了，路由表已经被加载，此时我们还缺少2个东西，就是&lt;router-lin&gt;和&lt;router-view&gt;,所以我们需要修改2个页面（EmpView.vue和DeptView.vue）我们左侧栏的2个按钮为router-link

> 一旦点击部门管理的菜单，此时就代表我们要访问的是/dept这个路由，紧接着，通过VueRouter就可以自动找到/dept对应的组件DeptView，然后在对应的区域当中通过<router-view>展示出对应的组件

其代码如下：

~~~html
<el-menu-item index="1-1">
    <router-link to="/dept">部门管理</router-link>
</el-menu-item>
<el-menu-item index="1-2">
    <router-link to="/emp">员工管理</router-link>
</el-menu-item>
~~~

此时左侧菜单栏会有一个超链接的效果：

![image-20231025151327738](./assets/image-20231025151327738.png)

然后我们还需要在内容展示区域即App.vue中定义route-view，作为组件的切换，其App.vue的完整代码如下：

~~~html
<template>
  <div id="app">
    <!-- {{message}} -->
    <!-- <element-view></element-view> -->
    <!-- <emp-view></emp-view> -->
    <router-view></router-view>
  </div>
</template>

<script>
// import EmpView  './views/tlias/EmpView.vue'
// import ElementView  './views/Element/ElementView.vue'
export default {
  components: { },
  data(){
    return {
      "message":"hello world"
    }
  }
}
</script>
<style>

</style>

~~~

但是我们浏览器打开地址： http://localhost:7000/ ，发现一片空白，因为我们默认的路由路径是/,但是路由配置中没有对应的关系，

所以我们需要在路由配置中/对应的路由组件，代码如下：

~~~js
const routes = [
  {
    path: '/emp',
    name: 'emp',
    component:  () => import('../views/tlias/EmpView.vue')
  },
  {
    path: '/dept',
    name: 'dept',
    component: () => import('../views/tlias/DeptView.vue')
  },
  {
    path: '/',
    redirect:'/emp' //表示重定向到/emp即可
  },
]
~~~

此时我们打开浏览器，访问http://localhost:7000 发现直接访问的是emp的页面，并且能够进行切换了，其具体如下图所示：

![1669388755027](./assets/1669388755027.png) 

到此我们的路由实现成功。



# 49.打包部署

我们的前端工程开发好了，但是我们需要发布，那么如何发布呢？主要分为2步：

1. 前端工程打包
2. 通过nginx服务器发布前端工程

## 1 前端工程打包

接下来我们先来对前端工程进行打包

我们直接通过VS Code的NPM脚本中提供的build按钮来完成，如下图所示，直接点击即可：

![1669389052906](./assets/1669389052906.png)

然后会在工程目录下生成一个dist目录，用于存放需要发布的前端资源，如下图所示：

![1669389147027](./assets/1669389147027.png)



## 2 部署前端工程

### nginx介绍

nginx: Nginx是一款轻量级的Web服务器/反向代理服务器及电子邮件（IMAP/POP3）代理服务器。其特点是占有内存少，并发能力强，在各大型互联网公司都有非常广泛的使用。

nginx功能很强大，但我们今天只是使用它其中很小的一部分功能 —— 部署前端静态资源

nginx官网：https://nginx.org/

![image-20231025125442758](./assets/image-20231025125442758.png)

点击download，在这个界面我们就可以去下载nginx的安装包，我们要下载的是稳定版本的

![image-20231025125546622](./assets/image-20231025125546622.png)

niginx在windows中的安装是比较方便的，直接解压即可。所以我们直接将资料中的nginx-1.22.0.zip压缩文件拷贝到**无中文的目录下**，直接解压即可，如下图所示就是nginx的解压目录以及目录结构说明：

nginx.exe：nginx的可执行文件，我们启动nginx就需要通过这个来启动

![1669389642057](./assets/1669389642057.png)

**很明显，我们如果要发布，直接将资源放入到html目录中。**



### 部署

将我们之前打包的前端工程dist目录下得内容拷贝到nginx的html目录下，如下图所示：

里面默认有两个文件，我们可以直接将这两个文件删掉。

![1669389950696](./assets/1669389950696.png)

然后我们通过双击nginx下得nginx.exe文件来启动nginx

> 但此时可能没有任何反应，在任务管理器内也没有搜到关于nginx的进程
>
> ![image-20231025130336123](./assets/image-20231025130336123.png)
>
> 在命令行中通过一条指令来查看是谁占用了80端口：
>
> ```
> netstat -ano | findStr 80
> ```
>
> ![image-20231025130559768](./assets/image-20231025130559768.png)
>
> 此时我们可以再次去打开任务管理器，pid为51964的进程是哪个进程
>
> 根据PID排序，查找4号进程是系统进程
>
> ![image-20231025130758278](./assets/image-20231025130758278.png)
>
> 但是系统进程我们惹不起。所以我们需要更换端口号：
>
> 首先找到conf目录下的nginx.conf文件，打开它
>
> ![image-20231025130946028](./assets/image-20231025130946028.png)
>
> 在36行左右，默认80，我们将其改为90
>
> ![image-20231025131307875](./assets/image-20231025131307875.png)

如下图所示：

![1669390029156](./assets/1669390029156.png)

点击之后，依旧是没有任何反应，此时我们需要打开任务管理器，要在任务管理器中查找是否存在nginx的进程

![image-20231025131906720](./assets/image-20231025131906720.png)

看见有两个nginx的进程，说明nginx启动成功了

nginx服务器的端口号是80，所以启动成功之后，我们浏览器直接访问http://localhost:80 即可，其中80端口可以省略，其浏览器展示效果如图所示：

![1669390177896](./assets/1669390177896.png)

到此，我们的前端工程发布成功。



# 50.Maven-课程介绍

**初识Maven**

01.**什么是Maven**

Maven是Apache旗下的一个开源项目，是一款用于管理和构建java项目的工具。

官网：https://maven.apache.org/

> Apache 软件基金会，成立于1999年7月，是目前世界上最大的最受欢迎的开源软件基金会，也是一个专门为支持开源项目而生的非盈利性组织。
>
> 开源项目：https://www.apache.org/index.html#projects-list



**Maven的作用**

使用Maven能够做什么呢？

1. 依赖（jar包）管理
2. 统一项目结构
3. 项目构建



**依赖管理**：

- 方便快捷的管理项目依赖的资源(jar包)，避免版本冲突问题

![image-20221130104014162](./assets/image-20221130104014162.png)

当使用maven进行项目依赖(jar包)管理，则很方便的可以解决这个问题。 我们只需要在maven项目的pom.xml文件中，添加一段如下图所示的配置即可实现。

![image-20220616001159531](./assets/image-20220616001159531.png)  



**统一项目结构 : **

- 提供标准、统一的项目结构

在项目开发中，当你使用不同的开发工具 (如：Eclipse、Idea)，创建项目工程时：

![image-20221130212841973](./assets/image-20221130212841973.png) 

若我们创建的是一个maven工程，是可以帮我们自动生成统一、标准的项目目录结构：

![image-20221130220539444](./assets/image-20221130220539444.png)

具体的统一结构如下：

<img src="./assets/image-20221130140132209.png" alt="image-20221130140132209" style="zoom:80%;" />

> 目录说明： 
>
> - src/main/java: java源代码目录
> - src/main/resources:  配置文件信息
> - src/test/java: 测试代码
> - src/test/resources: 测试配置文件信息



**项目构建 :** 

- maven提供了标准的、跨平台(Linux、Windows、MacOS) 的自动化项目构建方式

<img src="./assets/image-20221130140247524.png" alt="image-20221130140247524" style="zoom:67%;" />

如上图所示我们开发了一套系统，代码需要进行编译、测试、打包、发布，这些操作如果需要反复进行就显得特别麻烦，而Maven提供了一套简单的命令来完成项目构建。

![image-20221130222907628](./assets/image-20221130222907628.png)

综上所述，可以得到一个结论：**Maven是一款管理和构建java项目的工具**

# 51. Maven概述-介绍&安装

**Maven介绍**

Apache Maven是一个项目管理和构建工具，它基于项目对象模型 (Project Object Model , 简称: POM) 的概念，通过一小段描述信息来管理项目的构建、报告和文档。

官网：https://maven.apache.org/

Maven的作用： 

1. 方便的依赖管理
2. 统一的项目结构
3. 标准的项目构建流程



### Maven模型

* 项目对象模型 (Project Object Model)
* 依赖管理模型(Dependency)
* 构建生命周期/阶段(Build lifecycle & phases)



1). 构建生命周期/阶段(Build lifecycle & phases)

![image-20221130142100703](./assets/image-20221130142100703.png)

以上图中紫色框起来的部分，就是用来完成标准化构建流程 。当我们需要编译，Maven提供了一个编译插件供我们使用；当我们需要打包，Maven就提供了一个打包插件供我们使用等。 

在执行这些构建操作的时候，不同的阶段又会有不同的文件产生，比如编译之后就会有编译之后的字节码文件产生，打包之后，就会有打包之后的jar文件产生



2). 项目对象模型 (Project Object Model)

![image-20221130142643255](./assets/image-20221130142643255.png)

以上图中紫色框起来的部分属于项目对象模型，就是将我们自己的项目抽象成一个对象模型，有自己专属的坐标，如下图所示是一个Maven项目：

![image-20220616094113852](./assets/image-20220616094113852.png)

> 坐标，就是资源(jar包)的唯一标识，通过坐标可以定位到所需资源(jar包)位置
>
> ![image-20221130230134757](./assets/image-20221130230134757.png)



3). 依赖管理模型(Dependency)

![image-20221130143139644](./assets/image-20221130143139644.png)

以上图中紫色框起来的部分属于依赖管理模型，是使用坐标来描述当前项目依赖哪些第三方jar包

![image-20221130174805973](./assets/image-20221130174805973.png)

之前我们项目中需要jar包时，直接就把jar包复制到项目下的lib目录，而现在书写在pom.xml文件中的坐标又是怎么能找到所要的jar包文件的呢？

> 答案：Maven仓库



### Maven仓库 

仓库：用于存储资源，管理各种jar包

> 仓库的本质就是一个目录(文件夹)，这个目录被用来存储开发中所有依赖(就是jar包)和插件



Maven仓库分为：

- 本地仓库：自己计算机上的一个目录(用来存储jar包)
- 中央仓库：由Maven团队维护的全球唯一的。仓库地址：https://repo1.maven.org/maven2/
- 远程仓库(私服)：一般由公司团队搭建的私有仓库

![image-20220616095633552](./assets/image-20220616095633552.png)

当项目中使用坐标引入对应依赖jar包后，首先会查找本地仓库中是否有对应的jar包

* 如果有，则在项目直接引用

* 如果没有，则去中央仓库中下载对应的jar包到本地仓库

  由于中央仓库是全球唯一的，本地仓库连接中央仓库是要连接国外的网站的，这个过程是比较慢的，但为了提高下载jar包的速度，我们可以引入远程仓库（私服），这个私服一般是公司团队自己搭建的。

如果还可以搭建远程仓库(私服)，将来jar包的查找顺序则变为： 本地仓库 --> 远程仓库（私服）--> 中央仓库，如果本地仓库和私服都没有，它会先从中央仓库下载到私服，然后再下载到本地仓库。



### Maven安装

**下载**

下载地址：https://maven.apache.org/download.cgi

在提供的资料中，已经提供了下载好的安装包。如下： 

![image-20220616100211209](./assets/image-20220616100211209.png) 



**安装步骤**

Maven安装配置步骤：

1. 解压安装
2. 配置仓库
3. 配置Maven环境变量（即可以在任意目录下执行maven的指令



**1、解压 apache-maven-3.6.1-bin.zip（解压即安装）**

> 建议解压到没有中文、特殊字符的路径下。如课程中解压到 `E:\develop` 下。
>
> 点开之后，发现还有一级目录，此时我们可以直接将它解压，不需要再新建文件夹
>
> ![image-20231025135415652](./assets/image-20231025135415652.png)

 

解压缩后的目录结构如下：

![image-20220616100529868](./assets/image-20220616100529868-1669794069698.png) 

* bin目录 ： 存放的是可执行命令。（mvn 命令重点关注）
* conf目录 ：存放Maven的配置文件。（settings.xml配置文件后期需要修改）
* lib目录 ：存放Maven依赖的jar包。（Maven也是使用java开发的，所以它也依赖其他的jar包）



#### **2、配置本地仓库**

2.1、在自己计算机上新一个目录（本地仓库，用来存储jar包）

![image-20221130231857537](./assets/image-20221130231857537.png) 



2.2、进入到conf目录下修改settings.xml配置文件 

1). 使用超级记事本软件，打开settings.xml文件，定位到53行

2). 复制<localRepository>标签，粘贴到注释的外面（55行）

3). 复制之前新建的用来存储jar包的路径，替换掉<localRepository>标签体内容

<img src="./assets/2.gif" style="zoom:80%;" />



#### **3、配置阿里云私服**

由于中央仓库在国外，所以下载jar包速度可能比较慢，而阿里公司提供了一个远程仓库，里面基本也都有开源项目的jar包。

进入到conf目录下修改settings.xml配置文件：

1). 使用超级记事本软件，打开settings.xml文件，定位到160行左右

2). 在<mirrors>标签下为其添加子标签<mirror>，内容如下：

```xml
<mirror>  
    <id>alimaven</id>  
    <name>aliyun maven</name>  
    <url>http://maven.aliyun.com/nexus/content/groups/public/</url>
    <mirrorOf>central</mirrorOf>          
</mirror>
```

![](./assets/3.gif)

注意配置的位置，在<mirrors> ... </mirrors> 中间添加配置。如下图所示：

![image-20221130161346565](./assets/image-20221130161346565.png)

==注:  只可配置一个<mirror>(另一个要注释!) ，不然两个可能发生冲突，导致jar包无法下载!!!!!!!==



#### **4、配置环境变量**

> Maven环境变量的配置类似于JDK环境变量配置一样

1). 在系统变量处新建一个变量MAVEN_HOME

- MAVEN_HOME环境变量的值，设置为maven的解压安装目录

<img src="./assets/image-20220616102344350.png" style="zoom:80%;" />



2). 在Path中进行配置

- PATH环境变量的值，设置为：%MAVEN_HOME%\bin

<img src="./assets/image-20220616102435856.png" style="zoom:80%;" /> 



3). 打开DOS命令提示符进行验证，出现如图所示表示安装成功

```
mvn -v
```

![image-20220616102554143](./assets/image-20220616102554143.png)

> MAVEN想要成功的运行，它是基于JDK环境的

# 52. IDEA集成Maven

#### 3.2.2 POM配置详解

POM (Project Object Model) ：指的是项目对象模型，用来描述当前的maven项目。

- 使用pom.xml文件来实现

pom.xml文件：

~~~xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <!-- POM模型版本 -->
    <modelVersion>4.0.0</modelVersion>

    <!-- 当前项目坐标 -->
    <groupId>com.itheima</groupId>
    <artifactId>maven_project1</artifactId>
    <version>1.0-SNAPSHOT</version>
    
    <!-- 打包方式 -->
    <packaging>jar</packaging>
 
</project>
~~~

pom文件详解：

- <project> ：pom文件的根标签，表示当前maven项目
- <modelVersion> ：声明项目描述遵循哪一个POM模型版本
  - 虽然模型本身的版本很少改变，但它仍然是必不可少的。目前POM模型版本是4.0.0
- 坐标 ：<groupId>、<artifactId>、<version>
  - 定位项目在本地仓库中的位置，由以上三个标签组成一个坐标
- <packaging> ：maven项目的打包方式，通常设置为jar或war（默认值：jar）



我们要想在IDEA中使用Maven进行项目构建，就需要在IDEA中集成Maven

**3.1 配置Maven环境** 

**3.1.1 当前工程设置** 

1、选择 IDEA中 File  =>  Settings  =>  Build,Execution,Deployment  =>  Build Tools  =>  Maven

![image-20220616103219646](./assets/image-20220616103219646.png) 

![image-20221130234731629](./assets/image-20221130234731629.png)

![image-20231025171923271](./assets/image-20231025171923271.png)



2、设置IDEA使用本地安装的Maven，并修改配置文件及本地仓库路径

![](./assets/image-20220616103302386.png)

> Maven home path ：指定当前Maven的安装目录
>
> User settings file ：指定当前Maven的settings.xml配置文件的存放路径
>
> Local repository ：指定Maven的本地仓库的路径 (如果指定了settings.xml, 这个目录会自动读取出来, 可以不用手动指定)



3、配置工程的编译版本为11

- Maven默认使用的编译版本为5（版本过低）

![image-20221201093737128](./assets/image-20221201093737128.png) 

上述配置的maven环境，只是针对于当前工程的，如果我们再创建一个project，又恢复成默认的配置了。 要解决这个问题， 我们就需要配置全局的maven环境。

  

#### 全局设置 

1、进入到IDEA欢迎页面

- 选择 IDEA中 File  =>  close project

<img src="./assets/4.gif" style="zoom:80%;" />

<img src="./assets/image-20220616104338612.png" style="zoom:80%;" />



2、打开 All settings , 选择 Build,Execution,Deployment  =>  Build Tools  =>  Maven

<img src="./assets/image-20220616104517726.png" style="zoom:80%;" />

![image-20231025171923271](./assets/image-20231025171923271.png)



3、配置工程的编译版本为11

<img src="./assets/image-20221201093737128.png" alt="image-20221201093737128" style="zoom:80%;" />

这里所设置的maven的环境信息，并未指定任何一个project，此时设置的信息就属于全局配置信息。 以后，我们再创建project，默认就是使用我们全局配置的信息。



### Maven项目

**创建Maven项目** 

1、创建一个空项目 

<img src="./assets/image-20221201095621738.png" alt="image-20221201095621738" style="zoom:80%;" />

<img src="./assets/image-20221201095600057.png" alt="image-20221201095600057" style="zoom:80%;" />



2、创建模块，选择Maven，点击Next

<img src="./assets/image-20221201095831320.png" alt="image-20221201095831320" style="zoom:80%;" />

<img src="./assets/image-20221201100011799.png" alt="image-20221201100011799" style="zoom:80%;" />



3、填写模块名称，坐标信息，点击finish，创建完成

<img src="./assets/image-20221201100502234.png" alt="image-20221201100502234" style="zoom:80%;" /> 



4、在Maven工程下，创建HelloWorld类

<img src="./assets/image-20221201101603397.png" alt="image-20221201101603397" style="zoom:80%;" />

<img src="./assets/image-20221201101643427.png" alt="image-20221201101643427" style="zoom:80%;" />

> - Maven项目的目录结构:
>
>   maven-project01
>   	|---  src  (源代码目录和测试代码目录)
>   		    |---  main (源代码目录)
>   			           |--- java (源代码java文件目录)
>   			           |--- resources (源代码配置文件目录)
>   		    |---  test (测试代码目录)
>   			           |--- java (测试代码java目录)
>   			           |--- resources (测试代码配置文件目录)
>   	|--- target (编译、打包生成文件存放目录)
>
> - 但由于test下的resource不常用，所以创建maven的时候它并没有给我们创建出来，如果我们需要可以new一个directory，此时它会自动联想出来
>
>   ![image-20231025172835052](./assets/image-20231025172835052.png)



5、编写 HelloWorld，并运行

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello Maven ...");
    }
}
```



### Maven坐标详解

什么是坐标？

* Maven中的坐标是==资源的唯一标识== , 通过该坐标可以唯一定位资源位置
* 使用坐标来定义项目或引入项目中需要的依赖

Maven坐标主要组成

* groupId：定义当前Maven项目隶属组织名称（通常是域名反写，例如：com.itheima）
* artifactId：定义当前Maven项目名称（通常是模块名称，例如 order-service、goods-service）
* version：定义当前项目版本号

如下图就是使用坐标表示一个项目：

![image-20220616111031057](./assets/image-20220616111031057.png) 

> **注意：**
>
> * 上面所说的资源可以是插件、依赖、当前项目。
> * 我们的项目如果被其他的项目依赖时，也是需要坐标来引入的。

# 53.导入Maven项目

- **方式1：使用Maven面板，快速导入项目**

打开IDEA，选择右侧Maven面板，点击 + 号，选中对应项目的pom.xml文件，双击即可

![image-20221201104320521](./assets/image-20221201104320521.png)

<img src="./assets/image-20221201104906754.png" alt="image-20221201104906754" style="zoom:80%;" /> 

> 说明：如果没有Maven面板，选择 View  =>  Appearance  =>  Tool Window Bars
>
> ![image-20220616111937679](./assets/image-20220616111937679.png) 



删除maven工程：直接右击删除，但是它并不会将磁盘中的maven工程删除，如果需要删除磁盘中的maven工程，则需要去资源管理器中删除它的文件



- **方式2：使用idea导入模块项目**

File  =>  Project Structure  =>  Modules  =>  +  =>  Import Module

<img src="./assets/image-20220823161727718.png" style="zoom:80%;" />

找到要导入工程的pom.xml

![image-20221201105532909](./assets/image-20221201105532909.png)

<img src="./assets/image-20221201105845872.png" alt="image-20221201105845872" style="zoom:80%;" />

# 54. 依赖管理 ——依赖配置

依赖：指当前项目运行所需要的jar包。一个项目中可以引入多个依赖：

例如：在当前工程中，我们需要用到logback来记录日志，此时就可以在maven工程的pom.xml文件中，引入logback的依赖。具体步骤如下：

1. 在pom.xml中编写<dependencies>标签

2. 在<dependencies>标签中使用<dependency>引入坐标

3. 定义坐标的 groupId、artifactId、version

```xml
<dependencies>
    <!-- 第1个依赖 : logback -->
    <dependency>
        <groupId>ch.qos.logback</groupId>
        <artifactId>logback-classic</artifactId>
        <version>1.2.11</version>
    </dependency>
    <!-- 第2个依赖 : junit -->
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.12</version>
    </dependency>
</dependencies>
```

4. 点击刷新按钮，引入最新加入的坐标
   - 刷新依赖：保证每一次引入新的依赖，或者修改现有的依赖配置，都可以加入最新的坐标

![image-20221130184402805](./assets/image-20221130184402805.png)  

> 注意事项：
>
> 1. 第一次使用这个依赖是没有提示的
> 2. 如果引入的依赖，在本地仓库中不存在，将会连接远程仓库 / 中央仓库，然后下载依赖（这个过程会比较耗时，耐心等待）
> 3. 如果不知道依赖的坐标信息，可以到mvn的中央仓库（https://mvnrepository.com/）中搜索





**添加依赖的几种方式：**

1. 利用中央仓库搜索的依赖坐标

   <img src="./assets/5.gif" style="zoom:80%;" />

   一般会参考Usages这个指标去选定版本

   ![image-20231025174356727](./assets/image-20231025174356727.png)



2. 利用IDEA工具搜索依赖

   <img src="./assets/6.gif" style="zoom:80%;" />



3. 熟练上手maven后，快速导入依赖

   <img src="./assets/7.gif" style="zoom:80%;" />

# 55. 依赖管理 ——依赖传递

**依赖具有传递性**

早期我们没有使用maven时，向项目中添加依赖的jar包，需要把所有的jar包都复制到项目工程下。如下图所示，需要logback-classic时，由于logback-classic又依赖了logback-core和slf4j，所以必须把这3个jar包全部复制到项目工程下

![image-20221201120514644](./assets/image-20221201120514644.png)



我们现在使用了maven，当项目中需要使用logback-classic时，只需要在pom.xml配置文件中，添加logback-classic的依赖坐标即可。

![image-20221201113659400](./assets/image-20221201113659400.png)

在pom.xml文件中只添加了logback-classic依赖，但由于maven的依赖具有传递性，所以会自动把所依赖的其他jar包也一起导入。



依赖传递可以分为：

1. 直接依赖：在当前项目中通过依赖配置建立的依赖关系

2. 间接依赖：被依赖的资源如果依赖其他资源，当前项目间接依赖其他资源

![image-20220616115445812](./assets/image-20220616115445812.png) 

比如以上图中：

- projectA依赖了projectB。对于projectA 来说，projectB 就是直接依赖。
- 而projectB依赖了projectC及其他jar包。 那么此时，在projectA中也会将projectC的依赖传递下来。对于projectA 来说，projectC就是间接依赖。

![image-20221201115801806](./assets/image-20221201115801806.png)

在IDEA中，它还给我们提供了一种可视化的方式：

首先打开想要查看依赖情况的项目的pom文件：

![image-20231025174936076](./assets/image-20231025174936076.png)

![image-20231025175005237](./assets/image-20231025175005237.png)

![image-20231025175035064](./assets/image-20231025175035064.png)



#### 排除依赖

问题：之前我们讲了依赖具有传递性。那么A依赖B，B依赖C，如果A不想将C依赖进来，是否可以做到？ 

答案：在maven项目中，我们可以通过排除依赖来实现。



什么是排除依赖？

- 排除依赖：指主动断开依赖的资源。（被排除的资源无需指定版本）

```xml
<dependency>
    <groupId>com.itheima</groupId>
    <artifactId>maven-projectB</artifactId>
    <version>1.0-SNAPSHOT</version>
   
    <!--排除依赖, 主动断开依赖的资源-->
    <exclusions>
    	<exclusion>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
        </exclusion>
    </exclusions>
</dependency>
```



依赖排除示例：

- maven-projectA依赖了maven-projectB，maven-projectB依赖了Junit。基于依赖的传递性，所以maven-projectA也依赖了Junit

![image-20221201141929240](./assets/image-20221201141929240.png)

- 使用排除依赖后

![image-20221201142501556](./assets/image-20221201142501556.png)

# 55. 依赖管理 ——依赖范围

在项目中导入依赖的jar包后，默认情况下，可以在任何地方使用。

![image-20221201135142706](./assets/image-20221201135142706.png)

如果希望限制依赖的使用范围，可以通过<scope>标签设置其作用范围。

![image-20220616123806894](./assets/image-20220616123806894.png) 

作用范围：

1. 主程序范围有效（main文件夹范围内）

2. 测试程序范围有效（test文件夹范围内）

3. 是否参与打包运行（package指令范围内）

![image-20221201140140947](./assets/image-20221201140140947.png)

如上图所示，给junit依赖通过scope标签指定依赖的作用范围。 那么这个依赖就只能作用在测试环境，其他环境下不能使用。

scope标签的取值范围：

| **scope**值     | **主程序** | **测试程序** | **打包（运行）** | **范例**    |
| --------------- | ---------- | ------------ | ---------------- | ----------- |
| compile（默认） | Y          | Y            | Y                | log4j       |
| test            | -          | Y            | -                | junit       |
| provided        | Y          | Y            | -                | servlet-api |
| runtime         | -          | Y            | Y                | jdbc驱动    |

测试log4j是否参与项目打包，需要注意：

> maven中默认提供的打包插件，只能将当前项目的资源打包进去，它所依赖的jar包并不会打包进去

![image-20231025175628800](./assets/image-20231025175628800.png)

如果需要将依赖的jar包也打包进去，则需要配置打包插件，后面学习web开发的时候有更便捷的方式！

# 57.生命周期

**介绍**

Maven的生命周期就是为了对所有的构建过程进行抽象和统一。 描述了一次项目构建，经历哪些阶段。

在Maven出现之前，项目构建的生命周期就已经存在，软件开发人员每天都在对项目进行清理，编译，测试及部署。虽然大家都在不停地做构建工作，但公司和公司间、项目和项目间，往往使用不同的方式做类似的工作。

Maven从大量项目和构建工具中学习和反思，然后总结了一套高度完美的，易扩展的项目构建生命周期。这个生命周期包含了项目的清理，初始化，编译，测试，打包，集成测试，验证，部署和站点生成等几乎所有构建步骤。

Maven对项目构建的生命周期划分为3套（相互独立）：

![](./assets/image-20220616124015567.png)

- clean：清理工作。（主要用来清理上一次项目构建所产生的一些文件，比如编译之后的class文件、字节码文件等）

- default：核心工作。如：编译、测试、打包、安装、部署等。

- site：生成报告、发布站点等。

三套生命周期又包含哪些具体的阶段呢, 我们来看下面这幅图:

每套生命周期包含一些阶段（phase），阶段是有顺序的，后面的阶段依赖于前面的阶段。

![image-20220616124348972](./assets/image-20220616124348972.png) 

我们看到这三套生命周期，里面有很多很多的阶段，这么多生命周期阶段，其实我们常用的并不多，主要关注以下几个：

• clean：移除上一次构建生成的文件

• compile：编译项目源代码

• test：使用合适的单元测试框架运行测试(junit)

• package：将编译后的文件打包，如：jar、war等

• install：安装项目到本地仓库



IDEA工具为了方便程序员使用maven生命周期，在右侧的maven工具栏中，已给出快速访问通道

![image-20221201151340340](./assets/image-20221201151340340.png)

生命周期的顺序是：clean --> validate --> compile --> test --> package --> verify --> install --> site --> deploy 

我们需要关注的就是：clean -->  compile --> test --> package  --> install 

> 说明：在同一套生命周期中，我们在执行后面的生命周期时，前面的生命周期都会执行。

>  思考：当运行package生命周期时，clean、compile生命周期会不会运行？
>
>  ​		clean不会运行，compile会运行。  因为compile与package属于同一套生命周期，而clean与package不属于同一套生命周期。



#### 执行

在日常开发中，当我们要执行指定的生命周期时，有两种执行方式：

1. 在idea工具右侧的maven工具栏中，选择对应的生命周期，双击执行
2. 在DOS命令行中，通过maven命令执行



**方式一：在idea中执行生命周期**

- 选择对应的生命周期，双击执行

![image-20221201161957301](./assets/image-20221201161957301.png) 



compile：

> 会将编译好的存放在target下，classes里面存放的就是编译之后的字节码文件

![image-20221201163711835](./assets/image-20221201163711835.png)



test：

![image-20221201164627403](./assets/image-20221201164627403.png)



package：

> 打包后的文件会存放在target这个目录下

![image-20221201165801341](./assets/image-20221201165801341.png)



install：

> 将当前的项目打包放在本地仓库

![image-20221201170830837](./assets/image-20221201170830837.png)

跳过测试阶段：

![image-20231025212243716](./assets/image-20231025212243716.png)



clean：

![image-20221201171529382](./assets/image-20221201171529382.png)



**方式二：在命令行中执行生命周期**

1. 进入到DOS命令行

![image-20221201172210253](./assets/image-20221201172210253.png)

![image-20221201172914648](./assets/image-20221201172914648.png) 



Maven的生命周期是抽象的，这意味着生命周期本身不做任何实际工作。**在Maven的设计中，实际任务（如源代码编译）都交由插件来完成。**

![image-20221130142100703](./assets/image-20221130142100703.png)

 

5. 附录

### 5.1 更新依赖索引

有时候给idea配置完maven仓库信息后，在idea中依然搜索不到仓库中的jar包。这是因为仓库中的jar包索引尚未更新到idea中。这个时候我们就需要更新idea中maven的索引了，具体做法如下：

 打开设置----搜索maven----Repositories----选中本地仓库-----点击Update

![1537786634456](./assets/1537786634456-1582625518984.png)







### 5.2 清理maven仓库

初始情况下，我们的本地仓库是没有任何jar包的，此时会从私服去下载（如果没有配置，就直接从中央仓库去下载），可能由于网络的原因，jar包下载不完全，这些不完整的jar包都是以lastUpdated结尾。此时，maven不会再重新帮你下载，需要你删除这些以lastUpdated结尾的文件，然后maven才会再次自动下载这些jar包。

![lastUpdate](./assets/lastUpdated-1582625518983.png)



如果本地仓库中有很多这样的以lastUpadted结尾的文件，可以定义一个批处理文件，在其中编写如下脚本来删除： 

~~~
set REPOSITORY_PATH=E:\develop\apache-maven-3.6.1\mvn_repo
rem 正在搜索...

del /s /q %REPOSITORY_PATH%\*.lastUpdated

rem 搜索完毕
pause
~~~



操作步骤如下：

1). 定义批处理文件del_lastUpdated.bat  (直接创建一个文本文件，命名为del_lastUpdated，后缀名直接改为bat即可 )

![image-20221214154949482](./assets/image-20221214154949482.png) 

2). 在上面的bat文件上**右键---》编辑** 。修改文件：

![image-20221214154559817](./assets/image-20221214154559817.png) 

修改完毕后，双击运行即可删除maven仓库中的残留文件。



# 58.Web入门-课程介绍

## SpringBoot

## 前言

![image-20221130095316032](./assets/image-20221130095316032.png)

下面我们将进入SpringBoot基础阶段的学习。

在没有正式的学习SpringBoot之前，我们要先来了解下什么是Spring。

我们可以打开Spring的官网(https://spring.io)，去看一下Spring的简介：Spring makes Java simple。

![](./assets/image-20220617222738668.png)

Spring的官方提供很多开源的项目，我们可以点击上面的projects，看到spring家族旗下的项目，按照流行程度排序为：

![](./assets/image-20220617222925923.png)



Spring发展到今天已经形成了一种开发生态圈，Spring提供了若干个子项目，每个项目用于完成特定的功能。而我们在项目开发时，一般会偏向于选择这一套spring家族的技术，来解决对应领域的问题，那我们称这一套技术为**spring全家桶**。

![](./assets/image-20220617222609699.png)



而Spring家族旗下这么多的技术，最基础、最核心的是 SpringFramework。其他的spring家族的技术，都是基于SpringFramework的，SpringFramework中提供很多实用功能，如：依赖注入、事务管理、web开发支持、数据访问、消息服务等等。

![](./assets/image-20220617224427947.png)



而如果我们在项目中，直接基于SpringFramework进行开发，存在两个问题：配置繁琐、入门难度大。 

![](./assets/image-20220823185227296.png)

所以基于此呢，spring官方推荐我们从另外一个项目开始学习，那就是目前最火爆的SpringBoot。 

通过springboot就可以快速的帮我们构建应用程序，所以springboot呢，最大的特点有两个 ：

- 简化配置
- 快速开发

**Spring Boot 可以帮助我们非常快速的构建应用程序、简化开发、提高效率 。**

接下来，我们就直接通过一个SpringBoot的web入门程序，让大家快速感受一下，基于SpringBoot进行Web开发的便捷性。

# 59.SpringBootWeb快速入门

**1.1 需求**

需求：基于SpringBoot的方式开发一个web应用，浏览器发起请求/hello后，给浏览器返回字符串 “Hello World ~”。

![](./assets/image-20220823191003444.png)

 

**1.2 开发步骤**

第1步：创建SpringBoot工程项目

第2步：定义HelloController类，添加方法hello，并添加注解

第3步：测试运行



**1.2.1 创建SpringBoot工程（需要联网）**

基于Spring官方骨架，创建SpringBoot工程。

<img src="./assets/image-20221201184702136.png" alt="image-20221201184702136" style="zoom:80%;" />

基本信息描述完毕之后，勾选web开发相关依赖。

<img src="./assets/image-20221201184850248.png" alt="image-20221201184850248" style="zoom:80%;" />

点击Finish之后，就会联网创建这个SpringBoot工程，创建好之后，结构如下：

- ==注意：在联网创建过程中，会下载相关资源(请耐心等待)==

![image-20221201185910596](./assets/image-20221201185910596.png) 

这个是SpingBoot的父工程，我们所有创建的springboot工程

![image-20231025215728827](./assets/image-20231025215728827.png)

![image-20231025220233541](./assets/image-20231025220233541.png)



**1.2.2 定义请求处理类**

在com.itheima这个包下创建一个子包controller

<img src="./assets/image-20221201190541295.png" alt="image-20221201190541295" style="zoom:80%;" />

然后在controller包下新建一个类：HelloController

<img src="./assets/image-20221201190825439.png" alt="image-20221201190825439" style="zoom:80%;" />

```java
package com.itheima.controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        System.out.println("Hello World ~");
        return "Hello World ~";
    }
    
}    
```



**1.2.3 运行测试**

运行SpringBoot自动生成的引导类（启动类）

![image-20221201191028124](./assets/image-20221201191028124.png) 

![image-20221201191348924](./assets/image-20221201191348924.png) 

打开浏览器，输入 `http://localhost:8080/hello`

<img src="./assets/image-20220823195048415.png" style="zoom:80%;" />



### `http://192.168.100.11:8080/hello`分析

![image-20221201224603497](./assets/image-20221201224603497.png)

浏览器：

- 输入网址：`http://192.168.100.11:8080/hello`

  - http：代表的是请求的协议

  - 通过IP地址192.168.100.11定位到网络上的一台计算机

    > 我们之前在浏览器中输入的localhost，就是127.0.0.1（本机）

  - 通过端口号8080找到计算机上运行的程序

    > `localhost:8080`  , 意思是在本地计算机中找到正在运行的8080端口的程序

  - /hello是请求资源位置

  - 资源：对计算机而言资源就是数据

    - web资源：通过网络可以访问到的资源（通常是指存放在服务器上的数据）

    > `localhost:8080/hello` ，意思是向本地计算机中的8080端口程序，获取资源位置是/hello的数据
    >
    > - 8080端口程序，在服务器找/hello位置的资源数据，发给浏览器

服务器：（可以理解为ServerSocket）

- 接收到浏览器发送的信息（如：/hello）
- 在服务器上找到/hello的资源
- 把资源发送给浏览器

> 我们在JavaSE阶段学习网络编程时，有讲过网络三要素：
>
> - IP  ：网络中计算机的唯一标识
> - 端口 ：计算机中运行程序的唯一标识
> - 协议 ：网络中计算机之间交互的规则
>
> **问题：浏览器和服务器两端进行数据交互，使用什么协议？**
>
> **答案：http协议**

# 60. HTTP协议

**2.1 HTTP-概述**

**2.1.1 介绍**

![](./assets/image-20220823200024507.png)

HTTP：Hyper Text Transfer Protocol(超文本传输协议)，规定了浏览器与服务器之间数据传输的规则。

- http是互联网上应用最为广泛的一种网络协议 
- http协议要求：浏览器在向服务器发送请求数据时，或是服务器在向浏览器发送响应数据时，都必须按照固定的格式进行数据传输



如果想知道http协议的数据传输格式有哪些，可以打开浏览器，点击`F12`打开开发者工具，点击`Network`来查看

![image-20221202105735230](./assets/image-20221202105735230.png)

点击view source查看，可以看见，其实就是一个文本字符串

浏览器向服务器进行请求时：

- 服务器按照固定的格式进行解析

![image-20221202111044434](./assets/image-20221202111044434.png)

服务器向浏览器进行响应时：

- 浏览器按照固定的格式进行解析

![image-20221202111307819](./assets/image-20221202111307819.png)

**所以，我们学习HTTP主要就是学习请求和响应数据的具体格式内容。**



#### 2.2.2 特点

* **基于TCP协议: **   面向连接，安全

  > TCP是一种面向连接的(建立连接之前是需要经过三次握手)、可靠的、基于字节流的传输层通信协议，在数据传输方面更安全

* **基于请求-响应模型:**   一次请求对应一次响应（先请求后响应）

  > 请求和响应是一一对应关系，没有请求，就没有响应

* **HTTP协议是无状态协议:**  对于数据没有记忆能力。每次请求-响应都是独立的

  > 无状态指的是客户端发送HTTP请求给服务端之后，服务端根据请求响应数据，响应完后，不会记录任何信息。
  >
  > - 缺点:  多次请求间不能共享数据
  > - 优点:  速度快
  >
  > 请求之间无法共享数据会引发的问题：服务器无法判断这两次请求是同一个客户端发过来的，还是不同的客户端发过来的。
  >
  > - 如：京东购物。加入购物车和去购物车结算是两次请求
  > - 由于HTTP协议的无状态特性，加入购物车请求响应结束后，并未记录加入购物车是何商品
  > - 发起去购物车结算的请求后，因为无法获取哪些商品加入了购物车，会导致此次请求无法正确展示数据
  >
  > 具体使用的时候，我们发现京东是可以正常展示数据的，原因是Java早已考虑到这个问题，并提出了使用会话技术(Cookie、Session)来解决这个问题。具体如何来做，我们后面课程中会讲到。

  刚才提到HTTP协议是规定了请求和响应数据的格式，那具体的格式是什么呢?

# 61. HTTP-请求协议

浏览器和服务器是按照HTTP协议进行数据通信的。

HTTP协议又分为：请求协议和响应协议

- 请求协议：浏览器将数据以请求格式发送到服务器
  - 包括：**请求行**、**请求头** 、**请求体** 
- 响应协议：服务器将数据以响应格式返回给浏览器
  - 包括：**响应行** 、**响应头** 、**响应体** 



在HTTP1.1版本中，浏览器访问服务器的几种方式： 

| 请求方式 | 请求说明                                                     |
| :------: | :----------------------------------------------------------- |
| **GET**  | 获取资源。<br/>向特定的资源发出请求。例：http://www.baidu.com/s?wd=itheima |
| **POST** | 传输实体主体。<br/>向指定资源提交数据进行处理请求（例：上传文件），数据被包含在请求体中。 |
| OPTIONS  | 返回服务器针对特定资源所支持的HTTP请求方式。<br/>因为并不是所有的服务器都支持规定的方法，为了安全有些服务器可能会禁止掉一些方法，例如：DELETE、PUT等。那么OPTIONS就是用来询问服务器支持的方法。 |
|   HEAD   | 获得报文首部。<br/>HEAD方法类似GET方法，但是不同的是HEAD方法不要求返回数据。通常用于确认URI的有效性及资源更新时间等。 |
|   PUT    | 传输文件。<br/>PUT方法用来传输文件。类似FTP协议，文件内容包含在请求报文的实体中，然后请求保存到URL指定的服务器位置。 |
|  DELETE  | 删除文件。<br/>请求服务器删除Request-URI所标识的资源         |
|  TRACE   | 追踪路径。<br/>回显服务器收到的请求，主要用于测试或诊断      |
| CONNECT  | 要求用隧道协议连接代理。<br/>HTTP/1.1协议中预留给能够将连接改为管道方式的代理服务器 |

在我们实际应用中常用的也就是 ：**GET、POST**



**GET方式的请求协议：**

![](./assets/image-20220823200708026.png) 

**请求行 ：HTTP请求中的第一行数据。由：`请求方式`、`资源路径`、`协议以及协议的版本`组成（之间使用空格分隔）**

> HTTP有两个版本：1.0和1.1，我们使用一般都是1.1版本

* 请求方式：GET  
* 资源路径：/brand/findAll?name=OPPO&status=1
  * 请求路径：/brand/findAll
  * 请求参数：name=OPPO&status=1
    * 请求参数是以key=value形式出现
    * 多个请求参数之间使用`&`连接
  * 请求路径和请求参数之间使用`?`连接 			 
* 协议/版本：HTTP/1.1  



**请求头 ：第二行开始，上图黄色部分内容就是请求头。格式为key: value形式** 

- http是个无状态的协议，所以在请求头设置浏览器的一些自身信息和想要响应的形式。这样服务器在收到信息后，就可以知道是谁，想干什么了

常见的HTTP请求头有:

~~~
Host: 表示请求的主机名

User-Agent: 浏览器版本。 例如：Chrome浏览器的标识类似Mozilla/5.0 ...Chrome/79 ，IE浏览器的标识类似Mozilla/5.0 (Windows NT ...)like Gecko
一般用于浏览器的兼容器处理，不同的浏览器它们的内核是有差异的，这就造成了，同一段程序在不同的浏览器解析出来的效果是不一样的，这个我们称之为浏览器的兼容性问题。

Accept：表示浏览器能接收的资源类型【媒体类型】，如text/*（希望接受的是一个文本），image/*或者*/*表示所有；

Accept-Language：表示浏览器偏好的语言，服务器可以据此返回不同语言的网页；

Accept-Encoding：表示浏览器可以支持的压缩类型，例如gzip, deflate等。

Content-Type：请求主体的数据类型

Content-Length：数据主体的大小（单位：字节）
~~~

> 举例说明：服务端可以根据请求头中的内容来获取客户端的相关信息，有了这些信息服务端就可以处理不同的业务需求。
>
> 比如:
>
> - 不同浏览器解析HTML和CSS标签的结果会有不一致，所以就会导致相同的代码在不同的浏览器会出现不同的效果
> - 服务端根据客户端请求头中的数据获取到客户端的浏览器类型，就可以根据不同的浏览器设置不同的代码来达到一致的效果（这就是我们常说的浏览器兼容问题）



**请求体 ：存储请求参数**

- GET请求的请求参数在请求行中，故不需要设置请求体，但是有一个queryString（查询字符串，紧跟在URL后面的）

  ![image-20240304205434112](assets/image-20240304205434112.png)

- post方式：有请求体，称之为form data

- json格式：有请求体，request payload

- 请求体和请求头是有一个空行存在的，通过一个空行将这两部分分离开来



**POST方式的请求协议：**	

![](./assets/image-20220823201303601.png)



- 请求行(以上图中红色部分)：包含请求方式、资源路径、协议/版本
  - 请求方式：POST
  - 资源路径：/brand
  - 协议/版本：HTTP/1.1
- 请求头(以上图中黄色部分)   
- 请求体(以上图中绿色部分) ：存储请求参数 
  - 请求体和请求头之间是有一个空行隔开（作用：用于标记请求头结束）



GET请求和POST请求的区别：

| 区别方式     | GET请求                                                      | POST请求             |
| ------------ | ------------------------------------------------------------ | -------------------- |
| 请求参数     | 请求参数在请求行中。<br/>例：/brand/findAll?name=OPPO&status=1 | 请求参数在请求体中   |
| 请求参数长度 | 请求参数长度有限制(浏览器不同限制也不同)                     | 请求参数长度没有限制 |
| 安全性       | 安全性低。原因：请求参数暴露在浏览器地址栏中。               | 安全性相对高         |

当我们提交了表单数据后，在谷歌浏览器里它是放在payload里面，在请求体里我们是看不见的

![image-20231025223338266](./assets/image-20231025223338266.png)

# 62.HTTP-响应协议

**2.3.1 格式介绍**

与HTTP的请求一样，HTTP响应的数据也分为3部分：**响应行**、**响应头** 、**响应体** 

![](./assets/image-20220823202344149.png) 

**响应行(以上图中红色部分)：响应数据的第一行。响应行由`协议及版本`、`响应状态码`、`状态码描述`组成**

* 协议/版本：HTTP/1.1
* 响应状态码：200
* 状态码描述：OK



**响应头(以上图中黄色部分)：响应数据的第二行开始。格式为key：value形式**

* http是个无状态的协议，所以可以在请求头和响应头中设置一些信息和想要执行的动作，这样，对方在收到信息后，就可以知道你是谁，你想干什么



**响应体(以上图中绿色部分，响应体通常也叫作响应正文)： 响应数据的最后一部分。存储响应的数据**


- 响应体和响应头之间有一个空行隔开（作用：用于标记响应头结束）

  > 比如请求html页面时，响应的内容就是<html><head><body><form....



## 响应状态码

| 状态码分类 | 说明                                                         |
| ---------- | ------------------------------------------------------------ |
| 1xx        | **响应中** --- 临时状态码。表示请求已经接受，告诉客户端应该继续请求或者如果已经完成则忽略 |
| 2xx        | **成功** --- 表示请求已经被成功接收，处理已完成              |
| 3xx        | **重定向** --- 重定向到其它地方，让客户端再发起一个请求以完成整个处理 |
| 4xx        | **客户端错误** --- 处理发生错误，责任在客户端，如：客户端的请求一个不存在的资源，客户端未被授权，禁止访问等 |
| 5xx        | **服务器端错误** --- 处理发生错误，责任在服务端，如：服务端抛出异常，路由出错，HTTP版本不支持等 |



关于响应状态码，我们先主要认识三个状态码，其余的等后期用到了再去掌握：

* 200    ok   客户端请求成功
* 404  Not Found  请求资源不存在
* 500  Internal Server Error  服务端发生不可预期的错误

## 常见的响应状态码

| 状态码  | 英文描述                               | 解释                                                         |
| ------- | -------------------------------------- | ------------------------------------------------------------ |
| ==200== | **`OK`**                               | 客户端请求成功，即**处理成功**，这是我们最想看到的状态码     |
| 302     | **`Found`**                            | 指示所请求的资源已移动到由`Location`响应头给定的 URL，浏览器会自动重新访问到这个页面 |
| 304     | **`Not Modified`**                     | 告诉客户端，你请求的资源至上次取得后，服务端并未更改，你直接用你本地缓存吧。隐式重定向 |
| 400     | **`Bad Request`**                      | 客户端请求有**语法错误**，不能被服务器所理解                 |
| 403     | **`Forbidden`**                        | 服务器收到请求，但是**拒绝提供服务**，比如：没有权限访问相关资源 |
| ==404== | **`Not Found`**                        | **请求资源不存在**，一般是URL输入有误，或者网站资源被删除了  |
| 405     | **`Method Not Allowed`**               | 请求方式有误，比如应该用GET请求方式的资源，用了POST          |
| 428     | **`Precondition Required`**            | **服务器要求有条件的请求**，告诉客户端要想访问该资源，必须携带特定的请求头 |
| 429     | **`Too Many Requests`**                | 指示用户在给定时间内发送了**太多请求**（“限速”），配合 Retry-After(多长时间后可以请求)响应头一起使用 |
| 431     | **` Request Header Fields Too Large`** | **请求头太大**，服务器不愿意处理请求，因为它的头部字段太大。请求可以在减少请求头域的大小后重新提交。 |
| ==500== | **`Internal Server Error`**            | **服务器发生不可预期的错误**。服务器出异常了，赶紧看日志去吧 |
| 503     | **`Service Unavailable`**              | **服务器尚未准备好处理请求**，服务器刚刚启动，还未初始化好   |

状态码大全：https://cloud.tencent.com/developer/chapter/13553 



* 常见的HTTP响应头有:

  ~~~
  Content-Type：表示该响应内容的类型，例如text/html，application/json（表示响应内容的类型是jason）。
  
  Content-Length：表示该响应内容的长度（字节数）；
  
  Content-Encoding：表示该响应压缩算法，例如gzip ；
  
  Cache-Control：指示客户端应如何缓存，例如max-age=300表示可以最多缓存300秒 ;
  
  Set-Cookie: 告诉浏览器为当前页面所在的域设置cookie ;
  ~~~

# 63.HTTP-协议解析

将资料中准备好的Demo工程，导入到我们的IDEA中，有一个Server.java类，这里面就是自定义的一个服务器代码，主要使用到的是`ServerSocket`和`Socket`

> ==说明：以下代码大家不需要自己写，我们主要是通过代码，让大家了解到服务器针对HTTP协议的解析机制==

```java
package com.itheima;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/*
 * 自定义web服务器
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8080); // 监听指定端口
        System.out.println("server is running...");

        while (true){
            Socket sock = ss.accept();
            System.out.println("connected from " + sock.getRemoteSocketAddress());
            Thread t = new Handler(sock);
            t.start();
        }
    }
}

class Handler extends Thread {
    Socket sock;

    public Handler(Socket sock) {
        this.sock = sock;
    }

    public void run() {
        try (InputStream input = this.sock.getInputStream();
             OutputStream output = this.sock.getOutputStream()) {
                handle(input, output);
        } catch (Exception e) {
            try {
                this.sock.close();
            } catch (IOException ioe) {
            }
            System.out.println("client disconnected.");
        }
    }

    private void handle(InputStream input, OutputStream output) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(input, StandardCharsets.UTF_8));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output, StandardCharsets.UTF_8));
        // 读取HTTP请求:
        boolean requestOk = false;
        String first = reader.readLine();
        if (first.startsWith("GET / HTTP/1.")) {
            requestOk = true;
        }
        for (;;) {
            String header = reader.readLine();
            if (header.isEmpty()) { // 读取到空行时, HTTP Header读取完毕
                break;
            }
            System.out.println(header);
        }
        System.out.println(requestOk ? "Response OK" : "Response Error");

        if (!requestOk) {// 发送错误响应:
            writer.write("HTTP/1.0 404 Not Found\r\n");
            writer.write("Content-Length: 0\r\n");
            writer.write("\r\n");
            writer.flush();
        } else {// 发送成功响应:
            //读取html文件，转换为字符串
            InputStream is = Server.class.getClassLoader().getResourceAsStream("html/a.html");
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            StringBuilder data = new StringBuilder();
            String line = null;
            while ((line = br.readLine()) != null){
                data.append(line);
            }
            br.close();
            int length = data.toString().getBytes(StandardCharsets.UTF_8).length;

            writer.write("HTTP/1.1 200 OK\r\n");
            writer.write("Connection: keep-alive\r\n");
            writer.write("Content-Type: text/html\r\n");
            writer.write("Content-Length: " + length + "\r\n");
            writer.write("\r\n"); // 空行标识Header和Body的分隔
            writer.write(data.toString());
            writer.flush();
        }
    }
}

```

启动ServerSocket程序：

![image-20221202170430928](./assets/image-20221202170430928.png)



浏览器输入：`http://localhost:8080`  就会访问到ServerSocket程序 

- ServerSocket程序，会读取服务器上`html/a.html`文件，并把文件数据发送给浏览器
- 浏览器接收到a.html文件中的数据后进行解析，显示以下内容

![image-20221202171204705](./assets/image-20221202171204705.png) 



现在大家知道了服务器是可以使用java完成编写，是可以接受页面发送的请求和响应数据给前端浏览器的，而在开发中真正用到的Web服务器，我们不会自己写的，都是使用目前比较流行的web服务器。如：**Tomcat**

![](./assets/image-20220824233452167.png) 

# 64. WEB服务器-Tomcat

**简介**

**服务器概述**

**服务器硬件**

- 指的也是计算机，只不过服务器要比我们日常使用的计算机大很多。

![image-20221202173148317](./assets/image-20221202173148317.png) 

服务器，也称伺服器。是提供计算服务的设备。由于服务器需要响应服务请求，并进行处理，因此一般来说服务器应具备承担服务并且保障服务的能力。

服务器的构成包括处理器、硬盘、内存、系统总线等，和通用的计算机架构类似，但是由于需要提供高可靠的服务，因此在处理能力、稳定性、可靠性、安全性、可扩展性、可管理性等方面要求较高。

在网络环境下，根据服务器提供的服务类型不同，可分为：文件服务器，数据库服务器，应用程序服务器，WEB服务器等。

服务器只是一台设备，必须安装服务器软件才能提供相应的服务。

**服务器软件**

服务器软件：基于ServerSocket编写的程序

- 服务器软件本质是一个运行在服务器设备上的应用程序
- 能够接收客户端请求，并根据请求给客户端响应数据

![1530625192392](./assets/1530625192392.png)



#### Web服务器

Web服务器是一个应用程序(软件)，对HTTP协议的操作进行封装，使得程序员不必直接对协议进行操作(不用程序员自己写代码去解析http协议规则)，让Web开发更加便捷。主要功能是"提供网上信息浏览服务"。

![](./assets/image-20220824233614686.png)

Web服务器是安装在服务器端的一款软件，将来我们把自己写的Web项目部署到Tomcat服务器软件中，当Web服务器软件启动后，部署在Web服务器软件中的页面就可以直接通过浏览器来访问了。

# Web服务器软件使用步骤

* 准备静态资源
* 下载安装Web服务器软件
* 将静态资源部署到Web服务器上
* 启动Web服务器使用浏览器访问对应的资源

**第1步：下载安装Web服务器软件**

![image-20221202181110555](./assets/image-20221202181110555.png)

**第2步：创建项目**

或者直接新建一个项目文件夹，这里的baidu就是context root

![image-20240303121023794](assets/image-20240303121023794.png)

然后再在项目文件夹里新建 WEB-INF文件夹，这个文件夹的名字是固定的

![image-20240303121115149](assets/image-20240303121115149.png)

一个web项目最简单的形式就是两个文件夹

**第3步：将静态资源部署到Web服务器上**

然后将网页静态代码放在和WEB-INF同级的地方

![image-20240303121233942](assets/image-20240303121233942.png)

**第4步：启动Web服务器使用浏览器访问对应的资源**

![image-20221202181346327](./assets/image-20221202181346327.png)

浏览器输入：`http://localhost:8080/baidu/index.html`

![image-20240303121450129](assets/image-20240303121450129.png)

> 一个Tomcat中可能会有很多个项目，但是她们的context root不能一样，通过ip地址+端口号就能定位到某台服务器的端口号。通过context root就能定位到某个项目。然后将资源响应给客户端。

上述内容在演示的时候，使用的是Apache下的Tomcat软件，至于Tomcat软件如何使用，后面会详细的讲到。而对于Web服务器来说，实现的方案有很多，Tomcat只是其中的一种，而除了Tomcat以外，还有很多优秀的Web服务器，比如:

> Tomcat是轻量级的服务器，只支持少量的javaEE规范
>
> 而WebLogic、WebSphere支持全部的JavaEE规范，所以它们是重量级的服务器

![image-20220824233728524](./assets/image-20220824233728524.png) 

Tomcat就是一款软件，我们主要是以学习如何去使用为主。具体我们会从以下这些方向去学习:

1. 简介：初步认识下Tomcat

2. 基本使用: 安装、卸载、启动、关闭、配置和项目部署，这些都是对Tomcat的基本操作

3. IDEA中如何创建Maven Web项目

4. IDEA中如何使用Tomcat,后面这两个都是我们以后开发经常会用到的方式

首选我们来认识下Tomcat。





#### Tomcat

Tomcat服务器软件是一个免费的开源的web应用服务器。是Apache软件基金会的一个核心项目。由Apache，Sun和其他一些公司及个人共同开发而成。

由于Tomcat只支持Servlet/JSP少量JavaEE规范，所以是一个开源免费的轻量级Web服务器。

> JavaSE：java标准版Java SE（Java Platform，Standard Edition）
>
> JavaME：java小型版
>
> JavaEE规范：   JavaEE => Java Enterprise Edition(Java企业版)
>
> avaEE规范就是指Java企业级开发的技术规范总和。包含13项技术规范：JDBC、JNDI、EJB、RMI、JSP、Servlet、XML、JMS、Java IDL、JTS、JTA、JavaMail、JAF

因为Tomcat支持Servlet/JSP规范，所以Tomcat也被称为Web容器（WebContainer）、Servlet容器（Servlet是基于Servlet规范开发出来的一种web资源）。Servlet程序需要依赖于支持Servlet这种Web服务器才可以运行。

JavaWeb程序需要依赖Tomcat才能运行。

Tomcat的官网: https://tomcat.apache.org/ 

![image-20220824233903517](./assets/image-20220824233903517.png) 

# 65.Tomcat——基本使用

#### 下载

直接从官方网站下载：https://tomcat.apache.org/download-90.cgi

![](./assets/image-20220824234407828.png)

> Tomcat软件类型说明：
>
> - tar.gz文件，是linux和mac操作系统下的压缩版本
> - zip文件，是window操作系统下压缩版本（我们选择zip文件）

大家可以自行下载，也可以直接使用资料中已经下载好的资源，

Tomcat的软件程序  ：/资料/SpringbootWeb/apache-tomcat-9.0.27-windows-x64.zip

> 建议不要下载10，因为tomcat的版本是和JDK配套的。

![](./assets/image-20220824234527743.png) 

 



**3.2.2 安装与卸载**

**安装:** Tomcat是绿色版，直接解压即安装

> 在E盘的develop目录下，将`apache-tomcat-9.0.27-windows-x64.zip`进行解压缩，会得到一个`apache-tomcat-9.0.27`的目录，Tomcat就已经安装成功。

![image-20221202184545321](./assets/image-20221202184545321.png)

==注意，Tomcat在解压缩的时候，解压所在的目录可以任意，但最好解压到一个不包含中文和空格的目录，因为后期在部署项目的时候，如果路径有中文或者空格可能会导致程序部署失败。==



打开`apache-tomcat-9.0.27`目录就能看到如下目录结构，每个目录中包含的内容需要认识下

> lib：tomcat本身也是用java和c写的程序，它本身也是一个项目，所以它本身也依赖一些jar包类。

![](./assets/image-20220824234652173.png)  

bin：目录下有两类文件，一种是以`.bat`结尾的，是Windows系统的可执行文件，一种是以`.sh`结尾的，是Linux系统的可执行文件。

webapps：就是以后项目部署的目录



**卸载：**卸载比较简单，可以直接删除目录即可





**3.2.3 启动与关闭**

**启动Tomcat**

> tomcat也是用java和C写的，所以它也需要有java虚拟机（Java的运行环境），因此需要告诉tomcat，当前电脑的JDK装在什么地方。配置JAVA_HOME即可。

- 双击tomcat解压目录/bin/**startup.bat**文件即可启动tomcat

![image-20221202183201663](./assets/image-20221202183201663.png)

==注意: tomcat服务器启动后,黑窗口不会关闭,只要黑窗口不关闭,就证明tomcat服务器正在运行==

![image-20221202183409304](./assets/image-20221202183409304.png)

Tomcat的默认端口为8080，所以在浏览器的地址栏输入：`http://127.0.0.1:8080` 即可访问tomcat服务器

> 127.0.0.1 也可以使用localhost代替。如：`http://localhost:8080`

![image-20221202183550682](./assets/image-20221202183550682.png)

- 能看到以上图片中Apache Tomcat的内容就说明Tomcat已经启动成功

==注意事项== ：Tomcat启动的过程中，遇到控制台有中文乱码时，可以通常修改conf/logging.prooperties文件解决

![image-20220825083848086](./assets/image-20220825083848086.png) 



**关闭:**  关闭有三种方式 

1、强制关闭：直接x掉Tomcat窗口（不建议）

![image-20221202184753808](./assets/image-20221202184753808.png)

2、正常关闭：bin\shutdown.bat

![image-20221202185103941](./assets/image-20221202185103941.png)

3、正常关闭：在Tomcat启动窗口中按下 Ctrl+C

- 说明：如果按下Ctrl+C没有反映，可以多按几次





#### 常见问题

**问题1：Tomcat启动时，窗口一闪而过**

- 检查JAVA_HOME环境变量是否正确配置

  > 因为Tomcat中需要用到Java_Home这个环境变量

![image-20221202190033167](./assets/image-20221202190033167.png)



**问题2：端口号冲突**

![image-20220825084104447](./assets/image-20220825084104447.png)

- 发生问题的原因：Tomcat使用的端口被占用了。

- 解决方案：换Tomcat端口号
  - 要想修改Tomcat启动的端口号，需要修改 conf/server.xml文件

![image-20231026135055438](./assets/image-20231026135055438.png) 

> 注: HTTP协议默认端口号为80，如果将Tomcat端口号改为80，则将来访问Tomcat时，将不用输入端口号。
>
> localhost:80等价于localhost

# 在IDEA中将项目部署到tomcat中

## 新建Java Web项目

在父项目中新建子模块

![image-20240303122756456](assets/image-20240303122756456.png)

添加web模块

- 方法一：

  > 旧版IDEA可以直接右击模块，然后选择Add framework support添加web应用程序即可。
  >
  > 新版IDEA 2023.2以上版本 没有Add framework support选项。
  >
  > 解决办法：选中模块，双击shift，选择操作，[中文版](https://so.csdn.net/so/search?q=中文版&spm=1001.2101.3001.7020)搜索添加框架支持，英文版搜索Add framework support，即可使用

  ![image-20240303124336819](assets/image-20240303124336819.png)

  ![image-20240303124400158](assets/image-20240303124400158.png)

  删除jsp文件

  ![image-20240303124516959](assets/image-20240303124516959.png)

  

- 方法二：

  ![image-20240303144606663](assets/image-20240303144606663.png)

  然后检查目录是否配置正确

  ![image-20240303144754205](assets/image-20240303144754205.png)

  最后再点击应用，ok即可

  ![image-20240303144831605](assets/image-20240303144831605.png)

  



在web这一级新建html文件

![image-20240303133616190](assets/image-20240303133616190.png)

![image-20240303133728296](assets/image-20240303133728296.png)

新建本地tomcat

![image-20240303134010846](assets/image-20240303134010846.png)

配置tomcat

![image-20240303134543926](assets/image-20240303134543926.png)

将项目部署到tomcat中

![image-20240303134621165](assets/image-20240303134621165.png)

> WAR (Web ARchive) 文件是一种归档格式，用于将Java Web应用程序的所有组件（包括HTML文件、图像、Java类、JSP等）打包在一起。"war exploded"意味着你的项目已经被展开或解压缩到其各个部分，而不是作为一个单独的WAR文件。这种部署方式的优点是可以提高性能，因为服务器可以直接访问已展开的文件，而不需要先解压缩WAR文件。此外，某些IDE（如IntelliJ IDEA）可能会更轻松地进行热部署（hot deployment），即在运行时更新代码。
>
> 另一种选项 "pro01-javaweb-begin:Web exploded" 可能是指整个项目（包括源代码和其他资源）被展开并部署到了服务器上。这可能意味着你的项目没有被打包成WAR文件，而是直接部署了源代码和资源。
>
> 在实际应用中，通常推荐使用WAR文件进行部署，因为它更容易管理和维护。然而，在开发过程中，使用 "war exploded" 部署可以提供更快的反馈循环，因为更改可以立即反映在运行的应用程序中，而无需重新打包和部署WAR文件。

![image-20240303140810772](assets/image-20240303140810772.png)

下面的`应用程序上下文`就是我们所说的context root

![image-20240303141142439](assets/image-20240303141142439.png)

为了我们后面写代码比较方便，一般情况下直接改成一个 /

![image-20240303141303098](assets/image-20240303141303098.png)

则网址上对应的项目名称就可以省略了

`http://localhost:8080/baidu/index.html `也就变成了  `http://localhost:8080/index.html`

修改tomcat启动时打开浏览器时自动跳转到的页面的URL

![image-20240303141537190](assets/image-20240303141537190.png)

当有更新操作时，执行重新部署

![image-20240303141929714](assets/image-20240303141929714.png)

当IDEA失去焦点后，重新更新类和资源

![image-20240303142038492](assets/image-20240303142038492.png)

当在IDEA中修改tomcat端口时，修改的其实也是tomcat的config文件

![image-20240303142202405](assets/image-20240303142202405.png)

然后应用，确认即可

建议养成习惯，运行的时候都点debug模式而不是运行模式。

好处是：如果出问题了，就可以直接设置断点，直接调试。如果是运行模式，断点就没啥用了。

![image-20240303143047631](assets/image-20240303143047631.png)

tomcat运行成功，自动弹出浏览器窗口！

![image-20240303143322776](assets/image-20240303143322776.png)

eclipse在配置tomcat，在部署的时候，它是正儿八经的把这个项目部署到webapp目录的，但idea是部署在pro-web\out\artifacts中，然后在tomcat中去指明，所部署的项目在这，所以原始的webapp目录基本上就没啥用了。

![image-20240303144127883](assets/image-20240303144127883.png)



## 出现的问题

web目录前面没有蓝色小点

![image-20240303150652014](assets/image-20240303150652014.png)

进入项目结构，然后跟着下图操作

![image-20240303150810613](assets/image-20240303150810613.png)

注意web.xml的路径，中间的web非常容易掉！

![image-20240303150950791](assets/image-20240303150950791.png)

然后点击确定，应用即可。

# 66.入门程序解析

关于web开发的基础知识，我们可以告一段落了。下面呢，我们在基于今天的核心技术点SpringBoot快速入门案例进行分析。

**3.3.1 Spring官方骨架**

之前我们创建的SpringBoot入门案例，是基于Spring官方提供的骨架实现的。

Spring官方骨架，可以理解为Spring官方为程序员提供一个搭建项目的模板。

![image-20221202195646621](./assets/image-20221202195646621.png)

我们可以通过访问：https://start.spring.io/ ，进入到官方骨架页面

![image-20221202201623424](./assets/image-20221202201623424.png)

![image-20221202200356398](./assets/image-20221202200356398.png)

![image-20221202200547676](./assets/image-20221202200547676.png)

![image-20221202200708988](./assets/image-20221202200708988.png)

Spring官方生成的SpringBoot项目，怎么使用呢？

- 解压缩后，就会得到一个SpringBoot项目工程

![image-20221202201042109](./assets/image-20221202201042109.png)

![image-20221202201221136](./assets/image-20221202201221136.png)

打开pom.xml文件，我们可以看到springboot项目中引入了web依赖和test依赖（单元测试所需要的依赖）

![image-20221202201826364](./assets/image-20221202201826364.png)

> **结论：不论使用IDEA创建SpringBoot项目，还是直接在官方网站利用骨架生成SpringBoot项目，项目的结构和pom.xml文件中内容是相似的。**



#### 起步依赖

在我们之前讲解的SpringBoot快速入门案例中，同样也引用了：web依赖和test依赖

![image-20221202202305118](./assets/image-20221202202305118.png)

spring-boot-starter-web和spring-boot-starter-test，在SpringBoot中又称为：起步依赖

而在SpringBoot的项目中，有很多的起步依赖，他们有一个共同的特征：就是以`spring-boot-starter-`作为开头。在以后大家遇到spring-boot-starter-xxx这类的依赖，都为起步依赖。

起步依赖有什么特殊之处呢，这里我们以入门案例中引入的起步依赖做为讲解：

- spring-boot-starter-web：包含了web应用开发所需要的常见依赖
- spring-boot-starter-test：包含了单元测试所需要的常见依赖

> **spring-boot-starter-web**内部把关于Web开发所有的依赖都已经导入并且指定了版本，只需引入 `spring-boot-starter-web` 依赖就可以实现Web开发的需要的功能
>
> ![image-20221202204013113](./assets/image-20221202204013113.png)

Spring的官方提供了很多现成的starter(起步依赖)，我们在开发相关应用时，只需要引入对应的starter即可。

官方地址：https://docs.spring.io/spring-boot/docs/2.7.2/reference/htmlsingle/#using.build-systems.starters

![image-20221202204536647](./assets/image-20221202204536647.png)

每一个起步依赖，都用于开发一个特定的功能。

> 举例：当我们开发中需要使用redis数据库时，只需要在SpringBoot项目中，引入：spring-boot-starter-redis ，即可导入redis开发所需要的依赖。





#### SpringBoot父工程

在我们之前开发的SpringBoot入门案例中，我们通过maven引入的依赖，是没有指定具体的依赖版本号的。

![image-20221202205103486](./assets/image-20221202205103486.png)



为什么没有指定<version>版本号，可以正常使用呢？

- 因为每一个SpringBoot工程，都有一个父工程。依赖的版本号，在父工程中统一管理。

![image-20221202205318778](./assets/image-20221202205318778.png)





#### 内嵌Tomcat

问题：为什么我们之前书写的SpringBoot入门程序中，并没有把程序部署到Tomcat的webapps目录下，也可以运行呢？

原因呢，是因为在我们的SpringBoot中，引入了web运行环境(也就是引入spring-boot-starter-web起步依赖)，其内部已经集成了内置的Tomcat服务器。

我们可以通过IDEA开发工具右侧的maven面板中，就可以看到当前工程引入的依赖。其中已经将Tomcat的相关依赖传递下来了，也就是说在SpringBoot中可以直接使用Tomcat服务器。

![](./assets/image-20220825194553137.png) 

当我们运行SpringBoot的引导类时(运行main方法)，就会看到命令行输出的日志，其中占用8080端口的就是Tomcat。

![image-20220825195359993](./assets/image-20220825195359993.png)



# 67.SpringBootWeb请求响应

## 前言

在上一次的课程中，我们开发了springbootweb的入门程序。 基于SpringBoot的方式开发一个web应用，浏览器发起请求 /hello 后 ，给浏览器返回字符串 “Hello World ~”。

![image-20220826161735076](./assets/image-20220826161735076.png)

其实呢，是我们在浏览器发起请求，请求了我们的后端web服务器(也就是内置的Tomcat)。而我们在开发web程序时呢，定义了一个控制器类Controller，请求会被部署在Tomcat中的Controller接收，然后Controller再给浏览器一个响应，响应一个字符串 “Hello World”。 而在请求响应的过程中是遵循HTTP协议的。

但是呢，这里要告诉大家的时，其实在Tomcat这类Web服务器中，是不识别我们自己定义的Controller的。但是我们前面讲到过Tomcat是一个Servlet容器，是支持Serlvet规范的，所以呢，在tomcat中是可以识别 Servlet程序的。 那我们所编写的XxxController 是如何处理请求的，又与Servlet之间有什么联系呢？

其实呢，在SpringBoot进行web程序开发时，它内置了一个核心的Servlet程序 DispatcherServlet，称之为 核心控制器（前端控制器）。 DispatcherServlet 负责接收页面发送的请求，然后根据执行的规则，将请求再转发给后面的请求处理器Controller，请求处理器处理完请求之后，最终再由DispatcherServlet给浏览器响应数据。

![image-20220826165340157](./assets/image-20220826165340157.png)

那将来浏览器发送请求，会携带请求数据，包括：请求行、请求头；请求到达tomcat之后，tomcat会负责解析这些请求数据，然后呢将解析后的请求数据会传递给Servlet程序的HttpServletRequest对象，那也就意味着 HttpServletRequest 对象就可以获取到请求数据。 而Tomcat，还给Servlet程序传递了一个参数 HttpServletResponse，通过这个对象，我们就可以给浏览器设置响应数据 。

![image-20220826171407354](./assets/image-20220826171407354.png) 

那上述所描述的这种浏览器/服务器的架构模式呢，我们称之为：BS架构。

![image-20220826171454775](./assets/image-20220826171454775.png) 

常见的软件架构一共有两种：BS、CS

- BS架构：Browser/Server，浏览器/服务器架构模式。客户端只需要浏览器输入网址就能使用了，应用程序的逻辑和数据都存储在服务端。（维护方便 体验一般）

  例如：京东和淘宝的网站。

  优点：客户端不需要安装；维护成本较低。

  缺点：所有的计算和存储任务都是放在服务端的，服务器的负荷较重；在服务器计算完成之后把结果再传给客户端，因此客户端和服务器端会进行非常频繁的数据通信，从而网络负荷较重。

- CS架构：Client/Server，客户端/服务器架构模式，在这种模式下，我们是需要去下载对应的客户端程序，在远程还有一个服务端程序。并且每个操作系统的客户端都不一样。（开发、维护麻烦  体验不错，速度快）

  例如：QQ、Steam，这两个都要下载客户端才能使用。

  **优点**：充分利用客户端机器的资源，减轻服务器的负荷。

  一部分安全要求不高的计算任务存储任务放在客户端执行，不需要把所有的计算和存储都在服务器端执行，从而能够减轻服务器的压力，也能够减轻网络负荷。

  **缺点**：需要安装；升级维护成本较高。

当然现在很多大的互联网公司两种架构都能兼顾，例如淘宝：在电脑上我们可以通过浏览器进行访问，而在手机上我们可以下载客户端，即淘宝的APP进行访问。

在 `CS架构` 中是 `客户端 + 服务器`，在 `BS架构` 中是 `浏览器 + 服务器`，所以我们要知道，不管是CS还是BS架构，客户端/浏览器它们两个负责的仅仅是把数据展示出来，展示给用户看。

在项目中真正核心的业务逻辑其实就是后面的服务器中的。

<img src="./assets/image-20240507155929775.png" alt="image-20240507155929775" style="zoom:50%;" />

----

## BS架构

以网页游戏为例，来分析一下BS的优缺点。

基本上所有的网页游戏都有一个特点：不需要下载客户端，打开浏览器输入网址就能玩了，非常的方便。

方便是方便了，但是它的画面用一个字来形容就是 `烂`。

是游戏公司脑子不好，故意将画面设计的这么烂，让我们毫无游戏体验吗？

其实不是这样的，在BS架构中，浏览器里面要显示的所有的图片、特效、背景音乐等，在你的本地是没有的，所有的东西都需要通过网络给你传递过来。

你想一下，如果右边的画面它做的非常的精美，那么图片就会变的非常的大。如果玩家的网络再不好，那么根本显示不了游戏的界面。

<img src="./assets/image-20240507160403777.png" alt="image-20240507160403777" style="zoom:33%;" />

此时我们就能发现BS架构的优缺点：

1、不需要开发客户端程序，只需要开发前端页面 + 服务器即可，打开浏览器就能访问，针对于公司来讲，开发、部署、维护都非常的简单。

2、而针对于用户来讲，也不需要去下载和安装客户端了，打开浏览器就能使用，非常的方便。

特别是，如果我想要更新一个功能，用户是不需要操作的，我直接在服务器修改就行了。用户唯一要做的就是刷新一下浏览器，仅此而已。

因此BS架构的特点主要突出一个：方便。

但是它也有自己的缺点：如果应用过大，用户的体验可能就会收到影响。例如：网页游戏的画质就会非常的差劲，背景音乐也没那么精美。

----

## CS架构

所有需要我们下载安装包并进行安装的，其实都是CS架构，并且画面越精美的，它的安装包就越大，那为什么是这样的呢？

其实就是因为在CS架构中，安装包里面包含的其实就是游戏里面用到的图片、音乐等等资源，这些资源在安装的时候就已经在用户本地了。

在玩游戏的过程中，服务器就不需要将游戏的图片、音乐通过网络传输给客户端了。

它只需要告诉客户端：你现在该显示哪张图片，这就可以了。

<img src="./assets/image-20240507161103585.png" alt="image-20240507161103585" style="zoom:33%;" />

由此可见，CS架构的软件，因为事先已经下载好了所有的资源，所以可以把画面、音乐做的非常的精美，用户的体验非常的好。

缺点：跟BS相比，CS需要同时开发两个东西：既要开发服务端，又要开发客户端。

因此针对于公司来讲CS架构它的开发、安装、部署、维护都会非常的麻烦。

特别是，服务器一更新，那么你的客户端也不得不跟着一起更新，要不然你这游戏就玩不了。

----

## 四、总结

因此不管是哪种架构，它自己都有各自的优缺点，具体用哪种，需要结合当前项目的特点来断定。

一般来讲，像王者荣耀这样的游戏，它对于画面、音乐有非常大的要求，就可以用CS。

但是如果是类似于新闻、购物网站这些，它对画质没什么太大要求，此时就可以用BS架构。

<img src="./assets/image-20240507161513234.png" alt="image-20240507161513234" style="zoom:50%;" />



那今天呢，我们的课程内容主要就围绕着：请求、响应进行。 今天课程内容，主要包含三个部分：

> - 请求
> - 响应
> - 分层解耦



**1. 请求**

在本章节呢，我们主要讲解，如何接收页面传递过来的请求数据。

### 1.1 Postman

之前我们课程中有提到当前最为主流的开发模式：前后端分离

![image-20221203095553048](./assets/image-20221203095553048.png)

在这种模式下，前端技术人员基于"接口文档"，开发前端程序；后端技术人员也基于"接口文档"，开发后端程序。

由于前后端分离，对我们后端技术人员来讲，在开发过程中，是没有前端页面的，那我们怎么测试自己所开发的程序呢？

方式1：像之前SpringBoot入门案例中一样，直接使用浏览器。在浏览器中输入地址，测试后端程序。

- 弊端：在浏览器地址栏中输入地址这种方式都是GET请求，如何我们要用到POST请求怎么办呢？
  - 要解决POST请求，需要程序员自己编写前端代码（比较麻烦）

方式2：使用专业的接口测试工具（课程中我们使用Postman工具）

#### 1.1.1 介绍

![image-20220826173003949](./assets/image-20220826173003949.png) 

- Postman是一款功能强大的网页调试与发送网页HTTP请求的Chrome插件。

  > Postman原是Chrome浏览器的插件，可以模拟浏览器向后端服务器发起任何形式(如:get、post)的HTTP请求
  >
  > 使用Postman还可以在发起请求时，携带一些请求参数、请求头等信息

- 作用：常用于进行接口测试

- 特征

  - 简单
  - 实用
  - 美观
  - 大方

基于Postman衍生出来的工具：

![image-20231026185551966](./assets/image-20231026185551966.png)

![image-20231026185604649](./assets/image-20231026185604649.png)



#### 安装

![image-20220826173919556](./assets/image-20220826173919556.png) 

双击资料中提供的`Postman-win64-8.3.1-Setup.exe`即可自动安装。

![image-20220826174601266](./assets/image-20220826174601266.png) 

安装完成之后，进入页面中会提示有新版本可以升级（无需升级）

![image-20220826174900779](./assets/image-20220826174900779.png)

![image-20221203112117979](./assets/image-20221203112117979.png)

界面介绍:

![image-20220826175306141](./assets/image-20220826175306141.png) 



**如果我们需要将测试的请求信息保存下来，就需要创建一个postman的账号，然后登录之后才可以。**

![image-20221203103623435](./assets/image-20221203103623435.png)

![image-20221203112252985](./assets/image-20221203112252985.png) 

![image-20221203112320687](./assets/image-20221203112320687.png) 

登录完成之后，可以创建工作空间（并且会将这些测试数据同步到云端）：

![image-20221203113552785](./assets/image-20221203113552785.png)

![image-20221203113925733](./assets/image-20221203113925733.png)

![image-20221203113847126](./assets/image-20221203113847126.png)

创建请求：

![image-20221203114031824](./assets/image-20221203114031824.png)

点击"Save"，保存当前请求

![image-20221203114231572](./assets/image-20221203114231572.png)

![image-20221203114806665](./assets/image-20221203114806665.png)

![image-20221203114852752](./assets/image-20221203114852752.png)

![image-20221203115001098](./assets/image-20221203115001098.png)

![image-20221203115041949](./assets/image-20221203115041949.png)

![image-20221203115110440](./assets/image-20221203115110440.png)







#### **简单参数**

简单参数：在向服务器发起请求时，向服务器传递的是一些普通的请求数据。

![image-20220826180550583](./assets/image-20220826180550583.png)

那么在后端程序中，如何接收传递过来的普通参数数据呢？

我们在这里讲解两种方式：

1. 原始方式   
2. SpringBoot方式

#### 1.2.1 原始方式

在原始的Web程序当中，需要通过Servlet中提供的API：HttpServletRequest（请求对象），获取请求的相关信息。比如获取请求参数：

> Tomcat接收到http请求时：把请求的相关信息封装到HttpServletRequest对象中

在Controller中，我们要想获取Request对象，可以直接在方法的形参中声明 HttpServletRequest 对象。然后就可以通过该对象来获取请求信息：

```json
//根据指定的参数名获取请求参数的数据值
String  request.getParameter("参数名")
```

```java
@RestController
public class RequestController {
    //原始方式
    @RequestMapping("/simpleParam")
    public String simpleParam(HttpServletRequest request){
        // http://localhost:8080/simpleParam?name=Tom&age=10
        // 请求参数： name=Tom&age=10   （有2个请求参数）
        // 第1个请求参数： name=Tom   参数名:name，参数值:Tom
        // 第2个请求参数： age=10     参数名:age , 参数值:10

        String name = request.getParameter("name");//name就是请求参数名
        String ageStr = request.getParameter("age");//age就是请求参数名

        int age = Integer.parseInt(ageStr);//需要手动进行类型转换
        System.out.println(name+"  :  "+age);
        return "OK";
    }
}
```

> 以上这种方式，我们仅做了解。（在以后的开发中不会使用到）



#### 1.2.2 SpringBoot方式

在Springboot的环境中，对原始的API进行了封装，接收参数的形式更加简单。 如果是简单参数，参数名与形参变量名相同，定义同名的形参即可接收参数。

~~~java
@RestController
public class RequestController {
    // http://localhost:8080/simpleParam?name=Tom&age=10
    // 第1个请求参数： name=Tom   参数名:name，参数值:Tom
    // 第2个请求参数： age=10     参数名:age , 参数值:10
    
    //springboot方式
    @RequestMapping("/simpleParam")
    public String simpleParam(String name , Integer age ){//形参名和请求参数名保持一致
        System.out.println(name+"  :  "+age);
        return "OK";
    }
}
~~~

**postman测试( GET 请求)：**

![image-20221203122405075](./assets/image-20221203122405075.png) 

**postman测试( POST请求 )：**

![image-20220826181117898](./assets/image-20220826181117898.png)

> **结论：不论是GET请求还是POST请求，对于简单参数来讲，只要保证==请求参数名和Controller方法中的形参名保持一致==，就可以获取到请求参数中的数据值。**



#### 1.2.3 参数名不一致

如果方法形参名称与请求参数名称不一致，controller方法中的形参还能接收到请求参数值吗？

~~~java
@RestController
public class RequestController {
    // http://localhost:8080/simpleParam?name=Tom&age=20
    // 请求参数名：name

    //springboot方式
    @RequestMapping("/simpleParam")
    public String simpleParam(String username , Integer age ){//请求参数名和形参名不相同
        System.out.println(username+"  :  "+age);
        return "OK";
    }
}
~~~

答案：运行没有报错。 controller方法中的username值为：null，age值为20

- 结论：对于简单参数来讲，请求参数名和controller方法中的形参名不一致时，无法接收到请求数据

那么如果我们开发中，遇到了这种请求参数名和controller方法中的形参名不相同，怎么办？

解决方案：可以使用Spring提供的@RequestParam注解完成映射

在方法形参前面加上 @RequestParam 然后通过value属性执行请求参数名，从而完成映射。代码如下：

```java
@RestController
public class RequestController {
    // http://localhost:8080/simpleParam?name=Tom&age=20
    // 请求参数名：name

    //springboot方式
    @RequestMapping("/simpleParam")
    public String simpleParam(@RequestParam("name") String username , Integer age ){
        System.out.println(username+"  :  "+age);
        return "OK";
    }
}
```

> **注意事项：**
>
> @RequestParam中的required属性默认为true（默认值也是true），代表该请求参数必须传递，如果不传递将报错
>
> ![image-20221203130726310](./assets/image-20221203130726310.png)
>
> 如果该参数是可选的，可以将required属性设置为false
>
> ~~~java
> @RequestMapping("/simpleParam")
> public String simpleParam(@RequestParam(name = "name", required = false) String username, Integer age){
> System.out.println(username+ ":" + age);
> return "OK";
> }
> ~~~







### 1.3 实体参数

在使用简单参数做为数据传递方式时，前端传递了多少个请求参数，后端controller方法中的形参就要书写多少个。如果请求参数比较多，通过上述的方式一个参数一个参数的接收，会比较繁琐。 

此时，我们可以考虑将请求参数封装到一个实体类对象中。 要想完成数据封装，需要遵守如下规则：**请求参数名与实体类的属性名相同**

![image-20221203131954932](./assets/image-20221203131954932.png)

#### 1.3.1 简单实体对象

定义POJO实体类：

```java
public class User {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

```

Controller方法：

```java
@RestController
public class RequestController {
    //实体参数：简单实体对象
    @RequestMapping("/simplePojo")
    public String simplePojo(User user){
        System.out.println(user);
        return "OK";
    }
}
```

Postman测试：

- 参数名和实体类属性名一致时

![image-20221203161246168](./assets/image-20221203161246168.png) 

- 参数名和实体类属性名不一致时

![image-20221203161004349](./assets/image-20221203161004349.png)





#### 1.3.2 复杂实体对象

上面我们讲的呢是简单的实体对象，下面我们在来学习下复杂的实体对象。

复杂实体对象指的是，在实体类中有一个或多个属性，也是实体对象类型的。如下：

- User类中有一个Address类型的属性（Address是一个实体类）

![image-20221203160447953](./assets/image-20221203160447953.png)

复杂实体对象的封装，需要遵守如下规则：

- **请求参数名与形参对象属性名相同，按照对象层次结构关系即可接收嵌套实体类属性参数。**

定义POJO实体类：

- Address实体类

```java
public class Address {
    private String province;
    private String city;

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
```

- User实体类

```java
public class User {
    private String name;
    private Integer age;
    private Address address; //地址对象

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
```

Controller方法：

```java
@RestController
public class RequestController {
    //实体参数：复杂实体对象
    @RequestMapping("/complexPojo")
    public String complexPojo(User user){
        System.out.println(user);
        return "OK";
    }
}
```

Postman测试：

![image-20221203162706175](./assets/image-20221203162706175.png) 





### 1.4 数组集合参数

数组集合参数的使用场景：在HTML的表单中，有一个表单项是支持多选的(复选框)，可以提交选择的多个值。

![image-20221203164114083](./assets/image-20221203164114083.png) 

多个值是怎么提交的呢？其实多个值也是一个一个的提交。

![image-20221203164944144](./assets/image-20221203164944144.png) 

后端程序接收上述多个值的方式有两种：

1. 数组
2. 集合



#### 1.4.1 数组

数组参数：**请求参数名与形参数组名称相同且请求参数为多个，定义数组类型形参即可接收参数**

![image-20221203190218468](./assets/image-20221203190218468.png)

Controller方法：

```java
@RestController
public class RequestController {
    //数组集合参数
    @RequestMapping("/arrayParam")
    public String arrayParam(String[] hobby){
        System.out.println(Arrays.toString(hobby));
        return "OK";
    }
}
```

Postman测试：

在前端请求时，有两种传递形式：

方式一： xxxxxxxxxx?hobby=game&hobby=java

![image-20221203191732601](./assets/image-20221203191732601.png) 

方式二：xxxxxxxxxxxxx?hobby=game,java

![image-20221203191822996](./assets/image-20221203191822996.png)



 

#### 1.4.2 集合

集合参数：**请求参数名与形参集合对象名相同且请求参数为多个，@RequestParam 绑定参数关系**

> 默认情况下，请求中参数名相同的多个值，是封装到数组。如果要封装到集合，要使用@RequestParam绑定参数关系

![image-20221203211640646](./assets/image-20221203211640646.png)

Controller方法：

```java
@RestController
public class RequestController {
    //数组集合参数
    @RequestMapping("/listParam")
    public String listParam(@RequestParam List<String> hobby){
        System.out.println(hobby);
        return "OK";
    }
}
```

Postman测试：

方式一： xxxxxxxxxx?hobby=game&hobby=java

![image-20221203212221939](./assets/image-20221203212221939.png) 

方式二：xxxxxxxxxxxxx?hobby=game,java

![image-20221203212024679](./assets/image-20221203212024679.png)





### 1.5 日期参数

上述演示的都是一些普通的参数，在一些特殊的需求中，可能会涉及到日期类型数据的封装。比如，如下需求：

![image-20220826194159343](./assets/image-20220826194159343.png) 

因为日期的格式多种多样（如：2022-12-12 10:05:45 、2022/12/12 10:05:45），那么对于日期类型的参数在进行封装的时候，需要通过@DateTimeFormat注解，以及其pattern属性来设置日期的格式。

![image-20221203213120692](./assets/image-20221203213120692.png)

- @DateTimeFormat注解的pattern属性中指定了哪种日期格式，前端的日期参数就必须按照指定的格式传递。
- 后端controller方法中，需要使用Date类型或LocalDateTime类型，来封装传递的参数。

Controller方法：

```java
@RestController
public class RequestController {
    //日期时间参数
   @RequestMapping("/dateParam")
    public String dateParam(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime updateTime){
        System.out.println(updateTime);
        return "OK";
    }
}
```

Postman测试：

![image-20221203214600716](./assets/image-20221203214600716.png)





### 1.6 JSON参数

在学习前端技术时，我们有讲到过JSON，而在前后端进行交互时，如果是比较复杂的参数，前后端通过会使用JSON格式的数据进行传输。 （JSON是开发中最常用的前后端数据交互方式）

我们学习JSON格式参数，主要从以下两个方面着手：

1. Postman在发送请求时，如何传递json格式的请求参数
2. 在服务端的controller方法中，如何接收json格式的请求参数

Postman发送JSON格式数据：

![image-20221203225623337](./assets/image-20221203225623337.png)

服务端Controller方法接收JSON格式数据：

- 传递json格式的参数，在Controller中会使用实体类进行封装。 
- 封装规则：**JSON数据键名与形参对象属性名相同，定义POJO类型形参即可接收参数。需要使用 @RequestBody标识。**

![image-20221203230457901](./assets/image-20221203230457901.png)

- @RequestBody注解：将JSON数据映射到形参的实体类对象中（JSON中的key和实体类中的属性名保持一致）

实体类：Address

```java
public class Address {
    private String province;
    private String city;
    
	//省略GET , SET 方法
}
```

实体类：User

```java
public class User {
    private String name;
    private Integer age;
    private Address address;
    
    //省略GET , SET 方法
}    
```

Controller方法：

```java
@RestController
public class RequestController {
    //JSON参数
    @RequestMapping("/jsonParam")
    public String jsonParam(@RequestBody User user){
        System.out.println(user);
        return "OK";
    }
}
```

Postman测试：

![image-20221203231803000](./assets/image-20221203231803000.png) 





### 1.7 路径参数

传统的开发中请求参数是放在请求体(POST请求)传递或跟在URL后面通过?key=value的形式传递(GET请求)。

![image-20221203235715804](./assets/image-20221203235715804.png)

在现在的开发中，经常还会直接在请求的URL中传递参数。例如：

~~~
http://localhost:8080/user/1		
http://localhost:880/user/1/0
~~~

上述的这种传递请求参数的形式呢，我们称之为：路径参数。

学习路径参数呢，主要掌握在后端的controller方法中，如何接收路径参数。

路径参数：

- 前端：通过请求URL直接传递参数
- 后端：使用{…}来标识该路径参数，需要使用@PathVariable获取路径参数

![image-20221204001520756](./assets/image-20221204001520756.png)

Controller方法：

```java
@RestController
public class RequestController {
    //路径参数
    @RequestMapping("/path/{id}")
    public String pathParam(@PathVariable Integer id){
        System.out.println(id);
        return "OK";
    }
}
```

Postman测试：

![image-20221204002040184](./assets/image-20221204002040184.png)

 

**传递多个路径参数：**

Postman：

![image-20221204002306288](./assets/image-20221204002306288.png)

Controller方法：

~~~java
@RestController
public class RequestController {
    //路径参数
    @RequestMapping("/path/{id}/{name}")
    public String pathParam2(@PathVariable Integer id, @PathVariable String name){
        System.out.println(id+ " : " +name);
        return "OK";
    }
}
~~~





## 2. 响应

前面我们学习过HTTL协议的交互方式：请求响应模式（有请求就有响应）

那么Controller程序呢，除了接收请求外，还可以进行响应。

### 2.1 @ResponseBody

在我们前面所编写的controller方法中，都已经设置了响应数据。

![image-20221204100656376](./assets/image-20221204100656376.png)

controller方法中的return的结果，怎么就可以响应给浏览器呢？

答案：使用@ResponseBody注解

**@ResponseBody注解：**

- 类型：方法注解、类注解
- 位置：书写在Controller方法上或类上
- 作用：将方法返回值直接响应给浏览器
  - 如果返回值类型是实体对象/集合，将会转换为JSON格式后在响应给浏览器

但是在我们所书写的Controller中，只在类上添加了@RestController注解、方法添加了@RequestMapping注解，并没有使用@ResponseBody注解，怎么给浏览器响应呢？

~~~java
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("Hello World ~");
        return "Hello World ~";
    }
}
~~~

原因：在类上添加的@RestController注解，是一个组合注解。

- @RestController = @Controller + @ResponseBody 

@RestController源码：

~~~java
@Target({ElementType.TYPE})   //元注解（修饰注解的注解）
@Retention(RetentionPolicy.RUNTIME)  //元注解
@Documented    //元注解
@Controller   
@ResponseBody 
public @interface RestController {
    @AliasFor(
        annotation = Controller.class
    )
    String value() default "";
}
~~~

结论：在类上添加@RestController就相当于添加了@ResponseBody注解。

- 类上有@RestController注解或@ResponseBody注解时：表示当前类下所有的方法返回值做为响应数据
  - 方法的返回值，如果是一个POJO对象或集合时，会先转换为JSON格式，在响应给浏览器



下面我们来测试下响应数据：

~~~java
@RestController
public class ResponseController {
    //响应字符串
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("Hello World ~");
        return "Hello World ~";
    }
    //响应实体对象
    @RequestMapping("/getAddr")
    public Address getAddr(){
        Address addr = new Address();//创建实体类对象
        addr.setProvince("广东");
        addr.setCity("深圳");
        return addr;
    }
    //响应集合数据
    @RequestMapping("/listAddr")
    public List<Address> listAddr(){
        List<Address> list = new ArrayList<>();//集合对象
        
        Address addr = new Address();
        addr.setProvince("广东");
        addr.setCity("深圳");

        Address addr2 = new Address();
        addr2.setProvince("陕西");
        addr2.setCity("西安");

        list.add(addr);
        list.add(addr2);
        return list;
    }
}
~~~

在服务端响应了一个对象或者集合，那私前端获取到的数据是什么样子的呢？我们使用postman发送请求来测试下。测试效果如下：

![image-20221204172339375](./assets/image-20221204172339375.png)

![image-20221204172705426](./assets/image-20221204172705426.png)



### 2.2 统一响应结果

大家有没有发现一个问题，我们在前面所编写的这些Controller方法中，返回值各种各样，没有任何的规范。

![image-20221204174052622](./assets/image-20221204174052622.png)

如果我们开发一个大型项目，项目中controller方法将成千上万，使用上述方式将造成整个项目难以维护。那在真实的项目开发中是什么样子的呢？

在真实的项目开发中，无论是哪种方法，我们都会定义一个统一的返回结果。方案如下：

![image-20221204174537686](./assets/image-20221204174537686.png)

> 前端：只需要按照统一格式的返回结果进行解析(仅一种解析方案)，就可以拿到数据。

统一的返回结果使用类来描述，在这个结果中包含：

- 响应状态码：当前请求是成功，还是失败

- 状态码信息：给页面的提示信息

- 返回的数据：给前端响应的数据（字符串、对象、集合）

定义在一个实体类Result来包含以上信息。代码如下：

```java
public class Result {
    private Integer code;//响应码，1 代表成功; 0 代表失败
    private String msg;  //响应码 描述字符串
    private Object data; //返回的数据

    public Result() { }
    public Result(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    //增删改 成功响应(不需要给前端返回数据)
    public static Result success(){
        return new Result(1,"success",null);
    }
    //查询 成功响应(把查询结果做为返回数据响应给前端)
    public static Result success(Object data){
        return new Result(1,"success",data);
    }
    //失败响应
    public static Result error(String msg){
        return new Result(0,msg,null);
    }
}
```

改造Controller：

~~~java
@RestController
public class ResponseController { 
    //响应统一格式的结果
    @RequestMapping("/hello")
    public Result hello(){
        System.out.println("Hello World ~");
        //return new Result(1,"success","Hello World ~");
        return Result.success("Hello World ~");
    }

    //响应统一格式的结果
    @RequestMapping("/getAddr")
    public Result getAddr(){
        Address addr = new Address();
        addr.setProvince("广东");
        addr.setCity("深圳");
        return Result.success(addr);
    }

    //响应统一格式的结果
    @RequestMapping("/listAddr")
    public Result listAddr(){
        List<Address> list = new ArrayList<>();

        Address addr = new Address();
        addr.setProvince("广东");
        addr.setCity("深圳");

        Address addr2 = new Address();
        addr2.setProvince("陕西");
        addr2.setCity("西安");

        list.add(addr);
        list.add(addr2);
        return Result.success(list);
    }
}
~~~

使用Postman测试：

![image-20221204180946963](./assets/image-20221204180946963.png)

![image-20221204180744084](./assets/image-20221204180744084.png)





### 2.3 案例

下面我们通过一个案例，来加强对请求响应的学习。

#### 2.3.1 需求说明

需求：加载并解析xml文件中的数据，完成数据处理，并在页面展示

![image-20221204185928260](./assets/image-20221204185928260.png)  

- 获取员工数据，返回统一响应结果，在页面渲染展示



#### 2.3.2 准备工作

案例准备：

1. XML文件
   - 已经准备好(emp.xml)，直接导入进来，放在 src/main/resources目录下
2. 工具类
   - 已经准备好解析XML文件的工具类，无需自己实现
   - 直接在创建一个包 com.itheima.utils ，然后将工具类拷贝进来

3. 前端页面资源
   - 已经准备好，直接拷贝进来，放在src/main/resources下的static目录下

Springboot项目的静态资源(html，css，js等前端资源)默认存放目录为：classpath:/static 、 classpath:/public、 classpath:/resources

> 在SpringBoot项目中，静态资源默认可以存放的目录：
>
> - classpath:/static/
> - classpath:/public/
> - classpath:/resources/
> - classpath:/META-INF/resources/
>
> classpath：
>
> - 代表的是类路径，在maven的项目中，其实指的就是 src/main/resources 或者 src/main/java，但是java目录是存放java代码的，所以相关的配置文件及静态资源文档，就放在 src/main/resources下。



#### 2.3.3 实现步骤

1. 在pom.xml文件中引入dom4j的依赖，用于解析XML文件

   ~~~xml
   <dependency>
       <groupId>org.dom4j</groupId>
       <artifactId>dom4j</artifactId>
       <version>2.1.3</version>
   </dependency>
   ~~~

2. 引入资料中提供的：解析XML的工具类XMLParserUtils、实体类Emp、XML文件emp.xml

   ![image-20221204182828547](./assets/image-20221204182828547.png) 

3. 引入资料中提供的静态页面文件，放在resources下的static目录下

   ![image-20221204183044848](./assets/image-20221204183044848.png) 

4. 创建EmpController类，编写Controller程序，处理请求，响应数据

   ![image-20221204184313822](./assets/image-20221204184313822.png) 



#### 2.3.4 代码实现

Contriller代码：

```java
@RestController
public class EmpController {
    @RequestMapping("/listEmp")
    public Result list(){
        //1. 加载并解析emp.xml
        String file = this.getClass().getClassLoader().getResource("emp.xml").getFile();
        //System.out.println(file);
        List<Emp> empList = XmlParserUtils.parse(file, Emp.class);

        //2. 对数据进行转换处理 - gender, job
        empList.stream().forEach(emp -> {
            //处理 gender 1: 男, 2: 女
            String gender = emp.getGender();
            if("1".equals(gender)){
                emp.setGender("男");
            }else if("2".equals(gender)){
                emp.setGender("女");
            }

            //处理job - 1: 讲师, 2: 班主任 , 3: 就业指导
            String job = emp.getJob();
            if("1".equals(job)){
                emp.setJob("讲师");
            }else if("2".equals(job)){
                emp.setJob("班主任");
            }else if("3".equals(job)){
                emp.setJob("就业指导");
            }
        });
        //3. 响应数据
        return Result.success(empList);
    }
}
```

统一返回结果实体类：

~~~java
public class Result {
    private Integer code ;//1 成功 , 0 失败
    private String msg; //提示信息
    private Object data; //数据 date

    public Result() {
    }
    public Result(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    public Integer getCode() {
        return code;
    }
    public void setCode(Integer code) {
        this.code = code;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
    public static Result success(Object data){
        return new Result(1, "success", data);
    }
    public static Result success(){
        return new Result(1, "success", null);
    }
    public static Result error(String msg){
        return new Result(0, msg, null);
    }
}
~~~



#### 2.3.5 测试

代码编写完毕之后，我们就可以运行引导类，启动服务进行测试了。 

使用Postman测试：

![image-20221204190341389](./assets/image-20221204190341389.png)

打开浏览器，在浏览器地址栏输入： http://localhost:8080/emp.html

![image-20221204185455556](./assets/image-20221204185455556.png) 





#### 2.3.6 问题分析

上述案例的功能，我们虽然已经实现，但是呢，我们会发现案例中：解析XML数据，获取数据的代码，处理数据的逻辑的代码，给页面响应的代码全部都堆积在一起了，全部都写在controller方法中了。

![image-20221204190712411](./assets/image-20221204190712411.png)

当前程序的这个业务逻辑还是比较简单的，如果业务逻辑再稍微复杂一点，我们会看到Controller方法的代码量就很大了。

- 当我们要修改操作数据部分的代码，需要改动Controller

- 当我们要完善逻辑处理部分的代码，需要改动Controller

- 当我们需要修改数据响应的代码，还是需要改动Controller

这样呢，就会造成我们整个工程代码的复用性比较差，而且代码难以维护。 那如何解决这个问题呢？其实在现在的开发中，有非常成熟的解决思路，那就是分层开发。





## 3. 分层解耦

### 3.1 三层架构

#### 3.1.1 介绍

在我们进行程序设计以及程序开发时，尽可能让每一个接口、类、方法的职责更单一些（单一职责原则）。

> 单一职责原则：一个类或一个方法，就只做一件事情，只管一块功能。
>
> 这样就可以让类、接口、方法的复杂度更低，可读性更强，扩展性更好，也更利用后期的维护。

我们之前开发的程序呢，并不满足单一职责原则。下面我们来分析下之前的程序：

![image-20221204191650390](./assets/image-20221204191650390.png) 

那其实我们上述案例的处理逻辑呢，从组成上看可以分为三个部分：

- 数据访问：负责业务数据的维护操作，包括增、删、改、查等操作。
- 逻辑处理：负责业务逻辑处理的代码。
- 请求处理、响应数据：负责，接收页面的请求，给页面响应数据。

按照上述的三个组成部分，在我们项目开发中呢，可以将代码分为三层：

![image-20221204193837678](./assets/image-20221204193837678.png)

- Controller：控制层。接收前端发送的请求，对请求进行处理，并响应数据。
- Service：业务逻辑层。处理具体的业务逻辑。
- Dao：数据访问层(Data Access Object)，也称为持久层。负责数据访问操作，包括数据的增、删、改、查。



基于三层架构的程序执行流程：

![image-20221204194207812](./assets/image-20221204194207812.png)

- 前端发起的请求，由Controller层接收（Controller响应数据给前端）
- Controller层调用Service层来进行逻辑处理（Service层处理完后，把处理结果返回给Controller层）
- Serivce层调用Dao层（逻辑处理过程中需要用到的一些数据要从Dao层获取）
- Dao层操作文件中的数据（Dao拿到的数据会返回给Service层）

> 思考：按照三层架构的思想，如何要对业务逻辑(Service层)进行变更，会影响到Controller层和Dao层吗？ 
>
> 答案：不会影响。 （程序的扩展性、维护性变得更好了）





#### 3.1.2 代码拆分

我们使用三层架构思想，来改造下之前的程序：

- 控制层包名：xxxx.controller
- 业务逻辑层包名：xxxx.service
- 数据访问层包名：xxxx.dao

![image-20221204195812200](./assets/image-20221204195812200.png)

**控制层：**接收前端发送的请求，对请求进行处理，并响应数据

```java
@RestController
public class EmpController {
    //业务层对象
    private EmpService empService = new EmpServiceA();

    @RequestMapping("/listEmp")
    public Result list(){
        //1. 调用service层, 获取数据
        List<Emp> empList = empService.listEmp();

        //3. 响应数据
        return Result.success(empList);
    }
}
```

**业务逻辑层：**处理具体的业务逻辑

- 业务接口

~~~java
//业务逻辑接口（制定业务标准）
public interface EmpService {
    //获取员工列表
    public List<Emp> listEmp();
}
~~~

- 业务实现类

```java
//业务逻辑实现类（按照业务标准实现）
public class EmpServiceA implements EmpService {
    //dao层对象
    private EmpDao empDao = new EmpDaoA();

    @Override
    public List<Emp> listEmp() {
        //1. 调用dao, 获取数据
        List<Emp> empList = empDao.listEmp();

        //2. 对数据进行转换处理 - gender, job
        empList.stream().forEach(emp -> {
            //处理 gender 1: 男, 2: 女
            String gender = emp.getGender();
            if("1".equals(gender)){
                emp.setGender("男");
            }else if("2".equals(gender)){
                emp.setGender("女");
            }

            //处理job - 1: 讲师, 2: 班主任 , 3: 就业指导
            String job = emp.getJob();
            if("1".equals(job)){
                emp.setJob("讲师");
            }else if("2".equals(job)){
                emp.setJob("班主任");
            }else if("3".equals(job)){
                emp.setJob("就业指导");
            }
        });
        return empList;
    }
}
```

**数据访问层：**负责数据的访问操作，包含数据的增、删、改、查

- 数据访问接口

~~~java
//数据访问层接口（制定标准）
public interface EmpDao {
    //获取员工列表数据
    public List<Emp> listEmp();
}
~~~

- 数据访问实现类

```java
//数据访问实现类
public class EmpDaoA implements EmpDao {
    @Override
    public List<Emp> listEmp() {
        //1. 加载并解析emp.xml
        String file = this.getClass().getClassLoader().getResource("emp.xml").getFile();
        System.out.println(file);
        List<Emp> empList = XmlParserUtils.parse(file, Emp.class);
        return empList;
    }
}
```

![image-20221204201342490](./assets/image-20221204201342490.png)

三层架构的好处：

1. 复用性强
2. 便于维护
3. 利用扩展





### 3.2 分层解耦

刚才我们学习过程序分层思想了，接下来呢，我们来学习下程序的解耦思想。

解耦：解除耦合。

#### 3.2.1 耦合问题

首先需要了解软件开发涉及到的两个概念：内聚和耦合。

- 内聚：软件中各个功能模块内部的功能联系。

- 耦合：衡量软件中各个层/模块之间的依赖、关联的程度。

**软件设计原则：高内聚低耦合。**

> 高内聚指的是：一个模块中各个元素之间的联系的紧密程度，如果各个元素(语句、程序段)之间的联系程度越高，则内聚性越高，即 "高内聚"。
>
> 低耦合指的是：软件中各个层、模块之间的依赖关联程序越低越好。

程序中高内聚的体现：

- EmpServiceA类中只编写了和员工相关的逻辑处理代码

![image-20221204202531571](./assets/image-20221204202531571.png) 

程序中耦合代码的体现：

- 把业务类变为EmpServiceB时，需要修改controller层中的代码

![image-20221204203904900](./assets/image-20221204203904900.png)

高内聚、低耦合的目的是使程序模块的可重用性、移植性大大增强。

![](./assets/image-20220828215549593.png)





#### 3.2.2  解耦思路

之前我们在编写代码时，需要什么对象，就直接new一个就可以了。 这种做法呢，层与层之间代码就耦合了，当service层的实现变了之后， 我们还需要修改controller层的代码。

![image-20221204204916033](./assets/image-20221204204916033.png)

 那应该怎么解耦呢？

- 首先不能在EmpController中使用new对象。代码如下：

![image-20221204205328069](./assets/image-20221204205328069.png)

- 此时，就存在另一个问题了，不能new，就意味着没有业务层对象（程序运行就报错），怎么办呢？
  - 我们的解决思路是：
    - 提供一个容器，容器中存储一些对象(例：EmpService对象)
    - controller程序从容器中获取EmpService类型的对象

我们想要实现上述解耦操作，就涉及到Spring中的两个核心概念：

- **控制反转：** Inversion Of Control，简称IOC。对象的创建控制权由程序自身转移到外部（容器），这种思想称为控制反转。

  > 对象的创建权由程序员主动创建转移到容器(由容器创建、管理对象)。这个容器称为：IOC容器或Spring容器

- **依赖注入：** Dependency Injection，简称DI。容器为应用程序提供运行时，所依赖的资源，称之为依赖注入。

  > 程序运行时需要某个资源，此时容器就为其提供这个资源。
  >
  > 例：EmpController程序运行时需要EmpService对象，Spring容器就为其提供并注入EmpService对象

IOC容器中创建、管理的对象，称之为：bean对象





### 3.3 IOC&DI

上面我们引出了Spring中IOC和DI的基本概念，下面我们就来具体学习下IOC和DI的代码实现。

#### 3.3.1 IOC&DI入门

任务：完成Controller层、Service层、Dao层的代码解耦

- 思路：
  1. 删除Controller层、Service层中new对象的代码
  2. Service层及Dao层的实现类，交给IOC容器管理
  3. 为Controller及Service注入运行时依赖的对象
     - Controller程序中注入依赖的Service层对象
     - Service程序中注入依赖的Dao层对象



第1步：删除Controller层、Service层中new对象的代码

![image-20221204212807207](./assets/image-20221204212807207.png)



第2步：Service层及Dao层的实现类，交给IOC容器管理

- 使用Spring提供的注解：@Component ，就可以实现类交给IOC容器管理

![image-20221204213328034](./assets/image-20221204213328034.png)



第3步：为Controller及Service注入运行时依赖的对象

- 使用Spring提供的注解：@Autowired ，就可以实现程序运行时IOC容器自动注入需要的依赖对象

![image-20221204213859112](./assets/image-20221204213859112.png)



完整的三层代码：

- **Controller层：**

~~~java
@RestController
public class EmpController {

    @Autowired //运行时,从IOC容器中获取该类型对象,赋值给该变量
    private EmpService empService ;

    @RequestMapping("/listEmp")
    public Result list(){
        //1. 调用service, 获取数据
        List<Emp> empList = empService.listEmp();

        //3. 响应数据
        return Result.success(empList);
    }
}
~~~

- **Service层：**

~~~java
@Component //将当前对象交给IOC容器管理,成为IOC容器的bean
public class EmpServiceA implements EmpService {

    @Autowired //运行时,从IOC容器中获取该类型对象,赋值给该变量
    private EmpDao empDao ;

    @Override
    public List<Emp> listEmp() {
        //1. 调用dao, 获取数据
        List<Emp> empList = empDao.listEmp();

        //2. 对数据进行转换处理 - gender, job
        empList.stream().forEach(emp -> {
            //处理 gender 1: 男, 2: 女
            String gender = emp.getGender();
            if("1".equals(gender)){
                emp.setGender("男");
            }else if("2".equals(gender)){
                emp.setGender("女");
            }

            //处理job - 1: 讲师, 2: 班主任 , 3: 就业指导
            String job = emp.getJob();
            if("1".equals(job)){
                emp.setJob("讲师");
            }else if("2".equals(job)){
                emp.setJob("班主任");
            }else if("3".equals(job)){
                emp.setJob("就业指导");
            }
        });
        return empList;
    }
}
~~~

**Dao层：**

~~~java
@Component //将当前对象交给IOC容器管理,成为IOC容器的bean
public class EmpDaoA implements EmpDao {
    @Override
    public List<Emp> listEmp() {
        //1. 加载并解析emp.xml
        String file = this.getClass().getClassLoader().getResource("emp.xml").getFile();
        System.out.println(file);
        List<Emp> empList = XmlParserUtils.parse(file, Emp.class);
        return empList;
    }
}
~~~



运行测试：

- 启动SpringBoot引导类，打开浏览器，输入：http://localhost:8080/emp.html

![image-20221204185455556](./assets/image-20221204185455556.png)



 



#### 3.3.2 IOC详解

通过IOC和DI的入门程序呢，我们已经基本了解了IOC和DI的基础操作。接下来呢，我们学习下IOC控制反转和DI依赖注入的细节。

##### 3.3.2.1 bean的声明

前面我们提到IOC控制反转，就是将对象的控制权交给Spring的IOC容器，由IOC容器创建及管理对象。IOC容器创建的对象称为bean对象。

在之前的入门案例中，要把某个对象交给IOC容器管理，需要在类上添加一个注解：@Component 

而Spring框架为了更好的标识web应用程序开发当中，bean对象到底归属于哪一层，又提供了@Component的衍生注解：

- @Controller    （标注在控制层类上）
- @Service          （标注在业务层类上）
- @Repository    （标注在数据访问层类上）



修改入门案例代码：

- **Controller层：**

~~~java
@RestController  //@RestController = @Controller + @ResponseBody
public class EmpController {

    @Autowired //运行时,从IOC容器中获取该类型对象,赋值给该变量
    private EmpService empService ;

    @RequestMapping("/listEmp")
    public Result list(){
        //1. 调用service, 获取数据
        List<Emp> empList = empService.listEmp();

        //3. 响应数据
        return Result.success(empList);
    }
}
~~~

- **Service层：**

~~~java
@Service
public class EmpServiceA implements EmpService {

    @Autowired //运行时,从IOC容器中获取该类型对象,赋值给该变量
    private EmpDao empDao ;

    @Override
    public List<Emp> listEmp() {
        //1. 调用dao, 获取数据
        List<Emp> empList = empDao.listEmp();

        //2. 对数据进行转换处理 - gender, job
        empList.stream().forEach(emp -> {
            //处理 gender 1: 男, 2: 女
            String gender = emp.getGender();
            if("1".equals(gender)){
                emp.setGender("男");
            }else if("2".equals(gender)){
                emp.setGender("女");
            }

            //处理job - 1: 讲师, 2: 班主任 , 3: 就业指导
            String job = emp.getJob();
            if("1".equals(job)){
                emp.setJob("讲师");
            }else if("2".equals(job)){
                emp.setJob("班主任");
            }else if("3".equals(job)){
                emp.setJob("就业指导");
            }
        });
        return empList;
    }
}
~~~

**Dao层：**

~~~java
@Repository
public class EmpDaoA implements EmpDao {
    @Override
    public List<Emp> listEmp() {
        //1. 加载并解析emp.xml
        String file = this.getClass().getClassLoader().getResource("emp.xml").getFile();
        System.out.println(file);
        List<Emp> empList = XmlParserUtils.parse(file, Emp.class);
        return empList;
    }
}
~~~



要把某个对象交给IOC容器管理，需要在对应的类上加上如下注解之一：

| 注解        | 说明                 | 位置                                            |
| :---------- | -------------------- | ----------------------------------------------- |
| @Controller | @Component的衍生注解 | 标注在控制器类上                                |
| @Service    | @Component的衍生注解 | 标注在业务类上                                  |
| @Repository | @Component的衍生注解 | 标注在数据访问类上（由于与mybatis整合，用的少） |
| @Component  | 声明bean的基础注解   | 不属于以上三类时，用此注解                      |

> 查看源码：![image-20221204221320230](./assets/image-20221204221320230.png)

在IOC容器中，每一个Bean都有一个属于自己的名字，可以通过注解的value属性指定bean的名字。如果没有指定，默认为类名首字母小写。

![image-20221204222650873](./assets/image-20221204222650873.png)

> 注意事项: 
>
> - 声明bean的时候，可以通过value属性指定bean的名字，如果没有指定，默认为类名首字母小写。
> - 使用以上四个注解都可以声明bean，但是在springboot集成web开发中，声明控制器bean只能用@Controller。





##### 3.3.2.2 组件扫描

问题：使用前面学习的四个注解声明的bean，一定会生效吗？

答案：不一定。（原因：bean想要生效，还需要被组件扫描）



 下面我们通过修改项目工程的目录结构，来测试bean对象是否生效：

![image-20221204223602694](./assets/image-20221204223602694.png)

运行程序后，报错：

![image-20221204223815554](./assets/image-20221204223815554.png)

为什么没有找到bean对象呢？

- 使用四大注解声明的bean，要想生效，还需要被组件扫描注解@ComponentScan扫描

> @ComponentScan注解虽然没有显式配置，但是实际上已经包含在了引导类声明注解 @SpringBootApplication 中，==**默认扫描的范围是SpringBoot启动类所在包及其子包**==。
>
> ![image-20221204224643683](./assets/image-20221204224643683.png) 

- 解决方案：手动添加@ComponentScan注解，指定要扫描的包   （==仅做了解，不推荐==）

![image-20221204225437297](./assets/image-20221204225437297.png)



推荐做法（如下图）：

- 将我们定义的controller，service，dao这些包呢，都放在引导类所在包com.itheima的子包下，这样我们定义的bean就会被自动的扫描到

![image-20221204225815624](./assets/image-20221204225815624.png)





#### 3.3.3 DI详解

上一小节我们讲解了控制反转IOC的细节，接下来呢，我们学习依赖注解DI的细节。

依赖注入，是指IOC容器要为应用程序去提供运行时所依赖的资源，而资源指的就是对象。

在入门程序案例中，我们使用了@Autowired这个注解，完成了依赖注入的操作，而这个Autowired翻译过来叫：自动装配。

@Autowired注解，默认是按照**类型**进行自动装配的（去IOC容器中找某个类型的对象，然后完成注入操作）

> 入门程序举例：在EmpController运行的时候，就要到IOC容器当中去查找EmpService这个类型的对象，而我们的IOC容器中刚好有一个EmpService这个类型的对象，所以就找到了这个类型的对象完成注入操作。



那如果在IOC容器中，存在多个相同类型的bean对象，会出现什么情况呢？

![image-20221204232154445](./assets/image-20221204232154445.png)

- 程序运行会报错

![image-20221204231616724](./assets/image-20221204231616724.png)



如何解决上述问题呢？Spring提供了以下几种解决方案：

- @Primary

- @Qualifier

- @Resource



使用@Primary注解：当存在多个相同类型的Bean注入时，加上@Primary注解，来确定默认的实现。

![image-20221204232501679](./assets/image-20221204232501679.png) 



使用@Qualifier注解：指定当前要注入的bean对象。 在@Qualifier的value属性中，指定注入的bean的名称。

- @Qualifier注解不能单独使用，必须配合@Autowired使用

![image-20221204233333606](./assets/image-20221204233333606.png)



使用@Resource注解：是按照bean的名称进行注入。通过name属性指定要注入的bean的名称。

![image-20221204233637735](./assets/image-20221204233637735.png)



> 面试题 ： @Autowird 与 @Resource的区别
>
> - @Autowired 是spring框架提供的注解，而@Resource是JDK提供的注解
> - @Autowired 默认是按照类型注入，而@Resource是按照名称注入



# 105.案例-准备工作

**SpringBootWeb案例**

前面我们已经讲解了Web前端开发的基础知识，也讲解了Web后端开发的基础(HTTP协议、请求响应)，并且也讲解了数据库MySQL，以及通过Mybatis框架如何来完成数据库的基本操作。 那接下来，我们就通过一个案例，来将前端开发、后端开发、数据库整合起来。 而这个案例呢，就是我们前面提到的Tlias智能学习辅助系统。

![](./assets/image-20220904104826854.png)

在这个案例中，前端开发人员已经将前端工程开发完毕了。 我们需要做的，就是参考接口文档完成后端功能的开发，然后结合前端工程进行联调测试即可。



**完成后的成品效果展示：**

![image-20220904103734643](./assets/image-20220904103734643.png)



> **今天的主要内容如下：**
>
> - 准备工作
> - 部门管理
> - 员工管理



## 1. 准备工作

准备工作的学习，我们先从"需求"和"环境搭建"开始入手。

**1.1 需求&环境搭建**

1.1.1 需求说明

**1、部门管理**

![image-20221213205503102](./assets/image-20221213205503102.png)

部门管理功能开发包括：

- 查询部门列表
- 删除部门
- 新增部门
- 修改部门



**2、员工管理**

![image-20221213205737307](./assets/image-20221213205737307.png)

员工管理功能开发包括：

- 查询员工列表(分页、条件)
- 删除员工
- 新增员工
- 修改员工



**1.1.2 环境搭建**

![image-20221213230710821](./assets/image-20221213230710821.png)



步骤：

1. 准备数据库表(dept、emp)
2. 创建springboot工程，引入对应的起步依赖（web、mybatis、mysql驱动、lombok）
3. 配置文件application.properties中引入mybatis的配置信息，准备对应的实体类
4. 准备对应的Mapper、Service(接口、实现类)、Controller基础结构



第1步：准备数据库表

~~~mysql
-- 部门管理
create table dept(
    id int unsigned primary key auto_increment comment '主键ID',
    name varchar(10) not null unique comment '部门名称',
    create_time datetime not null comment '创建时间',
    update_time datetime not null comment '修改时间'
) comment '部门表';
-- 部门表测试数据
insert into dept (id, name, create_time, update_time) values(1,'学工部',now(),now()),(2,'教研部',now(),now()),(3,'咨询部',now(),now()), (4,'就业部',now(),now()),(5,'人事部',now(),now());



-- 员工管理(带约束)
create table emp (
  id int unsigned primary key auto_increment comment 'ID',
  username varchar(20) not null unique comment '用户名',
  password varchar(32) default '123456' comment '密码',
  name varchar(10) not null comment '姓名',
  gender tinyint unsigned not null comment '性别, 说明: 1 男, 2 女',
  image varchar(300) comment '图像',
  job tinyint unsigned comment '职位, 说明: 1 班主任,2 讲师, 3 学工主管, 4 教研主管, 5 咨询师',
  entrydate date comment '入职时间',
  dept_id int unsigned comment '部门ID',
  create_time datetime not null comment '创建时间',
  update_time datetime not null comment '修改时间'
) comment '员工表';
-- 员工表测试数据
INSERT INTO emp
	(id, username, password, name, gender, image, job, entrydate,dept_id, create_time, update_time) VALUES
	(1,'jinyong','123456','金庸',1,'1.jpg',4,'2000-01-01',2,now(),now()),
	(2,'zhangwuji','123456','张无忌',1,'2.jpg',2,'2015-01-01',2,now(),now()),
	(3,'yangxiao','123456','杨逍',1,'3.jpg',2,'2008-05-01',2,now(),now()),
	(4,'weiyixiao','123456','韦一笑',1,'4.jpg',2,'2007-01-01',2,now(),now()),
	(5,'changyuchun','123456','常遇春',1,'5.jpg',2,'2012-12-05',2,now(),now()),
	(6,'xiaozhao','123456','小昭',2,'6.jpg',3,'2013-09-05',1,now(),now()),
	(7,'jixiaofu','123456','纪晓芙',2,'7.jpg',1,'2005-08-01',1,now(),now()),
	(8,'zhouzhiruo','123456','周芷若',2,'8.jpg',1,'2014-11-09',1,now(),now()),
	(9,'dingminjun','123456','丁敏君',2,'9.jpg',1,'2011-03-11',1,now(),now()),
	(10,'zhaomin','123456','赵敏',2,'10.jpg',1,'2013-09-05',1,now(),now()),
	(11,'luzhangke','123456','鹿杖客',1,'11.jpg',5,'2007-02-01',3,now(),now()),
	(12,'hebiweng','123456','鹤笔翁',1,'12.jpg',5,'2008-08-18',3,now(),now()),
	(13,'fangdongbai','123456','方东白',1,'13.jpg',5,'2012-11-01',3,now(),now()),
	(14,'zhangsanfeng','123456','张三丰',1,'14.jpg',2,'2002-08-01',2,now(),now()),
	(15,'yulianzhou','123456','俞莲舟',1,'15.jpg',2,'2011-05-01',2,now(),now()),
	(16,'songyuanqiao','123456','宋远桥',1,'16.jpg',2,'2007-01-01',2,now(),now()),
	(17,'chenyouliang','123456','陈友谅',1,'17.jpg',NULL,'2015-03-21',NULL,now(),now());
~~~



第2步：创建一个SpringBoot工程，选择引入对应的起步依赖（web、mybatis、mysql驱动、lombok） (版本选择2.7.5版本，可以创建完毕之后，在pom.xml文件中更改版本号)

![image-20221213221142985](./assets/image-20221213221142985.png)

![image-20221213221408420](./assets/image-20221213221408420.png)

 生成的pom.xml文件：

~~~xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.7.5</version>
        <relativePath/> 
    </parent>
    <groupId>com.itheima</groupId>
    <artifactId>tlias-web-management</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <name>tlias-web-management</name>
    <description>Demo project for Spring Boot</description>
    <properties>
        <java.version>11</java.version>
    </properties>
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.mybatis.spring.boot</groupId>
            <artifactId>mybatis-spring-boot-starter</artifactId>
            <version>2.3.0</version>
        </dependency>

        <dependency>
            <groupId>com.mysql</groupId>
            <artifactId>mysql-connector-j</artifactId>
            <scope>runtime</scope>
        </dependency>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <optional>true</optional>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
                <configuration>
                    <excludes>
                        <exclude>
                            <groupId>org.projectlombok</groupId>
                            <artifactId>lombok</artifactId>
                        </exclude>
                    </excludes>
                </configuration>
            </plugin>
        </plugins>
    </build>

</project>
~~~

创建项目工程目录结构：

![image-20221213222039985](./assets/image-20221213222039985.png)



第3步：配置文件application.properties中引入mybatis的配置信息，准备对应的实体类

- application.properties （直接把之前项目中的复制过来）

~~~properties
#数据库连接
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.url=jdbc:mysql://localhost:3306/tlias
spring.datasource.username=root
spring.datasource.password=1234

#开启mybatis的日志输出
mybatis.configuration.log-impl=org.apache.ibatis.logging.stdout.StdOutImpl

#开启数据库表字段 到 实体类属性的驼峰映射
mybatis.configuration.map-underscore-to-camel-case=true
~~~

- 实体类

~~~java
/*部门类*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dept {
    private Integer id;
    private String name;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
~~~

~~~java
/*员工类*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emp {
    private Integer id;
    private String username;
    private String password;
    private String name;
    private Short gender;
    private String image;
    private Short job;
    private LocalDate entrydate;
    private Integer deptId;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
~~~



第4步：准备对应的Mapper、Service(接口、实现类)、Controller基础结构

数据访问层：

- DeptMapper

~~~java
package com.itheima.mapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DeptMapper {
}
~~~

- EmpMapper

~~~java
package com.itheima.mapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmpMapper {
}

~~~



业务层：

- DeptService

~~~java
package com.itheima.service;

//部门业务规则
public interface DeptService {
}
~~~

- DeptServiceImpl

~~~java
package com.itheima.service.impl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

//部门业务实现类
@Slf4j
@Service
public class DeptServiceImpl implements DeptService {
}
~~~

- EmpService

~~~java
package com.itheima.service;

//员工业务规则
public interface EmpService {
}
~~~

- EmpServiceImpl

~~~java
package com.itheima.service.impl;
import com.itheima.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

//员工业务实现类
@Slf4j
@Service
public class EmpServiceImpl implements EmpService {

}
~~~



控制层：

- DeptController

~~~java
package com.itheima.controller;
import org.springframework.web.bind.annotation.RestController;

//部门管理控制器
@RestController
public class DeptController {
}
~~~

- EmpController

~~~java
package com.itheima.controller;
import org.springframework.web.bind.annotation.RestController;

//员工管理控制器
@RestController
public class EmpController {
}
~~~

项目工程结构：

![image-20221213224927868](./assets/image-20221213224927868.png)



> 如果工程里没有mapper的映射文件，但是它也出现了MyBatisX的映射图标，这是idea的识别错误导致的，它识别出来的是其他工程的



**开发规范**

了解完需求也完成了环境搭建了，我们下面开始学习开发的一些规范。

开发规范我们主要从以下几方面介绍：

**1、开发规范-REST**

我们的案例是基于当前最为主流的前后端分离模式进行开发。

![image-20221213230911102](./assets/image-20221213230911102.png)

在前后端分离的开发模式中，前后端开发人员都需要根据提前定义好的接口文档，来进行前后端功能的开发。

> 后端开发人员：必须严格遵守提供的接口文档进行后端功能开发（保障开发的功能可以和前端对接）
>
> ![image-20221213231519551](./assets/image-20221213231519551.png)



而在前后端进行交互的时候，我们需要基于当前主流的REST风格的API接口进行交互。

什么是REST风格呢?

- REST（Representational State Transfer），表述性状态转换，它是一种软件架构风格。



**传统URL风格如下：**

```url
http://localhost:8080/user/getById?id=1     GET：查询id为1的用户
http://localhost:8080/user/saveUser         POST：新增用户
http://localhost:8080/user/updateUser       POST：修改用户
http://localhost:8080/user/deleteUser?id=1  GET：删除id为1的用户
```

我们看到，原始的传统URL呢，定义比较复杂，而且将资源的访问行为对外暴露出来了。



**基于REST风格URL如下：**

```
http://localhost:8080/users/1  GET：查询id为1的用户
http://localhost:8080/users    POST：新增用户
http://localhost:8080/users    PUT：修改用户
http://localhost:8080/users/1  DELETE：删除id为1的用户
```

其中总结起来，就一句话：通过URL定位要操作的资源，通过HTTP动词(请求方式)来描述具体的操作。



在REST风格的URL中，通过四种请求方式，来操作数据的增删改查。 

- GET ： 查询
- POST ：新增
- PUT ：修改
- DELETE ：删除

我们看到如果是基于REST风格，定义URL，URL将会更加简洁、更加规范、更加优雅。

> 注意事项：
>
> - REST是风格，是约定方式，约定不是规定，可以打破
> - 描述模块的功能通常使用复数，也就是加s的格式来描述，表示此类资源，而非单个资源。如：users、emps、books…







**2、开发规范-统一响应结果**

前后端工程在进行交互时，使用统一响应结果 Result。

~~~java
package com.itheima.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    private Integer code;//响应码，1 代表成功; 0 代表失败
    private String msg;  //响应信息 描述字符串
    private Object data; //返回的数据

    //增删改 成功响应
    public static Result success(){
        return new Result(1,"success",null);
    }
    //查询 成功响应
    public static Result success(Object data){
        return new Result(1,"success",data);
    }
    //失败响应
    public static Result error(String msg){
        return new Result(0,msg,null);
    }
}
~~~





**3、开发流程**

我们在进行功能开发时，都是根据如下流程进行：

![image-20220904125004138](./assets/image-20220904125004138.png) 

1. 查看页面原型明确需求
   - 根据页面原型和需求，进行表结构设计、编写接口文档(已提供)

2. 阅读接口文档
3. 思路分析
4. 功能接口开发
   - 就是开发后台的业务功能，一个业务功能，我们称为一个接口
5. 功能接口测试
   - 功能开发完毕后，先通过Postman进行功能接口测试，测试通过后，再和前端进行联调测试
6. 前后端联调测试
   - 和前端开发人员开发好的前端工程一起测试

# 136. 部门管理

我们按照前面学习的开发流程，开始完成功能开发。首先按照之前分析的需求，完成`部门管理`的功能开发。

开发的部门管理功能包含：

1. 查询部门
2. 删除部门
3. 新增部门
4. 更新部门（不讲解，自己独立完成）

### 2.1 查询部门

**2.1.1 原型和需求**

![image-20221213234154699](./assets/image-20221213234154699.png)

> 查询的部门的信息：部门ID、部门名称、修改时间
>
> 通过页面原型以及需求描述，我们可以看到，部门查询，是不需要考虑分页操作的。



**2.1.2 接口文档**

**部门列表查询**

- 基本信息

  ~~~
  请求路径：/depts
  
  请求方式：GET
  
  接口描述：该接口用于部门列表数据查询
  ~~~

- 请求参数

  无

- 响应数据

  参数格式：application/json

  参数说明：

  | 参数名         | 类型      | 是否必须 | 备注                           |
  | -------------- | --------- | -------- | ------------------------------ |
  | code           | number    | 必须     | 响应码，1 代表成功，0 代表失败 |
  | msg            | string    | 非必须   | 提示信息                       |
  | data           | object[ ] | 非必须   | 返回的数据                     |
  | \|- id         | number    | 非必须   | id                             |
  | \|- name       | string    | 非必须   | 部门名称                       |
  | \|- createTime | string    | 非必须   | 创建时间                       |
  | \|- updateTime | string    | 非必须   | 修改时间                       |

  响应数据样例：

  ~~~json
  {
    "code": 1,
    "msg": "success",
    "data": [
      {
        "id": 1,
        "name": "学工部",
        "createTime": "2022-09-01T23:06:29",
        "updateTime": "2022-09-01T23:06:29"
      },
      {
        "id": 2,
        "name": "教研部",
        "createTime": "2022-09-01T23:06:29",
        "updateTime": "2022-09-01T23:06:29"
      }
    ]
  }
  ~~~



**2.1.3 思路分析**

![image-20221213235157345](./assets/image-20221213235157345.png)



**2.1.4 功能开发**

通过查看接口文档：部门列表查询

> 请求路径：/depts
>
> 请求方式：GET
>
> 请求参数：无
>
> 响应数据：json格式

**DeptController**

```java
@Slf4j
@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    //@RequestMapping(value = "/depts" , method = RequestMethod.GET)
    @GetMapping("/depts")
    public Result list(){
        //    private  static Logger log = LoggerFactory.getLogger(DeptController.class);
        //定义了@Slf4j注解，它会自动给我们定义一个日志记录对象：log，通过log对象就可以来记录日志了

        log.info("查询所有部门数据");
        List<Dept> deptList = deptService.list();
        return Result.success(deptList);
    }
}
```

> @Slf4j注解源码：
>
> ![image-20221214000909044](./assets/image-20221214000909044.png)

**DeptService**（业务接口）

```java
public interface DeptService {
    /**
     * 查询所有的部门数据
     * @return   存储Dept对象的集合
     */
    List<Dept> list();
}
```

 **DeptServiceImpl**（业务实现类）

```java
@Slf4j
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;
    
    @Override
    public List<Dept> list() {
        List<Dept> deptList = deptMapper.list();
        return deptList;
    }
}    
```

**DeptMapper**

```java
@Mapper
public interface DeptMapper {
    //查询所有部门数据
    @Select("select id, name, create_time, update_time from dept")
    List<Dept> list();
}
```





**2.1.5 功能测试**

功能开发完成后，我们就可以启动项目，然后打开postman，发起GET请求，访问 ：http://localhost:8080/depts

![](./assets/image-20220904130315247.png)

> 发现获取到的数据是一个json格式的数据，这个json格式的数据其实就是Result转json之后的结果，因为我们在Controller上加了一个RestController，这个注解包含@RespondBody，@RespondBody会将返回的对象直接转为json再响应回来



### 137.前后端联调

完成了查询部门的功能，我们也通过postman工具测试通过了，下面我们再基于前后端分离的方式进行接口联调。具体操作如下：

1、将资料中提供的"前端环境"文件夹中的压缩包，拷贝到一个没有中文不带空格的目录下

![image-20221214100230484](./assets/image-20221214100230484.png) 



2、拷贝到一个没有中文不带空格的目录后，进行解压（解压到当前目录）

![image-20221214100039074](./assets/image-20221214100039074.png) 



3、启动nginx

![image-20221214100703404](./assets/image-20221214100703404.png) 

![image-20221214101711107](./assets/image-20221214101711107.png)



4、打开浏览器，访问：http://localhost:90

![image-20221214100918557](O:/BaiduSyncdisk/other/课/黑马/JAVAWeb/day10-SpringBootWeb案例/讲义/assets/image-20221214100918557.png)



5、测试：部门管理 - 查询部门列表

![image-20221214101436198](O:/BaiduSyncdisk/other/课/黑马/JAVAWeb/day10-SpringBootWeb案例/讲义/assets/image-20221214101436198.png)

> 说明：只要按照接口文档开发功能接口，就能保证前后端程序交互
>
> - 后端：严格遵守接口文档进行功能接口开发
> - 前端：严格遵守接口文档访问功能接口

![image-20231026205102255](./assets/image-20231026205102255.png)





# 138.删除部门

查询部门的功能我们搞定了，下面我们开始完成`删除部门`的功能开发。

**2.3.1 需求**

![](./assets/image-20220904132440220.png)

点击部门列表后面操作栏的 "删除" 按钮，就可以删除该部门信息。 此时，前端只需要给服务端传递一个ID参数就可以了。 我们从接口文档中也可以看得出来。



**2.3.2 接口文档**

**删除部门**

- 基本信息

  ~~~
  请求路径：/depts/{id}
  
  请求方式：DELETE
  
  接口描述：该接口用于根据ID删除部门数据
  ~~~

- 请求参数
  参数格式：路径参数

  参数说明：

  | 参数名 | 类型   | 是否必须 | 备注   |
  | ------ | ------ | -------- | ------ |
  | id     | number | 必须     | 部门ID |

  请求参数样例：

  ~~~
  /depts/1
  ~~~

- 响应数据
  参数格式：application/json

  参数说明：

  | 参数名 | 类型   | 是否必须 | 备注                           |
  | ------ | ------ | -------- | ------------------------------ |
  | code   | number | 必须     | 响应码，1 代表成功，0 代表失败 |
  | msg    | string | 非必须   | 提示信息                       |
  | data   | object | 非必须   | 返回的数据                     |

  响应数据样例：

  ~~~json
  {
      "code":1,
      "msg":"success",
      "data":null
  }
  ~~~



**2.3.3 思路分析**

![image-20221214102705490](./assets/image-20221214102705490.png)

> 接口文档规定：
>
> - 前端请求路径：/depts/{id}
> - 前端请求方式：DELETE
>
> 问题1：怎么在controller中接收请求路径中的路径参数？
>
> ~~~
> @PathVariable
> ~~~
>
> 问题2：如何限定请求方式是delete？
>
> ~~~
> @DeleteMapping
> ~~~



**2.3.4 功能开发**

通过查看接口文档：删除部门

> 请求路径：/depts/{id}
>
> 请求方式：DELETE
>
> 请求参数：路径参数 {id}
>
> 响应数据：json格式

**DeptController**

~~~java
@Slf4j
@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    @DeleteMapping("/depts/{id}")
    public Result delete(@PathVariable Integer id) {
        //日志记录
        log.info("根据id删除部门");
        //调用service层功能
        deptService.delete(id);
        //响应
        return Result.success();
    }
    
    //省略...
}
~~~

**DeptService**

~~~java
public interface DeptService {

    /**
     * 根据id删除部门
     * @param id    部门id
     */
    void delete(Integer id);

    //省略...
}
~~~

**DeptServiceImpl**

~~~java
@Slf4j
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;

    @Override
    public void delete(Integer id) {
        //调用持久层删除功能
        deptMapper.deleteById(id);
    }
    
    //省略...
}
~~~

**DeptMapper**

~~~java
@Mapper
public interface DeptMapper {
    /**
     * 根据id删除部门信息
     * @param id   部门id
     */
    @Delete("delete from dept where id = #{id}")
    void deleteById(Integer id);
   
    //省略...
}
~~~



**2.3.5 功能测试**

删除功能开发完成后，重新启动项目，使用postman，发起DELETE请求：

![image-20221214112451600](./assets/image-20221214112451600.png)



**2.3.6 前后端联调**

打开浏览器，测试后端功能接口：

![image-20221214113708369](./assets/image-20221214113708369.png)

![image-20221214113941657](./assets/image-20221214113941657.png)







# 139.新增部门

我们前面已完成了`查询部门`、`删除部门`两个功能，也熟悉了开发的流程。下面我们继续完成`新增部门`功能。

**2.4.1 需求**

<img src="./assets/image-20220904150427982.png" style="zoom:80%;" />

点击 "新增部门" 按钮，弹出新增部门对话框，输入部门名称，点击 "保存" ，将部门信息保存到数据库。



**2.4.2 接口文档**

**添加部门**

- 基本信息

  ~~~
  请求路径：/depts
  
  请求方式：POST
  
  接口描述：该接口用于添加部门数据
  ~~~

- 请求参数

  格式：application/json

  参数说明：

  | 参数名 | 类型   | 是否必须 | 备注     |
  | ------ | ------ | -------- | -------- |
  | name   | string | 必须     | 部门名称 |

  请求参数样例：

  ~~~json
  {
  	"name": "教研部"
  }
  ~~~

- 响应数据

  参数格式：application/json

  参数说明：

  | 参数名 | 类型   | 是否必须 | 备注                           |
  | ------ | ------ | -------- | ------------------------------ |
  | code   | number | 必须     | 响应码，1 代表成功，0 代表失败 |
  | msg    | string | 非必须   | 提示信息                       |
  | data   | object | 非必须   | 返回的数据                     |

  响应数据样例：

  ~~~json
  {
      "code":1,
      "msg":"success",
      "data":null
  }
  ~~~



**2.4.3 思路分析**

![image-20221214115519648](./assets/image-20221214115519648.png)

> 接口文档规定：
>
> - 前端请求路径：/depts
> - 前端请求方式：POST
> - 前端请求参数 (Json格式)：{ "name": "教研部" }
>
> 问题1：如何限定请求方式是POST？
>
> ~~~java
> @PostMapping
> ~~~
>
> 问题2：怎么在controller中接收json格式的请求参数？
>
> ~~~java
> @RequestBody  //把前端传递的json数据填充到实体类中
> ~~~



**2.4.4 功能开发**

通过查看接口文档：新增部门

> 请求路径：/depts
>
> 请求方式：POST
>
> 请求参数：json格式 
>
> 响应数据：json格式

**DeptController**

~~~java
@Slf4j
@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    @PostMapping("/depts")
    public Result add(@RequestBody Dept dept){
        //记录日志
        //最终dept会替换掉这个占位符
        log.info("新增部门：{}",dept);
        //调用service层添加功能
        deptService.add(dept);
        //响应
        return Result.success();
    }

    //省略...
}
~~~

**DeptService**

~~~java
public interface DeptService {

    /**
     * 新增部门
     * @param dept  部门对象
     */
    void add(Dept dept);

    //省略...
}

~~~

**DeptServiceImpl**

~~~java
@Slf4j
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;

    @Override
    public void add(Dept dept) {
        //补全部门数据
        dept.setCreateTime(LocalDateTime.now());
        dept.setUpdateTime(LocalDateTime.now());
        //调用持久层增加功能
        deptMapper.inser(dept);
    }

    //省略...
}

~~~

**DeptMapper**

~~~java
@Mapper
public interface DeptMapper {

    @Insert("insert into dept (name, create_time, update_time) values (#{name},#{createTime},#{updateTime})")
    void inser(Dept dept);

    //省略...
}
~~~



**2.4.5 功能测试**

新增功能开发完成后，重新启动项目，使用postman，发起POST请求：

![image-20221214153758708](./assets/image-20221214153758708.png)



**2.4.6 前后端联调**

打开浏览器，测试后端功能接口：

![image-20221215105446189](./assets/image-20221215105446189.png)

![image-20221214154645746](./assets/image-20221214154645746.png)



#### 2.4.7 请求路径

我们部门管理的`查询`、`删除`、`新增`功能全部完成了，接下来我们要对controller层的代码进行优化。

首先我们先来看下目前controller层代码：

![image-20221215110553435](./assets/image-20221215110553435.png)

> 以上三个方法上的请求路径，存在一个共同点：都是以`/depts`作为开头。（重复了）

在Spring当中为了简化请求路径的定义，可以把公共的请求路径，直接抽取到类上，在类上加一个注解@RequestMapping，并指定请求路径"/depts"。代码参照如下：

![image-20221215111110219](./assets/image-20221215111110219.png)

> 优化前后的对比：
>
> ![image-20221215111309042](./assets/image-20221215111309042.png)

> 注意事项：一个完整的请求路径，应该是类上@RequestMapping的value属性 + 方法上的 @RequestMapping的value属性







# 140.分页查询

**3. 员工管理**

完成了部门管理的功能开发之后，我们进入到下一环节员工管理功能的开发。

![image-20221215142107329](./assets/image-20221215142107329.png)

基于以上原型，我们可以把员工管理功能分为：

1. 分页查询（今天完成）
2. 带条件的分页查询（今天完成）
3. 删除员工（今天完成）
4. 新增员工（后续完成）
5. 修改员工（后续完成）

那下面我们就先从分页查询功能开始学习。

**3.1 分页查询**

3.1.1 基础分页

3.1.1.1 需求分析

我们之前做的查询功能，是将数据库中所有的数据查询出来并展示到页面上，试想如果数据库中的数据有很多(假设有十几万条)的时候，将数据全部展示出来肯定不现实，那如何解决这个问题呢？

> 使用分页解决这个问题。每次只展示一页的数据，比如：一页展示10条数据，如果还想看其他的数据，可以通过点击页码进行查询。

![image-20221215141233541](./assets/image-20221215141233541.png)

要想从数据库中进行分页查询，我们要使用`LIMIT`关键字，格式为：limit  开始索引  每页显示的条数

> 查询第1页数据的SQL语句是：
>
> ```
> select * from emp  limit 0,10;
> ```
>
> 查询第2页数据的SQL语句是：
>
> ```
> select * from emp  limit 10,10;
> ```
>
> 查询第3页的数据的SQL语句是：
>
> ```
> select * from emp  limit 20,10;
> ```
>
> 观察以上SQL语句，发现： 开始索引一直在改变 ， 每页显示条数是固定的
>
> 开始索引的计算公式：   开始索引 = (当前页码 - 1)  *  每页显示条数

我们继续基于页面原型，继续分析，得出以下结论：

1. 前端在请求服务端时，传递的参数
   - 当前页码  page
   - 每页显示条数  pageSize
2. 后端需要响应什么数据给前端
   - 所查询到的数据列表（存储到List 集合中）
   - 总记录数

![image-20221215152021068](./assets/image-20221215152021068.png)

> 后台给前端返回的数据包含：List集合(数据列表)、total(总记录数)
>
> 而这两部分我们通常封装到PageBean对象中，并将该对象转换为json格式的数据响应回给浏览器。
>
> ~~~java
> @Data
> @NoArgsConstructor
> @AllArgsConstructor
> public class PageBean {
> private Long total; //总记录数
> private List rows; //当前页数据列表
> }
> ~~~



**3.1.1.2 接口文档**

**员工列表查询**

- 基本信息

  ~~~
  请求路径：/emps
  
  请求方式：GET
  
  接口描述：该接口用于员工列表数据的条件分页查询
  ~~~

- 请求参数

  参数格式：queryString

  参数说明：

  | 参数名称 | 是否必须 | 示例       | 备注                                       |
  | -------- | -------- | ---------- | ------------------------------------------ |
  | name     | 否       | 张         | 姓名                                       |
  | gender   | 否       | 1          | 性别 , 1 男 , 2 女                         |
  | begin    | 否       | 2010-01-01 | 范围匹配的开始时间(入职日期)               |
  | end      | 否       | 2020-01-01 | 范围匹配的结束时间(入职日期)               |
  | page     | 是       | 1          | 分页查询的页码，如果未指定，默认为1        |
  | pageSize | 是       | 10         | 分页查询的每页记录数，如果未指定，默认为10 |

  请求数据样例：

  ~~~shell
  /emps?name=张&gender=1&begin=2007-09-01&end=2022-09-01&page=1&pageSize=10
  ~~~

- 响应数据

  参数格式：application/json

  参数说明：

  | 名称           | 类型      | 是否必须 | 默认值 | 备注                                                         | 其他信息          |
  | -------------- | --------- | -------- | ------ | ------------------------------------------------------------ | ----------------- |
  | code           | number    | 必须     |        | 响应码, 1 成功 , 0 失败                                      |                   |
  | msg            | string    | 非必须   |        | 提示信息                                                     |                   |
  | data           | object    | 必须     |        | 返回的数据                                                   |                   |
  | \|- total      | number    | 必须     |        | 总记录数                                                     |                   |
  | \|- rows       | object [] | 必须     |        | 数据列表                                                     | item 类型: object |
  | \|- id         | number    | 非必须   |        | id                                                           |                   |
  | \|- username   | string    | 非必须   |        | 用户名                                                       |                   |
  | \|- name       | string    | 非必须   |        | 姓名                                                         |                   |
  | \|- password   | string    | 非必须   |        | 密码                                                         |                   |
  | \|- entrydate  | string    | 非必须   |        | 入职日期                                                     |                   |
  | \|- gender     | number    | 非必须   |        | 性别 , 1 男 ; 2 女                                           |                   |
  | \|- image      | string    | 非必须   |        | 图像                                                         |                   |
  | \|- job        | number    | 非必须   |        | 职位, 说明: 1 班主任,2 讲师, 3 学工主管, 4 教研主管, 5 咨询师 |                   |
  | \|- deptId     | number    | 非必须   |        | 部门id                                                       |                   |
  | \|- createTime | string    | 非必须   |        | 创建时间                                                     |                   |
  | \|- updateTime | string    | 非必须   |        | 更新时间                                                     |                   |

  响应数据样例：

  ~~~json
  {
    "code": 1,
    "msg": "success",
    "data": {
      "total": 2,
      "rows": [
         {
          "id": 1,
          "username": "jinyong",
          "password": "123456",
          "name": "金庸",
          "gender": 1,
          "image": "https://web-framework.oss-cn-hangzhou.aliyuncs.com/2022-09-02-00-27-53B.jpg",
          "job": 2,
          "entrydate": "2015-01-01",
          "deptId": 2,
          "createTime": "2022-09-01T23:06:30",
          "updateTime": "2022-09-02T00:29:04"
        },
        {
          "id": 2,
          "username": "zhangwuji",
          "password": "123456",
          "name": "张无忌",
          "gender": 1,
          "image": "https://web-framework.oss-cn-hangzhou.aliyuncs.com/2022-09-02-00-27-53B.jpg",
          "job": 2,
          "entrydate": "2015-01-01",
          "deptId": 2,
          "createTime": "2022-09-01T23:06:30",
          "updateTime": "2022-09-02T00:29:04"
        }
      ]
    }
  }
  ~~~



3.1.1.3 思路分析

![image-20221215153413290](./assets/image-20221215153413290.png)

分页查询需要的数据，封装在PageBean对象中：

![image-20221215154036047](./assets/image-20221215154036047.png)



**3.1.1.4 功能开发**

通过查看接口文档：员工列表查询

> 请求路径：/emps
>
> 请求方式：GET
>
> 请求参数：跟随在请求路径后的参数字符串。  例：/emps?page=1&pageSize=10
>
> 响应数据：json格式

**EmpController**

~~~java
import com.itheima.pojo.PageBean;
import com.itheima.pojo.Result;
import com.itheima.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/emps")
public class EmpController {

    @Autowired
    private EmpService empService;

    //条件分页查询
    @GetMapping
    public Result page(@RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer pageSize) {
        //记录日志
        log.info("分页查询，参数：{},{}", page, pageSize);
        //调用业务层分页查询功能
        PageBean pageBean = empService.page(page, pageSize);
        //响应
        return Result.success(pageBean);
    }
}
~~~

> @RequestParam(defaultValue="默认值")   //设置请求参数默认值



**EmpService**

~~~java
public interface EmpService {
    /**
     * 条件分页查询
     * @param page 页码
     * @param pageSize 每页展示记录数
     * @return
     */
    PageBean page(Integer page, Integer pageSize);
}
~~~

**EmpServiceImpl**

~~~java
import com.itheima.mapper.EmpMapper;
import com.itheima.pojo.Emp;
import com.itheima.pojo.PageBean;
import com.itheima.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

@Slf4j
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    @Override
    public PageBean page(Integer page, Integer pageSize) {
        //1、获取总记录数
        Long count = empMapper.count();

        //2、获取分页查询结果列表
        Integer start = (page - 1) * pageSize; //计算起始索引 , 公式: (页码-1)*页大小
        List<Emp> empList = empMapper.list(start, pageSize);

        //3、封装PageBean对象
        PageBean pageBean = new PageBean(count , empList);
        return pageBean;
    }
}
~~~

**EmpMapper**

~~~java
@Mapper
public interface EmpMapper {
    //获取总记录数
    @Select("select count(*) from emp")
    public Long count();

    //获取当前页的结果列表
    @Select("select * from emp limit #{start}, #{pageSize}")
    public List<Emp> list(Integer start, Integer pageSize);
}
~~~



**3.1.1.5 功能测试**

功能开发完成后，重新启动项目，使用postman，发起POST请求：

![image-20221215162008339](./assets/image-20221215162008339.png)



**3.1.1.6 前后端联调**

打开浏览器，测试后端功能接口：

![image-20221215183413504](./assets/image-20221215183413504.png)





# 143.分页插件

**3.1.2.1 介绍**

前面我们已经完了基础的分页查询，大家会发现：分页查询功能编写起来比较繁琐。

![image-20221215164811566](./assets/image-20221215164811566.png)

> 在Mapper接口中定义两个方法执行两条不同的SQL语句：
>
> 1. 查询总记录数
> 2. 指定页码的数据列表
>
> 在Service当中，调用Mapper接口的两个方法，分别获取：总记录数、查询结果列表，然后在将获取的数据结果封装到PageBean对象中。
>
> 大家思考下：在未来开发其他项目，只要涉及到分页查询功能(例：订单、用户、支付、商品)，都必须按照以上操作完成功能开发

结论：原始方式的分页查询，存在着"步骤固定"、"代码频繁"的问题

解决方案：可以使用一些现成的分页插件完成。对于Mybatis来讲现在最主流的就是PageHelper。



> PageHelper是Mybatis的一款功能强大、方便易用的分页插件，支持任何形式的单标、多表的分页查询。
>
> 官网：https://pagehelper.github.io/

![image-20221215170038833](./assets/image-20221215170038833.png)

> 在执行empMapper.list()方法时，就是执行：select  *  from  emp   语句，怎么能够实现分页操作呢？
>
> 分页插件帮我们完成了以下操作：
>
> 1. 先获取到要执行的SQL语句：select  *  from  emp      
> 2. 把SQL语句中的字段列表，变为：count(*)
> 3. 执行SQL语句：select  count(*)  from  emp          //获取到总记录数
> 4. 再对要执行的SQL语句：select  *  from  emp 进行改造，在末尾添加 limit ? , ?
> 5. 执行改造后的SQL语句：select  *  from  emp  limit  ? , ? 



3.1.2.2 代码实现

当使用了PageHelper分页插件进行分页，就无需再Mapper中进行手动分页了。 在Mapper中我们只需要进行正常的列表查询即可。在Service层中，调用Mapper的方法之前设置分页参数，在调用Mapper方法执行查询之后，解析分页结果，并将结果封装到PageBean对象中返回。

1、在pom.xml引入依赖

```xml
<dependency>
    <groupId>com.github.pagehelper</groupId>
    <artifactId>pagehelper-spring-boot-starter</artifactId>
    <version>1.4.2</version>
</dependency>
```



2、EmpMapper

```java
@Mapper
public interface EmpMapper {
    //获取当前页的结果列表
    @Select("select * from emp")
    public List<Emp> page(Integer start, Integer pageSize);
}
```



3、EmpServiceImpl

```java
@Override
public PageBean page(Integer page, Integer pageSize) {
    // 设置分页参数
    PageHelper.startPage(page, pageSize); 
    // 执行分页查询
    List<Emp> empList = empMapper.list(name,gender,begin,end); 
    // 获取分页结果
    Page<Emp> p = (Page<Emp>) empList;   
    //封装PageBean
    PageBean pageBean = new PageBean(p.getTotal(), p.getResult()); 
    return pageBean;
}
```



3.1.2.3 测试

功能开发完成后，我们重启项目工程，打开postman，发起GET请求，访问 ：http://localhost:8080/emps?page=1&pageSize=5

![image-20221215162008339](./assets/image-20221215162008339.png)

> 后端程序SQL输出：
>
> ![image-20221215174820377](./assets/image-20221215174820377.png)







# 143.分页查询(带条件)

完了分页查询后，下面我们需要在分页查询的基础上，添加条件。

**3.2.1 需求**

![image-20221215175639974](./assets/image-20221215175639974.png)

通过员工管理的页面原型我们可以看到，员工列表页面的查询，不仅仅需要考虑分页，还需要考虑查询条件。 分页查询我们已经实现了，接下来，我们需要考虑在分页查询的基础上，再加上查询条件。

我们看到页面原型及需求中描述，搜索栏的搜索条件有三个，分别是：

- 姓名：模糊匹配
- 性别：精确匹配
- 入职日期：范围匹配

~~~mysql
select * 
from emp
where 
  name like concat('%','张','%')   -- 条件1：根据姓名模糊匹配
  and gender = 1                   -- 条件2：根据性别精确匹配
  and entrydate = between '2000-01-01' and '2010-01-01'  -- 条件3：根据入职日期范围匹配
order by update_time desc;
~~~

而且上述的三个条件，都是可以传递，也可以不传递的，也就是动态的。 我们需要使用前面学习的Mybatis中的动态SQL 。



**3.2.2 思路分析**

![image-20221215180528415](./assets/image-20221215180528415.png)



3.2.3 功能开发

通过查看接口文档：员工列表查询

> 请求路径：/emps
>
> 请求方式：GET
>
> 请求参数：
>
> | 参数名称 | 是否必须 | 示例       | 备注                                       |
> | -------- | -------- | ---------- | ------------------------------------------ |
> | name     | 否       | 张         | 姓名                                       |
> | gender   | 否       | 1          | 性别 , 1 男 , 2 女                         |
> | begin    | 否       | 2010-01-01 | 范围匹配的开始时间(入职日期)               |
> | end      | 否       | 2020-01-01 | 范围匹配的结束时间(入职日期)               |
> | page     | 是       | 1          | 分页查询的页码，如果未指定，默认为1        |
> | pageSize | 是       | 10         | 分页查询的每页记录数，如果未指定，默认为10 |



在原有分页查询的代码基础上进行改造：

**EmpController**

~~~java
@Slf4j
@RestController
@RequestMapping("/emps")
public class EmpController {

    @Autowired
    private EmpService empService;

    //条件分页查询
    @GetMapping
    public Result page(@RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer pageSize,
                       String name, Short gender,
                       @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate begin,
                       @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate end) {
        //记录日志
        log.info("分页查询，参数：{},{},{},{},{},{}", page, pageSize,name, gender, begin, end);
        //调用业务层分页查询功能
        PageBean pageBean = empService.page(page, pageSize, name, gender, begin, end);
        //响应
        return Result.success(pageBean);
    }
}
~~~

**EmpService**

~~~java
public interface EmpService {
    /**
     * 条件分页查询
     * @param page     页码
     * @param pageSize 每页展示记录数
     * @param name     姓名
     * @param gender   性别
     * @param begin   开始时间
     * @param end     结束时间
     * @return
     */
    PageBean page(Integer page, Integer pageSize, String name, Short gender, LocalDate begin, LocalDate end);
}
~~~

**EmpServiceImpl**

~~~java
@Slf4j
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    @Override
    public PageBean page(Integer page, Integer pageSize, String name, Short gender, LocalDate begin, LocalDate end) {
        //设置分页参数
        PageHelper.startPage(page, pageSize);
        //执行条件分页查询
        List<Emp> empList = empMapper.list(name, gender, begin, end);
        //获取查询结果
        Page<Emp> p = (Page<Emp>) empList;
        //封装PageBean
        PageBean pageBean = new PageBean(p.getTotal(), p.getResult());
        return pageBean;
    }
}
~~~

**EmpMapper**

~~~java
@Mapper
public interface EmpMapper {
    //获取当前页的结果列表
    public List<Emp> list(String name, Short gender, LocalDate begin, LocalDate end);
}
~~~

**EmpMapper.xml**

~~~xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="com.itheima.mapper.EmpMapper">

    <!-- 条件分页查询 -->
    <select id="list" resultType="com.itheima.pojo.Emp">
        select * from emp
        <where>
            <if test="name != null and name != ''">
                name like concat('%',#{name},'%')
            </if>
            <if test="gender != null">
                and gender = #{gender}
            </if>
            <if test="begin != null and end != null">
                and entrydate between #{begin} and #{end}
            </if>
        </where>
        order by update_time desc
    </select>
</mapper>
~~~



3.2.4 功能测试

功能开发完成后，重启项目工程，打开postman，发起GET请求：

![image-20221215182344380](./assets/image-20221215182344380.png)

> 控制台SQL语句：
>
> ![image-20221215182952789](./assets/image-20221215182952789.png)



3.2.5 前后端联调

打开浏览器，测试后端功能接口：

![image-20221215183510458](./assets/image-20221215183510458.png)









# 144.批量删除员工

查询员完成之后，我们继续开发新的功能：删除员工。

3.3.1 需求

![image-20221215183657413](./assets/image-20221215183657413.png)

当我们勾选列表前面的复选框，然后点击 "批量删除" 按钮，就可以将这一批次的员工信息删除掉了。也可以只勾选一个复选框，仅删除一个员工信息。

问题：我们需要开发两个功能接口吗？一个删除单个员工，一个删除多个员工

答案：不需要。 只需要开发一个功能接口即可（删除多个员工包含只删除一个员工）



**3.3.2 接口文档**

**删除员工**

- 基本信息

  ~~~
  请求路径：/emps/{ids}
  
  请求方式：DELETE
  
  接口描述：该接口用于批量删除员工的数据信息
  ~~~

- 请求参数

  参数格式：路径参数

  参数说明：

  | 参数名 | 类型       | 示例  | 是否必须 | 备注         |
  | ------ | ---------- | ----- | -------- | ------------ |
  | ids    | 数组 array | 1,2,3 | 必须     | 员工的id数组 |

  请求参数样例：

  ~~~
  /emps/1,2,3
  ~~~

- 响应数据

  参数格式：application/json

  参数说明：

  | 参数名 | 类型   | 是否必须 | 备注                           |
  | ------ | ------ | -------- | ------------------------------ |
  | code   | number | 必须     | 响应码，1 代表成功，0 代表失败 |
  | msg    | string | 非必须   | 提示信息                       |
  | data   | object | 非必须   | 返回的数据                     |

  响应数据样例：

  ~~~json
  {
      "code":1,
      "msg":"success",
      "data":null
  }
  ~~~

  

3.3.3 思路分析

![image-20221215184714815](./assets/image-20221215184714815.png)

> 接口文档规定：
>
> - 前端请求路径：/emps/{ids}
> - 前端请求方式：DELETE
>
> 问题1：怎么在controller中接收请求路径中的路径参数？
>
> ~~~
> @PathVariable
> ~~~
>
> 问题2：如何限定请求方式是delete？
>
> ~~~
> @DeleteMapping
> ~~~
>
> 问题3：在Mapper接口中，执行delete操作的SQL语句时，条件中的id值是不确定的是动态的，怎么实现呢？
>
> ~~~
> Mybatis中的动态SQL：foreach
> ~~~



3.3.4 功能开发

通过查看接口文档：删除员工

> 请求路径：/emps/{ids}
>
> 请求方式：DELETE
>
> 请求参数：路径参数 {ids}
>
> 响应数据：json格式

**EmpController**

~~~java
@Slf4j
@RestController
@RequestMapping("/emps")
public class EmpController {

    @Autowired
    private EmpService empService;

    //批量删除
    @DeleteMapping("/{ids}")
    public Result delete(@PathVariable List<Integer> ids){
        empService.delete(ids);
        return Result.success();
    }

    //条件分页查询
    @GetMapping
    public Result page(@RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer pageSize,
                       String name, Short gender,
                       @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate begin,
                       @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate end) {
        //记录日志
        log.info("分页查询，参数：{},{},{},{},{},{}", page, pageSize,name, gender, begin, end);
        //调用业务层分页查询功能
        PageBean pageBean = empService.page(page, pageSize, name, gender, begin, end);
        //响应
        return Result.success(pageBean);
    }
}
~~~

**EmpService**

~~~java
public interface EmpService {

    /**
     * 批量删除操作
     * @param ids id集合
     */
    void delete(List<Integer> ids);

    //省略...
}
~~~

**EmpServiceImpl**

~~~java
@Slf4j
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    @Override
    public void delete(List<Integer> ids) {
        empMapper.delete(ids);
    }

    //省略...
}
~~~

**EmpMapper**

~~~java
@Mapper
public interface EmpMapper {
    //批量删除
    void delete(List<Integer> ids);

    //省略...
}
~~~

**EmpMapper.xml**

~~~xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="com.itheima.mapper.EmpMapper">

    <!--批量删除员工-->
    <delete id="delete">
        delete from emp where id in
        <foreach collection="ids" item="id" open="(" close=")" separator=",">
            #{id}
        </foreach>
    </delete>

    <!-- 省略... -->

</mapper>
~~~



3.3.5 功能测试

功能开发完成后，重启项目工程，打开postman，发起DELETE请求：

![image-20221215190229696](./assets/image-20221215190229696.png)

> 控制台SQL语句：
>
> ![image-20221215190948723](./assets/image-20221215190948723.png)



3.3.6 前后端联调

打开浏览器，测试后端功能接口：

![image-20221215190606676](./assets/image-20221215190606676.png)

![image-20221215190640539](./assets/image-20221215190640539.png)

![](./assets/image-20221215190753313.png)





# 145. 新增员工

1.1 需求

![image-20221216162622582](./assets/image-20221216162622582.png) 

在新增用户时，我们需要保存用户的基本信息，并且还需要上传的员工的图片，目前我们先完成第一步操作，保存用户的基本信息。 



1.2 接口文档

我们参照接口文档来开发新增员工功能

- 基本信息

  ~~~
  请求路径：/emps
  
  请求方式：POST
  
  接口描述：该接口用于添加员工的信息
  ~~~

- 请求参数

  参数格式：application/json

  参数说明：

  | 名称      | 类型   | 是否必须 | 备注                                                         |
  | --------- | ------ | -------- | ------------------------------------------------------------ |
  | username  | string | 必须     | 用户名                                                       |
  | name      | string | 必须     | 姓名                                                         |
  | gender    | number | 必须     | 性别, 说明: 1 男, 2 女                                       |
  | image     | string | 非必须   | 图像                                                         |
  | deptId    | number | 非必须   | 部门id                                                       |
  | entrydate | string | 非必须   | 入职日期                                                     |
  | job       | number | 非必须   | 职位, 说明: 1 班主任,2 讲师, 3 学工主管, 4 教研主管, 5 咨询师 |

  请求数据样例：

  ~~~json
  {
    "image": "https://web-framework.oss-cn-hangzhou.aliyuncs.com/2022-09-03-07-37-38222.jpg",
    "username": "linpingzhi",
    "name": "林平之",
    "gender": 1,
    "job": 1,
    "entrydate": "2022-09-18",
    "deptId": 1
  }
  ~~~

- 响应数据

  参数格式：application/json

  参数说明：

  | 参数名 | 类型   | 是否必须 | 备注                           |
  | ------ | ------ | -------- | ------------------------------ |
  | code   | number | 必须     | 响应码，1 代表成功，0 代表失败 |
  | msg    | string | 非必须   | 提示信息                       |
  | data   | object | 非必须   | 返回的数据                     |

  响应数据样例：

  ~~~json
  {
      "code":1,
      "msg":"success",
      "data":null
  }
  ~~~



1.3 思路分析

新增员工的具体的流程：

![image-20221216170946166](./assets/image-20221216170946166.png)

> 接口文档规定：
>
> - 请求路径：/emps
> - 请求方式：POST
> - 请求参数：Json格式数据
> - 响应数据：Json格式数据
>
> 问题1：如何限定请求方式是POST？
>
> ~~~java
> @PostMapping
> ~~~
>
> 问题2：怎么在controller中接收json格式的请求参数？
>
> ~~~java
> @RequestBody  //把前端传递的json数据填充到实体类中
> ~~~



1.4 功能开发

**EmpController**

~~~java
@Slf4j
@RestController
@RequestMapping("/emps")
public class EmpController {

    @Autowired
    private EmpService empService;

    //新增
    @PostMapping
    public Result save(@RequestBody Emp emp){
        //记录日志
        log.info("新增员工, emp:{}",emp);
        //调用业务层新增功能
        empService.save(emp);
        //响应
        return Result.success();
    }

    //省略...
}
~~~

**EmpService**

~~~java
public interface EmpService {

    /**
     * 保存员工信息
     * @param emp
     */
    void save(Emp emp);
    
    //省略...
}

~~~

**EmpServiceImpl**

~~~java
@Slf4j
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    @Override
    public void save(Emp emp) {
        //补全数据
        emp.setCreateTime(LocalDateTime.now());
        emp.setUpdateTime(LocalDateTime.now());
        //调用添加方法
        empMapper.insert(emp);
    }

    //省略...
}
~~~

**EmpMapper**

~~~java
@Mapper
public interface EmpMapper {
    //新增员工
    @Insert("insert into emp (username, name, gender, image, job, entrydate, dept_id, create_time, update_time) " +
            "values (#{username}, #{name}, #{gender}, #{image}, #{job}, #{entrydate}, #{deptId}, #{createTime}, #{updateTime});")
    void insert(Emp emp);

    //省略...
}

~~~



1.5 功能测试

代码开发完成后，重启服务器，打开Postman发送 POST 请求，请求路径：http://localhost:8080/emps

![image-20221216181017910](O:/BaiduSyncdisk/other/课/黑马/JAVAWeb/day11-SpringBootWeb案例/讲义/assets/image-20221216181017910.png)



1.6 前后端联调

功能测试通过后，我们再进行通过打开浏览器，测试后端功能接口：

![image-20221216181511401](O:/BaiduSyncdisk/other/课/黑马/JAVAWeb/day11-SpringBootWeb案例/讲义/assets/image-20221216181511401.png)

![image-20221216181628331](O:/BaiduSyncdisk/other/课/黑马/JAVAWeb/day11-SpringBootWeb案例/讲义/assets/image-20221216181628331.png)

# 146. 文件上传

在我们完成的新增员工功能中，还存在一个问题：没有头像(图片缺失)

![image-20221216200653717](./assets/image-20221216200653717.png)

上述问题，需要我们通过文件上传技术来解决。下面我们就进入到文件上传技术的学习。

文件上传技术这块我们主要讲解三个方面：首先我们先对文件上传做一个整体的介绍，接着再学习文件上传的本地存储方式，最后学习云存储方式。

接下来我们就先来学习下什么是文件上传。



**2.1 简介** 

文件上传，是指将本地图片、视频、音频等文件上传到服务器，供其他用户浏览或下载的过程。

文件上传在项目中应用非常广泛，我们经常发微博、发微信朋友圈都用到了文件上传功能。

![image-20221216203904713](./assets/image-20221216203904713.png)

> 在我们的案例中，在新增员工的时候，要上传员工的头像，此时就会涉及到文件上传的功能。在进行文件上传时，我们点击加号或者是点击图片，就可以选择手机或者是电脑本地的图片文件了。当我们选择了某一个图片文件之后，这个文件就会上传到服务器，从而完成文件上传的操作。

想要完成文件上传这个功能需要涉及到两个部分：

1. 前端程序
2. 服务端程序



我们先来看看在前端程序中要完成哪些代码：

```html
<form action="/upload" method="post" enctype="multipart/form-data">
	姓名: <input type="text" name="username"><br>
    年龄: <input type="text" name="age"><br>
    头像: <input type="file" name="image"><br>
    <input type="submit" value="提交">
</form>
```

上传文件的原始form表单，要求表单必须具备以下三点（上传文件页面三要素）：

- 表单必须有file域，用于选择要上传的文件

  > ~~~html
  > <input type="file" name="image"/>
  > ~~~

- 表单提交方式必须为POST

  > 通常上传的文件会比较大，所以需要使用 POST 提交方式

- 表单的编码类型enctype必须要设置为：multipart/form-data

  > 普通默认的编码格式是不适合传输大型的二进制数据的，所以在文件上传时，表单的编码格式必须设置为multipart/form-data
  >
  > ![image-20231027175050754](./assets/image-20231027175050754.png)





前端页面的3要素我们了解后，接下来我们就来验证下所讲解的文件上传3要素。

在提供的"课程资料"中有一个名叫"文件上传"的文件夹，直接将里的"upload.html"文件，复制到springboot项目工程下的static目录里面。

![image-20221216210054136](./assets/image-20221216210054136.png)





下面我们来验证：删除form表单中enctype属性值，会是什么情况？

1. 在IDEA中直接使用浏览器打开upload.html页面

![image-20221216210643628](./assets/image-20221216210643628.png)



> 使用火狐浏览器的原因：需要通过抓包的形式来让大家看到底层发送的数据。
>
> 而谷歌浏览器对这块数据进行了包装，已经看不见底层的原始数据了，正常的测试就可以直接使用谷歌浏览器。



2. 选择要上传的本地文件

![image-20221216210938612](./assets/image-20221216210938612.png)



3. 点击"提交"按钮，进入到开发者模式观察

   > 由于/upload这个页面我们还没开发，所以报这个错误是正常的

![image-20221216211629307](./assets/image-20221216211629307.png)

![image-20221216212152607](./assets/image-20221216212152607.png)





我们再来验证：设置form表单中enctype属性值为multipart/form-data，会是什么情况？

~~~html
 <form action="/upload" method="post" enctype="multipart/form-data">
        姓名: <input type="text" name="username"><br>
        年龄: <input type="text" name="age"><br>
        头像: <input type="file" name="image"><br>
        <input type="submit" value="提交">
    </form>
~~~

> boundary：分隔符
>
> 表单数据在提交时，是分成多个部分提交的，每一个表单项就是一个单独的部分，而多个部分之间，会使用浏览器自动生成的boundary分隔符来进行分割

![image-20221216215320623](./assets/image-20221216215320623.png)

只有文本文件才可以看见文本内容的效果，如果是图片，就会是乱码

不仅文件名提交到了服务端，文件的内容也提交到了服务单

![image-20221216215041710](./assets/image-20221216215041710.png)



知道了前端程序中需要设置上传文件页面三要素，那我们的后端程序又是如何实现的呢？

- 首先在服务端定义这么一个controller，用来进行文件上传，然后在controller当中定义一个方法来处理`/upload` 请求

- 在定义的方法中接收提交过来的数据 （方法中的形参名和请求参数的名字保持一致）

  - 用户名：String  name
  - 年龄： Integer  age
  - 文件： MultipartFile  image

  > Spring中提供了一个API：MultipartFile，使用这个API就可以来接收到上传的文件

![image-20221216215930807](./assets/image-20221216215930807.png)

> 问题：如果表单项的名字和方法中形参名不一致，该怎么办？
>
> - ~~~javascript
>   public Result upload(String username,
>                        Integer age, 
>                        MultipartFile file) //file形参名和请求参数名image不一致
>   ~~~
>
> 解决：使用@RequestParam注解进行参数绑定
>
> - ~~~java
>   public Result upload(String username,
>                        Integer age, 
>                        @RequestParam("image") MultipartFile file)
>   ~~~



#### **UploadController代码：**

~~~java
@Slf4j
@RestController
public class UploadController {

    @PostMapping("/upload")
    public Result upload(String username, Integer age, MultipartFile image)  {
        log.info("文件上传：{},{},{}",username,age,image);
        return Result.success();
    }

}
~~~

> 后端程序编写完成之后，打个断点，以debug方式启动SpringBoot项目

![image-20221216222533720](./assets/image-20221216222533720.png)

> 打开浏览器输入：http://localhost:8080/upload.html ， 录入数据并提交

![image-20221216222412510](./assets/image-20221216222412510.png)

通过后端程序控制台可以看到，上传的文件是存放在一个临时目录

![image-20221216222802617](./assets/image-20221216222802617.png)

> 打开临时目录可以看到以下内容：

![image-20221216223328710](./assets/image-20221216223328710.png)

> 表单提交的三项数据(姓名、年龄、文件)，分别存储在不同的临时文件中：

![image-20221216223300846](./assets/image-20221216223300846.png)

> 当我们程序运行完毕之后，这个临时文件会自动删除。 
>
> 所以，我们如果想要实现文件上传，需要将这个临时文件，要转存到我们的磁盘目录中。



# 147.本地存储

前面我们已分析了文件上传功能前端和后端的基础代码实现，文件上传时在服务端会产生一个临时文件，请求响应完成之后，这个临时文件被自动删除，并没有进行保存。下面呢，我们就需要完成将上传的文件保存在服务器的本地磁盘上。

代码实现：

1. 在服务器本地磁盘上创建images目录，用来存储上传的文件（例：E盘创建images目录）
2. 使用MultipartFile类提供的API方法，把临时文件转存到本地磁盘目录下

> MultipartFile 常见方法： 
>
> - String  getOriginalFilename();  //获取原始文件名
> - void  transferTo(File dest);     //将接收的文件转存到磁盘文件中
> - long  getSize();     //获取文件的大小，单位：字节
> - byte[]  getBytes();    //获取文件内容的字节数组
> - InputStream  getInputStream();    //获取接收到的文件内容的输入流

~~~java
@Slf4j
@RestController
public class UploadController {

    @PostMapping("/upload")
    public Result upload(String username, Integer age, MultipartFile image) throws IOException {
        log.info("文件上传：{},{},{}",username,age,image);

        //获取原始文件名
        String originalFilename = image.getOriginalFilename();

        //将文件存储在服务器的磁盘目录
        image.transferTo(new File("E:/images/"+originalFilename));

        return Result.success();
    }

}
~~~

利用postman测试：

> 注意：请求参数名和controller方法形参名保持一致

![image-20221227211742547](./assets/image-20221227211742547.png)

![image-20221227214219279](./assets/image-20221227214219279.png)

![image-20221227214753358](./assets/image-20221227214753358.png)

通过postman测试，我们发现文件上传是没有问题的。但是由于我们是使用原始文件名作为所上传文件的存储名字，当我们再次上传一个名为1.jpg文件时，发现会把之前已经上传成功的文件覆盖掉。



## UUID

> UUID：通用唯一识别码，简单来说UUID就是一个长度固定的字符串，它是不会重复的
>
> ```java
> //生成一个UUID
> UUID.randomUUID()
> 
> //获取UUID的字符串
> UUID.randomUUID().toString()
> 
> 7b0dfe0f-1220-4ef9-b581-a06a0af8c3c9
> ```
>
> 中间使用了四个横杠来进行分隔，算上横杠，总长度为32位

解决方案：保证每次上传文件时文件名都唯一的（使用UUID获取随机文件名）

~~~java
@Slf4j
@RestController
public class UploadController {

    @PostMapping("/upload")
    public Result upload(String username, Integer age, MultipartFile image) throws IOException {
        log.info("文件上传：{},{},{}",username,age,image);

        //获取原始文件名
        String originalFilename = image.getOriginalFilename();

        //构建新的文件名
        String extname = originalFilename.substring(originalFilename.lastIndexOf("."));//文件扩展名
        String newFileName = UUID.randomUUID().toString()+extname;//随机名+文件扩展名

        //将文件存储在服务器的磁盘目录
        image.transferTo(new File("E:/images/"+newFileName));

        return Result.success();
    }

}
~~~

在解决了文件名唯一性的问题后，我们再次上传一个较大的文件(超出1M)时发现，后端程序报错：

![image-20221227223851924](./assets/image-20221227223851924.png)

报错原因呢是因为：在SpringBoot中，文件上传时默认单个文件最大大小为1M

那么如果需要上传大文件，可以在application.properties进行如下配置：

~~~properties
#配置单个文件最大上传大小
spring.servlet.multipart.max-file-size=10MB

#配置单个请求最大上传大小(一次请求可以上传多个文件，多个文件的总大小不能超过100M，通过集合上传)
spring.servlet.multipart.max-request-size=100MB
~~~



到时此，我们文件上传的本地存储方式已完成了。但是这种本地存储方式还存在一问题： 

![image-20220904200320964](./assets/image-20220904200320964.png) 

如果直接存储在服务器的磁盘目录中，存在以下缺点：

- 无法在浏览器直接访问
- 不安全：磁盘如果损坏，所有的文件就会丢失
- 容量有限：如果存储大量的图片，磁盘空间有限(磁盘不可能无限制扩容)

为了解决上述问题呢，通常有两种解决方案：

- 自己搭建存储服务器，如：fastDFS 、MinIO
- 使用现成的云服务，如：阿里云，腾讯云，华为云

# 148.阿里云OSS

2.3.1 准备

阿里云是阿里巴巴集团旗下全球领先的云计算公司，也是国内最大的云服务提供商 。

![image-20221229093412464](./assets/image-20221229093412464.png)

> 云服务指的就是通过互联网对外提供的各种各样的服务，比如像：语音服务、短信服务、邮件服务、视频直播服务、文字识别服务、对象存储服务等等。
>
> 当我们在项目开发时需要用到某个或某些服务，就不需要自己来开发了，可以直接使用阿里云提供好的这些现成服务就可以了。比如：在项目开发当中，我们要实现一个短信发送的功能，如果我们项目组自己实现，将会非常繁琐，因为你需要和各个运营商进行对接。而此时阿里云完成了和三大运营商对接，并对外提供了一个短信服务。我们项目组只需要调用阿里云提供的短信服务，就可以很方便的来发送短信了。这样就降低了我们项目的开发难度，同时也提高了项目的开发效率。（大白话：别人帮我们实现好了功能，我们只要调用即可）
>
> 云服务提供商给我们提供的软件服务通常是需要收取一部分费用的。

阿里云对象存储OSS（Object Storage Service）（这里的对象指的就是文件），是一款海量、安全、低成本、高可靠的云存储服务。使用OSS，您可以通过网络随时存储和调用包括文本、图片、音频和视频等在内的各种文件。

![image-20220904200642064](./assets/image-20220904200642064.png) 

在我们使用了阿里云OSS对象存储服务之后，我们的项目当中如果涉及到文件上传这样的业务，在前端进行文件上传并请求到服务端时，在服务器本地磁盘当中就不需要再来存储文件了。我们直接将接收到的文件上传到oss，由 oss帮我们存储和管理，同时阿里云的oss存储服务还保障了我们所存储内容的安全可靠。

![image-20221229095709505](./assets/image-20221229095709505.png)



那我们学习使用这类云服务，我们主要学习什么呢？其实我们主要学习的是如何在项目当中来使用云服务完成具体的业务功能。而无论使用什么样的云服务，阿里云也好，腾讯云、华为云也罢，在使用第三方的服务时，操作的思路都是一样的。

![image-20221229093911113](./assets/image-20221229093911113.png)

> SDK：Software Development Kit 的缩写，软件开发工具包，包括辅助软件开发的依赖（jar包）、代码示例等，都可以叫做SDK。
>
> 简单说，sdk中包含了我们使用第三方云服务时所需要的依赖，以及一些示例代码。我们可以参照sdk所提供的示例代码就可以完成入门程序。

第三方服务使用的通用思路，我们做一个简单介绍之后，接下来我们就来介绍一下我们当前要使用的阿里云oss对象存储服务具体的使用步骤。

![image-20221229112451120](./assets/image-20221229112451120.png)

> Bucket：存储空间是用户用于存储对象（Object，就是文件）的容器，所有的对象都必须隶属于某个存储空间。

下面我们根据之前介绍的使用步骤，完成准备工作：1. 阿里云OSS简介 	

​	阿里云对象存储服务（Object Storage Service，简称OSS）为您提供基于网络的数据存取服务。使用OSS，您可以通过网络随时存储和调用包括文本、图片、音频和视频等在内的各种非结构化数据文件。
阿里云OSS将数据文件以对象（object）的形式上传到存储空间（bucket）中。

​	您可以进行以下操作：

- 创建一个或者多个存储空间，向每个存储空间中添加一个或多个文件。
- 通过获取已上传文件的地址进行文件的分享和下载。
- 通过修改存储空间或文件的属性或元信息来设置相应的访问权限。
- 在阿里云管理控制台执行基本和高级OSS任务。
- 使用阿里云开发工具包或直接在应用程序中进行RESTful API调用执行基本和高级OSS任务





### 2. OSS开通 

（1）打开https://www.aliyun.com/ ，申请阿里云账号并完成实名认证。

![image-20221128012526497](O:\BaiduSyncdisk\other\课\黑马\JAVAWeb\day11-SpringBootWeb案例\资料\04. 阿里云oss\assets\image-20221128012526497.png)  



（2）充值 (可以不用做)



（3）开通OSS

登录阿里云官网。 点击右上角的控制台。

![image-20221129214250389](O:\BaiduSyncdisk\other\课\黑马\JAVAWeb\day11-SpringBootWeb案例\资料\04. 阿里云oss\assets\image-20221129214250389.png) 

将鼠标移至产品，找到并单击对象存储OSS，打开OSS产品详情页面。在OSS产品详情页中的单击立即开通。

<img src="O:\BaiduSyncdisk\other\课\黑马\JAVAWeb\day11-SpringBootWeb案例\资料\04. 阿里云oss\assets\image-20221129214332892.png" alt="image-20221129214332892" style="zoom:67%;" /> 

<img src="O:\BaiduSyncdisk\other\课\黑马\JAVAWeb\day11-SpringBootWeb案例\资料\04. 阿里云oss\assets\image-20221129214403131.png" alt="image-20221129214403131" style="zoom:80%;" /> 

![image-20221128012258544](O:\BaiduSyncdisk\other\课\黑马\JAVAWeb\day11-SpringBootWeb案例\资料\04. 阿里云oss\assets\image-20221128012258544.png) 



开通服务后，在OSS产品详情页面单击管理控制台直接进入OSS管理控制台界面。您也可以单击位于官网首页右上方菜单栏的控制台，进入阿里云管理控制台首页，然后单击左侧的对象存储OSS菜单进入[OSS管理控制台界面](https://oss.console.aliyun.com/overview)。

![image-20201126234535040](O:\BaiduSyncdisk\other\课\黑马\JAVAWeb\day11-SpringBootWeb案例\资料\04. 阿里云oss\assets\image-20201126234535040.png)



（4）创建存储空间

新建Bucket，命名为 hmleadnews ，读写权限为 **==公共读==**

<img src="O:\BaiduSyncdisk\other\课\黑马\JAVAWeb\day11-SpringBootWeb案例\资料\04. 阿里云oss\assets\image-20221128014414947.png" alt="image-20221128014414947" style="zoom:67%;" />  



获取秘钥

![image-20231027203702672](./assets/image-20231027203702672.png)



AccessKey包含两项信息

![image-20231027203825491](./assets/image-20231027203825491.png)

现在已经不能直接看了，创建好了就要记得保存





# 149. OSS快速入门 

[参考文档官方](https://help.aliyun.com/document_detail/32009.html?spm=a2c4g.11186623.6.919.7c264562C2Fjfs)

![image-20231027204847341](./assets/image-20231027204847341.png)

![image-20231027204916756](./assets/image-20231027204916756.png)

![image-20231027204944919](./assets/image-20231027204944919.png)

（1）创建测试工程，引入依赖

```xml
<dependency>
    <groupId>com.aliyun.oss</groupId>
    <artifactId>aliyun-sdk-oss</artifactId>
    <version>3.15.1</version>
</dependency>
```



（2）新建类和main方法

```java
import org.junit.jupiter.api.Test;
import com.aliyun.oss.ClientException;
import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.OSSException;
import java.io.FileInputStream;
import java.io.InputStream;

public class AliOssTest {

    @Test
    public void testOss(){
        // Endpoint以华东1（杭州）为例，其它Region请按实际情况填写。
        String endpoint = "https://oss-cn-hangzhou.aliyuncs.com";
        // 阿里云账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM用户进行API访问或日常运维，请登录RAM控制台创建RAM用户。
        String accessKeyId = "---------------------";
        String accessKeySecret = "-----------------------";
        // 填写Bucket名称，例如examplebucket。
        String bucketName = "-----------";
        // 填写Object完整路径，完整路径中不能包含Bucket名称，例如exampledir/exampleobject.txt。
        String objectName = "0001.jpg";
        // 填写本地文件的完整路径，例如D:\\localpath\\examplefile.txt。
        // 如果未指定本地路径，则默认从示例程序所属项目对应本地路径中上传文件流。
        String filePath= "C:\\Users\\Administrator\\Pictures\\Saved Pictures\\10.jpg";

        // 创建OSSClient实例。
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

        try {
            InputStream inputStream = new FileInputStream(filePath);
            // 创建PutObject请求。
            ossClient.putObject(bucketName, objectName, inputStream);
        } catch (OSSException oe) {
            System.out.println("Caught an OSSException, which means your request made it to OSS, "
                    + "but was rejected with an error response for some reason.");
            System.out.println("Error Message:" + oe.getErrorMessage());
            System.out.println("Error Code:" + oe.getErrorCode());
            System.out.println("Request ID:" + oe.getRequestId());
            System.out.println("Host ID:" + oe.getHostId());
        } catch (Exception ce) {
            System.out.println("Caught an ClientException, which means the client encountered "
                    + "a serious internal problem while trying to communicate with OSS, "
                    + "such as not being able to access the network.");
            System.out.println("Error Message:" + ce.getMessage());
        } finally {
            if (ossClient != null) {
                ossClient.shutdown();
            }
        }
    }
}
```





### 4. 获取AccessKeyId

![image-20221128020105943](O:\BaiduSyncdisk\other\课\黑马\JAVAWeb\day11-SpringBootWeb案例\资料\04. 阿里云oss\assets\image-20221128020105943.png) 













2.3.2 入门

阿里云oss 对象存储服务的准备工作我们已经完成了，接下来我们就来完成第二步操作：参照官方所提供的sdk示例来编写入门程序。

首先我们需要来打开阿里云OSS的官方文档，在官方文档中找到 SDK 的示例代码：

![image-20221229121848524](O:/BaiduSyncdisk/other/课/黑马/JAVAWeb/day11-SpringBootWeb案例/讲义/assets/image-20221229121848524.png)

![image-20221229122046597](O:/BaiduSyncdisk/other/课/黑马/JAVAWeb/day11-SpringBootWeb案例/讲义/assets/image-20221229122046597.png)

> 如果是在实际开发当中，我们是需要从前往后仔细的去阅读这一份文档的，但是由于现在是教学，我们就只挑重点的去看。有兴趣的同学大家下来也可以自己去看一下这份官方文档。

![image-20221229144342148](O:/BaiduSyncdisk/other/课/黑马/JAVAWeb/day11-SpringBootWeb案例/讲义/assets/image-20221229144342148.png)

![image-20221229160827124](O:/BaiduSyncdisk/other/课/黑马/JAVAWeb/day11-SpringBootWeb案例/讲义/assets/image-20221229160827124.png)

参照官方提供的SDK，改造一下，即可实现文件上传功能：

endpoint：

![image-20231027210748555](./assets/image-20231027210748555.png)

安装环境变量：

[如何为Java SDK配置访问凭证_对象存储 OSS-阿里云帮助中心 (aliyun.com)

[](https://help.aliyun.com/zh/oss/developer-reference/oss-java-configure-access-credentials#62705110fe25t)

环境变量配置完成记得重启阿里云

~~~java
import com.aliyun.oss.ClientException;
import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.OSSException;
import com.aliyun.oss.model.PutObjectRequest;
import com.aliyun.oss.model.PutObjectResult;

import java.io.FileInputStream;
import java.io.InputStream;

public class AliOssTest {
    public static void main(String[] args) throws Exception {
        // Endpoint以华东1（杭州）为例，其它Region请按实际情况填写。
        String endpoint = "oss-cn-shanghai.aliyuncs.com";
        
        // 阿里云账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM用户进行API访问或日常运维，请登录RAM控制台创建RAM用户。
        String accessKeyId = "LTAI5t9MZK8iq5T2Av5GLDxX";
        String accessKeySecret = "C0IrHzKZGKqU8S7YQcevcotD3Zd5Tc";
        
        // 填写Bucket名称，例如examplebucket。
        String bucketName = "web-framework01";
        // 填写Object完整路径，完整路径中不能包含Bucket名称，例如exampledir/exampleobject.txt。
        String objectName = "1.jpg";
        // 填写本地文件的完整路径，例如D:\\localpath\\examplefile.txt。
        // 如果未指定本地路径，则默认从示例程序所属项目对应本地路径中上传文件流。
        String filePath= "C:\\Users\\Administrator\\Pictures\\1.jpg";

        // 创建OSSClient实例。
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

        try {
            InputStream inputStream = new FileInputStream(filePath);
            // 创建PutObjectRequest对象。
            PutObjectRequest putObjectRequest = new PutObjectRequest(bucketName, objectName, inputStream);
            // 设置该属性可以返回response。如果不设置，则返回的response为空。
            putObjectRequest.setProcess("true");
            // 创建PutObject请求。
            PutObjectResult result = ossClient.putObject(putObjectRequest);
            // 如果上传成功，则返回200。
            System.out.println(result.getResponse().getStatusCode());
        } catch (OSSException oe) {
            System.out.println("Caught an OSSException, which means your request made it to OSS, "
                    + "but was rejected with an error response for some reason.");
            System.out.println("Error Message:" + oe.getErrorMessage());
            System.out.println("Error Code:" + oe.getErrorCode());
            System.out.println("Request ID:" + oe.getRequestId());
            System.out.println("Host ID:" + oe.getHostId());
        } catch (ClientException ce) {
            System.out.println("Caught an ClientException, which means the client encountered "
                    + "a serious internal problem while trying to communicate with OSS, "
                    + "such as not being able to access the network.");
            System.out.println("Error Message:" + ce.getMessage());
        } finally {
            if (ossClient != null) {
                ossClient.shutdown();
            }
        }
    }
}

~~~

> 在以上代码中，需要替换的内容为：
>
> - accessKeyId：阿里云账号AccessKey
> - accessKeySecret：阿里云账号AccessKey对应的秘钥
> - bucketName：Bucket名称
> - objectName：对象名称，在Bucket中存储的对象的名称
> - filePath：文件路径
>
> AccessKey ：
>
> ![image-20221128020105943](./assets/image-20221128020105943.png) 

运行以上程序后，会把本地的文件上传到阿里云OSS服务器上：

![image-20221229161326919](./assets/image-20221229161326919.png)

并且会为每一个文件都分配一个url地址

![image-20231027212110783](./assets/image-20231027212110783.png)

# 150.集成

阿里云oss对象存储服务的准备工作以及入门程序我们都已经完成了，接下来我们就需要在案例当中集成oss对象存储服务，来存储和管理案例中上传的图片。

![image-20221229170235632](./assets/image-20221229170235632.png)

> 在新增员工的时候，上传员工的图像，而之所以需要上传员工的图像，是因为将来我们需要在系统页面当中访问并展示员工的图像。而要想完成这个操作，需要做两件事：
>
> 1. 需要上传员工的图像，并把图像保存起来（存储到阿里云OSS）
> 2. 访问员工图像（通过图像在阿里云OSS的存储地址访问图像）
>    - OSS中的每一个文件都会分配一个访问的url，通过这个url就可以访问到存储在阿里云上的图片。所以需要把url返回给前端，这样前端就可以通过url获取到图像。



我们参照接口文档来开发文件上传功能：

- 基本信息

  ~~~
  请求路径：/upload
  
  请求方式：POST
  
  接口描述：上传图片接口
  ~~~

- 请求参数

  参数格式：multipart/form-data

  参数说明：

  | 参数名称 | 参数类型 | 是否必须 | 示例 | 备注 |
  | -------- | -------- | -------- | ---- | ---- |
  | image    | file     | 是       |      |      |

- 响应数据

  参数格式：application/json

  参数说明：

  | 参数名 | 类型   | 是否必须 | 备注                           |
  | ------ | ------ | -------- | ------------------------------ |
  | code   | number | 必须     | 响应码，1 代表成功，0 代表失败 |
  | msg    | string | 非必须   | 提示信息                       |
  | data   | object | 非必须   | 返回的数据，上传图片的访问路径 |

  响应数据样例：

  ~~~json
  {
      "code": 1,
      "msg": "success",
      "data": "https://web-framework.oss-cn-hangzhou.aliyuncs.com/2022-09-02-00-27-0400.jpg"
  }
  ~~~



引入阿里云OSS上传文件工具类（由官方的示例代码改造而来）

~~~java
import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

@Component
public class AliOSSUtils {
    private String endpoint = "https://oss-cn-shanghai.aliyuncs.com";
    private String accessKeyId = "LTAI5t9MZK8iq5T2Av5GLDxX";
    private String accessKeySecret = "C0IrHzKZGKqU8S7YQcevcotD3Zd5Tc";
    private String bucketName = "web-framework01";

    /**
     * 实现上传图片到OSS
     */
    public String upload(MultipartFile multipartFile) throws IOException {
        // 获取上传的文件的输入流
        InputStream inputStream = multipartFile.getInputStream();

        // 避免文件覆盖
        String originalFilename = multipartFile.getOriginalFilename();
        String fileName = UUID.randomUUID().toString() + originalFilename.substring(originalFilename.lastIndexOf("."));

        //上传文件到 OSS
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
        ossClient.putObject(bucketName, fileName, inputStream);

        //文件访问路径
        String url = endpoint.split("//")[0] + "//" + bucketName + "." + endpoint.split("//")[1] + "/" + fileName;

        // 关闭ossClient
        ossClient.shutdown();
        return url;// 把上传到oss的路径返回
    }
}
~~~

修改UploadController代码：

~~~java
import com.itheima.pojo.Result;
import com.itheima.utils.AliOSSUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;

@Slf4j
@RestController
public class UploadController {

    @Autowired
    private AliOSSUtils aliOSSUtils;

    @PostMapping("/upload")
    public Result upload(MultipartFile image) throws IOException {
        //调用阿里云OSS工具类，将上传上来的文件存入阿里云
        String url = aliOSSUtils.upload(image);
        //将图片上传完成后的url返回，用于浏览器回显展示
        return Result.success(url);
    }
    
}
~~~

使用postman测试：

![image-20230102175353270](O:/BaiduSyncdisk/other/课/黑马/JAVAWeb/day11-SpringBootWeb案例/讲义/assets/image-20230102175353270.png)

# 151. 修改员工

需求：修改员工信息

![image-20220904220001994](./assets/image-20220904220001994.png)

 <img src="./assets/image-20220904220006578.png" style="zoom: 50%;" />

在进行修改员工信息的时候，我们首先先要根据员工的ID查询员工的信息用于页面回显展示，然后用户修改员工数据之后，点击保存按钮，就可以将修改的数据提交到服务端，保存到数据库。 具体操作为：

1. 根据ID查询员工信息
2. 保存修改的员工信息



## 查询回显

3.1.1 接口文档

根据ID查询员工数据 

- 基本信息

  ~~~
  请求路径：/emps/{id}
  
  请求方式：GET
  
  接口描述：该接口用于根据主键ID查询员工的信息
  ~~~

- 请求参数

  参数格式：路径参数

  参数说明：

  | 参数名 | 类型   | 是否必须 | 备注   |
  | ------ | ------ | -------- | ------ |
  | id     | number | 必须     | 员工ID |

  请求参数样例：

  ~~~
  /emps/1
  ~~~

- 响应数据

  参数格式：application/json

  参数说明：

  | 名称           | 类型   | 是否必须 | 默认值 | 备注                                                         |
  | -------------- | ------ | -------- | ------ | ------------------------------------------------------------ |
  | code           | number | 必须     |        | 响应码, 1 成功 , 0 失败                                      |
  | msg            | string | 非必须   |        | 提示信息                                                     |
  | data           | object | 必须     |        | 返回的数据                                                   |
  | \|- id         | number | 非必须   |        | id                                                           |
  | \|- username   | string | 非必须   |        | 用户名                                                       |
  | \|- name       | string | 非必须   |        | 姓名                                                         |
  | \|- password   | string | 非必须   |        | 密码                                                         |
  | \|- entrydate  | string | 非必须   |        | 入职日期                                                     |
  | \|- gender     | number | 非必须   |        | 性别 , 1 男 ; 2 女                                           |
  | \|- image      | string | 非必须   |        | 图像                                                         |
  | \|- job        | number | 非必须   |        | 职位, 说明: 1 班主任,2 讲师, 3 学工主管, 4 教研主管, 5 咨询师 |
  | \|- deptId     | number | 非必须   |        | 部门id                                                       |
  | \|- createTime | string | 非必须   |        | 创建时间                                                     |
  | \|- updateTime | string | 非必须   |        | 更新时间                                                     |

  响应数据样例：

  ~~~json
  {
    "code": 1,
    "msg": "success",
    "data": {
      "id": 2,
      "username": "zhangwuji",
      "password": "123456",
      "name": "张无忌",
      "gender": 1,
      "image": "https://web-framework.oss-cn-hangzhou.aliyuncs.com/2022-09-02-00-27-53B.jpg",
      "job": 2,
      "entrydate": "2015-01-01",
      "deptId": 2,
      "createTime": "2022-09-01T23:06:30",
      "updateTime": "2022-09-02T00:29:04"
    }
  }
  ~~~



3.1.2 实现思路

![image-20221230161841795](./assets/image-20221230161841795.png)



3.1.3 代码实现

- EmpMapper

~~~java
@Mapper
public interface EmpMapper {

    //根据ID查询员工信息
    @Select("select id, username, password, name, gender, image, job, entrydate, dept_id, create_time, update_time " +
            "from emp " +
            "where id = #{id}")
    public Emp findById(Integer id);

    
    //省略...
}
~~~

- EmpService

~~~java
public interface EmpService {

    /**
     * 根据ID查询员工
     * @param id
     * @return
     */
    public Emp getById(Integer id);
    
    //省略...
}
~~~

- EmpServiceImpl

~~~java
@Slf4j
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    @Override
    public Emp getById(Integer id) {
        return empMapper.findById(id);
    }
    
    //省略...
}
~~~

- EmpController

~~~java
@Slf4j
@RestController
@RequestMapping("/emps")
public class EmpController {

    @Autowired
    private EmpService empService;

    //根据id查询
    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id){
        Emp emp = empService.getById(id);
        return Result.success(emp);
    }
    
    //省略...
}
~~~



3.1.4 postman测试

![image-20221230170926513](./assets/image-20221230170926513.png)

# 151.修改员工

<img src="./assets/image-20220904220006578.png" style="zoom:67%;" />

> 当用户修改完数据之后，点击保存按钮，就需要将数据提交到服务端，然后服务端需要将修改后的数据更新到数据库中。 

3.2.1 接口文档

- 基本信息

  ~~~
  请求路径：/emps
  
  请求方式：PUT
  
  接口描述：该接口用于修改员工的数据信息
  ~~~

- 请求参数

  参数格式：application/json

  参数说明：

  | 名称      | 类型   | 是否必须 | 备注                                                         |
  | --------- | ------ | -------- | ------------------------------------------------------------ |
  | id        | number | 必须     | id                                                           |
  | username  | string | 必须     | 用户名                                                       |
  | name      | string | 必须     | 姓名                                                         |
  | gender    | number | 必须     | 性别, 说明: 1 男, 2 女                                       |
  | image     | string | 非必须   | 图像                                                         |
  | deptId    | number | 非必须   | 部门id                                                       |
  | entrydate | string | 非必须   | 入职日期                                                     |
  | job       | number | 非必须   | 职位, 说明: 1 班主任,2 讲师, 3 学工主管, 4 教研主管, 5 咨询师 |

  请求数据样例：

  ~~~json
  {
    "id": 1,
    "image": "https://web-framework.oss-cn-hangzhou.aliyuncs.com/2022-09-03-07-37-38222.jpg",
    "username": "linpingzhi",
    "name": "林平之",
    "gender": 1,
    "job": 1,
    "entrydate": "2022-09-18",
    "deptId": 1
  }
  ~~~

- 响应数据

  参数格式：application/json

  参数说明：

  | 参数名 | 类型   | 是否必须 | 备注                           |
  | ------ | ------ | -------- | ------------------------------ |
  | code   | number | 必须     | 响应码，1 代表成功，0 代表失败 |
  | msg    | string | 非必须   | 提示信息                       |
  | data   | object | 非必须   | 返回的数据                     |

  响应数据样例：

  ~~~json
  {
      "code":1,
      "msg":"success",
      "data":null
  }
  ~~~



3.2.2 实现思路

![image-20221230171342318](./assets/image-20221230171342318.png)



3.2.3 代码实现

- EmpMapper

~~~java
@Mapper
public interface EmpMapper {
    //修改员工信息
    public void update(Emp emp);
    
    //省略...
}
~~~

- EmpMapper.xml

~~~xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="com.itheima.mapper.EmpMapper">

    <!--更新员工信息-->
    <update id="update">
        update emp
        <set>
            <if test="username != null and username != ''">
                username = #{username},
            </if>
            <if test="password != null and password != ''">
                password = #{password},
            </if>
            <if test="name != null and name != ''">
                name = #{name},
            </if>
            <if test="gender != null">
                gender = #{gender},
            </if>
            <if test="image != null and image != ''">
                image = #{image},
            </if>
            <if test="job != null">
                job = #{job},
            </if>
            <if test="entrydate != null">
                entrydate = #{entrydate},
            </if>
            <if test="deptId != null">
                dept_id = #{deptId},
            </if>
            <if test="updateTime != null">
                update_time = #{updateTime}
            </if>
        </set>
        where id = #{id}
    </update>

    <!-- 省略... -->
   
</mapper>
~~~

- EmpService

~~~java
public interface EmpService {
    /**
     * 更新员工
     * @param emp
     */
    public void update(Emp emp);
   
    //省略...
}
~~~

- EmpServiceImpl

~~~java
@Slf4j
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    @Override
    public void update(Emp emp) {
        emp.setUpdateTime(LocalDateTime.now()); //更新修改时间为当前时间
        
        empMapper.update(emp);
    }
    
    //省略...
}
~~~

- EmpController

~~~java
@Slf4j
@RestController
@RequestMapping("/emps")
public class EmpController {

    @Autowired
    private EmpService empService;

    //修改员工
    @PutMapping
    public Result update(@RequestBody Emp emp){
        empService.update(emp);
        return Result.success();
    }
    
    //省略...
}
~~~



3.2.4 postman测试

![image-20220904221941144](O:/BaiduSyncdisk/other/课/黑马/JAVAWeb/day11-SpringBootWeb案例/讲义/assets/image-20220904221941144.png) 



3.2.5 前后端联调测试

![image-20220904222028501](O:/BaiduSyncdisk/other/课/黑马/JAVAWeb/day11-SpringBootWeb案例/讲义/assets/image-20220904222028501.png) 

# 153. 配置文件

员工管理的增删改查功能我们已开发完成，但在我们所开发的程序中还一些小问题，下面我们就来分析一下当前案例中存在的问题以及如何优化解决。

4.1 参数配置化

<img src="./assets/image-20221231085558457.png" alt="image-20221231085558457" style="zoom: 80%;" />

在我们之前编写的程序中进行文件上传时，需要调用AliOSSUtils工具类，将文件上传到阿里云OSS对象存储服务当中。而在调用工具类进行文件上传时，需要一些参数：

- endpoint       //阿里云OSS域名
- accessKeyID    //用户身份ID
- accessKeySecret   //用户密钥
- bucketName      //存储空间的名字



关于以上的这些阿里云相关配置信息，我们是直接写死在java代码中了(硬编码)，如果我们在做项目时每涉及到一个第三方技术服务，就将其参数硬编码，那么在Java程序中会存在两个问题：

1. 如果这些参数发生变化了，就必须在源程序代码中改动这些参数，然后需要重新进行代码的编译，将Java代码编译成class字节码文件再重新运行程序。（比较繁琐）
2. 如果我们开发的是一个真实的企业级项目， Java类可能会有很多，如果将这些参数分散的定义在各个Java类当中，我们要修改一个参数值，我们就需要在众多的Java代码当中来定位到对应的位置，再来修改参数，修改完毕之后再重新编译再运行。（参数配置过于分散，是不方便集中的管理和维护）



为了解决以上分析的问题，我们可以将参数配置在配置文件中。如下：

> 由于properties中的信息本身就是一个字符串，所以并不需要加引号
>
> 最后的分号也不需要
>
> 等号两边的空格也不需要

~~~properties
#自定义的阿里云OSS配置信息
aliyun.oss.endpoint=https://oss-cn-hangzhou.aliyuncs.com
aliyun.oss.accessKeyId=LTAI4GCH1vX6DKqJWxd6nEuW
aliyun.oss.accessKeySecret=yBshYweHOpqDuhCArrVHwIiBKpyqSL
aliyun.oss.bucketName=web-tlias
~~~



在将阿里云OSS配置参数交给properties配置文件来管理之后，我们的AliOSSUtils工具类就变为以下形式：

~~~java
@Component
public class AliOSSUtils {
    /*以下4个参数没有指定值（默认值：null）*/
    private String endpoint;
    private String accessKeyId;
    private String accessKeySecret;
    private String bucketName;

    //省略其他代码...
}
~~~

> 而此时如果直接调用AliOSSUtils类当中的upload方法进行文件上传时，这4项参数全部为null，原因是因为并没有给它赋值。
>
> 此时我们是不是需要将配置文件当中所配置的属性值读取出来，并分别赋值给AliOSSUtils工具类当中的各个属性呢？那应该怎么做呢？



因为application.properties是springboot项目默认的配置文件，所以springboot程序在启动时会默认读取application.properties配置文件，而我们可以使用一个现成的注解：@Value，获取配置文件中的数据。

@Value 注解通常用于外部配置的属性注入，具体用法为： @Value("${配置文件中的key}")//注意有引号

~~~java
@Component
public class AliOSSUtils {

    @Value("${aliyun.oss.endpoint}")
    private String endpoint;
    
    @Value("${aliyun.oss.accessKeyId}")
    private String accessKeyId;
    
    @Value("${aliyun.oss.accessKeySecret}")
    private String accessKeySecret;
    
    @Value("${aliyun.oss.bucketName}")
    private String bucketName;
 	
 	//省略其他代码...
 }   
~~~

![image-20230102173905913](./assets/image-20230102173905913.png)

使用postman测试：

![image-20230102175353270](./assets/image-20230102175353270.png)

# 154.yml配置文件

前面我们一直使用springboot项目创建完毕后自带的application.properties进行属性的配置，那其实呢，在springboot项目当中是支持多种配置方式的，除了支持properties配置文件以外，还支持另外一种类型的配置文件，就是我们接下来要讲解的yml格式的配置文件。

- application.properties

  > 修改内嵌的Tomcat端口号

  ```properties
  server.port=8080
  server.address=127.0.0.1
  ```

- application.yml 

  ```yml
  server:
    port: 8080
    address: 127.0.0.1
  ```

- application.yaml 

  ```yml
  server:
    port: 8080
    address: 127.0.0.1
  ```


> yml 格式的配置文件，后缀名有两种：
>
> - yml （推荐）
> - yaml

常见配置文件格式对比：

![image-20230102181215809](./assets/image-20230102181215809.png)

我们可以看到配置同样的数据信息，yml格式的数据有以下特点：

- 容易阅读
- 容易与脚本语言交互
- 以数据为核心，重数据轻格式



基本语法：

- 大小写敏感
- 数值前边必须有空格，作为分隔符
- 使用缩进表示层级关系，缩进时，不允许使用Tab键，只能用空格（idea中会自动将Tab转换为空格）
- 缩进的空格数目不重要，只要相同层级的元素左侧对齐即可
- `#`表示注释，从这个字符一直到行尾，都会被解析器忽略

![image-20230103084645450](./assets/image-20230103084645450.png)



了解完yml格式配置文件的基本语法之后，接下来我们再来看下yml文件中常见的数据格式。在这里我们主要介绍最为常见的两类：

1. 定义对象或Map集合
2. 定义数组、list或set集合

对象/Map集合

```yml
user:
  name: zhangsan
  age: 18
  password: 123456
```

数组/List/Set集合

```yml
hobby: 
  - java
  - game
  - sport
```



熟悉完了yml文件的基本语法后，我们修改下之前案例中使用的配置文件，变更为application.yml配置方式：

1. 修改application.properties名字为：`_application.properties`（名字随便更换，只要加载不到即可）
2. 创建新的配置文件： `application.yml`

原有application.properties文件：

![image-20230103202630793](./assets/image-20230103202630793.png)

新建的application.yml文件：

~~~yaml
spring:
  datasource:
    driver-class-name: com.mysql.cj.jdbc.Driver
    url: jdbc:mysql://localhost:3306/tlias
    username: root
    password: 1234
  servlet:
    multipart:
      max-file-size: 10MB
      max-request-size: 100MB
      
mybatis:
  configuration:
    log-impl: org.apache.ibatis.logging.stdout.StdOutImpl
    map-underscore-to-camel-case: true
	
aliyun:
  oss:
    endpoint: https://oss-cn-hangzhou.aliyuncs.com
    accessKeyId: LTAI4GCH1vX6DKqJWxd6nEuW
    accessKeySecret: yBshYweHOpqDuhCArrVHwIiBKpyqSL
    bucketName: web-397
~~~

# 155.@ConfigurationProperties

讲解完了yml配置文件之后，最后再来介绍一个注解`@ConfigurationProperties`。在介绍注解之前，我们先来看一个场景，分析下代码当中可能存在的问题：

![image-20230103202919756](./assets/image-20230103202919756.png)

我们在application.properties或者application.yml中配置了阿里云OSS的四项参数之后，如果java程序中需要这四项参数数据，我们直接通过@Value注解来进行注入。这种方式本身没有什么问题问题，但是如果说需要注入的属性较多(例：需要20多个参数数据)，我们写起来就会比较繁琐。

那么有没有一种方式可以简化这些配置参数的注入呢？答案是肯定有，在Spring中给我们提供了一种简化方式，可以直接将配置文件中配置项的值自动的注入到对象的属性中。



Spring提供的简化方式套路：

1. 需要创建一个实现类，且实体类中的属性名和配置文件当中key的名字必须要一致

   > 比如：配置文件当中叫endpoints，实体类当中的属性也得叫endpoints，另外实体类当中的属性还需要提供 getter / setter方法，即加上@Data

2. 需要将实体类交给Spring的IOC容器管理，成为IOC容器当中的bean对象

3. 在实体类上添加`@ConfigurationProperties`注解，并通过perfix属性来指定配置参数项的前缀

![image-20230103210827003](./assets/image-20230103210827003.png)



实体类：AliOSSProperties

~~~java
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/*阿里云OSS相关配置*/
@Data
@Component
@ConfigurationProperties(prefix = "aliyun.oss")
public class AliOSSProperties {
    //区域
    private String endpoint;
    //身份ID
    private String accessKeyId ;
    //身份密钥
    private String accessKeySecret ;
    //存储空间
    private String bucketName;
}
~~~



AliOSSUtils工具类：

~~~java
import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

@Component //当前类对象由Spring创建和管理
public class AliOSSUtils {

    //注入配置参数实体类对象
    @Autowired
    private AliOSSProperties aliOSSProperties;
   
    
    /**
     * 实现上传图片到OSS
     */
    public String upload(MultipartFile multipartFile) throws IOException {
        // 获取上传的文件的输入流
        InputStream inputStream = multipartFile.getInputStream();

        // 避免文件覆盖
        String originalFilename = multipartFile.getOriginalFilename();
        String fileName = UUID.randomUUID().toString() + originalFilename.substring(originalFilename.lastIndexOf("."));

        //上传文件到 OSS
        OSS ossClient = new OSSClientBuilder().build(aliOSSProperties.getEndpoint(),
                aliOSSProperties.getAccessKeyId(), aliOSSProperties.getAccessKeySecret());
        ossClient.putObject(aliOSSProperties.getBucketName(), fileName, inputStream);

        //文件访问路径
        String url =aliOSSProperties.getEndpoint().split("//")[0] + "//" + aliOSSProperties.getBucketName() + "." + aliOSSProperties.getEndpoint().split("//")[1] + "/" + fileName;

        // 关闭ossClient
        ossClient.shutdown();
        return url;// 把上传到oss的路径返回
    }
}

~~~



在我们添加上注解后，会发现idea窗口上面出现一个红色警告：

![image-20230103212042823](./assets/image-20230103212042823.png) 

这个警告提示是告知我们还需要引入一个依赖：

~~~xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-configuration-processor</artifactId>
</dependency>
~~~

当我们在pom.xml文件当中配置了这项依赖之后，我们重新启动服务，大家就会看到在properties或者是yml配置文件当中，就会提示阿里云 OSS 相关的配置项。所以这项依赖它的作用就是会自动的识别被`@Configuration Properties`注解标识的bean对象。



> 刚才的红色警告，已经变成了一个灰色的提示，提示我们需要重新运行springboot服务
>
> 在提示的时候驼峰命名已经转为了横杠分隔，这里即可使用横杠也可以使用驼峰命名
>
> ![image-20231028131218177](.\assets\image-20231028131218177.png)

@ConfigurationProperties注解我们已经介绍完了，接下来我们就来区分一下@ConfigurationProperties注解以及我们前面所介绍的另外一个@Value注解：

相同点：都是用来注入外部配置的属性的。

不同点：

- @Value注解只能一个一个的进行外部属性的注入。

- @ConfigurationProperties可以批量的将外部的属性配置注入到bean对象的属性中。



如果要注入的属性非常的多，并且还想做到复用，就可以定义这么一个bean对象。通过 configuration properties 批量的将外部的属性配置直接注入到 bin 对象的属性当中。在其他的类当中，我要想获取到注入进来的属性，我直接注入 bean 对象，然后调用 get 方法，就可以获取到对应的属性值了



案例-登录认证

在前面的课程中，我们已经实现了部门管理、员工管理的基本功能，但是大家会发现，我们并没有登录，就直接访问到了Tlias智能学习辅助系统的后台。 这是不安全的，所以我们今天的主题就是登录认证。 最终我们要实现的效果就是用户必须登录之后，才可以访问后台系统中的功能。

![image-20230105085212629](./assets/image-20230105085212629.png)





# 156. 基础登录功能

1.1 需求

![image-20230105085404855](./assets/image-20230105085404855.png)

在登录界面中，我们可以输入用户的用户名以及密码，然后点击 "登录" 按钮就要请求服务器，服务端判断用户输入的用户名或者密码是否正确。如果正确，则返回成功结果，前端跳转至系统首页面。



1.2 接口文档

我们参照接口文档来开发登录功能

- 基本信息

  ~~~
  请求路径：/login
  
  请求方式：POST
  
  接口描述：该接口用于员工登录Tlias智能学习辅助系统，登录完毕后，系统下发JWT令牌。 
  ~~~

- 请求参数

  参数格式：application/json

  参数说明：

  | 名称     | 类型   | 是否必须 | 备注   |
  | -------- | ------ | -------- | ------ |
  | username | string | 必须     | 用户名 |
  | password | string | 必须     | 密码   |

  请求数据样例：

  ~~~json
  {
  	"username": "jinyong",
      "password": "123456"
  }
  ~~~

- 响应数据

  参数格式：application/json

  参数说明：

  | 名称 | 类型   | 是否必须 | 默认值 | 备注                     | 其他信息 |
  | ---- | ------ | -------- | ------ | ------------------------ | -------- |
  | code | number | 必须     |        | 响应码, 1 成功 ; 0  失败 |          |
  | msg  | string | 非必须   |        | 提示信息                 |          |
  | data | string | 必须     |        | 返回的数据 , jwt令牌     |          |

  响应数据样例：

  ~~~json
  {
    "code": 1,
    "msg": "success",
    "data": "eyJhbGciOiJIUzI1NiJ9.eyJuYW1lIjoi6YeR5bq4IiwiaWQiOjEsInVzZXJuYW1lIjoiamlueW9uZyIsImV4cCI6MTY2MjIwNzA0OH0.KkUc_CXJZJ8Dd063eImx4H9Ojfrr6XMJ-yVzaWCVZCo"
  }
  ~~~



1.3 思路分析

![image-20230105175310401](./assets/image-20230105175310401.png)

登录服务端的核心逻辑就是：接收前端请求传递的用户名和密码 ，然后再根据用户名和密码查询用户信息，如果用户信息存在，则说明用户输入的用户名和密码正确。如果查询到的用户不存在，则说明用户输入的用户名和密码错误。



1.4 功能开发

**LoginController**

~~~java
@RestController
public class LoginController {

    @Autowired
    private EmpService empService;

    @PostMapping("/login")
    public Result login(@RequestBody Emp emp){
        Emp e = empService.login(emp);
	    return  e != null ? Result.success():Result.error("用户名或密码错误");
    }
}
~~~

**EmpService**

~~~java
public interface EmpService {

    /**
     * 用户登录
     * @param emp
     * @return
     */
    public Emp login(Emp emp);

    //省略其他代码...
}
~~~

**EmpServiceImpl**

~~~java
@Slf4j
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    @Override
    public Emp login(Emp emp) {
        //调用dao层功能：登录
        Emp loginEmp = empMapper.getByUsernameAndPassword(emp);

        //返回查询结果给Controller
        return loginEmp;
    }   
    
    //省略其他代码...
}
~~~

**EmpMapper**

> 这里注意，不建议使用login这个方法，因为login是登录，是业务方法，而mapper接口是持久层，是用来操作数据库的，所以方法名可以使用getByUsernameAndPassword

~~~java
@Mapper
public interface EmpMapper {

    @Select("select id, username, password, name, gender, image, job, entrydate, dept_id, create_time, update_time " +
            "from emp " +
            "where username=#{username} and password =#{password}")
    public Emp getByUsernameAndPassword(Emp emp);
    
    //省略其他代码...
}
~~~



1.5 测试

功能开发完毕后，我们就可以启动服务，打开postman进行测试了。 

发起POST请求，访问：http://localhost:8080/login

![image-20220907132229245](./assets/image-20220907132229245.png) 

postman测试通过了，那接下来，我们就可以结合着前端工程进行联调测试。

先退出系统，进入到登录页面：

![image-20230105193104848](./assets/image-20230105193104848.png)

在登录页面输入账户密码：

![image-20230105085212629](./assets/image-20230105085212629.png)

登录成功之后进入到后台管理系统页面：

![image-20230105192918098](./assets/image-20230105192918098.png)

# 157. 登录校验

2.1 问题分析

我们已经完成了基础登录功能的开发与测试，在我们登录成功后就可以进入到后台管理系统中进行数据的操作。

但是当我们在浏览器中新的页面上输入地址：`http://localhost:9528/#/system/dept`，发现没有登录仍然可以进入到后端管理系统页面。

![image-20220907133329021](./assets/image-20220907133329021.png)



而真正的登录功能应该是：登陆后才能访问后端系统页面，不登陆则跳转登陆页面进行登陆。

为什么会出现这个问题？其实原因很简单，就是因为针对于我们当前所开发的部门管理、员工管理以及文件上传等相关接口来说，我们在服务器端并没有做任何的判断，没有去判断用户是否登录了。所以无论用户是否登录，都可以访问部门管理以及员工管理的相关数据。所以我们目前所开发的登录功能，它只是徒有其表。而我们要想解决这个问题，我们就需要完成一步非常重要的操作：登录校验。

![image-20230105180811717](./assets/image-20230105180811717.png)



什么是登录校验？

- 所谓登录校验，指的是我们在服务器端接收到浏览器发送过来的请求之后，首先我们要对请求进行校验。先要校验一下用户登录了没有，如果用户已经登录了，就直接执行对应的业务操作就可以了；如果用户没有登录，此时就不允许他执行相关的业务操作，直接给前端响应一个错误的结果，最终跳转到登录页面，要求他登录成功之后，再来访问对应的数据。



了解完什么是登录校验之后，接下来我们分析一下登录校验大概的实现思路。



首先我们在宏观上先有一个认知：

前面在讲解HTTP协议的时候，我们提到HTTP协议是无状态协议。什么又是无状态的协议？

所谓无状态，指的是每一次请求都是独立的，下一次请求并不会携带上一次请求的数据。而浏览器与服务器之间进行交互，基于HTTP协议也就意味着现在我们通过浏览器来访问了登陆这个接口，实现了登陆的操作，接下来我们在执行其他业务操作时，服务器也并不知道这个员工到底登陆了没有。因为HTTP协议是无状态的，两次请求之间是独立的，所以是无法判断这个员工到底登陆了没有。



![image-20230105194710533](./assets/image-20230105194710533.png)

那应该怎么来实现登录校验的操作呢？具体的实现思路可以分为两部分：

1. 在员工登录成功后，需要将用户登录成功的信息存起来，记录用户已经登录成功的标记。
2. 在浏览器发起请求时，需要在服务端进行统一拦截，拦截后进行登录校验。

> 想要判断员工是否已经登录，我们需要在员工登录成功之后，存储一个登录成功的标记，接下来在每一个接口方法执行之前，先做一个条件判断，判断一下这个员工到底登录了没有。如果是登录了，就可以执行正常的业务操作，如果没有登录，会直接给前端返回一个错误的信息，前端拿到这个错误信息之后会自动的跳转到登录页面。
>
> 我们程序中所开发的查询功能、删除功能、添加功能、修改功能，都需要使用以上套路进行登录校验。此时就会出现：相同代码逻辑，每个功能都需要编写，就会造成代码非常繁琐。
>
> 为了简化这块操作，我们可以使用一种技术：统一拦截技术。
>
> 通过统一拦截的技术，我们可以来拦截浏览器发送过来的所有的请求，拦截到这个请求之后，就可以通过请求来获取之前所存入的登录标记，在获取到登录标记且标记为登录成功，就说明员工已经登录了。如果已经登录，我们就直接放行(意思就是可以访问正常的业务接口了)。

​    **登录标记**

用户登录成功之后，每一次请求中，都可以获取到该标记。



我们要完成以上操作，会涉及到web开发中的两个技术：

1. 会话技术
2. 统一拦截技术



而统一拦截技术现实方案也有两种：

1. Servlet规范中的Filter过滤器
2. Spring提供的interceptor拦截器

下面我们先学习会话技术，然后再学习统一拦截技术。

# 158.会话技术

介绍了登录校验的大概思路之后，我们先来学习下会话技术。

2.2.1 会话技术介绍

什么是会话？

- 在我们日常生活当中，会话指的就是谈话、交谈。

- 在web开发当中，会话指的就是浏览器与服务器之间的一次连接，我们就称为一次会话。

  > 在用户打开浏览器第一次访问服务器的时候，这个会话就建立了，直到有任何一方断开连接，此时会话就结束了。在一次会话当中，是可以包含多次请求和响应的。
  >
  > 比如：打开了浏览器来访问web服务器上的资源（浏览器不能关闭、服务器不能断开）
  >
  > - 第1次：访问的是登录的接口，完成登录操作
  > - 第2次：访问的是部门管理接口，查询所有部门数据
  > - 第3次：访问的是员工管理接口，查询员工数据
  >
  > 只要浏览器和服务器都没有关闭，以上3次请求都属于一次会话当中完成的。

![image-20230105203827355](./assets/image-20230105203827355.png)

需要注意的是：会话是和浏览器关联的，当有三个浏览器客户端和服务器建立了连接时，就会有三个会话。同一个浏览器在未关闭之前请求了多次服务器，这多次请求是属于同一个会话。比如：1、2、3这三个请求都是属于同一个会话。当我们关闭浏览器之后，这次会话就结束了。而如果我们是直接把web服务器关了，那么所有的会话就都结束了。



知道了会话的概念了，接下来我们再来了解下会话跟踪。

会话跟踪：一种维护浏览器状态的方法，服务器需要识别多次请求是否来自于同一浏览器，以便在同一次会话的多次请求间共享数据。

> 服务器会接收很多的请求，但是服务器是需要识别出这些请求是不是同一个浏览器发出来的。比如：1和2这两个请求是不是同一个浏览器发出来的，3和5这两个请求不是同一个浏览器发出来的。如果是同一个浏览器发出来的，就说明是同一个会话。如果是不同的浏览器发出来的，就说明是不同的会话。而识别多次请求是否来自于同一浏览器的过程，我们就称为会话跟踪。

我们使用会话跟踪技术就是要完成在同一个会话中，多个请求之间进行共享数据。

> 为什么要共享数据呢？
>
> 由于HTTP是无状态协议，在后面请求中怎么拿到前一次请求生成的数据呢？此时就需要在一次会话的多次请求之间进行数据共享



会话跟踪技术有两种：

1. Cookie（客户端会话跟踪技术）
   - 数据存储在客户端浏览器当中
2. Session（服务端会话跟踪技术）
   - 数据存储在储在服务端
3. 令牌技术

# 159. 会话跟踪方案

上面我们介绍了什么是会话，什么是会话跟踪，并且也提到了会话跟踪 3 种常见的技术方案。接下来，我们就来对比一下这 3 种会话跟踪的技术方案，来看一下具体的实现思路，以及它们之间的优缺点。

# 方案一  Cookie

cookie 是客户端会话跟踪技术，它是存储在客户端浏览器的，我们使用 cookie 来跟踪会话，我们就可以在浏览器第一次发起请求来请求服务器的时候，我们在服务器端来设置一个cookie。

比如第一次请求了登录接口，登录接口执行完成之后，我们就可以设置一个cookie，在 cookie 当中我们就可以来存储用户相关的一些数据信息。比如我可以在 cookie 当中来存储当前登录用户的用户名，用户的ID。

服务器端在给客户端在响应数据的时候，会**自动**的将 cookie 响应给浏览器，浏览器接收到响应回来的 cookie 之后，会**自动**的将 cookie 的值存储在浏览器本地。接下来在后续的每一次请求当中，都会将浏览器本地所存储的 cookie **自动**地携带到服务端。

![image-20230112101901417](./assets/image-20230112101901417.png) 

接下来在服务端我们就可以获取到 cookie 的值。我们可以去判断一下这个 cookie 的值是否存在，如果不存在这个cookie，就说明客户端之前是没有访问登录接口的；如果存在 cookie 的值，就说明客户端之前已经登录完成了。这样我们就可以基于 cookie 在同一次会话的不同请求之间来共享数据。



我刚才在介绍流程的时候，用了 3 个自动：

- 服务器会 **自动** 的将 cookie 响应给浏览器。

- 浏览器接收到响应回来的数据之后，会 **自动** 的将 cookie 存储在浏览器本地。

- 在后续的请求当中，浏览器会 **自动** 的将 cookie 携带到服务器端。

  

**为什么这一切都是自动化进行的？**

是因为 cookie 它是 HTP 协议当中所支持的技术，而各大浏览器厂商都支持了这一标准。在 HTTP 协议官方给我们提供了一个响应头和请求头：

- 响应头 Set-Cookie ：设置Cookie数据的

- 请求头 Cookie：携带Cookie数据的

![image-20230112101804878](./assets/image-20230112101804878.png) 

腾讯云里就维护了http的相关文档

> 请求头：cookie：
> HTTP请求包头包含存储先前通过与所述服务器发送的HTTP cookes Set-Cookie头（name=value，前面的name就是cookie的名称，后面的value就是cookie的值）
>
> 响应头：Set-Cookie：服务器向客户端发送，然后客户端就会获得一个Cookie，之后客户端的每一次请求就会自动的携带着这个Cookie给服务器



**代码测试**

```java
@Slf4j
@RestController
public class SessionController {

    //设置Cookie
    @GetMapping("/c1")
    public Result cookie1(HttpServletResponse response){
        response.addCookie(new Cookie("login_username","itheima")); //设置Cookie/响应Cookie
        return Result.success();
    }
	
    //获取Cookie
    @GetMapping("/c2")
    public Result cookie2(HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            if(cookie.getName().equals("login_username")){
                System.out.println("login_username: "+cookie.getValue()); //输出name为login_username的cookie
            }
        }
        return Result.success();
    }
}    
```



A. 访问c1接口，设置Cookie，http://localhost:8080/c1

![image-20230112105410076](./assets/image-20230112105410076.png) 

我们可以看到，设置的cookie，通过**响应头Set-Cookie**响应给浏览器，并且浏览器会将Cookie，存储在浏览器本地。

![image-20230112105538131](./assets/image-20230112105538131.png)

查看cookie：

![image-20231028141440463](.\assets\image-20231028141440463.png) 



B. 访问c2接口 http://localhost:8080/c2，此时浏览器会自动的将Cookie携带到服务端，是通过**请求头Cookie**，携带的。

![image-20230112105658486](./assets/image-20230112105658486.png) 





**优缺点**

- 优点：HTTP协议中支持的技术（像Set-Cookie 响应头的解析以及 Cookie 请求头数据的携带，都是浏览器自动进行的，是无需我们手动操作的）

- 缺点：

  - 移动端APP(Android、IOS)中无法使用Cookie

  - 不安全，用户可以自己禁用Cookie

    在浏览器里设置cookie：

    ![image-20231028141745572](.\assets\image-20231028141745572.png)

    如果点击了这个选项，cookie就被禁用了

    ![image-20231028141813104](.\assets\image-20231028141813104.png)

  - Cookie不能跨域

> 跨域介绍：
>
> ​	 <img src="./assets/image-20230112103840467.png" alt="image-20230112103840467" style="zoom:80%;" /> 
>
> - 现在的项目，大部分都是前后端分离的，前后端最终也会分开部署，前端部署在服务器 192.168.150.200 上，端口 80，后端部署在 192.168.150.100上，端口 8080
> - 我们打开浏览器直接访问前端工程，访问url：http://192.168.150.200/login.html
> - 然后在该页面发起请求到服务端，而服务端所在地址不再是localhost，而是服务器的IP地址192.168.150.100，假设访问接口地址为：http://192.168.150.100:8080/login
> - 那此时就存在跨域操作了，因为我们是在 http://192.168.150.200/login.html 这个页面上访问了http://192.168.150.100:8080/login 接口
> - 此时如果服务器设置了一个Cookie，这个Cookie是不能使用的，因为Cookie无法跨域
>
> 
>
> 区分跨域的维度：
>
> - 协议
> - IP/协议
> - 端口
>
> 只要上述的三个维度有任何一个维度不同，那就是跨域操作
>
> 
>
> 举例：
>
> ​	http://192.168.150.200/login.html ----------> https://192.168.150.200/login   		[协议不同，跨域]
>
> ​	http://192.168.150.200/login.html ----------> http://192.168.150.100/login     		[IP不同，跨域]
>
> ​	http://192.168.150.200/login.html ----------> http://192.168.150.200:8080/login   [端口不同，跨域]
>
> ​    http://192.168.150.200/login.html ----------> http://192.168.150.200/login    		 [不跨域]   



# 160.方案二 - Session

前面介绍的时候，我们提到Session，它是服务器端会话跟踪技术，所以它是存储在服务器端的。而 Session 的底层其实就是基于我们刚才所介绍的 Cookie 来实现的。

- 获取Session

  ![image-20230112105938545](./assets/image-20230112105938545.png) 

  如果我们现在要基于 Session 来进行会话跟踪，浏览器在第一次请求服务器的时候，我们就可以直接在服务器当中来获取到会话对象Session。如果是第一次请求Session ，会话对象是不存在的，这个时候服务器会自动的创建一个会话对象Session 。而每一个会话对象Session ，它都有一个ID（示意图中Session后面括号中的1，就表示ID），我们称之为 Session 的ID。

- 响应Cookie (JSESSIONID)

  ![image-20230112110441075](./assets/image-20230112110441075.png) 

  接下来，服务器端在给浏览器响应数据的时候，它会将 Session 的 ID 通过 Cookie 响应给浏览器。其实在响应头当中增加了一个 Set-Cookie 响应头。这个  Set-Cookie  响应头对应的值是不是cookie？ cookie 的名字是固定的 JSESSIONID 代表的服务器端会话对象 Session 的 ID。浏览器会自动识别这个响应头，然后自动将Cookie存储在浏览器本地。

- 查找Session

  ![image-20230112101943835](./assets/image-20230112101943835.png) 

  接下来，在后续的每一次请求当中，都会将 Cookie 的数据获取出来，并且携带到服务端。接下来服务器拿到JSESSIONID这个 Cookie 的值，也就是 Session 的ID。拿到 ID 之后，就会从众多的 Session 当中来找到当前请求对应的会话对象Session。



## 代码示例：

Demo03Servlet.java

~~~java
public class Demo03Servlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取session，如果获取不到，则创建一个新的
        HttpSession session = request.getSession();
        System.out.println("session ID：" + session.getId());
    }
}
~~~

**第一次发送请求给服务器时**，服务器获取session，获取不到，则创建新的，然后响应给客户端：

![image-20240304214229860](assets/image-20240304214229860.png)

搜索这个SessionId，在请求头里是找不到这个SessionId的，唯一的SessionId就是服务器刚刚响应回来的JSESSIONID

![image-20240304214546384](assets/image-20240304214546384.png)

**发送第二次请求给服务器时**，会把sessionId带给服务器，那么服务器就能获取到sessionId，服务器就能判断这次请求和上次请求是同一个客户端，从而能够区分开客户端。

使用断点调试时，获取到的SessionId还是和第一次请求是一样的，说明它并没有重新创建！并且它有一个属性：isNew，这里为false，说明不是新的。

![image-20240304215001046](assets/image-20240304215001046.png)

搜索到的唯一SessionId已经到了请求头里了

![image-20240304214718091](assets/image-20240304214718091.png)



这样我们是不是就可以通过 Session 会话对象在同一次会话的多次请求之间来共享数据了？好，这就是基于 Session 进行会话跟踪的流程。



**代码测试**

```java
@Slf4j
@RestController
public class SessionController {

    @GetMapping("/s1")
    //获取session对象，直接在controller中声明一个session的参数，这个HttpSession指的就是会话对象session，此时服务区会判断，当前这次请求对应的会话session到底存在不存在，如果不存在，它就会创建一个新的session，如果存在，它会获取到当前请求对应的session，拿到session之后输出日志
    public Result session1(HttpSession session){
        log.info("HttpSession-s1: {}", session.hashCode());

        //往对象会话中来存值
        session.setAttribute("loginUser", "tom"); //往session中存储数据
        return Result.success();
    }

    @GetMapping("/s2")
    public Result session2(HttpServletRequest request){
        // 获取当前会话请求对应的对象，没有则创建一个新的会话
        HttpSession session = request.getSession();
        log.info("HttpSession-s2: {}", session.hashCode());

        Object loginUser = session.getAttribute("loginUser"); //从session中获取数据
        log.info("loginUser: {}", loginUser);
        return Result.success(loginUser);
    }
}
```



A. 访问 s1 接口，http://localhost:8080/s1

![image-20230112111004447](./assets/image-20230112111004447.png) 

请求完成之后，在响应头中，就会看到有一个Set-Cookie的响应头，里面响应回来了一个Cookie，就是JSESSIONID，这个就是服务端会话对象 Session 的ID。

并且将cookie也储存起来了

![image-20231028143839865](.\assets\image-20231028143839865.png)



B. 访问 s2 接口，http://localhost:8080/s2

![image-20230112111137207](./assets/image-20230112111137207.png) 

接下来，在后续的每次请求时，都会将Cookie的值，携带到服务端，那服务端呢，接收到Cookie之后，会自动的根据JSESSIONID的值，找到对应的会话对象Session。



那经过这两步测试，大家也会看到，在控制台中输出如下日志：

![image-20230112111328117](./assets/image-20230112111328117.png) 

两次请求，获取到的Session会话对象的hashcode是一样的，就说明是同一个会话对象。而且，第一次请求时，往Session会话对象中存储的值，第二次请求时，也获取到了。 那这样，我们就可以通过Session会话对象，在同一个会话的多次请求之间来进行数据共享了。



**优缺点**

- 优点：Session是存储在服务端的（服务器端是普通人获取不到的），安全
- 缺点：
  - 服务器集群环境下无法直接使用Session
  - 移动端APP(Android、IOS)中无法使用Cookie
  - 用户可以自己禁用Cookie
  - Cookie不能跨域

> PS：Session 底层是基于Cookie实现的会话跟踪，如果Cookie不可用，则该方案，也就失效了。



> 服务器集群环境为何无法使用Session？
>
> ​	<img src="./assets/image-20230112112557480.png" alt="image-20230112112557480" style="zoom:67%;" /> 
>
> - 首先第一点，我们现在所开发的项目，一般都不会只部署在一台服务器上，因为一台服务器会存在一个很大的问题，就是单点故障。所谓单点故障，指的就是一旦这台服务器挂了，整个应用都没法访问了。
>
> ​    ![image-20230112112740131](./assets/image-20230112112740131.png) 
>
> - 所以在现在的企业项目开发当中，最终部署的时候都是以集群的形式来进行部署，也就是同一个项目它会部署多份。比如这个项目我们现在就部署了 3 份。
>
> - 而用户在访问的时候，到底访问这三台其中的哪一台？其实用户在访问的时候，他会访问一台前置的服务器，我们叫负载均衡服务器，我们在后面项目当中会详细讲解。目前大家先有一个印象负载均衡服务器，它的作用就是将前端发起的请求均匀的分发给后面的这三台服务器。
>
>   ![image-20230112113558810](./assets/image-20230112113558810.png) 
>
> - 此时假如我们通过 session 来进行会话跟踪，可能就会存在这样一个问题。用户打开浏览器要进行登录操作，此时会发起登录请求。登录请求到达负载均衡服务器，将这个请求转给了第一台 Tomcat 服务器。
>
>   Tomcat 服务器接收到请求之后，要获取到会话对象session。获取到会话对象 session 之后，要给浏览器响应数据，最终在给浏览器响应数据的时候，就会携带这么一个 cookie 的名字，就是 JSESSIONID ，下一次再请求的时候，是不是又会将 Cookie 携带到服务端？
>
>   好。此时假如又执行了一次查询操作，要查询部门的数据。这次请求到达负载均衡服务器之后，负载均衡服务器将这次请求转给了第二台 Tomcat 服务器，此时他就要到第二台 Tomcat 服务器当中。根据JSESSIONID 也就是对应的 session 的 ID 值，要找对应的 session 会话对象。
>
>   我想请问在第二台服务器当中有没有这个ID的会话对象 Session， 是没有的。此时是不是就出现问题了？我同一个浏览器发起了 2 次请求，结果获取到的不是同一个会话对象，这就是Session这种会话跟踪方案它的缺点，在服务器集群环境下无法直接使用Session。





大家会看到上面这两种传统的会话技术，在现在的企业开发当中是不是会存在很多的问题。 为了解决这些问题，在现在的企业开发当中，基本上都会采用第三种方案，通过令牌技术来进行会话跟踪。接下来我们就来介绍一下令牌技术，来看一下令牌技术又是如何跟踪会话的。



#####  方案三 - 令牌技术

这里我们所提到的令牌，其实它就是一个用户身份的标识，看似很高大上，很神秘，其实本质就是一个字符串。

![image-20230112102022634](./assets/image-20230112102022634.png) 

如果通过令牌技术来跟踪会话，我们就可以在浏览器发起请求。在请求登录接口的时候，如果登录成功，我就可以生成一个令牌，令牌就是用户的合法身份凭证。接下来我在响应数据的时候，我就可以直接将令牌响应给前端。

接下来我们在前端程序当中接收到令牌之后，就需要将这个令牌存储起来。这个存储可以存储在 cookie 当中，也可以存储在其他的存储空间(比如：localStorage)当中。

接下来，在后续的每一次请求当中，都需要将令牌携带到服务端。携带到服务端之后，接下来我们就需要来校验令牌的有效性。如果令牌是有效的，就说明用户已经执行了登录操作，如果令牌是无效的，就说明用户之前并未执行登录操作。

此时，如果是在同一次会话的多次请求之间，我们想共享数据，我们就可以将共享的数据存储在令牌当中就可以了。



**优缺点**

- 优点：
  - 支持PC端、移动端（因为不需要存储在cookie中）
  - 解决集群环境下的认证问题
  - 减轻服务器的存储压力（无需在服务器端存储）
- 缺点：需要自己实现（包括令牌的生成、令牌的传递、令牌的校验）





**针对于这三种方案，现在企业开发当中使用的最多的就是第三种令牌技术进行会话跟踪。而前面的这两种传统的方案，现在企业项目开发当中已经很少使用了。所以在我们的课程当中，我们也将会采用令牌技术来解决案例项目当中的会话跟踪问题。**





# 161.JWT令牌

前面我们介绍了基于令牌技术来实现会话追踪。这里所提到的令牌就是用户身份的标识，其本质就是一个字符串。令牌的形式有很多，我们使用的是功能强大的 JWT令牌。

**介绍**

JWT全称：JSON Web Token  （官网：https://jwt.io/）

- 定义了一种简洁的、自包含的格式，用于在通信双方以json数据格式安全的传输信息。由于数字签名的存在，这些信息是可靠的。

  > 简洁：是指jwt就是一个简单的字符串。可以在请求参数或者是请求头当中直接传递。
  >
  > 自包含：指的是jwt令牌，看似是一个随机的字符串，但是我们是可以根据自身的需求在jwt令牌中存储自定义的数据内容。如：可以直接在jwt令牌中存储用户的相关信息。
  >
  > 简单来讲，jwt就是将原始的json数据格式进行了安全的封装，这样就可以直接基于jwt在通信双方安全的进行信息传输了。



JWT的组成： （JWT令牌由三个部分组成，三个部分之间使用英文的点来分割）

- 第一部分：Header(头）， 记录令牌类型、签名算法等。 例如：{"alg":"HS256"（签名算法为HS256，将来就会根据这段指定的签名算法对JWT令牌进行数字前面）,"type":"JWT"（令牌的类型为JWT）}

- 第二部分：Payload(有效载荷，载荷就是用来装东西的），携带一些自定义信息、默认信息等。 例如：{"id":"1","username":"Tom"、令牌的签发日期，令牌的有效期等}，原始数据依然是JSON类型的数据，也是进行了base64编码

- 第三部分：Signature(签名），防止Token被篡改、确保安全性。将header、payload，并加入指定秘钥，通过指定签名算法计算而来。（并不是64编码）

  >签名的目的就是为了防jwt令牌被篡改，而正是因为jwt令牌最后一个部分数字签名的存在，所以整个jwt 令牌是非常安全可靠的。一旦jwt令牌当中任何一个部分、任何一个字符被篡改了，整个令牌在校验的时候都会失败，所以它是非常安全可靠的。

![image-20230106085442076](./assets/image-20230106085442076.png)

> JWT是如何将原始的JSON格式数据，转变为字符串的呢？
>
> 其实在生成JWT令牌时，会对JSON格式的数据进行一次编码：进行base64编码
>
> Base64：是一种基于64个可打印的字符来表示二进制数据的编码方式（注意不是加密方式）。既然能编码，那也就意味着也能解码。所使用的64个字符分别是A到Z、a到z、 0- 9，一个加号，一个斜杠，加起来就是64个字符。任何数据经过base64编码之后，最终就会通过这64个字符来表示。当然还有一个符号，那就是等号。等号它是一个补位的符号
>
> 需要注意的是Base64是编码方式，而不是加密方式。



![image-20230112114319773](./assets/image-20230112114319773.png) 

JWT令牌最典型的应用场景就是登录认证：

1. 在浏览器发起请求来执行登录操作，此时会访问登录的接口，如果登录成功之后，我们需要生成一个jwt令牌，将生成的 jwt令牌返回给前端。
2. 前端拿到jwt令牌之后，会将jwt令牌存储起来。在后续的每一次请求中都会将jwt令牌携带到服务端。
3. 服务端统一拦截请求之后，先来判断一下这次请求有没有把令牌带过来，如果没有带过来，直接拒绝访问，如果带过来了，还要校验一下令牌是否是有效。如果有效，就直接放行进行请求的处理。



在JWT登录认证的场景中我们发现，整个流程当中涉及到两步操作：

1. 在登录成功之后，要生成令牌。
2. 每一次请求当中，要接收令牌并对令牌进行校验。

稍后我们再来学习如何来生成jwt令牌，以及如何来校验jwt令牌。

# 162.生成和校验

简单介绍了JWT令牌以及JWT令牌的组成之后，接下来我们就来学习基于Java代码如何生成和校验JWT令牌。

首先我们先来实现JWT令牌的生成。要想使用JWT令牌，需要先引入JWT的依赖：

~~~xml
<!-- JWT依赖-->
<dependency>
    <groupId>io.jsonwebtoken</groupId>
    <artifactId>jjwt</artifactId>
    <version>0.9.1</version>
</dependency>
~~~

> 在引入完JWT来赖后，就可以调用工具包中提供的API来完成JWT令牌的生成和校验
>
> 工具类：Jwts
>
> 官网的这个地方就指定了签名算法大概有哪些
>
> ![image-20231028145751915](.\assets\image-20231028145751915.png)



生成JWT代码实现：

~~~java
@Test
public void genJwt(){
    Map<String,Object> claims = new HashMap<>();
    claims.put("id",1);
    claims.put("username","Tom");
    
    String jwt = Jwts.builder()
        .setClaims(claims) //自定义内容(载荷)，封装到map集合中          
        .signWith(SignatureAlgorithm.HS256, "itheima") //签名算法，后面还需要指定数字签名时的秘钥        
        .setExpiration(new Date(System.currentTimeMillis() + 24*3600*1000)) //有效期，new了一个Date对象后代表当前时间，   
        .compact();//获取到字符串的返回值
    
    System.out.println(jwt);
}
~~~

> 这里运行有个小技巧：注释掉@SpringBootTest，因为这个测试方法和spring环境时无关的，如果不注释掉，它就会加载整个工程文件
>
> ![image-20231028150637952](.\assets\image-20231028150637952.png)

>  使用Base64编码字符串长度至少为43位，位数报错的可以把itheima改成任意的大于等于43位的字符串

运行测试方法：

~~~
eyJhbGciOiJIUzI1NiJ9.eyJpZCI6MSwiZXhwIjoxNjcyNzI5NzMwfQ.fHi0Ub8npbyt71UqLXDdLyipptLgxBUg_mSuGJtXtBk
~~~

输出的结果就是生成的JWT令牌,，通过英文的点分割对三个部分进行分割，我们可以将生成的令牌复制一下，然后打开JWT的官网，将生成的令牌直接放在Encoded位置，此时就会自动的将令牌解析出来。

![image-20230106190950305](./assets/image-20230106190950305.png)

> 第一部分解析出来，看到JSON格式的原始数据，所使用的签名算法为HS256。
>
> 第二个部分是我们自定义的数据，之前我们自定义的数据就是id，还有一个exp代表的是我们所设置的过期时间。
>
> 由于前两个部分是base64编码，所以是可以直接解码出来。但最后一个部分并不是base64编码，是经过签名算法计算出来的，所以最后一个部分是不会解析的。
>
> 我们也可以直接去网上搜索base64解码工具





实现了JWT令牌的生成，下面我们接着使用Java代码来校验JWT令牌(解析生成的令牌)：

~~~java
@Test
public void parseJwt(){
    Claims claims = Jwts.parser()
        .setSigningKey("itheima")//指定签名密钥（必须保证和生成令牌时使用相同的签名密钥）  
	    .parseClaimsJws("eyJhbGciOiJIUzI1NiJ9.eyJpZCI6MSwiZXhwIjoxNjcyNzI5NzMwfQ.fHi0Ub8npbyt71UqLXDdLyipptLgxBUg_mSuGJtXtBk")//JWT令牌时一个字符串，需要用引号引起来
        .getBody();

    System.out.println(claims);
}
~~~

运行测试方法：

~~~
{id=1, exp=1672729730}
~~~

> 令牌解析后，我们可以看到id和过期时间，如果在解析的过程当中没有报错，就说明解析成功了。



下面我们做一个测试：把令牌header中的数字9变为8，运行测试方法后发现报错：

> 原header： eyJhbGciOiJIUzI1NiJ9
>
> 修改为： eyJhbGciOiJIUzI1NiJ8

![image-20230106205045658](./assets/image-20230106205045658.png)

结论：篡改令牌中的任何一个字符，在对令牌进行解析时都会报错，所以JWT令牌是非常安全可靠的。



我们继续测试：修改生成令牌的时指定的过期时间，修改为1分钟

~~~java
@Test
public void genJwt(){
    Map<String,Object> claims = new HashMap<>();
    claims.put(“id”,1);
    claims.put(“username”,“Tom”);
    String jwt = Jwts.builder()
        .setClaims(claims) //自定义内容(载荷)          
        .signWith(SignatureAlgorithm.HS256, "itheima") //签名算法        
        .setExpiration(new Date(System.currentTimeMillis() + 60*1000)) //有效期60秒   
        .compact();
    
    System.out.println(jwt);
    //输出结果：eyJhbGciOiJIUzI1NiJ9.eyJpZCI6MSwiZXhwIjoxNjczMDA5NzU0fQ.RcVIR65AkGiax-ID6FjW60eLFH3tPTKdoK7UtE4A1ro
}

@Test
public void parseJwt(){
    Claims claims = Jwts.parser()
        .setSigningKey("itheima")//指定签名密钥
.parseClaimsJws("eyJhbGciOiJIUzI1NiJ9.eyJpZCI6MSwiZXhwIjoxNjczMDA5NzU0fQ.RcVIR65AkGiax-ID6FjW60eLFH3tPTKdoK7UtE4A1ro")
        .getBody();

    System.out.println(claims);
}
~~~

等待1分钟之后运行测试方法发现也报错了，说明：JWT令牌过期后，令牌就失效了，解析的为非法令牌。

通过以上测试，我们在使用JWT令牌时需要注意：

- JWT校验时使用的签名秘钥，必须和生成JWT令牌时使用的秘钥是配套的。

- 如果JWT令牌解析校验时报错，则说明 JWT令牌被篡改 或 失效了，令牌非法。 

# 163.登录下发令牌

JWT令牌的生成和校验的基本操作我们已经学习完了，接下来我们就需要在案例当中通过JWT令牌技术来跟踪会话。具体的思路我们前面已经分析过了，主要就是两步操作：

1. 生成令牌
   - 在登录成功之后来生成一个JWT令牌，并且把这个令牌直接返回给前端
2. 校验令牌
   - 拦截前端请求，从请求中获取到令牌，对令牌进行解析校验



那我们首先来完成：登录成功之后生成JWT令牌，并且把令牌返回给前端。



JWT令牌怎么返回给前端呢？此时我们就需要再来看一下接口文档当中关于登录接口的描述（主要看响应数据）：

- 响应数据

  参数格式：application/json

  参数说明：

  | 名称 | 类型   | 是否必须 | 默认值 | 备注                     | 其他信息 |
  | ---- | ------ | -------- | ------ | ------------------------ | -------- |
  | code | number | 必须     |        | 响应码, 1 成功 ; 0  失败 |          |
  | msg  | string | 非必须   |        | 提示信息                 |          |
  | data | string | 必须     |        | 返回的数据 , jwt令牌     |          |

  响应数据样例：

  ~~~json
  {
    "code": 1,
    "msg": "success",
    "data": "eyJhbGciOiJIUzI1NiJ9.eyJuYW1lIjoi6YeR5bq4IiwiaWQiOjEsInVzZXJuYW1lIjoiamlueW9uZyIsImV4cCI6MTY2MjIwNzA0OH0.KkUc_CXJZJ8Dd063eImx4H9Ojfrr6XMJ-yVzaWCVZCo"
  }
  ~~~

- 备注说明

  用户登录成功后，系统会自动下发JWT令牌，然后在后续的每次请求中，都需要在请求头header中携带到服务端，请求头的名称为 token ，值为 登录时下发的JWT令牌。

  如果检测到用户未登录，则会返回如下固定错误信息：

  ~~~json
  {
  	"code": 0,
  	"msg": "NOT_LOGIN",
  	"data": null
  }
  ~~~

解读完接口文档中的描述了，目前我们先来完成令牌的生成和令牌的下发，我们只需要生成一个令牌返回给前端就可以了。





**实现步骤：**

1. 引入JWT工具类
   - 在项目工程下创建com.itheima.utils包，并把提供JWT工具类复制到该包下
2. 登录完成后，调用工具类生成JWT令牌并返回



**JWT工具类**

~~~java
public class JwtUtils {

    private static String signKey = "itheima";//签名密钥
    private static Long expire = 43200000L; //有效时间

    /**
     * 生成JWT令牌
     * @param claims JWT第二部分负载 payload 中存储的内容
     * @return
     */
    public static String generateJwt(Map<String, Object> claims){
        String jwt = Jwts.builder()
                .addClaims(claims)//自定义信息（有效载荷）
                .signWith(SignatureAlgorithm.HS256, signKey)//签名算法（头部）
                .setExpiration(new Date(System.currentTimeMillis() + expire))//过期时间
                .compact();
        return jwt;
    }

    /**
     * 解析JWT令牌
     * @param jwt JWT令牌
     * @return JWT第二部分负载 payload 中存储的内容
     */
    public static Claims parseJWT(String jwt){
        Claims claims = Jwts.parser()
                .setSigningKey(signKey)//指定签名密钥
                .parseClaimsJws(jwt)//指定令牌Token
                .getBody();
        return claims;
    }
}

~~~



**登录成功，生成JWT令牌并返回**

~~~java
@RestController
@Slf4j
public class LoginController {
    //依赖业务层对象
    @Autowired
    private EmpService empService;

    @PostMapping("/login")
    public Result login(@RequestBody Emp emp) {
        //调用业务层：登录功能
        Emp loginEmp = empService.login(emp);

        //判断：登录用户是否存在
        if(loginEmp !=null ){
            //自定义信息
            Map<String , Object> claims = new HashMap<>();
            claims.put("id", loginEmp.getId());
            claims.put("username",loginEmp.getUsername());
            claims.put("name",loginEmp.getName());

            //使用JWT工具类，生成身份令牌
            String token = JwtUtils.generateJwt(claims);
            return Result.success(token);
        }
        return Result.error("用户名或密码错误");
    }
}
~~~



重启服务，打开postman测试登录接口：

![image-20230106212805480](./assets/image-20230106212805480.png)

打开浏览器完成前后端联调操作：利用开发者工具，抓取一下网络请求

![image-20230106213419461](./assets/image-20230106213419461.png)

> 登录请求完成后，可以看到JWT令牌已经响应给了前端，此时前端就会将JWT令牌存储在浏览器本地。



服务器响应的JWT令牌存储在本地浏览器哪里了呢？

- 在当前案例中，JWT令牌存储在浏览器的本地存储空间local storage中了。 local storage是浏览器的本地存储，在移动端也是支持的。

![image-20230106213910049](./assets/image-20230106213910049.png)



我们在发起一个查询部门数据的请求，此时我们可以看到在请求头中包含一个token(JWT令牌)，后续的每一次请求当中，都会将这个令牌携带到服务端。

![image-20230106214331443](./assets/image-20230106214331443.png)

# 164. 过滤器Filter

刚才通过浏览器的开发者工具，我们可以看到在后续的请求当中，都会在请求头中携带JWT令牌到服务端，而服务端需要统一拦截所有的请求，从而判断是否携带的有合法的JWT令牌。
那怎么样来统一拦截到所有的请求校验令牌的有效性呢？这里我们会学习两种解决方案：

1. Filter过滤器
2. Interceptor拦截器

我们首先来学习过滤器Filter。



2.4.1 快速入门

什么是Filter？

- Filter表示过滤器，是 JavaWeb三大组件(Servlet、Filter、Listener)之一。
- 过滤器可以把对资源的请求拦截下来，从而实现一些特殊的功能
  - 使用了过滤器之后，要想访问web服务器上的资源，必须先经过滤器，过滤器处理完毕之后，才可以访问对应的资源。
- 过滤器一般完成一些通用的操作，比如：登录校验、统一编码处理、敏感字符处理等。

![image-20230112120955145](./assets/image-20230112120955145.png) 



下面我们通过Filter快速入门程序掌握过滤器的基本使用操作：

- 第1步，定义过滤器 ：1.定义一个类，实现 Filter 接口，并重写其所有方法。
- 第2步，配置过滤器：Filter类上加 @WebFilter 注解，配置拦截资源的路径。引导类上加 @ServletComponentScan 开启Servlet组件支持（因为Filter是JavaWeb三大组件之一，并不是spring提供的，如果想要造SpringBoot中使用三大组件，就必须在启动类上加上注解）。



> 注意是import javax.servlet包下的

> 此时发现Idea默认只给我们选择了doFilter
>
> 原因是因为init初始化destroy销毁这两个方法并不常用，所以在接口当中，针对于这两个方法已经提供了默认实现。所以其实我们可以不用去实现。

> ![image-20231028160346323](.\assets\image-20231028160346323.png)

**定义过滤器**

~~~java
//定义一个类，实现一个标准的Filter过滤器的接口
public class DemoFilter implements Filter {
    @Override //初始化方法, 只调用一次
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init 初始化方法执行了");
    }

    @Override //拦截到请求之后调用, 调用多次
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("Demo 拦截到了请求...放行前逻辑");
        //放行
        chain.doFilter(request,response);
    }

    @Override //销毁方法, 只调用一次
    public void destroy() {
        System.out.println("destroy 销毁方法执行了");
    }
}
~~~

> - init方法：过滤器的初始化方法。在web服务器启动的时候会自动的创建Filter过滤器对象，在创建过滤器对象的时候会自动调用init初始化方法，这个方法只会被调用一次。
>
> - doFilter方法：这个方法是在每一次拦截到请求之后都会被调用，所以这个方法是会被调用多次的，每拦截到一次请求就会调用一次doFilter()方法。
>
> - destroy方法： 是销毁的方法。当我们关闭服务器的时候，它会自动的调用销毁方法destroy，而这个销毁方法也只会被调用一次。



在定义完Filter之后，Filter其实并不会生效，还需要完成Filter的配置，Filter的配置非常简单，只需要在Filter类上添加一个注解：@WebFilter，并指定属性urlPatterns，通过这个属性指定过滤器要拦截哪些请求

~~~java
@WebFilter(urlPatterns = "/*") //配置过滤器要拦截的请求路径（ /* 表示拦截浏览器的所有请求 ）
public class DemoFilter implements Filter {
    @Override //初始化方法, 只调用一次
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init 初始化方法执行了");
    }

    @Override //拦截到请求之后调用, 调用多次
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("Demo 拦截到了请求...放行前逻辑");
        //放行
        chain.doFilter(request,response);
    }

    @Override //销毁方法, 只调用一次
    public void destroy() {
        System.out.println("destroy 销毁方法执行了");
    }
}
~~~

当我们在Filter类上面加了@WebFilter注解之后，接下来我们还需要在启动类上面加上一个注解@ServletComponentScan，通过这个@ServletComponentScan注解来开启SpringBoot项目对于Servlet组件的支持。

~~~java
@ServletComponentScan
@SpringBootApplication
public class TliasWebManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(TliasWebManagementApplication.class, args);
    }

}
~~~



重新启动服务，打开浏览器，执行部门管理的请求，可以看到控制台输出了过滤器中的内容：

![image-20230112121205697](./assets/image-20230112121205697.png) 



> 注意事项：
>
> ​	在过滤器Filter中，如果不执行放行操作，将无法访问后面的资源。 放行操作：chain.doFilter(request, response);



现在我们已完成了Filter过滤器的基本使用，下面我们将学习Filter过滤器在使用过程中的一些细节。





# 165. Filter详解

Filter过滤器的快速入门程序我们已经完成了，接下来我们就要详细的介绍一下过滤器Filter在使用中的一些细节。主要介绍以下3个方面的细节：

1. 过滤器的执行流程
2. 过滤器的拦截路径配置
3. 过滤器链



##### 执行流程

首先我们先来看下过滤器的执行流程：

![image-20230106222559935](./assets/image-20230106222559935.png)



过滤器当中我们拦截到了请求之后，如果希望继续访问后面的web资源，就要执行放行操作，放行就是调用 FilterChain对象当中的doFilter()方法，在调用doFilter()这个方法之前所编写的代码属于放行之前的逻辑。

在放行后访问完 web 资源之后还会回到过滤器当中，回到过滤器之后如有需求还可以执行放行之后的逻辑，放行之后的逻辑我们写在doFilter()这行代码之后。



~~~java
@WebFilter(urlPatterns = "/*") 
public class DemoFilter implements Filter {
    
    @Override //初始化方法, 只调用一次
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init 初始化方法执行了");
    }
    
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        
        System.out.println("DemoFilter   放行前逻辑.....");

        //放行请求
        filterChain.doFilter(servletRequest,servletResponse);

        System.out.println("DemoFilter   放行后逻辑.....");
        
    }

    @Override //销毁方法, 只调用一次
    public void destroy() {
        System.out.println("destroy 销毁方法执行了");
    }
}
~~~

![image-20230106224322625](./assets/image-20230106224322625.png)



##### 拦截路径

执行流程我们搞清楚之后，接下来再来介绍一下过滤器的拦截路径，Filter可以根据需求，配置不同的拦截资源路径：

| 拦截路径     | urlPatterns值 | 含义                               |
| ------------ | ------------- | ---------------------------------- |
| 拦截具体路径 | /login        | 只有访问 /login 路径时，才会被拦截 |
| 目录拦截     | /emps/*       | 访问/emps下的所有资源，都会被拦截  |
| 拦截所有     | /*            | 访问所有资源，都会被拦截           |

下面我们来测试"拦截具体路径"：

~~~java
@WebFilter(urlPatterns = "/login")  //拦截/login具体路径
public class DemoFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("DemoFilter   放行前逻辑.....");

        //放行请求
        filterChain.doFilter(servletRequest,servletResponse);

        System.out.println("DemoFilter   放行后逻辑.....");
    }


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
~~~



测试1：访问部门管理请求，发现过滤器没有拦截请求

![image-20230106225658525](./assets/image-20230106225658525.png)

![image-20230106230332510](./assets/image-20230106230332510.png)



测试2：访问登录请求/login，发现过滤器拦截请求

![image-20230106230520229](./assets/image-20230106230520229.png)





下面我们来测试"目录拦截"：

~~~java
@WebFilter(urlPatterns = "/depts/*") //拦截所有以/depts开头，后面是什么无所谓
public class DemoFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("DemoFilter   放行前逻辑.....");

        //放行请求
        filterChain.doFilter(servletRequest,servletResponse);

        System.out.println("DemoFilter   放行后逻辑.....");
    }


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
~~~



测试1：访问部门管理请求，发现过滤器拦截了请求

![image-20230106231144348](./assets/image-20230106231144348.png)



测试2：访问登录请求/login，发现过滤器没有拦截请求

![image-20230106231220802](./assets/image-20230106231220802.png)



# 166.过滤器链

最后我们在来介绍下过滤器链，什么是过滤器链呢？所谓过滤器链指的是在一个web应用程序当中，可以配置多个过滤器，多个过滤器就形成了一个过滤器链。

![image-20230107084730393](./assets/image-20230107084730393.png)

比如：在我们web服务器当中，定义了两个过滤器，这两个过滤器就形成了一个过滤器链。

而这个链上的过滤器在执行的时候会一个一个的执行，会先执行第一个Filter，放行之后再来执行第二个Filter，如果执行到了最后一个过滤器放行之后，才会访问对应的web资源。

访问完web资源之后，按照我们刚才所介绍的过滤器的执行流程，还会回到过滤器当中来执行过滤器放行后的逻辑，而在执行放行后的逻辑的时候，顺序是反着的。

先要执行过滤器2放行之后的逻辑，再来执行过滤器1放行之后的逻辑，最后在给浏览器响应数据。



以上就是当我们在web应用当中配置了多个过滤器，形成了这样一个过滤器链以及过滤器链的执行顺序。下面我们通过idea来验证下过滤器链。

验证步骤：

1. 在filter包下再来新建一个Filter过滤器类：AbcFilter
2. 在AbcFilter过滤器中编写放行前和放行后逻辑
3. 配置AbcFilter过滤器拦截请求路径为：/* 
4. 重启SpringBoot服务，查看DemoFilter、AbcFilter的执行日志

![image-20230107085552176](./assets/image-20230107085552176.png)

**AbcFilter过滤器**

~~~java
@WebFilter(urlPatterns = "/*")
public class AbcFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("Abc 拦截到了请求... 放行前逻辑");

        //放行
        chain.doFilter(request,response);

        System.out.println("Abc 拦截到了请求... 放行后逻辑");
    }
}
~~~

**DemoFilter过滤器**

~~~java
@WebFilter(urlPatterns = "/*") 
public class DemoFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("DemoFilter   放行前逻辑.....");

        //放行请求
        filterChain.doFilter(servletRequest,servletResponse);

        System.out.println("DemoFilter   放行后逻辑.....");
    }
}
~~~

打开浏览器访问登录接口：

![image-20230107090425999](./assets/image-20230107090425999.png)



通过控制台日志的输出，大家发现AbcFilter先执行DemoFilter后执行，这是为什么呢？

其实是和过滤器的类名有关系。以注解方式配置的Filter过滤器，它的执行优先级是按时过滤器类名的自动排序确定的，类名排名越靠前，优先级越高。

假如我们想让DemoFilter先执行，怎么办呢？答案就是修改类名。



测试：修改AbcFilter类名为XbcFilter，运行程序查看控制台日志

~~~java
@WebFilter(urlPatterns = "/*")
public class XbcFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("Xbc 拦截到了请求...放行前逻辑");

        //放行
        chain.doFilter(request,response);

        System.out.println("Xbc 拦截到了请求...放行后逻辑");
    }
}

~~~

![image-20230107093757050](./assets/image-20230107093757050.png)

到此，关于过滤器的使用细节，我们已经全部介绍完毕了。

# 167. 登录校验-Filter

2.4.3.1 分析

过滤器Filter的快速入门以及使用细节我们已经介绍完了，接下来最后一步，我们需要使用过滤器Filter来完成案例当中的登录校验功能。

![image-20230107095010089](./assets/image-20230107095010089.png)

我们先来回顾下前面分析过的登录校验的基本流程：

- 要进入到后台管理系统，我们必须先完成登录操作，此时就需要访问登录接口login。

- 登录成功之后，我们会在服务端生成一个JWT令牌，并且把JWT令牌返回给前端，前端会将JWT令牌存储下来。
- 在后续的每一次请求当中，都会将JWT令牌携带到服务端，请求到达服务端之后，要想去访问对应的业务功能，此时我们必须先要校验令牌的有效性。
- 对于校验令牌的这一块操作，我们使用登录校验的过滤器，在过滤器当中来校验令牌的有效性。如果令牌是无效的，就响应一个错误的信息，也不会再去放行访问对应的资源了。如果令牌存在，并且它是有效的，此时就会放行去访问对应的web资源，执行相应的业务操作。



大概清楚了在Filter过滤器的实现步骤了，那在正式开发登录校验过滤器之前，我们思考两个问题：

1. 所有的请求，拦截到了之后，都需要校验令牌吗？
   - 答案：**登录请求例外**

2. 拦截到请求后，什么情况下才可以放行，执行业务操作？
   - 答案：**有令牌，且令牌校验通过(合法)；否则都返回未登录错误结果**



2.4.3.2 具体流程

我们要完成登录校验，主要是利用Filter过滤器实现，而Filter过滤器的流程步骤：

![image-20230112122130564](./assets/image-20230112122130564.png) 



基于上面的业务流程，我们分析出具体的操作步骤：

1. 获取请求url
2. 判断请求url中是否包含login，如果包含，说明是登录操作，放行
3. 获取请求头中的令牌（token）
4. 判断令牌是否存在，如果不存在，返回错误结果（未登录）
5. 解析token，如果解析失败，返回错误结果（未登录）
6. 放行



2.4.3.3 代码实现

分析清楚了以上的问题后，我们就参照接口文档来开发登录功能了，登录接口描述如下：



- 基本信息

  ~~~
  请求路径：/login
  
  请求方式：POST
  
  接口描述：该接口用于员工登录Tlias智能学习辅助系统，登录完毕后，系统下发JWT令牌。 
  ~~~

- 请求参数

  参数格式：application/json

  参数说明：

  | 名称     | 类型   | 是否必须 | 备注   |
  | -------- | ------ | -------- | ------ |
  | username | string | 必须     | 用户名 |
  | password | string | 必须     | 密码   |

  请求数据样例：

  ~~~json
  {
  	"username": "jinyong",
      "password": "123456"
  }
  ~~~

- 响应数据

  参数格式：application/json

  参数说明：

  | 名称 | 类型   | 是否必须 | 默认值 | 备注                     | 其他信息 |
  | ---- | ------ | -------- | ------ | ------------------------ | -------- |
  | code | number | 必须     |        | 响应码, 1 成功 ; 0  失败 |          |
  | msg  | string | 非必须   |        | 提示信息                 |          |
  | data | string | 必须     |        | 返回的数据 , jwt令牌     |          |

  响应数据样例：

  ~~~json
  {
    "code": 1,
    "msg": "success",
    "data": "eyJhbGciOiJIUzI1NiJ9.eyJuYW1lIjoi6YeR5bq4IiwiaWQiOjEsInVzZXJuYW1lIjoiamlueW9uZyIsImV4cCI6MTY2MjIwNzA0OH0.KkUc_CXJZJ8Dd063eImx4H9Ojfrr6XMJ-yVzaWCVZCo"
  }
  ~~~

- 备注说明

  用户登录成功后，系统会自动下发JWT令牌，然后在后续的每次请求中，都需要在请求头header中携带到服务端，请求头的名称为 token ，值为 登录时下发的JWT令牌。

  如果检测到用户未登录，则会返回如下固定错误信息：

  ~~~json
  {
  	"code": 0,
  	"msg": "NOT_LOGIN",
  	"data": null
  }
  ~~~



**登录校验过滤器：LoginCheckFilter**

~~~java
@Slf4j
@WebFilter(urlPatterns = "/*") //拦截所有请求
public class LoginCheckFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
        //前置：强制转换为http协议的请求对象、响应对象 （转换原因：要使用子类中特有方法）
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        //1.获取请求url
        String url = request.getRequestURL().toString();
        log.info("请求路径：{}", url); //请求路径：http://localhost:8080/login


        //2.判断请求url中是否包含login，如果包含，说明是登录操作，放行
        if(url.contains("/login")){
            chain.doFilter(request, response);//放行请求
            return;//结束当前方法的执行
        }


        //3.获取请求头中的令牌（token）
        String token = request.getHeader("token");
        log.info("从请求头中获取的令牌：{}",token);


        //4.判断令牌是否存在，如果不存在，返回错误结果（未登录）
        //工具类使用的是import org.springframework.util.StringUtils;包下的
        if(!StringUtils.hasLength(token)){
            log.info("Token不存在");

            Result responseResult = Result.error("NOT_LOGIN");
            //@RestController它会自动将方法的返回值转化为json然后响应回去，但是我们现在是在过滤器当中，并不是在controller当中，所以我们需要手动的把Result对象转换为JSON格式字符串 (fastjson是阿里巴巴提供的用于实现对象和json的转换工具类)
            String json = JSONObject.toJSONString(responseResult);
            response.setContentType("application/json;charset=utf-8");
            //响应
            //首先获取一个输出流，然后再调用里面的方法write，就可以直接将这个字符串直接响应给浏览器
            response.getWriter().write(json);

            return;
        }

        //5.解析token，如果解析失败，返回错误结果（未登录）
        try {
            JwtUtils.parseJWT(token);
        }catch (Exception e){
            log.info("令牌解析失败!");

            Result responseResult = Result.error("NOT_LOGIN");
            //把Result对象转换为JSON格式字符串 (fastjson是阿里巴巴提供的用于实现对象和json的转换工具类)
            String json = JSONObject.toJSONString(responseResult);
            response.setContentType("application/json;charset=utf-8");
            //响应
            response.getWriter().write(json);

            return;
        }


        //6.放行
        chain.doFilter(request, response);

    }
}
~~~

在上述过滤器的功能实现中，我们使用到了一个第三方json处理的工具包fastjson。我们要想使用，需要引入如下依赖：

```xml
<dependency>
    <groupId>com.alibaba</groupId>
    <artifactId>fastjson</artifactId>
    <version>1.2.76</version>
</dependency>
```



登录校验的过滤器我们编写完成了，接下来我们就可以重新启动服务来做一个测试：

> 测试前先把之前所编写的测试使用的过滤器，暂时注释掉。直接将@WebFilter注解给注释掉即可。

- 测试1：未登录是否可以访问部门管理页面

  首先关闭浏览器，重新打开浏览器，在地址栏中输入：http://localhost:9528/#/system/dept

  由于用户没有登录，登录校验过滤器返回错误信息，前端页面根据返回的错误信息结果，自动跳转到登录页面了

  ![image-20230105085212629](./assets/image-20230105085212629.png)

  

- 测试2：先进行登录操作，再访问部门管理页面

  登录校验成功之后，可以正常访问相关业务操作页面

  ![image-20230107102922550](./assets/image-20230107102922550.png)



# 168.拦截器Interceptor

学习完了过滤器Filter之后，接下来我们继续学习拦截器Interseptor。

拦截器我们主要分为三个方面进行讲解：

1. 介绍下什么是拦截器，并通过快速入门程序上手拦截器
2. 拦截器的使用细节
3. 通过拦截器Interceptor完成登录校验功能

我们先学习第一块内容：拦截器快速入门



#### 2.5.1 快速入门

什么是拦截器？

- 是一种动态拦截方法调用的机制，类似于过滤器。
- 拦截器是Spring框架中提供的，用来动态拦截控制器方法的执行。

拦截器的作用：

- 拦截请求，在指定方法调用前后，根据业务需要执行预先设定的代码。



在拦截器当中，我们通常也是做一些通用性的操作，比如：我们可以通过拦截器来拦截前端发起的请求，将登录校验的逻辑全部编写在拦截器当中。在校验的过程当中，如发现用户登录了(携带JWT令牌且是合法令牌)，就可以直接放行，去访问spring当中的资源。如果校验时发现并没有登录或是非法令牌，就可以直接给前端响应未登录的错误信息。



下面我们通过快速入门程序，来学习下拦截器的基本使用。拦截器的使用步骤和过滤器类似，也分为两步：

1. 定义拦截器

2. 注册配置拦截器

   

**自定义拦截器：**

1. 实现HandlerInterceptor接口，并重写其所有方法

> 这三个方法都有默认实现，根据需要重写
>
> 快捷键：ctrl + O

2. 定义好后加上@Component，需要交给IOC容器管理

~~~java
//自定义拦截器
@Component
public class LoginCheckInterceptor implements HandlerInterceptor {
    //目标资源方法执行前执行。 返回true：放行    返回false：不放行
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle .... ");
        
        return true; //true表示放行
    }

    //目标资源方法执行后执行
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle ... ");
    }

    //视图渲染完毕后执行，最后执行
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion .... ");
    }
}
~~~



> 注意：
>
> ​	preHandle方法：目标资源方法（controller里的）执行前执行。 返回true：放行    返回false：不放行
>
> ​	postHandle方法：目标资源方法执行后执行
>
> ​	afterCompletion方法：视图渲染完毕后执行，最后执行



**注册配置拦截器**：

1. 实现WebMvcConfigurer接口
2. 加上@Configuration来表示当前就是spring当中的配置类
3. 重写addInterceptors方法，在里面指定并注册拦截器，并且指定拦截器的拦截路径

~~~java
@Configuration  
public class WebConfig implements WebMvcConfigurer {

    //自定义的拦截器对象
    @Autowired
    private LoginCheckInterceptor loginCheckInterceptor;

    
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
       //注册自定义拦截器对象
        registry.addInterceptor(loginCheckInterceptor).addPathPatterns("/**");//设置拦截器拦截的请求路径（ /** 表示拦截所有请求）
    }
}
~~~



重新启动SpringBoot服务，打开postman测试：

![image-20230107105224741](./assets/image-20230107105224741.png)

![image-20230107105415120](./assets/image-20230107105415120.png)



接下来我们再来做一个测试：将拦截器中返回值改为false

使用postman，再次点击send发送请求后，没有响应数据，说明请求被拦截了没有放行

![image-20230107105815511](./assets/image-20230107105815511.png)

# 169.Interceptor详解

拦截器的入门程序完成之后，接下来我们来介绍拦截器的使用细节。拦截器的使用细节我们主要介绍两个部分：

1. 拦截器的拦截路径配置
2. 拦截器的执行流程



##### 拦截路径

首先我们先来看拦截器的拦截路径的配置，在注册配置拦截器的时候，我们要指定拦截器的拦截路径，通过`addPathPatterns("要拦截路径")`方法，就可以指定要拦截哪些资源。

在入门程序中我们配置的是`/**`，表示拦截所有资源，而在配置拦截器时，不仅可以指定要拦截哪些资源，还可以指定不拦截哪些资源，只需要调用`excludePathPatterns("不拦截路径")`方法，指定哪些资源不需要拦截。

~~~java
@Configuration  
public class WebConfig implements WebMvcConfigurer {

    //拦截器对象
    @Autowired
    private LoginCheckInterceptor loginCheckInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册自定义拦截器对象
        registry.addInterceptor(loginCheckInterceptor)
                .addPathPatterns("/**")//设置拦截器拦截的请求路径（ /** 表示拦截所有请求）
                .excludePathPatterns("/login");//设置不拦截的请求路径
    }
}
~~~



在拦截器中除了可以设置`/**`拦截所有资源外，还有一些常见拦截路径设置：

| 拦截路径  | 含义                 | 举例                                                |
| --------- | -------------------- | --------------------------------------------------- |
| /*        | 一级路径             | 能匹配/depts，/emps，/login，不能匹配 /depts/1      |
| /**       | 任意级路径           | 能匹配/depts，/depts/1，/depts/1/2                  |
| /depts/*  | /depts下的一级路径   | 能匹配/depts/1，不能匹配/depts/1/2，/depts          |
| /depts/** | /depts下的任意级路径 | 能匹配/depts，/depts/1，/depts/1/2，不能匹配/emps/1 |



下面主要来演示下`/**`与`/*`的区别： 

- 修改拦截器配置，把拦截路径设置为`/*`

~~~java
@Configuration 
public class WebConfig implements WebMvcConfigurer {

    //拦截器对象
    @Autowired
    private LoginCheckInterceptor loginCheckInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
       //注册自定义拦截器对象
        registry.addInterceptor(loginCheckInterceptor)
                .addPathPatterns("/*")
                .excludePathPatterns("/login");//设置不拦截的请求路径
    }
}
~~~

使用postman测试：http://localhost:8080/emps/1 

![image-20230107111525558](./assets/image-20230107111525558.png)

控制台没有输出拦截器中的日志信息，说明`/*`没有匹配到拦截路径`/emp/1` 。

![image-20230107111812963](./assets/image-20230107111812963.png)







##### 执行流程

介绍完拦截路径的配置之后，接下来我们再来介绍拦截器的执行流程。通过执行流程，大家就能够清晰的知道过滤器与拦截器的执行时机。

![image-20230107112136151](./assets/image-20230107112136151.png)

- 当我们打开浏览器来访问部署在web服务器当中的web应用时，此时我们所定义的过滤器会拦截到这次请求。拦截到这次请求之后，它会先执行放行前的逻辑，然后再执行放行操作。而由于我们当前是基于springboot开发的，所以放行之后是进入到了spring的环境当中，也就是要来访问我们所定义的controller当中的接口方法。

- Tomcat并不识别所编写的Controller程序，但是它识别Servlet程序，所以在Spring的Web环境中提供了一个非常核心的Servlet：DispatcherServlet（前端控制器），所有请求都会先进行到DispatcherServlet，再将请求转给Controller。

- 当我们定义了拦截器后，会在执行Controller的方法之前，请求被拦截器拦截住。执行`preHandle()`方法，这个方法执行完成后需要返回一个布尔类型的值，如果返回true，就表示放行本次操作，才会继续访问controller中的方法；如果返回false，则不会放行（controller中的方法也不会执行）。

- 在controller当中的方法执行完毕之后，再回过来执行`postHandle()`这个方法以及`afterCompletion()` 方法，然后再返回给DispatcherServlet，最终再来执行过滤器当中放行后的这一部分逻辑的逻辑。执行完毕之后，最终给浏览器响应数据。



接下来我们就来演示下过滤器和拦截器同时存在的执行流程：

- 开启LoginCheckInterceptor拦截器

~~~java
@Component
public class LoginCheckInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle .... ");
        
        return true; //true表示放行
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle ... ");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion .... ");
    }
}
~~~

~~~java
@Configuration  
public class WebConfig implements WebMvcConfigurer {

    //拦截器对象
    @Autowired
    private LoginCheckInterceptor loginCheckInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册自定义拦截器对象
        registry.addInterceptor(loginCheckInterceptor)
                .addPathPatterns("/**")//拦截所有请求
                .excludePathPatterns("/login");//不拦截登录请求
    }
}
~~~



- 开启DemoFilter过滤器

~~~java
@WebFilter(urlPatterns = "/*") 
public class DemoFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("DemoFilter   放行前逻辑.....");

        //放行请求
        filterChain.doFilter(servletRequest,servletResponse);

        System.out.println("DemoFilter   放行后逻辑.....");
    }
}
~~~



重启SpringBoot服务后，清空日志，打开Postman，测试查询部门：

![image-20230107113653871](./assets/image-20230107113653871.png)

![image-20230107114008004](./assets/image-20230107114008004.png)





以上就是拦截器的执行流程。通过执行流程分析，大家应该已经清楚了过滤器和拦截器之间的区别，其实它们之间的区别主要是两点：

- 接口规范不同：过滤器需要实现Filter接口，而拦截器需要实现HandlerInterceptor接口。
- 拦截范围不同：过滤器Filter会拦截所有的资源，而Interceptor只会拦截Spring环境中的资源。





# 171.登录校验- Interceptor

讲解完了拦截器的基本操作之后，接下来我们需要完成最后一步操作：通过拦截器来完成案例当中的登录校验功能。



登录校验的业务逻辑以及操作步骤我们前面已经分析过了，和登录校验Filter过滤器当中的逻辑是完全一致的。现在我们只需要把这个技术方案由原来的过滤器换成拦截器interceptor就可以了。



**登录校验拦截器**

~~~java
//自定义拦截器
@Component //当前拦截器对象由Spring创建和管理
@Slf4j
public class LoginCheckInterceptor implements HandlerInterceptor {
    //前置方式
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle .... ");
        //1.获取请求url
        //2.判断请求url中是否包含login，如果包含，说明是登录操作，放行

        //3.获取请求头中的令牌（token）
        String token = request.getHeader("token");
        log.info("从请求头中获取的令牌：{}",token);

        //4.判断令牌是否存在，如果不存在，返回错误结果（未登录）
        if(!StringUtils.hasLength(token)){
            log.info("Token不存在");

            //创建响应结果对象
            Result responseResult = Result.error("NOT_LOGIN");
            //把Result对象转换为JSON格式字符串 (fastjson是阿里巴巴提供的用于实现对象和json的转换工具类)
            String json = JSONObject.toJSONString(responseResult);
            //设置响应头（告知浏览器：响应的数据类型为json、响应的数据编码表为utf-8）
            response.setContentType("application/json;charset=utf-8");
            //响应
            response.getWriter().write(json);

            return false;//不放行
        }

        //5.解析token，如果解析失败，返回错误结果（未登录）
        try {
            JwtUtils.parseJWT(token);
        }catch (Exception e){
            log.info("令牌解析失败!");

            //创建响应结果对象
            Result responseResult = Result.error("NOT_LOGIN");
            //把Result对象转换为JSON格式字符串 (fastjson是阿里巴巴提供的用于实现对象和json的转换工具类)
            String json = JSONObject.toJSONString(responseResult);
            //设置响应头
            response.setContentType("application/json;charset=utf-8");
            //响应
            response.getWriter().write(json);

            return false;
        }

        //6.放行
        return true;
    }
~~~

**注册配置拦截器**

~~~java
@Configuration  
public class WebConfig implements WebMvcConfigurer {
    //拦截器对象
    @Autowired
    private LoginCheckInterceptor loginCheckInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
       //注册自定义拦截器对象
        registry.addInterceptor(loginCheckInterceptor)
                .addPathPatterns("/**")
                .excludePathPatterns("/login");
    }
}

~~~



登录校验的拦截器编写完成后，接下来我们就可以重新启动服务来做一个测试： （**关闭登录校验Filter过滤器**）

- 测试1：未登录是否可以访问部门管理页面

  首先关闭浏览器，重新打开浏览器，在地址栏中输入：http://localhost:9528/#/system/dept

  由于用户没有登录，校验机制返回错误信息，前端页面根据返回的错误信息结果，自动跳转到登录页面了

  ![image-20230105085212629](./assets/image-20230105085212629.png)

  

- 测试2：先进行登录操作，再访问部门管理页面

  登录校验成功之后，可以正常访问相关业务操作页面

  ![image-20230107102922550](./assets/image-20230107102922550.png)

到此我们也就验证了所开发的登录校验的拦截器也是没问题的。登录校验的过滤器和拦截器，我们只需要使用其中的一种就可以了。











# 172. 异常处理

3.1 当前问题

登录功能和登录校验功能我们都实现了，下面我们学习下今天最后一块技术点：异常处理。首先我们先来看一下系统出现异常之后会发生什么现象，再来介绍异常处理的方案。



我们打开浏览器，访问系统中的新增部门操作，系统中已经有了 "就业部" 这个部门，我们再来增加一个就业部，看看会发生什么现象。

<img src="./assets/image-20230112125651073.png" alt="image-20230112125651073" style="zoom: 80%;" />   

点击确定之后，窗口关闭了，页面没有任何反应，就业部也没有添加上。 而此时，大家会发现，网络请求报错了。

<img src="./assets/image-20230112125737863.png" alt="image-20230112125737863" style="zoom:80%;" /> 

状态码为500，表示服务器端异常，我们打开idea，来看一下，服务器端出了什么问题。

![image-20230112125826602](./assets/image-20230112125826602.png) 

上述错误信息的含义是，dept部门表的name字段的值 就业部 重复了，因为在数据库表dept中已经有了就业部，我们之前设计这张表时，为name字段建议了唯一约束，所以该字段的值是不能重复的。

而当我们再添加就业部，这个部门时，就违反了唯一约束，此时就会报错。





我们来看一下出现异常之后，最终服务端给前端响应回来的数据长什么样。

![image-20230112130253486](./assets/image-20230112130253486.png) 

响应回来的数据是一个JSON格式的数据。但这种JSON格式的数据还是我们开发规范当中所提到的统一响应结果Result吗？显然并不是。由于返回的数据不符合开发规范，所以前端并不能解析出响应的JSON数据。

接下来我们需要思考的是出现异常之后，当前案例项目的异常是怎么处理的？

- 答案：没有做任何的异常处理

![image-20230107121909087](./assets/image-20230107121909087.png)

当我们没有做任何的异常处理时，我们三层架构处理异常的方案：

- Mapper接口在操作数据库的时候出错了，此时异常会往上抛(谁调用Mapper就抛给谁)，会抛给service。 
- service 中也存在异常了，会抛给controller。
- 而在controller当中，我们也没有做任何的异常处理，所以最终异常会再往上抛。最终抛给框架之后，框架就会返回一个JSON格式的数据，里面封装的就是错误的信息，但是框架返回的JSON格式的数据并不符合我们的开发规范。



3.2 解决方案

那么在三层构架项目中，出现了异常，该如何处理?

- 方案一：在所有Controller的所有方法中进行try…catch处理
  - 缺点：代码臃肿（不推荐）
- 方案二：全局异常处理器
  - 好处：简单、优雅（推荐）

![image-20230107122904214](./assets/image-20230107122904214.png)



###  全局异常处理器

> - Mapper接口在操作数据库的时候出错了，此时异常会往上抛(谁调用Mapper就抛给谁)，会抛给service。 
> - service 中也存在异常了，会抛给controller。
> - controller也不需要处理，就会抛给全局异常处理器来处理，全局异常处理器处理完这个异常，再给前端响应标准的统一响应结果Result即可

我们该怎么样定义全局异常处理器？

- 定义全局异常处理器非常简单，就是定义一个类，在类上加上一个注解@RestControllerAdvice，加上这个注解就代表我们定义了一个全局异常处理器。
- 在全局异常处理器当中，需要定义一个方法来捕获异常，在这个方法上需要加上注解@ExceptionHandler。通过@ExceptionHandler注解当中的value属性来指定我们要捕获的是哪一类型的异常。

~~~java
@RestControllerAdvice
public class GlobalExceptionHandler {

    //处理异常
    @ExceptionHandler(Exception.class) //指定能够处理的异常类型，Exception.class代表当前要捕获所有的异常
    public Result ex(Exception e){
        e.printStackTrace();//打印堆栈中的异常信息

        //捕获到异常之后，响应一个标准的Result
        return Result.error("对不起,操作失败,请联系管理员");
    }
}
~~~

> @RestControllerAdvice = @ControllerAdvice + @ResponseBody
>
> 处理异常的方法返回值会转换为json后再响应给前端



重新启动SpringBoot服务，打开浏览器，再来测试一下添加部门这个操作，我们依然添加已存在的 "就业部" 这个部门：

![image-20230112131232032](./assets/image-20230112131232032.png) 

![image-20230112131135272](./assets/image-20230112131135272.png) 

此时，我们可以看到，出现异常之后，异常已经被全局异常处理器捕获了。然后返回的错误信息，被前端程序正常解析，然后提示出了对应的错误提示信息。





以上就是全局异常处理器的使用，主要涉及到两个注解：

- @RestControllerAdvice  //表示当前类为全局异常处理器
- @ExceptionHandler  //指定可以捕获哪种类型的异常进行处理



# 172. 事务管理

1.1 事务回顾

在数据库阶段我们已学习过事务了，我们讲到：

**事务**是一组操作的集合，它是一个不可分割的工作单位。事务会把所有的操作作为一个整体，一起向数据库提交或者是撤销操作请求。所以这组操作要么同时成功，要么同时失败。



怎么样来控制这组操作，让这组操作同时成功或同时失败呢？此时就要涉及到事务的具体操作了。

事务的操作主要有三步：

1. 开启事务（一组操作开始前，开启事务）：start transaction / begin ;
2. 提交事务（这组操作全部成功后，提交事务）：commit ;
3. 回滚事务（中间任何一个操作出现异常，回滚事务）：rollback ;



1.2 Spring事务管理

1.2.1 案例

简单的回顾了事务的概念以及事务的基本操作之后，接下来我们看一个事务管理案例：解散部门 （解散部门就是删除部门）

需求：当部门解散了不仅需要把部门信息删除了，还需要把该部门下的员工数据也删除了。

步骤：

- 根据ID删除部门数据
- 根据部门ID删除该部门下的员工

代码实现：

1. DeptServiceImpl

~~~java
@Slf4j
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;

    @Autowired
    private EmpMapper empMapper;


    //根据部门id，删除部门信息及部门下的所有员工
    @Override
    public void delete(Integer id){
        //根据部门id删除部门信息
        deptMapper.deleteById(id);

        //删除部门下的所有员工信息
        empMapper.deleteByDeptId(id);   
    }
}
~~~

2. DeptMapper

~~~java
@Mapper
public interface DeptMapper {
    /**
     * 根据id删除部门信息
     * @param id   部门id
     */
    @Delete("delete from dept where id = #{id}")
    void deleteById(Integer id);
}
~~~

3. EmpMapper

~~~java
@Mapper
public interface EmpMapper {

    //根据部门id删除部门下所有员工
    @Delete("delete from emp where dept_id=#{deptId}")
    public int deleteByDeptId(Integer deptId);
    
}
~~~



重启SpringBoot服务，使用postman测试部门删除：

![image-20230107140057729](O:/BaiduSyncdisk/other/课/黑马/JAVAWeb/day13-SpringBootWeb AOP/讲义/assets/image-20230107140057729.png)



代码正常情况下，dept表和Em表中的数据已删除

![image-20230107140130199](O:/BaiduSyncdisk/other/课/黑马/JAVAWeb/day13-SpringBootWeb AOP/讲义/assets/image-20230107140130199.png)

![image-20230107140221425](O:/BaiduSyncdisk/other/课/黑马/JAVAWeb/day13-SpringBootWeb AOP/讲义/assets/image-20230107140221425.png)



修改DeptServiceImpl类中代码，添加可能出现异常的代码：

~~~java
@Slf4j
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;

    @Autowired
    private EmpMapper empMapper;


    //根据部门id，删除部门信息及部门下的所有员工
    @Override
    public void delete(Integer id){
        //根据部门id删除部门信息
        deptMapper.deleteById(id);
        
        //模拟：异常发生
        int i = 1/0;

        //删除部门下的所有员工信息
        empMapper.deleteByDeptId(id);   
    }
}
~~~



重启SpringBoot服务，使用postman测试部门删除：

![image-20230107140618199](O:/BaiduSyncdisk/other/课/黑马/JAVAWeb/day13-SpringBootWeb AOP/讲义/assets/image-20230107140618199.png)

![image-20230107140706301](O:/BaiduSyncdisk/other/课/黑马/JAVAWeb/day13-SpringBootWeb AOP/讲义/assets/image-20230107140706301.png)



查看数据库表：

- 删除了2号部门

![image-20230107140726701](O:/BaiduSyncdisk/other/课/黑马/JAVAWeb/day13-SpringBootWeb AOP/讲义/assets/image-20230107140726701.png)

- 2号部门下的员工数据没有删除

![image-20230107140221425](O:/BaiduSyncdisk/other/课/黑马/JAVAWeb/day13-SpringBootWeb AOP/讲义/assets/image-20230107140221425.png)



**以上程序出现的问题：即使程序运行抛出了异常，部门依然删除了，但是部门下的员工却没有删除，造成了数据的不一致。**





原因分析

原因：

- 先执行根据id删除部门的操作，这步执行完毕，数据库表 dept 中的数据就已经删除了。
- 执行 1/0 操作，抛出异常
- 抛出异常之前，下面所有的代码都不会执行了，根据部门ID删除该部门下的员工，这个操作也不会执行 。

此时就出现问题了，部门删除了，部门下的员工还在，业务操作前后数据不一致。



而要想保证操作前后，数据的一致性，就需要让解散部门中涉及到的两个业务操作，要么全部成功，要么全部失败 。 那我们如何，让这两个操作要么全部成功，要么全部失败呢 ？

那就可以通过事务来实现，因为一个事务中的多个业务操作，要么全部成功，要么全部失败。



此时，我们就需要在delete删除业务功能中添加事务。

![image-20230107141652636](O:/BaiduSyncdisk/other/课/黑马/JAVAWeb/day13-SpringBootWeb AOP/讲义/assets/image-20230107141652636.png)

在方法运行之前，开启事务，如果方法成功执行，就提交事务，如果方法执行的过程当中出现异常了，就回滚事务。



思考：开发中所有的业务操作，一旦我们要进行控制事务，是不是都是这样的套路？

答案：是的。



所以在spring框架当中就已经把事务控制的代码都已经封装好了，并不需要我们手动实现。我们使用了spring框架，我们只需要通过一个简单的注解@Transactional就搞定了。



#### Transactional注解

> @Transactional作用：就是在当前这个方法执行开始之前来开启事务，方法执行完毕之后提交事务。如果在这个方法执行的过程当中出现了异常，就会进行事务的回滚操作。
>
> @Transactional注解：我们一般会在业务层当中来控制事务，因为在业务层当中，一个业务功能可能会包含多个数据访问的操作。在业务层来控制事务，我们就可以将多个数据访问操作控制在一个事务范围内。



@Transactional注解书写位置：

- 方法
  - 当前方法交给spring进行事务管理
- 类
  - 当前类中所有的方法都交由spring进行事务管理
- 接口
  - 接口下所有的实现类当中所有的方法都交给spring 进行事务管理



但我们一般会选择加在业务层的增删改方法上，更准确的说，是加在业务层执行多次业务访问操作这一类的增删改业方法上，因为查询操作不会影响业务的变更，所以无需控制事务。如果在这个方法上只执行了一步增删改操作，我们也不需要控制事务，因为mysql的事务控制是自动提交的，dml执行完毕之后，如果执行成功事务就已经提交了，如果执行失败，那数据库当中的数据也不会发生变更。

接下来，我们就可以在业务方法delete上加上 @Transactional 来控制事务 。

```java
@Slf4j
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;

    @Autowired
    private EmpMapper empMapper;

    
    @Override
    @Transactional  //当前方法添加了事务管理
    public void delete(Integer id){
        //根据部门id删除部门信息
        deptMapper.deleteById(id);
        
        //模拟：异常发生
        int i = 1/0;

        //删除部门下的所有员工信息
        empMapper.deleteByDeptId(id);   
    }
}
```



在业务功能上添加@Transactional注解进行事务管理后，我们重启SpringBoot服务，使用postman测试：

![image-20230107143339917](O:/BaiduSyncdisk/other/课/黑马/JAVAWeb/day13-SpringBootWeb AOP/讲义/assets/image-20230107143339917.png)



添加Spring事务管理后，由于服务端程序引发了异常，所以事务进行回滚。

![image-20230107144312892](O:/BaiduSyncdisk/other/课/黑马/JAVAWeb/day13-SpringBootWeb AOP/讲义/assets/image-20230107144312892.png)

![image-20230107143720961](O:/BaiduSyncdisk/other/课/黑马/JAVAWeb/day13-SpringBootWeb AOP/讲义/assets/image-20230107143720961.png)



说明：可以在application.yml配置文件中开启事务管理日志，这样就可以在控制看到和事务相关的日志信息了

~~~yaml
#spring事务管理日志
logging:
  level:
    org.springframework.jdbc.support.JdbcTransactionManager: debug
~~~







# 173.事务进阶

前面我们通过spring事务管理注解@Transactional已经控制了业务层方法的事务。接下来我们要来详细的介绍一下@Transactional事务管理注解的使用细节。我们这里主要介绍@Transactional注解当中的两个常见的属性：

1. 异常回滚的属性：rollbackFor 
2. 事务传播行为：propagation

我们先来学习下rollbackFor属性。

#### rollbackFor

我们在之前编写的业务方法上添加了@Transactional注解，来实现事务管理。

~~~java
@Transactional
public void delete(Integer id){
        //根据部门id删除部门信息
        deptMapper.deleteById(id);
        
        //模拟：异常发生
        int i = 1/0;

        //删除部门下的所有员工信息
        empMapper.deleteByDeptId(id);   
}
~~~

以上业务功能delete()方法在运行时，会引发除0的算数运算异常(运行时异常)，出现异常之后，由于我们在方法上加了@Transactional注解进行事务管理，所以发生异常会执行rollback回滚操作，从而保证事务操作前后数据是一致的。



下面我们在做一个测试，我们修改业务功能代码，在模拟异常的位置上直接抛出Exception异常（编译时异常）

~~~java
@Transactional
public void delete(Integer id) throws Exception {
        //根据部门id删除部门信息
        deptMapper.deleteById(id);
        
        //模拟：异常发生
        if(true){//如果这里不加if (true)，编译器就会检测到最后一句是不可达语句，就会报错，所以这里可以来骗一下编译器
            throw new Exception("出现异常了~~~");
        }

        //删除部门下的所有员工信息
        empMapper.deleteByDeptId(id);   
}
~~~

> 说明：在service中向上抛出一个Exception编译时异常之后，由于是controller调用service，所以在controller中要有异常处理代码，此时我们选择在controller中继续把异常向上抛。
>
> ~~~java
> @DeleteMapping("/depts/{id}")
> public Result delete(@PathVariable Integer id) throws Exception {
>   //日志记录
>   log.info("根据id删除部门");
>   //调用service层功能
>   deptService.delete(id);
>   //响应
>   return Result.success();
> }
> ~~~





重新启动服务后测试：

抛出异常之后事务会不会回滚

> 现有表中数据：
>
> ![image-20230107140726701](O:/BaiduSyncdisk/other/课/黑马/JAVAWeb/day13-SpringBootWeb AOP/讲义/assets/image-20230107140726701.png)



使用postman测试，删除5号部门

![image-20230108142359592](O:/BaiduSyncdisk/other/课/黑马/JAVAWeb/day13-SpringBootWeb AOP/讲义/assets/image-20230108142359592.png)





发生了Exception异常，但事务依然提交了

![image-20230108142555310](O:/BaiduSyncdisk/other/课/黑马/JAVAWeb/day13-SpringBootWeb AOP/讲义/assets/image-20230108142555310.png)

> dept表中数据：
>
> ![image-20230108142707351](O:/BaiduSyncdisk/other/课/黑马/JAVAWeb/day13-SpringBootWeb AOP/讲义/assets/image-20230108142707351.png)



通过以上测试可以得出一个结论：默认情况下，**只有出现RuntimeException(运行时异常)才会回滚事务**。

假如我们想让所有的异常都回滚，需要来配置@Transactional注解当中的rollbackFor属性，通过rollbackFor这个属性可以指定出现何种异常类型回滚事务。

~~~java
@Slf4j
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;

    @Autowired
    private EmpMapper empMapper;

    
    @Override
    @Transactional(rollbackFor=Exception.class)//出现所有的异常都会进行事务的回滚，后面配置的是异常的类型
    public void delete(Integer id){
        //根据部门id删除部门信息
        deptMapper.deleteById(id);
        
        //模拟：异常发生
        int num = id/0;

        //删除部门下的所有员工信息
        empMapper.deleteByDeptId(id);   
    }
}
~~~



接下来我们重新启动服务，测试删除部门的操作：

![image-20230108184912155](O:/BaiduSyncdisk/other/课/黑马/JAVAWeb/day13-SpringBootWeb AOP/讲义/assets/image-20230108184912155.png)

控制台日志：执行了删除3号部门的操作， 因为异常又进行了事务回滚

![image-20230108185432083](O:/BaiduSyncdisk/other/课/黑马/JAVAWeb/day13-SpringBootWeb AOP/讲义/assets/image-20230108185432083.png)

数据表：3号部门没有删除

![image-20230107143720961](O:/BaiduSyncdisk/other/课/黑马/JAVAWeb/day13-SpringBootWeb AOP/讲义/assets/image-20230107143720961.png)



> 结论：
>
> - 在Spring的事务管理中，默认只有运行时异常 RuntimeException才会回滚。
> - 如果还需要回滚指定类型的异常，可以通过rollbackFor属性来指定。



#### propagation

1.3.3.1 介绍

我们接着继续学习@Transactional注解当中的第二个属性propagation，这个属性是用来配置事务的传播行为的。

什么是事务的传播行为呢？

- 就是当一个事务方法被另一个事务方法调用时，这个事务方法应该如何进行事务控制。



例如：两个事务方法，一个A方法，一个B方法。在这两个方法上都添加了@Transactional注解，就代表这两个方法都具有事务，而在A方法当中又去调用了B方法。

![image-20230112152543953](O:/BaiduSyncdisk/other/课/黑马/JAVAWeb/day13-SpringBootWeb AOP/讲义/assets/image-20230112152543953.png) 

所谓事务的传播行为，指的就是在A方法运行的时候，首先会开启一个事务，在A方法当中又调用了B方法， B方法自身也具有事务，那么B方法在运行的时候，到底是加入到A方法的事务当中来，还是B方法在运行的时候新建一个事务？这个就涉及到了事务的传播行为。



我们要想控制事务的传播行为，在@Transactional注解的后面指定一个属性propagation，通过 propagation 属性来指定传播行为。接下来我们就来介绍一下常见的事务传播行为。

| **属性值**    | **含义**                                                     |
| ------------- | ------------------------------------------------------------ |
| REQUIRED      | 【默认值】需要事务，有则加入，无则创建新事务                 |
| REQUIRES_NEW  | 需要新事务，无论有无，总是创建新事务                         |
| SUPPORTS      | 支持事务，有则加入，无则在无事务状态中运行                   |
| NOT_SUPPORTED | 不支持事务，在无事务状态下运行,如果当前存在已有事务,则挂起当前事务 |
| MANDATORY     | 必须有事务，否则抛异常                                       |
| NEVER         | 必须没事务，否则抛异常                                       |
| …             |                                                              |

> 对于这些事务传播行为，我们只需要关注以下两个就可以了：
>
> 1. REQUIRED（默认值）
> 2. REQUIRES_NEW



1.3.3.2 案例

接下来我们就通过一个案例来演示下事务传播行为propagation属性的使用。



**需求：**解散部门时需要记录操作日志

​			由于解散部门是一个非常重要而且非常危险的操作，所以在业务当中要求每一次执行解散部门的操作都需要留下痕迹，就是要记录操作日志。而且还要求无论是执行成功了还是执行失败了，都需要留下痕迹。



**步骤：**

1. 执行解散部门的业务：先删除部门，再删除部门下的员工（前面已实现）
2. 记录解散部门的日志，到日志表（未实现）



**准备工作：**

1. 创建数据库表 dept_log 日志表：

~~~mysql
create table dept_log(
   	id int auto_increment comment '主键ID' primary key,
    create_time datetime null comment '操作时间',
    description varchar(300) null comment '操作描述'
)comment '部门操作日志表';
~~~

2. 引入资料中提供的实体类：DeptLog

~~~java
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeptLog {
    private Integer id;
    private LocalDateTime createTime;
    private String description;
}
~~~

3. 引入资料中提供的Mapper接口：DeptLogMapper

~~~java
@Mapper
public interface DeptLogMapper {

    @Insert("insert into dept_log(create_time,description) values(#{createTime},#{description})")
    void insert(DeptLog log);

}
~~~

4. 引入资料中提供的业务接口：DeptLogService

~~~java
public interface DeptLogService {
    void insert(DeptLog deptLog);
}
~~~

5. 引入资料中提供的业务实现类：DeptLogServiceImpl

~~~java
@Service
public class DeptLogServiceImpl implements DeptLogService {

    @Autowired
    private DeptLogMapper deptLogMapper;

    @Transactional //事务传播行为：有事务就加入、没有事务就新建事务
    @Override
    public void insert(DeptLog deptLog) {
        deptLogMapper.insert(deptLog);
    }
}

~~~



**代码实现:**

业务实现类：DeptServiceImpl

~~~java
@Slf4j
@Service
//@Transactional //当前业务实现类中的所有的方法，都添加了spring事务管理机制
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;
    
    @Autowired
    private EmpMapper empMapper;

    @Autowired
    private DeptLogService deptLogService;


    //根据部门id，删除部门信息及部门下的所有员工
    @Override
    @Log
    @Transactional(rollbackFor = Exception.class) 
    public void delete(Integer id) throws Exception {
        try {
            //根据部门id删除部门信息
            deptMapper.deleteById(id);
            //模拟：异常
            if(true){
                throw new Exception("出现异常了~~~");
            }
            //删除部门下的所有员工信息
            empMapper.deleteByDeptId(id);
        }finally {
            //不论是否有异常，最终都要执行的代码：记录日志
            DeptLog deptLog = new DeptLog();
            deptLog.setCreateTime(LocalDateTime.now());
            deptLog.setDescription("执行了解散部门的操作，此时解散的是"+id+"号部门");
            //调用其他业务类中的方法
            deptLogService.insert(deptLog);
        }
    }
    
    //省略其他代码...
}
~~~



**测试:**

重新启动SpringBoot服务，测试删除3号部门后会发生什么？

- 执行了删除3号部门操作
- 执行了插入部门日志操作
- 程序发生Exception异常
- 执行事务回滚（删除、插入操作因为在一个事务范围内，两个操作都会被回滚）

![image-20230109154025262](O:/BaiduSyncdisk/other/课/黑马/JAVAWeb/day13-SpringBootWeb AOP/讲义/assets/image-20230109154025262.png)

然后在dept_log表中没有记录日志数据

![image-20230109154344393](O:/BaiduSyncdisk/other/课/黑马/JAVAWeb/day13-SpringBootWeb AOP/讲义/assets/image-20230109154344393.png) 



> 控制台日志过滤插件：Grep Console

**原因分析:**

接下来我们就需要来分析一下具体是什么原因导致的日志没有成功的记录。

- 在执行delete操作时开启了一个事务

- 当执行insert操作时，insert设置的事务传播行是默认值REQUIRED，表示有事务就加入，没有则新建事务

- 此时：delete和insert操作使用了同一个事务，同一个事务中的多个操作，要么同时成功，要么同时失败，所以当异常发生时进行事务回滚，就会回滚delete和insert操作

![image-20230109162420479](O:/BaiduSyncdisk/other/课/黑马/JAVAWeb/day13-SpringBootWeb AOP/讲义/assets/image-20230109162420479.png)







**解决方案：**

在DeptLogServiceImpl类中insert方法上，添加@Transactional(propagation = Propagation.REQUIRES_NEW)

> Propagation.REQUIRES_NEW  ：不论是否有事务，都创建新事务  ，运行在一个独立的事务中。

~~~java
@Service
public class DeptLogServiceImpl implements DeptLogService {

    @Autowired
    private DeptLogMapper deptLogMapper;

    @Transactional(propagation = Propagation.REQUIRES_NEW)//事务传播行为：不论是否有事务，都新建事务
    @Override
    public void insert(DeptLog deptLog) {
        deptLogMapper.insert(deptLog);
    }
}
~~~



重启SpringBoot服务，再次测试删除3号部门：

![image-20230109170002879](O:/BaiduSyncdisk/other/课/黑马/JAVAWeb/day13-SpringBootWeb AOP/讲义/assets/image-20230109170002879.png)

那此时，DeptServiceImpl中的delete方法运行时，会开启一个事务。 当调用  deptLogService.insert(deptLog)  时，也会创建一个新的事务，那此时，当insert方法运行完毕之后，事务就已经提交了。 即使外部的事务出现异常，内部已经提交的事务，也不会回滚了，因为是两个独立的事务。



到此事务传播行为已演示完成，事务的传播行为我们只需要掌握两个：REQUIRED、REQUIRES_NEW。

> - REQUIRED ：大部分情况下都是用该传播行为即可。
>
> - REQUIRES_NEW ：当我们不希望事务之间相互影响时，可以使用该传播行为。比如：下订单前需要记录日志，不论订单保存成功与否，都需要保证日志记录能够记录成功。

# 175. AOP基础

学习完spring的事务管理之后，接下来我们进入到AOP的学习。 AOP也是spring框架的第二大核心，我们先来学习AOP的基础。

在AOP基础这个阶段，我们首先介绍一下什么是AOP，再通过一个快速入门程序，让大家快速体验AOP程序的开发。最后再介绍AOP当中所涉及到的一些核心的概念。

2.1 AOP概述

什么是AOP？

- AOP英文全称：Aspect Oriented Programming（面向切面编程、面向方面编程），其实说白了，面向切面编程就是面向特定方法编程。 



那什么又是面向方法编程呢，为什么又需要面向方法编程呢？来我们举个例子做一个说明：

比如，我们这里有一个项目，项目中开发了很多的业务功能。

![image-20230112154547523](O:/BaiduSyncdisk/other/课/黑马/JAVAWeb/day13-SpringBootWeb AOP/讲义/assets/image-20230112154547523.png) 



然而有一些业务功能执行效率比较低，执行耗时较长，我们需要针对于这些业务方法进行优化。 那首先第一步就需要定位出执行耗时比较长的业务方法，再针对于业务方法再来进行优化。

此时我们就需要统计当前这个项目当中每一个业务方法的执行耗时。那么统计每一个业务方法的执行耗时该怎么实现？

可能多数人首先想到的就是在每一个业务方法运行之前，记录这个方法运行的开始时间。在这个方法运行完毕之后，再来记录这个方法运行的结束时间。拿结束时间减去开始时间，不就是这个方法的执行耗时吗？

<img src="O:/BaiduSyncdisk/other/课/黑马/JAVAWeb/day13-SpringBootWeb AOP/讲义/assets/image-20230112154605206.png" alt="image-20230112154605206" style="zoom:80%;" /> 



以上分析的实现方式是可以解决需求问题的。但是对于一个项目来讲，里面会包含很多的业务模块，每个业务模块又包含很多增删改查的方法，如果我们要在每一个模块下的业务方法中，添加记录开始时间、结束时间、计算执行耗时的代码，就会让程序员的工作变得非常繁琐。

<img src="O:/BaiduSyncdisk/other/课/黑马/JAVAWeb/day13-SpringBootWeb AOP/讲义/assets/image-20230112154627546.png" alt="image-20230112154627546" style="zoom:80%;" /> 



而AOP面向方法编程，就可以做到在不改动这些原始方法的基础上，针对特定的方法进行功能的增强。

> AOP的作用：在程序运行期间在不修改源代码的基础上对已有方法进行增强（无侵入性: 解耦）

我们要想完成统计各个业务方法执行耗时的需求，我们只需要定义一个模板方法，将记录方法执行耗时这一部分公共的逻辑代码，定义在模板方法当中，在这个方法开始运行之前，来记录这个方法运行的开始时间，在方法结束运行的时候，再来记录方法运行的结束时间，中间就来运行原始的业务方法。

<img src="O:/BaiduSyncdisk/other/课/黑马/JAVAWeb/day13-SpringBootWeb AOP/讲义/assets/image-20230112154530101.png" alt="image-20230112154530101" style="zoom:80%;" /> 



而中间运行的原始业务方法，可能是其中的一个业务方法，比如：我们只想通过 部门管理的 list 方法的执行耗时，那就只有这一个方法是原始业务方法。  而如果，我们是先想统计所有部门管理的业务方法执行耗时，那此时，所有的部门管理的业务方法都是 原始业务方法。 **那面向这样的指定的一个或多个方法进行编程，我们就称之为 面向切面编程。**





那此时，当我们再调用部门管理的 list 业务方法时啊，并不会直接执行 list 方法的逻辑，而是会执行我们所定义的 模板方法 ， 然后再模板方法中：

- 记录方法运行开始时间
- 运行原始的业务方法（那此时原始的业务方法，就是 list 方法）
- 记录方法运行结束时间，计算方法执行耗时

<img src="O:/BaiduSyncdisk/other/课/黑马/JAVAWeb/day13-SpringBootWeb AOP/讲义/assets/image-20230112155813944.png" alt="image-20230112155813944" style="zoom:80%;" /> 

不论，我们运行的是那个业务方法，最后其实运行的就是我们定义的模板方法，而在模板方法中，就完成了原始方法执行耗时的统计操作 。(那这样呢，我们就通过一个模板方法就完成了指定的一个或多个业务方法执行耗时的统计)



而大家会发现，这个流程，我们是不是似曾相识啊？ 

对了，就是和我们之前所学习的动态代理技术是非常类似的。 我们所说的模板方法，其实就是代理对象中所定义的方法，那代理对象中的方法以及根据对应的业务需要， 完成了对应的业务功能，当运行原始业务方法时，就会运行代理对象中的方法，从而实现统计业务方法执行耗时的操作。

其实，AOP面向切面编程和OOP面向对象编程一样，它们都仅仅是一种编程思想，而动态代理技术是这种思想最主流的实现方式。而Spring的AOP是Spring框架的高级技术，旨在管理bean对象的过程中底层使用动态代理机制，对特定的方法进行编程(功能增强)。



> AOP的优势：
>
> 1. 减少重复代码
> 2. 提高开发效率
> 3. 维护方便





2.2 AOP快速入门

在了解了什么是AOP后，我们下面通过一个快速入门程序，体验下AOP的开发，并掌握Spring中AOP的开发步骤。

**需求：**统计各个业务层方法执行耗时。

**实现步骤：**

1. 导入依赖：在pom.xml中导入AOP的依赖
2. 编写AOP程序：针对于特定方法根据业务需要进行编程

> 为演示方便，可以自建新项目或导入提供的`springboot-aop-quickstart`项目工程



**pom.xml**

~~~xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-aop</artifactId>
</dependency>
~~~



**AOP程序：TimeAspect**

~~~java
@Component
@Aspect //当前类为切面类
@Slf4j
public class TimeAspect {

    @Around("execution(* com.itheima.service.*.*(..))")
    //如果想要调用原始的方法运行，就必须声明这个形参
    public Object recordTime(ProceedingJoinPoint pjp) throws Throwable {
        //记录方法执行开始时间
        long begin = System.currentTimeMillis();

        //执行原始方法
        Object result = pjp.proceed();

        //记录方法执行结束时间
        long end = System.currentTimeMillis();

        //计算方法执行耗时
        //ProceedingJoinPoint就会封装原始方法的相关信息，getSignature拿到的是方法的签名
        log.info(pjp.getSignature()+"执行耗时: {}毫秒",end-begin);

        return result;
    }
}
~~~



重新启动SpringBoot服务测试程序：

- 查询3号部门信息

![image-20230110143404792](O:/BaiduSyncdisk/other/课/黑马/JAVAWeb/day13-SpringBootWeb AOP/讲义/assets/image-20230110143404792.png)

![image-20230110143611669](O:/BaiduSyncdisk/other/课/黑马/JAVAWeb/day13-SpringBootWeb AOP/讲义/assets/image-20230110143611669.png)

> 我们可以再测试下：查询所有部门信息（同样执行AOP程序）
>
> ![image-20230110143815479](O:/BaiduSyncdisk/other/课/黑马/JAVAWeb/day13-SpringBootWeb AOP/讲义/assets/image-20230110143815479.png)





我们通过AOP入门程序完成了业务方法执行耗时的统计，那其实AOP的功能远不止于此，常见的应用场景如下：

- 记录系统的操作日志
- 权限控制
- 事务管理：我们前面所讲解的Spring事务管理，底层其实也是通过AOP来实现的，只要添加@Transactional注解之后，AOP程序自动会在原始方法运行前先来开启事务，在原始方法运行完毕之后提交或回滚事务

这些都是AOP应用的典型场景。



通过入门程序，我们也应该感受到了AOP面向切面编程的一些优势：

- 代码无侵入：没有修改原始的业务方法，就已经对原始的业务方法进行了功能的增强或者是功能的改变

- 减少了重复代码
- 提高开发效率

- 维护方便



# 176.AOP核心概念

通过SpringAOP的快速入门，感受了一下AOP面向切面编程的开发方式。下面我们再来学习AOP当中涉及到的一些核心概念。



**1. 连接点：JoinPoint**，可以被AOP控制的方法（暗含方法执行时的相关信息）

​	连接点指的是可以被aop控制的方法。例如：入门程序当中所有的业务方法都是可以被aop控制的方法。

​	![image-20230112160708474](O:/BaiduSyncdisk/other/课/黑马/JAVAWeb/day13-SpringBootWeb AOP/讲义/assets/image-20230112160708474.png) 

​	在SpringAOP提供的JoinPoint当中，封装了连接点方法在执行时的相关信息。（后面会有具体的讲解）



**2. 通知：Advice**，指哪些重复的逻辑，也就是共性功能（最终体现为一个方法）

​	在入门程序中是需要统计各个业务方法的执行耗时的，此时我们就需要在这些业务方法运行开始之前，先记录这个方法运行的开始时间，在每一个业务方法运行结束的时候，再来记录这个方法运行的结束时间。

​	但是在AOP面向切面编程当中，我们只需要将这部分重复的代码逻辑抽取出来单独定义。抽取出来的这一部分重复的逻辑，也就是共性的功能。

​	<img src="O:/BaiduSyncdisk/other/课/黑马/JAVAWeb/day13-SpringBootWeb AOP/讲义/assets/image-20230112160852883.png" alt="image-20230112160852883" style="zoom:80%;" /> 

​	

**3. 切入点：PointCut**，匹配连接点的条件，通知仅会在切入点方法执行时被应用

​	在通知当中，我们所定义的共性功能到底要应用在哪些方法上？此时就涉及到了切入点pointcut概念。切入点指的是匹配连接点的条件。通知仅会在切入点方法运行时才会被应用。

​	在aop的开发当中，我们通常会通过一个切入点表达式来描述切入点(后面会有详解)。

​	<img src="O:/BaiduSyncdisk/other/课/黑马/JAVAWeb/day13-SpringBootWeb AOP/讲义/assets/image-20230112161131937.png" alt="image-20230112161131937" style="zoom:80%;" /> 

​	假如：切入点表达式改为DeptServiceImpl.list()，此时就代表仅仅只有list这一个方法是切入点。只有list()方法在运行的时候才会应用通知。

​	

**4. 切面：Aspect**，描述通知与切入点的对应关系（通知+切入点）

​	当通知和切入点结合在一起，就形成了一个切面。通过切面就能够描述当前aop程序需要针对于哪个原始方法，在什么时候执行什么样的操作。

​	<img src="O:/BaiduSyncdisk/other/课/黑马/JAVAWeb/day13-SpringBootWeb AOP/讲义/assets/image-20230112161335186.png" alt="image-20230112161335186" style="zoom:80%;" /> 

​	切面所在的类，我们一般称为**切面类**（被@Aspect注解标识的类）

​	

**5. 目标对象：Target**，通知所应用的对象

​	目标对象指的就是通知所应用的对象，我们就称之为目标对象。

​	![image-20230112161657667](O:/BaiduSyncdisk/other/课/黑马/JAVAWeb/day13-SpringBootWeb AOP/讲义/assets/image-20230112161657667.png) 





AOP的核心概念我们介绍完毕之后，接下来我们再来分析一下我们所定义的通知是如何与目标对象结合在一起，对目标对象当中的方法进行功能增强的。

<img src="O:/BaiduSyncdisk/other/课/黑马/JAVAWeb/day13-SpringBootWeb AOP/讲义/assets/image-20230112161821401.png" alt="image-20230112161821401" style="zoom:80%;" /> 

Spring的AOP底层是基于动态代理技术来实现的，也就是说在程序运行的时候，会自动的基于动态代理技术为目标对象生成一个对应的代理对象。在代理对象当中就会对目标对象当中的原始方法进行功能的增强。



用到的是spring aop底层的另一种代理技术：CGLIB

![image-20231102095148782](.\assets\image-20231102095148782.png)



# 177.AOP进阶

AOP的基础知识学习完之后，下面我们对AOP当中的各个细节进行详细的学习。主要分为4个部分：

1. 通知类型
2. 通知顺序
3. 切入点表达式
4. 连接点

我们先来学习第一部分通知类型。



### 通知类型

在入门程序当中，我们已经使用了一种功能最为强大的通知类型：Around环绕通知。

~~~java
@Around("execution(* com.itheima.service.*.*(..))")
public Object recordTime(ProceedingJoinPoint pjp) throws Throwable {
    //记录方法执行开始时间
    long begin = System.currentTimeMillis();
    //执行原始方法
    Object result = pjp.proceed();
    //记录方法执行结束时间
    long end = System.currentTimeMillis();
    //计算方法执行耗时
    log.info(pjp.getSignature()+"执行耗时: {}毫秒",end-begin);
    return result;
}
~~~

> 只要我们在通知方法上加上了@Around注解，就代表当前通知是一个环绕通知。



Spring中AOP的通知类型：

- @Around：环绕通知，此注解标注的通知方法在目标方法前、后都被执行
- @Before：前置通知，此注解标注的通知方法在目标方法前被执行
- @After ：后置通知，此注解标注的通知方法在目标方法后被执行，无论是否有异常都会执行，所以在很多地方，把after最终通知翻译为最终通知。
- @AfterReturning ： 返回后通知，此注解标注的通知方法在目标方法后被执行，有异常不会执行
- @AfterThrowing ： 异常后通知，此注解标注的通知方法发生异常后执行，所以也叫异常抛出后通知



> 前置通知旁边有个m，代表method，目标方法，上面有个小半圆，代表的是在目标方法前运行，点开可以看见它所关联的方法
>
> ![image-20231102102353010](.\assets\image-20231102102353010.png)

下面我们通过代码演示，来加深对于不同通知类型的理解：

~~~java
@Slf4j
@Component
@Aspect
public class MyAspect1 {
    //前置通知
    @Before("execution(* com.itheima.service.*.*(..))")
    public void before(JoinPoint joinPoint){
        log.info("before ...");

    }

    //环绕通知
    @Around("execution(* com.itheima.service.*.*(..))")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        log.info("around before ...");

        //调用目标对象的原始方法执行，原始方法在运行时可能会有异常，我们需要抛了它
        Object result = proceedingJoinPoint.proceed();
        
        //原始方法如果执行时有异常，环绕通知中的后置代码不会在执行了
        
        log.info("around after ...");
        return result;
    }

    //后置通知
    @After("execution(* com.itheima.service.*.*(..))")
    public void after(JoinPoint joinPoint){
        log.info("after ...");
    }

    //返回后通知（程序在正常执行的情况下，会执行的后置通知）
    @AfterReturning("execution(* com.itheima.service.*.*(..))")
    public void afterReturning(JoinPoint joinPoint){
        log.info("afterReturning ...");
    }

    //异常通知（程序在出现异常的情况下，执行的后置通知）
    @AfterThrowing("execution(* com.itheima.service.*.*(..))")
    public void afterThrowing(JoinPoint joinPoint){
        log.info("afterThrowing ...");
    }
}

~~~



重新启动SpringBoot服务，进行测试：

**1. 没有异常情况下：**

- 使用postman测试查询所有部门数据

![image-20230110165514461](O:/BaiduSyncdisk/other/课/黑马/JAVAWeb/day13-SpringBootWeb AOP/讲义/assets/image-20230110165514461.png)

- 查看idea中控制台日志输出

![image-20230110165806934](O:/BaiduSyncdisk/other/课/黑马/JAVAWeb/day13-SpringBootWeb AOP/讲义/assets/image-20230110165806934.png)

> 程序没有发生异常的情况下，@AfterThrowing标识的通知方法不会执行。



**2. 出现异常情况下：**

修改DeptServiceImpl业务实现类中的代码： 添加异常

~~~java
@Slf4j
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> list() {

        List<Dept> deptList = deptMapper.list();

        //模拟异常
        int num = 10/0;

        return deptList;
    }
    
    //省略其他代码...
}
~~~

重新启动SpringBoot服务，测试发生异常情况下通知的执行：

- 查看idea中控制台日志输出

![image-20230110171006874](O:/BaiduSyncdisk/other/课/黑马/JAVAWeb/day13-SpringBootWeb AOP/讲义/assets/image-20230110171006874.png)

> 程序发生异常的情况下：
>
> - @AfterReturning标识的通知方法不会执行，@AfterThrowing标识的通知方法执行了
>
> - @Around环绕通知中原始方法调用时有异常，通知中的环绕后的代码逻辑也不会在执行了 （因为原始方法调用已经出异常了）



在使用通知时的注意事项：

- @Around环绕通知需要自己调用 ProceedingJoinPoint.proceed() 来让原始方法执行，其他通知不需要考虑目标方法执行
- @Around环绕通知方法的返回值，必须指定为Object，来接收原始方法的返回值，否则原始方法执行完毕，是获取不到返回值的。



五种常见的通知类型，我们已经测试完毕了，此时我们再来看一下刚才所编写的代码，有什么问题吗？

~~~java
//前置通知
@Before("execution(* com.itheima.service.*.*(..))")

//环绕通知
@Around("execution(* com.itheima.service.*.*(..))")
  
//后置通知
@After("execution(* com.itheima.service.*.*(..))")

//返回后通知（程序在正常执行的情况下，会执行的后置通知）
@AfterReturning("execution(* com.itheima.service.*.*(..))")

//异常通知（程序在出现异常的情况下，执行的后置通知）
@AfterThrowing("execution(* com.itheima.service.*.*(..))")
~~~

我们发现啊，每一个注解里面都指定了切入点表达式，而且这些切入点表达式都一模一样。此时我们的代码当中就存在了大量的重复性的切入点表达式，假如此时切入点表达式需要变动，就需要将所有的切入点表达式一个一个的来改动，就变得非常繁琐了。



怎么来解决这个切入点表达式重复的问题？ 答案就是：**抽取**



Spring提供了@PointCut注解，该注解的作用是将公共的切入点表达式抽取出来，需要用到时引用该切入点表达式即可。

~~~java
@Slf4j
@Component
@Aspect
public class MyAspect1 {

    //切入点方法（公共的切入点表达式）
    @Pointcut("execution(* com.itheima.service.*.*(..))")
    private void pt(){

    }

    //前置通知（引用切入点）
    @Before("pt()")
    public void before(JoinPoint joinPoint){
        log.info("before ...");

    }

    //环绕通知
    @Around("pt()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        log.info("around before ...");

        //调用目标对象的原始方法执行
        Object result = proceedingJoinPoint.proceed();
        //原始方法在执行时：发生异常
        //后续代码不在执行

        log.info("around after ...");
        return result;
    }

    //后置通知
    @After("pt()")
    public void after(JoinPoint joinPoint){
        log.info("after ...");
    }

    //返回后通知（程序在正常执行的情况下，会执行的后置通知）
    @AfterReturning("pt()")
    public void afterReturning(JoinPoint joinPoint){
        log.info("afterReturning ...");
    }

    //异常通知（程序在出现异常的情况下，执行的后置通知）
    @AfterThrowing("pt()")
    public void afterThrowing(JoinPoint joinPoint){
        log.info("afterThrowing ...");
    }
}
~~~



需要注意的是：当切入点方法使用private修饰时，仅能在当前切面类中引用该表达式， 当外部其他切面类中也要引用当前类中的切入点表达式，就需要把private改为public，而在引用的时候，具体的语法为：

全类名.方法名()，具体形式如下：

~~~java
@Slf4j
@Component
@Aspect
public class MyAspect2 {
    //引用MyAspect1切面类中的切入点表达式
    @Before("com.itheima.aspect.MyAspect1.pt()")
    public void before(){
        log.info("MyAspect2 -> before ...");
    }
}
~~~

# 178.通知顺序

讲解完了Spring中AOP所支持的5种通知类型之后，接下来我们再来研究通知的执行顺序。

当在项目开发当中，我们定义了多个切面类，而多个切面类中多个切入点都匹配到了同一个目标方法。此时当目标方法在运行的时候，这多个切面类当中的这些通知方法都会运行。

此时我们就有一个疑问，这多个通知方法到底哪个先运行，哪个后运行？ 下面我们通过程序来验证（这里呢，我们就定义两种类型的通知进行测试，一种是前置通知@Before，一种是后置通知@After）



定义多个切面类：

~~~java
@Slf4j
@Component
@Aspect
public class MyAspect2 {
    //前置通知
    @Before("execution(* com.itheima.service.*.*(..))")
    public void before(){
        log.info("MyAspect2 -> before ...");
    }

    //后置通知
    @After("execution(* com.itheima.service.*.*(..))")
    public void after(){
        log.info("MyAspect2 -> after ...");
    }
}

~~~

~~~java
@Slf4j
@Component
@Aspect
public class MyAspect3 {
    //前置通知
    @Before("execution(* com.itheima.service.*.*(..))")
    public void before(){
        log.info("MyAspect3 -> before ...");
    }

    //后置通知
    @After("execution(* com.itheima.service.*.*(..))")
    public void after(){
        log.info("MyAspect3 ->  after ...");
    }
}
~~~

~~~java
@Slf4j
@Component
@Aspect
public class MyAspect4 {
    //前置通知
    @Before("execution(* com.itheima.service.*.*(..))")
    public void before(){
        log.info("MyAspect4 -> before ...");
    }

    //后置通知
    @After("execution(* com.itheima.service.*.*(..))")
    public void after(){
        log.info("MyAspect4 -> after ...");
    }
}

~~~



重新启动SpringBoot服务，测试通知的执行顺序：

> 备注：
>
> 1.  把DeptServiceImpl实现类中模拟异常的代码删除或注释掉。
>
> 2.  注释掉其他切面类(把@Aspect注释即可)，仅保留MyAspect2、MyAspect3、MyAspect4 ，这样就可以清晰看到执行的结果，而不被其他切面类干扰。

- 使用postman测试查询所有部门数据

![image-20230110165514461](O:/BaiduSyncdisk/other/课/黑马/JAVAWeb/day13-SpringBootWeb AOP/讲义/assets/image-20230110165514461.png)

- 查看idea中控制台日志输出

![image-20230110211208549](O:/BaiduSyncdisk/other/课/黑马/JAVAWeb/day13-SpringBootWeb AOP/讲义/assets/image-20230110211208549.png)



通过以上程序运行可以看出在不同切面类中，默认按照切面类的类名字母排序：

- 目标方法前的通知方法：字母排名靠前的先执行
- 目标方法后的通知方法：字母排名靠前的后执行



如果我们想控制通知的执行顺序有两种方式：

1. 修改切面类的类名（这种方式非常繁琐、而且不便管理）
2. 使用Spring提供的@Order注解



使用@Order注解，控制通知的执行顺序：

~~~java
@Slf4j
@Component
@Aspect
@Order(2)  //切面类的执行顺序（前置通知：数字越小先执行; 后置通知：数字越小越后执行）
public class MyAspect2 {
    //前置通知
    @Before("execution(* com.itheima.service.*.*(..))")
    public void before(){
        log.info("MyAspect2 -> before ...");
    }

    //后置通知 
    @After("execution(* com.itheima.service.*.*(..))")
    public void after(){
        log.info("MyAspect2 -> after ...");
    }
}
~~~

~~~java
@Slf4j
@Component
@Aspect
@Order(3)  //切面类的执行顺序（前置通知：数字越小先执行; 后置通知：数字越小越后执行）
public class MyAspect3 {
    //前置通知
    @Before("execution(* com.itheima.service.*.*(..))")
    public void before(){
        log.info("MyAspect3 -> before ...");
    }

    //后置通知
    @After("execution(* com.itheima.service.*.*(..))")
    public void after(){
        log.info("MyAspect3 ->  after ...");
    }
}
~~~

~~~java
@Slf4j
@Component
@Aspect
@Order(1) //切面类的执行顺序（前置通知：数字越小先执行; 后置通知：数字越小越后执行）
public class MyAspect4 {
    //前置通知
    @Before("execution(* com.itheima.service.*.*(..))")
    public void before(){
        log.info("MyAspect4 -> before ...");
    }

    //后置通知
    @After("execution(* com.itheima.service.*.*(..))")
    public void after(){
        log.info("MyAspect4 -> after ...");
    }
}
~~~



重新启动SpringBoot服务，测试通知执行顺序：

![image-20230110212523787](O:/BaiduSyncdisk/other/课/黑马/JAVAWeb/day13-SpringBootWeb AOP/讲义/assets/image-20230110212523787.png)



> 通知的执行顺序大家主要知道两点即可：
>
> 1. 不同的切面类当中，默认情况下通知的执行顺序是与切面类的类名字母排序是有关系的
>
>    - 目标方法前的通知方法：字母排名靠前的先执行
>
>    - 目标方法后的通知方法：字母排名靠前的后执行
>
> 2. 可以在切面类上面加上@Order注解，来控制不同的切面类通知的执行顺序（前置通知：数字越小先执行; 后置通知：数字越小越后执行）
>
> 

# 179.入点表达式

从AOP的入门程序到现在，我们一直都在使用切入点表达式来描述切入点。下面我们就来详细的介绍一下切入点表达式的具体写法。

切入点表达式：

- 描述切入点方法的一种表达式

- 作用：主要用来决定项目中的哪些方法需要加入通知

- 常见形式：

  1. execution(……)：根据方法的签名来匹配

  ![image-20230110214150215](O:/BaiduSyncdisk/other/课/黑马/JAVAWeb/day13-SpringBootWeb AOP/讲义/assets/image-20230110214150215.png)

  2. @annotation(……) ：根据注解匹配

  ![image-20230110214242083](O:/BaiduSyncdisk/other/课/黑马/JAVAWeb/day13-SpringBootWeb AOP/讲义/assets/image-20230110214242083.png)

首先我们先学习第一种最为常见的execution切入点表达式。



#### execution

execution主要根据方法的返回值、包名、类名、方法名、方法参数等信息来匹配，语法为：

~~~
execution(访问修饰符?  返回值  包名.类名.?方法名(方法参数) throws 异常?)
~~~

其中带`?`的表示可以省略的部分

- 访问修饰符：可省略（比如: public、protected）

- 包名.类名： 可省略（不建议，因为匹配范围过大会印象匹配的效率）

- throws 异常：可省略（注意是方法上声明抛出的异常，不是实际抛出的异常）（一般不会省略）

示例：

~~~java
@Before("execution(void com.itheima.service.impl.DeptServiceImpl.delete(java.lang.Integer))")
~~~



可以使用通配符描述切入点

- `*` ：单个独立的任意符号，可以通配任意返回值、包名、类名、方法名、任意类型的一个参数，也可以通配包、类、方法名的一部分

- `..` ：多个连续的任意符号，可以通配任意层级的包，或任意类型、任意个数的参数



切入点表达式的语法规则：

1. 方法的访问修饰符可以省略
2. 返回值可以使用`*`号代替（任意返回值类型）
3. 包名可以使用`*`号代替，代表任意包（一层包使用一个`*`）
4. 使用`..`配置包名，标识此包以及此包下的所有子包
5. 类名可以使用`*`号代替，标识任意类
6. 方法名可以使用`*`号代替，表示任意方法
7. 参数写的是参数的类型的全类名
8. 可以使用 `*`  配置参数，一个任意类型的参数
9. 可以使用`..` 配置参数，任意个任意类型的参数



**切入点表达式示例**

- 省略方法的修饰符号 

  ~~~java
  execution(void com.itheima.service.impl.DeptServiceImpl.delete(java.lang.Integer))
  ~~~

- 使用`*`代替返回值类型

  ~~~java
  execution(* com.itheima.service.impl.DeptServiceImpl.delete(java.lang.Integer))
  ~~~

- 使用`*`代替包名（一层包使用一个`*`）

  ~~~java
  execution(* com.itheima.*.*.DeptServiceImpl.delete(java.lang.Integer))
  ~~~

- 使用`..`省略包名

  ~~~java
  execution(* com..DeptServiceImpl.delete(java.lang.Integer))    
  ~~~

- 使用`*`代替类名

  ~~~java
  execution(* com..*.delete(java.lang.Integer))   
  ~~~

- 使用`*`代替方法名

  ~~~java
  execution(* com..*.*(java.lang.Integer))   
  ~~~

- 使用 `*` 代替参数

  ```java
  execution(* com.itheima.service.impl.DeptServiceImpl.delete(*))
  ```

- 使用`..`省略参数

  ~~~java
  execution(* com..*.*(..))
  ~~~

​	

注意事项：

- 根据业务需要，可以使用 且（&&）、或（||）、非（!） 来组合比较复杂的切入点表达式。

  ```java
  execution(* com.itheima.service.DeptService.list(..)) || execution(* com.itheima.service.DeptService.delete(..))
  ```

  

切入点表达式的书写建议：

- 所有业务方法名在命名时尽量规范，方便切入点表达式快速匹配。如：查询类方法都是 find 开头，更新类方法都是update开头

  ~~~java
  //业务类
  @Service
  public class DeptServiceImpl implements DeptService {
      
      public List<Dept> findAllDept() {
         //省略代码...
      }
      
      public Dept findDeptById(Integer id) {
         //省略代码...
      }
      
      public void updateDeptById(Integer id) {
         //省略代码...
      }
      
      public void updateDeptByMoreCondition(Dept dept) {
         //省略代码...
      }
      //其他代码...
  }
  ~~~

  ~~~java
  //匹配DeptServiceImpl类中以find开头的方法
  execution(* com.itheima.service.impl.DeptServiceImpl.find*(..))
  ~~~

- 描述切入点方法通常基于接口描述，而不是直接描述实现类，增强拓展性

  ~~~java
  execution(* com.itheima.service.DeptService.*(..))
  ~~~

- 在满足业务需要的前提下，尽量缩小切入点的匹配范围。如：包名匹配尽量不使用 ..，使用 * 匹配单个包

  ~~~java
  execution(* com.itheima.*.*.DeptServiceImpl.find*(..))
  ~~~

  

# 180.@annotation

已经学习了execution切入点表达式的语法。那么如果我们要匹配多个无规则的方法，比如：list()和 delete()这两个方法。这个时候我们基于execution这种切入点表达式来描述就不是很方便了。而在之前我们是将两个切入点表达式组合在了一起完成的需求，这个是比较繁琐的。

我们可以借助于另一种切入点表达式annotation来描述这一类的切入点，从而来简化切入点表达式的书写。



实现步骤：

1. 编写自定义注解

2. 在业务类要做为连接点的方法上添加自定义注解

   

**自定义注解**：MyLog

~~~java
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyLog {
}
~~~



**业务类**：DeptServiceImpl

~~~java
@Slf4j
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;

    @Override
    @MyLog //自定义注解（表示：当前方法属于目标方法）
    public List<Dept> list() {
        List<Dept> deptList = deptMapper.list();
        //模拟异常
        //int num = 10/0;
        return deptList;
    }

    @Override
    @MyLog  //自定义注解（表示：当前方法属于目标方法）
    public void delete(Integer id) {
        //1. 删除部门
        deptMapper.delete(id);
    }


    @Override
    public void save(Dept dept) {
        dept.setCreateTime(LocalDateTime.now());
        dept.setUpdateTime(LocalDateTime.now());
        deptMapper.save(dept);
    }

    @Override
    public Dept getById(Integer id) {
        return deptMapper.getById(id);
    }

    @Override
    public void update(Dept dept) {
        dept.setUpdateTime(LocalDateTime.now());
        deptMapper.update(dept);
    }
}
~~~



**切面类**

~~~java
@Slf4j
@Component
@Aspect
public class MyAspect6 {
    //针对list方法、delete方法进行前置通知和后置通知

    //前置通知
    @Before("@annotation(com.itheima.anno.MyLog)")
    public void before(){
        log.info("MyAspect6 -> before ...");
    }

    //后置通知
    @After("@annotation(com.itheima.anno.MyLog)")
    public void after(){
        log.info("MyAspect6 -> after ...");
    }
}
~~~

重启SpringBoot服务，测试查询所有部门数据，查看控制台日志：

![image-20230110224447047](O:/BaiduSyncdisk/other/课/黑马/JAVAWeb/day13-SpringBootWeb AOP/讲义/assets/image-20230110224447047.png)



到此我们两种常见的切入点表达式我已经介绍完了。

- execution切入点表达式
  - 根据我们所指定的方法的描述信息来匹配切入点方法，这种方式也是最为常用的一种方式
  - 如果我们要匹配的切入点方法的方法名不规则，或者有一些比较特殊的需求，通过execution切入点表达式描述比较繁琐
- annotation 切入点表达式
  - 基于注解的方式来匹配切入点方法。这种方式虽然多一步操作，我们需要自定义一个注解，但是相对来比较灵活。我们需要匹配哪个方法，就在方法上加上对应的注解就可以了





# 181.连接点

讲解完了切入点表达式之后，接下来我们再来讲解最后一个部分连接点。我们前面在讲解AOP核心概念的时候，我们提到过什么是连接点，连接点可以简单理解为可以被AOP控制的方法。

我们目标对象当中所有的方法是不是都是可以被AOP控制的方法。而在SpringAOP当中，连接点又特指方法的执行。



在Spring中用JoinPoint抽象了连接点，用它可以获得方法执行时的相关信息，如目标类名、方法名、方法参数等。

- 对于@Around通知，获取连接点信息只能使用ProceedingJoinPoint类型

- 对于其他四种通知，获取连接点信息只能使用JoinPoint，它是ProceedingJoinPoint的父类型



示例代码：

~~~java
@Slf4j
@Component
@Aspect
public class MyAspect7 {

    @Pointcut("@annotation(com.itheima.anno.MyLog)")
    private void pt(){}
   
    //前置通知
    @Before("pt()")
    public void before(JoinPoint joinPoint){
        log.info(joinPoint.getSignature().getName() + " MyAspect7 -> before ...");
    }
    
    //后置通知
    @Before("pt()")
    public void after(JoinPoint joinPoint){
        log.info(joinPoint.getSignature().getName() + " MyAspect7 -> after ...");
    }

    //环绕通知
    @Around("pt()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        //获取目标类名
        String name = pjp.getTarget().getClass().getName();
        log.info("目标类名：{}",name);

        //目标方法名
        String methodName = pjp.getSignature().getName();
        log.info("目标方法名：{}",methodName);

        //获取方法执行时需要的参数
        Object[] args = pjp.getArgs();
        log.info("目标方法参数：{}", Arrays.toString(args));

        //执行原始方法
        Object returnValue = pjp.proceed();

        return returnValue;
    }
}

~~~

重新启动SpringBoot服务，执行查询部门数据的功能：

![image-20230110231629140](O:/BaiduSyncdisk/other/课/黑马/JAVAWeb/day13-SpringBootWeb AOP/讲义/assets/image-20230110231629140.png)









## 4. AOP案例

SpringAOP的相关知识我们就已经全部学习完毕了。最后我们要通过一个案例来对AOP进行一个综合的应用。

### 4.1 需求

需求：将案例中增、删、改相关接口的操作日志记录到数据库表中

- 就是当访问部门管理和员工管理当中的增、删、改相关功能接口时，需要详细的操作日志，并保存在数据表中，便于后期数据追踪。

操作日志信息包含：

- 操作人、操作时间、执行方法的全类名、执行方法名、方法运行时参数、返回值、方法执行时长

> 所记录的日志信息包括当前接口的操作人是谁操作的，什么时间点操作的，以及访问的是哪个类当中的哪个方法，在访问这个方法的时候传入进来的参数是什么，访问这个方法最终拿到的返回值是什么，以及整个接口方法的运行时长是多长时间。



### 4.2 分析

问题1：项目当中增删改相关的方法是不是有很多？

- 很多

问题2：我们需要针对每一个功能接口方法进行修改，在每一个功能接口当中都来记录这些操作日志吗？

- 这种做法比较繁琐



以上两个问题的解决方案：可以使用AOP解决(每一个增删改功能接口中要实现的记录操作日志的逻辑代码是相同)。

> 可以把这部分记录操作日志的通用的、重复性的逻辑代码抽取出来定义在一个通知方法当中，我们通过AOP面向切面编程的方式，在不改动原始功能的基础上来对原始的功能进行增强。目前我们所增强的功能就是来记录操作日志，所以也可以使用AOP的技术来实现。使用AOP的技术来实现也是最为简单，最为方便的。



问题3：既然要基于AOP面向切面编程的方式来完成的功能，那么我们要使用 AOP五种通知类型当中的哪种通知类型？

- 答案：环绕通知

> 所记录的操作日志当中包括：操作人、操作时间，访问的是哪个类、哪个方法、方法运行时参数、方法的返回值、方法的运行时长。
>
> 方法返回值，是在原始方法执行后才能获取到的。
>
> 方法的运行时长，需要原始方法运行之前记录开始时间，原始方法运行之后记录结束时间。通过计算获得方法的执行耗时。
>
> 
>
> 基于以上的分析我们确定要使用Around环绕通知。



问题4：最后一个问题，切入点表达式我们该怎么写？

- 答案：使用annotation来描述表达式

> 要匹配业务接口当中所有的增删改的方法，而增删改方法在命名上没有共同的前缀或后缀。此时如果使用execution切入点表达式也可以，但是会比较繁琐。 当遇到增删改的方法名没有规律时，就可以使用 annotation切入点表达式



### 4.3 步骤

简单分析了一下大概的实现思路后，接下来我们就要来完成案例了。案例的实现步骤其实就两步：

- 准备工作
  1. 引入AOP的起步依赖
  2. 导入资料中准备好的数据库表结构，并引入对应的实体类
- 编码实现
  1. 自定义注解@Log
  2. 定义切面类，完成记录操作日志的逻辑









### 4.4 实现

#### 4.4.1 准备工作

1. AOP起步依赖

~~~xml
<!--AOP起步依赖-->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-aop</artifactId>
</dependency>
~~~

2. 导入资料中准备好的数据库表结构，并引入对应的实体类

数据表

~~~mysql
-- 操作日志表
create table operate_log(
    id int unsigned primary key auto_increment comment 'ID',
    operate_user int unsigned comment '操作人',
    operate_time datetime comment '操作时间',
    class_name varchar(100) comment '操作的类名',
    method_name varchar(100) comment '操作的方法名',
    method_params varchar(1000) comment '方法参数',
    return_value varchar(2000) comment '返回值',
    cost_time bigint comment '方法执行耗时, 单位:ms'
) comment '操作日志表';
~~~

实体类

~~~java
//操作日志实体类
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OperateLog {
    private Integer id; //主键ID
    private Integer operateUser; //操作人ID
    private LocalDateTime operateTime; //操作时间
    private String className; //操作类名
    private String methodName; //操作方法名
    private String methodParams; //操作方法参数
    private String returnValue; //操作方法返回值
    private Long costTime; //操作耗时
}
~~~

Mapper接口

~~~java
@Mapper
public interface OperateLogMapper {

    //插入日志数据
    @Insert("insert into operate_log (operate_user, operate_time, class_name, method_name, method_params, return_value, cost_time) " +
            "values (#{operateUser}, #{operateTime}, #{className}, #{methodName}, #{methodParams}, #{returnValue}, #{costTime});")
    public void insert(OperateLog log);

}
~~~



#### 4.4.2 编码实现

- 自定义注解@Log

~~~java
/**
 * 自定义Log注解
 */
@Target({ElementType.METHOD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Log {
}
~~~



- 修改业务实现类，在增删改业务方法上添加@Log注解

~~~java
@Slf4j
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    @Override
    @Log
    public void update(Emp emp) {
        emp.setUpdateTime(LocalDateTime.now()); //更新修改时间为当前时间

        empMapper.update(emp);
    }

    @Override
    @Log
    public void save(Emp emp) {
        //补全数据
        emp.setCreateTime(LocalDateTime.now());
        emp.setUpdateTime(LocalDateTime.now());
        //调用添加方法
        empMapper.insert(emp);
    }

    @Override
    @Log
    public void delete(List<Integer> ids) {
        empMapper.delete(ids);
    }

    //省略其他代码...
}
~~~

以同样的方式，修改EmpServiceImpl业务类



- 定义切面类，完成记录操作日志的逻辑

~~~java
@Slf4j
@Component
@Aspect //切面类
public class LogAspect {

    @Autowired
    private HttpServletRequest request;

    @Autowired
    private OperateLogMapper operateLogMapper;

    @Around("@annotation(com.itheima.anno.Log)")
    public Object recordLog(ProceedingJoinPoint joinPoint) throws Throwable {
        //操作人ID - 当前登录员工ID
        //获取请求头中的jwt令牌, 解析令牌
        String jwt = request.getHeader("token");
        Claims claims = JwtUtils.parseJWT(jwt);
        Integer operateUser = (Integer) claims.get("id");

        //操作时间
        LocalDateTime operateTime = LocalDateTime.now();

        //操作类名
        String className = joinPoint.getTarget().getClass().getName();

        //操作方法名
        String methodName = joinPoint.getSignature().getName();

        //操作方法参数
        Object[] args = joinPoint.getArgs();
        String methodParams = Arrays.toString(args);

        long begin = System.currentTimeMillis();
        //调用原始目标方法运行
        Object result = joinPoint.proceed();
        long end = System.currentTimeMillis();

        //方法返回值
        String returnValue = JSONObject.toJSONString(result);

        //操作耗时
        Long costTime = end - begin;


        //记录操作日志
        OperateLog operateLog = new OperateLog(null,operateUser,operateTime,className,methodName,methodParams,returnValue,costTime);
        operateLogMapper.insert(operateLog);

        log.info("AOP记录操作日志: {}" , operateLog);

        return result;
    }

}
~~~

> 代码实现细节： 获取request对象，从请求头中获取到jwt令牌，解析令牌获取出当前用户的id。



重启SpringBoot服务，测试操作日志记录功能：

- 添加一个新的部门

![image-20230111001114301](O:/BaiduSyncdisk/other/课/黑马/JAVAWeb/day13-SpringBootWeb AOP/讲义/assets/image-20230111001114301.png)

- 数据表

![image-20230111001230731](O:/BaiduSyncdisk/other/课/黑马/JAVAWeb/day13-SpringBootWeb AOP/讲义/assets/image-20230111001230731.png)



































































































