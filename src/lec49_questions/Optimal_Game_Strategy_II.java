package lec49_questions;

public class Optimal_Game_Strategy_II {

    public static void main(String[] args) {
        int[] arr= {2,3,1,4};
        System.out.println(OGS(arr,0, arr.length)-1);

    }
    public static int OGS(int[] arr, int i,int j){
        int f= arr[i]+Math.min(OGS(arr,i+2,j), OGS(arr,i+1,j-1));
        int s= arr[i]+Math.min(OGS(arr,i+1,j-1), OGS(arr,i,j-2));
        return Math.max(f,s);
    }
}
