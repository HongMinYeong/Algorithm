import sys

N = int(sys.stdin.readline())

cache = [0 for _ in range(91)]
cache[1] = 1
cache[2] = 1

for i in range(3,N+1):
    cache[i] = cache[i-1]+cache[i-2]

print(cache[N])