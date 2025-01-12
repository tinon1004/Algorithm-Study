def restore_array(H, W, X, Y, B):
    
    A = [[0] * W for _ in range(H)]

    # 배열 A의 원소 복원
    for i in range(H):
        for j in range(W):
            if i >= X and j >= Y:
                A[i][j] = B[i][j] - A[i - X][j - Y]
            else:
                A[i][j] = B[i][j]

    return A

H, W, X, Y = map(int, input().split())
B = [list(map(int, input().split())) for _ in range(H + X)]
A = restore_array(H, W, X, Y, B)

for row in A:
    print(*row)