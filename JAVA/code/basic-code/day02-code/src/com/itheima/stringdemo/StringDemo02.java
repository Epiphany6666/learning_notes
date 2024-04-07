package com.itheima.stringdemo;

public class StringDemo02 {
    public static void main(String[] args) {
        System.out.println(reverse("abc"));
    }
    /**
     * 定义一个方法，实现字符串反转。键盘录入一个字符串，调用该方法后，在控制台输出结果。例如，键盘录入 abc，输出结果 cba
     */
    public static String reverse(String str) {
        char[] cs = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            cs[str.length() - i - 1] = c;
        }
        return new String(cs);
    }
}
