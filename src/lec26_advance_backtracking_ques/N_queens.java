package lec26_advance_backtracking_ques;

import java.util.Scanner;

public class N_queens {
    public static void main(String[] args) {
        int n=4;
        boolean[][] board= new boolean[n][n];
        print(board,0,n);

    }
    static void print(boolean[][] board,int row,int tq){
        if (tq == 0) {
            Display(board);
            return;
        }
        for (int  col=0;col<board[0].length;col++){
            if(isitsafe(board,row,col)){
                board[row][col]=true;
                print(board,row+1,tq-1);
                board[row][col]=false;
            }
        }
    }
    static boolean isitsafe(boolean[][] board,int row,int col){
        int r=row;
        while(r>=0){
            if (board[r][col]){
                return false;
            }
            r--;
        }
        //diagonal right
        r=row;
        int c=col;
        while (r>=0 && c<board[0].length){
            if (board[r][c]){
                    return false;
            }
            r--;
            c++;

        }
        //diagonal left
        r=row;
        c=col;
        while(r>=0 &&c>=0){
            if (board[r][c]){
                return false;
            }
            r--;
            c--;;
        }
        return true;
    }
    static void Display(boolean[][] board){
        for (int i=0;i<board.length;i++){
            for (int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
