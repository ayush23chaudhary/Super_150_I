package lec7;

import java.util.Scanner;

public class chewbacca_no {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long n= sc.nextLong();
        System.out.println(chew(n));
    }
    public static long chew(long n){
        long temp=0;
        long p=1;
        while (n > 0) {
            int rem= (int) (n%10);
            int c=9-rem;
            if (c < rem) {
                if (c==0 && n<10){
                    temp+= rem*p;
                }
                else {
                    temp+= c*p;
                }

            }
            else{
                temp+= rem*p;
            }
            p*=10;
            n/=10;
        }
        return temp;
    }
}
//import java.util.*;
//public class chewbacca_no {
//    public static void main(String args[]) {
//        // Your Code Here
//        Scanner sc = new Scanner(System.in);
//        long n = sc.nextLong();
//        sc.close();
//        //long temp =n;
//        int mul = 1;
//        long ans = 0;
//        int count = (int)Math.log10(n) + 1;
//        int counter = 1;
//        while(n>0){
//            long rem = (int)n%10;
//            long add = mul*Math.min(rem, 9 - rem);
//            if(n<10 && (9-rem) == 0){
//                add = mul*rem;
//            }
//            ans = ans +  add;
//            mul*=10;
//            n/=10;
//            counter++;
//        }
//        System.out.println(ans);
//    }
//}
