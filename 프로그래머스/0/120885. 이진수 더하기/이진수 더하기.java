class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        
        // 2진수 -> 10진수
        int num1 = Integer.parseInt(bin1, 2);
        int num2 = Integer.parseInt(bin2, 2);
        
        //10진수의 합
        int sum = num1 + num2;
        
        //10진수 -> 2진수
        answer = Integer.toBinaryString(sum);
        
        return answer;
    }
}