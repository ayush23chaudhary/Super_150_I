package lec15_string;

public class reversed_words_in_a_string {
    public static void main(String[] args) {
        String s="  the sky is    blue  ";
        s.trim();
        String[] arr=s.split("\s+");
        String ans="";
        for (int i=arr.length-1;i>=0;i--){
            ans+=arr[i]+" ";

        }
//        return ans.trim();
    }
}
