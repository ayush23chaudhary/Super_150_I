package Codeforces;

import java.util.*;

public class makeitequal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();

            long[] arrA = new long[n];
            long[] arrB = new long[n];

            for (int i = 0; i < n; i++) arrA[i] = sc.nextLong();
            for (int i = 0; i < n; i++) arrB[i] = sc.nextLong();

            if (k== 0) {
                Arrays.sort(arrA);
                Arrays.sort(arrB);
                System.out.println(Arrays.equals(arrA, arrB) ? "YES" : "NO");
                continue;
            }

            Map<Long, Integer> freqA = new HashMap<>();
            Map<Long, Integer> freqB = new HashMap<>();

            for (long val : arrA) freqA.put(val % k, freqA.getOrDefault(val % k, 0) + 1);
            for (long val : arrB) freqB.put(val % k, freqB.getOrDefault(val % k, 0) + 1);

            if (!Objects.equals(freqA.getOrDefault(0L, 0), freqB.getOrDefault(0L, 0))) {
                System.out.println("NO");
                continue;
            }

            Set<Long> rem = new HashSet<>();
            for (long key : freqA.keySet()) if (key != 0) rem.add(key);
            for (long key : freqB.keySet()) if (key != 0) rem.add(key);

            boolean istrue = true;
            for (long r : rem) {
                if (r == 0) {
                    continue;
                }
                long pairRem = (k - r) % k;

                int totalA = freqA.getOrDefault(r, 0) + freqA.getOrDefault(pairRem, 0);
                int totalB = freqB.getOrDefault(r, 0) + freqB.getOrDefault(pairRem, 0);

                if (totalA != totalB) {
                    istrue = false;
                    break;
                }
            }
            if (istrue){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
