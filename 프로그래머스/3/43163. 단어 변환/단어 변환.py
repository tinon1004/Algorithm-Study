from collections import deque

def check(word1, word2):
    cnt = 0
    for i in range(len(word1)):
        if word1[i] != word2[i]:
           cnt += 1
    return cnt
    
def solution(begin, target, words):
    answer = 0
    
    # 만약 words에 목표 단어가 없다면 바로 0 반환
    if target not in words:
        return 0
    
    q = deque()
    q.append((begin, 0))
    
    while q:
        n_word, times = q.popleft()
        if n_word == target:
            return times
        
        for word in words:
            change = check(word, n_word)
            if change == 1:
                q.append((word, times + 1))