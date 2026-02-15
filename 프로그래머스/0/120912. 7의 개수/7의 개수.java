class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        
        for (int i = 0; i < array.length; i++) {
            String s = String.valueOf(array[i]);
            String[] str = s.split("");
            
            for (int j = 0; j < str.length; j++) {
                if (str[j].contains("7")) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}