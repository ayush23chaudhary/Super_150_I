package Codeforces;

import java.util.Scanner;

public class vlad_best_five {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        while(t>0){
            String str= sc.nextLine();
            System.out.println(Vlad(str));
            t--;
        }
    }
    public static String Vlad(String str){
        int a=0;
        int b=0;
        for (int i=0; i<str.length();i++){
            if (str.charAt(i) == 'A'){
                a++;
            }
            else {
                b++;
            }
        }
        if(a>b){
            return "A";
        }
        else {
            return "B";
        }
    }
}
