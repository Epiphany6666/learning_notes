package myfunction;

import java.util.ArrayList;
import java.util.Collections;

public class demo4 {
    public static void main(String[] args) {
        //1.创建集合对象
        ArrayList<String> list = new ArrayList<>();
        //2.添加数据
        Collections.addAll(list, "aaa", "bbb", "ccc", "ddd");
        list.stream().map(String::toUpperCase).forEach(s -> System.out.println(s));
    }
}
