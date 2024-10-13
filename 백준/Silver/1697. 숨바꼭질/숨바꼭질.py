from collections import deque
n,m = map(int,input().split())
road= [0]*(10**5+1)



def bfs(n):
    q=deque([n])
    visited = [0] * (10 ** 5 + 1)

    while q:
        curr = q.popleft()

        if curr == m:
            return visited[m]
        for npos in (curr+1, curr-1, 2* curr):
            if 0<=npos<=(10**5) and visited[npos] == 0:
                q.append(npos)
                #연속된 이동이 아니기 때문에 단순히 +1을 하면 안 됨
                visited[npos] = visited[curr]+1

print(bfs(n))
