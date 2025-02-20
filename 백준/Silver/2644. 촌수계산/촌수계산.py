import sys
from collections import deque

input = sys.stdin.readline

N = int(input())
S,E = map(int,input().split())
K = int(input())
vertices = [[] for _ in range(N+1)]

for _ in range(K):
    n,e = map(int,input().split())
    vertices[n].append(e)
    vertices[e].append(n)

q = deque()
ans = 0
q.append((S,ans))
chk = [False for _ in range(N+1)]
chk[S] = True
isEnd = False

while q:
    if isEnd:
        break
    now = q.popleft()
    curr = now[0]
    index = now[1]+1
    for k in vertices[curr]:
        if not chk[k]:
            if k == E:
                isEnd = True
                answer = index
                break
            q.append((k,index))
            chk[k] = True

if isEnd:
    print(answer)
else:
    print(-1)
    
