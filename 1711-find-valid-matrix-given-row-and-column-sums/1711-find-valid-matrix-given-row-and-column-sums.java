class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int [][] ans = new int[rowSum.length][colSum.length];
        for(int i = 0; i<rowSum.length; i++){
            int min = Integer.MAX_VALUE;
            for(int j = 0; j<colSum.length; j++){
                min = Math.min(rowSum[i],colSum[j]);
                ans[i][j] = min;
                rowSum[i] -= min;
                colSum[j] -= min;
            }
        }
        return ans;
    }
}