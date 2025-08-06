package assign_6926_4;

import java.util.Scanner;
import java.util.Arrays;

public class two_darray_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Reading matrix dimensions
        int r = sc.nextInt();
        int c = sc.nextInt();
        // Initialize the matrix
        int[][] matrix = new int[r][c];
        // Reading matrix elements
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        // Sorting each row of the matrix
        for (int i = 0; i < r; i++) {
            Arrays.sort(matrix[i]);
        }
        // Printing the sorted matrix
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
