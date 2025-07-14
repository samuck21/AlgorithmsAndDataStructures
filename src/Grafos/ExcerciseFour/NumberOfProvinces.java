package Grafos.ExcerciseFour;

public class NumberOfProvinces {
    public int numberOfProvinces(int [][] isConnected){
        boolean[] visited = new boolean[isConnected.length];
        int count = 0;
        for(int i=0; i< isConnected.length; i++){
            if(!visited[i]){
                count++;
                dfs(isConnected,visited,i);
            }
        }

        return  count;
    }

    private void dfs(int[][] isConnected, boolean[] visited, int city) {
    for(int other =0; other< isConnected[0].length; other++){

        if(other != city && isConnected[city][other]==1 && !visited[other]){
            visited[other]= true;
            dfs(isConnected,visited,other);
        }
    }
    }
}
