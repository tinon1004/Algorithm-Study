import sys
input = sys.stdin.readline

N, M = map(int, input().split())
W = {}

for _ in range(N):
    word = input().rstrip()
    
    if len(word) < M:
        continue
    if word in W:
        W[word] += 1
    else:
        W[word] = 1

W = sorted(W.items(), key = lambda x : (-x[1], -len(x[0]), x[0]))

for i in W:
    print(i[0])