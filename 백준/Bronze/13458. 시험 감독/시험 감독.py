n = int(input())
a = list(map(int,input().split()))
b,c = map(int,input().split())

count=0

for i in a:
  count +=1
  
  if i-b > 0:
        count += ((i-b) // c )
        if (i-b) % c != 0:
          count += 1
print(count)


