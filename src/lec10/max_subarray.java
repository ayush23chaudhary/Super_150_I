package lec10;

import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;

public class max_subarray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        for (int j=0;j<t;j++){
            int n=sc.nextInt();
            int[] arr= new int[n];
            for (int i=0;i<n;i++){

                arr[i]=sc.nextInt();
            }
            System.out.println(maxBeautifulSegments(arr,n));
        }
    }
    private static int maxBeautifulSegments(int[] a, int n) {
        HashMap<Long, Integer> sumMap = new HashMap<>();
        long currentSum = 0;
        sumMap.put(0L, -1);

        int lastCut = -1;
        int count = 0;

        for (int i = 0; i < n; i++) {
            currentSum += a[i];
            if (sumMap.containsKey(currentSum)) {
                int lastIndex = sumMap.get(currentSum);


                if (lastIndex >= lastCut) {
                    count++;
                    lastCut = i;
                }
            }
            sumMap.put(currentSum, i);
        }

        return count;
    }
//    public static int Max_sum(int[] arr){
//        int ans=Integer.MIN_VALUE;
//        for (int i=0;i<arr.length;i++){
//            int sum=0;
//            for(int j=i;j<arr.length;j++){
//                sum+=arr[j];
//                ans= Math.max(ans,sum);
//            }
//        }
//        return ans;
//    }

//    public static int Max_sum(int[] arr){
//        int ans= 0;
//        int sum=0;
//        for (int i=0;i<arr.length;i++){
//            sum+=arr[i];
//            ans= Math.max(sum,ans);
//            if (sum<0){
//                sum=0;
//            }
//        }
//        return ans;
//    }



}
