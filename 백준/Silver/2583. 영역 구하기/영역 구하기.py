import sys
sys.setrecursionlimit(10000)

m,n,k = map(int,input().split())
field = [[0 for _ in range(n)] for _ in range(m)] 


for _ in range(k): # 차지하는 직사각형 범위를 1로 할당 
    X1, Y1, X2, Y2 = map(int,input().split())
    for Y in range(Y1, Y2):
        for X in range(X1, X2):
            field[Y][X] = 1


def dfs(x, y, count):
    field[y][x] = 1 # 방문 처리 
    for dx, dy in d: #상 하 좌우 돌기 
        X, Y = x + dx, y + dy 
        if (0 <= X < n) and (0 <= Y < m) and field[Y][X] == 0:
            count = dfs(X, Y, count+1) #리스트 영역 넘지않고 0이 값으로 할당된 경우 
    
    return count

area = []
d = [(0, 1), (0, -1), (1, 0), (-1, 0)] #방향

for Y in range(m):
    for X in range(n):
        if field[Y][X] == 0: #N*M 직사각형을 돌면서, 분리된 영억 (리스트에서 0이 할당된 값)을 찾고, DFS 함수 호출 
            area.append(dfs(X, Y, count=1)) # 0 이 할당된 시작점부터 크기에 반영, 1 넘기고 시작 

print(len(area))
print(*sorted(area))