class Solution {
    
    boolean[] visited;
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[n];
        
        // 모든 컴퓨터를 하나씩 검사
        for (int i = 0; i < n; i++) {
            // 아직 방문 안했으면 새로운 네트워크
            if(!visited[i]) {
                // 이 컴퓨터와 연결된 모든 컴퓨터를 방문 처리
                dfs(i, computers);
                // 네트워크 하나 발견
                answer++;
            }
        }
        
        return answer;
    }
    
    // 현재 컴퓨터 번호를 받아서 탐색
    public void dfs(int node, int[][] computers) {
        
        // 해당 번호 컴퓨터 방문 처리
        visited[node] = true;
        
        // 모든 컴퓨터를 확인
        for (int i = 0; i < computers.length; i++) {
            // 현재 node와 i가 연결되어있고, 방문하지 않았다면 계속 탐색
            if (computers[node][i] == 1 && !visited[i]) {
                dfs(i, computers);
            }
        }
    }
}