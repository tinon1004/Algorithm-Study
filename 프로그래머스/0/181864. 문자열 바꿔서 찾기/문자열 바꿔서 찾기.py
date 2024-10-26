def solution(my, pat):
    answer = 0
    my=my.replace("A","C")
    my=my.replace("B","A")
    my=my.replace("C","B")
    if pat in my:
        answer=1
    return answer