import sys
import itertools
from collections import deque

input = sys.stdin.readline

N, M = map(int, input().split())
road = [list(map(int, input().split())) for _ in range(N)]

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

# 바이러스 위치와 빈 칸 위치 저장
virus_positions = []
empty_spaces = []

for i in range(N):
    for j in range(M):
        if road[i][j] == 2:
            virus_positions.append((i, j))
        elif road[i][j] == 0:
            empty_spaces.append((i, j))

def bfs():
    q = deque(virus_positions)  # 초기 바이러스 위치에서 BFS 시작
    graph = [row[:] for row in road]  # deepcopy 대신 리스트 슬라이싱 사용

    while q:
        x, y = q.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if 0 <= nx < N and 0 <= ny < M and graph[nx][ny] == 0:
                graph[nx][ny] = 2
                q.append((nx, ny))

    return sum(row.count(0) for row in graph)

answer = 0

# 벽
for walls in itertools.combinations(empty_spaces, 3):
    for x, y in walls:
        road[x][y] = 1  # 벽 세우기
    
    answer = max(answer, bfs())  # BFS 실행 후 최대값 갱신

    for x, y in walls:
        road[x][y] = 0  # 원래 상태로 복구

print(answer)