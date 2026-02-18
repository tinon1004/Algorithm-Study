import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
      
        HashSet<Integer> numsSet = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            numsSet.add(nums[i]);
        }
        
        if (numsSet.size() > nums.length / 2) {
            answer = nums.length / 2;
        } else {
            answer = numsSet.size();
        }
        
        return answer;
    }
}