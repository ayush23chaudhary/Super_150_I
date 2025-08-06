package codeforces_round_28;
import java.util.*;

public class exxir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int c=0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if(arr[i]!=0){
                    c++;
                }
            }
            //Arrays.sort(arr); // Sort once to optimize MEX calculation
            if ( c == 0) {
                System.out.println(0);
            } else if (func(arr) == 0) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }
        sc.close();
    }

    public static int func(int[] arr) {
        // Calculate MEX based on sorted array
        int n = arr.length;
        int mex = 0;
        for (int num : arr) {
            if (num == mex) {
                mex++;
            } else if (num > mex) {
                break; // Break early if current number exceeds MEX
            }
        }
        return mex == arr[n - 1] + 1 ? 0 : 1;
    }
}
