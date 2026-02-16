import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        
        String[] arr = new String[numbers.length];
        
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = String.valueOf(numbers[i]);  
        }
        
        // (b + a) 하는 이유는 내림차순 정렬을 하기 위해
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));
        
        String answer = "";
        
        // 모두 0인 경우
        if (arr[0].equals("0")) {
            return "0";
        }
        
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        
        return answer;
    }
}