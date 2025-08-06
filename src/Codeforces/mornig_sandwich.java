package Codeforces;

import java.util.Scanner;

public class mornig_sandwich {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t>0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            System.out.println(sand(a,b,c));
            t--;
        }
    }
    public static int sand(int a, int b, int c){
        int r=2;
        if((a-2)>=(b+c)){
            r+=(2*(b+c)-1);
        }
        else {
            r+=(2*(a-2)+1);
        }
        return r;
    }


}
