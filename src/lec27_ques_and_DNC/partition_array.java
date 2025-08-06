package lec27_ques_and_DNC;

public class partition_array {
    public static void main(String[] args) {
        int[] arr={2,1,5,8,7,3,4};
        int idx= Partition(arr,0,arr.length-1);
        display(arr);
        System.out.print("\n"+"index after operation: "+idx);

    }
    static int Partition(int[] arr,int si,int ei){
        int item =arr[ei];
        int idx=si;
        for (int i=si;i<ei;i++){
            if (arr[i]<=item){
                int temp=arr[i];
                arr[i]=arr[idx];
                arr[idx]=temp;
                idx++;
            }
        }
        int temp=arr[ei];
        arr[ei]=arr[idx];
        arr[idx]=temp;
        return idx;
    }
    static void display(int[] arr){
        for (int i:arr){
            System.out.println(i+" ");
        }
    }
}
