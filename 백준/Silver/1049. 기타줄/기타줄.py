import sys

N, M = map(int, sys.stdin.readline().split())

# 패키지와 낱개 가격 초기화 (최대값으로 설정)
min_package_price = float('inf')
min_single_price = float('inf')

for _ in range(M):
    package_price, single_price = map(int, sys.stdin.readline().split())
    min_package_price = min(min_package_price, package_price)
    min_single_price = min(min_single_price, single_price)

# 최소 비용 계산
cost1 = ((N // 6) + 1) * min_package_price  # 패키지만 구매
cost2 = (N // 6) * min_package_price + (N % 6) * min_single_price  # 패키지 + 낱개 조합
cost3 = N * min_single_price  # 낱개만 구매

print(min(cost1, cost2, cost3))
