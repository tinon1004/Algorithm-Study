class Solution {
    public String solution(String my_string, String alp) {
        String[] answer = my_string.split("");
        
        for (int i = 0; i < answer.length; i++) {
            
            if (answer[i].equals(alp)) {
                answer[i] = answer[i].toUpperCase();
            }
             
        }
        
        return String.join("",answer);
    }
}