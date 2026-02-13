import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        
        // 3 76 24
        // 3 24 76
        
        
        int[] sorted = emergency.clone();
        
        Arrays.sort(sorted);
        
        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < sorted.length; j++) {
                if (emergency[i] == sorted[j]) {
                    answer[i] = sorted.length - j;
                }
            }
        }
        
        return answer;
    }
}