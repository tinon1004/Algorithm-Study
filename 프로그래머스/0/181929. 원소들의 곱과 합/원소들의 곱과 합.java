class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int pro = 1;
        
        for(int i : num_list){
            sum += i;
            pro *= i;
        }
        
        if ( pro < sum * sum){
            return 1;
        }
        else return 0;
        
    }
}