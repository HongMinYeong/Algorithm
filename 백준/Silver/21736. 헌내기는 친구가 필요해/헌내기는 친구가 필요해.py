import sys
from collections import deque

input = sys.stdin.readline

N,M = map(int,input().split())
uni = [list(map(str,input().strip())) for _ in range(N)]

dx = [-1,1,0,0]
dy = [0,0,-1,1]



def bfs(x,y):
    q = deque()
    q.append((x,y,0))
    uni[x][y] = 'X'
    answer = 0
    while q:
        curr_x,curr_y,curr_p = q.popleft()
        # print(curr_x,curr_y,curr_p)

        for i in range(4):
            nx = curr_x + dx[i]
            ny = curr_y + dy[i]
            if 0 <= nx < N and 0 <= ny < M and uni[nx][ny]!='X':
                if uni[nx][ny] == 'P':
                    q.append((nx,ny,curr_p+1))
                    uni[nx][ny] = 'X'
                    answer += 1
                else:
                    q.append((nx,ny,curr_p))
                    uni[nx][ny] = 'X'
    return answer





# 도연이 위치
for i in range(N):
    for j in range(M):
        if uni[i][j] == 'I':
            answer = bfs(i,j)
            if answer == 0:
                print("TT")
            else:
                print(answer)
            exit()