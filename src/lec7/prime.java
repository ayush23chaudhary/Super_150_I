package lec7;

import java.util.Scanner;


public class prime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(prime(n));
    }
    public static int prime(int n){
        Scanner sc= new Scanner(System.in);
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        if (n1>1 && n2>1){
            return n1*n2;
        }
        else{
            int c=Math.max(n1,n2);
            return (c*2);
        }
    }
}
