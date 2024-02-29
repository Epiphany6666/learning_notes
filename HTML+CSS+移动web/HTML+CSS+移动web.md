ctrl + b：关闭侧边栏

点击前面的行号：选中一行

alt + z：折行

0比较特殊，可以没有单位

ctrl + h：替换

文件图标插件：vscode-icons

# 3.准备开发环境

将谷歌浏览器设置为默认浏览器：

![image-20231223064914110](.\assets\image-20231223064914110.png)

![image-20231223064957309](.\assets\image-20231223064957309.png)

> 
>
> 阶段目标：掌握HTML、CSS常用布局技巧，能够独立制作网页。

day01：HTML 基础

> 目标：掌握标签基本语法，能够独立布局文章页。

01-今日课程介绍

> 今日目标：掌握标签基本语法，能够独立布局文章页。

核心技术点

* 网页组成

* 排版标签

* 多媒体标签及属性

* 综合案例一 - 个人简介

  ![1680242340931](assets/1680242340931.png)

* 综合案例二 - Vue 简介

  ![1680242362352](assets/1680242362352.png)

  

# 4.标签语法

HTML 超文本标记语言——HyperText Markup Language。 

* 超文本：链接
* 标记：标签，带尖括号的文本

![1680242502155](assets/1680242502155.png)

标签结构

* 标签要成对出现，中间包裹内容
* <>里面放英文字母（标签名）
* 结束标签比开始标签多 /
* 标签分类：双标签和单标签

```html
<strong>需要加粗的文字<strong> //双标签
<br>
<hr>//单标签
```

需要包裹内容一定是双标签，如果是换行什么的就是单标签

![1680242555328](assets/1680242555328.png)

# 5.HTML骨架

* html：整个网页
* head：网页头部，用来存放给浏览器看的信息，例如 CSS
  * title：网页标题
* body：网页主体，用来存放给用户看的信息，例如图片、文字

```html
<html>
  <head>
    <title>网页标题</title>
  </head>
  <body>
    网页主体
  </body>
</html>
```

> 提示
>
> VS Code 可以快速生成骨架：在 HTML 文件（.html）中，!（英文）配合 Enter / Tab 键

# 6.标签的关系

> 作用：明确标签的书写位置，让代码格式更整齐

* 父子关系（嵌套关系）：子级标签换行且缩进（Tab键）

  ![1680255766672](assets/1680255766672.png)

* 兄弟关系（并列关系）：兄弟标签换行要对齐

  ![1680255775150](assets/1680255775150.png)

  > 向后缩进：Tab
  >
  > 向前缩进：Shift + Tab
  
  

# 7.注释

概念：注释是对代码的解释和说明，能够提高程序的可读性，方便理解、查找代码。

注释不会再浏览器中显示。

在 VS Code 中，**添加 / 删除**注释的快捷键：**Ctrl + /** 

```html
<!-- 我是 HTML 注释 -->
```

# 8.标题标签

双标签。

一般用在新闻标题、文章标题、网页区域名称、产品名称等等。 

```html
<h1>一级标题</h1>
<h2>二级标题</h2>
<h3>三级标题</h3>
<h4>四级标题</h4>
<h5>五级标题</h5>
<h6>六级标题</h6>
```

显示特点：

* 文字加粗
* 字号逐渐减小
* 独占一行（换行）

> 经验
>
> 1. h1 标签在一个网页中只能用一次，用来放新闻标题或网页的 logo
>
>    > h1里存放的是最重要的内容
>
> 2. h2 ~ h6 没有使用次数的限制

## 段落标签

双标签。                                           

一般用在新闻段落、文章段落、产品描述信息等等。 

title 属性用于鼠标悬浮时显示的小文字

```html
<p title="abc">段落</p>
```

显示特点：

* 独占一行（块级标签）
* 段落之间存在间隙
* 并且如果文字过多，会自动换到第2行

# 9.换行和水平线

单标签。

> hr：horizontal rules
>
> br：barter rabbet

* 换行：br

  > PS：浏览器不识别代码中的Enter键换行

* 水平线：hr

```html
<br>
<hr>
```

# 10.文本格式化标签

作用：为文本添加特殊格式，以突出重点。常见的文本格式：加粗、倾斜、下划线、删除线等。 

没有换行效果。

> b：bold
>
> em：emphasis
>
> ins：insert，ins标签准确来说是:插入字效果
>
> u：underline 下划线
>
> s：strikethrough删除线

![1680314078647](assets/1680314078647.png)

> 提示：实际工作中，一般都使用左边的标签。这是因为左边的strong、em、ins、del 标签自带强调含义（语义）。 既然都是重点了，那肯定要强调。

# 11.图像标签

单标签。

作用：在网页中插入图片

```html
<img  src="图片的 URL">
```

src用于指定图像的位置和名称，是 <img> 的必须属性。 

> 引入图片时，./有文件提示
>
> 图片标签不换行

图像属性

> width和height了解即可，因为它们一般是通过CSS样式来设置的。
>
> alt：alternative 替换/交替

![1680314152822](assets/1680314152822.png)

属性语法

* 属性名="属性值"
* 属性写在尖括号里面，标签名后面，标签名和属性之间用空格隔开，不区分先后顺序

![1680314195951](assets/1680314195951.png)

> 这是为了解决以前网速慢的问题，图片加载不出来。

![image-20231223090603267](.\assets\image-20231223090603267.png)

![image-20231223090827368](.\assets\image-20231223090827368.png)

> 浏览器缩放图片，默认是等比例缩放的，所以width和height一般写一个即可。

# 12.路径

> 在VSCode里，建议以./开头，能有代码提示

概念：路径指的是查找文件时，从**起点**到**终点**经历的**路线**。 

路径分类：

* 相对路径：从当前文件位置出发查找目标文件
* 绝对路径：从盘符出发查找目标文件
  * Windows 电脑从盘符出发
  * Mac 电脑从根目录出发

**相对路径**

查找方式：从**当前文件位置**出发查找目标文件

特殊符号：

* **/** 表示进入某个文件夹里面          → 文件夹名/
* **. ** 表示当前文件所在文件夹           → ./
* **..** 表示当前文件的上一级文件夹 → ../   

![1680314322997](assets/1680314322997.png)

**绝对路径**

查找方式：Windows 电脑从盘符出发；Mac 电脑从根目录（/）出发

```html
<img  src="C:\images\mao.jpg">
```

> 提示
>
> 1. Windows 默认是 \ （反斜线），其他系统是 /，建议统一写为 / 
>
> 2. 特殊的绝对路径 → 文件的在线网址：<https://www.itheima.com/images/logo.png> "
>
>    ![image-20231223092203852](.\assets\image-20231223092203852.png)
>
>    应用场景：网页底部**友情链接**

![1680314503056](assets/1680314503056.png)

> 找自己电脑的文件一般都是用相对路径，绝对路径太绝对了

# 13.超链接标签

作用：点击跳转到其他页面。 

```html
<a href="https://www.baidu.com">跳转到百度</a>
```

**href 属性值是跳转地址，网站和本地都可以，是超链接的必须属性。**

> 跳转到本地，直接写相对路径即可

超链接默认是在当前（_self）窗口跳转页面，添加 **target="_blank"** 实现**新窗口**打开页面。

拓展：开发初期，不确定跳转地址，则 href 属性值写为 **#**，表示**空链接**，页面不会跳转，在当前页面刷新一次。

```html
<a href="https://www.baidu.com/">跳转到百度</a>

<!-- 跳转到本地文件：相对路径查找 --> 
<!-- target="_blank" 新窗口跳转页面 --> 
<a href="./01-标签的写法.html" target="_blank">跳转到01-标签的写法</a>

<!-- 开发初期，不知道超链接的跳转地址，href属性值写#，表示空链接，不会跳转 -->
<a href="#">空链接</a>
```

# 14.音频

```html
<audio src="音频的 URL"></audio>
```

常用属性

![1680314629860](assets/1680314629860.png)

> 拓展：书写 HTML5 属性时，如果属性名和属性值相同，可以简写为一个单词。 所以controls的全写是：controls = "controls"
>
> 浏览器自动播放音频的功能是禁用的

```html
<!-- 在 HTML5 里面，如果属性名和属性值完全一样，可以简写为一个单词 -->
<audio src="./media/music.mp3" controls loop autoplay></audio>
```

## 视频

```html
<video src="视频的 URL"></video>
```

常用属性

> autoplay需要配合muted一起使用，不配合的话，就算加了autoplay，也是不能自动播放的。

![1680314703735](assets/1680314703735.png)

```html
<!-- 在浏览器中，想要自动播放，必须有 muted 属性 -->
<video src="./media/vue.mp4" controls loop muted autoplay></video>
```

# 15.综合案例_个人简介

> 网页制作思路：从上到下，先整体再局部，逐步分析制作
>
> 分析内容 → 写代码 → 保存 → 刷新浏览器，看效果

> 1. 在段落里写标签是没有提示的，此时就需要先空一格，然后把光标移到空格前面，此时就有提示了，写完标签后，再将这个空格删掉即可。
>
>    ![image-20231223095052724](.\assets\image-20231223095052724.png)
>
> 2. 这些超链接，我们里面可以先写一个#，最后再来补充

![1680314754557](assets/1680314754557.png)

```html
<h1>尤雨溪</h1>
<hr>
<p>尤雨溪，前端框架<a href="../17-综合案例二/vue简介.html">Vue.js</a>的作者，<a href="#">HTML5</a>版Clear的打造人，独立开源开发者。曾就职于Google Creative Labs和Meteor Development Group。由于工作中大量接触开源的项目<a href="#">JavaScript</a>，最后自己也走上了开源之路，现全职开发和维护<a href="#">Vue.js</a>。

</p>
<img src="./photo.jpg" alt="尤雨溪的照片" title="尤雨溪">
<h2>学习经历</h2>
<p>尤雨溪毕业于上海复旦附中，在美国完成大学学业，本科毕业于Colgate University，后在Parsons设计学院获得Design & Technology艺术硕士学位，任职于纽约Google Creative Lab。</p>
<h2>主要成就</h2>
<p>尤雨溪<strong>大学专业并非是计算机专业</strong>，在大学期间他学习专业是室内艺术和艺术史，后来读了美术设计和技术的硕士， <ins>正是在读硕士期间，他偶然接触到了JavaScript ，从此被这门编程语言深深吸引，开启了自己的前端生涯</ins> 。</p>
<p>2014年2月，开发了一个前端开发库Vue.js。Vue.js 是构建 Web 界面的 JavaScript 框架，是一个通过简洁的API提供高效的数据绑定和灵活的组件系统。</p>
<h2>社会任职</h2>
<p>2016年9月3日，在南京的JSConf上，Vue作者尤雨溪正式宣布加盟阿里巴巴Weex团队，尤雨溪称他将以技术顾问的身份加入Weex团队来做 Vue 和 Weex 的 JavaScript runtime 整合，目标是让大家能用 Vue 的语法跨三端。</p>
```

16-综合案例二-Vue简介

![1680314805528](assets/1680314805528.png)

```html
<h1>Vue.js</h1>
<p>Vue (读音 /vjuː/，类似于 view) 是一套用于构建用户界面的渐进式JavaScript框架。 [5] 与其它大型框架不同的是，Vue 被设计为可以自底向上逐层应用。Vue 的核心库只关注视图层，不仅易于上手，还便于与第三方库或既有项目整合。另一方面，当与现代化的工具链以及各种支持类库结合使用时，Vue 也完全能够为复杂的单页应用（SPA）提供驱动。</p>
<p>其作者为<a href="../16-综合案例一/个人简介.html" target="_blank">尤雨溪</a></p>
<h2>主要功能</h2>
<p>Vue.js是一套构建用户界面的渐进式框架。与其他重量级框架不同的是，Vue采用自底向上增量开发的设计。Vue 的核心库只关注视图层，并且非常容易学习，非常容易与其它库或已有项目整合。另一方面，Vue 完全有能力驱动采用单文件组件和Vue生态系统支持的库开发的复杂单页应用。</p>
<p>Vue.js 的目标是通过尽可能简单的 API 实现响应的数据绑定和组合的视图组件。</p>
<p>Vue.js 自身不是一个全能框架——它只聚焦于视图层。因此它非常容易学习，非常容易与其它库或已有项目整合。另一方面，在与相关工具和支持库一起使用时 [2] ，Vue.js 也能驱动复杂的单页应用。</p>
<video src="../media/vue.mp4" controls></video>
```

day02：列表、表格、表单

> 目标：掌握嵌套关系标签的写法，使用列表标签布局网页

# 18.列表

作用：布局内容排列整齐的区域。

列表分类：无序列表、有序列表、定义列表。

### 无序列表

使用频率最高

![image-20231223104334340](.\assets\image-20231223104334340.png)

![image-20231223104538098](.\assets\image-20231223104538098.png)

作用：布局排列整齐的**不需要规定顺序**的区域。

标签：ul 嵌套 li，ul 是无序列表，li 是列表条目。

> ul：Unordered list不排序列表
>
> li：List Item列表条目

```html
<ul>
  <li>第一项</li>
  <li>第二项</li>
  <li>第三项</li>
  ……
</ul>
```

> 注意事项：
>
> * ul 标签里面只能包裹 li 标签，不能写标题
> * li 标签里面可以包裹任何内容，里面可以写标题
> * li标签是独占一行的

### 有序列表

作用：布局排列整齐的**需要规定顺序**的区域。

标签：ol 嵌套 li，ol 是有序列表，li 是列表条目。

> ol：Ordered List排序列表

```html
<ol>
  <li>第一项</li>
  <li>第二项</li>
  <li>第三项</li>
  ……
</ol>
```

> 注意事项：
>
> * ol 标签里面只能包裹 li 标签
> * li 标签里面可以包裹任何内容

### 定义列表

![1680315652403](O:\BaiduSyncdisk\other\课\黑马\HTML+CSS+移动web\基础班课程资料\笔记\day02\assets\1680315652403.png)

标签：dl 嵌套 dt 和 dd，dl 是定义列表，dt 是定义列表的标题，dd 是定义列表的描述 / 详情。

> dl：Definition lists 定义列表
>
> dt：Definition term 定义列表组
>
> dd：Definition description 定义列表描述
>
> ![image-20231223110300718](.\assets\image-20231223110300718.png)

```html
<dl>
  <dt>列表标题</dt>
  <dd>列表描述 / 详情</dd>
   ……
</dl>
```

> 注意事项：
>
> * dl 里面只能包含dt 和 dd
> * dt 和 dd 里面可以包含任何内容

# 19.表格

cellspacing: 规定单元之间的空间

或者使用border-collapse: collapse;

> `border-collapse: collapse;` 和 `border-spacing: 0;` 在某些方面看似相关，但实际上它们控制的是不同的表格样式属性：
>
> - `border-collapse: collapse;` 指定了当表格边框相遇时是否合并成一个单一的边框。如前所述，当其值为 `collapse` 时，表格单元格间的边框会合并在一处显示，而不是各自独立显示。
> - `border-spacing: 0;` 定义了在 `border-collapse: separate;` 模式下（即边框不合并时），相邻单元格边框之间的间距。当值为 `0` 时，即使是在非合并边框的情况下，也取消了单元格边框之间的任何间距。
>
> 虽然在设置了 `border-collapse: collapse;` 的情况下，`border-spacing` 的值不会直接影响实际边框的表现（因为此时边框已合并，无间距可言），但有时候为了确保在不同浏览器中的兼容性和一致性，或者未来可能改变布局设计，开发者可能会同时声明这两个属性。因此，在实践中并不算严格意义上的重复。
>
> 当设置为 `separate` 时，表格的每个单元格（包括行、列、行组和列组）的边框都将独立显示，并且相邻单元格之间的边框之间会有一段间距，这个间距可以通过 `border-spacing` 属性来指定。（也是`border-collapse`的默认值）

~~~css
cellspacing="0"

table {
    border-collapse: collapse;
    border-spacing: 0;
} 
~~~



网页中的表格与 Excel 表格类似，用来展示数据。 

![1680315690740](O:\BaiduSyncdisk\other\课\黑马\HTML+CSS+移动web\基础班课程资料\笔记\day02\assets\1680315690740.png)

基本使用

标签：table 嵌套 tr，tr 嵌套 th / td。 

> tr：table row
>
> th：Table header cell
>
> td：table data cell

![1680315704565](O:\BaiduSyncdisk\other\课\黑马\HTML+CSS+移动web\基础班课程资料\笔记\day02\assets\1680315704565.png)



> 提示：在网页中，**表格默认没有边框线**，使用 **border 属性**可以为表格添加边框线。
>
> 表格单元格的大小是可以靠内容撑开的。 

```html
<table border="1">
  <tr>
    <th>姓名</th>
    <th>语文</th>
    <th>数学</th>
    <th>总分</th>
  </tr>
  <tr>
    <td>张三</td>
    <td>99</td>
    <td>100</td>
    <td>199</td>
  </tr>
  <tr>
    <td>李四</td>
    <td>98</td>
    <td>100</td>
    <td>198</td>
  </tr>
  <tr>
    <td>总结</td>
    <td>全市第一</td>
    <td>全市第一</td>
    <td>全市第一</td>
  </tr>
</table>
```

### 表格结构标签

这三个标签是给浏览器看的，加了没有任何效果。

作用：用表格结构标签把内容划分区域，让表格结构更清晰，语义更清晰。

1. **结构化分离**：通过 `<thead>`、`<tbody>` 和可选的 `<tfoot>` 分别定义表格的头部、主体和底部，可以清晰地区分表格的不同部分，使得文档结构更加明确。
2. **优化渲染**：浏览器可以根据 `<tbody>` 来优化表格的渲染速度，尤其是在大型表格加载时。例如，在网页内容逐步加载的过程中，只有当 `<tbody>` 内容下载完成后才会显示表格的具体数据行，而表头（`<thead>`）可能先于主体内容呈现给用户。
3. **样式控制**：对 `<tbody>` 应用CSS样式可以方便地为整个表格数据区域设置特定样式，与表头或页脚区分开来。
4. **脚本操作**：在JavaScript或jQuery等脚本处理时，可以通过选择器直接定位到 `<tbody>` 元素，更方便地进行增删改查等操作。
5. **打印优化**：在打印大表格时，有的浏览器会自动重复显示表头信息，而使用 `<thead>` 和 `<tbody>` 结构有助于确保表头和主体数据在多页打印时正确分布。

![1680315774950](O:\BaiduSyncdisk\other\课\黑马\HTML+CSS+移动web\基础班课程资料\笔记\day02\assets\1680315774950.png)

> 提示：表格结构标签可以省略。

# 20.合并单元格

作用：将多个单元格合并成一个单元格，以合并同类信息。 

![1680315812998](O:\BaiduSyncdisk\other\课\黑马\HTML+CSS+移动web\基础班课程资料\笔记\day02\assets\1680315821325.png)

合并单元格的步骤：

1. 明确合并的目标
2. 保留**最左最上**的单元格，添加属性（取值是**数字**，表示需要**合并的单元格数量**）
   * **跨行合并**，保留最上单元格，添加属性 **rowspan**
   * **跨列合并**，保留最左单元格，添加属性 **colspan**
3. 删除其他单元格

```html
<table border="1">
  <thead>
    <tr>
      <th>姓名</th>
      <th>语文</th>
      <th>数学</th>
      <th>总分</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>张三</td>
      <td>99</td>
      <td rowspan="2">100</td>
      <td>199</td>
    </tr>
    <tr>
      <td>李四</td>
      <td>98</td>
      <!-- <td>100</td> -->
      <td>198</td>
    </tr>
  </tbody>
  <tfoot>
    <tr>
      <td>总结</td>
      <td colspan="3">全市第一</td>
      <!-- <td>全市第一</td>
      <td>全市第一</td> -->
    </tr>
  </tfoot>
</table>
```

> 注意：不能跨表格结构标签合并单元格（thead、tbody、tfoot）。

# 21.input 标签

required：非空的，只要是空的就不通过

`autofocus` 是 HTML 中的一个属性，它是一个布尔属性，应用于表单控件元素（如 `<input>`、`<select>`、`<textarea>` 等），用于指示浏览器在页面加载完成后自动将焦点放置到该元素上。

~~~html
<input autofocus required type="text" placeholder="请输入用户名称/手机号码" name="username">
~~~

![image-20240109155220461](O:\BaiduSyncdisk\other\StudyNote\JavaScript\assets\image-20240109155220461.png)

作用：收集用户信息。

使用场景：

* 登录页面
* 注册页面
* 搜索区域

### 标签

input 标签 type 属性值不同，则功能不同。 

> **radio是收音机的意思**，老式的收音机是一排按钮，按下一个其他的都会弹起，类似于单选框的功能。

```html
<input type="..." >

<input type="hidden"> <!-- 隐藏域 -->
```

![1680315984539](O:\BaiduSyncdisk\other\课\黑马\HTML+CSS+移动web\基础班课程资料\笔记\day02\assets\1680315984539.png)

如果快捷键输完<input type="">没提示，删掉双引号，然后再加上双引号，此时就有提示了

![image-20231223114147985](.\assets\image-20231223114147985.png)



### 标签占位文本 

占位文本：提示信息，文本框和密码框都可以使用。 

> placeholder是默认的，但取数据都是通过value取的。

```html
<input type="..." placeholder="提示信息">
```

### 单选框

常用属性

![1680316056402](O:\BaiduSyncdisk\other\课\黑马\HTML+CSS+移动web\基础班课程资料\笔记\day02\assets\1680316056402.png)



```html
<input type="radio" name="gender" checked> 男
<input type="radio" name="gender"> 女
```

> 提示：name 属性值自定义。

### 上传文件 

默认情况下，文件上传表单控件只能上传一个文件，添加 multiple 属性可以实现文件多选功能。

```html
<input type="file" multiple>
```

### 多选框

多选框也叫复选框，默认选中：checked（比如用户之前选中的，然后点击编辑也需要依然在）。

emment写法 input:checkbox

```html
<input type="checkbox" checked> 敲前端代码
```

# 22.下拉菜单

![1680316175031](O:\BaiduSyncdisk\other\课\黑马\HTML+CSS+移动web\基础班课程资料\笔记\day02\assets\1680316175031.png)

标签：select 嵌套 option，select 是下拉菜单整体，option是下拉菜单的每一项。

```html
<select>
  <!-- innerHTML是给用户看的，value属性是给JS代码用的，通常value给的是id值 -->
  <option value="北京">北京</option>
  <option>上海</option>
  <option>广州</option>
  <option>深圳</option>
  <option selected>武汉</option>
</select>
```

> 默认显示第一项，将需要选中的移到第一个或者使用**selected** 属性实现**默认选中**功能。

# 23.文本域

作用：多行输入文本的表单控件。 

它的值是在value属性里的

> cols表示文本域以几列显示，rows表示以几行显示

![1680316238194](O:\BaiduSyncdisk\other\课\黑马\HTML+CSS+移动web\基础班课程资料\笔记\day02\assets\1680316238194.png)

```html
<textarea>默认提示文字</textarea>
```

> 注意点：
>
> * 实际开发中，使用 CSS 设置 文本域的尺寸
>
> * 实际开发中，一般禁用右下角的拖拽功能
>
> * hidden属性：隐藏（属性名等于属性值）
>
>   ~~~html
>   <textarea rows="4" cols="50" resize="none" hidden>
>       这是一个不可调整大小的文本区域。
>   </textarea>
>   ~~~

# 22.label 标签 

作用：网页中，某个标签的说明文本。 

![1680316296894](O:\BaiduSyncdisk\other\课\黑马\HTML+CSS+移动web\基础班课程资料\笔记\day02\assets\1680316296894.png)

经验：用 label 标签绑定文字和表单控件的关系，增大表单控件的点击范围。 

![1680316314721](O:\BaiduSyncdisk\other\课\黑马\HTML+CSS+移动web\基础班课程资料\笔记\day02\assets\1680316314721.png)

* 写法一
  * label 标签只包裹内容，不包裹表单控件
  * 设置 label 标签的 for 属性值 和表单控件的 id 属性值相同

```html
<input type="radio" id="man">
<label for="man">男</label>
```

* 写法二：使用 label 标签包裹文字和表单控件，不需要属性 

```html
<label><input type="radio"> 女</label>
```

> 提示：支持 label 标签增大点击范围的表单控件：文本框、密码框、上传文件、单选框、多选框、下拉菜单、文本域等等。 

# 23.<button>按钮

```html
<button type="">按钮</button>
```

> button不指定type默认就为submit  
>
> emment写法：input:submit

![1680316426088](O:\BaiduSyncdisk\other\课\黑马\HTML+CSS+移动web\基础班课程资料\笔记\day02\assets\1680316426088.png)



`autocomplete="off"` 是HTML表单属性，用于控制浏览器是否应该自动完成（autofill）表单字段。当设置为 "off" 时，它指示浏览器不应该根据用户以前的输入历史或存储的凭据自动填充表单中的信息。这样一般不安全，关闭即可

```html
<!-- form 表单区域 -->
<!-- action="" 发送数据的地址 -->
<form action="" autocomplete="off">
  用户名：<input type="text">
  <br><br>
  密码：<input type="password">
  <br><br>

  <!-- 如果省略 type 属性，功能是 提交 -->
  <button type="submit">提交</button>
  <button type="reset">重置</button>
  <button type="button">普通按钮</button>
</form>
```

> 提示：按钮需配合 form 标签（表单区域）才能实现对应的功能。
>
> action属性：发送数据的地址
>
> 表单元素的reset()方法：将表单中的所有输入字段重置为其初始值，也就是清除用户在表单中输入的所有内容，恢复到表单刚加载时的状态。
>
> 表单里的input必须有name值，否则提交不了数据

# 24.语义化

### 无语义的布局标签 

作用：布局网页（划分网页区域，摆放内容）

* div：独占一行，所以程序员有时候还会把div叫做大盒子
* span：不换行，小盒子

```html
<div>div 标签，独占一行</div>
<span>span 标签，不换行</span>
```

### 有语义的布局标签

![1680316535685](O:\BaiduSyncdisk\other\课\黑马\HTML+CSS+移动web\基础班课程资料\笔记\day02\assets\1680316535685.png)

# 25.字符实体

> 在代码中敲键盘的空格，网页只识别一个。
>
> `&nbsp;`

![1680316551064](O:\BaiduSyncdisk\other\课\黑马\HTML+CSS+移动web\基础班课程资料\笔记\day02\assets\1680316551064.png)

26.综合案例_体育新闻列表 

![1680316581559](O:\BaiduSyncdisk\other\课\黑马\HTML+CSS+移动web\基础班课程资料\笔记\day02\assets\1680316581559.png)

```html
<ul>
  <li>
    <img src="./images/1.jpg" alt="">
    <h3>主帅安东尼奥回西班牙休假 国青抵达海口进行隔离</h3>
  </li>
  <li>
    <img src="./images/2.jpg" alt="">
    <h3>梅州主帅：申花有强有力的教练组 球员体能水平高</h3>
  </li>
  <li>
    <img src="./images/3.jpg" alt="">
    <h3>马德兴:00后球员将首登亚洲舞台 调整心态才务实</h3>
  </li>
</ul>
```

27.综合案例二-注册信息

![1680316627956](O:\BaiduSyncdisk\other\课\黑马\HTML+CSS+移动web\基础班课程资料\笔记\day02\assets\1680316627956.png)

```html
<h1>注册信息</h1>
<form action="">
  <!-- 表单控件 -->
  <!-- 个人信息 -->
  <h2>个人信息</h2>
  <!-- 提示文本使用label标签 -->
  <label>姓名：</label><input type="text" placeholder="请输入真实姓名">
  <br><br>
  <label>密码：</label><input type="password" placeholder="请输入密码">
  <br><br>
  <label>确认密码：</label><input type="password" placeholder="请输入确认密码">
  <br><br>
  <label>性别：</label>
  <label><input type="radio" name="gender"> 男</label>
  <label><input type="radio" name="gender" checked> 女</label>
  <br><br>
  <label>居住城市：</label>
  <select>
    <option>北京</option>
    <option>上海</option>
    <option>广州</option>
    <option>深圳</option>
    <option>武汉</option>
  </select>
  <!-- 教育经历 -->
  <h2>教育经历</h2>
  <label>最高学历：</label>
  <select>
    <option>博士</option>
    <option>硕士</option>
    <option>本科</option>
    <option>大专</option>
  </select>
  <br><br>
  <label>学校名称：</label><input type="text">
  <br><br>
  <label>所学专业：</label><input type="text">
  <br><br>
  <label>在校时间：</label>
  <select>
    <option>2015</option>
    <option>2016</option>
    <option>2017</option>
    <option>2018</option>
  </select>
  --
  <select>
    <option>2019</option>
    <option>2020</option>
    <option>2021</option>
    <option>2022</option>
  </select>
  <!-- 工作经历 -->
  <h2>工作经历</h2>
  <label>公司名称：</label><input type="text">
  <br><br>
  <label>工作描述：</label>
  <br>
  <textarea></textarea>
  <br><br>
  <!-- 协议 和 按钮 -->
  <!-- 协议使用的是复选框 -->
  <input type="checkbox"><label>已阅读并同意以下协议：</label>
  <ul>
    <li><a href="#">《用户服务协议》</a></li>
    <li><a href="#">《隐私政策》</a></li>
  </ul>
  <br><br>
  <button>免费注册</button>
  <button type="reset">重新填写</button>
</form>
```



day03-CSS基础

> 目标：掌握 CSS 属性基本写法，能够使用文字相关属性美化文章页。

# 30.CSS

层叠样式表 (Cascading Style Sheets，缩写为 CSS），是一种 **样式表** 语言，用来**描述 HTML 文档的呈现**（**美化内容**）。

书写位置：**<head>里面title 标签下方添加 style 双标签，style 标签里面书写 CSS 代码**。

> <head>标签就是给浏览器看的，只是习惯放到title标签的额下方

```html
<title>CSS 初体验</title>
<style>
  /* 选择器 { } */
  p {
    /* CSS 属性 */
    color: red;
    font-size: 30px;
  }
</style>

<p>体验 CSS</p>
```

> 提示：属性名和属性值成对出现 → 键值对。 

# 31.CSS引入方式

* **内部**样式表：学习使用
  * CSS 代码写在 style 标签里面
* **外部**样式表：开发使用（实际开发中最常用的）
  * CSS 代码写在单独的 CSS 文件中（**.css**）
  * 在 HTML（head标签里，title标签的下面） 使用 link 标签（单标签）引入

> href：路径 + 文件名（Hypertext Reference）
>
> rel：关系，stylesheet：样式表

```html
<link rel="stylesheet" href="./my.css">
```

* **行内**样式：配合 JavaScript 使用
  * CSS 写在标签的 style 属性值里

```html
<div style="color: red; font-size:20px;">这是 div 标签</div>
```

# 32.选择器

作用：**查找标签**，设置样式。 

### 标签选择器

标签选择器：使用**标签名**作为选择器 → 选中**同名标签设置相同的样式**。

例如：p, h1, div, a, img......但是如果没有这个标签名就没有这个标签选择器

```html
<style>
  p {
    color: red;
  }
</style>

```

> 注意：标签选择器**无法差异化**同名标签的显示效果。

### 类选择器

作用：查找标签，**差异化**设置标签的显示效果。

步骤：

* 定义类选择器 → **.类名**
* 使用类选择器（使用时不加 . ） → 标签添加 **class="类名"**

```html
<style>
  /* 定义类选择器 */
  .red {
    color: red;
  }
</style>

<!-- 使用类选择器 -->
<div class="red">这是 div 标签</div>
<div class="red size">div 标签</div>
```

注意：

* 类名**自定义**，不要用纯数字或中文，尽量用英文命名
* 一个类选择器**可以供多个标签使用**
* **一个标签可以使用多个类名**，类名之间用**空格**隔开（注意不能使用多个class属性）

> 开发习惯：类名见名知意，多个单词可以用 - 连接，例如：news-hd（新闻的头部）。

# 33.id选择器

作用：查找标签，差异化设置标签的显示效果。

场景：id 选择器一般**配合 JavaScript** 使用，很少用来设置 CSS 样式

步骤：

* 定义 id 选择器 → #id名
* 使用 id 选择器 → 标签添加 id= "id名"（没有#号）

```html
<style>
  /* 定义 id 选择器 */
  #red {
    color: red;
  }
</style>

<!-- 使用 id 选择器 -->
<div id="red">这是 div 标签</div>
```

> 规则：同一个 id 选择器在一个页面只能使用一次。

### 通配符选择器

作用：查找页面**所有**标签，设置相同样式。

通配符选择器： ***，不需要调用**，浏览器自动查找页面所有标签，设置相同的样式

```css
* {
  color: red;
}
```

> 经验：通配符选择器可以用于**清除标签的默认样式**，例如：标签默认的外边距、内边距（p标签和h1标签上下都会有空白间距）。

![1680317584651](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/基础班课程资料/笔记/day03/assets/1680317584651.png)

# 34.盒子尺寸和背景色

> 并且一个盒子独占占一行

![image-20231223143352767](.\assets\image-20231223143352767.png)

![1680317605797](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/基础班课程资料/笔记/day03/assets/1680317605797.png)

# 35.文字控制属性

### 字体大小

* 属性名：**font-size**
* 属性值：文字尺寸，PC 端网页最常用的单位 **px**，如果没有单位，否则这个属性就不生效了

```css
p {
  font-size: 30px;
}
```

> 经验：谷歌浏览器默认字号是16px。
>
> 查看：点击下方的元素选择器
>
> ![image-20231223192005931](.\assets\image-20231223192005931.png)

### 字体粗细

作用：清除文字默认的倾斜效果

属性名：**font-weight**

属性值

* 数字（开发使用）
  1. 正常：400
  2. 加粗：700
* 关键字
  1. 正常：normal
  2. 加粗：bold

### 字体倾斜

### 字体样式（是否倾斜） 

作用：清除文字默认的倾斜效果

属性名：**font-style**

属性值

* 正常（不倾斜）：**normal** 
* 倾斜：**italic**（由于倾斜的文字在网页中不太好看，一般不使用它来倾斜文字，反而用normal来解除倾斜效果

# 36.行高

作用：设置多行文本的间距

属性名：line-height

属性值

* 数字 + px（属性值写多大，行高值就是多大
* 数字（当前标签**font-size**属性值的倍数）

```css
line-height: 30px;


/* 当前标签字体大小为16px */
line-height: 2;/* 则此时的标签字体大小就为：2 * 16 */
```

![1680317770048](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/基础班课程资料/笔记/day03/assets/1680317770048.png)

> 行高的测量方法：从一行文字的最顶端（最底端）量到下一行文字的最顶端（最底端）。 
>
> ![image-20231223195122463](.\assets\image-20231223195122463.png)

### 单行文字垂直居中

垂直居中技巧：**行高属性值等于盒子高度属性值**

注意：该技巧适用于单行文字垂直居中效果，如果文字换行了，就不可以垂直居中了。

![image-20231223200032415](.\assets\image-20231223200032415.png)

![image-20231223200116205](.\assets\image-20231223200116205.png)

```css
div {
  height: 100px;
  background-color: skyblue;

  /* 注意：只能是单行文字垂直居中 */
  line-height: 100px;
}
```

# 37.字体族

属性名：**font-family**

属性值：字体名

```css
font-family: 楷体;
```

> 拓展（了解）：font-family属性值可以书写多个字体名，各个字体名用逗号隔开，执行顺序是从左向右依次查找，如果找到最后一个，电脑都没有，就在无衬线字体里挑一个。
>
> *  font-family 属性最后设置一个字体族（一类字体的统称）名，网页开发建议使用无衬线字体（起笔跟落笔无任何的修饰）

![1680318278244](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/基础班课程资料/笔记/day03/assets/1680318278244.png)

下面一行的代码可以直接从淘宝或京东找，无衬线字体族名叫：sans-serif

```css
font-family: Microsoft YaHei, Heiti SC, tahoma, arial, Hiragino Sans GB, "\5B8B\4F53", sans-serif;
```

# 38.font复合属性

使用场景：设置网页文字公共样式 

> 一般也是从淘宝、京东等网页复制来的

![1680318326214](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/基础班课程资料/笔记/day03/assets/1680318326214.png)

复合属性：属性的简写方式，**一个属性对应多个值的写法**，各个属性值之间用**空格**隔开。

**font: 是否倾斜  是否加粗  字号/行高 字体（必须按顺序书写）**

```css
div {
  font: italic 700 30px/2 楷体;
}
```

> 注意：字号和字体值必须书写，否则 font 属性不生效 。其他属性值可以不写，使用的是该标签的默认值

# 39.文本缩进 

属性名：**text-indent**

属性值：

* 数字 + px
* **数字 + em**（推荐：**1em = 当前标签的字号大小**）

```css
p {
  text-indent: 2em; /* 缩进两个字 */
}
```

### 文本对齐方式 

作用：控制内容水平对齐方式

属性名：**text-align**

![1680318461130](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/基础班课程资料/笔记/day03/assets/1680318461130.png)

emment写法：tac

```css
text-align: center;
```

> 默认是左对齐。
>
> 调试发现，h1标签还是占了一行，只不过是把字移动到了中间。
>
> ![image-20231223202229398](.\assets\image-20231223202229398.png)
>
> text-align本质是控制内容的对齐方式，不影响标签的位置。属性要设置给内容的父级。 

```html
<style>
  div {
    text-align: center;
  }
</style>

<div>
  <img src="./images/1.jpg" alt="">
</div>
```

### 文本修饰线 

属性名： **text-decoration** 

![1680318548558](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/基础班课程资料/笔记/day03/assets/1680318548558.png)



# 40.color 文字颜色

![1680318569852](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/基础班课程资料/笔记/day03/assets/1680318569852.png)

> 提示：只要属性值为颜色，都可以使用上述四种颜色表示方式，例如：背景色。 

# 41.调试工具

作用：检查、调试代码；帮助程序员发现代码问题、解决问题

1. 打开调试工具

* 浏览器窗口内任意位置 / 选中标签 → 鼠标右键 → 检查
* F12

2. 使用调试工具

如果是错误的属性，会有黄色叹号。并且会告诉你这段代码在哪个文件的第一行

![1680318624523](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/基础班课程资料/笔记/day03/assets/1680318624523.png)

CSS 属性的前面有多选框，打了对勾的表示，这个属性是生效的

![image-20231223204752602](.\assets\image-20231223204752602.png)

此时可以自己去掉勾选，这样并不是修改了VSCode里的代码，只是在浏览器中暂时不使用这两个属性

![image-20231223204907914](.\assets\image-20231223204907914.png)

直接点中标签，也是可以直接修改属性的，按键盘上下键可以微调

![image-20231226072955002](.\assets\image-20231226072955002.png)

42.综合案例一-新闻详情

网页制作思路：

1. 从上到下，先整体再局部
2. 先标签，再 CSS 美化

![1680318667113](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/基础班课程资料/笔记/day03/assets/1680318667113.png)

HTML标签

> 重要的就使用<strong>标签，不重要的就使用CSS中的font-weight

```html
<h1>在希望的田野上 | 湖北秋收开镰 各地多举措保增产增收</h1>
<div>来源：央视网 | 2222年12月12日 12:12:12</div>
<p><strong>央视网消息：</strong>眼下，湖北省秋收开镰已有一周多的时间。水稻收割已经超过四成，玉米收割七成。湖北省通过大力推广新品种水稻，建设高标准农田等一系列措施，为秋粮稳产提供有力支撑。</p>
<p>中稻占据了湖北全年粮食产量的一半以上。在湖北的主产区荆门市，370万亩中稻已经收割四成以上。</p>
<!-- 将图片居中需要设置一个div标签 -->
<div class="pic">
  <img src="./1.jpg" alt="">
</div>
<p>王化林说的新品种，是湖北省研发的杂交水稻“华夏香丝”，不仅产量高，还具有抗病、抗倒、抗高温的特性。在荆门漳河镇的一工程示范田内，像“华夏香丝”这样抗旱节水的品种还有20多个，这些水稻新品将在荆门全面推广，确保来年增产增收。</p>
<p>此外，湖北还大力推进高标准农田建设。截至今年6月，已建成3980万亩高标准农田。目前，湖北全省仍有1800多万亩中稻正在有序收割中，预计10月中旬收割完毕。</p>
```

CSS样式

```html
<style>
  h1 {
    text-align: center;
    font-weight: 400;
    font-size: 30px;
    color: #333;
  }

  div {
    font-size: 14px;
    color: #999;
  }

  p {
    text-indent: 2em;
    font-size: 18px;
    color: #333;
  }

  /* div {
    text-align: center;
  } */

  .pic {
    text-align: center;
  }
</style>
```

08-综合案例二-CSS简介

![1680318751246](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/基础班课程资料/笔记/day03/assets/1680318751246.png)

HTML标签

```html
<h1>CSS（层叠样式表）</h1>
<p>层叠样式表 (Cascading Style Sheets，缩写为 CSS），是一种 <a href="#">样式表</a> 语言，用来描述 HTML 或 XML（包括如 SVG、MathML、XHTML 之类的 XML 分支语言）文档的呈现。CSS 描述了在屏幕、纸质、音频等其它媒体上的元素应该如何被渲染的问题。</p>
<p><strong>CSS 是开放网络的核心语言之一</strong>，由 W3C 规范 实现跨浏览器的标准化。CSS 节省了大量的工作。 样式可以通过定义保存在外部.css 文件中，同时控制多个网页的布局，这意味着开发者不必经历在所有网页上编辑布局的麻烦。CSS 被分为不同等级：CSS1 现已废弃， CSS2.1 是推荐标准， CSS3 分成多个小模块且正在标准化中。</p>
<ul>
  <li>CSS 介绍 如果你是 Web 开发的新手，请务必阅读我们的 CSS 基础 文章以学习 CSS 的含义和用法。</li>
  <li>CSS 教程 我们的 CSS 学习区 包含了丰富的教程，它们覆盖了全部基础知识，能使你在 CSS 之路上从初出茅庐到游刃有余。</li>
  <li>CSS 参考 针对资深 Web 开发者的 <a href="#">详细参考手册</a> ，描述了 CSS 的各个属性与概念。</li>
</ul>
```

CSS样式

```html
<style>
  h1 {
    color: #333;
  }

  p {
    text-indent: 2em;
    font-size: 14px;
    color: #444;
    line-height: 30px;
  }

  a {
    color: #0069c2;
  }

  li {
    font-size: 14px;
    color: #444;
    line-height: 30px;
  }
</style>
```

day04-CSS进阶

> 目标：掌握复合选择器作用和写法；使用background属性添加背景效果

# 45.复合选择器

> 只要是选择器，作用都是一样的，都是查找标签用的

定义：由两个或多个基础选择器，通过不同的方式组合而成。

作用：更准确、更高效的选择目标元素（标签）。

### 后代选择器

后代选择器：**选中某元素的后代元素**，这里的后代指的是所有后代，包含儿子，孙子，重孙子...

选择器写法：父选择器  子选择器 { CSS 属性}，父子选择器之间用**空格**隔开。不管是父选择器还是子选择器，都可以使用任何一种基础选择器，比如类、id、标签、通配符

```html
<style>
  div span {
    color: red;
  }
</style>
<span> span 标签</span>
<div>
  <span>这是 div 的儿子 span</span >
</div>
```

### 子代选择器

子代选择器：选中某元素的子代元素（**最近的子级**）。

选择器写法：父选择器 > 子选择器 { CSS 属性}，父子选择器之间用 **>** 隔开。

```html
<style>
  div > span {
    color: red;
  }
</style>

<div>
  <span>这是 div 里面的 span</span>
  <p>
    <span>这是 div 里面的 p 里面的 span</span>
  </p>
</div>

```

### 并集选择器

并集选择器：选中**多组标签**设置**相同**的样式。

选择器写法：选择器1, 选择器2, …, 选择器N { CSS 属性}，选择器之间用 **,** 隔开。

建议并集选择器逗号之后敲一个换行，这样让代码格式更整齐更清晰。

```html
<style>
  div,
  p,
  span {
    color: red;
  }
</style>

<div> div 标签</div>
<p>p 标签</p>
<span>span 标签</span>
```

### 交集选择器 

交集选择器：选中**同时满足多个条件**的元素。

选择器写法：选择器1选择器2 { CSS 属性}，选择器之间连写，没有任何符号。 

```html
<style>
  p.box {
  color: red;
}
</style>

<p class="box">p 标签，使用了类选择器 box</p>
<p>p 标签</p>
<div class="box">div 标签，使用了类选择器 box</div>
```

> 注意：如果交集选择器中有标签选择器，标签选择器必须书写在最前面。 

# 46.伪类选择器 

伪类选择器：伪类表示元素**状态**，选中元素的某个状态设置样式。

鼠标悬停状态：**选择器:hover { CSS 属性 }**

> 任何标签都可以设置鼠标悬停的状态

```html
<style>
  a:hover {
    color: red;
  }
  .box:hover {
    color: green;
  }
</style>

<a href="#">a 标签</a>
<div class="box">div 标签</div>
```

#### 超链接伪类

![1680319272736](./assets/1680319272736.png)

> 提示：如果要给超链接设置以上四个状态，需要按 LVHA 的顺序书写。 
>
> 浏览器进行点击后，是有缓存的，会一直处于访问后的状态
>
> :active：左键点下去，不要松开，松开就看不见了
>
> 经验：工作中，一个 a 标签选择器设置超链接的样式， hover状态特殊设置 

```css
a {
  color: red;
}

a:hover {
  color: green;
}
```

# 47.CSS特性

> CSS特性就是CSS属性/选择器的特点

CSS特性：化简代码 / 定位问题，并解决问题

* 继承性
* 层叠性
* 优先级

### 继承性

继承性：子级默认继承父级的**文字控制属性**。 

![1680319376438](./assets/1680319376438.png)

工作中一般把文字控制的属性设置为body标签，如果有不一样的文字，再写选择器找到对应的标签单独设置即可。

![1680318326214](.\assets\1680318326214.png)

> 注意：如果标签有默认文字样式会继承失败。 例如：a 标签的颜色、标题的字体大小。

### 层叠性

特点：

* 相同的属性会覆盖：**后面的 CSS 属性覆盖前面的 CSS 属性**
* 不同的属性会叠加：**不同的 CSS 属性都生效**

```html
<style>
  div {
    color: red;
    font-weight: 700;
  }
  div {
    color: green;
    font-size: 30px;
  }
</style>

<div>div 标签</div>
```

> 注意：选择器类型相同则遵循层叠性，否则按选择器优先级判断。 

### 优先级

优先级：也叫权重，当一个标签**使用了多种选择器时**，基于不同种类的选择器的**匹配规则**。

```html
<style>
  div {
    color: red;
  }
  .box {
    color: green;
  }
</style>

<div class="box">div 标签</div>
```

#### 基础选择器

规则：选择器**优先级高的样式生效**。

公式：**通配符选择器 < 标签选择器 < 类选择器 < id选择器 < 行内样式 < !important**

​           **（选中标签的范围越大，优先级越低）**

> !important：提权功能，提高权重到优先级最高，慎用！
>
> 通常加在这一条属性分号的前面。
>
> ``` css
> color: red !important;
> ```

#### 复合选择器-叠加

叠加计算：如果是复合选择器，则需要**权重叠加**计算。

公式：（每一级之间不存在进位）

![1680319646205](./assets/1680319646205.png)

规则：

* 从左向右依次比较选个数，同一级个数多的优先级高，如果个数相同，则向后比较
* **!important 权重最高**
* 继承权重最低（一旦自己有样式，继承就无效了）

> 这里有作业

# 48.Emmet 写法

Emmet写法：代码的**简写**方式，输入缩写 VS Code 会自动生成对应的代码。 

* HTML标签

> 如果是div带类名，可以直接.类名

![1680319897697](./assets/1680319897697.png)

* CSS：大多数简写方式为属性单词的**首字母** 

> w500后面都不需要带单位

![1680319926111](./assets/1680319926111.png)

> 如果需要产生有规律的数字：使用$
>
> ```html
> ul>li{$}*4
> <ul>
>  <li>1</li>
>  <li>2</li>
>  <li>3</li>
>  <li>4</li>
> </ul>
> 
> <!-- 也可以直接写： -->
> ul>li{第$个孩子}*4
> <ul>
>     <li>第1个孩子</li>
>     <li>第2个孩子</li>
>     <li>第3个孩子</li>
>     <li>第4个孩子</li>
>     <li>第5个孩子</li>
>   </ul>
> ```
>

# 49.背景属性

![1680319971861](./assets/1680319971861.png)

### 背景图

网页中，使用背景图实现装饰性的图片效果。图片在下，文字在上

* 属性名：**background-image**（bgi）
* 属性值：url(背景图 URL)

```css
div {
  /* 由于背景图都是在盒子里面显示的，所以需要把盒子设置一个宽高 */
  width: 400px;
  height: 400px;

  background-image: url(./images/1.png);
}
```

> 提示：背景图默认有**平铺（复制）效果**。 即如果盒子大了，就会把该照片复制几份，填满盒子。

### 平铺方式

属性名：**background-repeat**（bgr） 

> no-repeat：盒子的左上角显示一张背景图

![1680320072292](./assets/1680320072292.png)

```css
div {
  width: 400px;
  height: 400px;
  background-color: pink;
  background-image: url(./images/1.png);

  background-repeat: no-repeat;
}
```

### 背景图位置

> 默认是在左上角，盒子里面的才看的见，如果图片超出了盒子，就看不见了。
>
> 0 0；left top均表示左上角，即默认

通过background-position-x 和 background-position-y设置 x 或 y轴的位置

~~~css
background-position-x: 10px;
background-position-y: 20px;
~~~

属性名：**background-position**（bgp）

属性值：水平方向位置 垂直方向位置

* 关键字

![1680320211424](./assets/1680320211424.png)

* 坐标（数字 + px，正负都可以）
  * 水平：正数向右；负数向左
  * 垂直：正数向下；负数向上

```css
div {
  width: 400px;
  height: 400px;
  background-color: pink;
  background-image: url(./images/1.png);
  background-repeat: no-repeat;

  background-position: center bottom;
  background-position: 50px -100px;
  background-position: 50px center;
}
```

> 提示：
>
> 但是建议大家按照正常写法来写，这样不容易出错
>
> * 关键字取值方式写法，可以颠倒取值顺序
> * 可以只写一个关键字，另一个方向默认为居中；数字只写一个值表示水平方向，垂直方向为居中

### 背景图缩放

作用：设置背景图大小

属性名：**background-size**（bgz）

常用属性值：

* 关键字
  * cover：等比例缩放背景图片以完全覆盖背景区，可能背景图片部分看不见
  
  宽高有一个跟盒子的尺寸相等了，就会停止缩放。
  
  * contain：等比例缩放背景图片以完全装入背景区，可能背景区部分空白
  
* 百分比：根据盒子尺寸计算图片大小

  > 100% 图片的宽度跟盒子宽度一样，图片的高度按照图片比例等比缩放

* 数字 + 单位（例如：px）（缩放到宽高多少px）

```css
div {
  width: 500px;
  height: 400px;
  background-color: pink;
  background-image: url(./images/1.png);
  background-repeat: no-repeat;
  
  background-size: cover;
  background-size: contain;
}
```

> 提示：工作中，**图片比例与盒子比例相同**，使用 cover 或 contain 或 百分比 缩放背景图效果相同。

### 背景图固定

作用：背景不会随着元素的内容滚动。

属性名：**background-attachment**（bga）

属性值：**fixed**

```css
body {
  background-image: url(./images/bg.jpg);
  background-repeat: no-repeat;
  background-attachment: fixed;
}
```

# 50.背景复合属性

属性名：**background**（bg）

属性值：背景色 背景图 背景图平铺方式 背景图位置/背景图缩放  背景图固定（**空格隔开各个属性值，不区分顺序**）

```css
div {
  width: 400px;
  height: 400px;

  background: pink url(./images/1.png) no-repeat right center/cover;
  /* 如果只写一个center，代表水平垂直都居中，后面的20px代表缩放到宽高20px */
  background: pink url(./images/1.png) no-repeat center / 20px;
}
```

# 51.显示模式

显示模式：标签（元素）的显示方式。 

> 测试方法的显示模式：
>
> 1. 写两个相同的标签，看看是不是在一行显示的
> 2. 看看默认的宽高是多大
> 3. 加宽高，看看生不生效

![1680320464551](./assets/1680320464551.png)

作用：布局网页的时候，根据标签的显示模式选择合适的标签摆放内容。 

### 块级元素

<div>

特点：

* 独占一行
* 宽度默认是父级的100%
* 添加宽高属性生效

![1680320578369](./assets/1680320578369.png)

### 行内元素

<span>

特点：

* 一行可以显示多个
* 设置宽高属性不生效
* 宽高尺寸由内容撑开

![1680320583985](./assets/1680320583985.png)

### 行内块元素 

<img>

特点：

* 一行可以显示多个
* 设置宽高属性生效
* 宽高尺寸也可以由内容撑开

![1680320590005](./assets/1680320590005.png)

### 转换显示模式

属性：**display**

隐藏：

隐藏后是不占位的

~~~css
display: none;
~~~

> 工作中常用的通常是block和inline-block，因为inline加宽高不生效，啥也做不了

![1680320613034](./assets/1680320613034.png)



06-综合案例一-热词

![1680320664821](./assets/1680320664821.png)

HTML标签

```html
<a href="#">HTML</a>
<a href="#">CSS</a>
<a href="#">JavaScript</a>
<a href="#">Vue</a>
<a href="#">React</a>
```

CSS样式

```html
<style>
/* 默认效果 */
a {
display: block;
width: 200px;
height: 80px;
background-color: #3064bb;
color: #fff;
text-decoration: none;
/* 简写：tac */
text-align: center;
line-height: 80px;
font-size: 18px;
}

/* 鼠标悬停的效果 */
a:hover {
background-color: #608dd9;
}
</style>
```

07-综合案例二 – banner 效果

宣传大图效果也叫banner效果

![1680320758496](./assets/1680320758496.png)

HTML标签

```html
<div class="banner">
  <h2>让创造产生价值</h2>
  <p>我们希望小游戏平台可以提供无限的可能性，让每一个创作者都可以将他们的才华和创意传递给用户。</p>
  <a href="#">我要报名</a>
</div>
```



CSS样式

> 工作中尽量不要直接使用标签选择器，多用后代关系

```html
<style>
  .banner {
    height: 500px;
    background-color: #f3f3f4;
    background-image: url(./images/bk.png);
    background-repeat: no-repeat;
    background-position: left bottom;

    /* 文字控制属性，继承给子级 */
    text-align: right;
    color: #333;
  }

  .banner h2 {
    font-size: 36px;
    font-weight: 400;
    line-height: 100px;
  }

  .banner p {
    font-size: 20px;
  }

  .banner a {
    width: 125px;
    height: 40px;
    background-color: #f06b1f;

    display: inline-block;
    /* 转块级无法右对齐，因为块元素独占一行 */
    /* display: block; */

    text-align: center;
    line-height: 40px;
    color: #fff;
    text-decoration: none;
    font-size: 20px;
  }
</style>
```

day05-盒子模型

> 目标：掌握盒子模型组成部分，使用盒子模型布局网页区域

# 55.选择器

### 结构伪类选择器 

基本使用

作用：根据元素的**结构关系**查找元素。 

> E：代表一个选择器

![1680321408957](./assets/1680321408957.png)

```css
li:first-child {
  background-color: green;
}
```

### :nth-child(公式) 

![1680321448162](./assets/1680321448162.png)

> 提示：公式中的n取值从 **0** 开始。 
>
> 找到第5个以后的标签（包含第5个）

除第一行不要底色：

> not后面写条件

~~~html
<style>
    table tr:not(:first-child):hover {
        background-color: #eee;
    }
</style>
~~~



# 56.伪元素选择器 

作用：创建**虚拟元素**（伪元素），用来**摆放装饰性的内容**。 

![1680321533901](./assets/1680321533901.png)

![1680321544646](./assets/1680321544646.png)

```css
div::before {
  content: "before 伪元素";
}
div::after {
  content: "after 伪元素";
}
```

> 您提到的 `.loading:before` 是 CSS 中的单冒号伪类选择器，它代表了一个“伪元素”。在 CSS1 和 CSS2 标准中，伪元素使用单个冒号表示，如 `:before` 和 `:after`。它们分别用于在元素内容的前面或后面插入生成的内容。
>
> 然而，在 CSS3 中，为了区别伪类（例如 `:hover`、`:active` 等）和伪元素，引入了双冒号 `::` 的写法作为更明确的语法，所以 `::before` 和 `::after` 也是合法且推荐的写法。
>
> 尽管如此，大多数现代浏览器仍兼容单冒号的伪元素写法，即 `.loading:before` 依旧可以正常工作。因此，代码中的 `.loading:before` 使用单个冒号是老式的写法，但依然有效。如果要遵循最新的 CSS 规范，建议使用双冒号 `::before`。

![image-20231224173015558](.\assets\image-20231224173015558.png)

注意点：

* 必须设置 **content: ””属性**，用来 设置伪元素的内容，如果没有内容，则**引号留空**即可
* 伪元素默认是**行内**显示模式
* **权重和标签选择器相同**

# 57.PxCook 

PxCook（像素大厨） 是一款切图设计工具软件。支持PSD文件的文字、颜色、距离自动智能识别。

* 开发面板（自动智能识别）
* 设计面板（手动测量尺寸和颜色）

使用方法：创建项目 → 输入 项目名称、项目类型 Web（因为是网页） → 单击按钮【创建项目】 → 单击按钮【添加】（或者找到psd文件，直接拖进来也行），导入设计稿 

![1680321681695](./assets/1680321681695.png)

导入：

![image-20231225205640630](.\assets\image-20231225205640630.png)

放大缩小：点击右上角的百分比，就可以放大和缩小，或者按住alt键，可以配合鼠标放大缩小

> 开发面板是可以自动识别的

![image-20231225205835067](.\assets\image-20231225205835067.png)

移动：按住空格 

如果想看搜索框的尺寸是多大，只需要把鼠标放上去，点一下，并且右边还会出现颜色

![image-20231225210203913](.\assets\image-20231225210203913.png)

想看边距有多大，选中一个，向另外一个晃动鼠标就能看见距离有多大

![image-20231225210434296](.\assets\image-20231225210434296.png)

选中文字就可以看见文字对应的大小和行高

![image-20231225210654843](.\assets\image-20231225210654843.png)

如果有些地方无法自动识别，我们也可以点到设计模式手动测量

工具箱中的尺子就是测量尺寸用的

![image-20231225210819099](.\assets\image-20231225210819099.png)

想量宽度，只要从最左边到最右边拖动即可

![image-20231225211037854](.\assets\image-20231225211037854.png)

此时有可能不准，只需要点击放大，然后点击旁边的正方形进行调整即可

![image-20231225211224524](.\assets\image-20231225211224524.png)

测量颜色：点击旁边的小吸管工具

![image-20231225211455868](.\assets\image-20231225211455868.png)

想看哪里的颜色，把它拖动到哪里即可，怕丢失可以点一下

![image-20231225211557509](.\assets\image-20231225211557509.png)

> 能用开发模式的就用开发模式，实在不行的，就使用设计模式自己测量



# 58.盒子模型

作用：布局网页，摆放盒子和内容。

### 盒子模型-组成

* 内容区域 – width & height（可以放具体的内容，此时的内容它是贴着盒子边缘最左上角的

  ![image-20231225215550341](.\assets\image-20231225215550341.png)

* 内边距 – padding（出现在内容与盒子边缘之间）（直接打p，加了padding，盒子会被撑大）

  ![image-20231225215606596](.\assets\image-20231225215606596.png)

  右击点检查，将鼠标放到div标签身上

  <img src=".\assets\image-20231225215714581.png" alt="image-20231225215714581" style="zoom:50%;" />

  在浏览器里面此时多出来了一些颜色，这些颜色都是盒子模型的组成部分，上左下右产生的浅绿的色块，这些色块就是padding所在的位置，一个padding20px，在盒子的上下左右四个方向都添加了内边距，拉开内容跟盒子边缘之间的距离

* 边框线 – border （直接输入bd）

  ![image-20231225220004339](.\assets\image-20231225220004339.png)

  此时在盒子的上下左右都有了1px的边框线

* 外边距 – margin（出现在盒子外面）（直接输入m）

  此时上下左右都会有50px的margin，显示出来是白色的

  ![image-20231225220146263](.\assets\image-20231225220146263.png)

```css
div {
  margin: 50px;
  border: 5px solid brown;
  padding: 20px;
  width: 200px;
  height: 200px;
  background-color: pink;
}
```

![1680330928735](./assets/1680330928735.png)

在谷歌浏览器的计算样式里可看见：

![image-20231225220231618](.\assets\image-20231225220231618.png)

![1680330935635](./assets/1680330935635.png)



# 59.边框线

#### 四个方向

属性名：**border**（bd）

属性值：边框线粗细  线条样式  颜色（不区分顺序）

~~~css
border: none /* 去掉边框线 */
~~~

![1680330976390](./assets/1680330976390.png)

```css
div {
  border: 5px solid brown;
  width: 200px;
  height: 200px;
  background-color: pink;
}
```

#### 单方向边框线 

属性名：**border-方位名词**（bd+方位名词首字母，例如，bdl）

属性值：边框线粗细  线条样式  颜色（不区分顺序）

```css
div {
  border-top: 2px solid red;
  border-right: 3px dashed green;
  border-bottom: 4px dotted blue;
  border-left: 5px solid orange;
  width: 200px;
  height: 200px;
  background-color: pink;
}
```

# 60.内边距 

作用：设置 内容 与 盒子边缘 之间的距离。（p或者p+方位，如pt（top））

* 属性名：padding / padding-方位名词

```css
div {
  /* 四个方向 内边距相同 */
  padding: 30px;
  /* 单独设置一个方向内边距 */
  padding-top: 10px;
  padding-right: 20px;
  padding-bottom: 40px;
  padding-left: 80px;
  width: 200px;
  height: 200px;
  background-color: pink;
}
```

> 提示：添加 padding 会撑大盒子。

* padding 多值写法

![1680331118330](./assets/1680331118330.png)

> 技巧：从**上**开始**顺时针**赋值，当前方向没有数值则与**对面取值相同**。 

# 61.尺寸计算

![1680331322935](./assets/1680331322935.png)

默认情况：盒子尺寸 = 内容尺寸 + border 尺寸 + 内边距尺寸

结论：给盒子加 border / padding 会撑大盒子

解决：

* 手动做减法，减掉 border / padding 的尺寸
* 內减模式：**box-sizing: border-box**



# 62.外边距 

作用：拉开两个盒子之间的距离，出现在盒子的外面，并不会撑大盒子

属性名：**margin**

提示：与 padding 属性值写法、含义相同

### 版心居中

![1680331503466](./assets/1680331503466.png)

左右 margin 值 为 auto（盒子要有宽度），具体大小浏览器自动计算

> 浏览器计算方式：只要把浏览器打开，它就知道自己的宽度是多大，此时会使用浏览器窗口的宽 - 盒子的宽，剩下的就是间/ 距的尺寸了，此时 / 2 即可。所以盒子必须要有宽度。

```css
div {
  margin: 0 auto;
  width: 1000px;
  height: 200px;
  background-color: pink;
}
```

# 63.清除默认样式 

![1680331558304](./assets/1680331558304.png)

清除标签默认的样式，比如：默认的内外边距。 

> 京东做法：使用通配符选择器，将内外边距都清除掉
>
> 淘宝做法：逗号隔开的并集选择器，选中所有有默认样式的标签，有些标签已经很古老了，只是淘宝还没删除，如blockquote
>
> 京东的明显更方便
>
> emment写法：
>
> ![image-20231226111126513](.\assets\image-20231226111126513.png)

![1680331580746](./assets/1680331580746.png)

```css
/* 清除默认内外边距 */
* {
  margin: 0;
  padding: 0;
    /* 由于将来设置自定义尺寸的时候撑大盒子，所以习惯性把内减模式也放在这 */
  box-sizing: border-box;
}
```

由于把内外边距都清除掉了，小圆点只是挪到了浏览器外面，还没有完全被清理掉

emment：lis

``` css
/* 清除列表项目符号 */
li {
  list-style: none;
}
```



# 64.元素溢出

作用：控制溢出元素的内容的显示方式。

属性名：**overflow**

![1680331623305](./assets/1680331623305.png)

# 65.外边距问题

#### 合并现象

场景：**垂直**排列的兄弟元素，上下 **margin** 会**合并**

现象：取两个 margin 中的**较大值生效**

![1680331672628](./assets/1680331672628.png)

```css
.one {
  margin-bottom: 50px;
}
.two {
  margin-top: 20px;
}
/*此时两个盒子的间距取50*/
```

> 如果以后需要设置两个盒子之间的间距为100px，只需要给一个盒子设置100px的外边距即可，不能两个盒子的外边距都设置为50px，因为外边距不是相加，而是取较大值

#### 外边距塌陷

场景：父子级的标签，子级的添加 **上外边距** 会产生**塌陷**问题

现象：**导致父级一起向下移动**

```css
.son {
  margin-top: 50px;
  width: 100px;
  height: 100px;
  background-color: orange;
}
```

![1680333860271](./assets/1680333860271.png)

解决方法：

* 取消子级margin，父级设置padding（规避）（推荐）

* 父级设置 overflow: hidden

* 父级设置 border-top

  > 设置这两个属性其实是让浏览器找到了正确的边缘，从而保证父级的位置是正确的，只在子级身上产生外边距
  >
  > 但第二个可能会撑大盒子，所以相对于第三种，第二种方法更完美一些

# 66.行内元素 – 内外边距问题

> 之所以使用div，是因为块级标签稳定，加属性大多数情况都没问题

场景：行内元素添加 margin 和 padding，无法改变元素垂直位置，但是可以改变水平的位置

解决方法：给行内元素添加 **line-height** 可以改变垂直位置

```css
span {
  /* margin 和 padding 属性，无法改变垂直位置 */
  margin: 50px;
  padding: 20px;
  /* 行高可以改变垂直位置 */
  line-height: 100px;
}
```

# 67.圆角

作用：设置元素的外边框为圆角。

属性名：**border-radius**

属性值：数字+px / 百分比

提示：属性值是圆角半径

![1680334014390](./assets/1680334014390.png)



* 多值写法

![1680334027657](./assets/1680334027657.png)

> 技巧：从左上角开始顺时针赋值，当前角没有数值则与对角取值相同。 

* 正圆形状：给正方形盒子设置圆角属性值为 **宽高的一半 / 50%**

  > 可以用来做头像，前提：盒子本身为正方形
  >
  > 圆角半径取值：最大值为50%，超过50%没有效果，因为正圆已经是最圆的情况了。圆角半径取值越小，越不圆

```css
img {
  width: 200px;
  height: 200px;
  
  border-radius: 100px;
  border-radius: 50%;
}
```

![1680334083567](./assets/1680334083567.png)

* 胶囊形状：给长方形盒子设置圆角属性值为 盒子高度的一半 

```css
div {
  width: 200px;
  height: 80px;
  background-color: orange;
  border-radius: 40px;
}
```

![1680334136242](./assets/1680334136242.png)

### 盒子阴影（拓展）

作用：给元素设置阴影效果

属性名：**box-shadow**

属性值：X 轴偏移量  Y 轴偏移量  模糊半径  扩散半径  颜色  内外阴影

> 模糊半径越大越越柔和

注意： 

* X 轴偏移量 和 Y 轴偏移量 必须书写
* 默认是外阴影，内阴影需要添加 inset，但内阴影不常见

```css
div {
  width: 200px;
  height: 80px;
  background-color: orange;
  box-shadow: 2px 5px 10px 0 rgba(0, 0, 0, 0.5) inset;
}
```

04-综合案例-产品卡片

![1680334221212](./assets/1680334221212.png)

CSS 书写顺序：

1. 盒子模型属性
2. 文字样式
3. 圆角、阴影等修饰属性

HTML标签

```html
<div class="product">
  <img src="./images/liveSDK.svg" alt="">
  <h4>抖音直播SDK</h4>
  <p>包含抖音直播看播功能</p>
</div>
```



CSS样式

```html
<style>
  * {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
  }

  body {
    background-color: #f1f1f1;
  }

  .product {
    margin: 50px auto;
    padding-top: 40px;

    width: 270px;
    height: 253px;
    background-color: #fff;
    text-align: center;


```



04-综合案例-新浪新闻

> 前面的小方块和图片都是装饰性的，不影响内容的查看，所以应该使用背景图而不是img。
>
> 小方块设置为li的背景，图片设置为a的背景

![image-20231226095242091](.\assets\image-20231226095242091.png)

> 这里有个小细节：如果直接这样，就会是在父级的上边框最下沿显示的，但真实的应该是贴着上沿显示
>
> <img src=".\assets\image-20231226101738393.png" alt="image-20231226101738393" style="zoom:50%;" />
>
> 解决办法：将盒子向上挪
>
> ```css
> margin-top: -1px;
> ```
>
> <img src=".\assets\image-20231226102224248.png" alt="image-20231226102224248" style="zoom:50%;" />

HTML标签

```html
<div class="news">

    <div class="hd">
        <a href="#">新闻</a>
    </div>
    <div class="bd">
        <ul>
            <li>
                <a href="#">点赞“新农人” 温暖的伸手</a>
            </li>

            <li>
                <a href="#">在希望的田野上...</a>
            </li>

            <li>
                <a href="#">“中国天眼”又有新发现 已在《自然》杂志发表</a>
            </li>

            <li>
                <a href="#">急！这个领域，缺人！月薪4万元还不好招！啥情况？</a>
            </li>

            <li>
                <a href="#">G9“带货”背后：亏损面持续扩大，竞争环境激烈</a>
            </li>

            <li>
                <a href="#">多地力推二手房“带押过户”，有什么好处？</a>
            </li>
        </ul>
    </div>
```

CSS样式

```html
<style>
    * {
        margin: 0;
        padding: 0;
        box-sizing: border-box;
    }

    li  {
        list-style: none;
    }

    a {
        text-decoration: none;
        color: #666;
    }

    .news  {
        margin: 100px auto;
        width: 360px;
        height: 200px;
    }

    .news .hd {
        height: 34px;
        background-color: #eee;
        border: 1px solid #dbdee1;
        /* 单独设置左边框线，写none或者0（即0像素粗细） */
        border-left: 0;
    }

    .news .hd a {
        /* 盒子向上移动 */
        margin-top: -1px;
        display: block;
        width: 48px;
        height: 34px;
        background-color: #fff;
        border-top: 3px solid #ff8400;
        border-right: 1px solid #dbdee1;

        text-align: center;
        line-height: 32px;
        font-size: 14px;
        color: #333;
    }

    .news .bd {
        padding: 5px;
    }

    .news .bd li {
        padding-left: 15px;
        background-image: url(./img/square.png);
        background-repeat: no-repeat;
        background-position: 0 center;
    }

    .news .bd li a {
        padding-left: 20px;
        background: url(img/img.gif) no-repeat 0 center;
        font-size: 12px;
        line-height: 24px;
        color: #666;

    }

    .news .bd li a:hover {
        color: #ff8400;
    }
</style>
```

70.day06-Flex布局

> 目标：熟练使用 Flex 完成结构化布局

# 71.标准流

标准流也叫文档流，指的是标签在页面中**默认的显示模式**，例如：块元素独占一行，行内元素可以一行显示多个。 

![1680334840709](./assets/1680334840709.png)

# 72.浮动

基本使用

作用：让块元素水平排列。

属性名：**float**

属性值

* **left**：左对齐
* **right**：右对齐

> emment写法：fll：float:left; flr：float:right;

```html
<style>
  /* 特点：顶对齐；具备行内块显示模式特点；浮动的盒子会脱标 */
  .one {
    width: 100px;
    height: 100px;
    background-color: brown;

    float: left;
  }

  .two {
    width: 200px;
    height: 200px;
    background-color: orange;

    /* float: left; */

    float: right;
  }
</style>

<div class="one">one</div>
<div class="two">two</div>
```

特点：

* 浮动后的盒子**顶对齐**

* 浮动后的盒子具备**行内块**特点

* 浮动后的盒子**脱标**（脱离标准流的位置，不占用标准流的位置。在浏览器眼中认为浮动的盒子根本不存在，第一个盒子应该是没有浮动的盒子，此时它会显示在左上角），**不占用标准流的位置**

  注意，两个标签都需要加浮动，如果只有一个盒子加浮动，就会有个被覆盖

### 产品区域布局

![1680335016853](./assets/1680335016853.png)

#### HTML标签

```html
<!-- 版心：左右，右面：8个产品 → 8个 li -->
<div class="product">
  <div class="left"></div>
  <div class="right">
    <ul>
      <li></li>
      <li></li>
      <li></li>
      <li></li>
      <li></li>
      <li></li>
      <li></li>
      <li></li>
    </ul>
  </div>
</div>
```



#### CSS样式

> 浮动属性一般也会往上放，放到盒子模型属性的上面，这样做可以让网页的加载速率更高一些
>
> PS：小米间距都是14px
>
> 第4个li和第8个li刚好出现在版心的最右边，它其实是没有间距的，但是我们给的是有间距的，导致父级盛不下这两个li。解决办法：调整父级或者子级的宽度，让它们够用就行了

```html
<style>
  * {
    margin: 0;
    padding: 0;
  }

  li {
    list-style: none;
  }

  .product {
    margin: 50px auto;
    width: 1226px;
    height: 628px;
    background-color: pink;
  }

  .left {
    float: left;
    width: 234px;
    height: 628px;
    background-color: skyblue;
  }

  .right {
    float: right;
    width: 978px;
    height: 628px;
    background-color: brown;
  }

  .right li {
    float: left;
    margin-right: 14px;
    margin-bottom: 14px;
    width: 234px;
    height: 300px;
    background-color: orange;
  }

  /* 第四个li和第八个li 去掉右侧的margin */
  .right li:nth-child(4n) {
    margin-right: 0;
  }

  /* 细节：如果父级宽度不够，浮动的盒子会掉下来 */
</style>
```

# 73.清除浮动

场景：浮动元素会脱标，如果**父级没有高度**，**子级无法撑开父级高度**（可能导致页面布局错乱，下图最底下的盒子可能冲到最上面来）

解决方法：**清除浮动**（清除浮动带来的影响）

**场景搭建**

![1680335081694](./assets/1680335081694.png)

> .left+.right：两个div

```html
<style>
  .top {
    margin: 10px auto;
    width: 1200px;
    /* 注释掉高度：height: 300px; */
    background-color: pink;
  }

  .left {
    float: left;
    width: 200px;
    height: 300px;
    background-color: skyblue;
  }

  .right {
    float: right;
    width: 950px;
    height: 300px;
    background-color: orange;
  }

  .bottom {
    height: 100px;
    background-color: brown;
  }

</style>

<div class="top">
  <div class="left"></div>
  <div class="right"></div>
</div>
<div class="bottom"></div>
```

出现的效果分析：

这是由于左右拖标不存在，脱标的盒子又没有办法撑开父级的高，top撑不开，浏览器就认为top也不存在，所以存在的标签就是bottom，所以bottom深红色的盒子就出现在浏览器的最顶端了，这就是浮动产生的影响

![image-20231226124355278](.\assets\image-20231226124355278.png)

#### 额外标签法

在**父元素内容的最后**添加一个**块级**元素（即这个标签需要是独占一行的，p也可以），设置 CSS 属性 **clear: both**（这个属性是专门用来清除浮动的，both是双方，两者的意思，表示清除左右两侧浮动的影响。如果是写left，表示清除左侧浮动的影响；如果写right，表示清除右侧浮动的影响）

> 如果是清除浮动，类名都习惯叫做clearfix

```html
<style>
.clearfix {
  clear: both;
}
</style>

<div class="father">
  <div class="left"></div>
  <div class="right"></div>
  <div class="clearfix"></div>
</div>
```

> 检验：点击top，查看宽度，发现高度已经变成了300，而且这个高度还不是我们自己加的
>
> ![image-20231226125525160](.\assets\image-20231226125525160.png)

> 这种方法在原有标签布局之上加了一个空的标签，页面的标签就变多了，结构就乱一些，所以这种方法了解一下即可。

#### 单伪元素法

> 单伪元素法和额外标签法原理是一样的，只不过额外标签法是人工加标签，单伪元素法是通过伪元素加标签，伪元素不需要手动加多余的标签了，标签结构会更清晰一些。单伪元素法任然是在父级的最后加块级标签。
>
> 单伪元素法需要先定义一个类选择器给浮动的父级加标签，我们需要给父级的最后加标签，所以使用的伪元素是:after

1. 准备 after 伪元素

> 这些代码都不需要自己写，工作中直接把这个代码跟清除默认样式的代码放一起，哪里除了问题，直接调用clearfix这个类即可

```css
.clearfix::after {
  content: "";
  display: block;
  clear: both;
}
```

2. 父级使用 clearfix 类

```html
<div class="father clearfix"></div>
```

#### 双伪元素法（推荐）

1. 准备 after 和 before 伪元素

> 在父级开头的位置加一个标签，隔离了有margin的子级，父级，也就解决了塌陷问题

```css
/* before 解决外边距塌陷问题 */
/* 双伪元素法 */
.clearfix::before,
.clearfix::after {
  content: "";
  display: table;/*表格 */
}

/* after 清除浮动 */
.clearfix::after {
  clear: both;
}
```

2. 父级使用 clearfix 类

```html
<div class="father clearfix"></div>
```

#### overfow法

> 加上overflow属性后，并且值设置为hidden，浏览器就会检查，把超出父级范围的内容给它修剪掉。
>
> 由于之所以浮动有问题，就是因为父级无法被子级撑开高度范围，一旦设置了overflow: hidden;，就需要检查父级的范围，此时父级的高就检查得到，此时浮动问题就解决了

```css
.father {
  margin: 10px auto;
  width: 1200px;
  /* height: 300px; */
  background-color: pink;

  overflow: hidden;
}
```

> 拓展：浮动本质作用是实现图文混排的效果

# 75.Flex布局

Flex 布局也叫**弹性布局**，是浏览器**提倡的布局模型**，非常适合**结构化**布局（左右结构和上下结构都叫结构化），提供了强大的空间分布和对齐能力。

Flex 模型不会产生浮动布局中脱标现象，布局网页更简单、更灵活。

![1680335815005](./assets/1680335815005.png)

准备代码：

![image-20231226135836402](.\assets\image-20231226135836402.png)

```html
<style>
    .box {
        height: 300px;
        border: 1px solid #000;
    }

    .box div {
        width: 200px;
        height: 100px;
        background-color: pink;
    }
</style>

<div class="box">
    <div>1</div>
    <div>2</div>
    <div>3</div>
</div>
```

此时把.box中的高度给注释掉height: 300px;，此时父级的高度就不能靠子级撑开，此时黑描边就撑不开了，只显示一条线

flex布局：并不会脱标，即使注释掉父级的高度，黑描边也不会变成一条线

```html
<style>
    .box {
        display: flex;
        justify-content: space-between;
        /* height: 300px; */
        border: 1px solid #000;
    }
</style>
```



# 76.Flex组成

设置方式：给**父**元素设置 **display: flex**（df），此时可以把盒子变成弹性布局模型，即flex布局，子元素可以自动挤压或拉                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   伸

组成部分：

* 弹性容器（比如上面的.box，就叫做弹性容器）（很多flex属性都是加给弹性容器的，它里面有子级，子级就变成了弹性盒子）
* 弹性盒子（比如上面.box的子级）
* 主轴：默认在**水平**方向（由于主轴在水平方向，所以弹性盒子会沿着水平方向排列，未来会学习CSS属性，可以用来改变主侧轴的方向）
* 侧轴 / 交叉轴：默认在**垂直**方向

> 未来无论主轴在哪个方向，弹性盒子都是沿着主轴排列的。

> 验证挤压：多复制几个div标签，进入检查，查看子级的宽高变化，可以发现高没变，但是宽缩小了，此时弹性盒子自动挤压，在一行承担所有的弹性盒子
>
> ![image-20231226141632881](.\assets\image-20231226141632881.png)

> 验证拉伸：将子级的高度去掉，此时子级的高度就和父级的高度一样
>
> ![image-20231226142100405](.\assets\image-20231226142100405.png)

![1680335870554](./assets/1680335870554.png)

# 77.主轴对齐方式

属性名：**justify-content**

> 后四个是工作中常用的，直接输入s，按上下键选择即可
>
> center的效果：
>
> ![image-20231226143740781](.\assets\image-20231226143740781.png)
>
> space：空间，between：在...中间，在弹性盒子之间产生间距
>
> 浏览器分配尺寸的原则：把浏览器把父级剩余的尺寸分配给间距的
>
> <img src=".\assets\image-20231226142616117.png" alt="image-20231226142616117" style="zoom:50%;" />
>
> ![image-20231226143657963](.\assets\image-20231226143657963.png)
>
> space-around：弹性盒子之间的间距是两端间距的2倍
>
> ![image-20231226143618963](.\assets\image-20231226143618963.png)
>
> evenly：均匀的
>
> ![image-20231226143550653](.\assets\image-20231226143550653.png)

![1680335902526](./assets/1680335902526.png)

### 侧轴对齐方式

* align-items：当前弹性容器内**所有**弹性盒子的侧轴对齐方式（给**弹性容器**设置，即哪个标签有display: flex，这个属性就加给谁）（s带复数，表示所有）
* align-self：单独控制**某个弹性盒子**的侧轴对齐方式（给**弹性盒子**设置）

> 属性虽然不同，但属性值是一样的，前两个常用，后两个了解即可
>
> stretch：如果加尺寸了，就算设置了尺寸，加属性也不能拉伸，尺寸是多大，浏览器就显示多大。如果侧轴不加尺寸，即便不加stretch，默认也为拉伸的效果
>
> ![image-20231226145334518](.\assets\image-20231226145334518.png)

> 居中效果：
>
> ![image-20231226145511847](.\assets\image-20231226145511847.png)

> flex-start效果：
>
> ![image-20231226145606462](.\assets\image-20231226145606462.png)

> 设置单独的：
>
> ![image-20231226145820283](.\assets\image-20231226145820283.png)

![1680335957166](./assets/1680335957166.png)

# 78.修改主轴方向

**主轴默认在水平方向，侧轴默认在垂直方向**

属性名：**flex-direction**

> 只记一个column即可，其他的几乎不用，此属性值可以把主轴方向改到垂直方向，主轴方向变了，侧轴方向也会自动变到水平方向

![1680335988425](./assets/1680335988425.png)

准备工作：

![image-20231226153216615](.\assets\image-20231226153216615.png)

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        .box {
            width: 150px;
            height: 120px;
            background-color: pink;
        }

        img {
            width: 32px;
            height: 32px;
        }
    </style>
</head>
<body>
    <div class="box">
        <img src="img/1.png" alt="">
        <span>媒体</span>
    </div>
</body>
</html>
```

添加flex属性后：就在一行排列了，并且是顶对齐，不再拧巴着了

![image-20231226153412848](.\assets\image-20231226153412848.png)

将主轴换为垂直后，此时图片和文字垂直排列了，主轴变为垂直方向，侧轴自动变换到水平方向

![image-20231226153521491](.\assets\image-20231226153521491.png)



# 79.弹性伸缩比

作用：控制弹性盒子的主轴方向的尺寸。

> 主轴在水平方向，flex属性控制的就是盒子的宽度
>
> 主轴在垂直方向，flex属性控制的就是盒子的高度

属性名：**flex**

属性值：整数数字，表示占用**父级剩余尺寸的份数**。

准备工作：

![image-20231226154825680](.\assets\image-20231226154825680.png)

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        .box {
            height: 300px;
            border: 1px solid #000;
        }

        .box div {
            height: 100px;
            background-color: pink;
        }

        .box div:nth-child(1) {
            width: 200px;
        }
    </style>
</head>
<body>
    <div class="box">
        <div>1</div>
        <div>2</div>
        <div>3</div>
    </div>
</body>
</html>
```

添加display: flex;属性后：

> 第1个div因为有宽有高，所以按照我们设置的200 * 100显示的，但第2，第3个盒子，只有高，高是100px，宽跟内容一样大

![image-20231226154930288](.\assets\image-20231226154930288.png)

将子级的高注释掉后：侧轴进行了拉伸，主轴方向靠内容撑开（默认效果）

![image-20231226155219385](.\assets\image-20231226155219385.png)

先给第2个盒子设置flex属性，属性值为1，占用父级剩余尺寸的1份：

![image-20231226155525328](.\assets\image-20231226155525328.png)

然后给第3个盒子设置flex属性，属性值为2，此时第3个盒子占用的分数应该为2  /  (1 + 2)份

![image-20231226155810156](.\assets\image-20231226155810156.png)

当主轴变为垂直后，flex控制的就是盒子的高度

此时高度（主轴）就靠内容撑开，水平方向（侧轴）拉伸

![image-20231226160129649](.\assets\image-20231226160129649.png)

# 80.弹性换行

> 一般一行就显示几个，父级宽度盛不下，就换行显示，但在flex布局模式下，需要加flex-wrap属性才能实现这个效果。不然它会自动挤压和拉伸

弹性盒子可以自动挤压或拉伸，默认情况下，所有弹性盒子都在一行显示。

属性名：**flex-wrap**

属性值

* wrap：换行
* nowrap：不换行（默认）

默认效果：

![image-20231226160929176](.\assets\image-20231226160929176.png)

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        .box {
            display: flex;
            height: 300px;
            border: 1px solid #000;
        }

        .box div {
            width: 200px;
            height: 100px;
            background-color: pink;
        }

    </style>
</head>
<body>
    <div class="box">
        <div>1</div>
        <div>2</div>
        <div>3</div>
        <div>4</div>
        <div>5</div>
        <div>6</div>
        <div>7</div>
        <div>8</div>
        <div>9</div>
        <div>10</div>
        <div>11</div>
        <div>12</div>
    </div>
</body>
</html>
```

加flex-wrap属性：

![image-20231226161019683](.\assets\image-20231226161019683.png)

并且还可以把剩余部分的空白平均分配给每个盒子的间距

![image-20231226161238385](.\assets\image-20231226161238385.png)



### 行内对齐方式

属性名：**align-content** 

> 属性值的写法跟主轴对齐方式的属性值是一样的

![1680336183457](./assets/1680336183457.png)

> 注意：该属性对**单行**弹性盒子模型**无效**。 （比如把flex-wrap属性去掉，此时都是在一行显示，此时行内对齐属性就不生效了）

设置值为：flex-start

![image-20231226163001282](.\assets\image-20231226163001282.png)

设置值为：flex-end

![image-20231226163054286](.\assets\image-20231226163054286.png)

设置值为：center

![image-20231226163211486](.\assets\image-20231226163211486.png)

设置值为：space-between，在两行之间产生了距离

![image-20231226163322393](.\assets\image-20231226163322393.png)

设置值为：space-around（对于行来说，上下是它的两侧）

![image-20231226163404041](.\assets\image-20231226163404041.png)

设置值为：space-evenly

![image-20231226163459113](.\assets\image-20231226163459113.png)



04-综合案例 – 抖音解决方案 

![1680336238340](./assets/1680336238340.png)

整体布局

```html
<style>
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}

li {
  list-style: none;
}

.box {
  margin: 50px auto;
  width: 1200px;
  height: 418px;
  border: 1px solid #ddd;
  border-radius: 10px;
}
</style>

<div class="box"></div>
```

列表布局

测量ul的padding部分：

首先找到图片所占用的大小

![image-20231226173325499](.\assets\image-20231226173325499.png)

然后选择左侧的区域标注，先把88px *  88px给标注出来，然后再点击选择工具，点击区域的其中一个角，就可以挪动了。视觉效果让图片保持在区域的中间即可，此时就可以来测量.box的padding了

![image-20231226173554431](.\assets\image-20231226173554431.png)

```html
<style>
.box ul {
  display: flex;
  /* 弹性盒子换行 */
  flex-wrap: wrap;
  /* 调整主轴对齐方式 */
  justify-content: space-between;

  /* 调整 行对齐方式 */
  align-content: space-between;

  /* 这两个别忘了！ */
  padding: 90px 40px 90px 60px;
  height: 418px;
}

.box li {
  display: flex;
  width: 500px;
  /*不理解*/
  height: 88px;
  /* 可以使用它进行测试，最后注释掉即可：background-color: pink; */
}
</style>

<div class="box">
	<ul>
    <li>1</li>
    <li>2</li>
    <li>3</li>
    <li>4</li>
  </ul>
</div>
```

内容样式

```html
<style>
.box .pic {
  margin-right: 15px;
}

.box .text h4 {
  line-height: 40px;
  font-size: 20px;
  font-weight: 400;
  color: #333;
}

.box .text p {
  font-size: 14px;
  color: #666;
}
</style>

<ul>
  <li>
    <div class="pic">
      <img src="./images/1.svg" alt="">
    </div>
    <div class="text">
      <h4>一键发布多端</h4>
      <p>发布视频到抖音短视频、西瓜视频及今日头条</p>
    </div>
  </li>
  <li>
    <div class="pic">
      <img src="./images/2.svg" alt="">
    </div>
    <div class="text">
      <h4>管理视频内容</h4>
      <p>支持修改已发布稿件状态和实时查询视频审核状态</p>
    </div>
  </li>
  <li>
    <div class="pic">
      <img src="./images/3.svg" alt="">
    </div>
    <div class="text">
      <h4>发布携带组件</h4>
      <p>支持分享内容携带小程序、地理位置信息等组件，扩展内容及突出地域性</p>
    </div>
  </li>
  <li>
    <div class="pic">
      <img src="./images/4.svg" alt="">
    </div>
    <div class="text">
      <h4>数据评估分析</h4>
      <p>获取视频在对应产品内的数据表现、获取抖音热点，及时进行表现评估</p>
    </div>
  </li>
</ul>
```

day07-学成在线

# 83.项目目录

网站根目录是指存放网站的**第一层**文件夹，内部包含当前网站的**所有素材**，包含 HTML、CSS、图片、JavaScript等等。 

> index.css：根据网页的具体名字去保存就行了，比如说做首页，就叫index就行了

![1680336645218](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/基础班课程资料/笔记/day07/assets/1680336645218.png)

* 首页引入CSS文件

```html
<!-- 顺序要求：先清除再设置，用index里面的去覆盖base里面的 -->
<link rel="stylesheet" href="./css/base.css">
<link rel="stylesheet" href="./css/index.css">
```

## 版心居中

> 为了方便，可以把版心居中的代码放到一个类选择器里，未来哪个区域要有版型居中效果，就来使用这个类选择器就行了。
>
> 定义版心的类名一般叫做wrapper，要求是这个版心盒子需要有宽度
>
> 从像素大厨中可以看见学成在线网页的版心大小是1200px
> ![image-20231226184840393](.\assets\image-20231226184840393.png)

![1680336711608](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/基础班课程资料/笔记/day07/assets/1680336711608.png)

> 这里放到index.css更合适，因为这个index是首页的版心

```css
.wrapper {
  margin: 0 auto;
  width: 1200px;
}

body {
  background-color: #f3f5f7;
}
```

# 84.布局思路

1. 布局思路：先整体再局部，从外到内，从上到下，从左到右
2. CSS 实现思路
   1. 画盒子，调整盒子范围 → 宽高背景色
   2. 调整盒子位置 → flex 布局、内外边距
   3. 控制图片、文字内容样式

# 85.header区域-整体布局

![1680337054328](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/基础班课程资料/笔记/day07/assets/1680337054328.png)

HTML结构

> 最好加注释
>
> 这个白色的，宽度跟浏览器宽度一样大的，叫通栏效果
>
> header区域是通栏里面包含版心，版心里面包含四部分内容

```html
<!-- 头部区域 -->
<div class="header">
  <div class="wrapper">
    <!-- logo -->
    <div class="logo">logo</div>
    <!-- 导航 -->
    <div class="nav">导航</div>
    <!-- 搜索 -->
    <div class="search">search</div>
    <!-- 用户 -->
    <div class="user">用户</div>
  </div>
</div>
```

CSS样式

```css
/* 头部区域 */
.header {
  height: 100px;
  background-color: #fff;
}

.header .wrapper {
  padding-top: 29px;
  display: flex;
}
```

# 86.header区域-logo

![1680337229070](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/基础班课程资料/笔记/day07/assets/1680337229070.png)

logo 功能：

* 单击跳转到首页
* 搜索引擎优化：提升网站百度搜索排名

实现方法：

* 标签结构：h1 > a > 网站名称（搜索关键字）

```html
<div class="logo">
  <h1><a href="#">学成在线</a></h1>
</div>
```

* CSS 样式

```css
/* logo */
.logo a {
  display: block;
  width: 195px;
  height: 41px;
  background-image: url(../images/logo.png);
  font-size: 0;
}
```

# 87.header区域-导航

实现方法：

* 标签结构：ul > **li * 3** > a
* 优势：**避免堆砌 a 标签**，**网站搜索排名降级**

![1680337390943](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/基础班课程资料/笔记/day07/assets/1680337390943.png)

测量方法

![image-20231227135248978](.\assets\image-20231227135248978.png)

HTML结构

```html
<ul>
  <li><a href="#" class="active">首页</a></li>
  <li><a href="#">课程</a></li>
  <li><a href="#">职业规划</a></li>
</ul>
```

CSS样式

```css
/* 导航 */
.nav {
  margin-left: 102px;
}

.nav ul {
  display: flex;
}

.nav li {
  margin-right: 24px;
}

/* 行内元素只受行高影响，如果需要上内边距起作用，就需要将a转为块 */
.nav li a {
  display: block;
  padding: 6px 8px;
  line-height: 27px;
  font-size: 19px;
}


/* actvie 类选择器，表示默认选中的a */
.nav li .active,
.nav li a:hover {
  border-bottom: 2px solid #00a4ff;
}
```

# 88.header区域-搜索布局

![1680337525496](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/基础班课程资料/笔记/day07/assets/1680337525496.png)

HTML结构

```html
<div class="search"></div>
```

CSS样式

```css
.search {
  display: flex;
  /* 注意这个距离需要减去导航中的内外边距 */
  margin-left: 64px;
  padding-left: 19px;
  padding-right: 12px;
  width: 412px;
  height: 40px;
  background-color: #f3f5f7;
  border-radius: 20px;
}
```

## header区域-搜索内容

HTML结构

```html
<div class="search">
  <input type="text" placeholder="请输入关键词">
  <a href="#"></a>
</div>
```

CSS样式

```css
.search input {
   flex: 1;
   /* 去掉边框线和背景颜色 */
   border: 0;
   background-color: transparent;
   /* 去掉表单控件的焦点框，input自带黑框 */
   outline: none;
}

/* ::placeholder 选中就是 placeholder 属性文字样式*/
.search input::placeholder {
  font-size: 14px;
  color: #999;
}

/* 父级是flex布局，子级变弹性盒子：加宽高生效 */
.search a {
  align-self: center;
  width: 16px;
  height: 16px;
  background-image: url(../images/search.png);
}
```

# 89.header区域-用户区域

![1680337703358](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/基础班课程资料/笔记/day07/assets/1680337703358.png)

HTML结构

```html
<div class="user">
  <a href="#">
    <img src="./uploads/user.png" alt="">
    <span>播仔学前端</span>
  </a>
</div>
```

CSS样式

```css
/* 用户 */
.user {
  margin-left: 32px;
  margin-top: 4px;
}

.user img {
  margin-right: 7px;
  /* vertical-align 行内块和行内垂直方向对齐方式 */
  vertical-align: middle;
}

.user span {
  font-size: 16px;
  color: #666;
}
```

# 89.banner区域-布局

> 区域先有通栏，再有版心，通栏直接使用类名.banner即可
>
> 由于未来内容要压在图片的上面，所以版心加了背景图片

![1680337778559](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/基础班课程资料/笔记/day07/assets/1680337778559.png)

HTML结构

```html
<div class="banner">
  <div class="wrapper">
    <div class="left">left</div>
    <div class="right">right</div>
  </div>
</div>
```

CSS样式

```css
/* banner 区域 */
.banner {
  height: 420px;
  background-color: #0092cb;
}

.banner .wrapper {
  display: flex;
  justify-content: space-between;
  height: 420px;
  background-image: url(../uploads/banner.png);
}
```

## banner区域-侧导航

> 想要看颜色，点击任意一块导航区域都可以
>
> opacity：透明度
>
> ![image-20231227155328600](.\assets\image-20231227155328600.png)

HTML结构

```html
<div class="left">
  <ul>
    <li><a href="#">前端开发</a></li>
    <li><a href="#">后端开发</a></li>
    <li><a href="#">移动开发</a></li>
    <li><a href="#">人工智能</a></li>
    <li><a href="#">商业预测</a></li>
    <li><a href="#">云计算&大数据</a></li>
    <li><a href="#">运维&测试</a></li>
    <li><a href="#">UI设计</a></li>
    <li><a href="#">产品</a></li>
  </ul>
</div>
```

CSS样式

```css
/* 侧导航 */
.banner .left {
  padding: 3px 20px;
  width: 191px;
  height: 420px;
  background-color: rgba(0,0,0,0.42);
}

.banner .left a {
  /* 这里推荐转块级而不是行内块，块级：宽度是父级的100% */
  display: block;
  height: 46px;
    /* 背景一般是跟高度黏在一起的 */
  background: url(../images/right.png) no-repeat right center;
    /* 设置行高即可，而不是设置li的高度 */
  line-height: 46px;
  font-size: 16px;
  color: #fff;
}

.banner .left a:hover {
  background-image: url(../images/right-hover.png);
  color: #00a4ff;
}
```

## banner区域-课程表布局

![1680338145736](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/基础班课程资料/笔记/day07/assets/1680338145736.png)

HTML布局

```html
<div class="right">
  <h3>我的课程表</h3>
  <div class="content">1</div>
</div>
```

CSS样式

```css
/* 课程表 */
.banner .right {
  margin-top: 60px;
  width: 218px;
  height: 305px;
  background-color: #209dd5;
  border-radius: 10px;
}

.banner .right h3 {
  margin-left: 14px;
  height: 48px;
  line-height: 48px;
  font-size: 15px;
  color: #fff;
  font-weight: 400;
}

.banner .right .content {
  padding: 14px;
  height: 257px;
  background-color: #fff;
  border-radius: 10px;
}
```

## banner区域-课程表内容

HTML结构

```html
<dl>
  <dt>数据可视化课程</dt>
  <dd><span>正在学习</span>-<strong>echarts使用步骤</strong></dd>
</dl>
<dl>
  <dt>Vue3医疗项目课程  </dt>
  <dd><span>正在学习</span>-<strong>认识组合式API</strong></dd>
</dl>
<dl>
  <dt>React核心技术课程</dt>
  <dd><span>正在学习</span>-<strong>rudex配合TS使用</strong></dd>
</dl>
```

CSS样式

12px的测量：

![image-20231227165545253](.\assets\image-20231227165545253.png)



调间距的时候是行高配合底下的margin来实现的

![image-20231227170820361](.\assets\image-20231227170820361.png)

```css
.banner .right dl {
  margin-bottom: 12px;
  border-bottom: 1px solid #e0e0e0;
}

.banner .right dt {
  margin-bottom: 8px;
  font-size: 14px;
  line-height: 20px;
  font-weight: 700;
}

.banner .right dd {
  margin-bottom: 8px;
  font-size: 12px;
  line-height: 16px;
}

.banner .right dd span {
  color: #00a4ff;
}

.banner .right dd strong {
  color: #7d7d7d;
  font-weight: 400;
}
```

## banner区域-全部课程

HTML结构

```html
<a href="#">全部课程</a>
```

CSS样式

```css
.banner .right a {
  display: block;
  height: 32px;
  background-color: #00a4ff;
  text-align: center;
  line-height: 32px;
  font-size: 14px;
  color: #fff;
  border-radius: 15px;
}
```

# 91.精品推荐-区域布局

> 该区域分为三部分：标题、技术菜单、修改兴趣
>
> 修改兴趣需要加类名是因为ul里面也有a

![1680338252106](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/基础班课程资料/笔记/day07/assets/1680338252106.png)

HTML结构

```html
<!-- 精品推荐 -->
<div class="recommend wrapper">
  <h3>精品推荐</h3>
  <ul>
    <li><a href="#">HTML</a></li>
  </ul>
  <a href="#" class="modify">修改兴趣</a>
</div
```

CSS样式

> 写CSS样式的时候也尽量按顺序来

```css
/* 精品推荐 */
/* 如果是这样写的话，就不可以直接写成.remommend .wrapper了 */
.recommend {
  display: flex;
  margin-top: 11px;
  padding: 0 20px;
  height: 60px;
  background-color: #fff;
  box-shadow: 0px 1px 2px 0px rgba(211, 211, 211, 0.5);
  line-height: 60px;
}
```

## 精品推荐-内容样式

HTML结构

```html
<ul>
  <li><a href="#">HTML</a></li>
  <li><a href="#">CSS</a></li>
  <li><a href="#">JavaScript</a></li>
  <li><a href="#">Node.js</a></li>
  <li><a href="#">Ajax</a></li>
  <li><a href="#">Vue2.0</a></li>
  <li><a href="#">Vue3.0</a></li>
  <li><a href="#">TypeScript</a></li>
  <li><a href="#">React</a></li>
</ul>
```

CSS样式

> 有个小细节：![image-20231227174020250](.\assets\image-20231227174020250.png)
>
> 字旁边的竖线和字一样高。这些字在li里的a里面，是行内，宽高靠内容撑开，此时就可以直接把边加给行内标签a，这样a的高跟字的高就一样了。最后一个a去掉描边即可。

```css
.recommend h3 {
  font-size: 18px;
  color: #00a4ff;
  font-weight: 400;
}

.recommend ul {
  /* 除去标题和修改兴趣的尺寸，父级剩余尺寸都给ul，实现把修改兴趣挤到最右侧 */
  flex: 1;
  display: flex;
}

.recommend ul li a {
  padding: 0 24px;
  border-right: 1px solid #e0e0e0;
  font-size: 18px;
}

.recommend ul li:last-child a {
  /* 取值为0或者none都行 */
  border-right: 0;
}

.recommend .modify {
  font-size: 16px;
  color: #00a4ff;
}
```

# 92.推荐课程-标题区域

![1680338517515](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/基础班课程资料/笔记/day07/assets/1680338517515.png)

HTML结构

```html
<!-- 精品推荐课程 -->
<div class="course wrapper">
  <!-- 标题 -->
  <div class="hd">
    <h3>精品推荐</h3>
    <a href="#" class="more">查看全部</a>
  </div>
  <!-- 内容 -->
  <div class="bd">1</div>
</div>
```

CSS样式

由于精品推荐上下都是有距离的，做法除了给精品推荐加上下margin。

第二种做法可以减少浏览器里默认行高的误差。

做法：我们认为精品推荐在一定的高度里垂直居中，此时就需要写高写行高，默认行高就不生效了，误差也就没了。

找到高和行高了，上面还是会多一部分区域，那我们就把上面的距离加点区域，变成margin-top就行了。

<img src=".\assets\image-20231227175437438.png" alt="image-20231227175437438" style="zoom:50%;" />      

```css
/* 推荐课程 */
.course {
  margin-top: 15px;
}

/* 标题 - 公共类，与其他区域共用，所以这里并没有限制父级 */
.hd {
  display: flex;
  justify-content: space-between;
  height: 60px;
  line-height: 60px;
}

.hd h3 {
  font-size: 21px;
  font-weight: 400;
}

.hd .more {
  padding-right: 20px;
  background: url(../images/more.png) no-repeat right center;
  font-size: 14px;
  color: #999;
}
```

## 推荐课程-内容布局

HTML结构

```html
<ul>
  <li>1</li>
  <li>2</li>
  <li>3</li>
  <li>4</li>
  <li>5</li>
  <li>6</li>
  <li>7</li>
  <li>8</li>
</ul>
```

CSS样式

```css
/* 课程内容 - 公共类 */
.bd ul {
  display: flex;
  flex-wrap: wrap;
  justify-content: space-between;
}

.bd li {
  margin-bottom: 14px;
  width: 228px;
  height: 271px;
  background-color: pink;
}
```

## 推荐课程-内容样式

> 宽度跟父级一样大就不需要管宽度

> 注意观察，无论文字是一行字还是两行字，都不影响高级那一行的位置，说明文字的高度是固定的
>
> ![image-20231227193106567](.\assets\image-20231227193106567.png)

HTML结构

```html
<ul>
  <li>
    <a href="#">
      <div class="pic"><img src="./uploads/course01.png" alt=""></div>
      <div class="text">
        <h4>JavaScript数据看板项目实战</h4>
        <p><span>高级</span> · <i>1125</i>人在学习</p>
      </div>
    </a>
  </li>
  <li>
    <a href="#">
      <div class="pic"><img src="./uploads/course02.png" alt=""></div>
      <div class="text">
        <h4>Vue.js实战——面经全端项目</h4>
        <p><span>高级</span> · <i>2726</i>人在学习</p>
      </div>
    </a>
  </li>
  <li>
    <a href="#">
      <div class="pic"><img src="./uploads/course03.png" alt=""></div>
      <div class="text">
        <h4>玩转Vue全家桶，iHRM人力资源项目</h4>
        <p><span>高级</span> · <i>9456</i>人在学习</p>
      </div>
    </a>
  </li>
  <li>
    <a href="#">
      <div class="pic"><img src="./uploads/course04.png" alt=""></div>
      <div class="text">
        <h4>Vue.js实战医疗项目——优医问诊</h4>
        <p><span>高级</span> · <i>7192</i>人在学习</p>
      </div>
    </a>
  </li>
  <li>
    <a href="#">
      <div class="pic"><img src="./uploads/course05.png" alt=""></div>
      <div class="text">
        <h4>小程序实战：小兔鲜电商小程序项目</h4>
        <p><span>高级</span> · <i>2703</i>人在学习</p>
      </div>
    </a>
  </li>
  <li>
    <a href="#">
      <div class="pic"><img src="./uploads/course06.png" alt=""></div>
      <div class="text">
        <h4>前端框架Flutter开发实战</h4>
        <p><span>高级</span> · <i>2841</i>人在学习</p>
      </div>
    </a>
  </li>
  <li>
    <a href="#">
      <div class="pic"><img src="./uploads/course07.png" alt=""></div>
      <div class="text">
        <h4>熟练使用React.js——极客园H5项目</h4>
        <p><span>高级</span> · <i>95682</i>人在学习</p>
      </div>
    </a>
  </li>
  <li>
    <a href="#">
      <div class="pic"><img src="./uploads/course08.png" alt=""></div>
      <div class="text">
        <h4>熟练使用React.js——极客园PC端项目</h4>
        <p><span>高级</span> · <i>904</i>人在学习</p>
      </div>
    </a>
  </li>
  <li>
    <a href="#">
      <div class="pic"><img src="./uploads/course09.png" alt=""></div>
      <div class="text">
        <h4>前端实用技术，Fetch API 实战</h4>
        <p><span>高级</span> · <i>1516</i>人在学习</p>
      </div>
    </a>
  </li>
  <li>
    <a href="#">
      <div class="pic"><img src="./uploads/course10.png" alt=""></div>
      <div class="text">
        <h4>前端高级Node.js零基础入门教程</h4>
        <p><span>高级</span> · <i>2766</i>人在学习</p>
      </div>
    </a>
  </li>
</ul>
```

CSS样式

```css
.bd li .pic {
  height: 156px;
}

.bd li .text {
  padding: 20px;
  height: 115px;
  background-color: #fff;
}

.bd li .text h4 {
  margin-bottom: 13px;
  height: 40px;
  font-size: 14px;
  line-height: 20px;
  font-weight: 400;
}

.bd li .text p {
  font-size: 14px;
  line-height: 20px;
  color: #999;
}

.bd li .text p span {
  color: #fa6400;
}

.bd li .text p i {
  font-style: normal;
}
```

# 93.前端开发工程师区域

![1680339112336](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/基础班课程资料/笔记/day07/assets/1680339112336.png)

HTML结构

```html
<!-- 前端 -->
<div class="wrapper">
  <!-- 标题 -->
  <div class="hd">
    <h3>前端开发工程师</h3>
    <ul>
      <li><a href="#" class="active">热门</a></li>
      <li><a href="#">初级</a></li>
      <li><a href="#">中级</a></li>
      <li><a href="#">高级</a></li>
    </ul>
    <a href="#" class="more">查看全部</a>
  </div>
  <div class="bd">
    <div class="left">
      <img src="./uploads/web_left.png" alt="">
    </div>
    <div class="right">
      <div class="top"><img src="./uploads/web_top.png" alt=""></div>
      <div class="bottom">
        <ul>
          <li>
            <a href="#">
              <div class="pic"><img src="./uploads/web01.png" alt=""></div>
              <div class="text">
                <h4>JS高级javaScript进阶面向对象ES6</h4>
                <p><span>高级</span> · <i>101937</i>人在学习</p>
              </div>
            </a>
          </li>
          <li>
            <a href="#">
              <div class="pic"><img src="./uploads/web02.png" alt=""></div>
              <div class="text">
                <h4>零基础玩转微信小程序</h4>
                <p><span>高级</span> · <i>133781</i>人在学习</p>
              </div>
            </a>
          </li>
          <li>
            <a href="#">
              <div class="pic"><img src="./uploads/web03.png" alt=""></div>
              <div class="text">
                <h4>JavaScript基础——语法解析+项目实战</h4>
                <p><span>高级</span> · <i>8927</i>人在学习</p>
              </div>
            </a>
          </li>
          <li>
            <a href="#">
              <div class="pic"><img src="./uploads/web04.png" alt=""></div>
              <div class="text">
                <h4>前端框架Vue2+Vue3全套视频</h4>
                <p><span>高级</span> · <i>26022</i>人在学习</p>
              </div>
            </a>
          </li>
        </ul>
      </div>
    </div>
  </div>
</div>
```

CSS样式

```css
/* 前端 */
.hd ul {
  display: flex;
}

.hd li {
  margin-right: 60px;
  font-size: 16px;
}

.hd li .active {
  color: #00a4ff;
}

.bd {
  display: flex;
  justify-content: space-between;
}

.bd .left {
  width: 228px;
  /* background-color: pink; */
}

.bd .right {
  width: 957px;
  /* background-color: pink; */
}

.bd .right .top {
  margin-bottom: 15px;
  height: 100px;
}
```

# 94.版权-布局

![1680339154682](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/基础班课程资料/笔记/day07/assets/1680339154682.png)

HTML结构

```html
<!-- 版权 -->
<div class="footer">
  <div class="wrapper">
    <div class="left">left</div>
    <div class="right">right</div>
  </div>
</div>
```

CSS样式

```css
/* 版权 */
.footer {
  margin-top: 60px;
  padding-top: 60px;
  height: 273px;
  background-color: #fff;
}

.footer .wrapper {
  display: flex;
  justify-content: space-between;
}

.footer .left {
  /* 把左区域设置了宽，文字就会自动换行 */
  width: 440px;
  background-color: pink;
}
```

## 版权-内容

HTML结构

```html
<div class="left">
  <a href="#"><img src="./images/logo.png" alt=""></a>
  <p>学成在线致力于普及中国最好的教育它与中国一流大学和机构合作提供在线课程。
    © 2017年XTCG Inc.保留所有权利。-沪ICP备15025210号</p>
  <a href="#" class="download">下载APP</a>
</div>
<div class="right">
  <dl>
    <dt>关于学成网</dt>
    <dd><a href="#">关于</a></dd>
    <dd><a href="#">管理团队</a></dd>
    <dd><a href="#">工作机会</a></dd>
    <dd><a href="#">客户服务</a></dd>
    <dd><a href="#">帮助</a></dd>
  </dl>
  <dl>
    <dt>新手指南</dt>
    <dd><a href="#">如何注册</a></dd>
    <dd><a href="#">如何选课</a></dd>
    <dd><a href="#">如何拿到毕业证</a></dd>
    <dd><a href="#">学分是什么</a></dd>
    <dd><a href="#">考试未通过怎么办</a></dd>
  </dl>
  <dl>
    <dt>合作伙伴</dt>
    <dd><a href="#">合作机构</a></dd>
    <dd><a href="#">合作导师</a></dd>
  </dl>
</div>
```

CSS样式

```css
.footer .left p {
  margin-top: 24px;
  margin-bottom: 14px;
  font-size: 12px;
  line-height: 17px;
  color: #666;
}

.footer .left .download {
  display: block;
  width: 120px;
  height: 36px;
  border: 1px solid #00a4ff;
  text-align: center;
  /* 由于上下有描边，就可以给34px */
  line-height: 34px;
  font-size: 16px;
  color: #00a4ff;
}

.footer .right {
  display: flex;
}

.footer .right dl {
  margin-left: 130px;
}

.footer .right dt {
  margin-bottom: 12px;
  font-size: 16px;
  line-height: 23px;
}

.footer .right a {
  font-size: 14px;
  color: #666;
  line-height: 24px;
}
```



day08-CSS高级

> 目标：掌握定位的作用及特点；掌握 CSS 高级技巧

# 96.定位

作用：灵活的改变盒子在网页中的位置

实现步骤：

1.定位模式：position（设置定位模式）

2.边偏移：设置盒子的位置

* left
* right
* top
* bottom

### 相对定位

> 工作中一般不会直接使用relative相对定位，因为当自己移走后，原来的位置别人也不能占用，这就会导致网页有大片的留白。一般相对定位都会和其他的定位方式配合使用。

**position: relative**

特点：

* 不脱标，占用自己原来位置

* 显示模式特点保持不变

  > 使用浏览器的检查，选中div标签，可以看见该盒子仍是块级
  >
  > ![image-20240101183421739](O:\BaiduSyncdisk\other\StudyNote\Vue2+Vue3\assets\image-20240101183421739.png)

* 设置边偏移则相对**自己原来位置**移动

```css
div {
  position: relative;
  top: 100px;
  left: 200px;
}	
```

### 绝对定位

**position: absolute**

使用场景：子级绝对定位，父级相对定位（**子绝父相**），这样子级的位置无论怎么改变，就只会出现在父级区域的里面，都不会超出父级的范围

特点：

* 脱标，不占位
* 能让宽高生效，显示模式具备**行内块**特点
* 设置边偏移则相对**最近的已经定位的祖先元素**改变位置
* 如果祖先元素都未定位，则相对浏览器可视区（浏览器窗口）改变位置
* 定位：后来者居上

> 一般在工作中都不会相对定位或者绝对定位单独使用，大部分都是配合使用

```css
.father {
  position: relative;
}

.father span {
  position: absolute;
  top: 0;
  right: 0;
}
```

### 定位居中

![1680340142857](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/基础班课程资料/笔记/day08/assets/1680340142857.png)

实现步骤：

1. 绝对定位

   > 如果盒子需要在父级居中，子绝父相，如果只是想在浏览器窗口加居中，那我们只需要把需要居中的盒子加绝对定位就行了。

2. 水平、垂直边偏移为 50%

   > left：50%; 此时盒子的最左边缘会出现在参照物的中间
   >
   > top：50%；盒子的最上边缘会出现在参照物的中间
   >
   > 此时是盒子的左上角出现在了参照物的中间

3. 子级向左、上移动自身尺寸的一半

* 左、上的外边距为 –尺寸的一半

* transform: translate(-50%, -50%)，这里的50%取的就是盒子宽高的一半，第一个-50%是水平方向，第二个是垂直方向

  transform: translateY(50%); 只移动水平方向

> 在VSCode的左下角是可以看见图片的大小的
>
> <img src=".\assets\image-20231227210359678.png" alt="image-20231227210359678" style="zoom: 50%;" />

```css
img {
  position: absolute;
  left: 50%;
  top: 50%;

  /* margin-left: -265px;
  margin-top: -127px; */

  /* 方便： 50% 就是自己宽高的一半 */
  transform: translate(-50%, -50%);
}
```

### 固定定位

position: fixed

场景：元素的位置在网页滚动时不会改变

特点：

* 脱标，不占位
* 加宽高生效，显示模式具备**行内块**特点（块级元素也会转行内块）
* 设置边偏移相对**浏览器窗口**改变位置

```css
div {
  position: fixed;
  top: 0;
  right: 0;

  width: 500px;
}
```

# 97.堆叠层级z-index

![1680340281795](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/基础班课程资料/笔记/day08/assets/1680340281795.png)

默认效果：按照标签书写顺序，后来者居上

作用：设置定位元素的层级顺序，改变定位元素的显示顺序

属性名：**z-index**

属性值：**整数数字**（默认值为0，取值越大，层级越高）

```css
.box1 {
  background-color: pink;
  /* 取值是整数，默认是0，取值越大显示顺序越靠上 */
  z-index: 1;
}

.box2 {
  background-color: skyblue;
  left: 100px;
  top: 100px;

  z-index: 2;
}
```

# 98.定位总结

![image-20240102104326303](O:\BaiduSyncdisk\other\StudyNote\Vue2+Vue3\assets\image-20240102104326303.png)

# 99.高级技巧

## CSS精灵

CSS 精灵，也叫 **CSS Sprites**，是一种网页**图片应用处理方式**。把网页中**一些背景图片**整合到**一张图片**文件中，再**background-position** 精确的定位出背景图片的位置。

![1680340401800](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/基础班课程资料/笔记/day08/assets/1680340401800.png)

优点：减少服务器被请求次数，减轻服务器的压力，提高页面加载速度

![1680340411600](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/基础班课程资料/笔记/day08/assets/1680340411600.png)

实现步骤：

1. 创建盒子，**盒子尺寸**与**小图**尺寸**相同**

   > 这里使用尺子量和区域量都可以，这里使用区域测量
   >
   > <img src="O:\BaiduSyncdisk\other\StudyNote\Vue2+Vue3\assets\image-20240102105056746.png" alt="image-20240102105056746" style="zoom: 33%;" />
   >
   > <img src=".\assets\image-20240102125806520.png" alt="image-20240102125806520" style="zoom: 33%;" />

2. 设置盒子**背景图**（精灵大图或者雪碧图）为精灵图

3. 添加 **background-position** 属性，改变**背景图位置**

​       3.1 使用 PxCook 测量小图片**左上角坐标**

​       3.2 取**负数**坐标为 background-position 属性值（向左上移动图片位置）

像素大厨标注坐标点：

![image-20231227212657343](.\assets\image-20231227212657343.png)

# 100.案例-京东服务

![1680340481861](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/基础班课程资料/笔记/day08/assets/1680340481861.png)

查看京东结构：

![image-20240102110011231](.\assets\image-20240102110011231.png)

HTML结构

```html
<div class="service">
  <ul>
    <li>
      <h5></h5>
      <p>品类齐全，轻松购物</p>
    </li>
    <li>
      <h5></h5>
      <p>多仓直发，极速配送</p>
    </li>
    <li>
      <h5></h5>
      <p>正品行货，精致服务</p>
    </li>
    <li>
      <h5></h5>
      <p>天天低价，畅选无忧</p>
    </li>
  </ul>
</div>
```

CSS样式

```html
<style>
  * {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
  }

  li {
    list-style: none;
  }

  .service {
    margin: 100px auto;
    width: 1190px;
    height: 42px;
    /* background-color: pink; */
  }

  .service ul {
    display: flex;
  }

  .service li {
    display: flex;
    padding-left: 40px;
    width: 297px;
    height: 42px;
    /* background-color: skyblue; */
  }

  .service li h5 {
    margin-right: 10px;
    width: 36px;
    height: 42px;
    /* background-color: pink; */
    background: url(./images/sprite.png) 0 -192px;
  }

  .service li:nth-child(2) h5 {
    background-position: -41px -192px;
  }

  .service li:nth-child(3) h5 {
    background-position: -82px -192px;
  }

  .service li:nth-child(4) h5 {
    background-position: -123px -192px;
  }

  .service li p {
    font-size: 18px;
    color: #444;
    font-weight: 700;
    line-height: 42px;
  }
</style>
```

# 101.字体图标

![1680340562425](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/基础班课程资料/笔记/day08/assets/1680340562425.png)

选择想要找的图片，然后右击检查，它就可以直接定位到该图标的标签

![image-20240102130655159](.\assets\image-20240102130655159.png)

字体图标：**展示的是图标，本质是字体**

作用：在网页中添加**简单的、颜色单一**的小图标

优点

* **灵活性**：灵活地修改样式，例如：尺寸、颜色等
* **轻量级**：体积小、渲染快、降低服务器请求次数
* **兼容性**：几乎兼容所有主流浏览器
* **使用方便**：先下载再使用

#### 下载字体

iconfont 图标库：<https://www.iconfont.cn/> （阿里巴巴的）

登录 → 素材库 → 官方图标库 → 进入图标库 → 选图标，加入购物车 → 购物车，添加至项目，确定 → 下载至本地 

官方图标库里面图标较多，而且还都是免费的

![image-20240102131715684](.\assets\image-20240102131715684.png)

选择想要的加入购物车，移至图标上方点击还能删除，选择 '添加至项目'，因为这个下载是最全的。

<img src=".\assets\image-20240102131916806.png" alt="image-20240102131916806" style="zoom:50%;" />

![image-20240102132103453](.\assets\image-20240102132103453.png)

解压后会给它改个名，一般就是图像库的名字

![image-20240102132157089](.\assets\image-20240102132157089.png)

![1680340665988](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/基础班课程资料/笔记/day08/assets/1680340665988.png)

工作中一般就把它改名为iconfont，哪个项目要用，复制到项目目录即可

![image-20240102132328206](.\assets\image-20240102132328206.png)

#### 使用字体

1. 引入字体样式表（iconfont.css） 

   在默认情况下，字体名都叫iconfont，可以改，但一般不改

![1680340697011](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/基础班课程资料/笔记/day08/assets/1680340697011.png)

2. 标签使用字体图标类名
   * iconfont：字体图标基本样式（字体名，字体大小等等）
   
   * icon-xxx：图标对应的类名
   
     在demo.html里面复制粘贴
   
     ![image-20240102133304594](.\assets\image-20240102133304594.png)

![1680340718890](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/基础班课程资料/笔记/day08/assets/1680340718890.png)

> 字体图标调整大小，在使用选择器时需要注意选择器的优先级，必须要高于iconfont这个类就行。
>
> ![image-20240102133740179](.\assets\image-20240102133740179.png)
>
> 如果此时使用的是标签选择器，会被类选择器给覆盖，字体大小并不会生效
>
> 字体图标默认字体大小为16px

# 101. 上传矢量图

作用：项目特有的图标上传到 iconfont 图标库，生成字体

> 准备好后缀名是svg的小图，未来把svg上传到图标库，这个对标库会给我们生成对应的字体。未来下载使用即可，并且这种下载和使用的方法和我们刚刚是一模一样的。

![1680340775611](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/基础班课程资料/笔记/day08/assets/1680340775611.png)

上传步骤：上传 → 上传图标 → 选择 svg 矢量图，打开 → 提交 → 系统审核

![image-20240102134249396](.\assets\image-20240102134249396.png)

如果全部要上传，可以ctrl + A全选

![image-20240102134605006](.\assets\image-20240102134605006.png)

一般是选择去除颜色并提交

![image-20240102134704837](.\assets\image-20240102134704837.png)

03-CSS修饰属性

# 103.垂直对齐方式 

浏览器会把行内块、行内标签都当做文字处理，当成文字后，浏览器里所有的文字默认都按基线对齐（即下方红色的线）

![1680340838945](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/基础班课程资料/笔记/day08/assets/1680340838945.png)

如果想让它不按基线对齐，直接加vertival-align属性即可

属性名：vertical-align

最常见的取值就是middle，使他居中对齐

![1680340829633](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/基础班课程资料/笔记/day08/assets/1680340829633.png)

在内容里，谁占的高度最大，就给谁加

![image-20240102142710056](.\assets\image-20240102142710056.png)

此时默认就不按基线对齐，而是按中间对齐，基线下方的小空白也凸显不出来了

![image-20240102142649429](.\assets\image-20240102142649429.png)

顶对齐：最高内容的顶部，底部的小空白没有

![image-20240102142816710](.\assets\image-20240102142816710.png)

底对齐：最高内容的底部，底部的小空白任然没有，只要不是基线对齐，图片底下就不会有空白间距

> 想去掉图片底下的空白还有种方式：转为块显示模式
>
> 图片底下之所以有空白，是因为浏览器把行内块标签当做字处理，按基线对齐

~~~html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>垂直对齐方式</title>
  <style>
    div {
      border: 1px solid #000;
    }

    img {
      /* vertical-align: middle; */

      /* 顶对齐：最高内容的顶部 */
      /* vertical-align: top; */

      /* 底对齐：最高内容的底部 */
      /* vertical-align: bottom; */

      /* 因为浏览器把行内块、行内标签当做文字处理，默认按基线对齐 */
      /* 效果：图片img的底下有空白，转块级不按基线对齐，空白就消失了 */
      display: block;
    }
  </style>
</head>
<body>
  <div>
    <img src="./images/1.webp" alt="">
    <!-- 我是谁？我在哪？ -->
  </div>
</body>
</html>
~~~

# 104.过渡

作用：可以为一个元素在**不同状态**之间切换的时候添加**过渡效果**

> 这里的不同状态指的是标签的默认状态跟鼠标悬停状态
>
> 过渡效果一般是大小的变化、位置的变化

属性名：**transition（复合属性）**

> 复合属性：属性有多个值，而且都是空格隔开的

属性值：**过渡的属性  花费时间 (s)**

提示：

* 过渡的属性可以是具体的 CSS 属性（eg：width、height等等
* 也可以为 all（两个状态属性值不同的所有属性，都产生过渡效果）
* transition 设置给元素本身

```css
img {
  width: 200px;
  height: 200px;
  /* 设置给元素本身，而不是加给hover状态，谁做过度（谁变化），就给谁加即可 */
  transition: all 1s;/* 如果是小数，常写类似于.5s */
}

img:hover {
  width: 500px;
  height: 500px;
}
```

# 104.透明度opacity

> rgba只能让背景半透明，但opacity可以让背景和内容都透明

作用：设置**整个元素的透明度**（包含背景和内容）

属性名：opacity

属性值：0 – 1

* 0：完全透明（元素不可见）
* 1：不透明
* 0-1之间小数：半透明

### 光标类型cursor

作用：鼠标悬停在元素上时指针显示样式

属性名：cursor

![1680342344485](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/基础班课程资料/笔记/day08/assets/1680342344485.png)

# 105.综合案例-轮播图

![1680342362855](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/基础班课程资料/笔记/day08/assets/1680342362855.png)

图片效果

HTML结构

```html
<div class="banner">
    <!-- 图: ul > li -->
    <ul>
      <li><a href="#"><img src="./images/banner1.jpg" alt=""></a></li>
      <li><a href="#"><img src="./images/banner2.jpg" alt=""></a></li>
      <li><a href="#"><img src="./images/banner3.jpg" alt=""></a></li>
    </ul>
</div>
```

CSS样式

```css
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}

li {
  list-style: none;
}

.banner {
  position: relative;
  margin: 100px auto;
  width: 564px;
  height: 315px;
  /* background-color: pink; */
  overflow: hidden;
}

/* 图片 */
.banner img {
  width: 564px;
  border-radius: 12px;
  vertical-align: middle;
}

.banner ul {
  display: flex;
}
```

### 箭头

HTML结构

```html
<!-- 箭头 -->
<!-- 上一张 prev -->
<a href="#" class="prev">
  <i class="iconfont icon-zuoce"></i>
</a>
<!-- 下一张 next -->
<a href="#" class="next">
  <i class="iconfont icon-youce"></i>
</a>
```

CSS样式

```css
/* 箭头 */
.banner .prev,
.banner .next {
  /* 隐藏 */
  display: none;
  position: absolute;
  top: 50%;
  transform: translateY(-50%);

  width: 20px;
  height: 30px;
  background-color: rgba(0,0,0, 0.3);

  text-decoration: none;
  color: #fff;
  line-height: 30px;
}

/* 鼠标滑到banner区域，箭头要显示 display:block */
.banner:hover .prev,
.banner:hover .next {
  display: block;
}

.banner .prev {
  left: 0;
  border-radius: 0 15px 15px 0;
}

.banner .next {
  right: 0;
  border-radius: 15px 0 0 15px;
  text-align: center;
}
```

### 圆点

> 圆点的宽可以不设置，因为圆点的个数和图片的数目一样多

HTML结构

```html
<!-- 圆点 -->
<ol>
  <li></li>
  <li class="active"></li>
  <li></li>
</ol>
```

CSS样式

```css
/* 圆点 */
.banner ol {
  position: absolute;
  bottom: 20px;
  left: 50%;
  transform: translateX(-50%);
  height: 13px;
  background-color: rgba(255,255,255,0.3);

  display: flex;

  border-radius: 10px;
}

.banner ol li {
  margin: 3px;
  width: 8px;
  height: 8px;
  background-color: #fff;
  border-radius: 50%;
  cursor: pointer;
}

/* 橙色的li */
.banner ol .active {
  background-color: #ff5000;
}
```



day09-小兔鲜儿

# 108.搭建项目 目录

![1680342815532](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/基础班课程资料/笔记/day09/assets/1680342815532.png)

* xtx-pc（用电脑看的网页叫pc端）
  * images 文件夹：存放固定使用的图片素材，例如：logo、样式修饰图等等
  * uploads 文件夹：存放非固定使用的图片素材，例如：商品图、宣传图需要上传的图片
  * iconfont 文件夹：字体图标素材
  * css 文件夹：存放 CSS 文件（link 标签引入）
    * base.css：基础公共样式
    * common.css：各个网页相同模块的重复样式，例如：头部、底部
    * index.css：首页 CSS 样式
  * index.html：首页 HTML 文件

**引入样式表**

```html
<link rel="stylesheet" href="./iconfont/iconfont.css">
<link rel="stylesheet" href="./css/base.css">
<link rel="stylesheet" href="./css/common.css">
<link rel="stylesheet" href="./css/index.css">
```

# 109.网页头部SEO三大标签

SEO：搜索引擎优化，提升网站百度搜索排名

提升SEO的常见方法：

1. 竞价排名
2. 将网页制作成html后缀
3. 标签语义化（在合适的地方使用合适的标签）（eg：是标题的地方就用h，logo就用h1，段落就用p，重要的文字就用strong带有强调语义的标签放）
4. ……

网页头部 SEO 标签：

* title：网页标题标签                                                                                                                                       

* description：网页描述

  ![image-20240102164129378](.\assets\image-20240102164129378.png)

* keywords：网页关键词

  ![image-20240102164147034](.\assets\image-20240102164147034.png)

![1680342859110](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/基础班课程资料/笔记/day09/assets/1680342859110.png)

```html
<!-- meta:desc -->
<meta name="description" content="小兔鲜儿官网，致力于打造全球最大的食品、生鲜电商购物平台。">
<!-- meta:kw -->
<meta name="keywords" content="小兔鲜儿,食品,生鲜,服装,家电,电商,购物">
<title>小兔鲜儿-新鲜、惠民、快捷！</title>
```

# 110.Favicon图标

![1680342897355](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/基础班课程资料/笔记/day09/assets/1680342897355.png)

Favicon 图标：网页图标，出现在浏览器标题栏，增加网站辨识度。

> fav：favor（喜欢），在这里翻译为网页的图标

图标：**favicon.ico**，一般存放到网站的**根目录**里面

> 1.跟设计师沟通，要一张ico后缀的图标，直接起名就叫favicon.ico

![1680342907910](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/基础班课程资料/笔记/day09/assets/1680342907910.png)

![image-20240102165242988](.\assets\image-20240102165242988.png)

```html
<!-- link:favicon -->
<link rel="shortcut icon" href="favicon.ico" type="image/x-icon">
```

版心

> common.css

```css
/* 版心 */
.wrapper {
  margin: 0 auto;
  width: 1240px;
}
```

# 111.快捷导航-布局

![1680343012434](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/基础班课程资料/笔记/day09/assets/1680343012434.png)

结构：通栏 > 版心 > 导航 ul

布局：flex-end

HTML结构

```html
<!-- 快捷导航 -->
<div class="shortcut">
  <div class="wrapper">1</div>
</div>
```

CSS样式

```css
/* 快捷导航 */
.shortcut {
  height: 52px;
  background-color: #333;
}

.shortcut .wrapper {
  display: flex;
  justify-content: flex-end;
  height: 52px;
  background-color: pink;
}
```

## 快捷导航-内容

HTML结构

```html
<ul>
  <li><a href="#" class="login">请先登录</a></li>
  <li><a href="#">免费注册</a></li>
  <li><a href="#">我的订单</a></li>
  <li><a href="#">会员中心</a></li>
  <li><a href="#">帮助中心</a></li>
  <li><a href="#">在线客服</a></li>
  <li><a href="#"><span class="iconfont icon-mobile-phone"></span>手机版</a></li>
</ul>
```

CSS样式

```css
.shortcut ul {
  display: flex;
  line-height: 52px;
}

.shortcut li a {
  padding: 0 15px;
  border-right: 1px solid #999;
  font-size: 14px;
  color: #fff;
}

.shortcut li:last-child a {
  /* 取值为0或者none都行 */
  border-right: 0;
}

.shortcut li .iconfont {
  margin-right: 4px;
  vertical-align: middle;
}

.shortcut li .login {
  color: #5EB69C;
}
```

# 112.头部-布局

![1680343169749](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/基础班课程资料/笔记/day09/assets/1680343169749.png)

HTML结构

```html
<!-- 头部 -->
<div class="header wrapper">
  <!-- logo -->
  <div class="logo">logo</div>
  <!-- 导航 -->
  <div class="nav">导航</div>
  <!-- 搜索 -->
  <div class="search">搜索</div>
  <!-- 购物车 -->
  <div class="cart">购物车</div>
</div>
```

CSS样式

```css
/* 头部 */
.header {
  display: flex;
  margin-top: 22px;
  margin-bottom: 22px;
  height: 88px;
  background-color: pink;
}
```

# 113.头部-logo

HTML结构

```html
<!-- logo -->
<div class="logo">
  <h1><a href="#">小兔鲜儿</a></h1>
</div>
```

CSS样式

```css
/* logo */
.logo {
  margin-right: 40px;
  width: 200px;
  height: 88px;
  /* background-color: skyblue; */
}

.logo a {
  display: block;
  width: 200px;
  height: 88px;
  background-image: url(../images/logo.png);
  font-size: 0;
}
```

# 114.头部-导航

HTML结构

```html
<ul>
  <li><a href="#">首页</a></li>
  <li><a href="#">生鲜</a></li>
  <li><a href="#">美食</a></li>
  <li><a href="#">餐厨</a></li>
  <li><a href="#">电器</a></li>
  <li><a href="#">居家</a></li>
  <li><a href="#">洗护</a></li>
  <li><a href="#">孕婴</a></li>
  <li><a href="#">服装</a></li>
</ul>
```

CSS样式

```css
/* 导航 */
.nav {
  margin-top: 33px;
  margin-right: 28px;
}

.nav ul {
  display: flex;
}

.nav li {
  margin-right: 47px;
}

.nav li a {
  padding-bottom: 10px;
  /* background-color: skyblue; */
}

.nav li a:hover {
  border-bottom: 2px solid #5EB69C;
  color: #5EB69C;
}
```

# 115.头部-搜索

HTML结构

```html
<!-- 搜索 -->
<div class="search">
  <span class="iconfont icon-search"></span>
  <input type="text" placeholder="搜一搜">
</div>
```

CSS样式

```scss
/* 搜索 */
.search {
  display: flex;
  margin-top: 33px;
  margin-right: 45px;
  width: 170px;
  height: 34px;
  border-bottom: 2px solid #F4F4F4;
}

.search .iconfont {
  margin-right: 8px;
  font-size: 18px;
  color: #ccc;
}

.search input {
  /* 浏览器优先生效 input 标签的默认宽度，所以 flex：1 不生效 */
  /* 解决办法：重置 input 默认宽度 → width：0 */
  flex: 1;
  width: 0;
}

.search input::placeholder {
  font-size: 16px;
  color: #ccc;
}
```

# 116.头部-购物车

**HTML结构**

```html
<!-- 购物车 -->
<div class="cart">
  <span class="iconfont icon-cart-full"></span>
  <i>2</i>
</div>
```

**CSS样式**

按住键盘的方向键，差不多就停，先用1px做个测试

<img src=".\assets\image-20240103084659312.png" alt="image-20240103084659312" style="zoom:50%;" />

```CSS
/* 购物车 */
.cart {
  position: relative;
  margin-top: 32px;
}

.cart .iconfont {
  font-size: 24px;
}

.cart i {
  position: absolute;
  top: 1px;
  /* right 定位右对齐：如果文字多了，向左撑开，可能盖住其他的内容 */
  /* right: 1px; */
  /* left 定位左对齐：文字多了，向右撑开 */
  left: 15px;
  padding: 0 6px;
  height: 15px;
  background-color: #E26237;
  border-radius: 8px;
  font-size: 14px;
  color: #FFFEFE;
  line-height: 15px;
}
```

# 117.底部-布局

![1680343743595](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/基础班课程资料/笔记/day09/assets/1680343743595.png)

HTML结构

```html
<!-- 底部 -->
<div class="footer">
  <div class="wrapper">
    <!-- 服务 -->
    <div class="service">服务</div>
    <!-- 帮助中心 -->
    <div class="help">帮助中心</div>
    <!-- 版权 -->
    <div class="copyright">版权</div>
  </div>
</div>
```

CSS样式

> 帮助中心需要从服务的下边框线量到版权的位置，这样做是因为帮助中心的东西可能再添，给它最大的高度范围
>
> <img src=".\assets\image-20240103090350463.png" alt="image-20240103090350463" style="zoom:50%;" />
>
> 底部就不需要指定高了，因为剩下的都给底部就行了

```css
/* 底部 */
.footer {
  height: 580px;
  background-color: #F5F5F5;
}

/* 服务 */
.service {
  padding: 60px 0;
  height: 178px;
  border-bottom: 1px solid #E8E8E8;
}

/* 帮助中心 */
.help {
  display: flex;
  justify-content: space-between;
  padding-top: 60px;
  height: 300px;
  background-color: pink;
}
```

# 118.底部-服务区域

**HTML结构**

```html
<ul>
  <li>
    <h5></h5>
    <p>价格亲民</p>
  </li>
  <li>
    <h5></h5>
    <p>物流快捷</p>
  </li>
  <li>
    <h5></h5>
    <p>品质新鲜</p>
  </li>
  <li>
    <h5></h5>
    <p>售后无忧</p>
  </li>
</ul>
```

**CSS结构**

```css
.service ul {
  display: flex;
  justify-content: space-evenly;
}

.service li {
  display: flex;
  width: 190px;
  height: 58px;
  /* background-color: pink; */
}

.service li h5 {
  margin-right: 20px;
  width: 58px;
  height: 58px;
  background-image: url(../images/sprite.png);
}

.service li p {
  font-size: 28px;
  line-height: 58px;
}

.service li:nth-child(2) h5 {
  background-position: 0 -58px;
}
.service li:nth-child(3) h5 {
  background-position: 0 -116px;
}
.service li:nth-child(4) h5 {
  background-position: 0 -174px;
}
```

# 119.底部-帮助中心-左侧

**HTML结构**

```html
<div class="left">
  <dl>
    <dt>购物指南</dt>
    <dd><a href="#">购物流程</a></dd>
    <dd><a href="#">支付方式</a></dd>
    <dd><a href="#">售后规则</a></dd>
  </dl>
  <dl>
    <dt>配送方式</dt>
    <dd><a href="#">配送运费</a></dd>
    <dd><a href="#">配送范围</a></dd>
    <dd><a href="#">配送时间</a></dd>
  </dl>
  <dl>
    <dt>关于我们</dt>
    <dd><a href="#">平台规则</a></dd>
    <dd><a href="#">联系我们</a></dd>
    <dd><a href="#">问题反馈</a></dd>
  </dl>
  <dl>
    <dt>售后服务</dt>
    <dd><a href="#">售后政策</a></dd>
    <dd><a href="#">退款说明</a></dd>
    <dd><a href="#">取消订单</a></dd>
  </dl>
  <dl>
    <dt>服务热线</dt>
    <dd><a href="#">在线客服<span class="iconfont icon-customer-service"></span></a></dd>
    <dd><a href="#">客服电话 400-0000-000</a></dd>
    <dd><a href="#">工作时间 周一至周日 8:00-18:00</a></dd>
  </dl>
</div>
```

**CSS样式**

```css
/* left */
.help .left {
  display: flex;
}

.help .left dl {
  margin-right: 84px;
}

/* 考虑dl可能会多一个少一个，去掉最后一个的左间距 */
.help .left dl:last-child {
  margin-right: 0;
}

.help .left dt {
  margin-bottom: 30px;
  font-size: 18px;
}

.help .left dd {
  margin-bottom: 10px;
}

.help .left a {
  color: #969696;
}

.help .left .iconfont {
  color: #5EB69C;
}
```

## 底部-帮助中心-右侧

**HTML结构**

```html
<div class="right">
  <ul>
    <li>
      <div class="pic"><img src="./images/wechat.png" alt=""></div>
      <p>微信公众号</p>
    </li>
    <li>
      <div class="pic"><img src="./images/app.png" alt=""></div>
      <p>APP下载二维码</p>
    </li>
  </ul>
</div>
```

**CSS样式**

```css
/* right */
.help .right ul {
  display: flex;
}

.help .right li:first-child {
  margin-right: 55px;
}

.help .right .pic {
  margin-bottom: 10px;
  width: 120px;
  height: 120px;
}

.help .right p {
  color: #969696;
  text-align: center;
}
```

# 120.底部-版权

> 底部，是网页的最后一个区域不需要再做搜索引擎优化了

**HTML结构**

```html
<p>
  <!-- 这里为了方便，直接在a后面加| -->
  <a href="#">关于我们</a>|
  <a href="#">帮助中心</a>|
  <a href="#">售后服务</a>|
  <a href="#">配送与验收</a>|
  <a href="#">商务合作</a>|
  <a href="#">搜索推荐</a>|
  <a href="#">友情链接</a>
</p>
<p>CopyRight © 小兔鲜</p>
```

**CSS样式**

```css
/* 版权 */
.copyright {
  text-align: center;
}

.copyright p {
  margin-bottom: 10px;
  color: #A1A1A1;
}

.copyright p a {
  margin: 0 10px;
  color: #A1A1A1;
}
```

day10-小兔鲜儿

# 121.banner-轮播图

![1680344354682](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/基础班课程资料/笔记/day10/assets/1680344354682.png)

> index.css

**HTML结构**

```html
<!-- banner -->
  <div class="banner">
    <div class="wrapper">
      <!-- 图片 -->
      <ul class="pic">
        <li><a href="#"><img src="./uploads/banner1.png" alt=""></a></li>
        <li><a href="#"><img src="./uploads/banner1.png" alt=""></a></li>
        <li><a href="#"><img src="./uploads/banner1.png" alt=""></a></li>
      </ul>
    </div>
</div>
```

**  **

![image-20240103105905680](.\assets\image-20240103105905680.png)

```css
/* banner */
.banner {
  height: 500px;
  background-color: #F5F5F5;
}

.banner .wrapper {
  position: relative;
  height: 500px;
  background-color: pink;
  overflow: hidden;
}

/* 图片 */
.banner .pic {
  display: flex;
  /* flex 布局，父级宽度不够，子级被挤小，不想挤小，增大父级尺寸，注意是给ul加而不是版心加 */
  width: 3720px;
}
```

## banner-侧导航

**HTML结构**

```html
<!-- 侧导航 ul -->
<div class="subnav">
  <ul>
    <li>
      <div><a href="#" class="classify">生鲜</a><a href="#">水果</a><a href="#">蔬菜</a></div>
      <span class="iconfont icon-arrow-right-bold"></span>
    </li>
    <li>
      <div><a href="#" class="classify">美食</a><a href="#">面点</a><a href="#">干果</a></div>
      <span class="iconfont icon-arrow-right-bold"></span>
    </li>
    <li>
      <div><a href="#" class="classify">餐厨</a><a href="#">数码产品</a></div>
      <span class="iconfont icon-arrow-right-bold"></span>
    </li>
    <li>
      <div><a href="#" class="classify">电器</a><a href="#">床品</a><a href="#">四件套</a><a href="#">被枕</a></div>
      <span class="iconfont icon-arrow-right-bold"></span>
    </li>
    <li>
      <div><a href="#" class="classify">居家</a><a href="#">奶粉</a><a href="#">玩具</a><a href="#">辅食</a></div>
      <span class="iconfont icon-arrow-right-bold"></span>
    </li>
    <li>
      <div><a href="#" class="classify">洗护</a><a href="#">洗发</a><a href="#">洗护</a><a href="#">美妆</a></div>
      <span class="iconfont icon-arrow-right-bold"></span>
    </li>
    <li>
      <div><a href="#" class="classify">孕婴</a><a href="#">奶粉</a><a href="#">玩具</a></div>
      <span class="iconfont icon-arrow-right-bold"></span>
    </li>
    <li>
      <div><a href="#" class="classify">服饰</a><a href="#">女装</a><a href="#">男装</a></div>
      <span class="iconfont icon-arrow-right-bold"></span>
    </li>
    <li>
      <div><a href="#" class="classify">杂货</a><a href="#">户外</a><a href="#">图书</a></div>
      <span class="iconfont icon-arrow-right-bold"></span>
    </li>
    <li>
      <div><a href="#" class="classify">品牌</a><a href="#">品牌制造</a></div>
      <span class="iconfont icon-arrow-right-bold"></span>
    </li>
    
  </ul>
</div>
```

**CSS样式**

> 先认为所有的a都是小字，分类再单独起类名控制即可

```css
/* 侧导航 */
.subnav {
  position: absolute;
  left: 0;
  top: 0;
  width: 250px;
  height: 500px;
  background-color: rgba(0,0,0,0.42);
}

.subnav li {
  display: flex;
  justify-content: space-between;
  padding-left: 30px;
  padding-right: 12px;
  height: 50px;
  /* background-color: pink; */
  line-height: 50px;
  color: #fff;

  cursor: pointer;
}

/* a所有都是小字，分类是大字 */
.subnav li a {
  margin-right: 5px;
  font-size: 14px;
  color: #fff;
}

.subnav li .classify {
  margin-right: 14px;
  font-size: 16px;
}

.subnav li .iconfont {
  font-size: 14px;
}

.subnav li:hover {
  background-color: #00BE9A;
}
```

## banner-圆点指示器

**HTML结构**

```html
<!-- 圆点指示器 -->
<ol>
  <li class="current"><i></i></li>
  <li><i></i></li>
  <li><i></i></li>
</ol>
```

**CSS样式**

```css
/* 圆点指示器 */
.banner ol {
  position: absolute;
  bottom: 17px;
  right: 16px;
  display: flex;
}

.banner ol li {
  /* 这里最好给左边距，因为左边很大 */
  margin-left: 8px;
  width: 22px;
  height: 22px;
  /* background-color: pink; */
  border-radius: 50%;
  cursor: pointer;
}

.banner ol i {
  display: block;
  margin: 4px;
  width: 14px;
  height: 14px;
  background-color: rgba(255,255,255,0.5);
  border-radius: 50%;
}

/* 选中：li半透明； i白色 */
.banner ol .current {
  background-color: rgba(255,255,255,0.5);
}

.banner ol .current i {
  background-color: #fff;
}
```

# 122.新鲜好物-标题

![1680344375183](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/基础班课程资料/笔记/day10/assets/1680344375183.png)

> 考虑公共样式

**HTML结构**

```html
<!-- 新鲜好物 -->
<div class="goods wrapper">
  <!-- 标题 -->
  <div class="title">
    <div class="left">
      <h3>新鲜好物</h3>
      <p>新鲜出炉 品质靠谱</p>
    </div>
    <!-- 右边需要把目光放长远，也写个div，因为后面right也有很多部分 -->
    <div class="right">
      <!-- 这个a最好加个类名，因为right里可能会有其他的a -->
      <a href="#" class="more">查看全部<span class="iconfont icon-arrow-right-bold"></span></a>
    </div>
  </div>
</div>
```

**CSS样式**

> 先固定字的大小再调整文字的位置更准确

```css
/* 新鲜好物 */
/* 标题 -- 公共样式 */
.title {
  display: flex;
  justify-content: space-between;
  margin-top: 40px;
  margin-bottom: 30px;
  height: 42px;
  /* background-color: pink; */
}

.title .left {
  display: flex;
}

.title .left h3 {
  margin-right: 35px;
  font-size: 30px;
}

.title .left p {
  align-self: flex-end;
  color: #A1A1A1;
}

.title .right .more {
  line-height: 42px;
  color: #A1A1A1;
}

.title .right .more .iconfont {
  margin-left: 10px;
}
```

## 新鲜好物-内容

**HTML结构**

```html
<!-- 内容 -->
<div class="bd">
  <ul>
    <li>
      <a href="#">
        <div class="pic"><img src="./uploads/goods1.png" alt=""></div>
        <div class="txt">
          <h4>KN95级莫兰迪色防护口罩</h4>
          <!--  建议把79加标签，因为这个79是跟着产品变化的  -->
          <p>¥<span>79</span></p>
        </div>
      </a>
    </li>
    <li>
      <a href="#">
        <div class="pic"><img src="./uploads/goods2.png" alt=""></div>
        <div class="txt">
          <h4>紫檀外独板三层普洱茶盒</h4>
          <p>¥<span>566</span></p>
        </div>
      </a>
    </li>
    <li>
      <a href="#">
        <div class="pic"><img src="./uploads/goods3.png" alt=""></div>
        <div class="txt">
          <h4>法拉蒙高颜值记事本可定制</h4>
          <p>¥<span>58</span></p>
        </div>
      </a>
    </li>
    <li>
      <a href="#">
        <div class="pic"><img src="./uploads/goods4.png" alt=""></div>
        <div class="txt">
          <h4>科技布布艺沙发</h4>
          <p>¥<span>3579</span></p>
        </div>
      </a>
    </li> 
  </ul>
</div>
```

**CSS样式**

```css
/* 好物内容 -- 公共样式 */
.bd ul {
  display: flex;
  justify-content: space-between;
}

.bd li {
  width: 304px;
  height: 404px;
  background-color: #EEF9F4;
}

.bd li .pic {
  width: 304px;
  height: 304px;
}

.bd li .txt {
  text-align: center;
}

.bd li h4 {
  margin-top: 18px;
  margin-bottom: 8px;
  font-size: 20px;
}

/* 独属于好物推荐的要加goods */
.goods .bd p {
  font-size: 18px;
  color: #AA2113;
}

.goods .bd p span {
  margin-left: 3px;
  font-size: 22px;
}
```

# 123.人气推荐

![1680345456528](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/基础班课程资料/笔记/day10/assets/1680345456528.png)

**HTML结构**

```html
<!-- 人气推荐 -->
<div class="recommend wrapper">
  <!-- 标题 -->
  <div class="title">
    <div class="left">
      <h3>人气推荐</h3>
      <p>人气爆款 不容错过</p>
    </div>
  </div>
  <!-- 内容 -->
  <div class="bd">
    <ul>
      <li>
        <a href="#">
          <div class="pic"><img src="./uploads/recommend1.png" alt=""></div>
          <div class="txt">
            <h4>特惠推荐</h4>
            <p>我猜得到 你的需要</p>
          </div>
        </a>
      </li>
      <li>
        <a href="#">
          <div class="pic"><img src="./uploads/recommend2.png" alt=""></div>
          <div class="txt">
            <h4>爆款推荐</h4>
            <p>人气好物推荐</p>
          </div>
        </a>
      </li>
      <li>
        <a href="#">
          <div class="pic"><img src="./uploads/recommend3.png" alt=""></div>
          <div class="txt">
            <h4>节日礼品一站买全</h4>
            <p>编辑尽心整理推荐</p>
          </div>
        </a>
      </li>
      <li>
        <a href="#">
          <div class="pic"><img src="./uploads/recommend4.png" alt=""></div>
          <div class="txt">
            <h4>鲜花园艺</h4>
            <p>给生活增加仪式感</p>
          </div>
        </a>
      </li>
      
    </ul>
  </div>
</div>
```

**CSS样式**

```css
/* 人气推荐 */
.recommend .bd li {
  background-color: #fff;
}

.recommend .bd p {
  color: #A1A1A1;
}
```

# 124.热门品牌-布局

![1680345437806](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/基础班课程资料/笔记/day10/assets/1680345437806.png)

**HTML结构**

```html
<!-- 热门品牌 -->
<div class="brand">
  <div class="wrapper">
    <!-- 标题 -->
    <div class="title">
      <div class="left">
        <h3>热门品牌</h3>
        <p>国际经典 品质认证</p>
      </div>

      <div class="button">1</div>
    </div>
  </div>
</div>
```

**CSS样式**

```css
/* 热门品牌 */
.brand {
  margin-top: 60px;
  height: 468px;
  background-color: #F5F5F5;
}

.brand .wrapper {
  /* 解决外边距塌陷 */
  overflow: hidden;
  height: 468px;
  /* background-color: pink; */
}

.brand .title {
  position: relative;
  margin-bottom: 40px;
}

.brand .button {
  position: absolute;
  right: 0;
  /* 往区域外面挪，需要加上自己的高度 */
  bottom: -25px;

  /* 让a在一行显示，宽高生效，子级就变弹性盒子了，或者给a转显示模式 */
  display: flex;
}
```

## 热门品牌-内容

HTML结构

```html
<div class="button">
  <a href="#" class="prev">
    <i class="iconfont icon-arrow-left-bold"></i>
  </a>
  <a href="#" class="next">
    <i class="iconfont icon-arrow-right-bold"></i>
  </a>
</div>




<!-- 内容 -->
<div class="bd">
  <ul>
    <li><a href="#"><img src="./uploads/hot1.png" alt=""></a></li>
    <li><a href="#"><img src="./uploads/hot2.png" alt=""></a></li>
    <li><a href="#"><img src="./uploads/hot3.png" alt=""></a></li>
    <li><a href="#"><img src="./uploads/hot4.png" alt=""></a></li>
    <li><a href="#"><img src="./uploads/hot5.png" alt=""></a></li>
  </ul>
</div>
```

CSS样式

```css
.brand .button a {
  margin-left: 12px;
  width: 20px;
  height: 20px;
  text-align: center;
  line-height: 20px;
  color: #fff;
}

.brand .button .prev {
  background-color: #ddd;
}

.brand .button .next {
  background-color: #00BE9A;
}

.brand .bd li {
  width: 244px;
  height: 306px;
}
```

# 125.生鲜-标题

![1680345419866](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/基础班课程资料/笔记/day10/assets/1680345419866.png)

**HTML结构**

```html
<!-- 生鲜 -->
<div class="fresh wrapper">
  <!-- 标题 -->
  <div class="title">
    <div class="left">
      <h3>生鲜</h3>
    </div>
    <div class="right">
      <ul>
        <li><a href="#" class="active">热门</a></li>
        <li><a href="#">蔬菜</a></li>
        <li><a href="#">肉禽蛋</a></li>
        <li><a href="#">水果</a></li>
        <li><a href="#">海鲜</a></li>
        <li><a href="#">零食</a></li>
        <li><a href="#">饮料</a></li>
      </ul>
      <a href="#" class="more">查看全部<span class="iconfont icon-arrow-right-bold"></span></a>
    </div>
  </div>
</div>
```

**CSS样式**

```css
/* 生鲜 */
.fresh .title {
  margin-top: 60px;
  margin-bottom: 20px;
}

/* 这里不需要加分类，因为这样以后title的flex布局都会生效 */
.title .right {
  display: flex;
}

.title .right ul {
  display: flex;
  margin-top: 10px;
  margin-right: 58px;
}

.title .right ul a {
  display: block;
  margin-left: 6px;
  padding: 0 7px;
  height: 20px;
  /* background-color: pink; */
  line-height: 20px;
}

.title .right ul .active {
  background-color: #00BE9A;
  color: #fff;
}
```

# 126.生鲜-内容布局

**HTML结构**

```html
<!-- 内容 -->
<div class="content">
  <div class="left">
    <a href="#"><img src="./uploads/fresh_left.png" alt=""></a>
  </div>
  <div class="right">
    <ul>
      <li>1</li>
      <li>2</li>
      <li>3</li>
      <li>4</li>
      <li>5</li>
      <li>6</li>
      <li>7</li>
      <li>8</li>
    </ul>
  </div>
</div>
```

**CSS样式**

```css
/* 生鲜内容 */
/* 注意这里写的也是公共样式 */
.content {
  display: flex;
  justify-content: space-between;
}

.content .left {
  width: 248px;
  height: 610px;
  /* background-color: pink; */
}

.content .right {
  width: 968px;
  height: 610px;
  /* background-color: pink; */
}

.content .right ul {
  display: flex;
  flex-wrap: wrap;
}

.content .right li {
  position: relative;
  padding: 10px 21px 0;
  width: 242px;
  height: 305px;
  border: 2px solid #fff;

  /* 为了隐藏绿色cover */
  overflow: hidden;
}
```

# 127.生鲜-产品内容

**HTML结构**

```html
<ul>
  <li>
    <a href="#">
      <div class="pic"><img src="./uploads/fresh1.png" alt=""></div>
      <div class="txt">
        <!-- 由于要保证内容高度不随内容改变而改变， -->
        <div class="info">
          <h4>双味千层，手抓饼烤肉组合</h4>
          <p>240g/袋 4片装</p>
          <p>加热即食</p>
        </div>
        <p class="price">¥<span>89.99</span></p>
      </div>
    </a>
  </li>
  <li>
    <a href="#">
      <div class="pic"><img src="./uploads/fresh2.png" alt=""></div>
      <div class="txt">
        <div class="info">
          <h4>云南甘蔗慢熬红糖馒头</h4>
          <p>220g/袋 5个装</p>
          <p>加热即食</p>
        </div>
        <p class="price">¥<span>9.00</span></p>
      </div>
    </a>
  </li>
  <li>
    <a href="#">
      <div class="pic"><img src="./uploads/fresh3.png" alt=""></div>
      <div class="txt">
        <div class="info">
          <h4>日式风味小圆饼</h4>
          <p>圆形【海盐味】</p>
          <p>糖果零食</p>
        </div>
        <p class="price">¥<span>588.00</span></p>
      </div>
    </a>
  </li>
  <li>
    <a href="#">
      <div class="pic"><img src="./uploads/fresh4.png" alt=""></div>
      <div class="txt">
        <div class="info">
          <h4>全麦奶油浓香小面包</h4>
          <p>50g*12袋</p>
          <p>美味西点</p>
        </div>
        <p class="price">¥<span>69.00</span></p>
      </div>
    </a>
  </li>
  <li>
    <a href="#">
      <div class="pic"><img src="./uploads/fresh5.png" alt=""></div>
      <div class="txt">
        <div class="info">
          <h4>秘制外皮五福摩提大福点心</h4>
          <p>150g/盒</p>
          <p>美味西点</p>
        </div>
        <p class="price">¥<span>39.99</span></p>
      </div>
    </a>
  </li>
  <li>
    <a href="#">
      <div class="pic"><img src="./uploads/fresh6.png" alt=""></div>
      <div class="txt">
        <div class="info">
          <h4>水果面膜韩国蜂蜜柚子茶</h4>
          <p>560g/瓶</p>
          <p>冲调饮品</p>
        </div>
        <p class="price">¥<span>39.99</span></p>
      </div>
    </a>
  </li>
  <li>
    <a href="#">
      <div class="pic"><img src="./uploads/fresh7.png" alt=""></div>
      <div class="txt">
        <div class="info">
          <h4>浓情比利时巧克力礼盒装</h4>
          <p>205克/盒</p>
          <p>糖果零食</p>
        </div>
        <p class="price">¥<span>120.00</span></p>
      </div>
    </a>
  </li>
  <li>
    <a href="#">
      <div class="pic"><img src="./uploads/fresh8.png" alt=""></div>
      <div class="txt">
        <div class="info">
          <h4>抹茶奶油小蛋糕礼盒装</h4>
          <p>220克/盒</p>
          <p>美味西点</p>
        </div>
        <p class="price">¥<span>60.00</span></p>
      </div>
    </a>
  </li>
</ul>
```

**CSS样式**

```css
/* 产品内容 */
.content .pic {
  width: 200px;
  height: 180px;
}

.content .info {
  margin-top: 14px;
  margin-bottom: 5px;
  height: 60px;
  line-height: 19px;
}

.content .price {
  color: #AF2F22;
}

.content .price span {
  margin-left: 5px;
  font-size: 22px;
}
```

# 128.生鲜-过渡效果

**HTML结构**

```html
<div class="cover">
  <p>找相似</p>
  <p></p>
  <p>发现更多宝贝<span class="iconfont icon-arrow-right-bold"></span></p>
</div>
```

**CSS样式**

```css
/* 产品底部绿色区域 */
.content li .cover {
  position: absolute;
  left: 0;
  /* bottom: 0; */
  bottom: -86px;
  padding-top: 15px;
  width: 242px;
  height: 84px;
  background-color: #00BE9A;
  text-align: center;
  color: #fff;
  transition: all 0.5s;
}

.content .cover p:nth-child(1) {
  font-size: 18px;
}

.content .cover p:nth-child(2) {
  margin: 3px auto 6px;
  width: 120px;
  height: 1px;
  background-color: rgba(255,255,255,0.11);
}

.content .cover p:nth-child(3) {
  font-size: 13px;
} 

.content .cover p:nth-child(3) .iconfont {
  font-size: 14px;
}

/* 鼠标悬停到li，显示cover，改变位置 */
.content .right li:hover .cover {
  bottom: 0;
}

.content .right li:hover {
  border: 2px solid #00BE9A;
}
```

# 129.最新专题-布局

![1680345389305](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/基础班课程资料/笔记/day10/assets/1680345389305.png)

**HTML结构**

```html
<!-- 最新专题 -->
<div class="topic wrapper">
  <div class="title">
    <div class="left">
      <h3>最新专题</h3>
    </div>
    <div class="right">
      <a href="#" class="more">查看全部<span class="iconfont icon-arrow-right-bold"></span></a>
    </div>
  </div>
  <div class="topic-bd">
    <ul>
      <li>1</li>
      <li>2</li>
      <li>3</li>
    </ul>
  </div>
</div>
```

**CSS样式**

```css
/* 最新专题 */
.topic {
  margin-bottom: 40px;
}

.topic .title {
  margin-top: 100px;
}

.topic-bd ul {
  display: flex;
  justify-content: space-between;
}

.topic-bd li {
  width: 405px;
  height: 355px;
  background-color: pink;
}
```

# 130.最新专题-内容

**HTML结构**

```html
<ul>
  <li>
    <a href="#">
      <div class="pic">
        <img src="./uploads/topic1.png" alt="">
      </div>
      <div class="txt">
        <div class="left">
          <p>
            <i class="iconfont icon-favorites-fill"></i>
            <span>1220</span>
          </p>
          <p>
            <i class="iconfont icon-browse"></i>
            <span>1800</span>
          </p>
        </div>
        <div class="right">
          <p>
            <i class="iconfont icon-comment"></i>
            <span>246</span>
          </p>
        </div>
      </div>
    </a>
  </li>
  <li>
    <a href="#">
      <div class="pic">
        <img src="./uploads/topic2.png" alt="">
      </div>
      <div class="txt">
        <div class="left">
          <p>
            <i class="iconfont icon-favorites-fill"></i>
            <span>1220</span>
          </p>
          <p>
            <i class="iconfont icon-browse"></i>
            <span>1800</span>
          </p>
        </div>
        <div class="right">
          <p>
            <i class="iconfont icon-comment"></i>
            <span>246</span>
          </p>
        </div>
      </div>
    </a>
  </li>
  <li>
    <a href="#">
      <div class="pic">
        <img src="./uploads/topic3.png" alt="">
      </div>
      <div class="txt">
        <div class="left">
          <p>
            <i class="iconfont icon-favorites-fill"></i>
            <span>1220</span>
          </p>
          <p>
            <i class="iconfont icon-browse"></i>
            <span>1800</span>
          </p>
        </div>
        <div class="right">
          <p>
            <i class="iconfont icon-comment"></i>
            <span>246</span>
          </p>
        </div>
      </div>
    </a>
  </li>
</ul>
```

**CSS样式**

```css
.topic-bd ul {
  display: flex;
  justify-content: space-between;
}

.topic-bd li {
  width: 405px;
  height: 355px;
  background-color: pink;
}

.topic-bd .pic {
  position: relative;
  width: 405px;
  height: 288px;
}

.topic-bd .txt {
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding: 0 15px;
  width: 405px;
  height: 67px;
  /* background-color: skyblue; */
  font-size: 14px;
  color: #666;
}

.topic-bd .txt .left {
  display: flex;
}

.topic-bd .txt .left p {
  margin-right: 20px;
}

.topic-bd .txt .left p:nth-child(1) i {
  color: #AA2113;
}
```

# 131.最新专题-定位文字

**HTML结构**

```html
<div class="pic">
  <img src="./uploads/topic2.png" alt="">
  <!-- 定位区域 -->
  <div class="cover">
    <div class="left">
      <h4>吃这些美食才不算辜负自己</h4>
      <p>餐厨起居洗护好物</p>
    </div>
    <div class="right">￥<span>29.9</span><span>起</span></div>
  </div>
</div>
```

**CSS样式**

```css
/* 定位区域 - 文字 */
.topic-bd .cover {
  position: absolute;
  left: 0;
  bottom: 0;

  display: flex;
  justify-content: space-between;
  align-items: center;

  padding: 0 15px;
  width: 405px;
  height: 90px;
  /* 渐变：让底下区域变暗一些，底下的白字也看的清楚了 */
  background-image: linear-gradient(180deg, rgba(137,137,137,0.00) 0%, rgba(0,0,0,0.90) 100%);
}

.topic-bd .cover .left {
  color: #fff;
}

.topic-bd .cover .left h4 {
  margin-bottom: 6px;
  font-size: 20px;
}

.topic-bd .cover .right {
  padding: 0 7px;
  height: 25px;
  background-color: #fff;
  color: #AA2113;
  font-size: 15px;
}

.topic-bd .cover .right span {
  font-size: 18px;
}
```

移动 Web 第一天

> 目标：使用位移、缩放、旋转、渐变效果丰富网页元素的呈现方式。

# 133.平面转换

**简介**

作用：为元素添加动态效果，一般与过渡配合使用

概念：改变盒子在平面内的形态（位移、旋转、缩放、倾斜）

![1681357773327](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/移动Web/移动Web-Day11资料/笔记/assets/1681357773327.png)

平面转换也叫 2D 转换，属性是 **transform**

# 134.平移

emment写法：tf

```css
transform: translate(X轴移动距离, Y轴移动距离);
```

* 取值
  * 像素单位数值
  * 百分比（参照**盒子自身尺寸**计算结果）
  * **正负**均可
* 技巧
  * translate() **只写一个值**，表示沿着 **X** 轴移动
  * 单独设置 X 或 Y 轴移动距离：translateX() 或 translateY()

# 135.定位居中

* 方法一：margin

![1681358064880](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/移动Web/移动Web-Day11资料/笔记/assets/1681358064880.png)

* 方法二：平移 → 百分比参照盒子自身尺寸计算结果 

![1681358076134](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/移动Web/移动Web-Day11资料/笔记/assets/1681358076134.png)

# 136.案例-双开门

![1681358110583](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/移动Web/移动Web-Day11资料/笔记/assets/1681358110583.png)

* HTML 结构

```html
<div class="father">
    <div class="left"></div>
    <div class="right"></div>
</div>
```

* CSS 样式

  > 设计为兄弟关系也可以，定位定上来就行了

```css
* {
    margin: 0;
    padding: 0;
}

/* 1. 布局：父子结构，父级是大图，子级是左右小图 */
.father {
    display: flex;
    margin: 0 auto;
    width: 1366px;
    height: 600px;
    background-image: url(./images/bg.jpg);

    overflow: hidden;
}

.father .left,
.father .right {
    width: 50%;
    height: 600px;
    background-image: url(./images/fm.jpg);

    transition: all .5s;
}

.father .right {
    /* right 表示的取到精灵图右面的图片，不需要再测量位置了 */
    background-position: right 0;
}

/* 2. 鼠标悬停的效果：左右移动 */
.father:hover .left {
    transform: translate(-100%);
}

.father:hover .right {
    transform: translateX(100%);
}
```

# 137.旋转

```css
transform: rotate(旋转角度);
```

* 取值：角度单位是 **deg** 
* 技巧
  * 取值正负均可
  * 取值为正，顺时针旋转
  * 取值为负，逆时针旋转

# 138.转换原点

> 默认情况下，转换原点是盒子中心点 

```css
transform-origin: 水平原点位置 垂直原点位置;
```

取值：

* **方位名词**（left、top、right、bottom、center）（常用）
* 像素单位数值
* 百分比

### 案例-时钟

![1681358351628](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/移动Web/移动Web-Day11资料/笔记/assets/1681358351628.png)

```css
.hour {
  width: 6px;
  height: 50px;
  background-color: #333;
  margin-left: -3px;
  transform: rotate(15deg);
  /* 水平中间，垂直底部 */
  transform-origin: center bottom;
}

.minute {
  width: 5px;
  height: 65px;
  background-color: #333;
  margin-left: -3px;
  transform: rotate(90deg);
  transform-origin: center bottom;
}

.second {
  width: 4px;
  height: 80px;
  background-color: red;
  margin-left: -2px;
  transform: rotate(240deg);
  transform-origin: center bottom;
}
```

# 139.多重转换

多重转换技巧：先平移再旋转

> 这里把transform当成复合属性来使用了，中间用空格隔开

```css
transform: translate() rotate();
```

* 多重转换原理：以第一种转换方式坐标轴为准转换形态
  * 旋转会改变网页元素的坐标轴向
  * 先写旋转，则后面的转换效果的轴向以旋转后的轴向为准，会影响转换结果
  
* 想要多重效果，就只能使用transform复合属性，因为拆开写，相同的属性是有层叠性的，就会导致只有旋转生效。

  ~~~css
  .box:hover img {
      transform: translateX(600px);
      transform: rotate(360deg);
  }
  ~~~

# 140.缩放

> 如果使用宽高进行缩放，就会造成从左上角使图片变大
>
> scale是沿着中心点向四周缩放

```css
transform: scale(缩放倍数);
transform: scale(X轴缩放倍数, Y轴缩放倍数);
```

* 技巧
  * 通常，只为 scale() 设置一个值，表示 X 轴和 Y 轴等比例缩放
  * 取值大于1表示放大，取值小于1表示缩小，等于1表示不变

# 141.案例-播放特效

![1681358481436](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/移动Web/移动Web-Day11资料/笔记/assets/1681358481436.png)

* CSS 样式

  > 这里并不需要转显示模式

```css
/* 1. 摆放播放按钮：图片区域的中间 */
.box li {
  overflow: hidden;
}

.pic {
  position: relative;
}

.pic::after {
  position: absolute;
  left: 50%;
  top: 50%;
  /* margin-left: -29px;
  margin-top: -29px; */
  /* 因为底下还有一个transform，相同的属性会层叠！就会造成translate没有效果！ 或者直接当成复合属性使用，但是此时又会出现一个问题：下面的::after又会把上面居中效果又的给覆盖掉 */
  /* transform: translate(-50%, -50%); */

  content: '';
  width: 58px;
  height: 58px;
  background-image: url(./images/play.png);
  transform: translate(-50%, -50%) scale(5);
  opacity: 0;

  transition: all .5s;
}
/* 2. hover效果：大按钮，看不见：透明是0 → 小按钮，看得见：透明度1 */
.box li:hover .pic::after {
  /* transform: scale(1); */
  transform: translate(-50%, -50%) scale(1);
  opacity: 1;
}
```

# 142.倾斜

```css
transform: skew();
```

取值：倾斜的角度度数 deg

取正：往左倾斜

取负：往右倾斜

渐变

渐变是多个颜色逐渐变化的效果，一般用于设置盒子背景，此时可以让文字更突出 

分类：

* 线性渐变

![1681358603090](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/移动Web/移动Web-Day11资料/笔记/assets/1681358603090.png)

* 径向渐变

![1681358608036](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/移动Web/移动Web-Day11资料/笔记/assets/1681358608036.png)

# 143.线性渐变

> 打个l，在VSCode就有代码提示了，小括号里是逗号隔开各个值
>
> 终点位置是可以省略的

```css
background-image: linear-gradient(
  渐变方向,
  颜色1 终点位置,
  颜色2 终点位置,
  ......
);
```

取值：

* 渐变方向：可选（不写的话默认从上到下）
  * to 方位名词
  * 角度度数
* 终点位置：可选（没有设置终点的位置，就从盒子的一半开始产生颜色变化）
  * 百分比（从百分之多少开始产生颜色的变化）

### 案例-产品展示

![1681358757636](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/移动Web/移动Web-Day11资料/笔记/assets/1681358757636.png)

* HTML 结构

```html
<div class="box">
  <img src="./images/product.jpeg" alt="" />
  <div class="title">OceanStor Pacific 海量存储斩获2021 Interop金奖</div>
  <div class="mask"></div>
</div>
```

* CSS 样式

```css
.mask {
  position: absolute;
  left: 0;
  top: 0;
  /* 跟父级宽高一样大 */
  width: 100%;
  height: 100%;
  background-image: linear-gradient(
      transparent,
      /* 渐变是透明到黑色半透明就行了 */
      rgba(0,0,0,0.5)
  );
  opacity: 0;

  transition: all .5s;
}

.box:hover .mask {
  opacity: 1;
}
```

# 144.径向渐变

>  通常加给按钮，使按钮更立体一些
>
> VSCode打个r就有代码提示

```css
background-image: radial-gradient(
  半径 at 圆心位置,
  颜色1 终点位置,
  颜色2 终点位置,
  ......
);
```

取值：

* 半径可以是2条，则为椭圆
* 圆心位置取值：像素单位数值 / 百分比 / 方位名词（习惯使用的是方位名词和像素单位数值）

~~~css
background-image: radial-gradient(
        /* 半径在水平垂直都居中的位置 */
        50px at center center,
        red,
        pink);
~~~

效果：![image-20240103203755389](.\assets\image-20240103203755389.png)

~~~css
background-image: radial-gradient(
          /* 两条半径就会产生一个椭圆形的渐变 */
          50px 20px at center center,
          red,
          pink);
~~~

效果：![image-20240103203932602](.\assets\image-20240103203932602.png)

**像素数值写法**：

~~~css
background-image: radial-gradient(50px at 50px 30px,
          red,
          pink);
~~~

效果：圆心明显网上偏![image-20240103204109750](.\assets\image-20240103204109750.png)

给按钮加高光（白色半透明到透明），使按钮显得更立体：

~~~css
background-image: radial-gradient(30px at 30px 20px,
          rgba(255, 255, 255, .2),
          transparent);
~~~

效果：![image-20240103204519753](.\assets\image-20240103204519753.png)

# 145.综合案例

![1681365549936](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/移动Web/移动Web-Day11资料/笔记/assets/1681365549936.png)

> PS：修改代码的时候千万不要直接在VSCode里面直接看代码，而是在浏览器里选中对应的代码进行修改，找到之后根据行号去修改鼠标悬停的效果即可
>
> ![image-20240103205457788](.\assets\image-20240103205457788.png)
>
> 快捷方法：ctrl + g，输入目标行号，然后回车，就跳转到了该行

**导航-频道**

### 箭头旋转

```css
.x-header-nav .nav-item:hover .icon-down {
  transform: rotate(-180deg);
}
```

**频道列表**

```css
.channel-layer {
  position: absolute;
  top: 60px;
  left: 50%;
  z-index: -2;
  width: 1080px;
  height: 120px;
  padding: 10px;
  margin-left: -540px;
  color: #72727b;
  background-color: #f5f5f5;
  border: 1px solid #e4e4e4;
  border-top: none;
  transition: all 0.5s;
  transform: translateY(-120px);
}

/* TODO 2. 弹窗频道 */
.x-header-nav .nav-item:hover .channel-layer {
  transform: translateY(0);
}
```

### 渐变按钮

**搜索按钮**

```css
.x-header-search form .btn {
  position: absolute;
  top: 0;
  right: 0;
  width: 60px;
  height: 40px;
  line-height: 40px;
  text-align: center;
  background-color: #f86442;
  border-top-right-radius: 20px;
  border-bottom-right-radius: 20px;
  background-image: linear-gradient(
    to right,
    rgba(255, 255, 255, 0.3),
    /* 可以是白色透明到透明也可以是白色透明到背景色 */
    #f86442
  );
}
```

**登录按钮**

```css
/* TODO 7. 渐变按钮 */
.card .card-info .login {
  padding: 3px 34px;
  color: #fff;
  background-color: #ff7251;
  border-radius: 30px;
  box-shadow: 0 4px 8px 0 rgb(252 88 50 / 50%);
  background-image: linear-gradient(
    to right,
    rgba(255, 255, 255, 0.2),
    #ff7251
  );
}
```

**客户端按钮**

> 给共同类加属性就行了
>
> ![image-20240103213050494](.\assets\image-20240103213050494.png)

```css
/* TODO 8. 径向渐变 */
.download .dl .dl-btn {
  width: 68px;
  height: 34px;
  line-height: 34px;
  color: #fff;
  text-align: center;
  border-radius: 4px;
  background-image: radial-gradient(
    50px at 10px 10px,
    rgba(255, 255, 255, 0.5),
    transparent
  );
}
```

### 轮播图

```css
/* TODO 4. 摆放图片 */
.banner .banner-list .banner-item.left {
  z-index: 0;
  transform: translate(-160px) scale(0.8);
  /* 由于缩放会改变图片原来的效果，可以将translate再往左边多移，也可以改变转换圆点的位置 */
  transform-origin: left center;
}

.banner .banner-list .banner-item.right {
  z-index: 0;
  transform: translate(160px) scale(0.8);
  transform-origin: right center;
}
```

### 猜你喜欢

```css
/* TODO 5. 播放按钮和遮罩 */
/* 使用伪元素添加，就省的去找html标签了 */
.album-item .album-item-box::after {
  position: absolute;
  left: 0;
  top: 0;
  content: '';
  width: 100%;
  height: 100%;
  background: rgba(0,0,0,.5) url(../assets/play.png) no-repeat center / 20px;
  opacity: 0;
  transition: all .5s;
}

/* hover代表选中的一个状态，::after依旧连着写即可 */
.album-item .album-item-box:hover::after {
  opacity: 1;
  background-size: 50px;
}


/* TODO 6. 图片缩放 */
.album-item .album-item-box:hover img {
  transform: scale(1.1);
}
```

移动 Web 第一天

## 空间转换

**空间转换简介**

* 空间：是从坐标轴角度定义的 X 、Y 和 Z 三条坐标轴构成了一个立体空间，Z 轴位置与视线方向相同。
* 空间转换也叫 3D转换
* 属性：transform

![1681723381377](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/移动Web/day02/笔记/assets/1681723381377.png)

# 147.平移

 ```css
transform: translate3d(x, y, z);
transform: translateX();
transform: translateY();
transform: translateZ();
 ```

> translate3d少一个数都会导致translate3d不生效
>
> 取值与平面转换相同（可以是像素单位数值，也可以是百分比，取正取负都行）
>
> 默认情况下，Z 轴平移没有效果，原因：电脑屏幕默认是平面，无法显示 Z 轴平移效果

### 视距

作用：指定了观察者与 Z=0 平面的距离，为元素添加透视效果

透视效果：近大远小、近实远虚

属性：(添加给**直接**父级（跨级就不好使了），取值范围 800-1200px)（这是个经验值，如果取值太大或者太小，z轴的移动的效果就会很意外，很不好看），注意加单位

```css
perspective: 视距;
```

![1681723504103](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/移动Web/day02/笔记/assets/1681723504103.png)

# 148.旋转

* Z 轴：rotateZ()，由于z轴在视线的方向，z轴的位置和盒子中心点是重叠的。所以绕z轴旋转的效果和平面旋转的效果是一样的

![1681723549616](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/移动Web/day02/笔记/assets/1681723549616.png)

* X 轴：rotateX()

  取正数：向后边倒过去

  取负数：迎面倒过来

![1681723568598](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/移动Web/day02/笔记/assets/1681723568598.png)

~~~html
<style>
    .box {
        width: 300px;
        margin: 100px auto;
    }

    img {
        width: 300px;
        transition: all 2s;
    }

    .box {
        /* 透视效果：近大远小，近实远虚 */
        perspective: 1000px;
    }

    .box img:hover {
        transform: rotateX(-360deg);
    }
</style>
~~~

* Y 轴：rotateY()

  取正：向右边转

  取负：向左边转

![1681723587974](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/移动Web/day02/笔记/assets/1681723587974.png)

### 左手法则

作用：根据旋转方向确定取值正负

使用：左手握住旋转轴, 拇指指向正值方向, 其他四个手指弯曲方向为旋转正值方向 

![1681723629410](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/移动Web/day02/笔记/assets/1681723629410.png)

### rotate3d-了解

* rotate3d(x, y, z, 角度度数) ：用来设置自定义旋转轴的位置及旋转的角度
* x，y，z 取值为0-1之间的数字

# 149.立体呈现

作用：设置元素的子元素是位于 3D 空间中还是平面中

属性名：transform-style（加给父级，emment写法：tfs，直接出现提示：transform-style: preserve-3d）

属性值：

* flat：子级处于平面中
* preserve-3d：子级处于 3D 空间



呈现立体图形步骤

1. 父元素添加transform-style: preserve-3d
2. 子级定位
3. 调整子盒子的位置（位移或旋转）

查看立方体效果：

~~~css
.cube:hover {
    transform: rotateY(90deg);
}
~~~



提示：空间内，转换元素都有自已独立的坐标轴，互不干扰



# 150.案例-3d导航

![1681723704637](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/移动Web/day02/笔记/assets/1681723704637.png)

案例步骤：

1. 搭建立方体
   1. 绿色是立方体的前面
   2. 橙色是立方体的上面
2. 鼠标悬停，立方体旋转

![1681723746854](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/移动Web/day02/笔记/assets/1681723746854.png)

![1681723827660](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/移动Web/day02/笔记/assets/1681723827660.png)

```css
.nav li {
  position: relative;
  width: 100px;
  height: 40px;
  line-height: 40px;
  transition: all 0.5s;

  transform-style: preserve-3d;

  /* 为了看到橙色和绿色的移动过程，给立方体添加旋转 */
  /* transform: rotateX(-20deg) rotateY(30deg); */
}

.nav li a {
  position: absolute;
  left: 0;
  top: 0;
  display: block;
  width: 100%;
  height: 100%;
  text-align: center;
  text-decoration: none;
  color: #fff;
}

/* 立方体每个面都有独立的坐标轴，互不影响 */
.nav li a:first-child {
  background-color: green;
  transform: translateZ(20px);
}

.nav li a:last-child {
  background-color: orange;
  /* 这里要注意，旋转会改变坐标轴向 */
  transform: rotateX(90deg) translateZ(20px);
}

.nav li:hover {
  transform: rotateX(-90deg);
}
```

# 151.缩放

```css
transform: scale3d(x, y, z);
transform: scaleX();
transform: scaleY();
transform: scaleZ();
```



# 152.动画

* 过渡：实现两个状态间的变化过程
* 动画：实现多个状态间的变化过程，动画过程可控（重复播放、最终画面、是否暂停）

# 153.动画实现步骤

1. 定义动画

> 大括号里放的是当前状态对应的css
>
> VSCode中输入@k就有代码提示

```css
/* 方式一：只有两个状态的变化 */
@keyframes 动画名称 {
  from {}
  to {}
}

/* 
	方式二：百分比表示的是动画时长的百分比
	方式二包括方式一，如果只需要两个状态，就写 0% 和 100%
*/
@keyframes 动画名称 {
  0% {}
  10% {}
  ......
  100% {}
}
```

2. 使用动画

> 哪个标签需要使用动画，就加上animation属性即可。
>
> animation是复合属性。
>
> 动画花费时长以秒为单位

```css
animation: 动画名称 动画花费时长;
```

# 154.animation复合属性

![1681723979998](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/移动Web/day02/笔记/assets/1681723979998.png)

提示：

* 动画名称和动画时长必须赋值

* 取值不分先后顺序

* 如果有两个时间值，第一个时间表示动画时长，第二个时间表示延迟时间

* **速度曲线**：linear（匀速），steps()（分步动画，小括号里填了数字几，就把这个动画分几步完成）

  steps工作中，配合精灵图实现精灵动画，而像匀速、加速减速在工作中使用的场景并不是很多

* **重复次数**：

  1. 数字：重复次数
  2. infinite：无限播放

* **动画方向**：alternate（往返）

* **执行完毕时状态**：

  1. forwards：停在结束时的状态
  2. backward（默认值）：停在开始状态

## animation拆分写法

> animation拆分写法在工作中不常用
>
> animation-name和animation-duration同样需要赋值动画才能生效

![1681724035890](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/移动Web/day02/笔记/assets/1681724035890.png)

# 155.案例-走马灯

![1681724053648](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/移动Web/day02/笔记/assets/1681724053648.png)

* HTML 结构

```html
<li><img src="./images/1.jpg" alt="" /></li>
<li><img src="./images/2.jpg" alt="" /></li>
<li><img src="./images/3.jpg" alt="" /></li>
<li><img src="./images/4.jpg" alt="" /></li>
<li><img src="./images/5.jpg" alt="" /></li>
<li><img src="./images/6.jpg" alt="" /></li>
<li><img src="./images/7.jpg" alt="" /></li>
<!-- 替身：填补显示区域的露白 -->
<li><img src="./images/1.jpg" alt="" /></li>
<li><img src="./images/2.jpg" alt="" /></li>
<li><img src="./images/3.jpg" alt="" /></li>
```

* CSS 样式

```css
.box {
  width: 600px;
  height: 112px;
  border: 5px solid #000;
  margin: 100px auto;
  overflow: hidden;
}

.box ul {
  display: flex;
  animation: move 6s infinite linear;
}

/* 定义位移动画；ul使用动画；鼠标悬停暂停动画 */
@keyframes move {
  0% {
    transform: translate(0);
  }
  100% {
    transform: translate(-1400px);
  }
}

.box:hover ul {
  animation-play-state: paused;
}
```

> 无缝动画原理：复制开头图片到结尾位置（图片累加宽度 = 区域宽度） 

# 156.精灵动画

> 精灵动画也叫逐帧动画

![image-20240104171747307](.\assets\image-20240104171747307.png)

* 核心

1. steps()逐帧动画
2. CSS精灵图

![1681724175321](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/移动Web/day02/笔记/assets/1681724175321.png)

* 制作步骤

  1.准备显示区域

  盒子尺寸与一张精灵小图尺寸相同

  2.定义动画

  移动背景图（移动距离 = 精灵图宽度）

  3.使用动画

  steps(N)，N 与精灵小图个数相同 

```css
div {
  width: 140px;
  height: 140px;
  border: 1px solid #000;
  background-image: url(./images/bg.png);
  animation: run 1s steps(12) infinite;
}

@keyframes run {
  from {
    background-position: 0 0;
  }
  to {
    background-position: -1680px 0;
  }
}
```

### 多组动画

```css
animation: 
  动画一,
  动画二,
  ... ...
;
```

~~~css
div {
      width: 140px;
      height: 140px;
      /* border: 1px solid #000; */
      background-image: url(./images/bg.png);
      animation: 
        run 1s steps(12) infinite,
        move 3s forwards
      ;
    }

    /* 当动画的开始状态样式 跟 盒子默认样式相同，可以省略动画开始状态的代码 */
    @keyframes run {
        /* from {
        background-position: 0 0;
      } */
      to {
        background-position: -1680px 0;
      }
    }

    @keyframes move {
      /* 0% {
        transform: translate(0);
      } */
      100% {
        transform: translate(800px);
      }
    }
~~~



# 157.综合案例-全名出游

![1681724426559](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/移动Web/day02/笔记/assets/1681724426559.png)

**背景**

```css
/* 大背景 */
/* 默认状态HTML和body的高度是0，所以导致cover缩放背景图不成功 */
html {
  height: 100%;
}
body {
  height: 100%;
  /* 在我们的浏览器能正常显示是因为这张图片和电脑分辨率是一样大的，所以才会有居中效果，但如果想让其他不一样分辨率的电脑也居中，就需要设置水平居中和垂直顶对齐 */
  /* 让图片完整盖住浏览器，就需要缩放图片，使用cover缩放，cover缩放的意思是缩放到跟盒子的高度一样高，但是我们并没有给body加宽度 */
  background: url(../images/f1_1.jpg) no-repeat center 0 / cover;
  /* background-size: cover; */
}
```

**云彩位置和动画**

* HTML 结构

```html
<!-- 云 -->
<!-- 这个div不写任何的css，只是为了统一管理这些图片 -->
<div class="cloud">
  <img src="./images/yun1.png" alt="">
  <img src="./images/yun2.png" alt="">
  <img src="./images/yun3.png" alt="">
</div>
```

* CSS 样式

```css
/* 云 */
.cloud img {
  position: absolute;
  left: 50%;
}

.cloud img:nth-child(1) {
  margin-left: -250px;
  top: 20px;
  animation: cloud 1s infinite alternate linear;
}
.cloud img:nth-child(2) {
  margin-left: 400px;
  top: 100px;
  animation: cloud 1s infinite alternate linear 0.4s;
}
.cloud img:nth-child(3) {
  margin-left: -550px;
  top: 200px;
  animation: cloud 1s infinite alternate linear 0.6s;
}

@keyframes cloud {
  100% {
    transform: translate(20px);
  }
}
```

**文字动画**

* HTML 结构

```html
<!-- 文字 -->
<div class="text">
  <img src="./images/font1.png" alt="">
</div>
```

* CSS 样式

```css
/* 文字 */
.text img {
  position: absolute;
  left: 50%;
  top: 50%;
  transform: translate(-50%, -50%);
  animation: text 1s;
}

/* 默认 → 小 → 大 → 小 → 默认 */
@keyframes text {
  0% {
    /* 防止层叠，这里也需要加上transform: translate(-50%, -50%)，否则会造成后面就不居中了 */
    transform: translate(-50%, -50%) scale(1);
  }
  20% {
    transform: translate(-50%, -50%) scale(0.1);
  }
  40% {
    transform: translate(-50%, -50%) scale(1.4);
  }
  70% {
    transform: translate(-50%, -50%) scale(0.8);
  }
  100% {
    transform: translate(-50%, -50%) scale(1);
  }
}
```

移动 Web 第三天

01-移动 Web 基础

# 159.谷歌模拟器

模拟移动设备，方便查看页面效果

> 小习惯：如果是看PC端的网页，就把检查面板放到底部
>
> 如果是看手机端，就把检查面板放到侧边，保证页面不被挤小
>
> 切换为移动设备之后切记要刷新才生效
>
> 点击底下的修改，可以新增设备，勾选之后没有确定按钮，直接删除
>
> 切换完设备后，旁边的尺寸就是当前设备的宽高，百分比是缩放比例
>
> <img src=".\assets\image-20240104202601399.png" alt="image-20240104202601399" style="zoom:50%;" />

![1681811083202](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/移动Web/day03资料/笔记/assets/1681811083202.png)



# 160.屏幕分辨率

> 查看自己电脑的分辨率：
>
> <img src=".\assets\image-20240104204334028.png" alt="image-20240104204334028" style="zoom:33%;" />
>
> 横着承受2560个像素点，竖着承受1600个像素点
>
> ![image-20240104204354745](.\assets\image-20240104204354745.png)
>
> 缩放
>
> ![image-20240104204558124](.\assets\image-20240104204558124.png)

分类：

* 物理分辨率：硬件分辨率（出厂设置）
* 逻辑分辨率：软件 / 驱动设置

结论：**制作网页参考 逻辑分辨率** 

![1681811157520](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/移动Web/day03资料/笔记/assets/1681811157520.png)

> 默认状态下，html的宽跟逻辑分辨率的宽就是一样大的
>
> 而移动端网页的宽跟逻辑分辨率的宽不一样

### 视口

作用：显示 HTML 网页的区域，用来约束 HTML 的尺寸

```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">

  <!– 视口标签 -->
  <meta name="viewport" content="width=device-width, initial-scale=1.0">

  <title>Document</title>
</head>
<body>
  
</body>
</html>
```

* width=device-width：视口宽度 = 设备宽度（也就是说网页的宽跟设备逻辑分辨率的宽是一样的）
* initial-scale=1.0：缩放1倍（不缩放）

### 二倍图

概念：设计稿里面每个元素的尺寸的倍数

作用：防止图片在高分辨率屏幕下模糊失真

> 设计师目前都是参考iPhone6/7/8这款手机出设计稿，它的逻辑分辨率是375px，二倍图的宽就是750

使用方法：

![1681811271300](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/移动Web/day03资料/笔记/assets/1681811271300.png)



拓展：

DPR（Device Pixel Ratio）是指设备像素比，它是设备物理像素与CSS像素的比例。在高分辨率显示屏中，为了保证内容的清晰度，一个CSS像素可能由多个物理像素来渲染。

1. **设备像素 (Physical Pixel)**：指的是屏幕硬件上的实际像素点，是显示器或手机屏幕最小的显示单元。
2. **CSS像素 (CSS Pixel)**：浏览器使用的逻辑像素单位，在CSS样式和JavaScript中使用时所指的“像素”，用于网页布局和尺寸定义。

二倍图（Retina Image）的概念与DPR密切相关：

- 在具有高DPR（比如2、3或更高）的设备上，如果直接将为标准DPR设计（通常默认为1）的图片应用于页面，可能会导致图像模糊，因为一个CSS像素要通过多个物理像素来展示，而原始图片的信息不足以填充所有物理像素。
- 为了确保在高DPR设备上显示清晰，需要提供分辨率更高的图片，即每个CSS像素对应更多的物理像素。例如，对于DPR为2的设备，就需要提供宽度和高度都是标准图片两倍的图像资源，这种图片就被称为二倍图或者高清图。

所以，当开发者针对高分辨率屏幕优化网站时，会根据设备的DPR提供相应的图片资源，确保无论在何种设备上都能得到清晰的视觉效果。

# 161.适配方案

* 宽度适配：宽度自适应（一般用于PC端网页的制作，但是这种只能实现宽度是自适应，高度是固定像素的写法）
  * 百分比布局（比如宽度100%）
  * Flex 布局

* 等比适配：宽高等比缩放（移动端）
  * rem
  * vw

# 162.rem

**简介**

* rem单位，是相对单位

* rem单位是相对于HTML标签的字号计算结果

  > 所以第一步应该先给html标签加字号

* 1rem = 1HTML字号大小

~~~css
html {
    font-size: 30px;
}

.box {
    width: 5rem;
    height: 3rem;
    background-color: pink;
}
~~~



# 163.媒体查询

媒体查询能够检测视口的宽度，然后编写差异化的 CSS 样式

当某个条件成立, 执行对应的CSS样式

![1681811369469](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/移动Web/day03资料/笔记/assets/1681811369469.png)

```css
@media (width:320px) {
  html {
    background-color: green;
  }
}
```

### rem 布局

目前rem布局方案中，将网页等分成10份， HTML标签的字号为视口宽度的 1/10。

![1681811438512](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/移动Web/day03资料/笔记/assets/1681811438512.png)

# 164.flexible.js

flexible.js 是手淘开发出的一个用来适配移动端的 js 库。

核心原理就是根据不同的视口宽度给网页中 html 根节点设置不同的 font-size。

查看根字号的大小

![image-20240104213330992](.\assets\image-20240104213330992.png)

```html
<body>
  ......
  <script src="./js/flexible.js"></script>
</body>
```

### rem 移动适配

> 设计稿里是像素单位

rem单位尺寸

1.  确定基准根字号(设计稿适配375px视口)

* 查看设计稿宽度 → 确定参考设备宽度(视口宽度) → 确定基准根字号（1/10视口宽度）

2.  rem单位的尺寸

* **rem单位的尺寸 = px单位数值 / 基准根字号**

# 165.less

Less是一个CSS预处理器, Less文件后缀是.less。扩充了 CSS 语言, 使 CSS 具备一定的逻辑性、计算能力

注意：浏览器不识别 Less 代码，目前阶段，网页要引入对应的 CSS 文件

VS Code 插件：Easy LESS，保存 less文件后自动生成对应的 CSS 文件

![1681811545628](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/移动Web/day03资料/笔记/assets/1681811545628.png)

### 注释

* 单行注释（CSS中不支持这种，转化为.css文件的时候会自动转化为块注释）
  * 语法：// 注释内容
  * 快捷键：ctrl + /
* 块注释
  * 语法：/* 注释内容 */
  * 快捷键： Shift + Alt + A

# 166.less-运算

> 注意，最后需要给个单位

* 加、减、乘直接书写计算表达式

  > 运算符两侧的空格只是程序员的习惯

* 除法需要添加 小括号（推荐） 或 .（会有红色波浪线）

* 表达式存在多个数字单位以第一个单位为准，所以一般在最后一个数字加上单位即可

![1681811616094](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/移动Web/day03资料/笔记/assets/1681811616094.png)

# 167.嵌套

作用：快速生成后代选择器

![1681811640347](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/移动Web/day03资料/笔记/assets/1681811640347.png)

提示：用 & 表示当前选择器，不会生成后代选择器，通常配合hover、nth-child结构伪类或伪元素

![1681811659709](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/移动Web/day03资料/笔记/assets/1681811659709.png)

# 168.变量

概念：容器，存储数据

作用：存储数据，方便使用和修改

语法：

* 定义变量：@变量名: 数据; （使用小驼峰命名，尾部有分号）
* 使用变量：CSS属性：@变量名;

```less
// 定义变量
@myColor: pink;
// 使用变量
.box {
  color: @myColor;
}
a {
  color: @myColor;
}
```

# 169.导入

作用：导入 less 公共样式文件

语法：导入: @import “文件路径”;

提示：如果是 less 文件可以省略后缀

> 把清除的、默认的公共样式导到每个页面对应的less文件，这样只需要生成一个css文件就行了

```less
@import './base.less';
@import './common';
```

### 导出

写法：在 less 文件的第一行添加 // out: 存储URL（注意这里的//不是注释

提示：文件夹名称后面添加 /

```less
// out: ./index.css
// out: ./css/
```

### 禁止导出

写法：在 less 文件第一行添加:  // out: false 

![1681811772496](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/移动Web/day03资料/笔记/assets/1681811772496.png)



# 170.综合案例-极速问诊

![1681811796608](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/移动Web/day03资料/笔记/assets/1681811796608.png)

**准备工作**

* 项目目录

![1681811827562](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/移动Web/day03资料/笔记/assets/1681811827562.png)

* HTML 结构

```html
<link rel="stylesheet" href="./iconfont/iconfont.css">
<link rel="stylesheet" href="./css/index.css">

<body>
  ......
  <script src="./js/flexible.js"></script>
</body>
```

* less 样式

```less
// out: ../css/

@import "./base";
```

**头部布局**

* HTML 结构

```html
<!-- 头部 -->
<header>1</header>
```

* less 样式

```less
// 头部
header {
  display: flex;
  justify-content: space-between;
  padding: 0 (15 / @rootSize);
  height: (44 / @rootSize);
  background-color: pink;
  line-height: (44 / @rootSize);
}
```

**头部内容**

* HTML 结构

> 页面里的可以直接双击选中
>
> ![image-20240105070623676](.\assets\image-20240105070623676.png)

```html
<a href="#" class="back"><span class="iconfont icon-left"></span></a>
<h3>极速问诊</h3>
<a href="#" class="note">问诊记录</a>
```

* less 样式

```less
.icon-left {
  font-size: (22 / @rootSize);
}

h3 {
  font-size: (17 / @rootSize);
}

.note {
  font-size: (15 / @rootSize);
  color: #2CB5A5;
}
```

**banner 区域**

* HTML 结构

```html
<!-- banner -->
<div class="banner">
  <img src="./assets/entry.png" alt="">
  <p><span>20s</span> 快速匹配专业医生</p>
</div>
```

* less 样式

> 为了避免选择器加错位置，需要按习惯折叠再写代码
>
> ![image-20240105071257506](.\assets\image-20240105071257506.png)

```less
// banner
.banner {
  margin-top: (30 / @rootSize);
  margin-bottom: (34 / @rootSize);
  text-align: center;
  img {
    margin-bottom: (18 / @rootSize);
    width: (240 / @rootSize);
    height: (206 / @rootSize);
  }

  p {
    font-size: (16 / @rootSize);
    span {
      color: #16C2A3;
    }
  }
}
```

**问诊类型布局**

* HTML 结构

```html
<!-- 问诊类型 -->
<div class="type">
  <ul>
    <li>
      <a href="#">
        <div class="pic">1</div>
        <div class="txt">2</div>
        <span class="iconfont icon-right"></span>
      </a>
    </li>
    <li>2</li>
  </ul>
</div>
```

* less 样式

```less
// 问诊类型
.type {
  padding: 0 (15 / @rootSize);
  li {
    margin-bottom: (15 / @rootSize);
    padding: 0 (15 / @rootSize);
    height: (78 / @rootSize);
    border: 1px solid #EDEDED;
    border-radius: (4 / @rootSize);
    a {
      display: flex;
      align-items: center;
      // 内容在78里面垂直居中
      height: (78 / @rootSize);
    }
  }
}
```

**问诊类型内容**

- HTML 结构

```html
<div class="pic">
  <img src="./assets/type01.png" alt="">
</div>
<div class="txt">
  <h4>三甲图文问诊</h4>
  <p>三甲主治及以上级别医生</p>
</div>
<span class="iconfont icon-right"></span>
```

- less 样式

```less
img {
  margin-right: (14 / @rootSize);
  width: (40 / @rootSize);
  height: (40 / @rootSize);
}
.txt {
  flex:1;
  h4 {
    font-size: (16 / @rootSize);
    color: #3C3E42;
    line-height: (24 / @rootSize);
  }
  p {
    font-size: (13 / @rootSize);
    color: #848484;
  }
}
.iconfont {
  // 字体图标也需要移动适配   
  font-size: (16 / @rootSize);
}
```

移动 Web 第四天

# 175.vw适配方案

**vw和vh基本使用**

vw和vh是相对单位，相对视口尺寸计算结果

* vw：viewport width（1vw = 1/100视口宽度 ）
* vh：viewport height ( 1vh = 1/100视口高度 )

**vw布局**

vw单位的尺寸 = px 单位数值 / ( 1/100 视口宽度 ) 

**vh问题**

> 不推荐混用，一般使用vw

vh是1/100视口高度，全面屏视口高度尺寸大，如果混用可能会导致盒子变形 

# 177.综合案例-酷我音乐 

![1682666610217](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/移动Web/day04资料/笔记/assets/1682666610217.png)

**准备工作**

![1682666716132](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/移动Web/day04资料/笔记/assets/1682666716132.png)

> 当我们没有线上网页设计稿的时候，可以打开线上的网页，把线上的网页当做设计稿来使用，它的颜色和尺寸使用检查元素的方式来查看和使用
>
> padding也是可以直接看见的
>
> <img src=".\assets\image-20240105083739772.png" alt="image-20240105083739772" style="zoom:50%;" />

* HTML 结构

```html
<link rel="stylesheet" href="./iconfont/iconfont.css">
<link rel="stylesheet" href="./css/index.css">
```

* less 样式

```less
// out: ../css/

@import "./base";
```

**头部布局**

* HTML 结构

> 在移动端页面可以不做logo优化，也就意味着可以不用h1，直接使用div，给这个div加宽高尺寸背景即可

```html
<!-- 头部 -->
<header>
  <div class="left">left</div>
  <a href="#">下载APP</a>
</header>
```

* less 样式

```less
body {
  background-color: #f9fafb;
}

@vw:3.75vw;

// 头部
header {
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding: 0 (15 / @vw);
  height: (50 / @vw);
  background-color: #fff;
}
```

**头部内容**

* less 样式

> 注意查看字体字号的时候也需要选中元素查看
>
> ![image-20240105085336012](.\assets\image-20240105085336012.png)

```less
header {
  // 左边
  // 给左边加背景，就需要固定左边的宽度
  .left {
    width: (235 / @vw);
    height: (50 / @vw);
    background-image: url(../assets/head.png);
    background-size: contain;
    background-repeat: no-repeat;
  }
  a {
    width: (80 / @vw);
    height: (30 / @vw);
    background-color: #ffe31b;
    border-radius: (15 / @vw);
    text-align: center;
    line-height: (30 / @vw);
    font-size: (14 / @vw);
  }
}
```

**搜索区域**

* HTML 结构

```html
<!-- 搜索 -->
<div class="search">
  <div class="txt">
    <span class="iconfont icon-sousuo"></span>
    <span>搜索你想听的歌曲</span>
  </div>
</div>
```

* less 样式

```less
// 搜索
.search {
  padding: (10 / @vw) (15 / @vw);
  height: (52 / @vw);
  // background-color: pink;
  .txt {
    height: (32 / @vw);
    background-color: #f2f4f5;
    border-radius: (16 / @vw);
    text-align: center;
    line-height: (32 / @vw);
    color: #a1a4b3;
    font-size: (14 / @vw);
    .iconfont {
      font-size: (16 / @vw);
    }
  }
}
```

**banner 区域**

* HTML 结构

```html
<!-- banner -->
<div class="banner">
  <ul>
    <li><a href="#"><img src="./assets/banner01.jpeg" alt=""></a></li>
  </ul>
</div>
```

* less 样式

> 控制图片的尺寸：
>
> 1. 给图片加宽高
>
> 2. 给小li设置固定尺寸（也是vw单位）
>
>    img宽高取100%

```less
// banner
.banner {
  padding: 0 (15 / @vw);
  height: (108 / @vw);
  // background-color: pink;
  ul {
    li {
      width: (345 / @vw);
      height: (108 / @vw);
      img {
        width: 100%;
        height: 100%;
        // cover完全覆盖，跟background的属性很像
        // 缩放img，图片比例跟父级盒子比例不同，避免图片挤压变形
        // 一般都是从图片的最左最后最下裁剪的，不会影响图片的主题内容
        object-fit: cover;
        border-radius: (5 / @vw);
      }
    }
  }
}
```

**标题公共样式**

* HTML 结构

```html
<!-- 排行榜 -->
<div class="list">
  <!-- 标题 -->
  <div class="title">
    <h4>酷我排行榜</h4>
    <a href="#">更多<span class="iconfont icon-right"></span></a>
  </div>
</div>
```

* less 样式

> 选中标签，选择计算样式，也可以查看对应的尺寸

```less
// 排行榜
.list {
  margin-top: (20 / @vw);
  padding: 0 (15 / @vw);
}

// 标题 → 公共样式
.title {
  display: flex;
  justify-content: space-between;
  margin-bottom: (16 / @vw);
  // 直接给title加上行高，使左和右都垂直居中
  line-height: (25 / @vw);
  h4 {
    font-size: (20 / @vw);
  }
  a {
    font-size: (12 / @vw);
    color: #a1a4b3;
  }
}
```

**排行榜内容**

* HTML 结构

```html
<!-- 内容 -->
<div class="content">
  <ul>
    <li>
      <div class="pic"><img src="./assets/icon_rank_hot.png" alt=""></div>
      <div class="txt">
        <a href="#" class="more">酷我热歌榜<span class="iconfont icon-right"></span></a>
        <a href="#">1.樱花树下的约定（完整版） - 旺仔小乔</a>
        <a href="#">2.就让这大雨全都落下 - 容祖儿</a>
        <a href="#">3.缺氧 - 轩姨（相信光）</a>
      </div>
    </li>
    <li>
      <div class="pic"><img src="./assets/icon_rank_new.png" alt=""></div>
      <div class="txt">
        <a href="#" class="more">酷我新歌榜<span class="iconfont icon-right"></span></a>
        <a href="#">1.樱花树下的约定（完整版） - 旺仔小乔</a>
        <a href="#">2.就让这大雨全都落下 - 容祖儿</a>
        <a href="#">3.缺氧 - 轩姨（相信光）</a>
      </div>
    </li>
    <li>
      <div class="pic"><img src="./assets/icon_rank_rise.png" alt=""></div>
      <div class="txt">
        <a href="#" class="more">酷我飙升榜<span class="iconfont icon-right"></span></a>
        <a href="#">1.樱花树下的约定（完整版） - 旺仔小乔</a>
        <a href="#">2.就让这大雨全都落下 - 容祖儿</a>
        <a href="#">3.缺氧 - 轩姨（相信光）</a>
      </div>
    </li>
  </ul>
</div>
```

* less 样式

```less
// 排行榜
.list {
  margin-top: (20 / @vw);
  padding: 0 (15 / @vw);
  li {
    display: flex;
    margin-bottom: (16 / @vw);
    height: (105 / @vw);
    background-color: #fff;
    border-radius: (10 / @vw);
    .pic {
      margin-right: (20 / @vw);
      img {
        width: (105 / @vw);
        height: (105 / @vw);
        border-radius: (10 / @vw);
      }
    }
    .txt {
      a {
        // 让a转为块，使文字都换行
        display: block;
        font-size: (12 / @vw);
        color: #a1a4b3;
        // 倍数没有单位
        line-height: 1.8;
      }

      // 要么写到与a并列的地方，如果写在里面就使用&.more
      .more {
        font-size: (14 / @vw);
        color: #333;
        .iconfont {
          font-size: (16 / @vw);
        }
      }
    }
  }
}
```

**推荐歌单布局**

* HTML 结构

```html
<!-- 推荐歌单 -->
<div class="recommend">
  <!-- 标题 -->
  <div class="title">
    <h4>推荐歌单</h4>
    <a href="#">更多<span class="iconfont icon-right"></span></a>
  </div>
  <!-- 内容 -->
  <div class="content">
    <ul>
      <li>1</li>
      <li>1</li>
      <li>1</li>
      <li>1</li>
      <li>1</li>
      <li>1</li>
    </ul>
  </div>
</div>
```

* less 样式

```less
// 推荐歌单
.recommend {
  padding: 0 (15 / @vw);
  ul {
    display: flex;
    flex-wrap: wrap;
    justify-content: space-between;
    li {
      margin-bottom: (16 / @vw);
      width: (105 / @vw);
      height: (143 / @vw);
      background-color: pink;
    }
  }
}
```

**推荐歌单内容**

* HTML 结构

```html
<li>
  <div class="pic">
    <img src="./assets/song01.jpeg" alt="">
    <div class="cover">18.2W</div>
  </div>
  <div class="txt">抖音嗨爆DJ！劲爆旋律萦绕双耳</div>
</li>
<li>
  <div class="pic">
    <img src="./assets/song02.jpeg" alt="">
    <div class="cover">18.2W</div>
  </div>
  <div class="txt">抖音嗨爆DJ！劲爆旋律萦绕双耳</div>
</li>
<li>
  <div class="pic">
    <img src="./assets/song03.jpeg" alt="">
    <div class="cover">18.2W</div>
  </div>
  <div class="txt">抖音嗨爆DJ！劲爆旋律萦绕双耳</div>
</li>
<li>
  <div class="pic">
    <img src="./assets/song02.jpeg" alt="">
    <div class="cover">18.2W</div>
  </div>
  <div class="txt">抖音嗨爆DJ！劲爆旋律萦绕双耳</div>
</li>
<li>
  <div class="pic">
    <img src="./assets/song03.jpeg" alt="">
    <div class="cover">18.2W</div>
  </div>
  <div class="txt">抖音嗨爆DJ！劲爆旋律萦绕双耳</div>
</li>
<li>
  <div class="pic">
    <img src="./assets/song01.jpeg" alt="">
    <div class="cover">18.2W</div>
  </div>
  <div class="txt">抖音嗨爆DJ！劲爆旋律萦绕双耳</div>
</li>
```

* less 样式

```less
// 图片
.pic {
  position: relative;
  width: (105 / @vw);
  height: (105 / @vw);
  img {
    width: 100%;
    height: 100%;
    object-fit: cover;
    border-radius: (10 / @vw);
  }
  .cover {
    position: absolute;
    left: 0;
    bottom: 0;
    width: (70 / @vw);
    height: (28 / @vw);
    background-color: rgba(0,0,0,0.8);
    border-radius: 0 (10 / @vw) 0 (10 / @vw);
    text-align: center;
    line-height: (28 / @vw);
    color: #fff;
    font-size: (14 / @vw);
  }
}
// 文字
.txt {
  font-size: (14 / @vw);
}
```

**下载区域**

* HTML 结构

```html
<!-- 安装，下载 -->
<div class="download">
  <img src="./assets/logo.png" alt="">
  <p>安装酷我音乐 发现更多好音乐</p>
  <span class="iconfont icon-right"></span>
</div>
```

* less 样式

```less
// 下载
.download {
  position: fixed;
  left: (15 / @vw);
  bottom: (30 / @vw);

  display: flex;
  align-items: center;
  padding: 0 (10 / @vw) 0 (15 / @vw);
  width: (345 / @vw);
  height: (45 / @vw);
  background-color: #fff;
  border-radius: (22 / @vw);
  img {
    margin-right: (10 / @vw);
    width: (36 / @vw);
    height: (36 / @vw);
  }
  p {
    flex: 1;
    font-size: (14 / @vw);
  }
  span {
    width: (32 / @vw);
    height: (32 / @vw);
    background-color: #f2f3f5;
    border-radius: 50%;
    text-align: center;
    line-height: (32 / @vw);
    font-size: (16 / @vw);
  }
}
```

**头部固定**

* less 样式

```less
// 头部
header {
  position: fixed;
  left: 0;
  top: 0;
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding: 0 (15 / @vw);
  // 固定定位的盒子，宽度靠内容撑开，希望宽度100%
  width: 100%;
  height: (50 / @vw);
  background-color: #fff;
}

// 搜索
.search {
  // 头部固定定位，脱标不占位，搜索去最顶了，加上外边距挤下来即可
  margin-top: (50 / @vw);
  padding: (10 / @vw) (15 / @vw);
  height: (52 / @vw);
}
```



移动 Web 第五天

响应式布局方案

* 媒体查询
* Bootstrap框架

# 187.媒体查询

**基本写法**

![1682667975274](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/移动Web/day05资料/笔记/assets/1682667975274.png)

* max-width：最大宽度（小于等于）
* min-width：最小宽度（大于等于）

**书写顺序**

* min-width（从小到大依次书写）
* max-width（从大到小）

# 188.案例-左侧隐藏

需求：网页宽度小于等于768px则隐藏左侧区域

![1682668088236](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/移动Web/day05资料/笔记/assets/1682668088236.png)

* HTML 结构

```css
<div class="box">
  <div class="left">left</div>
  <div class="main">
    响应式网页效果响应式网页效果响应式网页效果响应式网页效果响应式网页效果响应式网页效果响应式网页效果响应式网页效果响应式网页效果响应式网页效果响应式网页效果响应式网页效果响应式网页效果响应式网页效果响应式网页效果响应式网页效果响应式网页效果响应式网页效果响应式网页效果响应式网页效果响应式网页效果响应式网页效果响应式网页效果响应式网页效果响应式网页效果响应式网页效果响应式网页效果响应式网页效果响应式网页效果响应式网页效果响应式网页效果响应式网页效果响应式网页效果响应式网页效果响应式网页效果响应式网页效果响应式网页效果响应式网页效果响应式网页效果响应式网页效果响应式网页效果响应式网页效果响应式网页效果响应式网页效果响应式网页效果响应式网页效果响应式网页效果响应式网页效果
  </div>
</div>
```

* CSS 样式

```css
.box {
  display: flex;
}

.left {
  width: 300px;
  height: 500px;
  background-color: pink;
}

.main {
  flex: 1;
  height: 500px;
  background-color: skyblue;
}

@media (max-width: 768px) {
  .left {
    display: none;
  }
}
```

# 189.媒体查询-完整写法

![1682668186585](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/移动Web/day05资料/笔记/assets/1682668186585.png)

#### 关键词 / 逻辑操作符

* and（并且）
* only（仅仅）
* not（不是）

#### 媒体类型

媒体类型用来区分设备类型

* screen：屏幕设备
* 打印预览：print
* 阅读器：speech
* 不区分类型：all

#### 媒体特性

* 视口宽高：width / height
* 视口最大宽高：max-width ；max-height
* 视口最小宽高：min-width；min-height
* 屏幕方向：orientation
  * protrait：竖屏
  * landscape：横屏

### 媒体查询-外部CSS

![1682668446411](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/移动Web/day05资料/笔记/assets/1682668446411.png)

~~~css
<!-- 即便只有一个媒体特性，小括号也必须写 -->
<link rel="stylesheet" media="(max-width:768px)" href="pink.css">
~~~



# 190.Bootstrap

**简介**

Bootstrap 是由 Twitter 公司开发维护的前端 UI 框架，它提供了大量编写好的 CSS 样式，允许开发者结合一定 HTML 结构及JavaScript，快速编写功能完善的网页及常见交互效果。 

中文官网: <https://www.bootcss.com/> 

**使用步骤**

**下载**

下载：Bootstrap V5中文文档 → 进入中文文档 → 下载 →下载 Bootstrap 生产文件

> 如果开发响应式网页，就选生产文件，生产文件是开发项目要用的
>
> 源码就是没有进行任何的打包压缩的，里面有底层实现
>
> ![image-20240105140804777](.\assets\image-20240105140804777.png)

![1682668529209](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/移动Web/day05资料/笔记/assets/1682668529209.png)

bootstrap.min.css：进行了压缩，所有代码都放到了一行，这种文件体积较小。

如果需要查看它css里面有啥，就需要打开bootstrap.css

# 191.Bootstrp使用

1. 引入 Bootstrap CSS 文件

```html
<link rel="stylesheet" href="./Bootstrap/css/bootstrap.min.css">
```

2. 调用类名： container 响应式布局版心类

```html
<div class="container">测试</div>
```

# 192.栅格系统

作用：响应式布局

栅格化是指将整个网页的宽度分成12等份，每个盒子占用的对应的份数

例如：一行排4个盒子，则每个盒子占 3份 即可（12 / 4 = 3）

> 这些数字在栅格系统里面叫响应断点，用这些响应断点把所有分辨率分成了6个区间，并且这六个区间取了名字
>
> <576px表示的是手机
>
> ![image-20240105144424099](.\assets\image-20240105144424099.png)

类前缀，在类前缀后面加上对应的份数，就叫类名了

做响应式效果，第一点要保证的就是版心不一样

![1682668611644](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/移动Web/day05资料/笔记/assets/1682668611644.png)

* row 类：行，可以让内容在一行排（flex布局）

  默认就是一行排一个

安装插件：使bootstrat有提示

![image-20240105145549810](.\assets\image-20240105145549810.png)

~~~html
<body>
    <!-- 
    视口宽度大于等于1200px，一行排4个盒子
    视口宽度大于等于768px，一行排2个盒子
    视口宽度大于等于576px，一行排1个盒子
	-->
    <div class="container">
        <div class="row">
            <div class="col-xl-3 col-md-6 col-sm-12">1</div>
            <div class="col-xl-3 col-md-6 col-sm-12">2</div>
            <div class="col-xl-3 col-md-6 col-sm-12">3</div>
            <div class="col-xl-3 col-md-6 col-sm-12">4</div>
        </div>
    </div>
</body>
~~~



# 193.全局样式

Bootstrap中快速找到对应的代码

![image-20240115120140782](.\assets\image-20240115120140782.png)

#### 按钮

![1682668666364](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/移动Web/day05资料/笔记/assets/1682668666364.png)

类名

* btn：默认样式（如果需要使用以下类名对按钮进行美化，这这个类名必须要写，用于清除默认样式
* btn-success：成功
* btn-warning：警告
* ……
* 按钮尺寸：btn-lg（大按钮） / btn-sm（使按钮变小）

v5官方文档：

![image-20240105150443805](.\assets\image-20240105150443805.png)

#### 表格

![1682668706851](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/移动Web/day05资料/笔记/assets/1682668706851.png)

表格类：

* table：默认样式

  > 必须引入

* table-striped：隔行变色

* table-success：表格颜色

  > 如果加到表格身上，一个表格变颜色
  >
  > 如果加到行身上，这一行变颜色

* table-hover

  ![image-20240105151031830](.\assets\image-20240105151031830.png)

* ……

  ![image-20240105150906532](.\assets\image-20240105150906532.png)

# 194.组件

1.引入样式表

2.引入 js 文件（主要是看组件有没有动态的功能）

3.复制结构，修改内容

![image-20240105151541181](.\assets\image-20240105151541181.png)

复制组件：

![image-20240105171252099](.\assets\image-20240105171252099.png)

通过检查找到需要修改的位置，通过属性前的框，判断是不是这个属性

![image-20240105165954861](.\assets\image-20240105165954861.png)

**修改样式**

首先复制需要修改的选择器，并且要注意，它后面还有个!important

![image-20240105170402933](.\assets\image-20240105170402933.png)

将style样式写在link的后面，因为需要覆盖

![image-20240105170502257](.\assets\image-20240105170502257.png)

但凡出现  '...' 的都代表可删可改

![image-20240105170758532](.\assets\image-20240105170758532.png)

js文件在</body>的上面引入即可

![image-20240105170849519](.\assets\image-20240105170849519.png)

如果有不清楚的地方，直接右击点检查

![image-20240105171119429](.\assets\image-20240105171119429.png)

# 195.字体图标

**下载**

导航 / Extend：图标库 → 安装 → 下载安装包 → [bootstrap-icons-1.X.X.zip](https://github.com/twbs/icons/releases/download/v1.10.3/bootstrap-icons-1.10.3.zip)

![image-20240105171700531](.\assets\image-20240105171700531.png)

![image-20240105172015884](.\assets\image-20240105172015884.png)

![image-20240105172039971](.\assets\image-20240105172039971.png)

安装包里包含字体图标font文件夹，还包含所有图标对应的svg图

![image-20240105172616917](.\assets\image-20240105172616917.png)

**使用**

1. 复制 fonts 文件夹到项目目录

2. 网页引入 bootstrap-icons.css 文件

3. 调用 CSS 类名（图标对应的类名，iconfont要用两个）

   bi的全称是：bootstrap-icon

   ![image-20240105173255474](.\assets\image-20240105173255474.png)

   点进图标直接复制类名即可

   ![image-20240105173405450](.\assets\image-20240105173405450.png)

```html
<i class="bi-android2"></i>
```

# 196.综合案例-alloyTeam

**准备工作**

![1682668919871](O:/BaiduSyncdisk/other/课/黑马/HTML+CSS+移动web/移动Web/day05资料/笔记/assets/1682668919871.png)

* HTML 结构

```html
<title>腾讯全端</title>
<link rel="shortcut icon" href="favicon.ico" type="image/x-icon">
<!-- 层叠性：咱们的css 要 层叠 框架的 -->
<link rel="stylesheet" href="./Bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="./Bootstrap/font/bootstrap-icons.css">
<link rel="stylesheet" href="./css/index.css">

<script src="./Bootstrap/js/bootstrap.min.js"></script>
```

* less 样式

```less
// out: ../css/
```

# 197.头部导航

* HTML 结构

```html
<!-- 导航 -->
<nav class="navbar navbar-expand-lg bg-body-tertiary fixed-top">
  <div class="container">
    <a class="navbar-brand" href="#"><img src="./assets/images/logo.png" alt=""></a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">首页</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">博客</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Github</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">TWeb Conf</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">SuperStar</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Web前端导航</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">关于</a>
        </li>
      </ul>
    </div>
  </div>
</nav>
```

* less 样式

在bootstart中找固定定位

![image-20240105175550799](.\assets\image-20240105175550799.png)

此时检查可以查看到该定位属性

![image-20240105175750410](.\assets\image-20240105175750410.png)

```less
// 导航
.bg-body-tertiary {
  background-color: transparent !important;
  .navbar-collapse {
    flex-grow: 0;
  }
}
```

**轮播图图片**

* HTML 结构

```html
<!-- 轮播图 -->
<div id="carouselExampleIndicators" class="carousel slide">
  <div class="carousel-indicators">
    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1" aria-label="Slide 2"></button>
    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2" aria-label="Slide 3"></button>
    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="3" aria-label="Slide 4"></button>
  </div>
  <div class="carousel-inner">
    <div class="carousel-item active">
      
    </div>
    <div class="carousel-item">
      
    </div>
    <div class="carousel-item">
      
    </div>
    <div class="carousel-item">
      
    </div>
  </div>
  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Previous</span>
  </button>
  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Next</span>
  </button>
</div>
```

* less 样式

```less
.carousel {
  .carousel-item {
    height: 500px;
    background-size: cover;
    background-position: center 0;
  }
  .carousel-item:nth-child(1) {
    background-image: url(../assets/uploads/banner_1.jpg);
  }
  .carousel-item:nth-child(2) {
    background-image: url(../assets/uploads/banner_2.jpg);
  }
  .carousel-item:nth-child(3) {
    background-image: url(../assets/uploads/banner_3.jpg);
  }
  .carousel-item:nth-child(4) {
    background-image: url(../assets/uploads/banner_4.jpg);
  }
}
```

# 198.轮播图响应式

> 为了写代码更方便，为了响应式效果更方便（可以控制宽高，只写一次尺寸），把img都用背景图来实现

* less 样式

```less
// 轮播图: 小于768图片高度250 max；大于等于768图片高度400 min；大于等于992图片高度500
.carousel {
  // 响应式 → 媒体查询
  @media (max-width: 768px) {
    .carousel-item {
      height: 250px;
    }
  }

  @media (min-width: 768px) {
    .carousel-item {
      height: 400px;
    }
  }
  @media (min-width: 992px) {
    .carousel-item {
      height: 500px;
    }
  }


  .carousel-item {
    // height: 500px;
    background-size: cover;
    background-position: center 0;
  }
}
```

# 199.开源项目响应式

* HTML 结构

> 拖动窗口时，浏览器右上角会有尺寸提示
>
> ![image-20240105194457754](.\assets\image-20240105194457754.png)

```html
<!-- 开源项目 -->
<div class="project container">
  <div class="title">
    <h2>OpenSource / 开源项目</h2>
    <p>种类众多的开源项目，让你爱不释手</p>
  </div>
  <div class="content">
    <div class="row">
      <div class="col-lg-3 col-md-6">1</div>
      <div class="col-lg-3 col-md-6">2</div>
      <div class="col-lg-3 col-md-6">3</div>
      <div class="col-lg-3 col-md-6">4</div>
    </div>
  </div>
</div>
```

* less 样式

```less
// 开源项目
// 视口宽度大于992；一行排4个盒子  col-lg-3
// 视口宽度大于768；一行排2个盒子  col-md-6
.project {
  margin-top: 60px;
  text-align: center;
}
```

### 开源项目内容布局

* HTML 结构

```html
<!-- 开源项目 -->
<div class="project container">
  <div class="title">
    <h2>OpenSource / 开源项目</h2>
    <p>种类众多的开源项目，让你爱不释手</p>
  </div>
  <div class="content">
    <div class="row">
      <div class="col-lg-3 col-md-6"><a href="#">1</a></div>
      <div class="col-lg-3 col-md-6"><a href="#">1</a></div>
      <div class="col-lg-3 col-md-6"><a href="#">1</a></div>
      <div class="col-lg-3 col-md-6"><a href="#">1</a></div>
    </div>
  </div>
</div>
```

* less 样式

```less
.project {
  margin-top: 60px;
  text-align: center;
  .row {
    div {
      margin-bottom: 10px;
      height: 200px;
      // background-color: pink;
      // 栅格每个元素的宽度都是25%，所以栅格不是用margin，而是又套了一个子级。父级padding的绿色不会填充子级的绿色
      a {
        // 块级的宽度和父级一样大
        display: block;
        height: 200px;
        background-color: green;
        border-radius: 4px;
      }

      &:nth-child(1) a {
        background-color: #70c3ff;
      }
      &:nth-child(2) a {
        background-color: #fd6a7f;
      }
      &:nth-child(3) a {
        background-color: #7f8ea0;
      }
      &:nth-child(4) a {
        background-color: #89d04f;
      }
    }
  }
}
```