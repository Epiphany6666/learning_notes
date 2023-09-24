<%--
  Created by IntelliJ IDEA.
  User: Epiphany
  Date: 2023/9/16
  Time: 20:11
  To change this template use File | Settings | File Templates.
--%>
<%--<%@是一个JSP指令，来设置当前页面中的一些信息
contentType：文本信息，是以文本存在的html。
charset：当前页面的编码
language：当前JSP所支持的语言
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>首页</h1>
<%--这个不需要再用@{}来进行包装了，因为在jsp里面本身就有使用java代码来获取一些数据的方法
<a href="/success">success.jsp</a>//但这种是不好使的！因为这个路径是以/开头的，所以这个路径是个绝对路径，而超链接中的绝对路径是由浏览器解析的，所以它少一个上下文路径
并且还不能把上下文路径写死，所以这里要用动态获取的方式：${}，当前JSP界面的域对象：pageContext
在它里面有个属性叫：request，request中有个属性叫：contextPath。（这个contextPath就是request.getContextPath()，即获取上下文路径）
pageContext.request.contetPath 整体叫做el表达式，在el表达式中是通过属性的方式来访问的

当index.jsp更新后，浏览器可以直接刷新，因为在tomcat里面我们设置了：当它失去焦点更新类和资源，此时jsp是能自动更新的，但是改了类就需要重新部署
thymeleaf不行。thymeleaf改了内容就需要结果thymeleaf重新解析。

success还是需要经过视图解析器解析，加上前缀和后缀，是通过InternalResourceViewResolver来解析的，而这个解析器的视图是InternalResourceView

当然，我们在这个地方也可以使用前缀：forward: 和 redirect:，但是在这种情况下我们并不会去创建thymeleafView。只会创建两种视图：
1.转发视图：InternalResourceView
  当没有任何前缀和forward:为前缀时创建的是InternalResourceView

2.重定向视图：RedirectView
  当以redirect:开头时，创建的是RedirectView
--%>
<a href="${pageContext.request.contextPath}/success">success.jsp</a>
</body>
</html>
