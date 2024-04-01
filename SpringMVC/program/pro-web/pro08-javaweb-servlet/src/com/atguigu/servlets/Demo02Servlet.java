package com.atguigu.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// 演示Servlet的生命周期
public class Demo02Servlet extends HttpServlet {
//    private Demo02Servlet () {
//        System.out.println("正在实例化...");
//    }

    @Override
    public void init() throws ServletException {
        System.out.println("正在初始化....");
    }

    // 这里就不重写doGet、doPost方法了，重写service也是一样的，重写service就意味着，不管你发的是啥请求，我都会调用service
    // 只不过在人家service方法的内部才细分

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("正在服务....");
    }

    @Override
    public void destroy() {
        System.out.println("正在销毁...");
    }
}
