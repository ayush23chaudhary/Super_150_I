package Lec2;

public class pattern20 {
    public static void main(String[] args) {
        int n=7;
        int row=1;
        int space1=3;
        int space2=0;
        int star=1;
        while (row<=n){
            int i=1;
            while (i<=space1){
                System.out.print("  ");
                i++;
            }
            if (row==1 || row==7){
                System.out.print(" * ");
            }
            else{
                System.out.print("* ");
            }
            int k=1;
            while (k<=space2){
                System.out.print("  ");
                k++;
            }
            if (row == 1 || row == 7) {
                System.out.print("  ");
            }
            else {
                System.out.print("* ");
            }
            row++;
            if (row<=4){
                space2+=2;
                space1--;
            }
            else{
                space2-=2;
                space1++;
            }

            System.out.println();
        }
    }
}
