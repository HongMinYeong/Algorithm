from collections import deque

n,m,v = map(int,input().split()) # 정점의 갯수/ 간선의 갯수 / 시작 정점  
graph = [[] for _ in range(n+1)]
dfs_visited = [0]*(n+1)
bfs_visited = [0]*(n+1)
dfs_answer = []
bfs_answer = []

for _ in range(m):
    x,y = map(int,input().split())
    graph[x].append(y)
    graph[y].append(x)

for i in range(n+1):
    graph[i].sort() #가장 작은점부터 하려고 정렬 

def dfs(graph,visited,v):
    visited[v]=1 #방문처리 
    dfs_answer.append(v)
    for i in graph[v]:
        if visited[i]==0:
            dfs(graph,visited,i)

def bfs(graph,visited,v):
    queue = deque([v])
    # print('queue는',queue)
    visited[v]=1
    while queue:
        v = queue.popleft()
        # print('v는 ->',v)
        bfs_answer.append(v)
        for i in graph[v]:
            if not visited[i]:
                queue.append(i)
                visited[i] = 1
    

dfs(graph,dfs_visited,v)
bfs(graph,bfs_visited,v)

print(*dfs_answer)
print(*bfs_answer)