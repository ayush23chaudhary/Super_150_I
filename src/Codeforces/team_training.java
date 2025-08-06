package Codeforces;

import java.util.*;

public class team_training {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int[] arr= new int[n];
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            int el=0,c=0;
            for(int i=n-1;i>=0;i--){
                el++;
                if (el*arr[i]>=x){
                    c++;
                    el=0;
                }
            }
            System.out.println(c);


        }
    }
}
