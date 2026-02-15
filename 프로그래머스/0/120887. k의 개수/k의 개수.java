class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for (int a = i; a <= j; a++) {
            String numa = String.valueOf(a);
            String numk = String.valueOf(k);
            String[] str = numa.split("");
            
            for (int b = 0; b < str.length; b++) {
                if (str[b].equals(numk)) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}