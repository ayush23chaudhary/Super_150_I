package DSA_Practice;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr={5,2,7,3,9,5,2};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        sort(arr);

        print(arr);
    }
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void sort(int[] arr){
        int n= arr.length;
//        yahan par humne ek element pakda
        for (int i =0;i<n-1;i++){
            int minel=arr[i];  // isko minnimum element mana h
            int minindex=i;
            for (int j=i+1;j<n;j++){
                if (arr[j]<minel){ // agar koi min se chhota h toh uska index min m daal diya
                    minel=arr[j];
                    minindex=j;
                }
            }
            swap(arr,i,minindex);// min ele ko assumed min ele se swap kar diya

        }
    }
    public static void swap(int[] arr,int i,int minindex){
        int temp=arr[i];
        arr[i]=arr[minindex];
        arr[minindex]=temp;
    }
}
