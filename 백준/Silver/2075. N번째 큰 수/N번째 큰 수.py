import heapq

N = int(input())
pq = []

for _ in range(N):
    row = list(map(int, input().split()))
    for num in row:
        if len(pq) < N:
            heapq.heappush(pq, num)
        else:
            if num > pq[0]:
                heapq.heappushpop(pq, num)

print(pq[0])
