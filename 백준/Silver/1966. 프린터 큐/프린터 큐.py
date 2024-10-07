from collections import deque

t = int(input())

for _ in range(t):
    n,m = map(int,input().split())
    stack = list(map(int,input().split()))
    q= deque()

    for i,x in enumerate(stack):
        q.append((i,x))
    stack.sort()
    count = 0
    while q:
        i,x = q.popleft()
        if x == stack[-1]:
            stack.pop()
            count +=1
            if i == m:
                print(count)
                break
        else:
            q.append((i,x))

