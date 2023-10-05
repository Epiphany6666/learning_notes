package com.atguigu.mybatisplus.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_user")
public class User {
    @TableId
    private Long id;

    private String name;

    private Integer age;

    private String email;

    private Integer isDeleted;

    private Integer sex;
}
