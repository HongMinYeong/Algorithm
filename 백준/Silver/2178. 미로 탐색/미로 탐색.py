from collections import deque
n,m =map(int,input().split())
graph = [[] for _ in range(n)]

for i in range(n):
    k = list(map(int,input()))
    for j in range(m):
        graph[i].append(k[j])


d = [(0,1),(0,-1),(1,0),(-1,0)]

def bfs(x,y,graph):
    queue = deque([(x,y)])
    while queue:
        x,y = queue.popleft()
        for dx,dy in d:
            X, Y = x+dx,y+dy
            if (0 <= X < n) and (0 <= Y <m) and graph[X][Y]==1:
                queue.append((X,Y))
                graph[X][Y]= graph[x][y] + 1

bfs(0,0,graph)

# 4 6 이면 [3][5]까지 가면됨
print(graph[n-1][m-1])
