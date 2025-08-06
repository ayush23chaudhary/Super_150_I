package lec30_monotonic_stack;

import java.util.Stack;

public class Stock_Span {
    public static void main(String[] args) {

    }
    static void Cal_Span(int[] arr){
        int[] ans= new int[arr.length];
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<ans.length;i++){
            while (!st.isEmpty() && arr[i]>=arr[st.peek()]){
                st.pop();

            }if (st.isEmpty()){

            }
        }
    }
}
