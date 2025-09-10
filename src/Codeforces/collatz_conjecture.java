package Codeforces;

import java.util.Scanner;

public class collatz_conjecture {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int k=sc.nextInt();
            int n=sc.nextInt();
            while(k-->0){
                if(n%2==0 && (n-1)%3==0){
                    n= (n-1)/3;


                }else {
                    n=n*2;
                }
            }
            System.out.println(n);
        }
    }
}
