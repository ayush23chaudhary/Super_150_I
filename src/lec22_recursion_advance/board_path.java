package lec22_recursion_advance;

public class board_path {
    public static void main(String[] args) {
        int n=4;
        print(n,0,"");
    }
    public static int print(int n, int curr, String ans){
        if (curr==n){
            System.out.println(ans);
            return 1;
        }
        if (curr>n){
            return 1;
        }
        int x=0;
        for (int dice=1;dice<=3;dice++){
            x+=print(n,curr+dice, ans+dice);
        }
        return x;

    }
}
