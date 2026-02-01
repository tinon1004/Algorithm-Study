class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        String word = "";
        
            if (is_suffix.length() > my_string.length()) {
                return 0;
            }
        
            word = my_string.substring(my_string.length() - is_suffix.length());
            
            // 문자열 비교시에는 equals() 사용
            if (word.equals(is_suffix)) {
                return 1;
            } else {
                return 0;
            }
        //  문자열이 특정 접미사로 끝나는지 확인할 때 사용       
        //  return my_string.endsWith(is_suffix) ? 1 : 0;
                
    }
}