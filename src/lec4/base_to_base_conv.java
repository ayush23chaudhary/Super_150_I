package lec4;
import  java.util.*;
public class base_to_base_conv{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int src = sc.nextInt();
        int des = sc.nextInt();
        long n = sc.nextLong();
        sc.close();
        long ans ;
        ans = Src_dec(n, src);
        ans = Dec_des(ans, des);
        System.out.println(ans);
    }
    public static long Src_dec(long n, int src){
        long mul = 1;
        long ans = 0;
        while(n>0){
            long rem = n%10;
            ans+=mul*rem;
            mul*=src;
            n/=10;
        }
        return ans;
    }
    public static long Dec_des(long n, int des){
        long mul = 1;
        long ans = 0;
        while(n>0){
            long rem = n%des;
            ans+=mul*rem;
            mul*=10;
            n/=des;
        }
        return ans;
    }


}