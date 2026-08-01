class Solution {
    
    boolean[] visited;
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        
        visited = new boolean[n];
        
        for (int i = 0; i < n; i++) {
            
            // 방문하지 않은 컴퓨터 발견
            if (!visited[i]) {
                
                answer++;
                
                dfs(i, computers);
            }
        }
        
        return answer;
    }
    
    public void dfs(int node, int[][] computers) {
        
        visited[node] = true;
        
        for (int i = 0; i < computers.length; i++) {
            if (computers[node][i] == 1 && !visited[i] ) {
                dfs(i, computers);
            }
        }
    }
}