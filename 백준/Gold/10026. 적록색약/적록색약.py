import sys

input = sys.stdin.readline
sys.setrecursionlimit(1000000)

N = int(input())
road = [list(input().strip()) for _ in range(N)]

normal_cnt = 0
abnormal_cnt = 0

def is_valid_coord(n,e):
    return 0 <= n <= N-1 and 0<= e <= N-1

chk = [[False] * N for _ in range(N)]

dx = [-1,1,0,0]
dy = [0,0,-1,1]


def dfs(x,y):
    chk[x][y] = True
    current_color = road[x][y]

    for k in range(4):
        nx = x + dx[k]
        ny = y + dy[k]
        if is_valid_coord(nx,ny) and not chk[nx][ny] and road[nx][ny] == current_color:
            dfs(nx,ny)
    

for i in range(N):
    for j in range(N):
        if chk[i][j]==False:
            dfs(i,j)
            normal_cnt += 1

#abnormal
for i in range(N):
    for j in range(N):
        if road[i][j]=='R':
            road[i][j]='G'

chk = [[False] * N for _ in range(N)]

for i in range(N):
    for j in range(N):
        if chk[i][j] == False:
            dfs(i,j)
            abnormal_cnt += 1

print(normal_cnt,abnormal_cnt)
