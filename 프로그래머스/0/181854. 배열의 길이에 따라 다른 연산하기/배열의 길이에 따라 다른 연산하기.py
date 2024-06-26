def solution(arr, n):
    answer = []
    #배열 길이 홀짝 확인
    odd = len(arr)%2 ==1
    
    #배열 순회
    for i in range(len(arr)):
        if odd and i%2 == 0:
            arr[i] += n
        elif not odd and i%2 ==1:
            arr[i] +=n 
    
    return arr