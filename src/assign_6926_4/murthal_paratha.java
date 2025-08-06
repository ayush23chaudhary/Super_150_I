package assign_6926_4;

import java.util.*;

public class murthal_paratha{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading input
        int P = sc.nextInt(); // number of paranthas ordered
        int L = sc.nextInt(); // number of cooks
        int[] ranks = new int[L];

        for (int i = 0; i < L; i++) {
            ranks[i] = sc.nextInt(); // rank of each cook
        }

        // Find the minimum time to cook all paranthas
        int minTime = findMinimumTime(P, L, ranks);

        // Output the result
        System.out.println(minTime);
    }

    // Function to calculate how many paranthas a cook can make in 'time' minutes
    public static int paranthasCookedInTime(int rank, int time) {
        int paranthas = 0;
        int timeSpent = 0;
        int i = 1;

        // Count how many paranthas can be cooked
        while (true) {
            timeSpent += i * rank;
            if (timeSpent <= time) {
                paranthas++;
                i++;
            } else {
                break;
            }
        }
        return paranthas;
    }

    // Function to check if it's possible to cook 'P' paranthas in 'time' minutes with given cooks
    public static boolean canCookAllParanthas(int P, int[] ranks, int time) {
        int totalParanthas = 0;

        for (int rank : ranks) {
            totalParanthas += paranthasCookedInTime(rank, time);
            if (totalParanthas >= P) {
                return true; // We can cook enough paranthas
            }
        }
        return false; // Not enough paranthas can be cooked
    }

    // Binary search function to find the minimum time needed
    public static int findMinimumTime(int P, int L, int[] ranks) {
        int left = 1;  // minimum time
        int right = P * L * 8;  // maximum time (a loose upper bound)

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canCookAllParanthas(P, ranks, mid)) {
                right = mid;  // try for smaller time
            } else {
                left = mid + 1;  // need more time
            }
        }

        return left;
    }


}

