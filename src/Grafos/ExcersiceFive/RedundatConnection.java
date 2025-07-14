package Grafos.ExcersiceFive;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RedundatConnection {

    public int[]  findRedundantConnetction(int [][] edges){
        List<Set<Integer>> adjList = new ArrayList<>();
        for(int i = 0; i< 1000;i++){
            adjList.add(new HashSet<>());
        }
        for(int[]edge :edges){
            int firts = edge[0];
            int second  = edge[1];
            if(dfs(firts,second,-1,adjList)) return edge;
            adjList.get(firts).add(second);
            adjList.get(second).add(firts);
        }
        return  null;
    }
    private boolean dfs(int first, int second,int previous,List<Set<Integer>> adjList){
        if(first == second) return  true;
        for(int other: adjList.get(first)){
            if(other == previous)continue;
            if(dfs(other,second,first,adjList))return  true;
        }
        return false;
    }
}
