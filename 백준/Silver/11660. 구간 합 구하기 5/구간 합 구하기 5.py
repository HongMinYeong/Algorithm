import sys

N, M = map(int, sys.stdin.readline().split())
arr = [list(map(int, sys.stdin.readline().split())) for _ in range(N)]

S = [[0] * (N + 1) for _ in range(N + 1)]

# 누적 합 배열 계산
for i in range(1, N + 1):
    for j in range(1, N + 1):
        S[i][j] = arr[i-1][j-1] + S[i-1][j] + S[i][j-1] - S[i-1][j-1]

for _ in range(M):
    x1, y1, x2, y2 = map(int, sys.stdin.readline().split())
    result = S[x2][y2] - S[x1-1][y2] - S[x2][y1-1] + S[x1-1][y1-1]
    print(result)
