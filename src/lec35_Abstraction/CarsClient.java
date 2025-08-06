package lec35_Abstraction;

import java.util.Arrays;
import java.util.Comparator;

public class CarsClient {
    public static void main(String[] args) {
        Cars[] arr= new Cars[5];
        arr[0]= new Cars(200,10,"white");
        arr[1]= new Cars(230,50,"black");
        arr[2]= new Cars(200,10,"red");
        arr[3]= new Cars(200,10,"blue");
        arr[4]= new Cars(200,10,"green");
        Arrays.sort(arr, new Comparator<Cars>() {
            @Override
            public int compare(Cars o1, Cars o2) {
                return o1.price-o2.price;
            }
        });
        display(arr);


    }
    public static void display(Cars[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static <T extends Comparable<T>> void Bubble_sort(T[] arr){
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr.length-i;j++){
                if (arr[j].compareTo(arr[i+1])>0){
                    T temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }

            }
        }
    }
}
