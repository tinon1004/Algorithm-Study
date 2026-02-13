class Solution {
    public String solution(int age) {
        
        String answer = "";
        // 숫자 age를 문자열로 변환
        String str = String.valueOf(age);
        
        for (int i = 0; i < str.length(); i++) {
            // 문자 -> 숫자 변환
            int digit = str.charAt(i) - '0';
            // 숫자 -> 문자(알파벳) 변환
            answer += (char)('a' + digit);
        }
        
        return answer;
    }
}