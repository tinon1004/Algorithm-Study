class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int wmin = Math.min(wallet[0], wallet[1]);
        int wmax = Math.max(wallet[0], wallet[1]);
        int bmin = Math.min(bill[0], bill[1]);
        int bmax = Math.max(bill[0], bill[1]);
        
        while(true) {
            
            // 지폐 각각 가로 세로가 지갑 가로 세로보다 클 때
            if (wmin < bmin || wmax < bmax) {
                bmax /= 2;
                answer++;
            }
            
            // 지폐 가로 세로 비교 후 min,max 다시 정의
            if (bmax < bmin) {
                int temp = bmax;
                bmax = bmin;
                bmin = temp;
            }
            
            // 지폐를 지갑에 넣을 수 있을 때 종료
            // 그냥 또는 90도 돌려서
            if (bmax <= wmax && bmin <= wmin){
                break;
            }
            
            
        }
        
        return answer;
    }
}