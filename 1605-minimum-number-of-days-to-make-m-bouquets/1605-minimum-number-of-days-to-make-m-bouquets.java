class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int max = 0;
        for(int i = 0 ; i<bloomDay.length; i++){
            if(max <= bloomDay[i]){
                max = bloomDay[i];
            }
        }
        int ans = -1;
        int start = 1;
        int end = max;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(check(mid,bloomDay,m,k) == true){
                ans = mid;
                end = mid-1 ;
            }
            else{
                start = mid+1;
            }
        }
        return ans;
    }
    public boolean check(int days,int[] bloomDay, int m, int k ){
        int count = 0;
        for(int i = 0 ; i<bloomDay.length; i++){
            if(bloomDay[i] <= days ){
                count++;
                if(count == k){
                    m--;
                    count = 0;
                }
                if(m == 0){
                    return true;
                }
            }
            else{
                count = 0;
            }
        }
        return false;
    }
}