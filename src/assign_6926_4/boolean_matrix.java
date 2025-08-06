package assign_6926_4;

import java.util.Scanner;

public class boolean_matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input matrix dimensions
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] mat = new int[m][n];

        // Input matrix elements
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }

        // Arrays to mark which rows and columns need to be updated
        boolean[] rowsToChange = new boolean[m];
        boolean[] colsToChange = new boolean[n];

        // Step 1: Record rows and columns that contain a 1
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    rowsToChange[i] = true;
                    colsToChange[j] = true;
                }
            }
        }

        // Step 2: Update the matrix based on the recorded rows
        for (int i = 0; i < m; i++) {
            if (rowsToChange[i]) {
                for (int j = 0; j < n; j++) {
                    mat[i][j] = 1;
                }
            }
        }

        // Step 3: Update the matrix based on the recorded columns
        for (int j = 0; j < n; j++) {
            if (colsToChange[j]) {
                for (int i = 0; i < m; i++) {
                    mat[i][j] = 1;
                }
            }
        }

        // Print the modified matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}

