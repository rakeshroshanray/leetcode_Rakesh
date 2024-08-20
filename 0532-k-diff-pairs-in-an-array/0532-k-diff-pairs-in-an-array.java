class Solution {
    public int findPairs(int[] nums, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int count=0;
        
        for(int i=0; i<nums.length; i++){
           map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Integer ele: map.keySet() ){
            if(k==0){
                if(map.get(ele)>1){
                count++;
                }
            }
            else if(map.containsKey(ele+k)){
                count++;
            }
        }
        return count;
        
    }
}