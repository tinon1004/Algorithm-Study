
N, K = map(int, input().split()) 
table = list(input().strip())   

eaten_count = 0

# 각 자리 순회
for i in range(N):
    # 현재 자리가 사람인지 확인
    if table[i] == 'P':
        # 현재 사람이 선택할 수 있는 햄버거 찾기
        for j in range(max(0, i - K), min(N, i + K + 1)):  
            if table[j] == 'H': 
                eaten_count += 1 
                table[j] = 'X'  
                break 

print(eaten_count)