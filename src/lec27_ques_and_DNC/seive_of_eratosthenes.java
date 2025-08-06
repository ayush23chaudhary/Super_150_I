package lec27_ques_and_DNC;

public class seive_of_eratosthenes {
    public static void main(String[] args) {
        int n=180;
        System.out.println(Prime(n));
    }
    static int Prime(int n){
        int[] ans=new int[n];
        ans[0]=ans[1]=1;
        for (int i=2;i*i<= ans.length;i++){
            if (ans[i]==0){
                for (int j=2;i*j<ans.length;j++){
                    ans[i*j]=1;
                }
            }
        }
        int c=0;
        for (int i=2;i<ans.length;i++){
            if (ans[i]==0){
                c++;
            }
        }
        return c;
    }
}
