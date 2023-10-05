package com.atguigu.mybatisplusdemo1.pojo;

import com.atguigu.mybatisplusdemo1.enums.SexEnum;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
@AllArgsConstructor
@NoArgsConstructor
//@TableName("t_user")
public class User {
    //由于之前创建表的类型的时候是bigint类型，所以这里用long
    @TableId(value="id")
    private Long id;

    private String name;

    private Integer age;

    private String email;

    private SexEnum sex;

    @TableLogic
    private Integer isDeleted;
}
