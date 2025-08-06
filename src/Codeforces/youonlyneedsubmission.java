package Codeforces;

import java.util.Scanner;

public class youonlyneedsubmission {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n= sc.nextInt();
            int[] arr= new int[n];
            int sum=0,z=0;
//            sTRDSADGAIG
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                sum+=arr[i];
                if(arr[i]==0){
                    z++;
                }
            }

            System.out.println(sum+z);


        }
    }
}
