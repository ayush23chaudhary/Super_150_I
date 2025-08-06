package Codeforces;

import java.util.Scanner;

public class stair_peak {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while (t>0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            System.out.println(answer(a,b,c));

        }
    }
    public static String answer(int a, int b, int c){
        if(a<b){
            if(b<c){
                return "STAIR";
            } else if (b>c) {
                return "PEAK";

            }
            else {
                return "NONE";
            }

        }
        else {
            return "NONE";
        }
    }
}
