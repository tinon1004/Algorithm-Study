n, m = map(int,input().split())
r, c, d = map(int, input().split())
maps = [list(map(int,input().split())) for _ in range(n) ]

#북, 동, 남, 서
dr = [-1, 0, 1, 0]
dc = [0, 1, 0, -1]

#방문 체크
visited = [[0]*m for _ in range(n)]

# 시작 좌표 & 카운트
visited[r][c] = 1
cnt = 1

while True:
    flag = 0
    for _ in range(4):
        d = (d+3) % 4
        nr = r + dr[d]
        nc = c + dc[d]

        if 0 <= nr < n and 0 <= nc < m and maps[nr][nc] == 0:
            if visited[nr][nc] == 0:
                visited[nr][nc] = 1
                cnt += 1
                r = nr
                c = nc
                flag = 1
                break

    if flag == 0:
        if maps[r-dr[d]][c-dc[d]] == 1:
            print(cnt)
            break
        else:
            r, c = r-dr[d], c-dc[d]