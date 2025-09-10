package Codeforces;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String a= sc.next();
            int m= sc.nextInt();
            String b= sc.next();
            char[] c = sc.next().toCharArray();
            for(int i=0;i<m;i++){
                if (c[i]=='D'){
                    char h= b.charAt(i);
                    a=a+h;
                }
                else {
                    char h= b.charAt(i);
                    a=h+a;
                }
            }
            System.out.println(a);


        }
    }


}
