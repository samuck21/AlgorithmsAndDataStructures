package Grafos.ExerciseThree;

import Grafos.Graph;
import Grafos.GraphNode;
import Grafos.GraphNodeStatus;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class BuildOrder {

    public ArrayList<String> buildOrder(String[] projects, String[][]dependencies){
          Graph graph = buildDependencyGraph(projects,dependencies);
          ArrayList<String> sortedProjects = new ArrayList<>();
          for (GraphNode node : graph.nodes.values()){
              depthFirstSearch(node,sortedProjects);
          }
        Collections.reverse(sortedProjects);
          return sortedProjects;
    }

    private Graph buildDependencyGraph(String[] projects, String[][] dependencies) {
     Graph graph = new Graph();
     for(String p:projects){
         graph.getOrCreateNode(p);
     }
     for (String[] dep:dependencies){
         graph.addEdge(dep[0],dep[1]);
     }
     return graph;
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
