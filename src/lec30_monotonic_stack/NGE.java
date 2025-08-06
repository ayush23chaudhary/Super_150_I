package lec30_monotonic_stack;

import java.util.Scanner;
import java.util.Stack;

public class NGE {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        NGE(arr);

    }
    static void NGE(int[] arr){
        int[] ans=new int[arr.length];
        Stack<Integer> st= new Stack<>();
        for (int i=0;i<ans.length;i++){
            while (!st.isEmpty() && arr[i]>arr[st.peek()]){
                ans[st.pop()] = arr[i];
            }
            st.push(i);
        }
        while (!st.isEmpty()){
            ans[st.pop()]= -1;
        }
        for (int i=0;i<ans.length;i++){
            System.out.println(arr[i]+" "+ans[i]);
        }
    }
}
