//package com.itheima.studentsystem;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class StudentSystem {
//    public static void main(String[] args) {
//        ArrayList<Student> list = new ArrayList<>();
//        while (true) {
//            menu();
//            System.out.println("请输入选择选项数字：");
//            Scanner sc = new Scanner(System.in);
//            int option = sc.nextInt();
//            switch (option) {
//                case "1" -> add(list);
//            }
//        }
//    }
//    public static void menu() {
//        System.out.println("-------------欢迎来到黑马学生管理系统----------------");
//        System.out.println("1：添加学生");
//        System.out.println("2：删除学生");
//        System.out.println("3：修改学生");
//        System.out.println("4：查询学生");
//        System.out.println("5：退出");
//    }
//
//    public static void add(ArrayList<Student> list) {
//        Student student = new Student();
//        if (contains(list, student.getId())) {
//            System.out.println("添加失败，id不能重复");
//        }
//        list.add(student);
//    }
//
//    private static boolean contains(ArrayList<Student> list, String id) {
//        return getIndexById(list, id) >= 0;
//    }
//
//    /**
//     * 根据id查询索引
//     * @param list
//     * @param id
//     * @return
//     */
//    private static int getIndexById(ArrayList<Student> list, String id) {
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).equals(id)) {
//                return i;
//            }
//        }
//        return -1;
//    }
//
//    private static void update(ArrayList<Student> list, String id) {
//        if (!contains(list, id)) {
//            System.out.println("id不存在");
//            return;
//        }
//        Scanner sc = new Scanner(System.in);
//        System.out.println();
//        System.out.println("修改成功");
//    }
//
//    private static void allStudent(ArrayList<Student> list) {
//        if (list.size() == 0) {
//            System.out.println("当前无学生信息");
//            return;
//        }
//        System.out.println("id\t姓名\t年龄\t家庭住址");
//    }
//}
