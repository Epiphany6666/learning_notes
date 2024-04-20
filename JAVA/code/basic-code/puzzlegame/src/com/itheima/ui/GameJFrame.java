package com.itheima.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.util.StringJoiner;

public class GameJFrame extends JFrame implements KeyListener {
    //规定：GameJFrame这个界面表示的就是游戏的主界面
    //以后跟游戏相关的所有逻辑都写在这个类中

    // 创建一个二维数组
    // 目的：用来管理数据。加载图片的时候，会根据二维数组中的数据进行加载。
    int[][] data = new int[4][4];

    // 记录空白方块在二维数组中的位置
    int x = 0;
    int y = 0;

    // 定义一个变量，记录当前展示图片的路径
    String path = "puzzlegame\\image\\animal\\animal3\\";

    // 定义一个二维数组，用来存储正确的数据
    int[][] win = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };

    public GameJFrame() {
        super();
        // 初始化界面
        initJFrame();

        // 初始化菜单
        initJMenuBar();

        // 初始化数据（其实就是打乱图片）
        initData();

        // 初始化图片（根据打乱之后的结果去加载图片）
        initImage();

        // 让界面显示出来，这行代码我们建议写在最后
        this.setVisible(true);
    }


    // 初始化数据（打乱）
    private void initData() {
        //1.定义一个一维数组
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        //2.打乱数组中的数据的顺序
        //遍历数组，得到每一个元素，拿着每一个元素跟随机索引上的数据进行交换
        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            //获取到随机索引
            int index = r.nextInt(tempArr.length);
            //拿着遍历到的每一个数据，跟随机索引上的数据进行交换
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }


        //5.给二维数组添加数据
        //遍历一维数组tempArr得到每一个元素，把每一个元素依次添加到二维数组当中
        for (int i = 0; i < tempArr.length; i++) {
            if (tempArr[i] == 0) {
                x = i / 4;
                y = i % 4;
            } else { // 如果你不为 `0`，我才把数字添加到二维数组中
                data[i / 4][i % 4] = tempArr[i];
            }
        }
    }


    // 初始化图片
    // 添加图片的时候，就需要按照二维数组中管理的数据添加图片
    private void initImage() {
        // 情况原本已经出现的所有图片
        this.getContentPane().removeAll();

        //外循环 --- 把内循环重复执行了4次。
        for (int i = 0; i < 4; i++) {
            //内循环 --- 表示在一行添加4张图片
            for (int j = 0; j < 4; j++) {
                // 获取当前要加载图片的序号
                int num = data[i][j];
                // 创建一个 JLabel对象（管理容器）
                JLabel jLabel = new JLabel(new ImageIcon(path + num + ".jpg"));
                // 指定图片的位置，调用方法：setBounds
                jLabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);
                // 给图片添加边框
                jLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));
                // 把管理容器添加到界面中，调用JFrame的add方法
                this.getContentPane().add(jLabel);
            }
        }
        // 添加背景图片
        JLabel background = new JLabel(new ImageIcon("puzzlegame\\image\\background.png"));
        background.setBounds(40, 40, 508, 560);
        // 把背景图片添加到界面当中
        this.getContentPane().add(background);

        // 刷新一下界面
        this.getContentPane().repaint();
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

        // 取消默认的居中方式，只有取消了，才会安装xy轴的形式添加组件
        this.setLayout(null);

        // 给整个界面添加键盘监听事件
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    // 按下不松时会调用这个方法
    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == 65) {
            // 把界面中所有的图片全部删除
            this.getContentPane().removeAll();
            // 加载第一张完整的图片
            JLabel all = new JLabel(new ImageIcon(path + "all.jpg"));
            all.setBounds(83, 134, 420, 420);
            this.getContentPane().add(all);

            // 添加背景图片
            JLabel background = new JLabel(new ImageIcon("puzzlegame\\image\\background.png"));
            background.setBounds(40, 40, 508, 560);
            // 把背景图片添加到界面当中
            this.getContentPane().add(background);
            // 刷新界面
            this.getContentPane().repaint();
        }
    }

    //松开按键的时候会调用这个方法
    @Override
    public void keyReleased(KeyEvent e) {
        //对上，下，左，右进行判断
        //左：37 上：38 右：39 下：40
        int code = e.getKeyCode();
        System.out.println(code);
        if (code == 37) {
            System.out.println("向左移动");
            if (y == 3) {
                return;
            }
            //逻辑：
            //把空白方块右方的数字往左移动
            data[x][y] = data[x][y + 1];
            data[x][y + 1] = 0;
            y++;
            //调用方法按照最新的数字加载图片
            initImage();
        } else if (code == 38) {
            System.out.println("向上移动");
            if (x == 3) {
                //表示空白方块已经在最下方了，他的下面没有图片再能移动了
                return;
            }
            //逻辑：
            //把空白方块下方的数字往上移动
            //x，y  表示空白方块
            //x + 1， y 表示空白方块下方的数字
            //把空白方块下方的数字赋值给空白方块
            data[x][y] = data[x + 1][y];
            data[x + 1][y] = 0;
            x++;
            //调用方法按照最新的数字加载图片
            initImage();
        } else if (code == 39) {
            System.out.println("向右移动");
            if (y == 0) {
                return;
            }
            //逻辑：
            //把空白方块左方的数字往右移动
            data[x][y] = data[x][y - 1];
            data[x][y - 1] = 0;
            y--;
            //调用方法按照最新的数字加载图片
            initImage();
        } else if (code == 40) {
            System.out.println("向下移动");
            if (x == 0) {
                return;
            }
            //逻辑：
            //把空白方块上方的数字往下移动
            data[x][y] = data[x - 1][y];
            data[x - 1][y] = 0;
            x--;
            //调用方法按照最新的数字加载图片
            initImage();
        } else if (code == 65) {
            initImage();
        } else if (code == 87) {
            data = new int[][]{
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 0}
            };
            initImage();
        }
    }

    //判断data数组中的数据是否跟win数组中相同
    //如果全部相同，返回true。否则返回false
    public boolean victory(){
        for (int i = 0; i < data.length; i++) {
            //i : 依次表示二维数组 data里面的索引
            //data[i]：依次表示每一个一维数组
            for (int j = 0; j < data[i].length; j++) {
                if(data[i][j] != win[i][j]){
                    //只要有一个数据不一样，则返回false
                    return false;
                }
            }
        }
        //循环结束表示数组遍历比较完毕，全都一样返回true
        return true;
    }
}



