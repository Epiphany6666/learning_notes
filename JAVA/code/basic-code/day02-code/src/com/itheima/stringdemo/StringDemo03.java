package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo03 {
    /**
     * 案例需求：把 `2135` 变成：`零佰零拾零万贰仟壹佰叁拾伍元`。把 `789` 变成：`零佰零拾零万零仟柒佰捌拾玖元`。
     */
    public static void main(String[] args) {
        String[] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入需要转换的数字：");
        int num = sc.nextInt();

        // 1.将整数转为大写
        String numToUpper = "";
        while (num > 0) {
            int idx = num % 10;
            numToUpper = arr[idx] + numToUpper;
            num /= 10;
        }

//        System.out.println(numToUpper);
        // 2.添加上零补齐7位
        for (int i = 0; i < (7 - numToUpper.length()); i++) {
            numToUpper = "零" + numToUpper;
        }

        String result = "";
        String[] arr2 = {"佰","拾","万","仟","佰","拾","元"};
        // 3.加上单位
        for (int i = 0; i < numToUpper.length(); i++) {
            result = result + numToUpper.charAt(i) + arr2[i];
        }
        System.out.println(result);
    }
}

