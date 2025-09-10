package Codeforces;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class villagers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();

            }
            Arrays.sort(arr);
            long ans=0;
            if(n%2==0){
                for (int i=0;i<n;i+=2){
                    ans+=arr[i+1];
                }

            }
            else {
                for (int i=1;i<n;i+=2){
                    ans+=arr[i+1];
                }
                ans+=arr[0];
            }
            System.out.println(ans);

        }
    }
}
