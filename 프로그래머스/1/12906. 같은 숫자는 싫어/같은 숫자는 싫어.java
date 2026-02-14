import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (stack.empty() || arr[i] != stack.peek()) {
                stack.push(arr[i]);
            }
        }
        
        return stack.stream().mapToInt(x -> x).toArray();
    }
}