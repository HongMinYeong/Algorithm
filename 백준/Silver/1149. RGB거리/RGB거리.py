N = int(input())
arr = [list(map(int,input().split())) for _ in range(N)]

# cache = [[0]*4]*10
cache = [[0] * 3 for _ in range(1001)] 

cache[0][0] = arr[0][0]
cache[0][1] = arr[0][1]
cache[0][2] = arr[0][2]


for i in range(1,N):
    for j in range(3):
        # j가 1이면 2,3 // 2 이면 1,3 
        if j == 0: # 전에 수 R 골랐을 때 
            cache[i][0] = arr[i][0] + min(cache[i-1][1],cache[i-1][2])
        elif j == 1: # G 골랐을 때 
            cache[i][1] = arr[i][1] + min(cache[i-1][0],cache[i-1][2])
        else: # B 골랐을 때 
            cache[i][2] = arr[i][2] + min(cache[i-1][0],cache[i-1][1])

# print(cache)
print(min(cache[N-1]))