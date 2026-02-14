import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        HashSet<Integer> set = new HashSet<>();
        int i = 2;
        
        while (n >= 2) {
            if (n % i == 0) {
                set.add(i);
                n /= i;
            } else {
                i++;
            }
        }
        
        answer = set.stream().mapToInt(x -> x).toArray();
        
        Arrays.sort(answer);
        
        return answer;
    }
}