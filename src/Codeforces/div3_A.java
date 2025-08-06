package Codeforces;

import java.util.Scanner;

public class div3_A {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0;i<t;i++){
            int a=sc.nextInt();
            a=Math.abs(a);
            if(a%2==0){
                System.out.println("Sakurako");
            }
            else {
                System.out.println("Kosuke");
            }
        }
    }
}
