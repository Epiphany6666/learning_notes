package com.atguigu.mybatisplusdemo1.service.impl;

import com.atguigu.mybatisplusdemo1.mapper.UserMapper;
import com.atguigu.mybatisplusdemo1.pojo.User;
import com.atguigu.mybatisplusdemo1.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
