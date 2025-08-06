package assign_3;

import java.util.Scanner;
// ROSES WALA
public class ramu_pair {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        for(int j=0;j<t;j++){
            int n= sc.nextInt();
            int[] arr= new int[n];
            for(int i=0;i<n;i++){
                arr[i]= sc.nextInt();
            }
            int s= sc.nextInt();
            Sort(arr);
            int[] arl=pair(arr,s,n);
            System.out.println("Deepak should buy roses whose prices are "+ arl[0]+ " and "+arl[1]+".");


        }
    }
    public static int[] pair(int[] arr, int s,int n){
        int cmin=arr[n-1]-arr[0];
        int[] arl= new int[2];
        for(int i=0; i<n;i++){
            for
            (int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==s){
                    if(arr[j]-arr[i]<cmin){
                        arl[0]=arr[i];
                        arl[1]=arr[j];
                    }
                }
            }
        }
        return arl;
    }

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
