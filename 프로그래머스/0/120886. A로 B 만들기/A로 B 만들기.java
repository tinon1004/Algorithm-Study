import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        String[] be = before.split("");
        String[] af = after.split("");
        
        Arrays.sort(be);
        Arrays.sort(af);
        
        if (Arrays.equals(be, af)) {
            answer = 1;
        } else {
            answer = 0;
        }
        
        return answer;
    }
}