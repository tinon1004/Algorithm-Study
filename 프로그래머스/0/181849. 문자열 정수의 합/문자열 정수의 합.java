class Solution {
    public int solution(String num_str) {
        int answer = 0;
        String[] arr = num_str.split("");
        
        for (int i = 0; i < arr.length; i++) {
            // 문자열을 정수로 변환해 값을 더하기
            answer += Integer.parseInt(arr[i]);
        }
        
        return answer;
    }
}