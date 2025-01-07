import sys
from heapq import heappop, heappush
input = sys.stdin.readline

N = int(input())
arr = []

for i in range(N):
    _, s, e = map(int, input().split())
    arr.append((s, e)) #튜플로 저장 

h = []
arr.sort()

for (s, e) in arr:
    if h and h[0] <= s: #리스트에 값이 있고 시작 시간이 더 크면 
        heappop(h)
    heappush(h, e) #종료시간 push 
print(len(h))
