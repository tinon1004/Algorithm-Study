class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        
        int sum1 = a + b + c;
        int sum2 = a * a + b * b + c * c;
        int sum3 = a * a * a + b * b * b + c * c * c;

        // 세 수가 모두 같은 경우
        if (a == b && b == c) {
            return sum1 * sum2 * sum3;
        }

        // 세 수가 모두 다른 경우
        if (a != b && b != c && a != c) {
            return sum1;
        }

        // 두 수만 같은 경우
        return sum1 * sum2;
    }
}