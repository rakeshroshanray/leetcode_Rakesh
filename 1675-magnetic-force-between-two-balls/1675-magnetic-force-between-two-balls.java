class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n = position.length;
        int start = 0;
        int end = position[n - 1] ;
        int ans = 0;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(posible(position, mid,m) ){
                ans = mid;
                start = mid + 1;
            }else{
                end = mid-1;
            }
        }
        return ans;
    }
    public boolean posible(int[] position, int mid, int m){
        int initial = 1;
        int prev = position[0];
        for(int i = 1; i < position.length; i++){
            if(position[i] - prev >= mid){
                prev = position[i];
                initial= initial + 1;
                if(initial == m){
                    return true;
                }
            }
        }
        if(initial < m){
            return false;
        }
        return true;
    }
}