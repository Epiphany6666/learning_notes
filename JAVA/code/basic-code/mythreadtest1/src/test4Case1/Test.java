package test4Case1;

public class Test {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("小明");
        MyThread t2 = new MyThread("小红");
        MyThread t3 = new MyThread("小方");

        t1.start();
        t2.start();
        t3.start();
    }
}
