package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SelectMapper {
    /**
     * 根据id查询用户信息
     * 以后建议就把参数传过来的只当做两种情况：
     * 1.实体类
     * 2.加@Param的情况
     */
    List<User> getUserById(@Param("id") Integer id);

    /**
     * 查询所有的用户信息
     */
    List<User> getAllUser();

    /**
     * 查询用户信息的总记录数
     */
    Integer getCount();

    /**
     * 根据id查询用户信息为一个map集合
     */
    Map<String, Object> getUserByIdToMap(@Param("id") Integer id);

    /**
     * 查询所有用户信息为map集合
     */
    /**
     *	查询所有用户信息为map集合
     *	@return
     *	将表中的数据以map集合的方式查询，一条数据对应一个map；若有多条数据，就会产生多个map集合，并且最终要以一个map的方式返回数据。
     *	此时需要通过@MapKey注解设置map集合的键，值是每条数据所对应的map集合.
     * @MapKey：设置当前map集合的键，把当前查询出来的某一个数据的某一个字段作为键，把查询出来的每一条数据转化为的map集合作为值
     */
    @MapKey("id")//由于键重复会把值覆盖掉，所以想要把查询出来的数据全部获取到，那一定要找一个唯一的字段来作为键
    Map<String, Object> getAllUserToMap();
}
