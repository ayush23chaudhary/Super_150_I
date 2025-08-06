//package lec38_binary_tree_traversal;
//
//
//import java.util.Scanner;
//
//public class treequestion {
//    class Node{
//        int val;
//        BinaryTree.Node left;
//        BinaryTree.Node right;
//
//    }
//    private BinaryTree.Node root;
//    Scanner sc= new Scanner(System.in);
//    public BinaryTree(){
//        root=CreateTree();
//    }
//    private BinaryTree.Node CreateTree(){
//        int item=sc.nextInt();
//        BinaryTree.Node nn= new BinaryTree.Node();
//        nn.val=item;
//        boolean hlc= sc.nextBoolean();
//        if (hlc){
//            nn.left= CreateTree();
//        }
//        boolean hrc= sc.nextBoolean();
//        if (hrc){
//            nn.right= CreateTree();
//
//        }
//        return nn;
//    }
//    public boolean find(int item){
//        return find(root,item);
//    }
//    private boolean find(Node nn,int item){
//        if (nn=null){
//            return false;
//        }
//        if (nn.val==item){
//            return true;
//        }
//        boolean left=find(nn.left,item);
//        boolean right =find(nn.right,item);
//        return left||right;
//    }
//}
