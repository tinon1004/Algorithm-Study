n, k = map(int,input().split())

table = [list(map(int,input().split())) for _ in range(n)]

table.sort(key = lambda x: (-x[1], -x[2], -x[3]))

for i in range(n):
    if table[i][0] == k:
        idx = i
        
# 중복 체크        
for j in range(n):
    if table[idx][1:] == table[j][1:] :
        print(j+1)
        break