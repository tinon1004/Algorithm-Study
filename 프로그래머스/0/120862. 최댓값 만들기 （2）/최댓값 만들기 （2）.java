import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        Arrays.sort(numbers);
        
        int n = numbers.length;
        
        int num1 = numbers[n - 1] * numbers[n - 2];
        int num2 = numbers[0] * numbers[1];
        
        answer = Math.max(num1, num2);
        
        return answer;
    }
}