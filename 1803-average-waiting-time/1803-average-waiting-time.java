class Solution {
    public double averageWaitingTime(int[][] customers) {
       int [] arriving = new int[customers.length]; 
       int [] prepT = new int[customers.length];

       for(int i = 0; i < customers.length; i++){
            arriving[i] = customers[i][0];
       } 
    
       prepT[0] = arriving[0] + customers[0][1]; 
       for(int j = 1; j < customers.length; j++){
            if(prepT[j-1] < arriving[j]){
                prepT[j] = arriving[j]+customers[j][1];
            }
            else{
                prepT[j] = prepT[j-1] + customers[j][1]; 
            }
       } 
       double sum = 0;
       for(int i = 0; i< prepT.length; i++ ){
        sum += prepT[i]-arriving[i];
       }
       return sum/prepT.length;

    }
}