package myfunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌,15", "周芷若,14", "赵敏,13", "张强,20", "张三丰,100", "张翠山,40", "张良,35", "王二麻子,37", "谢广坤,41");
        Student[] students = list.stream().map(Student::new).toArray(Student[]::new);
        System.out.println(students.toString());
    }
}
