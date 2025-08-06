package lec7;

import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int a=1;
        int b=0;
        int c=1;
        while (n > 0) {
            c=a;
            a=b;
            b=a+c;
            n--;
        }
        System.out.println(b);
    }
}
