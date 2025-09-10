//package lec43_hashmap;
//
//import java.util.ArrayList;
//
//public class HashMap<K, V> {
//    class Node {
//        K key;
//        V value;
//        Node next;
//    }
//
//    private int size = 0;
//    ArrayList<Node> bucket = new ArrayList<>();
//
//    public HashMap() {
//        // TODO Auto-generated constructor stub
//        this(4);
//    }
//
//    public HashMap(int n) {
//        // TODO Auto-generated constructor stub
//        for (int i = 0; i < n; i++) {
//            bucket.add(null);
//        }
//    }
//
//    public void put(K key, V value) {
//        // TODO Auto-generated method stub
//        int idx = hasFun(key);
//        Node temp = bucket.get(idx);
//        while (temp != null) {
//            if (temp.key.equals(key)) {
//                temp.value = value;
//                return;
//            }
//            temp = temp.next;
//        }
//
//        Node nn = new Node();
//        nn.key = key;
//        nn.value = value;
//        temp = bucket.get(idx);
//        nn.next = temp;
//        bucket.set(idx, nn);
//        size++;
//        double thf= 2.0;
//        double lf= (1.0*size)/bucket.size();
//        if (lf>thf){
//            rehashing();
//        }
//    }
//    private void rehashing(){
//        ArrayList<Node> new_bukt= new ArrayList<>();
//        for (int i=0;i<2* bucket.size();i++){
//            new_bukt.add(null);
//        }
//        ArrayList<Node> oba= bucket;
//        bucket= new_bukt;
//        size=0;
//        for (Node nn:oba){
//            while (nn!=null){
//                put(nn.key,nn.value);
//            }
//        }
//    }
//    @Override
//    public String toString(){
//        String s="{";
//        for (Node nn:bucket){
//            while (nn!=null){
//                s=s+nn.key+"="+nn.value+",";
////                nn.next;
//            }
//        }
//    }
//
//    public V get(K key) {
//        int idx = hasFun(key);
//        Node temp = bucket.get(idx);
//        while (temp != null) {
//            if (temp.key.equals(key)) {
//                return temp.value;
//            }
//            temp = temp.next;
//        }
//        return null;
//    }
//    public V remove (K key){
//        int idx= hasFun(key);
//        Node curr= bucket.get(idx);
//        Node prev= null;
//        while (curr != null){
//            if (curr.key.equals(key)){
//                break;
//            }
//            prev = curr;
//            curr= curr.next;
//        }
//        if (curr== null){
//            return null;
//        }
//        else if(prev == null){
//            bucket.set(idx, curr.next);
//        }else {
//            prev.next=curr.next;
//        }
//        curr.next=null;
//        size--;
//        return curr.value;
//    }
//
//    public int hasFun(K key) {
//        // TODO Auto-generated method stub
//        int idx = key.hashCode() % bucket.size();
//        if (idx < 0) {
//            idx += bucket.size();
//        }
//        return idx;
//    }
//}
