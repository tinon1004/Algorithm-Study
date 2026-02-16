class Solution {
    public String solution(String s) {
        String answer = "";
        int n = 0;
        
        if (s.length() % 2 != 0) {
            answer += s.charAt(s.length() / 2);
        } else {
            n = s.length() / 2;
            answer += s.substring(n - 1, n + 1);
        }
        
        return answer;
    }
}