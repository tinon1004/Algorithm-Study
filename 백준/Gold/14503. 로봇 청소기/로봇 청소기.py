n, m = map(int,input().split())
r, c, d = map(int,input().split())
maps = [list(map(int,input().split())) for _ in range(n)]

#북, 동,남,서
dr=[-1, 0, 1, 0]
dc=[0, 1, 0, -1]

#범위 안 및 벽
def maps_size(x,y):
    return 0 <= x < n and 0 <= y < m

#청소
def cleaner(x,y,d):
    count = 0
    while True:
        #1번: 청소하고 횟수 증가
        if maps[x][y] == 0:
            maps[x][y] = -1
            count +=1

        #3번: 주변 청소 여부 탐색 및 반시계 회전
        for _ in range(4):
            d=(d+3) % 4
            nx, ny = x + dr[d], y +dc[d]
            if maps_size(nx, ny) and maps[nx][ny] == 0:
                x,y= nx,ny
                break # 다시 1번으로

        #2번: 주변 4칸 모두 청소 완료 상태면 후진 및 벽 탐지 멈춤
        else:
            x,y = x + dr[d]*(-1), y +dc[d]*(-1)
            if maps_size(x, y) and maps[x][y] == 1 :
                print(count)
                return

cleaner(r,c,d)











