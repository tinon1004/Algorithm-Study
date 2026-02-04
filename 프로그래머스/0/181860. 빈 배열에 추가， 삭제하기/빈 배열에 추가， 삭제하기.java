import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (flag[i] == true) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    answer.add(arr[i]);
                } 
            } else {
                for (int j = 0; j < arr[i]; j++) {
                    // remove(n) : n번째 원소 삭제
                    // 배열: length, ArrayList: size()
                    answer.remove(answer.size() -1);
                }
                
            }
        }
        
        return answer.stream().mapToInt(x -> x).toArray();
    }
}