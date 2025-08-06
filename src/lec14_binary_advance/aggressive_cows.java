package lec14_binary_advance;

import java.util.Arrays;
import java.util.Scanner;

public class aggressive_cows {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while (t > 0) {
            int s=sc.nextInt();
            int noc=sc.nextInt();
            int[] stall= new int[s];
            for(int i=0;i<s;i++){
                stall[i]=sc.nextInt();
            }
            Arrays.sort(stall);
            System.out.println(largest_min(stall,noc));
        }
    }
    public static int largest_min(int[] stall, int noc){
        int lo=0;
        int hi=stall[stall.length-1]-stall[0];
        int ans=0;
        while(lo<=hi){
            int mid =(lo+hi)/2;
            if(isitposiible(stall,noc,mid)){
                ans=mid;
                lo=mid+1;
            }
            else {
                hi=mid-1;
            }
        }
        return ans;
    }
    public static boolean isitposiible(int[] stall,int noc,int mid){
        int pos=stall[0];
        int cow=1;
        for(int i=1;i<stall.length;i++){
            if (stall[i]-pos>=mid){
                cow++;
                pos=stall[i];
            }
            if(cow==noc){
                return true;
            }
        }
        return false;
    }
}
