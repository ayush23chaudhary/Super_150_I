package leetcode;

public class prob_81 {
    public static void main(String[] args) {
        int[] arr= {2,5,6,0,0,1,1,2};
        int target=0;
        int k=0;
        int n=arr.length;
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                k=(i-1);
                break;
            }
        }
        reverse(arr,0,k);
        reverse(arr,k+1,n-1);
        reverse(arr,0,n-1);
        for (int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();

        int hi=n-1;
        int lo=0;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if (arr[mid]>target){
                hi=mid-1;
            }
            else if(arr[mid]==target){
                System.out.println(true);
            }
            else{
                lo=mid+1;
            }
        }
        System.out.println(false);


    }
    public static void reverse(int[] arr,int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
