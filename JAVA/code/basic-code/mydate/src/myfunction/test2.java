package myfunction;

import java.util.ArrayList;
import java.util.Arrays;

public class test2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("zhangsan",23));
        list.add(new Student("lisi",24));
        list.add(new Student("wangwu",25));
        String[] array = list.stream().map(Student::getName).toArray(String[]::new);
        System.out.println(Arrays.toString(array));
    }

    public String toStudent(Student s) {
        return s.getName();
    }
}
