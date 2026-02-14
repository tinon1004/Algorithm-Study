class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int n = numbers.length;
        
        int idx = ((k - 1) * 2) % n;
        answer = numbers[idx];
        
        return answer;
    }
}