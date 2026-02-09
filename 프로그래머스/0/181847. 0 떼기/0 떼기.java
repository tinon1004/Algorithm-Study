class Solution {
    public String solution(String n_str) {
        String answer = "";
        
        // Integer.parseInt를 통해 0 제거
        // "" 를 더해 String으로 변환
        answer = "" + Integer.parseInt(n_str);
        
        return answer;
    }
}