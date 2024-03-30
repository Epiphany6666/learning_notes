package com.itheima.arithmeticoperator;

import java.util.Scanner;

public class ArithmeticOperatorDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int num = sc.nextInt();
        int a = num % 10;
        int b = num / 10 % 10;
        int c = num / 100 % 10;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
