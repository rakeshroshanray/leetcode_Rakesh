class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int m = rowSum.length;
        int n = colSum.length;
        int[][] ans = new int[m][n];
        int i = 0;
        int j = 0;
        while(i < m && j < n){
            if(rowSum[i] <= colSum[j]){
                ans[i][j] = rowSum[i];
                colSum[j] -= rowSum[i];
                i++;
            }
            else {
                ans[i][j] = colSum[j];
                rowSum[i] -= colSum[j];
                j++;
            }
        }
        return ans;
    }
}