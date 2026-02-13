import java.util.*;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        
        //ArrayList<Integer> answer = new ArrayList<>();
        int[] answer = {};
        
        answer = Arrays.copyOfRange(numbers, num1, num2 + 1);
        
        //return answer.stream().mapToInt(x -> x).toArray();
        return answer;
    }
}