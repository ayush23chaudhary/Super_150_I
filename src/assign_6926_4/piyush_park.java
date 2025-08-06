package assign_6926_4;

import java.util.Scanner;

public class piyush_park {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read N, M, K, and S
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int s = sc.nextInt();

        char[][] park = new char[n][m];

        // Read the park layout
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                park[i][j] = sc.next().charAt(0);
            }
        }

        // Check if Piyush can escape the park
        if (canEscapePark(park, n, m, k, s)>=k) {
            System.out.println("Yes");
            System.out.println();
        } else {
            System.out.println("No");
        }
    }

    public static int canEscapePark(char[][] park, int n, int m, int k, int s) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // Check if strength is less than K before moving to a new cell
                if (s < k) {
                    return 0;
                }

                // Handle encounters based on cell type
                char cell = park[i][j];
                if (cell == '.') {
                    s -= 2; // obstacle
                } else if (cell == '*') {
                    s += 5; // magic bean
                } else if (cell == '#') {
                    break; // blockade, move to the next row
                }

                // Deduct 1 strength for the step taken
                if (j < m - 1) { // no step deduction at end of row
                    s--;
                }
            }
        }

        return s;
    }
}
