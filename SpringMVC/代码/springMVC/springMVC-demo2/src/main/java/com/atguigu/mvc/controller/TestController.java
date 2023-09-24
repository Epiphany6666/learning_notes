package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    public TestController() {
    }

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}