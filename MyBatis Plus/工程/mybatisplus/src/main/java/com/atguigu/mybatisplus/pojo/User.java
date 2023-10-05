package com.atguigu.mybatisplus.pojo;

import lombok.*;

/*
//创建无参构造
@NoArgsConstructor
//创建所有参数的有参构造
@AllArgsConstructor
//设置get方法
@Getter
//设置Set方法
@Setter
//重写equals和hashCode方法
@EqualsAndHashCode
*/

//以上所有的注解都可以通过@Data注解来代替
@Data
public class User {
    //由于之前创建表的类型的时候是bigint类型，所以这里用long
    private Long id;

    private String name;

    private Integer age;

    private String email;
}
