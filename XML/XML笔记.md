# XML笔记

# XML

208. xml_概述

     1. 概念：Extersible Markup Language 可扩展标记语言
        - 可扩展：标签都是自定义的
        - 功能：存储数据
          1. 配置文件
          2. 在网络中传输
        - 与html的区别
          1. xml标签都是自定义的，html标签是预定义。
          2. xml的语法严格，html语法松散
          3. xml是存储数据的，html是展示数据
        - w3c：万维网联盟（World Wide Web Consortium，简称 W3C）创建于1994年，是Web技术领域具有权威和影响力的国际中立性技术标准机构。W3C已发布了400多项影响深远的Web技术标准及实施指南，如广为业界采用的[超文本标记语言](https://baike.baidu.com/item/超文本标记语言/6972570?fromModule=lemma_inlink)（HTML）、可扩展标记语言（XML）以及帮助残障人士有效获得Web 内容的信息无障碍指南（[WCAG](https://baike.baidu.com/item/WCAG/1912019?fromModule=lemma_inlink)）等，有效促进了Web技术的互相兼容，对互联网技术的发展和应用起到了基础性和根本性的支撑作用。

209. xml_快速入门

     1. 语法：

        - 基本语法：

          1. xml文件的后缀名 .xml

          2. xml第一行必须定义为文档声明(并且如果空一行在写，也是不行的！)

          3. xml文档中有且仅有一个根标签

          4. 属性值必须使用引号（单双都可）引起来

          5. 标签必须正确关闭（要么自闭合，要么关闭）

          6. xml标签名称区分大小写

          7. 部分代码：

             <?xml version='1.0' ?>//文档声明

             <users>
             	<user id='1'>
             		<name>zhangsan</name>
             		<age>23</age>
             		<gender>nan</gender>
             	</user>
             	

             ```
             <user id='2'>
             	<name>lisi</name>
             	<age>24</age>
             	<gender>nan</gender>
             </user>
             ```

             </users>

210. xml组成部分

     1. 文档声明

        1. 格式：<?xml 属性列表 ?>  PS：不能有多余的空格！

        2. 属性列表：

           - version：版本号，必须的属性

           - encoding：编码方式。告知解析引擎当前文档使用的字符集，默认值：ISO-8859-1

           - standalone：是否独立。（但现在这个属性几乎都不设置了）` 这个文件有可能会依赖于其他的文件`

             取值：

             		yes：不依赖其他文件
             		no：依赖其他文件

           - 举例：
             ` <?xml version='1.0' encoding="utf-8" standalone='no' ?>`

     2. 指令(了解，结合css)

     3. 标签：标签名称自定义的

        - 规则：
          1. 名称可以包含字母、数字以及其他的字符
          2. 名称不能以数字或者标点符号开始
          3. 名称不能以字母 xml （或者 Xml、 XML等等）开始
          4. 名称不能包含空格

     4. 属性：

        - id属性值唯一，但我们平时起名叫id，但它并不代表id

     5. 文本

        - CATA区：在该区域中的数据会被原样展示

          格式：`<![CDARA[ 数据 ]]>`

211. 约束概述

     - 谁编写？

       用户编写，即软件的使用者

     - 谁解析？

       软件

     - 约束：规定xml文档的书写规则

       作为框架（半成品软件）的使用者（程序员）

       1. 能够在xml中引入约束文档
       2. 能够简单的读懂约束文档
	   说明文档：规定xml文档中的书写规则

212. xml_约束 DTD

     1. 分类：
        1. DTS：一种简单的约束技术，但这种约束技术是有很大缺陷的，所以在后面有另一种约束来替代DTS约束
        2. Schema：一种复杂的约束
     2. 用法：
        1. 引入dtd文档到xml文档中
           - 内部dtd：将约束规则定义在xml文档中
           - 外部dtd：将约束的规则定义在外部的dtd文件中
             1. 本地
             2. 网络

xml中的注释不能嵌套