class Solution {
    public String solution(String myString) {
        String answer = "";
        String[] arr = myString.split("");
        
        for (int i = 0; i < arr.length; i++) {
            // 문자열 비교는 compareTo() 를 사용해야 함
            // 음수 → "l" 보다 앞 문자, 0 → 같음, 양수 → 뒤 문자
            if (arr[i].compareTo("l") < 0) {
                arr[i] = "l";
            }
        }
        
        // 문자열 배열을 문자열 하나로 다시 합치기
        return String.join("", arr);
    }
}