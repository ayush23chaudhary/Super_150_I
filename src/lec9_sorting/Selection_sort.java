package lec9_sorting;

public class Selection_sort {
    public static void main(String[] args) {
        int[] arr={2,0,-1,4,8,2,3,4};
        Sort(arr);
        for(int i:arr){
            System.out.println(i);
        }
    }
    public static void Sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int idx=min_ith_index(arr,i);
            int temp=arr[i];
            arr[i]=arr[idx];
            arr[idx]=temp;
        }
    }
    public static int min_ith_index(int[] arr,int i){
        int min_i=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]<arr[min_i]){
                min_i=j;
            }
        }
        return min_i;
    }
}
