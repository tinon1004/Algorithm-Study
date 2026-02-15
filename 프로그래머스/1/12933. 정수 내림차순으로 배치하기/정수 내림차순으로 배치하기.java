import java.util.*;

class Solution {
    public long solution(long n) {
        
        String s = String.valueOf(n);
        String[] str = s.split("");
        
        Arrays.sort(str);
        
        String answer = "";
        
        for (int i = str.length - 1; i >= 0; i--) {
            answer += str[i];
        }
        
        return Long.parseLong(answer);
    }
}