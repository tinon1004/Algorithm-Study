import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        // HashMap<key(문자열 길이), value(해당 길이를 가진 문자열 개수)>
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // 1.길이별 개수 세기
        for (String s : strArr) {
            int length = s.length();
            // map.getOrDefault(len, 0) : len이 이미 존재하면 기존값 반환, 없으면 0 반환
            // +1 : 해당 길이 개수 증가
            // map.put(len, 값) : 값을 다시 map에 저장
            map.put (length, map.getOrDefault(length, 0) + 1);
        }
        
        // 2.최댓값 찾기
        // 가장 큰 그룹 크기 저장
        int max = 0;
        // map.values() : key를 제외한 모든 value 값만 모아서 반환
        for (int val : map.values()) {
            if (val > max) {
                max = val;
            }
        }
        
        return max;
    }
}