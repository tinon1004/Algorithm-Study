#최소 시간에는 bfs 활용

from collections import deque

n, k = map(int, input().split())

MAX = 10 ** 5
visited = [0] * (MAX + 1)

# s = 시작위치
def bfs(n):
    q = deque()
    q.append(n)

    while q:
        cur = q.popleft() #n,i
        if cur == k:
            return visited[k]
        for i in (cur+1, cur-1, cur * 2):
            if 0 <= i <= MAX and not visited[i]:
              visited[i] = visited[cur] + 1
              q.append(i)
print(bfs(n))