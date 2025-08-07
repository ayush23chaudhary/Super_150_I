package lec40_binary_search_tree;

public class bst_formation {

        // In order traversal for bst is always sorted
        // Skewed tree: all node are on side either left or right
    class Node{
        int val;
        Node left;
        Node right;
    }
    private Node root;
    public bst_formation(int[] in){
        root = Create_Tree(in,0,in.length-1);
    }
    private Node Create_Tree(int[] in,int si,int ei){
        if (si>ei) {
            return null;
        }
        int mid=(si+ei)/2;
        Node nn= new Node();
        nn.val=in[mid];
        nn.left=Create_Tree(in,si,mid-1);
        nn.right=Create_Tree(in,mid+1,ei);
        return nn;
    }


}
