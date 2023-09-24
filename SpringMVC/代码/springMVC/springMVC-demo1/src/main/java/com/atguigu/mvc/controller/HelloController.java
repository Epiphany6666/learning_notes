package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 创建完成之后，就是一个普通的类。但是SpringMVC并不认识它，就不会把它当前一个控制器。
 * 此时一定要将当前的控制器来作为SpringMVC中的一个组件，此时才是一个控制器。
 *
 * 加入IOC有两种方式：
 * 1.bean标签配置
 * 2.注解＋扫描（这里就用这种）
 *
 * @Component：将当前的类表示为一个普通组件
 * @Controller：将当前的类表示为控制层组件
 * @Service：将当前的类标识为业务层组件
 * @Repository：将当前的类标识为持久层组件
 *
 * 添加完注解还是不够，需要配置扫描。注意不是在pom.xml中配置，而是在SpringMVC的配置文件中配置！
 * 配置完成后，HelloController前面就会有一个图标，这个图标表示当前创建的这个类的对象已经交给了IOC容器管理。
 *
 * 然后还需要配置视图解析器，这个解析器负责我们的页面跳转
 */
@Controller
public class HelloController {
    //我们当前的访问路径是一个 '\'，\后面的访问路径是：/WEB-INF/templates/index.html
    //控制器里面的方法才是真正处理请求的方法，这里返回值必须是String，方法名则随便写，因为与方法名无关。它只和我们当前的请求路径和RequestMapping有关。返回值是视图名称，视图名称就决定了我们最终要跳转到的页面
    //因为我们当前的html是没有办法直接访问的，所以我们最终要跳转到的页面由视图名称决定，当我们返回的视图名称，就会被我们当前的视图解析器所进行解析

    public HelloController() {
    }

    //加上前缀和后缀就能访问到
    @RequestMapping(value = "/")
    public String index() {
        //由于访问路径是：/WEB-INF/templates/index.html，去掉前缀和后缀后就变成了：index，所以此时只需要返回一个index即可
        return "index";
        /**但设置完这一步后，我们当前的方法也并不是处理请求的方法，一个控制器中/一个类中可以有很多种方法，这个方法就是来处理这个请求的方法，此时需要在方法上加上：@RequestMapping注解！即：请求映射
        * 这个注解的作用就是将我们当前的请求和控制器方法来创建映射关系，这就是说，如果我们在里面设置了一个value属性，而这个value属性等于"\"
        * 也就是说当我们浏览器发送的请求是一个"\"的时候，也就是我们上下文路径的时候，它就会来执行我们当前注解所表示的方法，而这个方法所返回的是视图名称，视图名称叫index
        * 被咱们的视图解析器解析，加上前缀后缀，就可以跳转到我们最终的页面，所以说RequestMapping这个注解是非常重要的！
        * 我们当前所使用的属性是value属性，但是它并不是只有value属性，咱们除了可以通过请求地址来匹配请求控制器方法之外，我们还可以通过请求方式、请求参数、请求报文等一些信息来进行匹配。
         *
         * 并且如果当前我们只为value这一个属性赋值，则我们当前的value属性可以省略不写。
         *
         * 此时我们先来配置一个tomcat，通过tomcat来访问我们当前的工程
        */
    }

    //处理步骤：先写方法，返回值是字符串,也就是视图名称，方法名随便取，但最好见名取义
    //然后还需要加上一个注解：@RequestMapping，然后当前注解的value属性值一定要和我们当前的请求地址保持一致，也就是我们的/target
    @RequestMapping("/target")
    public String toTarget() {
        return "target";
    }
}
