package assign_6926_4;

import java.util.Scanner;

public class wave_paattern_columnwise {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[] [] arr= new int[row][col];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        pattern(arr,row,col);
    }
    public static void pattern(int[][] arr, int row, int col){
        int c=0;
        while (c<col){
            if(c%2==0){
                for (int i=0;i<row;i++){
                    System.out.print(arr[i][c]+", ");
                }
            }
            else {
                for (int i=row-1;i>=0;i--){
                    System.out.print(arr[i][c]+", ");
                }
            }
            c++;

        }
        System.out.print("END");
    }
}
