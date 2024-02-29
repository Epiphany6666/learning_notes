package com.atguigu.api.statement.tansactionNew;

import com.atguigu.api.statement.utils.JdbcUtilsV2;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * 银行卡业务方法，调用Dao方法
 */
public class BankService {
    /**
     * TODO:
     *  事务添加是在业务方法中，利用try catch 代码块，开启事务和提交事务，和事务回滚！
     *  将connection传入dao层即可！dao只负责使用，不要close()!
     *
     *
     * @param addAccount
     * @param subAccount
     * @param money
     * @throws Exception
     */
    public void transfer(String addAccount, String subAccount, int money) throws Exception {
        BankDao bankDao = new BankDao();

        Connection connection = JdbcUtilsV2.getConnection();

        try {
            //开启事务
            connection.setAutoCommit(false);
            //执行数据库动作
            bankDao.add(subAccount, money);
            bankDao.sub(addAccount, money);

            //事务提交
            connection.commit();
        } catch (Exception e) {
            //事务回滚
            connection.rollback();

            throw e;
        } finally {
//            connection.close();
            JdbcUtilsV2.freeConnection();
        }

    }

    @Test
    public void start() throws Exception {
        transfer("lvdandan", "ergouzi", 100);
    }
}
