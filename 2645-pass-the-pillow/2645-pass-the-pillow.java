class Solution {
    public int passThePillow(int n, int time) {
        int temp = time/(n-1);
        if(temp%2==0){
            return time%(n-1)+1 ;
        }else{
            return n-time%(n-1);
        }
        
    }
}