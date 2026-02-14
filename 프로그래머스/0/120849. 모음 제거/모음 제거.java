class Solution {
    public String solution(String my_string) {
        String answer = my_string;
        String[] words= {"a", "e", "i", "o", "u"};
    
        for (int i = 0; i < words.length; i++) {
            String s = words[i];
            
            // 한 번에 모든 v 제거
            answer = answer.replace(s, "");
        }
        
        return answer;
    }
}