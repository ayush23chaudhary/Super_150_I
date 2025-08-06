package lec15_string;

public class pallindrome {
    public static void main(String[] args) {
        String s1= "nitin";
        System.out.println(isPallin(s1));
    }
    public static boolean isPallin(String s){
        int i=0;
        int j=s.length()-1;
        while (i<j){
            if (s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
