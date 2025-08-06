package lec7;

public class array_max {
    public static void main(String[] args) {
        int[] arr={2,3,4,11,7,8,9};
        System.out.println(Max(arr));

    }
    public static int Max(int arr[]){
        int c=arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i]>c){
                c=arr[i];
            }
        }
        return c;
    }
    public static int Max2(int arr[]){
        int c=Integer.MIN_VALUE;  // -2^31
        for (int i=1;i<arr.length;i++){
            if (arr[i]>c){
                c=arr[i];
            }
        }
        return c;
    }
}
