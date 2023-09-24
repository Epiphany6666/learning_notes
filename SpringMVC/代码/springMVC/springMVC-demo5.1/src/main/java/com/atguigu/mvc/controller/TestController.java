package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
//    @RequestMapping("/testInterceptor")
    @RequestMapping("/**/testInterceptor")//有了这个就可以来测试多个请求了
    public String testInterceptor() {
        return "success";
    }

    @RequestMapping("/testExceptionHandler")//有了这个就可以来测试多个请求了
    public String testExceptionHandler() {
        System.out.println(1/0);
        return "success";
    }
}
