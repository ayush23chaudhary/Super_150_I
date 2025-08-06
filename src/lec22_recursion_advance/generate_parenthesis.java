package lec22_recursion_advance;
import java.util.*;
public class generate_parenthesis {
    public static void main(String[] args) {
        int n=3;
        List<String> l1=new ArrayList<>();
        parent(n,0,0,"",l1);

    }
    public static void parent(int n, int open, int close, String ans, List<String> l1){
        if(n==open && close==n){
            System.out.println(ans);
            l1.add(ans);
            return;
        }
        if (close>open || open>n){
            return;
        }
        parent(n,open+1,close,ans+"(",l1);
        parent(n,open,close+1,ans+")",l1);
    }
}
