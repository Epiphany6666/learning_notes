package com.itheima.Test;

import java.util.Random;
import java.util.StringJoiner;

public class Test {
    public static void main(String[] args) {
        int[] tempArr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        Random random = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            int r = random.nextInt(tempArr.length);
            int tmp = tempArr[i];
            tempArr[i] = tempArr[r];
            tempArr[r] = tmp;
        }
        StringJoiner sj = new StringJoiner(",", "[", "]");
        for (int i = 0; i < tempArr.length; i++) {
            sj.add(tempArr[i] + "");
        }
        System.out.println(sj);

        int[][] data = new int[4][4];
        for (int i = 0; i < tempArr.length; i++) {
            data[i / 4][i % 4] = tempArr[i];
        }

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}
