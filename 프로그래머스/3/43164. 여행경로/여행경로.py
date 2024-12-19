from collections import deque
def solution(tickets):

    d= deque()
    n = len(tickets)
    for i in range(n):
        if tickets[i][0] == "ICN":
            visit = [0 for i in range(n)]
            visit[i] = -1
            d.append([tickets[i][1],tickets[i],visit])
    ans_l = []
    while d:
        d2 = d.popleft()
        current, ans, visit = d2[0], d2[1], d2[2]
        if len(ans) == n+1:
            ans_l.append(ans)
            continue
        for i in range(n):
            if tickets[i][0] == current:
                if visit[i] == 0:
                    new_visit = visit[:]
                    new_ans = ans[:]
                    new_visit[i] = -1
                    new_ans.append(tickets[i][1])
                    d.append([tickets[i][1], new_ans, new_visit])
                    
    ans_l.sort()
    return ans_l[0]