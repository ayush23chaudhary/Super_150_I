package Codeforces;

import java.util.*;

public class redstone {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n= sc.nextInt();
            int[] arr= new int[n];

            for (int i=0;i<n;i++){
                arr[i]= sc.nextInt();

            }
            Arrays.sort(arr);
            int ele= arr[0];
            int c=0;
            for (int i=1;i<n;i++){
                if (ele!=arr[i]){
                    ele=arr[i];
                }
                else{
                    c+=1;
                }

            }
            if (c==0){
                System.out.println("No");
            }
            else {
                System.out.println("Yes");
            }


        }
    }

}
