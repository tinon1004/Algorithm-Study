import sys

n = int(input())

heart_x, heart_y = 0, 0  
arm_left, arm_right = 0, 0 
back = 0 
leg_left, leg_right = 0, 0 

for i in range(n):  
    for j, cookie in enumerate(list(sys.stdin.readline().strip())):
        # 머리 아래 심장 찾기
        if (not heart_x) and (not heart_y) and (cookie == '*'):
            # 심장의 위치를 (행 + 1, 열)로 저장
            heart_x, heart_y = i + 1, j  
        
        # 왼팔, 심장과 같은 행 
        elif (i == heart_x) and (j < heart_y) and (cookie == '*'):
            arm_left += 1
        
        # 오른팔, 심장과 같은 행 
        elif (i == heart_x) and (j > heart_y) and (cookie == '*'):
            arm_right += 1
        
        # 허리, 심장과 같은 열
        elif (i > heart_x) and (j == heart_y) and (cookie == '*'):
            back += 1
        
        # 왼쪽 다리, 허리 아래
        elif (i > heart_x + back) and (j < heart_y) and (cookie == '*'):
            leg_left += 1
        
        # 오른쪽 다리, 허리 아래
        elif (i > heart_x + back) and (j > heart_y) and (cookie == '*'):
            leg_right += 1

# 심장 위치를 출력 (1부터 시작)
print(heart_x + 1, heart_y + 1)

# 각 신체 부위별 * 개수
print(arm_left, arm_right, back, leg_left, leg_right)
