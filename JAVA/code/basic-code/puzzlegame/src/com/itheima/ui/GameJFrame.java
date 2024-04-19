package com.itheima.ui;

import javax.swing.*;

public class GameJFrame extends JFrame {
    //规定：GameJFrame这个界面表示的就是游戏的主界面
    //以后跟游戏相关的所有逻辑都写在这个类中
    public GameJFrame() {
        // 初始化界面
        initJFrame();

        // 初始化菜单
        initJMenuBar();

        // 让界面显示出来，这行代码我们建议写在最后
        this.setVisible(true);
    }



    private void initJMenuBar() {
        // 1.创建整个菜单对象 JMenuBar
        JMenuBar jMenuBar = new JMenuBar();

        // 2.创建菜单上面两个选项的对象（功能、关于我们） JMenu
        JMenu functionJMenu = new JMenu("功能"); // 将要展示的文字放在小括号中，表示调用它的有参构造。
        // 快捷键 ctrl + d ：向下复制一行
        JMenu aboutJMenu = new JMenu("关于我们");

        // 3.创建选项下面的条目对象（功能：重新游戏、重新登陆、关闭游戏；关于我们：公众号），合起来一共四个 JMenuItem 对象
        JMenuItem replayItem = new JMenuItem("重新游戏"); // 同样也是调用它的有参构造设置展示文字
        // 快捷键 ctrl + d ：向下复制一行
        JMenuItem reLoginItem = new JMenuItem("重新登录");
        JMenuItem closeItem = new JMenuItem("关闭游戏");

        // 由于前三个是一组，最后一个公众号是一组，因此我们在写代码的时候打一个空行，提高阅读性
        JMenuItem accountItem = new JMenuItem("公众号");

        // 4.将每一个选项下面的条目添加到选项中：调用JMenu对象的add方法
        functionJMenu.add(replayItem);
        // 快捷键 ctrl + d ：向下复制一行
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);

        // 5.将菜单里面的两个选项添加到菜单当中：调用JMenuBar对象的add方法
        jMenuBar.add(functionJMenu);
        // 快捷键 ctrl + d ：向下复制一行
        jMenuBar.add(aboutJMenu);

        // 6.把整个菜单 `JMenuBar` 添加到 `JFrame` 界面中
        // this 表示当前的界面对象，调用 setJMenuBar 方法
        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        // 设置界面的宽高
        this.setSize(603, 680);
        // 设置界面的标题
        this.setTitle("拼图单机版 v1.0");
        // 设置界面置顶，setAlwaysOnTop：一直处在最上方
        // ctrl + p：可以看见需要传入一个boolean类型的参数，传入true之后，它会盖住所有的软件
        this.setAlwaysOnTop(true);
        // 设置界面居中
        this.setLocationRelativeTo(null);
        // 设置关闭模式，setDefaultCloseOperation：设置默认的关闭方式
        // 括号中写的数字3
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}



