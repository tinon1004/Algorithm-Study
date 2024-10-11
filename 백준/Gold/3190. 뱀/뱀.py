N = int(input())
K = int(input())
alst = [tuple(map(int, input().split())) for _ in range(K)]
L = int(input())
dlst = [input().split() for _ in range(L)]

di, dj = [-1,0,1,0], [0,1,0,-1] 
dtbl = [0]*(10001)            
for sec,turn in dlst:
    dtbl[int(sec)]=turn

dr = 1                        
snake = [(1,1)]                 
ans = 0                     

while True:
    ans += 1                    
    ci,cj = snake[0]      
    ni,nj = ci+di[dr],cj+dj[dr] 
    if 1<=ni<=N and 1<=nj<=N and (ni,nj) not in snake:
        snake.insert(0,(ni,nj)) 
        if (ni,nj) in alst:
            alst.remove((ni,nj))
        else:
            snake.remove((snake[-1]))  
        if dtbl[ans]=='D':    
            dr = (dr+1)%4
        elif dtbl[ans]=='L':    
            dr = (dr+3)%4
    else:                     
        break
print(ans)