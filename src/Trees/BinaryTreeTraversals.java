package Trees;

import List.Node;

public class BinaryTreeTraversals {
    public static void inOrderTraversal(Node node){
        if(node != null){
            inOrderTraversal(node.left);
            System.out.print(node.value + " ");
            inOrderTraversal(node.right);
        }
    }
    public static  void  preOrderTraversal(Node node){
        if(node != null){
            System.out.print(node.value +" ");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }
    public static  void postOnderTraversal(Node node){
        if(node != null){
            postOnderTraversal(node.left);
            postOnderTraversal(node.right);
            System.out.print(node.value + " ");
        }
    }
}
