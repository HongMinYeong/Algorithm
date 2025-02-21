import sys
from collections import deque

input = sys.stdin.readline

N,K = map(int,input().split())

q = deque()
q.append((N,0))
chk = [False for _ in range(100001)]

# print(chk)

while q:
    # print(q)
    curr,sec = q.popleft()
    if curr == K:
        print(sec)
        break
    if 0< curr*2 <= 100000 and not chk[curr*2]:
        if curr*2 == K:
            print(sec)
            break
        q.append((curr*2,sec))
        chk[curr*2] = True
    if 0<= curr-1 <= 100000 and not chk[curr-1]:
        if curr-1 == K:
            print(sec+1)
            break
        q.append((curr-1,sec+1))
        chk[curr-1] = True

    if 0< curr+1 <= 100000 and not chk[curr+1]:
        if curr+1 == K:
            print(sec+1)
            break
        q.append((curr+1,sec+1))
        chk[curr+1] = True
    

