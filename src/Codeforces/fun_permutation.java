package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class fun_permutation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            int[] p= new int[n];
            for (int i=0;i<n;i++){
                p[i]=sc.nextInt();
            }
            int[] q= new int[n];
//            Arrays.sort(p);
            int idx=0;
            for(int i=0;i<n;i++){
                q[i]=(n+1)-p[i];
            }
//            if(n%2!=0){
//                q[n-1]=p[(n/2)];
//            }
            for (int i:q){
                System.out.print(i+" ");
            }
            System.out.println();

        }
    }
}
