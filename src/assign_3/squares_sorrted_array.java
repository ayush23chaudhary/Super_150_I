package assign_3;

import java.util.Scanner;

public class squares_sorrted_array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        //square(arr,n);
        Sort(arr);
        for (int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void square(int[] arr, int n){
        for (int i=0;i<n;i++){
            arr[i]=arr[i]*arr[i];
        }
    }
    public static  void Sort(int[] arr ){
        for (int i=1;i<arr.length;i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
