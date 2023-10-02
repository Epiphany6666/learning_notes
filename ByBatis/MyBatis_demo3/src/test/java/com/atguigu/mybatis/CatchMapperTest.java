package com.atguigu.mybatis;

import com.atguigu.mybatis.mapper.CatchMapper;
import com.atguigu.mybatis.pojo.Emp;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class CatchMapperTest {
    @Test
    public void testOneCache() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession1 = sqlSessionFactory.openSession(true);
        CatchMapper mapper1 = sqlSession1.getMapper(CatchMapper.class);
        Emp emp1 = mapper1.getEmpByEid(1);
        System.out.println(emp1);
        //mapper1.insertEmp(new Emp(null, "abs", 23, "男", "123@qq.com"));
        sqlSession1.clearCache();
        Emp emp2 = mapper1.getEmpByEid(1);
        System.out.println(emp2);

        /*SqlSession sqlSession2 = sqlSessionFactory.openSession(true);
        CatchMapper mapper2 = sqlSession2.getMapper(CatchMapper.class);
        Emp emp2 = mapper2.getEmpByEid(1);
        System.out.println(emp2);*/
    }

    @Test
    public void testTwoCache() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory1 = sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession1 = sqlSessionFactory1.openSession(true);
        SqlSession sqlSession2 = sqlSessionFactory1.openSession(true);
        CatchMapper mapper1 = sqlSession1.getMapper(CatchMapper.class);
        System.out.println(mapper1.getEmpByEid(1));
        sqlSession1.close();
        CatchMapper mapper2 = sqlSession2.getMapper(CatchMapper.class);
        System.out.println(mapper2.getEmpByEid(1));
        sqlSession2.close();
    }
}
