package lec36_comparator_and_comparable;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Busyman {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        Pair [] arr = new Pair[n];
        for (int i=0;i<n;i++){
            int st=sc.nextInt();
            int ei=sc.nextInt();
            arr[i]= new Pair(st,ei);

        }
        Arrays.sort(arr, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o1.ei-o2.ei;
            }
        });
        int activity=1;
        int end=arr[0].ei;
        for (int i=1;i<arr.length;i++){
            if (arr[i].st>=end){
                activity++;
                end=arr[i].ei;
            }
        }
        System.out.println(activity);

    }
    static class Pair{
        int st;
        int ei;
        public Pair(int st,int ei){
            this.st=st;
            this.ei=ei;


        }
    }
}
