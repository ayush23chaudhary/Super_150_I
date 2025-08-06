package lec9_sorting;

public class min_index {
    public static void main(String[] args) {
        int[] arr={2,0,-1,4,8,2,3,4};
        min_ith_index(arr,2);
        for(int i:arr){
            System.out.println(i);
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
