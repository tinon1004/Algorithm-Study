import java.util.*;

// HashSet : 값 존재 여부를 빠르게 확인 가능
// 중복 저장 불가, 순서 없음, contains() 속도 빠름
// Map : (key, value) 쌍 vs Set : 값만 저장

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        
        // 1. delete_list를 Set으로 변환
        // 삭제할 숫자를 빠르게 찾기 위함
        Set<Integer> deleteSet = new HashSet<>();
        
        for (int i = 0; i < delete_list.length; i++) {
            deleteSet.add(delete_list[i]);
        }
        
        // 2. 결과 담을 리스트 만들기
        ArrayList<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (!deleteSet.contains(arr[i])) {
                result.add(arr[i]);
            }
        }
        
        return result.stream().mapToInt(x -> x).toArray();
    }
}