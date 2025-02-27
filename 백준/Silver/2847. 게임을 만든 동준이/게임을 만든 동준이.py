n = int(input())
data = [int(input()) for _ in range(n)]

count = 0
for i in range(n-2, -1, -1):
    l = i + 1

    if data[i] >= data[l]:
        count += data[i] - (data[l] - 1)
        data[i] = data[l] - 1

print(count)