import java.util.*;

public class Main {

    public static int truckCrossingTime(int n, int w, int L, int[] truckWeights) {
        Deque<Integer> bridge = new ArrayDeque<>();
        
        // 다리 길이만큼 0으로 초기화
        for (int i = 0; i < w; i++) {
            bridge.addLast(0);
        }

        int currentWeight = 0;
        int time = 0;

        for (int truck : truckWeights) {
            while (true) {
                time++;

                // 다리에서 가장 앞에 있는 트럭(또는 0) 제거
                int outgoingTruck = bridge.pollFirst();
                currentWeight -= outgoingTruck;

                // 현재 트럭이 다리에 올라갈 수 있는지 확인
                if (currentWeight + truck <= L) {
                    bridge.addLast(truck);
                    currentWeight += truck;
                    break;
                } else {
                    // 트럭 못 올라가면 빈 공간(0) 추가
                    bridge.addLast(0);
                }
            }
        }

        // 마지막 트럭이 다리를 건너는 시간
        time += w;
        return time;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int w = sc.nextInt();
        int L = sc.nextInt();

        int[] truckWeights = new int[n];
        for (int i = 0; i < n; i++) {
            truckWeights[i] = sc.nextInt();
        }

        System.out.println(truckCrossingTime(n, w, L, truckWeights));
    }
}