from collections import deque

def bfs(i,j):
    q=deque([(i,j)])
    flist=[]
    visited=[[0]*N for _ in range(N)]
    visited[i][j]=1
    fish =0

    while q:
        ci,cj = q.popleft()

        #fish와 visited를 공유하기 때문에 -1 필요
        if fish == visited[ci][cj]:
            return flist, fish-1


        for di,dj in ((-1,0),(1,0),(0,-1),(0,1)):
            ni, nj = ci + di, cj + dj
            # 조건: 범위 내, 아직 미방문, 이동 조건인 아기상어 >= 물고기
            if 0<= ni <N and 0<= nj < N and visited[ni][nj] == 0 and shark_size >= board[ni][nj]:
                q.append((ni,nj))
                visited[ni][nj] = visited[ci][cj] +1

                #먹을 수 있는 물고기인지 확인
                if 0 < board[ni][nj] < shark_size:
                    flist.append((ni,nj))
                    fish = visited[ni][nj]
    return flist, fish-1


N = int(input())
board = [list(map(int,input().split())) for _ in range(N)]

time =0
shark_size=2
fish = 0

#상어 위치 찾기
for i in range(N):
    for j in range(N):
        if board[i][j] == 9:
            board[i][j] = 0
            ci,cj = i, j




while True:

    flist, dist = bfs(ci,cj)

    # 반환받은 flist가 없으면 종료
    if not flist:
        break

    # 가장 위쪽, 상단 물고기를 가져옴
    ni,nj = min(flist)
    board[ni][nj] = 0
    ci, cj = ni, nj

    time += dist
    fish +=1

    #상어 사이즈
    if fish == shark_size:
        fish = 0
        shark_size += 1
print(time)