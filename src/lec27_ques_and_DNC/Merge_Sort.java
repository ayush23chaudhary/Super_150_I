package lec27_ques_and_DNC;

public class Merge_Sort {
    public static void main(String[] args) {
        int[] arr={5,7,3,4,2};

    }
    static int[] Sort(int[] arr,int si,int ei){
        if (si==ei){
            int[] bs=new int[1];
            bs[0]=arr[si];
            return bs;
        }
        int mid=(si+ei)/2;
        int[] a= Sort(arr,si,mid);
        int[] b=Sort(arr,mid+1,ei);
        return Merge_two_array(a,b);

    }
    static int[] Merge_two_array(int[] arr1,int[] arr2){
        int n=arr1.length;
        int m=arr2.length;
        int[] ans= new int[n+m];
        int i=0,j=0,k=0;
        while (i<n && j<m){
            if(arr1[i]>arr2[j]){
                ans[k]=arr2[j];
                k++;
                j++;

            }
            else {
                ans[k]=arr1[i];
                k++;
                j++;

            }
        }
        while (i<n){
            ans[k]=arr1[i];
            k++;
            i++;
        }
        while (j<m){
            ans[k]=arr2[j];
            k++;
            j++;
        }
        return ans;

    }
}
