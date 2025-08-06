package JP_Morgan;


import java.sql.SQLOutput;
import java.util.Arrays;

public class array_reduction {
    public static void main(String[] args) {
        int[] arr= {3,5,2,1,9,6};
        int n= arr.length;
        Arrays.sort(arr);
        int i=0;
        int sum=arr[n-1],cost=0;
        while(n-->1){
            int upper=arr[i]+sum;
            int lower=sum-arr[i]+1;
            sum=sum+arr[i];
            if(upper%lower==0){
                cost+=(upper/lower);
            }
            else {
                cost+=(upper/lower)+1;
            }
            i++;

        }
        System.out.println(cost);

    }
}
