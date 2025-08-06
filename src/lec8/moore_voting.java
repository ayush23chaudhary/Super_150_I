package lec8;

public class moore_voting {
    public static void main(String[] args) {
    }
    public static int moore(int[] arr){
        int e=arr[0];
        int v=1;
        for (int i=1; i<arr.length;i++){
            if (arr[i]==e){
                v++;
            }// [1 2 3 1 1 3 ]
            else {
                v--;
                if (v==0){
                    e=arr[i];
                    v=1;

                }
            }
        }
        return e;
    }
}
