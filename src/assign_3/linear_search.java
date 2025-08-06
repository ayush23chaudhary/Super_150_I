package assign_3;


import java.sql.SQLOutput;
import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        long m= sc.nextInt();
        int c=1;
        for(int i=0;i<n;i++){
            if (arr[i]==m){
                System.out.println(i);
                c=0;
                break;
            }
        }
        if (c==0){
            System.out.println(-1);
        }
    }
}
