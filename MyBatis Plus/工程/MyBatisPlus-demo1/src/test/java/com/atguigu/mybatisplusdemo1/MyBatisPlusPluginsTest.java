package com.atguigu.mybatisplusdemo1;

import com.atguigu.mybatisplusdemo1.mapper.ProductMapper;
import com.atguigu.mybatisplusdemo1.mapper.UserMapper;
import com.atguigu.mybatisplusdemo1.pojo.Product;
import com.atguigu.mybatisplusdemo1.pojo.User;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MyBatisPlusPluginsTest {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private ProductMapper productMapper;

    @Test
    public void testPage() {
        Page<User> page = new Page<>(1, 3);
        userMapper.selectPage(page, null);
        System.out.println("获取当前页的数据：" + page.getRecords());
        System.out.println("获取当前页的页面：" + page.getCurrent());
        System.out.println("获取当前页显示的条数：" + page.getSize());
        System.out.println("获取总页数：" + page.getPages());
        System.out.println("获取总记录数：" + page.getTotal());
        System.out.println("获取有没有下一页：" + page.hasNext());
        System.out.println("判断是否有上一页：" + page.hasPrevious());
    }

    @Test
    public void testPageVo() {
        Page<User> page = new Page<>(1, 3);
        userMapper.selectPageVo(page, 20);
        //查询出来的数据同样是封装在page里面的
        System.out.println("获取当前页的数据：" + page.getRecords());
        System.out.println("获取当前页的页面：" + page.getCurrent());
        System.out.println("获取当前页显示的条数：" + page.getSize());
        System.out.println("获取总页数：" + page.getPages());
        System.out.println("获取总记录数：" + page.getTotal());
        System.out.println("获取有没有下一页：" + page.hasNext());
        System.out.println("判断是否有上一页：" + page.hasPrevious());
    }

    @Test
    public void testProduct01() {
        //小李查询商品价格
        Product productLi = productMapper.selectById(1);
        System.out.println("小李查询的商品价格：" + productLi.getPrice());
        //小王查询商品价格
        Product productWang = productMapper.selectById(1);
        System.out.println("小李查询的商品价格：" + productWang.getPrice());
        //小李将价格+50
        productLi.setPrice(productLi.getPrice() + 50);
        productMapper.updateById(productLi);
        //小王将商品价格-30
        productWang.setPrice(productWang.getPrice() - 30);
        int result = productMapper.updateById(productWang);
        /**修改的地方
        if (result == 0) {
            //操作失败，重试
            //小王查询商品价格
            Product productNew = productMapper.selectById(1);
            productNew.setPrice(productNew.getPrice() - 30);
            productMapper.updateById(productNew);
        }
        **/

        Product productLaoban = productMapper.selectById(1);
        System.out.println("老板查询的商品价格：" + productLaoban.getPrice());
    }


}
