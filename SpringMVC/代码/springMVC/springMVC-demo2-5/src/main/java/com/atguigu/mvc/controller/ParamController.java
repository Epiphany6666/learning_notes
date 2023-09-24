package com.atguigu.mvc.controller;

import com.atguigu.mvc.controller.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 专门来处理获取请求参数的功能
 */
@Controller
public class ParamController {
    @RequestMapping("/testBean")
    //如果这里多了一个User对象，则也会为这个参数赋值！但是没有什么意义
    public String testBean(User user, User userInfo) {
        System.out.println(user);
        return "success";
    }
}
