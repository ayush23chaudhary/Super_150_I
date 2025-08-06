package JP_Morgan;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Meeting_rooms_II {
    public static void main(String[] args) {
        int[][] intervals={};
    }
    public static void Meeting_room(int[][] intervals){
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        PriorityQueue<int[]> pq= new PriorityQueue<>(((a,b)->a[1]-b[1]));
        pq.add(intervals[0]);
        int  room=1;
        for (int i=1;i< intervals.length;i++){
            if (pq.peek()[1]>intervals[i][0]){
                room++;
                pq.add(intervals[i]);
            }
            else {
                pq.remove();
                pq.add(intervals[i]);
            }
        }
    }
}
