package lec24_recursion_backtracking;

public class queen_combination {
    public static void main(String[] args) {
        int n=4;
        int tq=2;
        boolean[] board= new boolean[n];
        permu(board,tq,"",0,0);
    }
    public static void permu(boolean[] board, int tq, String ans,int qpsf,int idx){
        if (qpsf==tq){
            System.out.println(ans);
            return;
        }
        for(int i=idx;i<board.length;i++){

            if (board[i] !=true){
                board[i]=true;
                permu(board,tq,ans+"b"+i+"q"+qpsf,qpsf+1,i+1);
//                for( int j=i+1;j<board.length;j++){
//                    board[j]=false;
//                }
                board[i]=false;
            }
        }
    }
}
