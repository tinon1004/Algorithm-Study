import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        Arrays.sort(sides);
        
        // 가장 긴 변이 존재할 때
        answer += sides[0];
        
        // 나머지 한 변이 가장 길 때
        answer += sides[0] - 1;
        
        return answer;
    }
}