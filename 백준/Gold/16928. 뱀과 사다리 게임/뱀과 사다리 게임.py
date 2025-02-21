# q에다가 현재위치, 굴린횟수 
import sys
from collections import deque

input = sys.stdin.readline
N,M = map(int,input().split())

road = [0 for _ in range(101)]

for _ in range(N):
    s,e = map(int,input().split())
    road[s] = e

snake = [0 for _ in range(101)]
for _ in range(M):
    s,e = map(int,input().split())
    snake[s] = e 

q = deque()
q.append((1,0))
chk = [False for _ in range(101)]

isEnd = False

while q:
    if isEnd:
        break
    curr,number = q.popleft()
    if road[curr] != 0:
        curr = road[curr]
    if snake[curr] != 0:
        curr = snake[curr]
    for i in range(1,7):
        if not chk[curr+i]:
            if curr+i == 100:
                print(number+1)
                isEnd = True
                break
            q.append((curr+i,number+1))
            chk[curr+i] = True


