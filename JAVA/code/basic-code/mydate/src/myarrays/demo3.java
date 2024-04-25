package myarrays;

import java.util.Arrays;

public class demo3 {
    public static void main(String[] args) {
        method(
                () -> {
                System.out.println("正在游泳");
            }
        );
    }

    public static void method(Swim s){
        s.swimming();
    }
}

@FunctionalInterface
interface Swim{
    public abstract void swimming();
}