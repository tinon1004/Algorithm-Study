class Solution {
    public int solution(int num) {
        int idx = 0;
        // 계산 과정에서 값이 크게 증가하기 때문에 int 대신 long
        long n = num;
        
        while (n != 1 && idx < 500) {
            
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
            idx++;
        }
        
        if (n == 1) {
            return idx;
        } else {
            return -1;
        }
      
    }
}