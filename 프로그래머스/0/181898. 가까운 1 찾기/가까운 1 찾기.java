class Solution {
    public int solution(int[] arr, int idx) {
        
        for (int i = idx; i < arr.length; i++) {
            if (arr[i] == 1){
                return i;
            }
        }
        // for문이 한 번도 시작되지 않는 경우도 존재
        return -1;
    }
}