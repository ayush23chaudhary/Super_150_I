package Codeforces;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while (t>0){
            int a= sc.nextInt();
            int b= sc.nextInt();
            int c= sc.nextInt();
            int[] arr= new int[3];
            arr[0]=a;
            arr[1]=b;
            arr[2]=c;
            System.out.println(sum_of_three(arr));
            t--;
        }
    }
    public static String sum_of_three(int[] arr){
        sort(arr);
        if(arr[0]+arr[1]==arr[2]){
            return "YES";
        }
        return "NO";

    }
    public static void sort(int[] arr){
        for (int i=1;i<arr.length;i++){
            for (int j=0;j<arr.length-i;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
