package assign_3;

import java.util.Scanner;

public class alex {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        int[] cost= new int[t];
        for(int i=0;i<t;i++){
            cost[i]= sc.nextInt();
        }
        int n= sc.nextInt();
        while (n>0){
            int[] arr= new int[2];
            for (int i=0;i<2;i++){
                arr[i]=sc.nextInt();
            }
            int money=arr[0];
            int count=arr[1];
            System.out.println(alex_get(money,count,cost));
        }
    }
    public static String alex_get(int money,int count,int[] cost){
        int c=0;
        int sum=0;
        for(int i:cost){
            sum+=i;
            if( money%i==0){
                c++;
            }
        }
        if (c==count){
            return "Yes";
        } else if (money>sum) {
            return "Yes";
        }
        return "No";
    }
}
