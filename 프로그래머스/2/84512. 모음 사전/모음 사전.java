class Solution {
    
    int answer = 0;
    int count = 0;
    String[] arr = {"A", "E", "I", "O", "U"};
    
    public int solution(String word) {

        dfs("",word);        
        return answer;
    }
    
    public void dfs(String current, String word) {
        
        if (current.equals(word)) {
            answer = count;
            // 단순히 함수를 끝내는 return
            return;
        }
        
        // 5자리까지만 길이를 지정
        if (current.length() == 5) {
            return;
        }
        
        for (int i = 0; i < 5; i++) {
            // count는 만들어진 단어의 횟수
            count++;
            dfs(current + arr[i], word);
        }
    }
}