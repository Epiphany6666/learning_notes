package myarrays;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Comparator;

public class demo1 {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.binarySearch(arr, 10)); // 9
//        System.out.println(Arrays.binarySearch(arr, 2)); // 1
//        System.out.println(Arrays.binarySearch(arr, 20)); // -11
//        int[] newArr1 = Arrays.copyOf(arr, 10);
//        System.out.println(Arrays.toString(newArr1));
//        int[] newArr2 = Arrays.copyOfRange(arr, 0, 9);
//        System.out.println(Arrays.toString(newArr2));

//        Arrays.fill(arr, 100);

        int[] arr2 = {10, 2, 3, 5, 6, 1, 7, 8, 4, 9};
//        Arrays.sort(arr2);
//        System.out.println(Arrays.toString(arr2)); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]


        Integer[] arr = {10, 2, 3, 5, 6, 1, 7, 8, 4, 9};
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println("-------------------");
                System.out.println("o1：" + o1);
                System.out.println("o2：" + o2);
                return o1 - o2;
            }
        });
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]


    }
}