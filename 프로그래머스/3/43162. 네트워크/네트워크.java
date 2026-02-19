class Solution {
    
    boolean[] visited;
    
    public int solution(int n, int[][] computers) {
        
        int answer = 0;
        visited = new boolean[n];
        
        for (int i = 0; i < visited.length; i++) {
            if(!visited[i]) {
                dfs(i, computers);
                answer++;
            }
        }
        
        return answer;
    }
    
    public void dfs(int n, int[][] computers) {
        
        visited[n] = true;
        
        for (int i = 0; i < computers.length; i++) {
            if(computers[n][i] == 1 && !visited[i]) {
                dfs(i, computers);
            }
        }
        
    }
}