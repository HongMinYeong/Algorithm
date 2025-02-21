import sys
from collections import deque


input = sys.stdin.readline

M, N = map(int,input().split())

tomato = [list(map(int,input().split())) for _ in range(N)]


                    

dx = [-1,1,0,0]
dy = [0,0,-1,1]

def bfs():
    global q
    chk = [[False for _ in range(M)] for _ in range(N)]
    answer = 0
    while q:
        x,y = q.popleft()
        # print(x,y)
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if 0 <= nx < N and 0 <= ny < M and tomato[nx][ny] != -1 and not chk[nx][ny]:
                chk[nx][ny] = True
                if tomato[nx][ny] == 0 and tomato[x][y] > 0:
                    tomato[nx][ny] = tomato[x][y] + 1
                    answer = max(answer,tomato[x][y])
                    q.append((nx,ny))
                
                    
    # print(tomato)
    if sum(row.count(0) for row in tomato)>0:
        return -1
    else:
        return answer
    
        
               
        
# 익은 토마토 위치 찾기 
to = []
q = deque()
for i in range(N):
    for j in range(M):
        if tomato[i][j] == 1:
            q.append((i,j))

print(bfs())

            

