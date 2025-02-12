import sys

input = sys.stdin.readline

N, M = map(int, input().split())

arr1 = []  # 패키지 가격 리스트
arr2 = []  # 낱개 가격 리스트

for _ in range(M):
    p, s = map(int, input().split())
    arr1.append(p)  # 패키지 가격 저장
    arr2.append(s)  # 낱개 가격 저장

# 최소 패키지 가격과 최소 낱개 가격을 찾음
min_package = min(arr1)
min_single = min(arr2)

# 1. 패키지만 사용했을 때
cost1 = ((N // 6) + 1) * min_package

# 2. 낱개만 사용했을 때
cost2 = N * min_single

# 3. 패키지 + 낱개 혼합했을 때
cost3 = (N // 6) * min_package + (N % 6) * min_single

# 최소 비용 출력
print(min(cost1, cost2, cost3))
