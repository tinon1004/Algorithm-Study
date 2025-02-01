from collections import deque

N, M = map(int, input().split())
maze = [list(map(int, list(input().strip()))) for _ in range(N)]

# 상,하,좌,우
dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

# 시작점 (0,0) 추가
queue = deque([(0, 0)])  

while queue:
    x, y = queue.popleft()
    
    for i in range(4):
        nx, ny = x + dx[i], y + dy[i]
        
        # 범위를 벗어나면 무시
        if nx < 0 or ny < 0 or nx >= N or ny >= M:
            continue
        
        # 이동할 수 없는 곳이면 무시
        if maze[nx][ny] == 0:
            continue
        
        if maze[nx][ny] == 1:
            maze[nx][ny] = maze[x][y] + 1
            queue.append((nx, ny))

print(maze[N-1][M-1])
