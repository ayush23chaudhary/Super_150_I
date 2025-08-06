package assign_6926_4;

import java.util.Scanner;

public class painter_partition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(); // Number of painters
        int n = sc.nextInt(); // Number of boards
        int[] boards = new int[n];

        // Input the length of each board
        int maxBoardLength = 0;
        int sumBoardLengths = 0;
        for (int i = 0; i < n; i++) {
            boards[i] = sc.nextInt();
            sumBoardLengths += boards[i];
            maxBoardLength = Math.max(maxBoardLength, boards[i]);
        }

        // Apply binary search to find the minimum time required
        int result = binarySearch(boards, k, maxBoardLength, sumBoardLengths);
        System.out.println("Minimum time to paint all boards: " + result);
    }

    public static int binarySearch(int[] boards, int k, int low, int high) {
        int result = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if it is possible to paint all boards in mid time with k painters
            if (isPossible(boards, k, mid)) {
                result = mid; // If possible, update result
                high = mid - 1; // Try to find a smaller maximum time
            } else {
                low = mid + 1; // Increase time limit to make it possible
            }
        }

        return result;
    }

    public static boolean isPossible(int[] boards, int k, int maxTime) {
        int painterCount = 1;
        int timeSoFar = 0;

        for (int length : boards) {
            timeSoFar += length;

            if (timeSoFar > maxTime) {
                // Assign a new painter
                painterCount++;
                timeSoFar = length;

                // If more painters are needed than available, return false
                if (painterCount > k) {
                    return false;
                }
            }
        }

        return true; // Possible to paint all boards within maxTime using k painters
    }
}

