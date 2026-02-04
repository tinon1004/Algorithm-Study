import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++){
            if (stk.isEmpty()) {
                stk.add(arr[i]);
            // get()은 ArrayList의 특정 인덱스 값 가져올 때 사용
            } else if (arr[i] == stk.get(stk.size() - 1)) {
                stk.remove(stk.size() - 1);
            } else if (arr[i] != stk.get(stk.size() - 1)) {
                stk.add(arr[i]);
            }
        }
        
        if (stk.isEmpty()) {
            return new int[]{-1};
        }
        
        return stk.stream().mapToInt(x -> x).toArray();
    }
}