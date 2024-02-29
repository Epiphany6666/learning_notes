package com.atguigu.api.statement.transaction;

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
        /**出现的问题：
         *      减钱的账户没钱时，会报异常
         *      但是加钱的账户却依旧正常加了，这是因为这两个操作处于两个事务中。
         *
         *  解决办法：变成同一个事务
         *   //一个事务的最基本要求，必须是同一个链接对象 connection
         */
        Class.forName("com.mysql.cj.jdbc.Driver");
        Properties info = new Properties();
        info.put("user", "root");
        info.put("password", "123456");
        Connection connection = DriverManager.getConnection("jdbc:mysql:///itcast", info);

        try {
            //开启事务
            connection.setAutoCommit(false);
            //执行数据库动作
            BankDao bankDao = new BankDao();
            bankDao.add(subAccount, money, connection);
            bankDao.sub(addAccount, money, connection);

            //事务提交
            connection.commit();
        } catch (Exception e) {
            //事务回滚
            connection.rollback();

            throw e;
        } finally {
            connection.close();
        }

    }

    @Test
    public void start() throws Exception {
        transfer("lvdandan", "ergouzi", 100);
    }
}
