class Solution {
    public String solution(String my_string, int[] indices) {
        
        // 한 글자씩 분리하여 문자열 배열로 만들기
        // "abc".split("") → ["a", "b", "c"]
        String[] answer = my_string.split("");
        
        for (int i = 0; i < indices.length; i++) {
            answer[indices[i]] = "";
        }
        
        return String.join("",answer);
    }
}