class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int num1 = 0;
        int num2 = 1;
        
        if (num_list.length >= 11) {
            for (int i = 0; i < num_list.length; i++) {
                num1 += num_list[i];
                answer = num1;
            }
        } else if (num_list.length <= 10) {
            for (int j = 0; j < num_list.length; j++) {
                num2 *= num_list[j];
                answer = num2;
            }
        }
        return answer;
    }
}