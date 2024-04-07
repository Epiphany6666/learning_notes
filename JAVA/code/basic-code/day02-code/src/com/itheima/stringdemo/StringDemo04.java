package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo04 {
    /**
     * 需求：以字符串的形式从键盘接受一个手机号，将中间四位号码屏蔽
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phone;
        while (true) {
            System.out.println("请输入一串手机号");
            phone = sc.next();
            if (phone.length() == 11) {
                break;
            } else {
                System.out.println("请输入11位手机号");
            }
        }

        String result = "";
        for (int i = 0; i < phone.length(); i++) {
            if (i >= 3 && i <= (3 + 4)) {
                result += "*";
            } else {
                result += phone.charAt(i);
            }
        }
        System.out.println(result);
    }
}
