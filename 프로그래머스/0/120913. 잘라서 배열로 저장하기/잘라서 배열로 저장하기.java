class Solution {
    public String[] solution(String my_str, int n) {
        // 배열 크기 올림 처리
        String[] answer = new String[(my_str.length() + n - 1) / n];
        
        for (int i = 0; i < answer.length; i++) {
            int start = n * i;
            int end = 0;
            
            if (start + n < my_str.length()) {
                end = start + n;
            } else {
                end = my_str.length();
            }
            
            answer[i] = my_str.substring(start, end);
        }
        
        return answer;
    }
}