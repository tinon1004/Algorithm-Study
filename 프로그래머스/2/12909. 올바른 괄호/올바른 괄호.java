class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int sum = 0;
        
        for (int i = 0; i < s. length(); i++) {
            char c = s.charAt(i);
            
            if (c == '(') {
                sum++;
            } else {
                sum--;
            }
            
            if (sum < 0) {
                return false;
            }
            
        }
        
        if (sum > 0) {
            return false;
        }

        return true;
    }
}