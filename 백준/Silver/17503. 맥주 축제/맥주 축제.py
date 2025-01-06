import sys
import heapq

# 입력 받기
N, M, K = map(int, sys.stdin.readline().split())

pq = []  # 알코올을 기준으로 최소 힙

# K개의 입력을 우선순위 큐에 추가
for _ in range(K):
    prefer, alcohol = map(int, sys.stdin.readline().split())
    heapq.heappush(pq, (alcohol, prefer))  # 알코올을 기준으로 최소 힙 사용

selected = []  # 선택된 아이템 (선호도를 기준으로 최소 힙)
selected_sum = 0  # 선택된 아이템의 선호도 합계

while pq:
    alcohol, prefer = heapq.heappop(pq)  # 알코올이 낮은 순으로 pop
    heapq.heappush(selected, prefer)  # 선호도를 최소 힙에 추가
    selected_sum += prefer

    # 선택된 아이템이 N개를 초과하면 제거
    if len(selected) > N:
        removed_prefer = heapq.heappop(selected)  # 최소 선호도 제거
        selected_sum -= removed_prefer

    # N개의 아이템을 선택했고, 선호도 합이 M 이상인 경우
    if len(selected) == N and selected_sum >= M:
        print(alcohol)  # 최대 알코올 출력
        exit()

# 목표치를 달성할 수 없는 경우
print(-1)
