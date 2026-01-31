class Solution {
    public int solution(String number) {
        int answer = 0;
        
        for (int i = 0; i < number.length(); i++) {
            // 아스키코드 "0"을 빼서 문자를 정수로 바꾸는 방법
            answer += number.charAt(i) - '0';
            // answer += Integer.parseInt(String.valueOf(number.charAt(i)));
        }
        answer %= 9;
        
        return answer;
    }
}