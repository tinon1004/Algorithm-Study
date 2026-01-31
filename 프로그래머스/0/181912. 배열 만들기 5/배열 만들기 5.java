import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for (int i = 0; i < intStrs.length; i++) {
            
            // 문자열 자르기
            String word = intStrs[i].substring(s, s + l);
            
            //정수로 변환
            int num = Integer.parseInt(word);
            
            if (num > k) {
                answer.add(num);
            }
        }
        
        //ArrayList를 int[]로 변환
        return answer.stream().mapToInt(x -> x).toArray();
    }
}