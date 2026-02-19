import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        
        Arrays.sort(spell);
        String s = String.join("", spell);
        
        for (int i = 0; i < dic.length; i++) {
            
            String[] str = dic[i].split("");
            Arrays.sort(str);
            String s2 = String.join("",str);
            
            if (s2.equals(s)) {
                return 1;
            }
        }
        
        return 2;
    }
}