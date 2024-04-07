package com.itheima.stringdemo;

public class StringDemo01 {
    /**
     * 定义一个方法，把 int 数组中的数据按照指定的格式拼接成一个字符串返回，调用该方法，
     * 并在控制台输出结果。例如，数组为 int[] arr = {1,2,3}; ，执行方法后的输出结果为：[1, 2, 3]
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        String ans = splace(arr);
        System.out.printf("字符串为：%s", ans);
;    }

    private static String splace(int[] arr) {
        if(arr == null){
            return "";
        }

        if(arr.length == 0){
            return "[]";
        }

        String result = "[";
        //当代码执行到这里表示什么？
        //表示数组不是null，也不是长度为0的
        for (int i = 0; i < arr.length; i++) {
            //i表示的是索引，arr[i]表示的是元素
            result = result + arr[i];
            if (i != arr.length - 1) {
                result += ", ";
            }
        }
        //此时拼接右括号
        result = result + "]";
        return result;
    }
}
