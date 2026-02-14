class Solution {
    public String solution(int[] food) {
        String answer = "";
        String answer2 = "";
        
        for (int i = 1; i < food.length; i++) {
            if (food[i] % 2 != 0) {
                //answer += (food[i] - 1) / 2;
                for (int j = 0; j < (food[i] - 1) / 2; j++) {
                    answer += i;
                }
            } else {
                for (int j = 0; j < food[i] / 2; j++) {
                    answer += i;
                }
            }
        }
        
        answer2 = answer.substring(0, answer.length());
        answer += "0";
        
            
        for (int i = answer2.length() - 1; i >= 0; i--) {
            answer += answer2.charAt(i);
        }
        
        return answer;
    }
}