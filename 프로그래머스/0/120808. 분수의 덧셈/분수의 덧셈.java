class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        int numer = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;
        
        int a = numer;
        int b = denom;
        
        // 최대공약수 구하기
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        
        numer /= a;
        denom /= a;
        
        answer[0] = numer;
        answer[1] = denom;
        
        return answer;
    }
}