class Solution {
    public int solution(int[][] board, int k) {
        int answer = 0;
        
        for (int i = 0; i < board.length; i++) {
            // 행과 열의 개수가 다를 수 있기 때문에 j < board[i].length; 필요
            for (int j = 0; j < board[i].length; j++) {
                if (i + j <= k) {
                    answer += board[i][j];
                }
            }
        }
        
        return answer;
    }
}