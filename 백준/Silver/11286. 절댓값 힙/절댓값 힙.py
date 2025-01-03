import heapq as hq
import sys

input = sys.stdin.readline
pq=[]
for _ in range(int(input())):
    x = int(input())

    if x: #x 가 0이 아닌 경우 
        hq.heappush(pq,(abs(x),x))
    else:
        print(hq.heappop(pq)[1] if pq else 0)
       