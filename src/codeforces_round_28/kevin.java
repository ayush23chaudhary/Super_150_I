package codeforces_round_28;

import java.util.Scanner;

public class kevin {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            long n=sc.nextLong();
            System.out.println(check(n));
            t--;
        }
    }
    public static String check(long  n){
        String s= String.valueOf(n);
        while (true) {
            if (s.contains("33")) {
                s = s.replace("33", "");
                if (s.isEmpty()) {
                    return "YES";
                }
            } else {
                try {
                    n = Long.parseLong(s);
                    if (n % 33 == 0) {
                        return "YES";
                    } else {
                        return "NO";
                    }
                } catch (NumberFormatException e) {
                    return "NO";
                }
            }
        }

    }

}
