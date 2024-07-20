class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int m = rowSum.length;
        int n = colSum.length;
        int[][] ans = new int[m][n];
        int i = m-1;
        int j = n-1;
        while(i >= 0 && j >= 0){
            if(rowSum[i] <= colSum[j]){
                ans[i][j] = rowSum[i];
                colSum[j] -= rowSum[i];
                i--;
            }
            else {
                ans[i][j] = colSum[j];
                rowSum[i] -= colSum[j];
                j--;
            }
        }
        return ans;
    }
}