package lec3;

import java.util.Scanner;

public class pascal_triangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int row=0;
        int n= sc.nextInt();
        int star=1;
        while(row<n){
            int i=0;
            int ncr=1;
            while (i < star) {
                System.out.print(ncr+" ");
                ncr= ((row-i)*ncr)/(i+1);
                i++;
            }
            System.out.println();
            row++;
            star++;

        }
    }
}
