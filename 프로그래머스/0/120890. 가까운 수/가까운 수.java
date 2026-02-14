import java.math.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int num = Integer.MAX_VALUE;
        
        for (int i = 0; i < array.length; i++) {
            int k = Math.abs(array[i] - n);
            if (num > k || k == num && array[i] < answer) {
                num = k;
                answer = array[i];
            } 
        }
        
        return answer;
    }
}