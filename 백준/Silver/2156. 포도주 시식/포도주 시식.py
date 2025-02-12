import sys

N = int(sys.stdin.readline().strip())
arr = [int(sys.stdin.readline().strip()) for _ in range(N)]

if N == 1:
    print(arr[0])
    
elif N == 2:
    print(arr[0] + arr[1])
    
else:
    ans = [0] * N
    ans[0] = arr[0]
    ans[1] = arr[0] + arr[1]
    ans[2] = max(arr[0] + arr[2], arr[1] + arr[2])
    
    if N > 3:
        ans[3] = max(ans[0] + arr[2] + arr[3], ans[1] + arr[3])
    
    for i in range(4, N):
        ans[i] = max(ans[i-4] + arr[i-1] + arr[i], ans[i-3] + arr[i-1] + arr[i], ans[i-2] + arr[i])
    
    print(max(ans))