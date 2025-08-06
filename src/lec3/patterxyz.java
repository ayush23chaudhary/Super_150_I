package lec3;

import java.util.Scanner;

public class patterxyz {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int row=1;
        int space=1;
        int star=n/2;

        while (row<=n){
            int j=1;
            while(j<=star) {
                System.out.print("*    ");
                j++;
            }
            int i=1;
            while (i<=space){
                if (row==1 || row==n){
                    System.out.print("*    ");
                }
                else {
                    System.out.print("     ");
                }
                i++;

            }

            int k=1;
            while (k<=star){
                System.out.print("*    ");
                k++;
            }
            row++;
            System.out.println();
            if (row<=n/2+1){
                if (row!=2){
                    star--;
                    space+=2;
                }
            }
            else{
                if(row!=(n)){
                    star++;
                    space-=2;
                }
            }
        }
    }
}
