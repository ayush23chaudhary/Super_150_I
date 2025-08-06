package lec15_string;

public class Substring_print {
    public static void main(String[] args) {
        String s="hello";
        PrintSubstring(s);

    }
    public static void PrintSubstring(String s){
        int n=s.length();
        for (int i=0;i<n;i++){
            //System.out.println(s.substring(0,i));
            for (int j=i;j<n;j++){
                System.out.println(s.substring(i,j+1));
            }
        }
    }
}
