package lec25_backtracking;

import java.util.ArrayList;
import java.util.List;

public class palindrome_partiitioning {
    public static void main(String[] args) {
        String ques="nitin";
        List<String> l1= new ArrayList<>();
        List<List<String>> ans= new ArrayList<>();
        partitioning(ques,l1,ans);
    }
    public static void partitioning(String ques,List<String> l1,List<List<String>> ans){
        if(ques.length()==0){
            System.out.println(ans);
            ans.add(new ArrayList<String>(l1));
            return;
        }
        for (int cut=1;cut<=ques.length();cut++){
            String s= ques.substring(0,cut);
            if (isPalindrome(s)){
                l1.add(s);
                partitioning(ques.substring(cut),l1,ans);
                l1.remove(l1.size()-1);
            }

        }
    }
    public static boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if (s.charAt(i)!=s.charAt(j)){
                return false;

            }i++;
            j--;
        }
        return true;
    }
}
