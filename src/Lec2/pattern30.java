package Lec2;
import java.util.Scanner;
public class pattern30 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int row=1;
        int val=1;
        while (row <= (n*2)-1) {
            int i=1;
            while (i<=(val*2)-1){
                if (i%2!=0){
                    System.out.print(val+" ");
                }
                else {
                    System.out.print("* ");
                }
                i++;
            }
            if (row < n) {
                val++;
            }
            else{
                val--;
            }
            System.out.println();
            row++;

        }
    }
}
