package Codeforces;
import java.util.*;

public class asuna {
    public static void computeMaxValue(Scanner scanner) {
        int arraySize = scanner.nextInt();
        List<Long> numbers = new ArrayList<>();
        long totalSum = 0;
        int oddNumbers = 0;
        int evenNumbers = 0;
        long maxElement = 0;

        for (int i = 0; i < arraySize; i++) {
            long currentNumber = scanner.nextLong();
            numbers.add(currentNumber);
            totalSum += currentNumber;
            if (currentNumber % 2 != 0) {
                oddNumbers++;
            } else {
                evenNumbers++;
            }
            maxElement = Math.max(maxElement, currentNumber);
        }

        if (oddNumbers == 0 || evenNumbers == 0) {
            System.out.println(maxElement);
        } else {
            long maxOddSum = totalSum - oddNumbers + 1;
            long maxEvenSum = 0;

            if ((totalSum % 2) == (oddNumbers % 2)) {
                maxEvenSum = totalSum - oddNumbers;
                if (maxEvenSum < 0) maxEvenSum = 0;
            }

            System.out.println(Math.max(maxOddSum, maxEvenSum));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            computeMaxValue(sc);
        }
    }
}
