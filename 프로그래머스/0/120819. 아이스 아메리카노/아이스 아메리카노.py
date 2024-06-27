def solution(money):
    answer = []
    count = money // 5500
    change = money % 5500
    answer.append(count)
    answer.append(change)
    return answer