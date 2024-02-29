package com.atguigu.api.statement.tansactionNew;

import com.atguigu.api.statement.utils.JdbcUtils;
import com.atguigu.api.statement.utils.JdbcUtilsV2;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class BankDao {
    /**
     * 加钱的数据库操作方法（jdbc）
     * @param account 加钱的账号
     * @param money 加钱的金额
     */
    public void add(String account, int money) throws Exception {
        Connection connection = JdbcUtilsV2.getConnection();

//        String sql = "update t_bank set money = money - money where account = account;";
        //可恶！忘记了后面要给？赋值
        String sql = "update t_bank set money = money + ? where account = ?;";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setObject(1, money);
        preparedStatement.setObject(2, account);
        preparedStatement.executeUpdate();

        preparedStatement.close();
        System.out.println("加钱成功");
    }

    /**
     * 减钱的数据库操作方法（jdbc）
     * @param account 减钱的账号
     * @param money 减钱的金额
     */
    public void sub(String account, int money) throws Exception {
        Connection connection = JdbcUtilsV2.getConnection();

        String sql = "update t_bank set money = money - ? where account = ?;";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setObject(1, money);
        preparedStatement.setObject(2, account);
        preparedStatement.executeUpdate();


        preparedStatement.close();
        System.out.println("减钱成功");
    }
}
