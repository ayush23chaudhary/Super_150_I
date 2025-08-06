package lec24_recursion_backtracking;

import java.util.*;

public class coin_combination {
    public static void main(String[] args) {
        int[] coin={1,2,3};
        int amount=3;
        permu(coin,amount,"",0);

    }
    public static void permu(int[] coin,int amount,String ans,int idx){
        if (amount==0){
            System.out.println(ans);
            return;
        }
        for (int i=idx;i<coin.length;i++){
            if (amount>=coin[i]){
                permu(coin,amount-coin[i],ans+coin[i],i);
            }

        }

    }


}
