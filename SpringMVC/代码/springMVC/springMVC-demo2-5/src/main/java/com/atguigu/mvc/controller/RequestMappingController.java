package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RequestMappingController {
    //这样的意思就是当前的请求地址可以是/testRequestMapping，/test。但是请求方式必须是GET
            @RequestMapping(value = {
                    "/testRequestMapping", "/test"
                    },
                    method = {RequestMethod.GET, RequestMethod.POST}

            )
    public String success() {
        return "success";
    }

    @GetMapping("/testGetMapping")
    public String testGetMapping() {
                return "success";
    }

    @RequestMapping(value = "/testPut", method = RequestMethod.PUT)
    public String testPut() {
                return "success";
    }

    @RequestMapping(value = "testParamsAndHeaders",
            //这样写就代表：必须要有username，并且密码为：123456
            params = {"username", "password=123456"},
            //双引号里面写的应该是刚刚的四种表达式
            //host：指的是当前ip的意思
            //这是我们请求当中的一个键值对，Host是键，Host冒号后面的是值
            //"Host:localhost:8081"     现在我们要求我们当前所匹配的请求，它的请求头中必须携带Host键，它的值必须为8081
            //所以此时值就要改了，中间不能写冒号了，我们想要写一个表达式，中间用=表示
            //如果请求头中携带了这个键值对，就能匹配到，如果没有携带，则不能匹配到。
            headers = {"Host=localhost:8081"}
    )
    public String testParamsAndHeaders() {
                return "success";
    }

    @RequestMapping("/**/testAnt")
    public String testAnt() {
                return "success";
    }

    //{}就是路径中的占位符，来表示我们当前路径中的这个1，给它取个名字叫id
    //此时我们还需要把id获取到，获取方式：在形参列表中使用注解：@PathVariable，其中value属性必须写，这里为id，然后让它修饰我们当前的一个参数Integer id
    //即：它可以将我们当前占位符id所表示的值然后自动赋值给我们的形参id
    @RequestMapping("/testPath/{id}/{username}")
    public String testPath(@PathVariable("id")Integer id, @PathVariable("username")String username) {
        System.out.println("id：" + id);
        System.out.println("username：" + username);
                return "success";
    }
}
