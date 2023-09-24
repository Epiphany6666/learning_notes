package com.atguigu.mvc.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {
    //如果我们当前出现了ArithmeticException或NullPointerException，这个时候就会通过下面这个注解所标识的方法来作为新的控制器方法来执行
    @ExceptionHandler(value = {ArithmeticException.class, NullPointerException.class})
    //获取异常信息：直接在形参列表中写一个Exception，表示的就是当前出现的异常
    public String textException(Exception ex, Model model) {
        //往请求域中共享数据讲了五种方式：
        model.addAttribute("ex", ex);
        return "error";
    }
}
