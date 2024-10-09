from collections import deque

# 원판의 개수, 원판에 적힌 정수의 개수, T 번 회전
n, m, t = map(int, input().split())
board = [deque(int(x) for x in input().split()) for _ in range(n)]

info = [list(map(int, input().split())) for _ in range(t)]

# t번 회전
for tc in range(t):
    x, d, k = info[tc]

    # 원판 회전
    for i in range(n):
        if (i + 1) % x == 0:
            if d == 0:  # 시계 방향
                board[i].rotate(k)
            else:  # 반시계 방향
                board[i].rotate(-k)

    remove = set()  # 중복 제거를 위한 set 사용
    # 같은 원판 내 동일 숫자 찾기
    for i in range(n):
        for j in range(m):
            # 오른쪽 숫자 확인
            if board[i][j] != 0 and board[i][j] == board[i][(j + 1) % m]:
                remove.add((i, j))
                remove.add((i, (j + 1) % m))

    # 인접한 위치의 동일 숫자 찾기
    for j in range(m):
        for i in range(n - 1):
            if board[i][j] != 0 and board[i][j] == board[i + 1][j]:
                remove.add((i, j))
                remove.add((i + 1, j))

    # 제거할 위치에 숫자를 0으로 변경
    for x, y in remove:
        board[x][y] = 0

    # 제거할 것이 없을 경우 평균 구하기
    if not remove:
        total_sum = sum(sum(board[i]) for i in range(n))
        count = sum(1 for i in range(n) for j in range(m) if board[i][j] != 0)
        if count > 0:
            average = total_sum / count

            for i in range(n):
                for j in range(m):
                    if board[i][j] < average and board[i][j] != 0:
                            board[i][j] += 1
                    elif board[i][j] > average and board[i][j] != 0:
                            board[i][j] -= 1

# 최종 원판 숫자 합 구하기
answer = sum(sum(board[i]) for i in range(n))
print(answer)
