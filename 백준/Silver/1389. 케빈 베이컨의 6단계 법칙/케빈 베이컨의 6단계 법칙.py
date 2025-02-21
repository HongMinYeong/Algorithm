import sys
from collections import deque

input = sys.stdin.readline
N, M = map(int, input().split())

# 무방향 그래프
friend = [[] for _ in range(N+1)]

for _ in range(M):
    k, e = map(int, input().split())
    friend[k].append(e)
    friend[e].append(k)

def bfs(start):
    bacon = [-1] * (N+1)  # 방문하지 않은 경우 -1
    bacon[start] = 0
    q = deque([start])
    total_bacon = 0

    while q:
        node = q.popleft()
        for next_node in friend[node]:
            if bacon[next_node] == -1:  # 아직 방문하지 않은 경우
                bacon[next_node] = bacon[node] + 1
                total_bacon += bacon[next_node]
                q.append(next_node)

    return total_bacon

# 최소 케빈 베이컨 수를 찾기 위한 초기값 설정
min_bacon = float('inf')
who = 0

for i in range(1, N+1):
    bacon_value = bfs(i)
    if bacon_value < min_bacon:
        min_bacon = bacon_value
        who = i

print(who)
