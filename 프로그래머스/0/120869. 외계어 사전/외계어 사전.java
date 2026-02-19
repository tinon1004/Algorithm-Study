import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        
        Arrays.sort(spell);
        String str = String.join("", spell);
        
        for (int i = 0 ; i < dic.length; i++) {
            String[] dics = dic[i].split("");
            Arrays.sort(dics);
            String s2 = String.join("", dics);
            
            if(s2.equals(str)) {
                return 1;
            }
        }
        
        return 2;
    }
}