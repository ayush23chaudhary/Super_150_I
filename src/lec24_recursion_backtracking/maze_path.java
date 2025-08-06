package lec24_recursion_backtracking;

public class maze_path {
    public static void main(String[] args) {
        int m=3; // row
        int n=3; // col
        Print(0,0,m-1,n-1,"");

    }
    public static void Print(int cr, int cc, int er,int ec,String ans){
        if (cr==er && cc==ec){
            System.out.println(ans);
            return;
        }
        if (cr>er || cc>ec){
            return;
        }
        Print(cr,cc+1,er,ec,ans+"H");
        Print(cr+1,cc,er,ec,ans+"V");
    }
}
