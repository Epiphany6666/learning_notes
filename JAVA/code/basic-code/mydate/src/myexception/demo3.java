package myexception;

public class demo3 {
    public static void main(String[] args) {
        int[] arr = null;
        int max = 0;
        max = getMax(arr);
        System.out.println(max);
    }


    public static int getMax(int[] arr) {
        System.out.println("看看我执行了吗？");
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
