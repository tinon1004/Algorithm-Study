class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int sum = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                sum += 1;
            } else {
                sum -= 1;
            }
            
            // 닫는 괄호가 먼저 나오는 경우
            if (sum < 0) {
                return false;
            }
        }
        
        if (sum == 0) {
            return true;
        } else {
            return false;
        }
        
    }
}