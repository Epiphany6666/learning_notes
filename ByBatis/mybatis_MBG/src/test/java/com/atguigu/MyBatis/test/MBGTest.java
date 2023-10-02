package com.atguigu.MyBatis.test;

import com.atguigu.mybatis.mapper.EmpMapper;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.pojo.EmpExample;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MBGTest {
    @Test
    public void testMBG() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        /*//查询所有数据
        List<Emp> list = mapper.selectByExample(null);
        list.forEach(emp ->  {
            System.out.println(emp);
        });*/

        /*//根据条件查询
        EmpExample empExample = new EmpExample();
        empExample.createCriteria().andEmpNameEqualTo("张三");
        List<Emp> list = mapper.selectByExample(empExample);
        list.forEach(emp ->  {
            System.out.println(emp);
        });*/
        mapper.updateByPrimaryKeySelective(new Emp(1, "zhan", 22, null, "343@qq.com", 3));
    }
}
