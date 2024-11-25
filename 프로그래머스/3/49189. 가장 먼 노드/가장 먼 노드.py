from collections import deque 
def solution(n, edge):
    graph = [[] for _ in range(n + 1)]
    visited = [0] * (n + 1)    
    
    for eg in edge:
        a, b = eg[0], eg[1]
        graph[a].append(b)
        graph[b].append(a)
    
    q = deque() 
    q.append(1)
    visited[1] = 1 
    while q:
        x = q.popleft() 
        for i in graph[x]:
            if not visited[i]:
                visited[i] = visited[x] + 1 
                q.append(i)
    
    max_value = max(visited)
    answer = visited.count(max_value)
    
    return answer