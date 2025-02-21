import sys
from collections import deque
input = sys.stdin.readline

N,M = map(int,input().split())
pic = [list(map(int,input().split())) for _ in range(N)]
chk = [[False for _ in range(M)] for _ in range(N)]

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

def bfs(s, e):
    size = 1
    q = deque([(s, e)])
    pic[s][e] = 0  # 방문 체크
    
    while q:
        x, y = q.popleft()
        for i in range(4):
            nx, ny = x + dx[i], y + dy[i]
            if 0 <= nx < N and 0 <= ny < M and pic[nx][ny] == 1:
                pic[nx][ny] = 0  # 방문 체크
                q.append((nx, ny))
                size += 1
    return size

max_size = 0
count = 0

for i in range(N):
    for j in range(M):
        if pic[i][j] == 1:
            max_size = max(max_size, bfs(i, j))
            count += 1

print(count)
print(max_size)
