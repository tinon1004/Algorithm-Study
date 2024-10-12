from collections import deque

n = int(input())
v = int(input())

info = [list(map(int, input().split())) for _ in range(v)]
graph = [[] for _ in range(n + 1)]
visited = [0] * (n + 1)

# 연결
for a, b in info:
    graph[a].append(b)
    graph[b].append(a)


def bfs(graph, start):
    q = deque([start])

    visited[start] = 1
    count = 0

    while q:
        current = q.popleft()
        for i in graph[current]:
            if visited[i] == 0:
                q.append(i)
                visited[i] = 1
                count += 1
    return count


print(bfs(graph, 1))

