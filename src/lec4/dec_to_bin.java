package lec4;

import java.util.Scanner;

public class dec_to_bin{
    public static void main(String[] args) {
        // Decimal to binary
        Scanner sc= new Scanner(System.in);
        int sum=0;
        int mul=1;
        int n= sc.nextInt();
        while (n > 0) {
            int rem=n%2;
            sum=sum+ (rem*mul);
            n/=2;
            mul*=10;
        }
        System.out.println(sum);
    }
}
