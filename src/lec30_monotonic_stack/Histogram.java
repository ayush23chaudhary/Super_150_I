package lec30_monotonic_stack;

import java.util.Stack;

public class Histogram {
    public static void main(String[] args) {
        int[] arr={2,1,5,6,2,3};
        System.out.println(Largest_Histogram(arr));
    }
    static int Largest_Histogram(int[] arr){
        Stack<Integer> st= new Stack<>();
        int ans=0;
        for (int i=0;i< arr.length;i++){
            while (!st.isEmpty() && arr[i]<arr[st.peek()]){
                int h=arr[st.pop()];
                int r=i;
                if (st.isEmpty()){
                    ans= Math.max(h*r,ans);

                }else {
                    int l=st.peek();
                    int area=h*(r-l-1);
                    ans= Math.max(area,ans);

                }
            }
            st.push(i);
        }
        int r= arr.length;
        while (!st.isEmpty() ){
            int h=arr[st.pop()];
//            int r=i;
            if (st.isEmpty()){
                ans= Math.max(h*r,ans);

            }else {
                int l=st.peek();
                int area=h*(r-l-1);
                ans= Math.max(area,ans);

            }
        }
        return ans;
    }
}
