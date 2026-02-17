import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        
        String[] arr = new String[numbers.length];
        
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }
        
        // compareTo()은 int[]에 사용 불가
        // String[], Integer[]에 사용 가능
        // arr["1"] 인 경우에는 비교 자체가 필요 없기 때문에 그대로 끝남 -> compareTo()는 두 개 이상일 때만 비교
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));
        
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
       
        // ["0","0","0"] -> "000"이 되기 때문에 따로 조건을 추가해야
        if (arr[0].equals("0")) {
            answer = "0";
        }
        
        return answer;
    }
}