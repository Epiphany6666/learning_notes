package com.atguigu.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddServlet extends HttpServlet {
    /**
     * 这个方法可以帮你去响应post请求，发一个post请求过来，doPost方法就会被调用
     * 当客户端给服务端发请求的时候，服务器端就把这个请求封装成一个对象：request
     */
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // post方式下，设置编码，防止中文乱码
        request.setCharacterEncoding("UTF-8");
//        // get方式目前不需要设置编码（基于tomcat8以后）
//        // 如果是get请求发送的中文数据，转码稍微有点麻烦（tomcat8之前）
//        String fname = request.getParameter("fname");
//        // 1.将字符串打散成字节数组
//        byte[] bytes = fname.getBytes("ISO-8859-1");// 因为tomcat8之前底层的编码默认使用的编码就是ISO-8859-1
//        // 2.将字节数组安装设定的编码重新组装成字符串，第二个参数是你想要的编码格式
//        fname = new String(bytes, "UTF-8");

        // 请求里去获取参数，获取名字为fname的值
        String fname = request.getParameter("fname");
        // 通过Http请求发过来的只能是字符串
        String priceStr = request.getParameter("price");
        // 如果需要用到数字，强转即可。
        int price = Integer.parseInt(priceStr);
        String fcountStr = request.getParameter("fcount");
        String fcount = request.getParameter(fcountStr);
        String remark = request.getParameter("remark");

        System.out.println("fname = " + fname);
        System.out.println("price = " + price);
        System.out.println("fcount = " + fcount);
        System.out.println("remark = " + remark);
    }
}
