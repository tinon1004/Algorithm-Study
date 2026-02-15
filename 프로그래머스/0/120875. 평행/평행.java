class Solution {
    public int solution(int[][] dots) {
        // ( y차이1 * x차이2 ) == ( y차이2 * x차이1 )
        
        // (0,1) vs (2,3)
        if ((dots[1][1] - dots[0][1]) * (dots[3][0] - dots[2][0]) 
            == (dots[3][1] - dots[2][1]) * (dots[1][0] - dots[0][0])) {
            return 1;
        }
        
        // (0,2) vs (1,3)
        if ((dots[2][1] - dots[0][1]) * (dots[3][0] - dots[1][0]) 
            == (dots[3][1] - dots[1][1]) * (dots[2][0] - dots[0][0])) {
            return 1;
        }
        
        // (0,3) vs (1,2)
        if ((dots[3][1] - dots[0][1]) * (dots[2][0] - dots[1][0]) 
            == (dots[2][1] - dots[1][1]) * (dots[3][0] - dots[0][0])) {
            return 1;
        }
        
        return 0;
    }
}