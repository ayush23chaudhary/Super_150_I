package lec7;

import java.util.*;

public class replace0_5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long n= sc.nextLong();
        System.out.println(replace(n));
    }
    public static long replace(long n){
        long temp=0;
        int p=0;
        if (n == 0) {
            return 5;
        }
        while (n > 0) {
            int rem= (int) (n%10);
            if (rem == 0) {
                temp+=5*Math.pow(10,p);

            }
            else {
                temp+=rem*Math.pow(10,p);
            }
            p++;
            n/=10;
        }
        return temp;
    }
}
