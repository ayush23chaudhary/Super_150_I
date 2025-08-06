package lec23_permutation_recursion;

import java.security.Principal;
import java.util.ArrayList;

public class key_pad {
    static String[] key={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String[] args) {
        ArrayList<String> l1=new ArrayList<>();
        String ques="23";
        print(ques,"",l1);
    }
    public static void print(String ques, String ans,ArrayList<String> l1){
        if (ques.length()==0){
            System.out.println(ans);
            l1.add(ans);
            return;

        }
        char ch=ques.charAt(0);
        String getString=key[ch-'0'];
        for (int i=0;i<getString.length();i++){
            print(ques.substring(1),ans+getString.charAt(i),l1);
        }
    }
}
