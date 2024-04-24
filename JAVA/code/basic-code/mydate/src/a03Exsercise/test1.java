package a03Exsercise;

import java.util.ArrayList;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        while (sum < 200) {
            String str = sc.nextLine();
            int i = Integer.parseInt(str);
            sum += i;
            list.add(i);
        }
    }
}
