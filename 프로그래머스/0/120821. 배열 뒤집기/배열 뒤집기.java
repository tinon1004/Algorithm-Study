class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        
        int temp = 0;
        
        for (int i = 0; i < num_list.length; i++) {
            
            temp = num_list[i];
            answer[i] = num_list[num_list.length - 1 - i];
            answer[num_list.length - 1 - i] = temp;
            
        }
        
        return answer;
    }
}