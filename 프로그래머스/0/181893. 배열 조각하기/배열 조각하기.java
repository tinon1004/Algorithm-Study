//Arrays.copyOfRange 때문에 필요
import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        
        for(int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                //copyOfRange(원본 배열, 시작 인덱스, 끝 인덱스)
                arr = Arrays.copyOfRange(arr, 0, query[i] + 1);
            } else {
                arr = Arrays.copyOfRange(arr, query[i], arr.length);
            }
        }
        
        return arr;
    }
}