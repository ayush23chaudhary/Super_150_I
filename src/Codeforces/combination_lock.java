package Codeforces;

import java.util.*;

public class combination_lock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        StringBuilder result = new StringBuilder();

        for (int t = 0; t < tc; t++) {
            int num = sc.nextInt();

            if (num % 2 == 0) {
                result.append("-1\n");
            } else {
                List<Integer> perm = new ArrayList<>();
                for (int i = 1; i <= num; i++) {
                    int value = (2 * i) % num;
                    if (value == 0) {
                        perm.add(num);
                    } else {
                        perm.add(value);
                    }
                }
                for (int i = 0; i < perm.size(); i++) {
                    result.append(perm.get(i));
                    if (i < perm.size() - 1) {
                        result.append(" ");
                    }
                }
                result.append("\n");
            }
        }
        System.out.print(result);
        sc.close();
    }
}

