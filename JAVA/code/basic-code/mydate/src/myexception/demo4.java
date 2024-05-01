package myexception;

import myfunction.Student;

import java.util.Scanner;

public class demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GirlFriend girlFriend = new GirlFriend();
        while (true) {
            try {
                girlFriend.setName(sc.nextLine());
                girlFriend.setAge(Integer.parseInt(sc.nextLine()));
                break;
            } catch (NumberFormatException e) {
                System.out.println("年龄的格式有误，请输入数字");
            } catch (RuntimeException e) {
                System.out.println("姓名的长度或者年龄的范围有误");
            }
        }
    }
}
