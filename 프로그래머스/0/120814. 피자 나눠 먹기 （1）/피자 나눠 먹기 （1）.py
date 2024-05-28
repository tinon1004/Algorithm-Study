def solution(n):
    answer = 0
    if n%7 == 0:
        return n //7 
    elif 1<=n%7<=6:
        return n//7 +1