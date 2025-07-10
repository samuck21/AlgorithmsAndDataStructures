package Grafos;

public class DepthFirstSearch {
    public static boolean depthFirstSearch(Graph graph,String target){
        for(GraphNode node: graph.nodes.values()){
            if(){}
        }
    }
    private static boolean recursiveDfsHelper(GraphNode currentNode, String target){
        if(currentNode.value.equals(target))return true;
        currentNode.status = GraphNodeStatus.Visited;
       for(GraphNode node : currentNode.adjacents.values()){
        if(node.status != Gra)
       }
    }
}
