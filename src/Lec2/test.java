package Lec2;
import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int even=0;
        int odd=0;
        int n= sc.nextInt();
        String str= String.valueOf(n);
        for (int i=0; i< str.length();i++){
            if(i%2==0){
                even += str.charAt(i);
            }
            else{
                odd +=str.charAt(i);
            }
        System.out.println(odd);
        System.out.println(even);


        }
    }
}
