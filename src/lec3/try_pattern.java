package lec3;
import java.util.Scanner;

public class try_pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int[][] t = new int[n][n];
        int i = 0;
        while (i < n) {
            int j = 0;
            while (j <= i) {
                if (j == 0 || j == i) {
                    t[i][j] = 1;
                } else {
                    t[i][j] = t[i-1][j-1] + t[i-1][j];
                }
                System.out.print(t[i][j] + "\t");
                j++;
            }
            System.out.println();
            i++;
        }

    }
}
