package com.atguigu.mybatisplusdemo1.mapper;

import com.atguigu.mybatisplusdemo1.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface UserMapper extends BaseMapper<User> {
    /**
     * 根据id查询用户信息为map集合
     * @param id
     * @return
     */
    Map<String, Object> selectMapById(@Param("id") Long id);

    /**
     * 根据年龄查询用户信息并分页
     * @param page：MyBatis-Plus所提供的分页对象，必须位于第一个参数的位置
     *            在自己的sql语句中，实现分页功能，则这个方法的第一个参数就必须是这个page对象！
     * @param age
     * @return
     */
    Page<User> selectPageVo(@Param("page") Page<User> page, @Param("age") Integer age);
}
