package myiotest2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("myiotest\\src\\myiotest2\\userinfo.txt"));
        String line = br.readLine();
        System.out.println(line);
        String[] userInfo = line.split("&");
        String[] arr1 = userInfo[0].split("=");
        String[] arr2 = userInfo[1].split("=");
        String[] arr3 = userInfo[2].split("=");

        int count = Integer.parseInt(arr3[1]);
        count++;

        if (count > 3) {
            System.out.println("对不起，账号已被锁定");
        }

        String rightUsername = arr1[1];
        String rightPassword = arr2[1];

        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        String password = sc.nextLine();


        if (rightUsername.equals(username) && rightPassword.equals(password)) {
            System.out.println("登录成功");
        } else if (count == 3) {
            System.out.println("登录失败，账号被锁定");
        } else {
            System.out.println("登录失败");
        }
    }
}
