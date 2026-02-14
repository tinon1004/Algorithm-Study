class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if ('a' <= c && c <= 'z') {
                answer += Character.toUpperCase(c);
            } else if ('A' <= c && c <= 'Z') {
                answer += Character.toLowerCase(c);
            }
        }
        
        return answer;
    }
}