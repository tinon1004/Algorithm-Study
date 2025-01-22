from collections import deque

n = int(input()) 
person_a, person_b = map(int, input().split()) 
m = int(input()) 

graph = {i: [] for i in range(1, n + 1)}
for _ in range(m):
    parent, child = map(int, input().split())
    graph[parent].append(child)
    graph[child].append(parent)

def bfs(start, target):
    visited = [False] * (n + 1)
    queue = deque([(start, 0)])  
    visited[start] = True

    while queue:
        current, degree = queue.popleft()
        # 목표에 도달하면 촌수 반환
        if current == target:
            return degree

        # 현재 사람의 연결된 모든 사람 탐색
        for neighbor in graph[current]:
            if not visited[neighbor]:
                visited[neighbor] = True
                queue.append((neighbor, degree + 1))

    # 목표에 도달하지 못한 경우
    return -1

result = bfs(person_a, person_b)
print(result)
