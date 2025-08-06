package lec9_sorting;

public class Insertion_sort {
    public static void main(String[] args) {
       int[] arr={1,2,9,7,8,3,11,4};
       Sort(arr);
       for(int i:arr){
           System.out.println(i);
       }
    }
    public static void Sort(int[] arr){
        for (int i=0 ; i<arr.length; i++){
            Insert_last_element(arr,i);
        }
    }
    public static void Insert_last_element(int[] arr,int i){
        int item= arr[i];
        int j=i-1;
        while(j>=0 && arr[j]>item){
            arr[j+1]=arr[j];
            arr[j]=item;
            j--;
        }

    }
}
