package assign_6926_4;

import java.util.Scanner;

public class spiral_print_clockwise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input matrix dimensions
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        // Initialize the matrix
        int[][] matrix = new int[m][n];

        // Read matrix elements
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Print matrix in clockwise spiral form
        printSpiralClockwise(matrix, m, n);
        scanner.close();
    }

    public static void printSpiralClockwise(int[][] matrix, int m, int n) {
        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;
        StringBuilder result = new StringBuilder();

        while (top <= bottom && left <= right) {
            // Traverse from left to right along the top row
            for (int i = left; i <= right; i++) {
                result.append(matrix[top][i]).append(", ");
            }
            top++;

            // Traverse down the right column
            for (int i = top; i <= bottom; i++) {
                result.append(matrix[i][right]).append(", ");
            }
            right--;

            // Traverse from right to left along the bottom row if it still exists
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.append(matrix[bottom][i]).append(", ");
                }
                bottom--;
            }

            // Traverse up the left column if it still exists
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.append(matrix[i][left]).append(", ");
                }
                left++;
            }
        }
        result.append("END");
        System.out.println(result.toString());
    }
}
