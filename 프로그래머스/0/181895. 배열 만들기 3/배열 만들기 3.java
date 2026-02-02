import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for (int i = 0; i < intervals.length; i++) {
            int num1 = intervals[i][0];
            int num2 = intervals[i][1];
            
            for (int j = num1; j <= num2; j++){
                answer.add(arr[j]);
            }
        }
        
        return answer.stream().mapToInt(x -> x).toArray();
    }
}