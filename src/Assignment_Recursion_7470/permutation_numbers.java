package Assignment_Recursion_7470;

import java.util.*;

public class permutation_numbers {
    public static void main(String[] args) {
        int[] arr= {1,2,3};
        List<Integer> l1= new ArrayList<>();
        List<List<Integer>> ans= new ArrayList<>();
        permu(arr,l1,ans,0);


    }
    public static void permu(int[] arr,List<Integer> l1, List<List<Integer>> ans,int idx){
        if(idx==arr.length-1){
            System.out.println(l1);
            ans.add(l1);
        }

        for (int i=0;i<arr.length;i++){
            l1.add(arr[i]);
            permu(arr,l1,ans,i++);
        }

    }
}
