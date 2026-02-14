class Solution {
    public int solution(int order) {
        int answer = 0;
        String arr = String.valueOf(order);
        
        for (int i = 0; i < arr.length(); i++) {
            char c = arr.charAt(i);
            
            // 3으로 나누는 방법은 3,6,9 외에도 다른 숫자의 경우도 포함됨
            if (c == '3' || c == '6' || c == '9') {
               answer++; 
            }
        }
        
        return answer;
    }
}