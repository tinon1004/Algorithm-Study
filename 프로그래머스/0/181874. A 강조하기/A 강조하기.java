class Solution {
    public String solution(String myString) {
        String[] arr = myString.split("");
        
        for (int i = 0; i < arr.length; i++) {
            //한글자씩 가져오기 때문에 charAt(0);
            char c = arr[i].charAt(0);
            
            if (c == 'a' || c == 'A'){
                arr[i] = arr[i].toUpperCase();
            } else if (c >= 'A' && c <= 'Z'){
                arr[i] = arr[i].toLowerCase();
            }
        }
        
        return String.join("",arr);
    }
}