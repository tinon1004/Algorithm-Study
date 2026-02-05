import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        // HashSet : 중복을 허용하지 앟는 집합, 
        // 순서는 보장 안 함, HashTable로 관리
        HashSet<Integer> set = new HashSet<>();
        int[] answer = new int[k];
        int idx = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if(!set.contains(arr[i])) {
                set.add(arr[i]);
                answer[idx++] = arr[i];
            }
            
            if(idx == k) {
                break;
            }
        }
        
        for(int i = idx; i < k; i++) {
            answer[i] = -1;
        }
        
        return answer;
    }
}