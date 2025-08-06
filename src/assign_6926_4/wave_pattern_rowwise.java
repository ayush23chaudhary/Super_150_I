package assign_6926_4;

import java.util.Scanner;

public class wave_pattern_rowwise {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
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
        for (int i=0;i<row;i++){
            if (i%2==0){
                for (int j=0;j<col;j++){
                    System.out.print(arr[i][j]+", ");
                }
            }
            else{
                for (int j=col-1;j>=0;j--){
                    System.out.print(arr[i][j]+", ");
                }
            }
        }
        System.out.println("END");
    }

}
