package Codeforces;

import java.util.*;

public class kamika_sheeps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int numSheep = sc.nextInt();
            int minBeauty = Integer.MAX_VALUE;
            int maxBeauty = Integer.MIN_VALUE;

            for (int i = 0; i < numSheep; i++) {
                int beautyLevel = sc.nextInt();
                minBeauty = Math.min(minBeauty, beautyLevel);
                maxBeauty = Math.max(maxBeauty, beautyLevel);
            }

            int maxPleasure = maxBeauty - minBeauty;
            System.out.println(maxPleasure);
        }
    }
}
