package assign_6926_4;

import java.util.Scanner;

public class UpperTrianguarMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the matrix
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        // Input matrix elements
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Modify the matrix to display upper triangle and zero the lower triangle
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i > j) {
                    System.out.print("0 ");
                } else {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}

