import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        // split("a","b","c") : 불가
        // split("([abc]")
        String[] arr = myStr.split("[abc]");
        ArrayList<String> answer = new ArrayList<>();
        String[] empty = {"EMPTY"};
        
        for(int i = 0; i < arr.length; i++) {
            if(!arr[i].isEmpty()) {
                answer.add(arr[i]);
            } 
        }
        
        if (answer.isEmpty()) {
            return empty;
        } else {
            return answer.toArray(new String[0]);
        }
    }
}