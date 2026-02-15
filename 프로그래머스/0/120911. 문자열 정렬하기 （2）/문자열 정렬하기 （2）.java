import java.util.*;

class Solution {
    public String solution(String my_string) {
        my_string = my_string.toLowerCase();
        
        String[] answer = my_string.split("");
        
        Arrays.sort(answer);
        
        return String.join("",answer);
    }
}