import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for (int num1 = 0; num1 < commands.length; num1++) {
            int i = commands[num1][0];
            int j = commands[num1][1];
            int k = commands[num1][2];
            
            int[] new_arr = new int[array.length];
            
            new_arr = Arrays.copyOfRange(array, i - 1, j);
            
            Arrays.sort(new_arr);
            
            answer.add(new_arr[k - 1]);
            
        }
        
        return answer.stream().mapToInt(x -> x).toArray();
    }
}