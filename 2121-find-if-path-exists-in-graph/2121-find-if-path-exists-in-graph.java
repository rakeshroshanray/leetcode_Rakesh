class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<Integer> graph[] = new ArrayList[n];
        for(int i = 0; i < n ; i++){
            graph[i] = new ArrayList<>();
        }

        for(int[] edge : edges){

            int u = edge[0];
            int v = edge[1];
            graph[u].add(v);
            graph[v].add(u);
        }
        return hasPath(graph,source,destination,new boolean[n]); 
        
    }

    boolean hasPath(ArrayList<Integer> graph[], int src, int dest, boolean[] vist){

        if(src == dest){
            return true;
        }

        vist[src] = true;

        for(int i = 0; i < graph[src].size();i++ ){
            int e = graph[src].get(i);
            if(!vist[e] && hasPath(graph,e,dest,vist)){
                return true;
            }
        }
        return false;
    }
}