package Lec2;

public class pattern7 {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        int star=5;
        int space=4;
        while (row<=n){
            if (row==1 || row==5 ){
                int i=1;
                while (i<=star){
                    System.out.print("* ");
                    i++;
                }
            }
        }
    }
}
