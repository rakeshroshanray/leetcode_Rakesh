class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] vis = new boolean[n];
        int res = 0;
        for(int i = 0; i < n; i++){
            if( !vis[i] ){
                res++;
                dfs(isConnected,vis,i,n);
            }
        } 

        return res;
    }

    public void dfs(int[][] isConnected,boolean[] vis, int curr, int n){

        for(int i = 0; i<n; i++){
            if(isConnected[curr][i] == 1 && !vis[i]){
                vis[i] = true;
                dfs(isConnected,vis,i,n);
            }
        }
    }
}