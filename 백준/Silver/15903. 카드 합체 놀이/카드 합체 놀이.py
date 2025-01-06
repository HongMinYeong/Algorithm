import sys
import heapq

N, M = map(int, sys.stdin.readline().strip().split())
row = list(map(int, sys.stdin.readline().strip().split()))

pq = []

for num in row:
    heapq.heappush(pq, num)

# M번 합치는 작업 수행
for _ in range(M):
    # 가장 작은 두 값을 가져오기
    x = heapq.heappop(pq)
    y = heapq.heappop(pq)
    sum_val = x + y
    
    # 합친 값을 두 번 힙에 삽입
    heapq.heappush(pq, sum_val)
    heapq.heappush(pq, sum_val)

# 힙에 남아있는 모든 값을 합산
answer = sum(pq)

print(answer)
