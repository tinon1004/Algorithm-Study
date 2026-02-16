import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int i = 0; i < scoville.length; i++) {
            pq.offer(scoville[i]);
        }
        
        
        while (pq.peek() < K) {
            
            // 큐에 음식이 1개만 존재할 때, poll() 해버리면 오류가 남
            if (pq.size() < 2) {
                return -1;
            }
            
            int first = pq.poll();
            int second = pq.poll();
            
            int new_food = first + (second * 2);
            pq.offer(new_food);
            
            answer++;
                
        }
        
        return answer;
    }
}