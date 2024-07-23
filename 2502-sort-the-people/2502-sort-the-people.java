class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
         int n = names.length;
        Integer[] idx = new Integer[n];
        for(int i = 0 ; i<n ; i++){
            idx[i] = i; 
        }
        Arrays.sort(idx, new Comparator<Integer>(){
            public int compare(Integer in1 , Integer in2){
                return Integer.compare(heights[in2],heights[in1]);
            }
        });
        String[] sortedNames = new String[n];
        for (int i = 0; i < n; i++) {
            sortedNames[i] = names[idx[i]];
        }
        
        return sortedNames;
    }
}