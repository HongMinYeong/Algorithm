N = int(input())

arr = [int(input()) for _ in range(N)]

arr.sort()

ans = 0
for i in range(N-1):
    ans = max(ans,arr[i]*(N-i))


if ans > arr[N-1]:
    print(ans)
else:
    print(arr[N-1])
