package Codeforces;
import java.util.*;

public class replace_with_occurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n + 1];

            for (int i = 1; i <= n; i++) {
                arr[i] = sc.nextInt();
            }

            ArrayList<ArrayList<Integer>> groups = new ArrayList<>();
            for (int i = 0; i <= n; i++) {
                groups.add(new ArrayList<>());
            }

            for (int i = 1; i <= n; i++) {
                groups.get(arr[i]).add(i);
            }

            boolean valid = true;
            int[] res = new int[n + 1];
            int label = 1;

            for (int k = 1; k <= n; k++) {
                int size = groups.get(k).size();
                if (size == 0) continue;

                if (size % k != 0) {
                    valid = false;
                    break;
                }

                for (int i = 0; i < size; i += k) {
                    for (int j = 0; j < k; j++) {
                        res[groups.get(k).get(i + j)] = label;
                    }
                    label++;
                }
            }

            if (!valid) {
                System.out.println("-1");
            } else {
                for (int i = 1; i <= n; i++) {
                    if (i > 1) System.out.print(" ");
                    System.out.print(res[i]);
                }
                System.out.println();
            }
        }

        sc.close();
    }
}

