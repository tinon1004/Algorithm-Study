import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for (int i = 0; i < completion.length; i++) {
            if(!participant[i].equals(completion[i])) {
                answer = participant[i];
                return answer;
            }
        }
        
        // 전부 같으면 마지막 사람이 미완주
        answer = participant[participant.length - 1];
        return answer;
    }
}