package cn.itcast.user.web;

import cn.itcast.user.config.PatternProperties;
import cn.itcast.user.pojo.User;
import cn.itcast.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Slf4j
@RestController
//@RefreshScope
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

//    @Value("${pattern.dateformat}")
//    private String dateformat;

    @Autowired
    private PatternProperties patternProperties;

    @GetMapping("prop")
    public PatternProperties properties() {
        return patternProperties;
    }

    @GetMapping("now")
    public String now() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(patternProperties.getDateFormat()));
    }

    /**
     * 路径： /user/110
     *
     * @param id 用户id
     * @return 用户
     */
    @GetMapping("/{id}")
    public User queryById(@PathVariable("id") Long id, @RequestHeader(value = "Truth", required = false) String truth) {
        System.out.println("truth：" + truth);
        return userService.queryById(id);
    }
}
