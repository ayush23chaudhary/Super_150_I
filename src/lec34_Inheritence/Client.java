package lec34_Inheritence;

public class Client {
    public static void main(String[] args) {
//        CASE-1
//        p obj = new p();
//        System.out.println(obj.d);
//        System.out.println(obj.d1);
//        obj.fun();
//        obj.fun1();

//      CASE-2
        p obj= new C();
        System.out.println(obj.d);
        System.out.println(obj.d1);
        System.out.println(((C) obj).d2);
        System.out.println(((C) obj).d);
        obj.fun();
        obj.fun1();


    }
}
