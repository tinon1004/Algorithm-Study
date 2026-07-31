import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < clothes.length; i++) {
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
        }
        
        //map.keySet() -> 모든 key를 가져옴 
        for (String key : map.keySet()) {
            // 각 key에서 안 입는 경우 포함
            answer *= map.get(key) + 1;
        }
        
        answer -= 1;
        
        return answer;
    }
}