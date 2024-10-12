N,M = map(int,input().split())
info = [list(map(int,input().split())) for _ in range(M)]
box = [0] * N

for num in info:
    i,j,k = num
    for p in range(i-1,j):
        box[p]=k

print(*box)