N,L = map(int,input().split())

arr = list(map(int,input().split()))
arr.sort()

ans = 0
curr = 0 
for i  in range(N):
    if curr < arr[i] + 0.5:
        curr = arr[i]-0.5 + L
        ans += 1

print(ans)