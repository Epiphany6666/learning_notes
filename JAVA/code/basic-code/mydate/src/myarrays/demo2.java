package myarrays;

import java.util.Arrays;
import java.util.Comparator;

public class demo2 {
    public static void main(String[] args) {
        Integer[] arr = {10, 2, 3, 5, 6, 1, 7, 8, 4, 9};
        Arrays.sort(arr, (Integer o1, Integer o2) -> {
                return o1 - o2;
            }
        );
    }
}
