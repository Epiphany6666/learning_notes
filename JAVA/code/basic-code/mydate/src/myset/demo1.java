package myset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class demo1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("123");
        set.add("456");
        set.add("798");
        //迭代器
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
        }

        // 增强for
        for (String str : set) {
            System.out.println(str);
        }

        // Lambda表达式
        set.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        set.forEach(s -> System.out.println(s));
    }
}
