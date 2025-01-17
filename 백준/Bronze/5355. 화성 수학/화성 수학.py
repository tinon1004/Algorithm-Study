T = int(input())

for i in range(T) :
    case = list(map(str,input().split()))
    res = float(case[0])
    for y in range(len(case)) : 
        if case[y] == '@' :
            res *= 3
        elif case[y] == '%' :
            res += 5
        elif case[y] == '#' :
            res -= 7
    print("%0.2f" % res)