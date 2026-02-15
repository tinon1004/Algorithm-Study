import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        
        Arrays.sort(spell);
        String str = String.join("",spell);
        
        
        for (int i = 0; i < dic.length; i++) {
            String[] dic_str = dic[i].split("");
            Arrays.sort(dic_str);
            String str2 = String.join("",dic_str);
            
            if (str2.equals(str)) {
                return 1;
            } 
        }
        
        return 2;
    }
}