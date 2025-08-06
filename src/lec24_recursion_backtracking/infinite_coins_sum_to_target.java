package lec24_recursion_backtracking;

public class infinite_coins_sum_to_target {
    static Integer k=0;
    public static void main(String[] args) {
        int[] coin={1,2,3};
        int amount=3;
        permu(coin,amount,"");
        System.out.println();
        System.out.println(k);

    }
    public static void permu(int[] coin,int amount,String ans){
        if (amount==0){
            k++;
           System.out.print(ans+" ");
            return;
        }
        for (int i=0;i<coin.length;i++){
            if (amount>=coin[i]){
                permu(coin,amount-coin[i],ans+coin[i]);
            }

        }
    }
}
