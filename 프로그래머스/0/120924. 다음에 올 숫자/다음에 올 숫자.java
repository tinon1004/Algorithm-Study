class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int num1 = common[1] - common[0];
        int num2 = common[2] - common[1];
        
        // 등차수열
        if (num1 == num2) {
            answer = common[common.length - 1] + num1;
        } else {
            int num3 = common[1] / common[0];
            answer = common[common.length - 1] * num3; 
        }
        
        return answer;
    }
}