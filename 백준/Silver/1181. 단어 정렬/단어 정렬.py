size = int(input())
strr = []
for i in range(size):
    strr.append(input())

strr = list(set(strr))
strr.sort()
strr.sort(key = len) 
for i in strr:
    print(i)