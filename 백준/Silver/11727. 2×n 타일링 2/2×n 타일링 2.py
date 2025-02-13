import sys

N = int(sys.stdin.readline())

cache = [0 for _ in range(1001)]

cache[1] = 1
cache[2] = 3

for i in range(3,N+1):
    cache[i] = (cache[i-1] + cache[i-2] * 2)%10007

print(cache[N])