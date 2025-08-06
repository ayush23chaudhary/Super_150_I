package lec3;

import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        int c=0;
        int m=1;
        while(c<n1){
            int n= 3*m+2;
            if (n % n2 != 0) {
                System.out.println(n);
                c++;
            }
            m++;

        }

    }
}
