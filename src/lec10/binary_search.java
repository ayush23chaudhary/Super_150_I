package lec10;

public class binary_search {
    public static void main(String[] args) {
        int[] arr={-1,0,3,5,9,12};
        int item=5;
        System.out.println(binary(arr,item));

    }
    public static int binary(int[] arr,int item){
        int lo=0;
        int hi=arr.length-1;
        while (lo <= hi) {
            int mid=(lo+hi)/2;
            if (arr[mid]==item){
                return mid;
            } else if (arr[mid]>item) {
                hi=mid-1;

            }else {
                lo=mid+1;
            }
        }
        return -1;
    }
}
