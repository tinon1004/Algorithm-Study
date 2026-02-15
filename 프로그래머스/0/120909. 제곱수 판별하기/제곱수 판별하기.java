class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // n의 최대가 100 000이기 때문에 1000이 가장 큰 수임
        for (int i = 1; i <= 1000; i++) {
            if (i * i == n) {
                answer = 1;
                break;
            } else {
                answer = 2;
            }
        }
        
        return answer;
    }
}