package assign_3;

import java.util.Scanner;

public class max_value_array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(max(arr,n));
    }
    public static int max(int[] arr,int n){
        int c=arr[0];
        for (int i=1;i<n;i++){
            if (arr[i]>c){
                c=arr[i];
                break;
            }
        }
        return c;
    }
}
