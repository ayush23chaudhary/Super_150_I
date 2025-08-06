package Codeforces;

import java.util.Scanner;

public class upscaling {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int t= sc.nextInt();
        while (t>0){
            int n= sc.nextInt();
            pattern(n);
            t--;
        }

    }
    public static void pattern(int n){
        int c=0;
        for (int i=0;i<2*n;i++){
            if (i%2==0){
                c++;
            }
            if (c%2==0){
                for(int j=0;j<n;j++){
                    if (j%2==0){
                        System.out.print("..");
                    }
                    else {
                        System.out.print("##");
                    }
                }
            }
            else {
                for(int j=0;j<n;j++){
                    if (j%2==0){
                        System.out.print("##");
                    }
                    else {
                        System.out.print("..");
                    }
                }
            }

            System.out.println();
        }
    }
}
