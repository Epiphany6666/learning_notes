package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

@Controller
public class HelloController {
    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }

    @RequestMapping("/param")
    public String param() {
        return "test_param";
    }

    @RequestMapping("/testServletAPI")
    //如果DispatcherServlet检测到我们当前方法的形参是一个HttpServletRequest对象，它就可以将我们当前在DispatcherServlet里面所获得的表示当请求的Request对象赋值给HttpServletRequest request这个参数
    //也就是说形参中request是什么类型，那这个参数表示的就是当前请求
    public String testServletAPI(HttpServletRequest request) throws UnsupportedEncodingException {
        request.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();//此时就能直接创建一个键为JSESSIONID的cookie，但前提是我得访问这个方法
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username=" + username + ", password=" + password);
        return "success";
    }

    //但假如当前有多个重名的请求参数,如果使用的是request.getParameter，那就只能获得a这一个
    @RequestMapping("/testParam")
    public String testParam(@RequestParam(value = "user_name", required=false, defaultValue = "hehe")String username,
                            String password,
                            String[] hobby,
                            //@RequestHeader的required属性默认值为true，value所对应的请求头信息就必须存在，如果不存在直接报错。
                            //defaultValue：如果当前请求头信息不存在，则使用默认值为形参赋值
                            @RequestHeader(value = "sayHaha", required = true, defaultValue = "hh") String host,
                            @CookieValue("JSESSIONID") String JSESSIONID) {
        System.out.println("username=" + username + ", password=" + password + "，hobby：" + Arrays.toString(hobby));
        System.out.println("host：" + host);
        System.out.println("JSESSIONID:" + JSESSIONID);
        return "success";
    }

}
