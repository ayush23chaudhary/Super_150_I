package lec14_binary_advance;

import java.util.Scanner;

public class book_allocation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[] page=new int[n];
            for (int j=0;j<n;j++){
                page[j]=sc.nextInt();
            }
            System.out.println(Min_page(page,m));
        }
    }
    public static int Min_page(int[] page, int nos){
        int lo=0;
        int hi=0;
        int ans=0;
        for (int i=0;i<page.length;i++){
            hi=hi+page[i];

        }
        while (lo<=hi){
            int mid=(lo+hi)/2;
            if (isitpossible(page,nos,mid)){
                ans=mid;
                hi=mid-1;

            }else {
                lo=mid+1;
            }
        }return ans-1;

    }
    public static boolean isitpossible(int[] page, int nos,int mid){
        int student=1;
        int readpage=0;
        int i=0;
        while (i < page.length) {
            if (readpage+page[i]<mid){
                readpage+=page[i];
                i++;
            }
            else {
                student++;
                readpage=0;
            }
            if (student>nos){
                return false;
            }
        }
        return true;
    }

}
