package com.atguigu.mvc.controller;

import com.atguigu.mvc.bean.User;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class HttpController {
    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String requestBody) {
        System.out.println("requestBody：" + requestBody);
        return "success";
    }

    @RequestMapping("/testRequestEntity")
    public String testRequestEntity(RequestEntity<String> requestEntity) {
        //当前requestEntity表示整个请求报文的信息
        //这个请求头就是在浏览器中看见的请求，因为我们获取的是所有的请求头。所以它会把我们当前的请求头信息一次性输出
        System.out.println("请求头：" + requestEntity.getHeaders());//返回的是HttpHeaders对象，这里面还有一些其他的get方法也可以使用
        System.out.println("请求体：" + requestEntity.getBody());//我们现在是post表单
        return "success";
    }

    @RequestMapping("/testRespondse")
    //由于现在不需要实现页面跳转，要么返回null，要么返回参数为void
    public void testRespondse(HttpServletResponse response) throws IOException {
        //将print中的内容直接作为响应报文的响应体响应到浏览器
        //而响应体中是什么，我们在浏览器中看见的就是什么
        //为什么我们通过转发和重定向我们能看见一个页面：因为此时这个请求所对应的响应的响应体就是一个完整的页面
        //现在这里由于"hello,response"是响应体，则我们在浏览器能看见的就是"hello,response"
        response.getWriter().print("hello,response");
    }

    @RequestMapping("/testRespondseBody")
    @ResponseBody
    public String testRespondseBody() {
        //如果不加@ResponseBody注解，则这个返回的success会作为视图名称被解析
        //但如果加上了，则这个方法的返回值就是当前响应的响应体
        return "success";
    }

    @RequestMapping("/testRespondseUser")
    @ResponseBody
    public User testRespondseUser() {
        return new User(1001, "admin", "123456", 23);
    }

    @RequestMapping("/testAxios")
    @ResponseBody
    public String testAxios(String username, String password) {
        System.out.println(username + "," + password);
        return "hello, axios";
    }
}
