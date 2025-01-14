a, b, c, d, e, f = map(int, input().split())

for i in range(-999,1000):
    for j in range(-999,1000):
        if i*a+b*j== c and d*i + e*j == f:
            print(i,j)
            break