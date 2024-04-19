package com.itheima.ui;
import javax.swing.*;

public class LoginJFrame extends JFrame {
    //LoginJFrame 表示登录界面
    //以后所有跟登录相关的代码，都写在这里
    public LoginJFrame(){
        // 设置界面的宽高
        this.setSize(488, 430);
        // 设置界面的标题
        this.setTitle("拼图 登录");
        // 设置界面置顶，setAlwaysOnTop：一直处在最上方
        // ctrl + p：可以看见需要传入一个boolean类型的参数，传入true之后，它会盖住所有的软件
        this.setAlwaysOnTop(true);
        // 设置界面居中
        this.setLocationRelativeTo(null);
        // 设置关闭模式，setDefaultCloseOperation：设置默认的关闭方式
        // 括号中写的数字3
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // 让界面显示出来，这行代码我们建议写在最后
        this.setVisible(true);
    }
}




