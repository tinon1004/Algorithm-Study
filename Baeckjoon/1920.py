def samenum(n,m):

    if n>=1 and n<=1000000:
        for i in range(n):
            if m>=1 and m<=1000000:
                for j in range(m):
                    if n[i] == m[j]:
                       return print(1)
                    else:
                        return print(0)

n = int(input())
m = int(input())
samenum(n,m)