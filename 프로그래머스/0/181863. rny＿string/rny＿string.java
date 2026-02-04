import java.util.*;

class Solution {
    public String solution(String rny_string) {
        String[] arr = rny_string.split("");
        ArrayList<String> result = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("m")) {
                result.add("rn");
            } else {
                result.add(arr[i]);
            }
        }
        
        return String.join("",result);
    }
}