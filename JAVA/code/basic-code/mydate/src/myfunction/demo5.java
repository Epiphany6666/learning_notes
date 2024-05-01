package myfunction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.IntFunction;

public class demo5 {
    public static void main(String[] args) {
        //1.创建集合并添加元素
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5);
        Integer[] array = list.stream().toArray(Integer[]::new);


        list.stream().toArray(new IntFunction<Integer[]>() {
            @Override
            public Integer[] apply(int value) {
                return new Integer[0];
            }
        });
    }
}
