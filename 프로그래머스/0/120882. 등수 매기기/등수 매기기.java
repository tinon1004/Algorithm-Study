class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        int[] rank = new int[score.length];
        
        for (int i = 0; i < score.length; i++) {
            // 굳이 소수점 신경쓰지 말고 합으로 계산하기
            answer[i] = (score[i][0] + score[i][1]);
        }
        
        for (int i = 0; i < answer.length; i++) {
            // 기본 등수는 1등으로
            int r = 1;
            
            for (int j = 0; j < answer.length; j++) {
                // i번째인 내가 j보다 점수가 낮으면 등수 상승
                if (answer[j] > answer[i]) {
                    r++;
                }
            }
            
            rank[i] = r;
        }
        
        return rank;
    }
}