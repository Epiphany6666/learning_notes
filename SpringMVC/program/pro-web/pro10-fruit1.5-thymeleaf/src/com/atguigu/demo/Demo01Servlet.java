package com.atguigu.demo;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/demo01")
public class Demo01Servlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1.向application保存作用域保存数据。
        // ServletContext叫servlet上下文。正常情况下，不严谨的情况来讲，当前的web程序可以称之为servlet程序，因为它里面有大量的控制器组件叫servlet，表示这一次的tomcat启动了，上下文开始了，tomcat停止，上下文就结束了
        ServletContext application = request.getServletContext();
        application.setAttribute("uname", "lili");
        // 2.客户端重定向
//        response.sendRedirect("demo02");

        // 3.服务器转发
        request.getRequestDispatcher("demo02").forward(request, response);
    }
}
