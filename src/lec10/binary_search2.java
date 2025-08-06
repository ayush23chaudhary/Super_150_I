package lec10;

import java.util.Scanner;

public class binary_search2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int n=sc.nextInt();
            int k=sc.nextInt();
            System.out.println(kthroot(k,n));
        }


    }
    public static int kthroot(int k, int n){
        int lo=1;
        int hi=n;
        int ans=0;
        while (lo <= hi) {
            int mid= (lo+hi)/2;
            if (Math.pow(mid,k)<=n){
                ans=mid;
                lo=mid+1;

            }else{
                hi=mid-1;

            }
        }
        return ans;
    }
}
