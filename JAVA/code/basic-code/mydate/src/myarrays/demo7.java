package myarrays;

public class demo7 {
    public static void main(String[] args) {
        System.out.println(getSum(10));
    }

    private static int getSum(int day) {
        if (day == 1) return 1;
        return (getSum(day - 1) + 1) * 2;
    }
}
