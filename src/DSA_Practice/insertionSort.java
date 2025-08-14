package DSA_Practice;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr={5,2,7,3,9,5,2};
        sort(arr);
        print(arr);
    }
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void sort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
//                arr[j]=key;
                j--;
            }
            arr[j+1]=key;
        }
    }
}
