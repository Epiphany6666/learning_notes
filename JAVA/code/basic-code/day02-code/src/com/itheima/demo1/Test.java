package com.itheima.demo1;

public class Test {
    public static void main(String[] args) {
        // 看到数组我就有一种浑身不舒服的感觉，看到数组我就忍不住来遍历它
        //在遍历数组前先打印 args.length
        System.out.println(args.length); // 打印的结果长度为0，因为默认情况下，这个数组中是没有数据的
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
