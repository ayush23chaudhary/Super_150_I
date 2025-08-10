package Codeforces;

import java.util.*;

public class unjust_binary_life  {

    static class Pair {
        long key;
        long first;
        long second;

        Pair(long key, long first, long second) {
            this.key = key;
            this.first = first;
            this.second = second;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();

        while (t-- > 0) {
            int len = sc.nextInt();
            String strA = sc.next();
            String strB = sc.next();

            int[] prefA = new int[len + 1];
            int[] prefB = new int[len + 1];


            for (int i = 1; i <= len; i++) {
                prefA[i] = prefA[i - 1] + (strA.charAt(i - 1) == '1' ? 1 : 0);
            }
            for (int i = 1; i <= len; i++) {
                prefB[i] = prefB[i - 1] + (strB.charAt(i - 1) == '1' ? 1 : 0);
            }


            List<Pair> list = new ArrayList<>(len);
            for (int j = 1; j <= len; j++) {
                long keyVal = 2L * prefB[j] - j;
                list.add(new Pair(keyVal, prefB[j], j));
            }

            list.sort(Comparator.comparingLong(p -> p.key));

            long[] keys = new long[len + 1];
            long[] sumFirst = new long[len + 1];
            long[] sumSecond = new long[len + 1];

            for (int i = 0; i < len; i++) {
                keys[i + 1] = list.get(i).key;
                sumFirst[i + 1] = sumFirst[i] + list.get(i).first;
                sumSecond[i + 1] = sumSecond[i] + list.get(i).second;
            }

            long totalB = sumFirst[len];
            long totalIndexSum = (long) len * (len + 1) / 2;
            long answer = 0;

            for (int x = 1; x <= len; x++) {
                long tVal = x - 2L * prefA[x];
                int left = 0, right = len;
                while (left < right) {
                    int mid = (left + right + 1) / 2;
                    if (keys[mid] <= tVal) {
                        left = mid;
                    } else {
                        right = mid - 1;
                    }
                }
                int c = left;

                long part1 = (long) c * prefA[x] + sumFirst[c];
                long zerosA = x - prefA[x];
                long part2 = (long) (len - c) * zerosA +
                        ((totalIndexSum - sumSecond[c]) - (totalB - sumFirst[c]));

                answer += part1 + part2;
            }

            System.out.println(answer);
        }

        sc.close();
    }
}

