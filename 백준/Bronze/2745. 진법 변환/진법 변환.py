import sys

n,b = sys.stdin.readline().split()
sum = 0

for i in range(len(n)) : 
  if (n[(len(n)-1)-i].isdigit()) :  
    sum += int(n[(len(n)-1)-i]) * (int(b)**i)
  else : 
    sum += (ord(n[(len(n)-1)-i])-55) * (int(b)**i)

print(sum)