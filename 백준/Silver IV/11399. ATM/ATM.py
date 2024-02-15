N = int(input())
P = list(map(int,input().split()))

P.sort()
time = 0
for i in range(1,N):
    P[i] += P[i-1]

for i in range(N):
    time += P[i]

print(time)