package lec9_sorting;

public class bubble_sort {
    public static void main(String[] args) {
        int[] arr={1,5,3,4,2};
        Sort(arr);
        for(int i:arr){
            System.out.println(i);
        }
    }
    public static void Sort(int[] arr ){
        for (int i=1;i<arr.length;i++){
            for (int j=0;j< arr.length-i;j++){
                if (arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
