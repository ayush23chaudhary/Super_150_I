package lec6;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        //int[] arr= new int[5];
        //System.out.println(arr); // output- [I@65ab7765
        //int[] ar= {0,1,,3,4,5}
        //int ar1= arr int[]{10,9,8,7,6}
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
    }
}
