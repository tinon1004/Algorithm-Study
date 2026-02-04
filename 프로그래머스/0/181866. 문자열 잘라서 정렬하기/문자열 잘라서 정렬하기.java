import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.split("x");
        ArrayList<String> result = new ArrayList<>();
        
        for (int i = 0; i < answer.length; i++) {
            if(!answer[i].isEmpty()){
                result.add(answer[i]);
            }
        }
        
        // list 정렬 : Collections.sort() 
        // 배열 정렬 : Arrays.sort()
        Collections.sort(result);
        
        return result.toArray(new String[0]);
    }
}