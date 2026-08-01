class Solution {
    
    int answer = 0;
    
    public int solution(int[] numbers, int target) {
       
        dfs(numbers, target, 0, 0);
       
        return answer;
    }
    
    public void dfs(int[] numbers, int target, int idx, int sum) {
        // 모든 숫자를 사용한 경우
        if (idx == numbers.length) {
            
            // sum이 타겟 넘버인 경우
            if (sum == target) {
                answer++;
            }
            
            return;
            
        }
    
    // 현재 숫자를 더하는 경우
    dfs(numbers, target, idx + 1, sum + numbers[idx]);
    
    // 현재 숫자를 빼는 경우
    dfs(numbers, target, idx + 1, sum - numbers[idx]);
        
    }

}