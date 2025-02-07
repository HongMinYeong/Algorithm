N = int(input())

MOD = 10007

cache = [0 for _ in range(1001)]

cache[1] = 1
cache[2] = 2

for i in range(3,N+1):
    cache[i] = cache[i-1] + cache[i-2]
    cache[i] %= MOD
    
print(cache[N])