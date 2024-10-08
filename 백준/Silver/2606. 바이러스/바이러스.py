from collections import deque

n = int(input())
v = int(input())

graph = [[] for i in range(n+1)]
visited = [0]*(n+1) #방문한 컴퓨터인지 표시할 배열

#그래프 생성
for i in range(v):
    a ,b = map(int,input().split())
    graph[a].append(b)
    graph[b].append(a)

visited[1]=1 # 1번 컴퓨터부터 시작

def bfs(start):
    q = deque()
    q.append(start)
    count = 0

    while q:
        curr = q.popleft()
        for i in graph[curr]: #curr와 연결된 다른 컴퓨터 리스트
            if visited[i] == 0: # visited[i] 감염 여부 확인
                q.append(i) # 현재 감염된 컴퓨터로 큐에 추가하여 다음에 탐색할 컴퓨터로 추가
                visited[i] = 1 # 감염 기록
                count += 1  # 감염된 컴퓨터 수를 증가시킴
    return count

print(bfs(1))