package assign_3;

import java.util.Scanner;

public class ramu_cab {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t>0){
            int[] cost= new int[4];
            for(int i=0;i<4;i++){
                cost[i]= sc.nextInt();
            }
            int[] times= new int[2];
            for(int i=0;i<2;i++){
                times[i]= sc.nextInt();
            }
            int[] rick= new int[times[0]];
            for(int i=0;i<times[0];i++){
                rick[i]= sc.nextInt();
            }
            int[] cab= new int[times[1]];
            for(int i=0;i<times[1];i++){
                cab[i]= sc.nextInt();
            }
            System.out.println(min_cost(cost, times, rick, cab ));
            t--;
        }

    }
    public static int min_cost(int[]cost,int[] times,int[] rick,int[] cab){
        int trick=0; int tcab=0;int temp1=0; int temp2=0;
        for(int i:rick){
            temp1+=Math.min(i*cost[0], cost[1]);
        }
        trick=Math.min(temp1,cost[2]);
        for(int i:cab){
            temp2+=Math.min(i*cost[0], cost[1]);
        }
        tcab=Math.min(temp2,cost[2]);
        int total_cost= Math.min(tcab+trick, cost[3]);
        return total_cost;

    }
}
