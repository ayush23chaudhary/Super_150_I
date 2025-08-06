package JP_Morgan;

import java.util.Arrays;

public class stream_api {
    public static void main(String[] args) {
        int arr[]= {4,67,53,8,34,25,78};
        Arrays.stream(arr)
                .filter(ele->ele%2==0)
                .forEach(System.out::println);

        int sum=Arrays.stream(arr)
                .sum();
        System.out.println("sum = "+sum);
//        IntStream stream= Arrays.stream(arr);
//        int max= stream.max();
    }
}
