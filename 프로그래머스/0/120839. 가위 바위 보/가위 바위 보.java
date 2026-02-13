class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        for (int i = 0; i < rsp.length(); i++) {
            char word = rsp.charAt(i);
            if (word == '2') {
                answer += "0";
            } else if (word == '0') {
                answer += "5";
            } else if (word == '5') {
                answer += "2";
            } 
        }
        
        return answer;
    }
}