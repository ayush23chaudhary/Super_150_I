package Codeforces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class the_seccret_code {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            ArrayList<Long> numbers = new ArrayList<>(); // For storing integers
            long n= sc.nextLong();
            long x=0,p=1,c=0;
            for(int i=0;i<(int)(Math.log10(n));i++){
                p*=10;
                x=n/(1+p);
                if(n%(1+p)==0){
                    c+=1;
                    numbers.add(x);
                }
            }
            System.out.println(c);
            Collections.reverse(numbers);
            if (c!=0){
                for (Long num : numbers) {
                    System.out.print(num+" ");
                }
                System.out.println();
            }



        }
    }
}
