import heapq
import sys
input = sys.stdin.readline

N,M = map(int, input().split())
orders = [[] for _ in range(200_001)]

for i in range(N):
    k, *items = map(int, input().split()) # k 는 주문 초밥 갯수,,,
    for item in items:
        heapq.heappush(orders[item], i) # 순서대로 받아야 하니까 PQ
menu = list(map(int, input().split())) #[3,2,1,4,5]
cnt = [0] * N

for sushi in menu:
    if orders[sushi]:
        cnt[heapq.heappop(orders[sushi])] += 1

print(*cnt, sep=' ')
                
