package lec20_season_2_recursion;

public class print_ins {
    public static void main(String[] args) {
        int n=5;
        PI(n);

    }
    public static void PI(int n){
        if(n==0){
            return;

        }
        PI(n-1);
        System.out.println(n);

    }
}
