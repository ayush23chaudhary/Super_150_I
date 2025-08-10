package Codeforces;
import java.util.*;
public class Adjacent_XOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            solve(sc);
        }
    }
    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        long[] arrA = new long[n];
        long[] arrB = new long[n];

        for (int i = 0; i < n; i++){
            arrA[i] = sc.nextLong();
        }
        for (int i = 0; i < n; i++){
            arrB[i] = sc.nextLong();
        }

        if (arrA[n - 1] != arrB[n - 1]) {
            System.out.println("NO");
            return;
        }

        for (int i = n - 2; i >= 0; i--) {
            boolean matchFound = false;

            if (arrB[i] == arrA[i]) {
                matchFound = true;
            }
            if (arrB[i] == (arrA[i] ^ arrA[i + 1])) {
                matchFound = true;
            }
            if (arrB[i] == (arrA[i] ^ arrB[i + 1])) {
                matchFound = true;
            }

            if (!matchFound) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }



}



