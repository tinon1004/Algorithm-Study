import java.util.*;

class Solution {
    public int solution(int[] nums) {
        
        HashSet<Integer> map = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            map.add(nums[i]);
        }
        
        if (map.size() > nums.length / 2) {
            return nums.length / 2;
        } else {
            return map.size();
        }
        
    }
}