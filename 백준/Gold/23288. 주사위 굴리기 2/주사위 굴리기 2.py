
def bfs(si,sj,val):
    q=[]
    visited = [[0]* M for _ in range(N)]

    q.append((si,sj))
    visited[si][sj] = 1
    count = 1

    while q:
       ci,cj = q.pop(0)
       for di,dj in ((-1,0),(1,0),(0,-1),(0,1)):
           ni,nj = ci +di, cj + dj
           if 0<=ni < N and 0<= nj <M and visited[ni][nj] ==0 and board[ni][nj] == val:
               q.append((ni,nj))
               visited[ni][nj] =1
               count += 1
    return count



N,M,K = map(int,input().split())
board = [list(map(int,input().split())) for _ in range(N)]
#주사위
d1,d2,d3,d4,d5,d6=1,2,3,4,5,6

# 상,우,하,좌
di = [-1, 0, 1, 0]
dj = [0, 1, 0, -1]
#동쪽 이동
dr = 1
# 주사위 초기 위치
ci ,cj = 0,0
answer = 0


# k번 이동
for _ in range(K):
    #1. 이동
    ni,nj = ci +di[dr], cj + dj[dr] # 주사위 기본 동쪽 이동
    if 0 <= ni < N and 0 <= nj < M:
        ci,cj = ni,nj
    else: # 범위 밖이면 반대방향
        dr = (dr + 2) % 4
        ci, cj = ci + di[dr], cj + dj[dr]


    if dr==0:                   # 상(북)
        d2,d1,d5,d6=d1,d5,d6,d2
    elif dr==1:                 # 우(동)
        d6,d4,d1,d3=d3,d6,d4,d1
    elif dr==2:                 # 하(남)
        d2,d1,d5,d6=d6,d2,d1,d5
    else:                       # 좌(서)
        d6,d4,d1,d3=d4,d1,d3,d6


    # 2. 점수 계산
    answer +=  bfs(ci,cj,board[ci][cj])*board[ci][cj]

    # 3. 주사위 방향 전환
    if d6 > board[ci][cj]:
        dr = (dr +1)%4
    elif d6 < board[ci][cj]:
        dr = (dr +-1)%4

print(answer)
