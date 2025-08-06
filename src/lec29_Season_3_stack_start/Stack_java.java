package lec29_Season_3_stack_start;
import java.util.Stack;
public class Stack_java {
    public static void main(String[] args) {
        // vector is synchroised while arraylist is not
        Stack<Integer> st= new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        Add_last(st,6);
        System.out.println(st);
        reverse((st));
        System.out.println(st);
    }
    static void reverse(Stack<Integer> st){
        int a= st.pop();
        Add_last(st,a);

    }
    public static void Add_last(Stack<Integer> st,int item){
        if (st.isEmpty()){
            st.push(item);
            return;

        }
        int x=st.pop();
        Add_last(st,item);
        st.push(x);
    }
}
