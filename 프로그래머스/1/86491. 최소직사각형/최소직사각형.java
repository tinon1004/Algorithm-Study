class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int mw = 0;
        int mh = 0;
        int w = 0;
        int h = 0;
        
        for (int i = 0; i < sizes.length; i++) {
            
            w = Math.max(sizes[i][0], sizes[i][1]);
            h = Math.min(sizes[i][0], sizes[i][1]);
            
            mw = Math.max(mw, w);
            mh = Math.max(mh, h);
        }
        
        answer = mw * mh;
        
        return answer;
    }
}