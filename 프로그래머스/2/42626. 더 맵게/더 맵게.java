import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int i = 0; i < scoville.length; i++) {
            pq.add(scoville[i]);
        }
        
        while (pq.peek() < K) {
            
            // pq에서는 1개가 남았을 때 poll 해버리면 오류가 남
            if (pq.size() < 2) {
                return -1;
            }
            
            int num1 = pq.poll();
            int num2 = pq.poll();
            
            int num3 = num1 + (num2 * 2);
            
            pq.add(num3);
            
            answer++;
        }
        
        return answer;
    }
}