package lec7;

import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        while(n>0){
            int c=sc.nextInt();
            int odd=0;
            int even=0;
            while(c>0){
                int rem=c%10;
                if (rem % 2 == 0) {
                    even+=rem;
                }
                else {
                    odd+=rem;
                }
                c/=10;
            }
            if (odd % 3 == 0 || even % 4 == 0) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
            n--;

        }
    }
}
