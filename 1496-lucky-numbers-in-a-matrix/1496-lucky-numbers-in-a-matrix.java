class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> lucky = new ArrayList<Integer>();
        int[] rows= new int[matrix.length];
        int[] colm= new int[matrix[0].length];
        for(int i=0; i<matrix.length; i++){
            int min=100000;
            for(int j=0; j<matrix[0].length; j++){
                if(min > matrix[i][j]){
                    min=matrix[i][j];
                }  
            }
            rows[i]=min;
        }
         for(int i=0; i<matrix[0].length; i++){
             int max=-1000000;
            for(int j=0; j<matrix.length; j++){
                if(max < matrix[j][i]){
                    max=matrix[j][i];
                }  
            }
            colm[i]=max;
        }
         for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(rows[i]==colm[j]){
                    lucky.add(matrix[i][j]);
                }  
            }
        }
        return lucky;
    }
}
