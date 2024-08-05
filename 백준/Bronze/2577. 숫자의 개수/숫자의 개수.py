A = int(input())
B = int(input())
C = int(input())

result = list(str(A*B*C))
for i in range(0,10):
    count = 0
    for n in result:
        if i == int(n):
            count += 1
    print(count)