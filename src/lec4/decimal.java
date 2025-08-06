package lec4;

import java.util.Scanner;

public class decimal {
    public static void main(String[] args) {
        // Binary to decimal
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int sum=0;
        int mul=1;
        while (n > 0) {
            int rem=n%10;
            sum=sum+ (rem*mul);
            n/=10;
            mul*=2;
        }
        System.out.println(sum);
    }
}
