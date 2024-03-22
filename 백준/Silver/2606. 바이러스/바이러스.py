from collections import deque

n = int(input())
m = int(input())
graph = [[] for _ in range(n+1)]
visited = [0]*(n+1)


for _ in range(m):
    x,y = map(int,input().split())
    graph[x].append(y)
    graph[y].append(x)


# print('graph는',graph)
def bfs():
    visited[1]=1
    queue = deque([1])
    while queue:
        v = queue.popleft()
        # print(v)
        for i in graph[v]:
            # print(visited)
            if not visited[i]:
                queue.append(i)
                visited[i] = 1

bfs()
count = 0
for num in visited:
    if num == 1:
        count+=1
    
print(count-1)

