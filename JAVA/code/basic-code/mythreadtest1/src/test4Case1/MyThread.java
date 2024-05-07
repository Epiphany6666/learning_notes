package test4Case1;

import java.util.Random;

public class MyThread extends Thread {
    static int money = 100;
    static int count = 3;

    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        synchronized (MyThread.class) {
            if (count == 0) return;
            if (count == 1) System.out.println(getName() + "抢到了" + money + "元");
            Random r = new Random();
            int m = r.nextInt(100) + 1;
            System.out.println(getName() + "抢到了" + m + "元");
            money -= m;
        }
    }
}
