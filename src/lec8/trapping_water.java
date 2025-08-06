package lec8;

public class trapping_water {
    public static void main(String[] args) {
        int[] arr={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(arr));

    }
    public static int trap(int[] arr){
        int  n=arr.length;
        int[] left= new int[n];
        int[] right= new int[n];
        // left array making
        left[0]=arr[0];
        for (int i=1;i<n;i++){
            left[i]=Math.max(left[i-1], arr[i]);
        }
        //right array makig
        right[n-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            right[i]=Math.max(right[i+1],arr[i]);
        }
        // calc total area
        int sum=0;
        for(int i=0; i<arr.length;i++){
            sum+=Math.min(left[i],right[i])-arr[i];
        }
        return sum;

    }
}
