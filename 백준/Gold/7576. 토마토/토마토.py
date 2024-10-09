from collections import deque

m, n = map(int, input().split())
board = [list(map(int, input().split())) for _ in range(n)]

# 북, 동, 남, 서
dr = [-1, 0, 1, 0]
dc = [0, 1, 0, -1]

q = deque()

# 익은 토마토 찾기
for i in range(n):  
    for j in range(m):  
        if board[i][j] == 1:
            q.append((i, j))

# BFS 템플릿
def bfs():
    day = -1  # 초기 일 수 설정

    while q:
        day += 1
        # 익은 토마토 수만큼 반복
        for _ in range(len(q)):
            x, y = q.popleft()

            for next_v in range(4):
                nx, ny = x + dr[next_v], y + dc[next_v]
                # 범위 내에 있고, 익지 않은 토마토의 경우
                if 0 <= nx < n and 0 <= ny < m and board[nx][ny] == 0:
                    board[nx][ny] = 1  # 토마토 익힘
                    q.append((nx, ny))  # 큐에 추가

    return day

result = bfs()

# 모든 토마토 확인
for row in board:
    if 0 in row:  # 익지 않은 토마토가 있다면
        print(-1)
        break
else:  # 모든 토마토가 익었다면
    print(result)
