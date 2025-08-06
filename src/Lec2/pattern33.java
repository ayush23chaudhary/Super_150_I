package Lec2;

import java.util.Scanner;

public class pattern33 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int row=1;
        int space=n;
        while (row <= n) {
            int f=1;
            while (f <= space) {
                System.out.print("  ");
                f++;
            }
            int  val=(n+1)-row;
            int i=1;
            while (i<=row-1){
                System.out.print(val+" ");
                i++;
                val++;
            }
            System.out.print("0 ");
            int j=1;
            while (j<= row-1){
                System.out.print(--val+" ");
                j++;

            }
            row++;
            System.out.println();
            space--;
        }
    }
}
