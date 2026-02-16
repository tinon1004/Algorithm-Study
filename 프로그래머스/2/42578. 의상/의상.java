import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < clothes.length; i++) {
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
        }
        
        for (int count : map.values()) {
            // 해당 종류 아이템 개수 + 안 입는 경우 1
            answer *= (count + 1);
        }
        
        // 최소 1개는 입어야 하기 때문에 -1 필요
        return answer - 1;
    }
}