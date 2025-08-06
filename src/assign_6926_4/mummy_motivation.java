package assign_6926_4;

import java.util.Scanner;

public class mummy_motivation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row=sc.nextInt();
        int col=row;
        int[] [] arr= new int[row][col];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(lower(arr,row,col));
    }
    public static boolean lower(int[][] arr,int row,int col){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if (i<j && arr[i][j]!=0){
                    return false;
                }
            }
        }
        return true;
    }
}
