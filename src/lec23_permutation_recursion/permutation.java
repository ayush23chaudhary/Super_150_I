package lec23_permutation_recursion;

import java.util.*;

public class permutation {
    static Integer c=0;
    public static void main(String[] args) {
        String s="cabc";
        int n= s.length();
        String ans="";
        List<String> l1= new ArrayList<>();
        permu(s,n,ans,l1);

    }
    public static void permu(String s,int n,String ans, List<String> l1){
        if (s.length()==0){
            System.out.println(ans);
            l1.add(ans);
            return;
        }
        for (int i=0;i<n;i++){
            char ch=s.charAt(i);
            String s1=s.substring(0,i);
            String s2=s.substring(i+1);
            permu(s1+s2,(s1+s2).length(),ans+ch,l1);

        }
    }
}
