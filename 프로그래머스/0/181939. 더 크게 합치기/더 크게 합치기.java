class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String result1 = a +"" + b ;
        String result2 = b +"" + a ;
        
        int num1 = Integer.parseInt(result1);
        int num2 = Integer.parseInt(result2);
        
        if (num1 >= num2) {
            return num1;
        } else {
            return num2;
        }
    }
}