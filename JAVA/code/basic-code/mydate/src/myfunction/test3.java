package myfunction;

import java.util.ArrayList;

public class test3 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("zhangsan",23));
        list.add(new Student("lisi",24));
        list.add(new Student("wangwu",25));

        list.stream().map(new test3()::a).toArray(String[]::new);
    }

    public String a(Student student) {
        return student.getName() + "-" + student.getAge();
    }
}
