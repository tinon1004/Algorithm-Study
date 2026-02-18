import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] score = new int[3];
        
        int[] p1 = {1, 2, 3, 4, 5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == p1[i % p1.length]) {
                score[0]++;
            };
            if (answers[i] == p2[i % p2.length]) {
                score[1]++;
            };
            if (answers[i] == p3[i % p3.length]) {
                score[2]++;
            };
        }
        
        int max = Math.max(score[0], Math.max(score[1], score[2]));
        
        if (score[0] == max) {
            answer.add(1);
        };
        
        if (score[1] == max) {
            answer.add(2);
        };
        
        if (score[2] == max) {
            answer.add(3);
        };
        
        
        return answer.stream().mapToInt(x -> x).toArray();
    }
}