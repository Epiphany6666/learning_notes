package test5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MyThread extends Thread {
    static ArrayList<Integer> list = new ArrayList<>();

    static {
        Collections.addAll(list, 10, 5, 20, 50, 100, 200, 500, 800, 2, 80, 300, 700);
    }

    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            synchronized (MyThread.class) {
                if (list.size() == 0) break;
                Random r = new Random();
                int i = r.nextInt(list.size());
                System.out.println(getName() + "又产生了一个" + list.remove(i) + "元大奖");
            }
        }
    }
}
