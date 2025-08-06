package Codeforces;
import java.util.*;

import java.util.*;

public class game_of_mathletes {

    public static List<Integer> solveGame(List<TestCase> testCases) {
        List<Integer> results = new ArrayList<>();

        for (TestCase testCase : testCases) {
            int n = testCase.n;
            int k = testCase.k;
            int[] arr = testCase.arr;

            Map<Integer, Integer> freq = new HashMap<>();
            for (int num : arr) {
                freq.put(num, freq.getOrDefault(num, 0) + 1);
            }

            int score = 0;

            for (int x : new HashSet<>(freq.keySet())) {
                int y = k - x;
                if (freq.containsKey(y)) {
                    int pairs = Math.min(freq.get(x), freq.get(y));
                    if (x == y) {
                        pairs /= 2; // Special case: x + x = k
                    }
                    score += pairs;
                    freq.put(x, freq.get(x) - pairs);
                    freq.put(y, freq.get(y) - pairs);

                    if (freq.get(x) <= 0) freq.remove(x);
                    if (freq.get(y) <= 0) freq.remove(y);
                }
            }

            results.add(score);
        }

        return results;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        List<TestCase> testCases = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            testCases.add(new TestCase(n, k, arr));
        }

        List<Integer> results = solveGame(testCases);

        for (int result : results) {
            System.out.println(result);
        }
    }
}

class TestCase {
    int n;
    int k;
    int[] arr;

    public TestCase(int n, int k, int[] arr) {
        this.n = n;
        this.k = k;
        this.arr = arr;
    }
}
