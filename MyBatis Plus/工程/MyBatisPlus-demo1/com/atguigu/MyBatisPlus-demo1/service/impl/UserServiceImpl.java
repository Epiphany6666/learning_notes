package com.atguigu.MyBatisPlus-demo1.service.impl;

import com.atguigu.MyBatisPlus-demo1.entity.User;
import com.atguigu.MyBatisPlus-demo1.mapper.UserMapper;
import com.atguigu.MyBatisPlus-demo1.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author atguigu
 * @since 2023-10-05
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
