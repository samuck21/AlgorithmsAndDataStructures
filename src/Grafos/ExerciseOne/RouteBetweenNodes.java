package Grafos.ExerciseOne;

import Grafos.Graph;
import Grafos.GraphNode;
import Grafos.GraphNodeStatus;

import java.util.LinkedList;
import java.util.Queue;

public class RouteBetweenNodes {
    public boolean isRouteBetween(Graph g , GraphNode start,GraphNode end){
    if(start == end) return true;
        Queue<GraphNode> queue = new LinkedList<>();
        queue.add(start);
        while (!queue.isEmpty()){
            GraphNode next = queue.remove();
            if(end == next)return true;

            for(GraphNode n: next.adjacents.values()){
                if(!n.status.equals(GraphNodeStatus.Visited)){
                    queue.add(n);
                    n.status = GraphNodeStatus.Visited;
                }
            }
        }
        return false;
    }
}
