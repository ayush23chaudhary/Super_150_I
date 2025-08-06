package Codeforces;

import java.sql.SQLOutput;
import java.util.Scanner;

public class rook {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        while (t>0){
            String str= sc.nextLine();
            chess(str);
            t--;

        }
    }
    public static void chess(String str){
        char r= str.charAt(0);
        int c= str.charAt(1);
        for(int i=49;i<=56;i++){
            if (i==c){
                String res=r+""+(char) i;
            }
            else {
                String res=r+""+(char) i;
                System.out.println(res);
            }
        }
        for (int i=97;i<=104;i++){
            if(i!=(int) r){
                char a= (char) i;
                char b= (char) c;
                System.out.println(a+""+b);
            }

        }


    }
}
