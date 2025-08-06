package lec7;

public class linear_seach {
    public static void main(String[] args) {
        int[] arr={2,3,4,1,7,8,9};
        int item=4;
        System.out.println(Search(arr,item));

    }
    public static int Search(int[] arr, int item){
        for (int i=1;i<arr.length;i++){
            if (arr[i]==item){
                return i;
            }
        }
        return -1;
    }
}
