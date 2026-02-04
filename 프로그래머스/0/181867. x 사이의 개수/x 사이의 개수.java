class Solution {
    public int[] solution(String myString) {
        // split("x") : ["a","b","c"]
        // split("x", -1) : ["a","b","c",""]
        String[] answer = myString.split("x", -1);
        int[] result = new int[answer.length];
        
        for (int i = 0; i < answer.length; i++) {
            result[i] = answer[i].length();
        }
        
        return result;
    }
}