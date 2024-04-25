package myarrays;

public class demo6 {
    public static void main(String[] args) {
        System.out.println(fun2(12));
    }

    private static int fun2(int n) {
        int f1 = 1, f2 = 1, ans = 0;
        for (int i = 0; i < n - 2; i++) {
            ans = f1 + f2;
            f1 = f2;
            f2 = ans;
        }
        return ans;
    }

    private static int fun(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }
        return fun(n - 1) + fun(n - 2);
    }
}
