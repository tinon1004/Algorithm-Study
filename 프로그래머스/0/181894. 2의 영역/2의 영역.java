import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        ArrayList<Integer> answer = new ArrayList<>();
        
        int start = -1;
        int end = -1;
        
        for (int i = 0; i < arr.length; i++) {
            
            if(arr[i] == 2 && start == -1) {
                start = i;
            } 
            
            if(arr[i] == 2 && start != -1) {
                end = i;
            } 
        }
        
        if (start == -1 && end == -1) {
            answer.add(-1);
        }
        
        if (start != -1 && end == -1) {
            answer.add(2);
        }
        
        if (start != -1 && end != -1) {
            
            for (int i = start; i <= end; i++) {
                answer.add(arr[i]);
            }
        }
        
        return answer.stream().mapToInt(x -> x).toArray();
    }
}