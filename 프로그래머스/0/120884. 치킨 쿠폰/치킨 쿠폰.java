class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int num = 0;
        
        while(true) {
            num = chicken / 10;
            chicken = chicken % 10 + num;
            
            answer += num;
            
            if (chicken < 10) {
                break;
            }
        }
        
        return answer;
    }
}