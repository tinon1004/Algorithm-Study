n = int(input()) 
switches = list(map(int, input().split()))
students_count = int(input()) 
students = [list(map(int, input().split())) for _ in range(students_count)]

# 스위치 상태 변경 
for gender, number in students:
    if gender == 1:  # 남
        for i in range(number - 1, n, number):
            switches[i] = 1 - switches[i]  # 상태 변경 (1->0, 0->1)
    elif gender == 2:  # 녀
        idx = number - 1
        switches[idx] = 1 - switches[idx]  # 중심 스위치 변경
        left, right = idx - 1, idx + 1
        while left >= 0 and right < n and switches[left] == switches[right]:
            switches[left] = 1 - switches[left]
            switches[right] = 1 - switches[right]
            left -= 1
            right += 1

for i in range(0, n, 20):
    print(" ".join(map(str, switches[i:i + 20])))