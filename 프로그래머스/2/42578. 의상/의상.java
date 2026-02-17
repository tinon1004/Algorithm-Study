import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < clothes.length; i++) {
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
        }
        
        
        for (int i : map.values()) {
            answer *= (i + 1);
        }
        
        // 최소 1개라도 착용해야하기 때문에 아예 안 입는 경우 1 차감
        answer -= 1;
        
        return answer;
    }
}