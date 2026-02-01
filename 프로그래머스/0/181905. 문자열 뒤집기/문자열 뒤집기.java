class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder answer = new StringBuilder(my_string);
        
        while (s < e) {
            char temp = answer.charAt(s);
            
            answer.setCharAt(s, answer.charAt(e));
            answer.setCharAt(e, temp);
            
            s++;
            e--;
        }
        
        return answer.toString();
    }
}