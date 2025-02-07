N = int(input())
arr = [tuple(map(int,input().split())) for _ in range(N)]
# [(55, 185), (58, 183), (88, 186), (60, 175), (46, 155)]

ans = [1 for _ in range(N)]
idx = 1

for i in range(1,N): #1 ~ 4 
    for j in range(i+1): # 0 ~ i 
        if arr[i][0] > arr[j][0]:
            if arr[i][1] > arr[j][1]:
                ans[j] += 1
        elif arr[i][0] < arr[j][0]:
            if arr[i][1] < arr[j][1]:
                ans[i] += 1
        else:
            continue



print(*ans)
