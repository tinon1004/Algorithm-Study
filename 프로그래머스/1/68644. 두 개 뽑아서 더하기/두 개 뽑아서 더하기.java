import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i != j) {
                    int num = numbers[i] + numbers[j];
                    
                    if (!result.contains(num)) {
                        result.add(num);
                    }
                }
            }
        }
        
        Collections.sort(result);
        
        return result.stream().mapToInt(x -> x).toArray();
    }
}