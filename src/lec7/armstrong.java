package lec7;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n1= sc.nextInt();
        int n2=sc.nextInt();
        for (int i=n1;i<=n2;i++){
            if (arms(i)==true){
                System.out.println(i);
            }
        }

    }
    public static boolean arms(int n){
        String str= Integer.toString(n);
        int c= str.length();
        int temp=n;
        int ch=0;
        while (n > 0) {
            int rem=n%10;
            ch+=Math.pow(rem,c);
            n/=10;
        }
        if (ch == temp) {
            return true;
        }
        return false;
    }
}
