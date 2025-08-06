package Codeforces;

import java.util.Scanner;

public class fibonacciness {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int x1=sc.nextInt();
            int x2=sc.nextInt();
            int x4=sc.nextInt();
            int x5=sc.nextInt();
            int l= x1+x2;
            int c=x4-x2;
            int m=x5-x4;
            if (l==c && c==m){
                System.out.println(3);
            } else if ((l==c || c==m) || l==m) {
                System.out.println(2);

            }
            else {
                System.out.println(1);
            }


        }
    }
}
