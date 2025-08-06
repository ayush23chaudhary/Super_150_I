package JP_Morgan;

public class subarray_sum_divisible_by_k {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};

    }
    public static long Count_Subarray(int[] arr){
        int n=arr.length;
        long[] freq=new long[n];
        long sum=0;
        freq[0]=1;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
            int rem=(int) (sum%n);
            if (rem<0){
                rem+=n;
            }
            freq[rem]++;

        }
        long ans=0;
        for (int i=0;i<freq.length;i++){
            if (freq[i]>=2){
                long x= freq[i];
                ans+=(x*(x-1))/2;
            }
        }
        return ans;
    }
}
