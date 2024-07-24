class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        int j=0;
        int[] a=new int[nums.length];
        for(int i:nums){
            StringBuilder sb=new StringBuilder();
            if(i==0){
                 a[j++]=mapping[0];
                 continue;
            }
            while(i!=0){
                sb.append(mapping[i%10]);
                i/=10;
            }
            sb.reverse();
            a[j++]=Integer.parseInt(sb.toString());
        }
         Map<Integer,LinkedList<Integer>> map1=new TreeMap<>();
        for(int i=0;i<nums.length;i++){
            LinkedList<Integer> h=map1.getOrDefault(a[i],new LinkedList<>());
            h.add(nums[i]);
            map1.put(a[i],h);
        }
        j=0;
        for(int i:map1.keySet()){
            LinkedList<Integer> h=map1.get(i);
            for(int k:h){
               nums[j++]=k;
            }
        }
        return nums;
    }
}