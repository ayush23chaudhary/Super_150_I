package lec7;

import java.util.*;

public class inverse_no {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(inverse(n));

    }
    public static int inverse(int n){
        int place=1;
        int temp=0;
        while (n > 0) {
            int rem=n%10;
            temp+=place*Math.pow(10,rem-1);
            place++;
            n/=10;
        }
        return temp;



    }
}
