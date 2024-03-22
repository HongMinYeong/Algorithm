from collections import deque

n = int(input())
graph = [[] for _ in range(n)]
answer=[]


for i in range(n):
    k = list(map(int,input()))
    graph[i] = k

d = [(0,1),(0,-1),(1,0),(-1,0)]

def bfs(x,y,graph):
    queue = deque()
    queue.append((x,y))
    count = 1
    graph[x][y]=0
    while(queue):
        x,y = queue.popleft()
        # print('x는',x,'y는',y)
        for dx,dy in d:
            X,Y = x+dx,y+dy
            if (0<= X < n) and (0 <= Y < n) and graph[X][Y]==1:
                queue.append((X,Y))
                graph[X][Y] = 0 
                count += 1
    return count


for i in range(n):
    for j in range(n):
        if graph[i][j]==1:
            answer.append(bfs(i,j,graph))
            
answer.sort()
print(len(answer))
for i in range(len(answer)):
    print(answer[i])


