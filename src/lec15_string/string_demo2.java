package lec15_string;

public class string_demo2 {
    public static void main(String[] args) {
        String str="shwgsqwygdwddftfftwftywqffdwqtd";
        System.out.println(str.charAt(2));
        System.out.println(str.length());
        System.out.println(str.substring(2,7));
        System.out.println(str.substring(2));


        String s1="hello";
        String s2= new String("hello");
        System.out.println(equals(s1,s1));

    }
    public static boolean equals(String s1, String s2){
        if (s1 == s2) {
            return true;
        }
        if (s1.length()!=s2.length()){
            return false;
        }
        for (int i=0;i<s1.length();i++){
            if (s1.charAt(i)!=s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
