package codeforces_round_28;

import java.util.Scanner;

public class counting_pairs {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            int[] arr= new int[n];
            int sum=0;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                sum+=arr[i];

            }
            int c=0;
            for(int i=0;i<n-1;i++){
                for(int j=i+1;j<n;j++){
                    if((sum-(arr[i]+arr[j]))>=x && (sum-(arr[i]+arr[j]))<=y ){
                        c++;
                    }
                }
            }
            System.out.println(c);

        }
    }
}
