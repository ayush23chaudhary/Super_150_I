package lec15_string;

public class string_demo {
    public static void main(String[] args) {
        // primitive == content store karta hai aur non primitive m address
        String s1="hello";  //pool banega
        String s2="hello";// pool m banega
        String s3= new String("hello");  //pool ke bahar banega
        String s4 =new String("hello");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        s1=s1+"bye";
        s1= s1.concat("bye");
        String s5= "hello"+"bye"; //pool m banega



    }
}
