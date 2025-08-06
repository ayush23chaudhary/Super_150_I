package assign_3;

import java.util.Scanner;

public class target_pair_sum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Sort(arr);
        int t= sc.nextInt();
        for(int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (arr[i]+arr[j]==t){
                        System.out.println(arr[i]+" and "+arr[j]);
                }

            }
        }
    }
    //to give the result in sorted format
    public static void Sort(int[] arr ){
        for (int i=1;i<arr.length;i++){
            for (int j=0;j< arr.length-i;j++){
                if (arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
