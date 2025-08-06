package lec20_season_2_recursion;

public class first_occur {
    public static void main(String[] args) {
        int[] arr={2,3,4,8,5,4,9,1};
        int item =4;
        System.out.println(Index(arr,item,0));
    }
    public static int Index(int[] arr,int item,int i){
        if (i==arr.length){
            return -1;
        }
        if(arr[i]==item){
            return i;
        }
        return Index(arr,item,i+1);
    }
}
