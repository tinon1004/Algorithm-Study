class Solution {
    public int solution(int n) {
        int answer = 1;
        
        // int answer = 0;
        // for (int i = 1; i <= n; i++) {
        //     if ((6 * i) % n == 0) {
        //         answer = i;
        //         break;
        //     }
        // }
        
        while ((6 * answer) % n != 0) {
            answer++;
        }
        
        return answer;
    }
}