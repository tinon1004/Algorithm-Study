class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = 1;
        int i = 1;
        
        while (true) {
            num *= i;
            
            if (num > n) {
                answer = i;
                break;
            }
            i++;
        }
        
        answer -= 1;
        
        return answer;
    }
}