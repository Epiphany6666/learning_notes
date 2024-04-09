package com.itheima.stringbuilderdemo;

public class Test4 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        // 容量：最多装多少
        // 长度：已经装了多少
        System.out.println(sb.capacity()); // 16
        System.out.println(sb.length()); // 0

        sb.append("abcdefghizklmnopqrstuvwsyz0123456789"); // 26 个英文字母
        System.out.println(sb.capacity()); // 36
        System.out.println(sb.length()); // 36
    }
}
