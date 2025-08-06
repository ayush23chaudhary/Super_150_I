package lec7;

public class rotate_array_leetcode {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7};
        int k=38;
        k=k%(arr.length);
        for (int i=1;i<=k;i++){
            rotate(arr);
        }

        System.out.println(arr);

    }
    public static void rotate(int[] arr){
        int c= arr[arr.length-1];
        for (int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];

        }
        arr[0]=c;
    }
}
