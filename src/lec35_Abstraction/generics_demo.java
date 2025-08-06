package lec35_Abstraction;

public class generics_demo {
    public static void main(String[] args) {
        Integer[] arr={10,20,40,4,50};
        Display(arr);
        String[] arr1={"kaju","raju","monu","ayush","akshat"};
        Display(arr1);


    }
    public static <T>void Display(T[] arr){
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public  static <T> T get(T[] arr){
        return arr[0];
    }
}
