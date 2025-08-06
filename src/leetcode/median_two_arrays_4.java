package leetcode;
import java.util.*;

public class median_two_arrays_4 {
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));


    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a=nums1.length;
        int b=nums2.length;
        int c=a+b;
        int[] arr= new int[c];
        for(int i=0;i<a;i++){
            arr[i]=nums1[i];
        }
        for (int j=0;j<b;j++){
            arr[a+j]=nums2[j];
        }
        Arrays.sort(arr);
        for (int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        int f= (int) Math.floor((c+1)/2);
        int ce= (int) Math.ceil((c+2)/2);
        System.out.println(f);
        System.out.println(ce);
        return (arr[f-1]+arr[ce-1])/2.0;


    }
}
