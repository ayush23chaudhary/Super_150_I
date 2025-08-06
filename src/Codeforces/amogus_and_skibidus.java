package Codeforces;

import java.util.Scanner;

public class amogus_and_skibidus {
    public static void solve(Scanner scanner) {
        String S = scanner.next();
        for (int i = 0; i < S.length() - 1; i++) {
            if (S.charAt(i) == S.charAt(i + 1)) {
                System.out.print(1);
                return;
            }
        }
        System.out.print(S.length());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            solve(scanner);
            System.out.println();
        }
        scanner.close();
    }
}
