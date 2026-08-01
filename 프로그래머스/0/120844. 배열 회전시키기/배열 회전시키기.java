import java.util.*;

class Solution {
    public Deque<Integer> solution(int[] numbers, String direction) {
        
    Deque<Integer> deq = new ArrayDeque<>();
    
    for (int i = 0; i < numbers.length; i++) {
        deq.add(numbers[i]);
    }
    
    if (direction.equals("left")) {
        int num = deq.pollFirst();
        deq.addLast(num);
    }
    
    if (direction.equals("right")) {
        int num = deq.pollLast();
        deq.addFirst(num);
    }
        
    return deq;
    }
}