import sys


N,K = map(int,sys.stdin.readline().split())

dp = [[0]*(K+1) for _ in range(N+1)]
arr = []

arr.append([0,0])

for i in range(N):
    W,V = map(int,sys.stdin.readline().split())
    arr.append([W,V])


for i in range(1,N+1):
    for j in range(1,K+1):
        w = arr[i][0]
        v = arr[i][1]
        if j < w:
            dp[i][j] = dp[i-1][j]
        else:
            dp[i][j] = max(dp[i-1][j],dp[i-1][j-w]+v)

print(dp[N][K])


