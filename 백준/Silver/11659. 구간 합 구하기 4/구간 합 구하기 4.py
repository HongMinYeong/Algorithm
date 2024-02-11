import sys

# 한 번에 여러 줄을 입력 받기
input_lines = sys.stdin.readline()
N, M = map(int, input_lines.split())
input_lines2 = sys.stdin.readline()
array = list(map(int, input_lines2.split()))

prefix_sum = [0] * (N + 1)
for i in range(1, N + 1): # 누적 합 구하기
    prefix_sum[i] = prefix_sum[i - 1] + array[i - 1]

for _ in range(M):
    input_lines3 = sys.stdin.readline()
    start, end = map(int, input_lines3.split())
    print(prefix_sum[end] - prefix_sum[start - 1])