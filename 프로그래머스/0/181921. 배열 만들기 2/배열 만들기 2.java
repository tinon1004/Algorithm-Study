import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        
        ArrayList<Integer> answer = new ArrayList<>();
        
        for (int i = l; i <= r; i++) {
            
            //숫자를 문자열로 변환하여 확인
            String num = i + "";
            if (num.matches("[05]+")) {
                answer.add(i);
            }
        }
        
        //조건 만족하는 숫자가 없을 때
        if (answer.isEmpty()) {
            answer.add(-1);
        }
        
        int[] result = new int[answer.size()];
        for (int j = 0; j < answer.size(); j++) {
            result[j] = answer.get(j);
        }
        
        return result;
    }
}