package Lec2;

public class pattern6 {
    public static void main(String[] args) {
        int n=5;
        int star=5;
        int row=1;
        int space=0;
        while (row <= n) {
            int j=1;
            while (j<=space){
                System.out.print("  ");
                j++;
            }
            int i=1;
            while (i<=star){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            row++;
            space+=2;
            star--;

        }
    }
}
