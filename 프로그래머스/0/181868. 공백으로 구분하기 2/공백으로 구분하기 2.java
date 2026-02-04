class Solution {
    public String[] solution(String my_string) {
        
        //trim() 사용해 문자열 앞뒤 공백 제거
        //split("\\s+") 사용해 공백 기준 문자열 분리
        
        // \s → 공백 문자
        // + → 1회 이상 반복
        // \\s+ → 연속된 공백을 한 번에 분리할 때 사용
        String[] answer = my_string.trim().split("\\s+");
        
        return answer;
    }
}