import sys
from collections import deque
input = sys.stdin.readline

N = int(input())
ans = [0 for _ in range(N+1)]
lst = [[] for _ in range(N+1)]


for _ in range(N-1):
    n,k = map(int,input().split())
    lst[n].append(k)
    lst[k].append(n)

q = deque()
q.append(1)

while q:
    curr = q.popleft()
    for v in lst[curr]:
        if ans[v] == 0:
            ans[v] = curr
            q.append(v)

print('\n'.join(map(str, ans[2:])))



