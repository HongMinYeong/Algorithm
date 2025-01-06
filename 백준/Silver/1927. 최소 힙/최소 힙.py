import heapq 
import sys

N = int(sys.stdin.readline())

pq = []

for _ in range(N):
    num = int(sys.stdin.readline())

    if num == 0:
        if len(pq) > 0:
            print(heapq.heappop(pq))
        else:
            print(0)
    else:
        heapq.heappush(pq,num)