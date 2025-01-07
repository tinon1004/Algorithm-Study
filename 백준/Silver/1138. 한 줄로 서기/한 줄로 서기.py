n = int(input())
i_list = list(map(int, input().split()))

index = [i for i in range(n)]

seq = [0]*n

for i in range(n):
    seq[index[i_list[i]]] = i + 1
    index.remove(index[i_list[i]])

for i in seq:
    print(i, end=' ')