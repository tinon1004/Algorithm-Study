import sys

N = int(sys.stdin.readline().strip())
A = set(map(int, sys.stdin.readline().split()))  

M = int(sys.stdin.readline().strip())
queries = map(int, sys.stdin.readline().split())

for q in queries:
    print(1 if q in A else 0)
