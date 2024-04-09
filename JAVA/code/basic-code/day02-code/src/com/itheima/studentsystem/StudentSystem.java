package com.itheima.studentsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        while (true) {
            menu();
            System.out.println("请输入选择选项数字：");
            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();
            switch (option) {

            }
        }
    }
    public static void menu() {
        System.out.println("-------------欢迎来到黑马学生管理系统----------------");
        System.out.println("1：添加学生");
        System.out.println("2：删除学生");
        System.out.println("3：修改学生");
        System.out.println("4：查询学生");
        System.out.println("5：退出");
    }

    public static void add(ArrayList<Student> list, Student student) {
        if (contains(list, student.getId())) {
            System.out.println("添加失败，id不能重复");
        }
        list.add(student);
    }

    private static boolean contains(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return false;
            }
        }
        return true;
    }
}
