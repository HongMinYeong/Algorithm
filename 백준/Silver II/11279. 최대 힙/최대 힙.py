import sys
import heapq

N = int(input())
heap = []
for i in range(N):
    x = int(sys.stdin.readline())
    if x: # x가 자연수라면
        heapq.heappush(heap,-x)
        # print('heapq는 -> ',heap)
    else:
        if len(heap) >= 1:
            # print(heap)
            print(-heapq.heappop(heap)) #두번째 요소가 양수
        else:
            print(0)