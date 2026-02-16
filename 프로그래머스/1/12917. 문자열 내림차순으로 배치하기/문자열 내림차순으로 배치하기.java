import java.util.*;

class Solution {
    public String solution(String s) {
        String[] answer = s.split("");
        Arrays.sort(answer);
        String str = "";
        
        for (int i = 0; i < answer.length; i++) {
            str += answer[answer.length - 1 -i];
        }
        
        return str;
    }
}