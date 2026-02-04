import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> answer = new ArrayList<>();
        
        for (int i = 0; i < todo_list.length; i++) {
            // finished[i] == "false" 불가능
            if (finished[i] == false) {
                answer.add(todo_list[i]);
            }
        }
        return answer.toArray(new String[0]);
    }
}