N = int(input())
arr = [list(map(int,input().split())) for _ in range(N)]

curr = [0 for i in range(N+1)]


for i in range(N):
    for j in range(i + arr[i][0], N+1):
        if curr[j] <curr[i] + arr[i][1]:
            curr[j] = curr[i] + arr[i][1]
            

print(curr[-1])
