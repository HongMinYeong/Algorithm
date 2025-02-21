import sys
from collections import deque
input = sys.stdin.readline

N,M = map(int,input().split())
pic = [list(map(int,input().split())) for _ in range(N)]
chk = [[False for _ in range(M)] for _ in range(N)]

dx = [-1,1,0,0]
dy = [0,0,-1,1]


def is_valid_coord(x,y):
    return 0<= x < N and 0<= y < M


def bfs(s,e):
    size = 1
    q = deque()
    q.append((s,e))
    chk[s][e] = True
    while q:
        x , y = q.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if is_valid_coord(nx,ny) and not chk[nx][ny] and pic[nx][ny] == 1:
                chk[nx][ny] = True
                q.append((nx,ny))
                pic[nx][ny] = 0
                size += 1
    return size

size_answer = 0
answer = 0
for i in range(N):
    for j in range(M):
        if not chk[i][j] and pic[i][j] == 1:
            size_answer = max(size_answer,bfs(i,j))
            answer+=1

print(answer)
print(size_answer)



