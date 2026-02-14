import java.util.*;

class Solution {
    public int solution(int[] nums) {
        // 최대로 선택이 가능한 개수
        int max = nums.length / 2;
        
        // 중복 제거하기
        HashSet<Integer > numsSet = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            numsSet.add(nums[i]);
        }
        
        if (numsSet.size() > max) {
            return max;
        } else {
            return numsSet.size();
        }
        
    }
}