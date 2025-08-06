package lec7;

import java.util.Scanner;

public class shopping_game {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr=0;
        while (n > 0) {
            int i= sc.nextInt();
            arr+=i;
            System.out.println(arr);

        }
    }
}
