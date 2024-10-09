import sys

def check(now):
    for j in range(1, n):
        # 차이가 1보다 클 때
        if abs(now[j] - now[j - 1]) > 1:   # 1. 차이가 1만 가능
            return False

        # 2.  현재 < 이전
        if now[j] < now[j - 1]:        
            for k in range(l): 
                if j + k >= n or used[j + k] or now[j] != now[j + k]: # 범위 넘어감 or 이미 설치함 or 낮은 곳의 높이가 다른 경우
                    return False
                if now[j] == now[j + k]:
                    used[j + k] = True
       # 3.  현재 > 이전
        elif now[j] > now[j - 1]:         
            for k in range(l):
                if j - k - 1 < 0 or now[j - 1] != now[j - k - 1] or used[j - k - 1]:  # 범위 넘어감 or 이미 설치함 or 낮은 곳의 높이가 다른 경우
                    return False
                if now[j - 1] == now[j - k - 1]:
                     used[j - k - 1] = True
    return True 

n, l = map(int, sys.stdin.readline().split())
graph = [list(map(int, sys.stdin.readline().split())) for _ in range(n)]
result = 0

# 1. 가로 확인
for i in range(n):
    used = [False for _ in range(n)] 
    if check(graph[i]): 
        result += 1

# 2. 세로 확인
for i in range(n):
    used = [False for _ in range(n)]
    if check([graph[j][i] for j in range(n)]):
        result += 1

print(result)