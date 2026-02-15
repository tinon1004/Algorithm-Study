class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for (int i = 0; i < quiz.length; i++) {
            String[] str = quiz[i].split(" ");
            
            int x = Integer.parseInt(str[0]);
            String op = str[1];
            int y = Integer.parseInt(str[2]);
            int z = Integer.parseInt(str[4]);
            
            int sum = 0;
            if (op.equals("+")) {
                sum = x + y;
            } else if (op.equals("-")) {
                sum = x - y;
            }
            
            if (sum == z) {
                answer[i] = "O";
            } else {
                answer[i] = "X";
            }
            
        }
        
        return answer;
    }
}