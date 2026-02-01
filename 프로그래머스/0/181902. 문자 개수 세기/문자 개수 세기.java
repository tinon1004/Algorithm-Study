class Solution {
    public int[] solution(String my_string) {
        // 대문자 26 + 소문자 26 = 52
        int[] answer = new int[52]; 
        
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            
            // 아스키 코드 증가함에 따라 배열도 증가함을 이용
            if (c >= 'A' && c <= 'Z') {
                answer[c - 'A']++;
            } else if (c >= 'a' && c <= 'z') {
                answer[26 + c - 'a']++;
            }
        }
        
        return answer;
    }
}