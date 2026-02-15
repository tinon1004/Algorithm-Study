class Solution {
    public int[] solution(int[] numlist, int n) {
        
        // i 다음에 비교할 대상이 최소 1개 이상 필요하기 때문에 -1을 함
        for (int i = 0; i < numlist.length - 1; i++) {
            // 선택 정렬 시에는 i 뒤에 있는 값만 비교해야 함
            // 그렇지 않으면 뒤섞이는 문제 발생
            for (int j = i + 1; j < numlist.length; j++) {
                int num1 = Math.abs(numlist[i] - n);
                int num2 = Math.abs(numlist[j] - n);
                
                // 거리가 가까운 것이 앞으로
                // 거리가 같으면 큰 수를 앞으로
                if (num1 > num2 || (num1 == num2 && numlist[i] < numlist[j])) {
                    int temp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = temp;
                }
            }
        }

        return numlist;
    }
}