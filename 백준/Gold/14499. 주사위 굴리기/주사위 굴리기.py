import sys
input = sys.stdin.readline

# 동쪽, 서쪽, 북쪽, 남쪽
dr = [0, 0, -1, 1]
dc = [1, -1, 0, 0]

n, m, x, y, k = map(int, input().split())
grid = [list(map(int, input().split())) for _ in range(n)]
moves = list(map(int, input().split()))
dice = [0, 0, 0, 0, 0, 0]  # 위, 북, 동, 서, 남, 아래

for move in moves:
    d = move - 1  # 0-based index로 변환
    nx, ny = x + dr[d], y + dc[d]

    if not 0 <= nx < n or not 0 <= ny < m:
        continue

    if d == 0:  # 동
        dice[0], dice[2], dice[5], dice[3] = dice[3], dice[0], dice[2], dice[5]
    elif d == 1:  # 서
        dice[0], dice[2], dice[5], dice[3] = dice[2], dice[5], dice[3], dice[0]
    elif d == 2:  # 북
        dice[0], dice[1], dice[5], dice[4] = dice[4], dice[0], dice[1], dice[5]
    else:  # 남
        dice[0], dice[1], dice[5], dice[4] = dice[1], dice[5], dice[4], dice[0]

    if grid[nx][ny] == 0:
        grid[nx][ny] = dice[5]
    else:
        dice[5] = grid[nx][ny]
        grid[nx][ny] = 0

    x, y = nx, ny
    print(dice[0])  # 주사위 윗면 출력