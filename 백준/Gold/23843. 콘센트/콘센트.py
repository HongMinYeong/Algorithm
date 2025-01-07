import heapq
import sys

input = sys.stdin.readline


N, M = map(int, input().split())
charge_times = list(map(int, input().split()))

# 우선순위 큐 초기화 (M개의 콘센트 모두 0으로 초기화)
pq = [0] * M
heapq.heapify(pq)

charge_times.sort(reverse=True)

# 스케줄링
for time in charge_times:
    # 가장 빨리 비는 콘센트에서 작업을 시작
    min_time = heapq.heappop(pq)
    heapq.heappush(pq, min_time + time)

# 가장 마지막으로 끝나는 시간을 출력
print(max(pq))
