package lec34_Inheritence;

public class Add_number {
    public static void main(String[] args) {
        System.out.println(add(2,7));
        System.out.println(add(2,3,4));
    }
    public static int add(int a,int b){
        return a+b;
    }
    public static int add(int a,int b,int c){
        return a+b+c;

    }
    public static int add(int a , int b, double c){
        return (int) (a+b+c);
    }
    public static int add(int x,int...a){
        int sum=0;
        for (int i=0;i<a.length;i++){
            sum=sum=a[i];
        }return sum;
    }
}
