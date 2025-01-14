from collections import deque

n, w, L = map(int, input().split())
truck_weights = list(map(int, input().split()))

def truck_crossing_time(n, w, L, truck_weights):
    # 다리 위 상태 큐 (현재 다리 위에 있는 트럭들의 무게와 위치)
    # 다리 길이만큼 초기화
    bridge = deque([0] * w)  
    current_weight = 0  
    time = 0  

    for truck in truck_weights:
        while True:
            time += 1
            # 다리에서 가장 앞에 있는 트럭이 나감
            outgoing_truck = bridge.popleft()
            current_weight -= outgoing_truck

            # 현재 트럭이 다리에 진입할 수 있는지 확인
            if current_weight + truck <= L:
                # 트럭 진입 가능, 다리 위에 추가
                bridge.append(truck)
                current_weight += truck
                break
            else:
                # 트럭 진입 불가능, 빈 공간 추가
                bridge.append(0)

    # 마지막 트럭이 다리를 완전히 건너는 시간 추가
    time += w
    return time

print(truck_crossing_time(n, w, L, truck_weights))
