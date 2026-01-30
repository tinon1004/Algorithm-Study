class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for (int i=0; i<queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            
            //가장 큰 값을 할당한 뒤, 작은 수가 있으면 갱신
            int min = Integer.MAX_VALUE;
            
            for (int j=s; j <= e; j++) {
                //j번째 원소가 min보다 작고,k보다 크면 min 갱신
                if (arr[j] < min && k < arr[j]) {
                    min = arr[j];
                }
            }
            
            if (min != Integer.MAX_VALUE) {
                answer[i] = min;
            } else {
                answer[i] = -1;
            }

        }
        return answer;
    }
}