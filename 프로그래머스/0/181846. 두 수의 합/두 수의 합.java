import java.math.*;

class Solution {
    public String solution(String a, String b) {
        String answer = "";
        
        // BigInteger 이용해 매우 큰 수를 문자열로 만듦
        // int < ling < BigInteger
        BigInteger numA = new BigInteger(a);
        BigInteger numB = new BigInteger(b);
        
        BigInteger sum = numA.add(numB);
        answer = sum.toString();
        
        return answer;
    }
}