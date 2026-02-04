class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int patLength = pat.length();
        int myStringLength = myString.length();
        
        // 문자열 뒤쪽부터 pat가 나오는 마지막 부분 문자열 찾기
        for (int i = myString.length() - 1; i >= 0; i--) {
            // 문자열 찾았으면 앞에서 부터 다시 자르기
            String word = myString.substring(0, i + 1);
            // endsWith로 문자열 끝 확인하기
            if (word.endsWith(pat)) {
                answer = word;
                break;
            }
        }
        
        return answer;
    }
}