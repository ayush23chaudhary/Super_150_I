package JP_Morgan;

import java.util.Collections;
import java.util.PriorityQueue;

public class Priority_Queue_heap {
    public static void main(String[] args) {
//        PriorityQueue<Integer> pq= new PriorityQueue<>();  minheap
        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
        pq.add(27);
        pq.add(217);
        pq.add(27);
        pq.add(2);
        pq.add(-27);
        pq.add(37);
        System.out.println(pq.peek());  //view smallest element
        System.out.println(pq.poll()); // delete
        System.out.println(pq.peek());// view
        System.out.println(pq);


    }
}
