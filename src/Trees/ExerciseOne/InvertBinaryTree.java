package Trees.ExerciseOne;

import List.Node;

public class InvertBinaryTree {
    public Node invertTree(Node root){
        if(root == null) return null;
        Node tmp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(tmp);
        return root;
    }
}
