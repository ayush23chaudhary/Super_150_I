package lec19;

public class kartik_bhaiya_and_strings {
    public static void main(String[] args) {
        String s="ababaabbbaaaaaaabababaaaa";
        int k=2;
        int flip_a= maxlen(s,k,'a');
        int flip_b=maxlen(s,k,'b' );
        System.out.println(Math.max(flip_a,flip_a));


    }
    public static int maxlen(String s,int k, char ch){
        int si=0, ei=0, flip=0,ans=0;
        while(ei<s.length()){
            //grow
            if(s.charAt(ei)==ch){
                flip++;
            }
            //shrink
            while (flip>k && si<=ei){
                if (s.charAt(si)==ch){
                    flip--;
                }
                si++;
            }
            //ans update
            ans= Math.max(ans, ei-si+1);
            ei++;
        }
        return ans;
    }
}
