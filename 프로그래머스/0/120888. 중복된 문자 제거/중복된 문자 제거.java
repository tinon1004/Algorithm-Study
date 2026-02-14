class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for (int i = 0; i < my_string.length(); i++) {
            
            // 1. 현재 문자 추출
            char c = my_string.charAt(i);
            
            // 2. char -> String
            String s = String.valueOf(c);
            
            if (!answer.contains(s)) {
                // c 나 s 모두 answer에 넣기 가능 
                // answer += s;
                answer += c; 
            }
        }
        
        return answer;
    }
}