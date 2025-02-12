import sys

N = int(sys.stdin.readline())
arr = list(map(int, sys.stdin.readline().split()))

max_sum = arr[0]  # 최대 부분합
current_sum = arr[0]  # 현재 부분합

for i in range(1, N):
    current_sum = max(arr[i], current_sum + arr[i])  
    max_sum = max(max_sum, current_sum)  

print(max_sum)