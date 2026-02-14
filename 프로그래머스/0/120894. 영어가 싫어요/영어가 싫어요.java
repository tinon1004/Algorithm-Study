class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        
        for (int i = 0; i < num.length; i++) {
            numbers = numbers.replaceAll(num[i], String.valueOf(i));
        }
        
        // 문자열 -> long으로 변환
        answer = Long.parseLong(numbers);
        
        return answer;
    }
}