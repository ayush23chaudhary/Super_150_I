package lec19;

public class sliding_window {
    public static void main(String[] args) {
        // it works on questions where it ask for subarray or substring
        //there are two types: fixed size window and variable size window
        /* steps for implementing sliding window
        1. first window
        2. grow , shrink and answer update
         */
        int[] arr={2,3,1,1,5,7,8,3,4};
        int k=3;
        System.out.println(MAx_window(arr,k));
    }
    public static int MAx_window(int[] arr,int k){
        int sum=0, ans=0;
        for (int i=0;i<k;i++){
            sum+=arr[i];
        }
        ans=sum;
        for (int i=k;i<arr.length;i++){
            sum+=arr[i];
            sum-=arr[i-k];
            ans= Math.max(ans,sum);
        }
        return ans;
    }
}
