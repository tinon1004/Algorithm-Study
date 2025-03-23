n, m =map(int,input().split())
arr = {}
i=0
for i in range(0,n):
    e,p = map(str, input().split())
    arr[e]=p
    i+=1

for i in range(0,m):
    e = str(input())
    print(arr[e])