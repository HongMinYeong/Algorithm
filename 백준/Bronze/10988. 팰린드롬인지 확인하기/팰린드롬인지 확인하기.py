N = list(map(str,input()))
ans = True

for i in range(len(N)//2):
    if N[i] != N[-(i+1)]:
        ans = False
print(1 if ans else 0)

