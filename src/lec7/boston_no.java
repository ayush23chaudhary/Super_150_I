package lec7;
import java.util.*;
public class boston_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int temp = n;
        int sumd = 0;
        while(temp>0){
            int rem = temp%10;
            sumd+=rem;
            temp/=10;
        }
        int sump = 0;
        for(int i = 2; i<(int)Math.sqrt(n); i++){
            if(n%i==0){
                while(n%i==0){
                    int temp2 = i;
                    while(temp2>0){
                        sump+=temp2%10;
                        temp2/=10;
                    }
                    n/=i;
                }
            }
        }
        if(n!=1){
            temp = n;
            while(temp>0){
                sump+=temp%10;
                temp/=10;
            }
        }
        if(sump==sumd){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
