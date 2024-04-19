package com.itheima.ui;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        //1.创建一个游戏的主界面
        JFrame gameJframe = new JFrame();
        gameJframe.setSize(603, 680);
        gameJframe.setVisible(true);

        //2.创建一个登录界面
        JFrame loginJframe = new JFrame();
        loginJframe.setSize(488, 430);
        loginJframe.setVisible(true);

        //3.创建一个注册界面
        JFrame registerJframe = new JFrame();
        //因为注册界面输入的东西要多一点，因此界面也更长一些
        registerJframe.setSize(488, 500);
        registerJframe.setVisible(true);
    }
}
