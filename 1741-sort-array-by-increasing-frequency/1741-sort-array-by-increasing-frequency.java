class Solution {
    public int[] frequencySort(int[] nums) {
        
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer>list=new ArrayList<>();
        for(int key:map.keySet()){
            list.add(key);
        }
         Collections.sort(list, (a, b) -> {
            int freqA = map.get(a);
            int freqB = map.get(b);
            if (freqA != freqB) {
                return Integer.compare(freqA, freqB);
            } else {
                return Integer.compare(b, a);
            }
        });
        int idx=0;
        int arr[]=new int[nums.length];
        for(int num:list){
            int freq=map.get(num);
            for(int i=0;i<freq;i++){
                arr[idx++]=num;
            }
        }
        return arr;
    }
}