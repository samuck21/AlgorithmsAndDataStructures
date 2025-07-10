package Grafos.ExerciseThree;

import Grafos.Graph;
import Grafos.GraphNode;
import Grafos.GraphNodeStatus;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class BuildOrder {

    public ArrayList<String> buildOrder(String[] projects, String[][]dependencies){
          Graph graph = buildDependencyGraph();
          ArrayList<String> sortedProjects = new ArrayList<>();
          for (GraphNode node : graph.nodes.values()){
              depthFirstSearch(node,sortedProjects);
          }
        Collections.reverse(sortedProjects);
          return sortedProjects;
    }
    private void depthFirstSearch(GraphNode node, ArrayList<String>sortedProjects){
    if(node == null) return;
    if(node.status == GraphNodeStatus.Visited){
        node.status = GraphNodeStatus.Visiting;
        for (GraphNode n: node.adjacents.values()){
            depthFirstSearch(n,sortedProjects);
        }
        node.status = GraphNodeStatus.Visited;
        sortedProjects.add(node.value);
    }else if(node.status == GraphNodeStatus.Visiting){
        throw new RuntimeException();
    }
    }

}
