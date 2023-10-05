package com.atguigu.mybatisplusdemo1.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.OptimisticLockerInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//有了配置类之后，建议直接添加到配置类上
@MapperScan("com.atguigu.mybatisplusdemo1.mapper")
public class MyBatisPlusConfig {
    @Bean
    //之所以叫做Interceptor拦截器，是因为先写了查询功能，然后它会对我们的查询功能进行拦截，然后在我们实现功能的基础上进行一些额外的操作，以达到最终的功能
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        //需要在插件对象中添加一个内部插件
        //由于不同的数据库实现的分页功能是不一样的，所以需要在这里设置数据库的类型
        //添加分页插件
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
        //添加乐观锁插件
        interceptor.addInnerInterceptor(new OptimisticLockerInnerInterceptor());
        return interceptor;
    }
}
