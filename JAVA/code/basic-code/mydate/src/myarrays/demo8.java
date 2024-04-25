package myarrays;

public class demo8 {
    public static void main(String[] args) {
        int n = 7;
        int f1 = 1, f2 = 2, ans = 0;
        for (int i = 0; i < n - 2; i++) {
            ans = f2 + f1;
            f1 = f2;
            f2 = ans;
        }
        System.out.println(ans);
    }
}
