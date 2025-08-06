package lec25_backtracking;

import java.util.*;

public class Combination_sum_leetcode {
    public static void main(String[] args) {
        int[] coin={2,3,6,7};
        int amount=3;
        List<Integer> l1= new ArrayList<>();
        List<List<Integer>> ans= new ArrayList<>();

        permu(coin,amount,l1,0,ans);

    }
    public static void permu(int[] coin,int amount,List<Integer> l1,int idx,List<List<Integer>> ans){
        if (amount==0){
            System.out.println(ans);
            ans.add(new ArrayList<>(l1));
            return;
        }
        for (int i=idx;i<coin.length;i++){
            if (amount>=coin[i]){
                l1.add(coin[i]);
                permu(coin,amount-coin[i],l1,i,ans);
                l1.remove(l1.size()-1);

            }

        }

    }
}
