import sys
input = sys.stdin.readline

N, M = map(int, input().split())
A = set([input().rstrip() for _ in range(N)])
B = set([input().rstrip() for _ in range(M)])

result = sorted(list(A & B))
print(len(result))
print(*result, sep="\n")