n, m = map(int,input().split())
box = [0]*n

for _ in range(m):
    i,j,k = map(int,input().split())

    for idx in range(i,j+1):
        box[idx-1]=k

for number in range(n):
    print(box[number], end=" ")