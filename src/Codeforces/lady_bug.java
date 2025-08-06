package Codeforces;

import java.util.Scanner;

public class lady_bug {
    public static void solve(Scanner sc) {
        int length = sc.nextInt();
        String firstString = sc.next();
        String secondString = sc.next();

        long sumFirst = 0;
        long sumSecond = 0;

        for (int i = 0; i < length; i++) {
            if (i % 2 == 0) {
                sumFirst += (firstString.charAt(i) - '0');
                sumSecond += (secondString.charAt(i) - '0');
            } else {
                sumFirst += (secondString.charAt(i) - '0');
                sumSecond += (firstString.charAt(i) - '0');
            }
        }

        long slotsFirst = length / 2;
        long slotsSecond = (length + 1) / 2;

        if (sumFirst <= slotsFirst && sumSecond <= slotsSecond) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            solve(sc);
        }

    }
}
