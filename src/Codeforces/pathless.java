package Codeforces;

import java.util.*;

public class pathless {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int len = sc.nextInt();
            int target = sc.nextInt();

            int[] arr = new int[len];
            long total = 0;
            int ct0 = 0, ct1 = 0, ct2 = 0;

            for (int i = 0; i < len; i++) {
                arr[i] = sc.nextInt();
                total += arr[i];

                if (arr[i] == 0) ct0++;
                else if (arr[i] == 1) ct1++;
                else ct2++;
            }

            long gap = target - total;

            if (gap < 0 || gap == 1) {
                boolean isFirst = true;

                for (int i = 0; i < ct0; i++) {
                    if (!isFirst) System.out.print(" ");
                    System.out.print(0);
                    isFirst = false;
                }

                for (int i = 0; i < ct2; i++) {
                    if (!isFirst) System.out.print(" ");
                    System.out.print(2);
                    isFirst = false;
                }

                for (int i = 0; i < ct1; i++) {
                    if (!isFirst) System.out.print(" ");
                    System.out.print(1);
                    isFirst = false;
                }

                System.out.println();
            } else {
                System.out.println("-1");
            }
        }
    }
}
