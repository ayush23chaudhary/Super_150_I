package lec23_permutation_recursion;

public class permutation_duplicate {
    public static void main(String[] args) {
        String ques="abca";
        String ans="";
        permu(ques, ques.length(),ans);
    }

    public static void permu(String s,int n,String ans){
        if (s.length()==0){
            System.out.println(ans);
            return;
        }
        for (int i=0;i<n;i++){
            if(!isValid(s,i,s.charAt(i))){
                char ch=s.charAt(i);
                String s1=s.substring(0,i);
                String s2=s.substring(i+1);
                permu(s1+s2,(s1+s2).length(),ans+ch);
            }

        }
    }


    public static boolean isValid(String str,  int i, char ch){
        for (int j=i+1;j<str.length();j++){
            if (str.charAt(j)==ch){
                return true;
            }
        }
        return false;
    }
}
