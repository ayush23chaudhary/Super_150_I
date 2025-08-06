package lec20_season_2_recursion;

public class Fact {
    public static void main(String[] args) {
        int n=5;
        System.out.println(fact(5));
    }
    public static int fact(int n){
        if (n == 0) {
            return 1;    //smallest valid input answer
        }
        int fn=fact(n-1); //smaller problem
        return fn*n;
    }
}
