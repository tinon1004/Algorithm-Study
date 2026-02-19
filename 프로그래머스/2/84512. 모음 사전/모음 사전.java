class Solution {
    
    int answer = 0;
    int count = 0;
    String[] arr = {"A", "E", "I", "O", "U"};
    
    public int solution(String word) {
        
        dfs(word, "");
        
        return answer;
    }
    
    public void dfs(String word, String curr) {
        
        
        if (word.equals(curr)) {
            answer = count;
            return;
        }
        
        
        if (curr.length() == 5) {
            return;
        }
        
       
        
        for (int i = 0; i < arr.length; i++) {
            count++;
            dfs(word, curr + arr[i]);
        }
        
    }
}