package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.UserMapper;
import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisTest {
    @Test
    public void testMyBatis() throws IOException {
        //加载核心配置文件
        //需要用到Resources类（org.apache.ibatis.io包中的）。
        //其中有个静态方法：getResourceAsStream()，用来获取所对应的字节输入流。
        //里面写的是核心配置文件的名字
        //由于它是跟流相关，所以需要处理异常，直接声明出去即可
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        //获取sqlSessionFactoryBuilder对象，是我们提供sqlSession工厂的一个构建对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //获取sqlSessionFactory的一个工厂对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        //由于java中的类是见名识义的，它既然以Factory为后缀，那它必定是一个工厂类，所以它用到的就是工厂模式，将我们创建一个对象的过程进行一个封装，直接来提供我们当前的一个对象
        //获取MyBatis操作数据库的一个会话对象，叫做：sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //sqlSession：代表Java程序和数据库之间的会话。（HttpSession是Java程序和浏览器之间的会话）
        //此时我们就可以通过sqlSession来操作MyBatis中的功能
        //MyBatis可以面向接口编程，调用Mapper接口中的方法，然后它就会自动去匹配一个sql语句来进行执行
        //所以说我们现在的目标就是要获取mapper接口的对象
        //接口想要创建对象，就必须要有实现类，但我们现在没有
        //通过sqlSession中的一个方法getMapepr(Class<T> var1)，里面传递的是一个类型的class对象，类型的泛型是T，返回值是T对象
        //即当我们传进去一个类型的class对象后，这个方法可以帮助我们获取这个类型的实例化对象
        //换句话说，在我们getMapper方法的底层，它会去创建一个UserMapper接口的实现类，并且返回这个实现类的对象
        //底层用的就是一个代理模式
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //测试功能
        //此时它就会根据mapper接口找到映射文件，然后根据调用的方法，去找到当前的sql语句
        int result = mapper.insertUser();
        //提交事务
//        sqlSession.commit();
        System.out.println("result：" + result);
        mapper.updateUser();
        mapper.deleteUser();
        System.out.println(mapper.getUserById());
    }

    @Test
    public void testUpdate() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.updateUser();
    }

    @Test
    public void testDelete() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.deleteUser();
    }

    @Test
    public void testSelect() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById();
        System.out.println(user);
    }

    @Test
    public void testSelectAllUser() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> list = mapper.getAllUser();
//        System.out.println(allUser);
        list.forEach(user -> System.out.println(user));
    }
}
