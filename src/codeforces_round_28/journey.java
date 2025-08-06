package codeforces_round_28;

import java.util.Scanner;

public class journey {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            int a= sc.nextInt();
            int b= sc.nextInt();
            int c= sc.nextInt();
            int sum=a+b+c;
            int rem=n%sum;
            int mul=(int) n/sum;
            int ct=mul*3;
            if((rem-a)<=0){
                ct++;
            } else if (rem-(a+b)<=0) {
                ct+=2;
            }
            else{
                ct+=3;
            }
            System.out.println(ct);


        }
    }
}
