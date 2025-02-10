T = int(input())
ans = []

cache = [[0]*31 for _ in range(31)]

cache[1][0] = 1
cache[1][1] = 1

for i in range(2,31):
    cache[i][0] = cache[i][i] = 1
    for j in range(1,i):
            cache[i][j] = cache[i-1][j] + cache[i-1][j-1]


for _ in range(T):
    N,M = map(int,input().split())
    ans.append(cache[M][N])
    # print(cache)

for i in range(T):
     print(ans[i])
    
