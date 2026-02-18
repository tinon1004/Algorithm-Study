class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int n = p.length();
        String s = "";
        
        for (int i = 0; i < t.length() - n + 1; i++) {
            
            s = t.substring(i, i + n);
            
            long numt = Long.parseLong(s);
            long nump = Long.parseLong(p);
            
            if (numt <= nump) 
                answer++;
        }
        
        return answer;
    }
}