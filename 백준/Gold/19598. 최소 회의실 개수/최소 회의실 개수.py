import heapq as h
import sys
input = sys.stdin.readline

N = int(input())
tasks = []

for _ in range(N):
    s, e = map(int, input().split())
    tasks.append((s, e))

# 시작 시간을 기준으로 정렬
tasks.sort()

# 작업 처리
ans = []
while tasks:
    s, e = h.heappop(tasks)
    if ans and s >= ans[0]:
        popi = h.heappop(ans)
    h.heappush(ans, e)

print(len(ans))
