package Lec2;
import java.util.*;
public class patternxy {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n1= sc.nextInt();
        int n=2*n1+1;
        int row=1;
        int space=n1*2-1;
        int s=1;
        while(row<=n){
            int i=1;
            int x=n1;
            while(i<=s){
                System.out.print(x+" ");
                x--;
                i++;
            }
            int j=1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            int k=1;
            int y=x+1;
            while(k<=s){
                if (y!=0) {
                    System.out.print(y+" ");
                }
                y++;
                k++;
            }
            row++;
            if(row<=(n1+1)){
                space-=2;
                s++;
            }
            else{
                space+=2;
                s--;
            }

            System.out.println();

        }
    }
}
