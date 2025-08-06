package assign_6926_4;

import java.util.Scanner;

public class rotate_anticlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] arr= new int[row][col];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        rotate(arr,row,col);
//        int[][] arr1= rotate(arr,row,col);
//        for(int i=0;i<arr1.length;i++){
//            for(int j=0;j<arr1[0].length;j++){
//                System.out.print(arr1[i][j]+" ");
//            }
//            System.out.println();
//        }

    }
    public static void rotate(int[][] arr,int row,int col){
        int n=col-1;
        while (n>=0){
            for(int i=0;i<row;i++){
                System.out.print(arr[i][n]+" ");
            }
            System.out.println();
            n--;

        }

    }
}
