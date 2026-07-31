import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        //우선순위큐를 사용하는 이유는 -> 가장 작은 음식 1,2 찾아야 하기 때문
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int i = 0; i < scoville.length; i++) {
            pq.add(scoville[i]);
        }
        
        while (pq.peek() < K) {
            
            // 우선순위큐에서는 1개가 남았을 때, poll 하면 오류남
            if (pq.size() < 2) {
                return -1;
            }
            
            int ns = 0;
            int num1 = pq.poll();
            int num2 = pq.poll();
            
            ns = num1 + num2 * 2;
            
            pq.add(ns);
            
            answer++;
        }
        
        return answer;
    }
}