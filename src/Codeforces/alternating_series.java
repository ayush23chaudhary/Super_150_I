package Codeforces;
import java.util.*;

public class alternating_series {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            processCase(sc);
        }
    }

    private static void processCase(Scanner sc) {
        int size = sc.nextInt();
        StringBuilder result = new StringBuilder();
        if (size % 2 != 0) {
            for (int i = 0; i < size; i++) {
                result.append((i % 2 == 0 ? -1 : 3)).append(" ");
            }
        }
        else {
            if (size == 2) {
                result.append("-1 2");
            } else {
                for (int i = 0; i < size - 2; i++) {
                    result.append((i % 2 == 0 ? -1 : 3)).append(" ");
                }
                result.append("-1 2");
            }
        }

        System.out.println(result.toString().trim());
    }
}
