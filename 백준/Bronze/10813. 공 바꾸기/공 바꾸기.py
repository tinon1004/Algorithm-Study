n,m = map(int,input().split())
info = [list(map(int,input().split())) for _ in range(m)]
box=[i for i in range(1,n+1)]

for turn in info:
    i,j = turn

    temp = box[i-1]
    box[i-1]=box[j-1]
    box[j-1]=temp

print(*box)