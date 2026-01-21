class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String result1 = "" + a + b;
        
        int num1 = Integer.parseInt(result1);
        int num2 = 2 * a * b;
        
        if (num1 >= num2) {
            return num1;
        } else {
            return num2;
        }
        
    }
}