package Assignment_Recursion_7470;

import java.util.Scanner;

public class subset_recursion {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        subset(arr,target,"",0);


    }
    public static void subset(int[] arr,int target,String ans,int idx){
        if(target==0){
            System.out.println(ans);
            return;
        }
        for(int i=idx;i<arr.length;i++){
            if(target>=arr[i]){
                subset(arr,target-arr[i],ans+arr[i]+" ",i);
            }

        }
    }
}
