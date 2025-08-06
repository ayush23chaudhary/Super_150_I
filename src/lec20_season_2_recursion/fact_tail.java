package lec20_season_2_recursion;

public class fact_tail {
    public static void main(String[] args) {
        int n=5;
        System.out.println(fact(n,1));

    }
    public static int fact(int n,int ans){
        if(n==0){
            return ans;
        }
        return fact(n-1,ans*n);
    }
}
