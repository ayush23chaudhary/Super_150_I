package lec41_pq_and_heapmap;

import java.util.ArrayList;

public class Heap {
    public ArrayList<Integer> l1= new ArrayList<>();
    public void add(int item){
        l1.add(item);
        upheapify(l1.size()-1);
    }
    private void upheapify(int ci){
        int pi= (ci-2)/2;
        if (l1.get(pi)>l1.get(ci)){
            swap(pi,ci);
            upheapify(pi);
        }
    }
    private void swap(int pi,int ci){
        int pith=l1.get(pi);
        int cith=l1.get(ci);
        l1.set(pi,cith);
        l1.set(ci,pith);
    }
    private void downheapify(int pi){
        int lci=2*pi+1;
        int rci=2*pi+2;
        int mini=pi;
        if (lci<l1.size() && l1.get(mini)>l1.get(lci)){
            mini=lci;
        }
        if (rci<l1.size() && l1.get(mini)>l1.get(rci)){
            mini=rci;
        }
        if (mini!=pi){
            swap(mini,pi);
            downheapify(mini);
        }
    }
    public int get(){
        return l1.get(0);

    }
    public int size(){
        return l1.size();
    }
    public void Display(){
        System.out.println(l1);
    }
}
