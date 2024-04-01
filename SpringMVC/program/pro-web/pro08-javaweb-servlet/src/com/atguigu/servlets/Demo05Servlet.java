package com.atguigu.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// 演示从HttpSession保存作用域中获取数据
public class Demo05Servlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 它获取到的是Object类型
        Object unameObj = request.getSession().getAttribute("uname");
        System.out.println(unameObj);
    }
}
