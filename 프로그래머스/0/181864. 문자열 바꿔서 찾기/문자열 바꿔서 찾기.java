class Solution {
    public int solution(String myString, String pat) {
        String[] arr = myString.split("");
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("A")) {
                arr[i] = "B";
            } else {
                arr[i] = "A";
            }
        }
        
        String result = String.join("",arr);
        
        // 삼항 연산자에는 if 작성 안 됨    
        return (result.contains(pat)) ? 1 : 0;
        
    }
}