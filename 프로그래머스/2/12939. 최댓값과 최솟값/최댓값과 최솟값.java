import java.util.*;

class Solution {
    public String solution(String s) {
        String[] str = s.split(" ");
        int[] nums = new int[str.length];
        
        // 문자열로 정렬을 하면 "10" < "2", "-1" < "-4" 문제가 발생
        // 문자열을 정수로 변환 후 정렬 필요
        
        for (int i = 0; i < str.length; i++) {
            nums[i] = Integer.parseInt(str[i]);
        }
        
        Arrays.sort(nums);
        
        int num1 = nums[0];
        int num2 = nums[nums.length - 1];
        
        String answer = num1 + " " + num2;
        
        return answer;
    }
}