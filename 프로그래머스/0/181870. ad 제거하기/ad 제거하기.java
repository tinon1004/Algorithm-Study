import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> answer = new ArrayList<>();
        
        for (int i = 0; i < strArr.length; i++) {
            if (!strArr[i].contains("ad")) {
                answer.add(strArr[i]);
            }
        }
        
        //ArrayList<String> -> String[]
        //ArrayList<String> -> String : String.join("",answer)  
        return answer.toArray(new String[0]);
    }
}