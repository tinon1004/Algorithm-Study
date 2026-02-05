class Solution {
    public int solution(int[] arr1, int[] arr2) {
        
        // 길이 비교 → 합 비교 → 같으면 0
        
        //1. 길이 비교
        if (arr1.length > arr2.length) return 1;
        if (arr1.length < arr2.length) return -1;
        
        //2. 길이가 같으면 합 비교
        int sum1 = 0;
        int sum2 = 0;
        
        for (int num : arr1) {
            sum1 += num;
        }
        
        for (int num : arr2) {
            sum2 += num;
        }
        
        if (sum1 > sum2) return 1;
        if (sum1 < sum2) return -1;
        
        // 3. 합도 같으면 0 반환
        return 0;
    }
}