package lec7;
import java.util.Scanner;

public class hacker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < t; i++) {
            String s = sc.nextLine();
            int c0 = 0;
            int c1 = 0;

            for (char c : s.toCharArray()) {
                if (c == '0') {
                    c0++;
                }
                if (c == '1') {
                    c1++;
                }
            }
            int m = Math.min(c0, c1);
            if (m % 2 == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
