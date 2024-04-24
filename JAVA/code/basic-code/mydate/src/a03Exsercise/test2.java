package a03Exsercise;

import java.util.ArrayList;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out:while (true) {
            String s = sc.nextLine();
            if (s.length() > 10 || s.startsWith("0")) {
                continue;
            }
            int len = s.length();
            int[] arr = new int[len];
            for (int i = 0; i < s.toCharArray().length; i++) {
                if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                    continue out;
                }
                arr[i] = (s.charAt(i) - '0');
            }
            int i = 0;
            for (int j : arr) {
                i = (i * 10 + j);
            }
            System.out.println(i);
        }
    }
}
