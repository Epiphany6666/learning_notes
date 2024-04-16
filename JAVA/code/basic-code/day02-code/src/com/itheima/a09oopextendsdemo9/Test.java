package com.itheima.a09oopextendsdemo9;


import org.openjdk.jol.info.ClassLayout;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "zhangsan";
        s.age = 23;

        // 可以把对象在内存中的结构打印出来
        ClassLayout layout = ClassLayout.parseInstance(s);
        System.out.println(layout.toPrintable());
    }
}