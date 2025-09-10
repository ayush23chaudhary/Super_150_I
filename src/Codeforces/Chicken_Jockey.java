package Codeforces;

import java.util.*;
public class Chicken_Jockey {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }

            long sum = 0;


            long ans=0, old = 0, now = 0;
            for (int i = 1; i < n; i++) {
                long val = Math.min(i, (int) arr[i]) - 2L;
                if (val < 0) {
                    val = 0;
                }
                long nxt = Math.max(now, old + val);
                old = now;
                now = nxt;
            }
            for (int i=0;i<n;i++){
                sum += arr[i];
            }
            sum -= (n - 1);
            ans= sum-now;
            System.out.println(ans);
        }
    }
}
