class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        
        for (int h = 1; h <= Math.sqrt(yellow); h++) {
            
            if (yellow % h == 0) {
                
                int w = yellow / h;
                
                int width = w + 2;
                int height = h + 2;
                
                if (width * height == yellow + brown) {
                    answer[0] = width;
                    answer[1] = height;
                }
            }
            
        }
        
        return answer;
    }
}