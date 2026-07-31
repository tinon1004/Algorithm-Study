import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];    
        
        for (int i = 0; i < commands.length; i++) {
            
            int num1 = commands[i][0];
            int num2 = commands[i][1];
            int num3 = commands[i][2];
            
            int[] temp = new int[num2 - num1 + 1];
            int idx = 0;
            
            for (int j = num1 - 1; j <= num2 -1; j++) {
                temp[idx] = array[j];
                idx++;
            }
            
            Arrays.sort(temp);
            
            answer[i] = temp[num3 -1];
        }
        
        return answer;
    }
}