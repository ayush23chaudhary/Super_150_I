package lec7;

public class array_reverse {
    public static void main(String[] args) {
        int[] arr={2,3,4,1,7,8,9};
        reverse(arr);
        for (int j : arr) {
            System.out.print(j + "  ");
        }

    }
    public static void reverse(int[] arr){
        int i=0;
        int j= arr.length-1;
        while (i < j) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
