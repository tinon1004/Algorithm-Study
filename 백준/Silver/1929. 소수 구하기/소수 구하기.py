M, N = map(int, input().split())

# N까지의 소수를 판별하기 위한 배열
is_prime = [True] * (N + 1)
is_prime[0], is_prime[1] = False, False  # 0과 1은 소수가 아님

# 에라토스테네스의 체
for i in range(2, int(N ** 0.5) + 1):
    if is_prime[i]:
        for j in range(i * i, N + 1, i):
            is_prime[j] = False

# M 이상 N 이하의 소수 출력
for k in range(M, N + 1):
    if is_prime[k]:
        print(k)
