# 입력 받기
R, C, N = map(int, input().split())
grid = [input().strip() for _ in range(R)]

# N = 1일 때 초기 상태 출력
if N == 1:
    for row in grid:
        print(row)

# N이 짝수일 때 모든 칸이 폭탄으로 가득 참
elif N % 2 == 0:
    for _ in range(R):
        print("O" * C)

# N > 2 and 홀수일 때 폭발 처리
else:
    # 3초 후 상태 계산
    directions = [(-1, 0), (1, 0), (0, -1), (0, 1)]
    grid_3 = [["O"] * C for _ in range(R)]

    for r in range(R):
        for c in range(C):
            if grid[r][c] == "O":
                grid_3[r][c] = "."
                for dr, dc in directions:
                    nr, nc = r + dr, c + dc
                    if 0 <= nr < R and 0 <= nc < C:
                        grid_3[nr][nc] = "."

    # 5초 후 상태 계산 (3초 후 상태에서 다시 폭발)
    grid_5 = [["O"] * C for _ in range(R)]

    for r in range(R):
        for c in range(C):
            if grid_3[r][c] == "O":
                grid_5[r][c] = "."
                for dr, dc in directions:
                    nr, nc = r + dr, c + dc
                    if 0 <= nr < R and 0 <= nc < C:
                        grid_5[nr][nc] = "."

    # N % 4 == 3이면 3초 후 상태, 그렇지 않으면 5초 후 상태 출력
    if N % 4 == 3:
        for row in grid_3:
            print("".join(row))
    else:
        for row in grid_5:
            print("".join(row))
