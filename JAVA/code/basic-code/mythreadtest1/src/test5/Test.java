package test5;

public class Test {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("抽奖箱1");
        MyThread t2 = new MyThread("抽奖箱2");

        t1.start();
        t2.start();
    }
}
