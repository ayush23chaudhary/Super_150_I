package assign_6926_4;

import java.util.Scanner;

public class help_rahul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Input the target element to search
        int target = scanner.nextInt();

        // Find the target index in the rotated array
        int result = searchInRotatedArray(arr, target);
        System.out.println(result);
    }

    public static int searchInRotatedArray(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if mid itself is the target
            if (arr[mid] == target) {
                return mid;
            }

            // Determine if the left side is sorted
            if (arr[start] <= arr[mid]) {
                // Target is in the left sorted portion
                if (target >= arr[start] && target < arr[mid]) {
                    end = mid - 1;
                } else { // Search in the right half
                    start = mid + 1;
                }
            }
            // Otherwise, the right side must be sorted
            else {
                // Target is in the right sorted portion
                if (target > arr[mid] && target <= arr[end]) {
                    start = mid + 1;
                } else { // Search in the left half
                    end = mid - 1;
                }
            }
        }

        // Return -1 if the element is not found
        return -1;
    }
}

