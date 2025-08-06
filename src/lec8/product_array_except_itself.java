package lec8;

public class product_array_except_itself {
    public static void main(String[] args) {
        int[] arr= {};

    }
    public static int[] product(int[] arr){
        int n= arr.length;
        int[] left= new int[n];
        int[] right= new int[n];
        // making left array
        left[0]=1;
        for (int i=1;i<n;i++){
            left[i]=left[i-1]*arr[i-1];

        }
        //making right array
        right[n-1]=1;
        for (int i=n-1;i>=0;i--){
            right[i]=right[i+1]*arr[i+1];
        }
        int pro=1;
        int[] ans= new int[n];
        for(int i=0;i<n;i++){
            ans[i]=left[i]*right[i];
        }
        return ans;
    }
}
