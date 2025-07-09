package Trees.ExerciseThree;

import List.Node;

public class MaximunDepth {

    public int maxDepth(Node root){
        if(root == null)return 0;
        int depthLeft = maxDepth(root.left)+1;
        int depthRight = maxDepth(root.right)+1;
        return  Math.max(depthLeft,depthRight);

    }
}
