n = int(input())
result= 0

for i in range(1, n+1):
    if i <= 99:
        result += 1

    else:
        num = list(map(int, str(i)))
        if num[2]-num[1] == num[1]-num[0]:
            result += 1
    
print(result)