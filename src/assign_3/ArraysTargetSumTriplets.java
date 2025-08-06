package assign_3;

import java.util.Scanner;

public class ArraysTargetSumTriplets {
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
                for (int k=j+1;k<n;k++){
                    if (arr[i]+arr[j]+arr[k]==t){
                        System.out.println(arr[i]+", "+arr[j]+" and "+arr[k]);
                    }
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
