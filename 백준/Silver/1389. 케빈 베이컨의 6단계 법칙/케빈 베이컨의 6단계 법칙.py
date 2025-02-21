import sys
from collections import deque

input = sys.stdin.readline
N,M = map(int,input().split())

#무방향 bfs 
friend = [[] for _ in range(N+1)]

for _ in range(M):
    k,e = map(int,input().split())
    friend[k].append(e)
    friend[e].append(k)


def bfs(s):
    # print(s, "시작")
    answer = 0
    bacon = [0 for _ in range(N+1)]
    bacon[s] = 1
    q = deque()
    q.append((friend[s],1))
    while q:
        curr = q.popleft()
        start = curr[0]
        number = curr[1]
        for k in start:
            if bacon[k]==0:
                # print("k는",k,"number는",number)
                bacon[k] = number
                answer+=number
                q.append((friend[k],number+1))
    
    # print(s,"일때",answer,bacon)
    return answer
                
ans = bfs(1)
who = 1

for i in range(1,N+1):
    if ans > bfs(i):
        who = i
        ans = bfs(i)
    
print(who)
    