import sys
from collections import deque

N,M = map(int,sys.stdin.readline().split())

arr = [[] for _ in range(N+1)]

for _ in range(M):
    E,V = map(int,sys.stdin.readline().split())
    arr[E].append(V)
    arr[V].append(E)


arr[0] = 0

q = deque()
ans = [False for _ in range(N)]
wer = 0


for i in range(1,N+1):
    if arr[i] != 0 and len(arr[i]) > 0:
        wer += 1
        ans[i-1] = True
        q.extend(arr[i])
        while q:
            nxt = q.popleft()
            if ans[nxt-1]:
                continue
            if len(arr[nxt]) > 0 :
                q.extend(arr[nxt])
                arr[nxt] = 0
            ans[nxt-1] = True
                

un_check = 0

for check in ans:
    if check != True:
        un_check += 1

print(wer + un_check)

