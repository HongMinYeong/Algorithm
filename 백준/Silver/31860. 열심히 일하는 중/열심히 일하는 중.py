import heapq

N, M, K = map(int, input().split())
pq = []

for _ in range(N):
    heapq.heappush(pq, -int(input()))  # 최대힙으로 구성

to = 0
yes = 0
ans = []  # print 문 실행 횟수 카운터

while pq:
    work = -heapq.heappop(pq)
    to = yes // 2 + work
    ans.append(to)
    yes = to
    if work - M > K:
        heapq.heappush(pq, -(work - M))
    if not pq:
        break

# 리스트 길이 출력
print(len(ans))

# 리스트 값 순서대로 출력
for value in ans:
    print(value)
