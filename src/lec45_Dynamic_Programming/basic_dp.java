package lec45_Dynamic_Programming;

public class basic_dp {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[n];
        fibTD(5, arr);
    }

    public static int fibTD(int n, int[] dp) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (dp[n] != 0) {
            return dp[n];
        }
        int f1 = fibTD(n - 1, dp);
        int f2 = fibTD(n - 2, dp);
        return dp[n] = f1 + f2;
    }
}
