import java.util.*;

class Solution {
    public int solution(int[] array) {
        HashMap<Integer,Integer> countMap = new HashMap<>();
        
        // 1. 빈도수 저장
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            // 현재 값이 몇 번 나왓는지 가져오기 -> countMap.getOrDefault(num, 0)
            // num이 이미 map에 있으면 → 그 값(등장 횟수) 반환, 없으면 → 0 반환
            // + 1 증가 후 다시 저장 -> countMap.put(num, 결과값);
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        int answer = 0;
        int maxCount = 0;
        
        // 2. 최빈값 찾기
        // Map 안에 들어있는 모든 (key, value) 쌍을 하나씩 꺼내서 entry 변수에 넣으면서 반복
        // entrySet() → Map 안에 들어 있는 모든 key-value 쌍을 Set 형태로 반환
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();
            
            if (count > maxCount) {
                maxCount = count;
                answer = num;
            } else if (count == maxCount) {
                answer = -1;
            }
        }
        
        return answer;
    }
}