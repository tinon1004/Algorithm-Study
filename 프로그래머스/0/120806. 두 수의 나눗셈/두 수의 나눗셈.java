class Solution {
    public int solution(int num1, int num2) {
        int answer = 1;
        
        // answer = (num1 * 1000) / num2; 
        // 먼저 곱하면 마지막에 한 번만 버림, 먼저 나누면 소수점 손실 발생
        
        // double로 계산 후 int 변환
        answer = (int)(((double)num1 / num2) * 1000);
        
        return answer;
    }
}