class Solution {
    public int solution(String number) {
        int sum = 0;
        String[] arr = number.split("");
      
        for ( String i : arr){
           sum += Integer.parseInt(i);
        }
        
        return sum % 9;
        
    }
}