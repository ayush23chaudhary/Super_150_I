package Codeforces;

import java.util.Scanner;

public class olympic_date {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int z=3,o=1,tw=2,th=1,f=1;
            int c=1;
            int n= sc.nextInt();
            int[] arr= new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            for (int i=0;i<n;i++ ){
                if(arr[i]==0){
                    z--;
                }
                else if(arr[i]==1){
                    o--;
                }
                else if(arr[i]==2){
                    tw--;
                }
                else if(arr[i]==3){
                    th--;
                }
                else if(arr[i]==5){
                    f--;
                }
                if(z<1 && o<1 && tw<1 && th<1 && f<1){
                    System.out.println(i+1);
                    c=0;
                    break;
                }
            }
            if(c==1){
                System.out.println(0);
            }
        }
    }
}
