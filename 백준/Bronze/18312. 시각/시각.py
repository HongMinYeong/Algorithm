N,K = map(int,input().split())

count = 0

for i in range(N+1):
    if i < 10:
        M = '0'+str(i)
    else:
        M = str(i)
    for j in range(60):
        if j < 10:
            N = '0' + str(j)
        else:
            N = str(j)
        for k in range(60):
            if k <10:
                P = '0' + str(k)
            else:
                P = str(k)
            if str(K) in str(M) + str(N) + str(P):
                count += 1
                
print(count)
