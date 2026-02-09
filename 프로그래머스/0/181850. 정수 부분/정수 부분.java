class Solution {
    public int solution(double flo) {
        int answer = 0;
        
        // double -> int로 형변환하면 소수점이 버려짐
        // answer = (int)Math.floor(flo)
        answer = (int)flo;
        
        return answer;
    }
}