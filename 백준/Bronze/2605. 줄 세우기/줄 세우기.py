n = int(input())
num = [int(x) for x in input().split()]
seq = [int(x) for x in range(1, n+1)]

arr = []
for i in range(n):
    arr.insert(i - num[i], seq[i])

print(*arr)