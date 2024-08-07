import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
       
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();

        for (int num : nums1) {
            map1.put(num, map1.getOrDefault(num, 0) + 1);
        }

        for (int num : nums2) {
            map2.put(num, map2.getOrDefault(num, 0) + 1);
        }

        
        if (map1.size() > map2.size()) {
            return intersectHelper(map2, map1);
        } else {
            return intersectHelper(map1, map2);
        }
    }

    private int[] intersectHelper(Map<Integer, Integer> smallerMap, Map<Integer, Integer> largerMap) {
        List<Integer> result = new ArrayList<>();


        for (Map.Entry<Integer, Integer> entry : smallerMap.entrySet()) {
            int num = entry.getKey();
            int countInSmaller = entry.getValue();
            if (largerMap.containsKey(num)) {
                int countInLarger = largerMap.get(num);
                int count = Math.min(countInSmaller, countInLarger);
                for (int i = 0; i < count; i++) {
                    result.add(num);
                }
            }
        }

       
        int[] intersection = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            intersection[i] = result.get(i);
        }

        return intersection;
    }
}
