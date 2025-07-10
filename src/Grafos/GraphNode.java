package Grafos;

import java.util.HashMap;

public class GraphNode {
    public String value;
    public GraphNodeStatus status;
    public HashMap<String,GraphNode>adjacents;

    public GraphNode(String value){
        this.value = value;
        this.adjacents =new HashMap<String,GraphNode>();
        this.status = GraphNodeStatus.Unvisited;
    }
    public GraphNode(String value, HashMap<String,GraphNode>adjacents){
        this.value = value;
        this.adjacents = adjacents;
    }
    public void addNeighbor(GraphNode node){
        if(!adjacents.containsKey(node.value));
    }

}
