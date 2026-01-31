class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder answer = new StringBuilder(my_string);
        
        //문자열 문제에서 '수정'이 나오면 StringBuilder 떠올리기
        
        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            
            while (s < e) {
                //양쪽 끝 문자부터 하나씩 이동하며 서로 교환해서 문자열을 뒤집는 로직
                char temp = answer.charAt(s);
                
                //s 자리에 e 문자를 넣음
                answer.setCharAt(s, answer.charAt(e));
                answer.setCharAt(e, temp);
                
                s++;
                e--;
            }
        }
        
        // StringBuilder를 바로 return 불가능
        return answer.toString();
    }
}