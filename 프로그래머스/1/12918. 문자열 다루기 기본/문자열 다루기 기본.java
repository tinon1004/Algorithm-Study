class Solution {
    public boolean solution(String s) {
        
        if (s.length() != 4 && s.length() != 6) {
            return false;
        }
        
        for (int i = 0; i < s.length(); i++) {
            // 0보다 작고, 9보다 큼 -> 숫자가 아닌 문자
            if(s.charAt(i) < '0' || s.charAt(i) > '9') {
                return false;
            }
           
        }
        return true;
    }
}