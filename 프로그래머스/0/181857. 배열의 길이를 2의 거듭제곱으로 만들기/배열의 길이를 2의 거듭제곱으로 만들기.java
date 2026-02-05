import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int n = arr.length;
        int pow = 1;
        
        while (pow < n) {
            pow *= 2;
        }
        
        int zeros = pow - n;
        // Arrays.copyOf(원본배열, 새길이) : 배열 처음부터 복사, 길이가 길어지면 뒤는 0으로 채워짐
        // Arrays.copyOfRange(원본배열, 시작, 끝) : 특정 구간만 복사
        answer = Arrays.copyOf(arr, pow);
        
        return answer;
    }
}