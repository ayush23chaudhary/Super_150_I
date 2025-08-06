package lec21_recursion;

public class coin {
    public static void main(String[] args) {
        int n=3;
        head(n,"");

    }
    public static void head(int n, String ans){
        if (n==0){
            System.out.println(ans);
            return;
        }
        head(n-1,ans+"H");
        head(n-1,ans+"T");
    }
}
