package Grafos.ExerciseTwo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class CloneGraph {
    public class Node{
        public  int val;
        public List<Node> neighbors;
    }
    public Node cloneGraph(Node node){
        HashMap<Integer,Node> map = new HashMap<>();
        return clone(node,map);
    }
    private Node clone(Node  node, HashMap<Integer,Node>map){
        if(node == null)  return null;
        if(map.containsKey(node.val))return map.get(node.val);

        Node newNode = new Node();
        newNode.val = node.val;
        newNode.neighbors = new ArrayList<>();

        map.put(newNode.val,newNode);
        for(Node n: node.neighbors) newNode.neighbors.add(clone(n,map));
        return newNode;
    }
}
