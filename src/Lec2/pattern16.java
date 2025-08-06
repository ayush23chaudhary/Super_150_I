package Lec2;

public class pattern16 {
    public static void main(String[] args) {
        int n=9;
        int star=5;
        int row=1;
        int space=4;
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
            if (row<=5){
                space-=1;
                star--;
            }
            else{
                space+=1;
                star++;
            }


        }
    }
}
