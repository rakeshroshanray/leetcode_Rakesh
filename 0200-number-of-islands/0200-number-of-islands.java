class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        
        boolean[][] vis = new boolean[n][m];

        for(int row = 0; row < n; row++){
            for(int col = 0; col < m; col++){
                if(!vis[row][col] && grid[row][col] == '1'){
                    count++;
                    bfs(row,col,vis,grid,n,m);
                }
            }
        }
        return count;
    }

    public void bfs(int row,int col,boolean[][] vis, char[][] grid,int n,
    int m){
        vis[row][col] = true;
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(row,col));

        while(!q.isEmpty()){
            int ro = q.peek().first;
            int co = q.peek().second;
            q.remove();

            for(int delRow = -1; delRow <= 1; delRow++){
                for(int delCol = -1; delCol <= 1; delCol++){
                   if((delRow==-1 && delCol==0)||(delRow==0 && delCol==1) 
                   || (delRow==1 && delCol==0)||(delRow==0 && delCol==-1)){ 
						
                        int nRow = ro + delRow;
                        int nCol = co + delCol;

                        if((nRow >= 0 && nRow < n) && (nCol >= 0 && nCol <m)
                         && (vis[nRow][nCol] == false) && 
                         (grid[nRow][nCol] == '1')){

                            vis[nRow][nCol] = true;
                            q.add(new Pair(nRow, nCol));
                        }
                    }
                }

            }
        }  
    }
}
class Pair{
    int first;
    int second;
    public Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
}


//  USING DFS TRAVERSAL
// class Pair{
//     int first;
//     int second;
//     public Pair(int first, int second){
//         this.first = first;
//         this.second = second;
//     }
// }
// class Solution {
//      public void dfs(int row, int col, char[][] mat, boolean[][] vis, int n, int m){
//         vis[row][col] = true;
//         for(int delrow = -1; delrow <= 1; delrow++){
//             for(int delcol = -1; delcol <= 1; delcol++){
//                 int nrow = row + delrow;
//                 int ncol = col + delcol;

//                 if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && vis[nrow][ncol] == false && mat[nrow][ncol] == 1)
//                 {
//                     dfs(nrow, ncol, mat, vis, n, m);
//                 }
//             }
//         }
//     }
//     public int numIslands(char[][] grid) {
//         int n = grid.length;
//         int m = grid[0].length;
//         int cnt = 0;
//         boolean[][] vis = new boolean[n][m];
        
//         for(int row = 0; row < n; row++){
//             for(int col = 0; col < m; col++){
//                 if(!vis[row][col] && grid[row][col] == '1'){
//                     cnt++;
//                     dfs(row, col, grid,vis, n ,m);
//                 }
//             }
//         }
//         return cnt;
//     }
// }