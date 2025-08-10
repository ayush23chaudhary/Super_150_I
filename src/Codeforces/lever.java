package Codeforces;

import java.util.Scanner;

public class lever {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t=sc.nextInt();

        while (t-- > 0) {
            int size = sc.nextInt();
            int[] arrA = new int[size];
            int[] arrB = new int[size];

            for (int i = 0; i < size; i++) {
                arrA[i] = sc.nextInt();
            }

            long diff = 0;
            for (int i = 0; i < size; i++) {
                arrB[i] = sc.nextInt();
                if (arrA[i] > arrB[i]) {
                    diff += arrA[i] - arrB[i];
                }
            }

            System.out.println(diff + 1);
        }
    }
}
