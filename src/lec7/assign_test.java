package lec7;
import java.util.Scanner;

public class assign_test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // Number of test cases

        while (t > 0) {
            long a = sc.nextLong();  // First number
            long b = sc.nextLong();  // Second number

            // Compute the GCD
            long gcdValue = gcd(a, b);

            // Safely compute LCM: (a / gcd(a, b)) * b to avoid overflow
            long lcm = (a / gcdValue) * b;

            // Output the result
            System.out.println(lcm);

            t--;  // Decrement the test case counter
        }

        sc.close();  // Close the scanner to avoid resource leaks
    }

    // Function to compute GCD using Euclid's algorithm
    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
