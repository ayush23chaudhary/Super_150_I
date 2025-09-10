package Codeforces;

import java.util.*;

public class max_even_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            long temp = b;
            int cnt = 0;
            while (temp % 2 == 0) {
                cnt++;
                temp /= 2;

            }
//            int ans=0;

            ArrayList<Long> l = new ArrayList<>();
            l.add(1L);
            if (temp > 1) {
                l.add(temp);
            }
            long ans = -1;

            for (int j = 0; j <= cnt; j++) {
                long pow2 = 1L << j;
                int i=0;
                while(i<l.size()){
                    long k = pow2 * l.get(i);
                    if (b % k != 0) {
                        continue;
                    }
                    long sum = a * k ;
                    sum+= b / k;
                    if ((sum & 1L) == 0) {
                        ans = Math.max(ans, sum);
                    }
                    i++;

                }
            }

            System.out.println(ans);
        }

    }
}
