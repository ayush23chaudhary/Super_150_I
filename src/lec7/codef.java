package lec7;

import java.util.Scanner;

public class codef {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int c=1;
        int rem1=n%10;
        if (rem1 == 0) {
            c-=1;
        }
        int m=0;
        n/=10;
        while (n> 0){
            int rem2=n%10;
            if(rem2==0 || rem1==0){
                c+= Math.abs(rem1-rem2)+(9-rem2)+1;
            }
            else{
                c+= Math.abs(rem1-rem2)+1;
            }
            if (n<10) {
                c+=rem2-1;
            }
            rem1=rem2;
            n/=10;
            m++;
        }
        if (m<=2){
            c+=17;
        }
        System.out.println(c);
    }
}
