package myfunction;

import java.util.ArrayList;
import java.util.Collections;

public class demo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌","周芷若","赵敏","张强","张三丰");

//        list.stream()
//                .filter(stringJudge)
//                .forEach(s -> System.out.println(s));
    }

    public boolean stringJudge(String s) {
        return s.startsWith("张") && s.length() == 3;
    }
}
