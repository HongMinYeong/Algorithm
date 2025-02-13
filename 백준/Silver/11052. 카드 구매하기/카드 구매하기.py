import sys

N = int(sys.stdin.readline())
arr = list(map(int, sys.stdin.readline().split()))

dp = [0] * (N+1)

for i in range(1, N+1):  
    for j in range(1, i+1):  
        dp[i] = max(dp[i], dp[i-j] + arr[j-1])  

print(max(dp))
