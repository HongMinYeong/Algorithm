# 2
# 1
# 3 -> 6/10
# 2
# 3

T= int(input())
ans = []

for _ in range(T):
    n = int(input())
    k = int(input())
    cache = [[0]* 15]*15


    for i in range(n+1):
        for j in range(k+1):
            if i==0:
                cache[i][j] = j+1
            else:
                if j==0:
                    cache[i][j] = 1
                else:
                  cache[i][j] = cache[i-1][j-1] + cache[i][j]
    ans.append(cache[n][k-1])

for i in range(T):
    print(ans[i])

