import sys
from collections import deque

input = sys.stdin.readline
M, N = map(int, input().split())

tomato = [list(map(int, input().split())) for _ in range(N)]
q = deque()

# 익은 토마토 위치 큐에 저장
for i in range(N):
    for j in range(M):
        if tomato[i][j] == 1:
            q.append((i, j))

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

def bfs():
    answer = 0

    while q:
        x, y = q.popleft()
        
        for i in range(4):
            nx, ny = x + dx[i], y + dy[i]

            if 0 <= nx < N and 0 <= ny < M and tomato[nx][ny] == 0:
                tomato[nx][ny] = tomato[x][y] + 1
                answer = max(answer, tomato[nx][ny] - 1)  # 최댓값 업데이트
                q.append((nx, ny))

    # 모든 BFS가 끝난 후 0이 남아있는지 확인
    for row in tomato:
        if 0 in row:
            return -1

    return answer

print(bfs())
