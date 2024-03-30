package com.itheima.arithmeticoperator;

public class ArithmeticOperatorDemo1 {
    public static void main(String[] args) {
        //+
        System.out.println(3 + 2);//5
        //-
        System.out.println(5 - 1);//4
        //* (小学中乘是×，但是在代码中是*，使用shift + 数字8可以敲出来)
        System.out.println(7 * 9);//63

        //如果在计算的时候有小数参与
        //结论：
        //在代码中，如果有小数参与计算，结果有可能不精确的。
        //为什么呢？
        //暂时只要知道这个结论就可以了。具体的原因，我们到了JavaSE的时候，会再详细的讲解。
        System.out.println(1.1 + 1.1);//2.2
        System.out.println(1.1 + 1.01);//2.1100000000000003
        System.out.println(1.1 - 1.01);
        System.out.println(1.1 * 1.01);
    }
}
