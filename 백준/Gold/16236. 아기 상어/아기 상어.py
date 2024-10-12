from collections import deque

def bfs(si,sj):
    flist=[]
    q = deque()
    visited =[[0]*N  for _ in range(N)]

    q.append((si,sj))
    visited[si][sj] =1
    fish = 0

    while q:
        ci,cj = q.popleft()
        if fish == visited[ci][cj]:
            return flist,fish -1

        # 조건에 따른 방향 이동
        # 범위 내 , 미방문인지, 물고기 < 아기 상어
        for di,dj in ((-1,0),(1,0),(0,-1),(0,1)):
            ni,nj = ci+di, cj+dj
            if 0<= ni <N and 0<= nj < N and visited[ni][nj] == 0 and shark_size >= board[ni][nj]:
                q.append((ni,nj))
                visited[ni][nj] = visited[ci][cj]+1
                #아기상어가 먹을 수 있는 물고기인 경우 Flist에 추가
                if shark_size > board[ni][nj] > 0:
                    flist.append((ni,nj))
                    fish = visited[ni][nj]


    return flist, fish -1






N = int(input())
board = [list(map(int,input().split())) for _ in range(N)]

#아기상어 위치 찾기
for i in range(N):
    for j in range(N):
        if board[i][j] == 9:
            ci,cj = i,j
            board[i][j] = 0 #아기 상어 자리 0으로 바꾸기

shark_size = 2
time = 0
fish = 0

while True:
    flist, dist = bfs(ci,cj)

    #물고기 수가 없다면 종료
    if len(flist) == 0:
        break

    #물고기 위치 정렬, 가장 왼쪽 상단 기준 가져오기,
    #상어 위치 재설정, 원래 상어 위치는 0으로 바꾸기

    ni, nj = min(flist)
    board[ni][nj] = 0
    ci,cj = ni, nj

    # 이동 거리, 먹은 물고기 더하기 더하기
    time += dist
    fish += 1

    # 먹은 물고기 수와 상어 사이즈가 같으면, 상어 +1, 물고기 초기화
    if fish == shark_size:
        shark_size +=1
        fish = 0
print(time)