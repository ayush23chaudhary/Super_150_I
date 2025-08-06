package Lec1;

public class prime {
    public static void main(String[] args) {
        int n=10;
        int c=1;
        for(int i=2; i<n; i++){
            if(n%i==0){
                c=0;
            }
        }if(c==1){
            System.out.println("prime");
        } else {
            System.out.println("Not prime");
        }

    }
}
