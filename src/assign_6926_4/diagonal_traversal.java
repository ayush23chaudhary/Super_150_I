package assign_6926_4;

import java.util.Scanner;

public class diagonal_traversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of rows (M) and columns (N)
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        int[][] matrix = new int[M][N];

        // Input matrix elements
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        boolean firstElement = true;

        // Traverse diagonals
        for (int d = 0; d < M + N - 1; d++) {
            if (d % 2 == 0) {
                // Traverse from bottom-left to top-right
                int row = (d < N) ? 0 : d - N + 1;
                int col = (d < N) ? d : N - 1;

                while (row < M && col >= 0) {
                    // Print with a space separator if it's not the first element
                    if (!firstElement) {
                        System.out.print(" ");
                    }
                    System.out.print(matrix[row][col]);
                    firstElement = false;
                    row++;
                    col--;
                }
            } else {
                // Traverse from top-right to bottom-left
                int row = (d < M) ? d : M - 1;
                int col = (d < M) ? 0 : d - M + 1;

                while (row >= 0 && col < N) {
                    // Print with a space separator if it's not the first element
                    if (!firstElement) {
                        System.out.print(" ");
                    }
                    System.out.print(matrix[row][col]);
                    firstElement = false;
                    row--;
                    col++;
                }
            }
        }
    }
}
