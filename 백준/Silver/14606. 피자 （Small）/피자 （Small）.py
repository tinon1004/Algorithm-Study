N = int(input())
floor = [0] * 11 
floor[1] = 0 
floor[2] = 1 

for i in range(3, N+1):
    k = i//2 
    floor[i] = k * (i-k) + floor[k] + floor[i-k]    
print(floor[N])