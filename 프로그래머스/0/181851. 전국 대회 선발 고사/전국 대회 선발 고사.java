import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        // 2차원 배열 int[][]와는 다른 동적 2차원 구조
        List<int[]> arr = new ArrayList<>();
        
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                // [학생 등수, 학생 번호]
                arr.add(new int[] {rank[i], i});
            }
        }
        
        // ArrayList는 Collections.sort() 사용해야
        // 등수(a[0],b[0])가 작은 순서대로 정렬
        // (a,b) -> a - b  → 오름차순
        // (a,b) -> b - a  → 내림차순
        Collections.sort(arr, (a, b) -> a[0] - b[0]);
        
        // (리스트 접근) → [배열 접근]
        int a = arr.get(0)[1];
        int b = arr.get(1)[1];
        int c = arr.get(2)[1];
        
        answer = 10000 * a + 100 * b + c;
        
        return answer;
    }
}