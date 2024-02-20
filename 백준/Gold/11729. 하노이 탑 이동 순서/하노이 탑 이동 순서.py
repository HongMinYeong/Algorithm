def hannoi(n,s,e):
    if n == 1:
        print(s,e)
        return

    hannoi(n-1,s,6-s-e)
    print(s,e)
    hannoi(n-1,6-s-e,e)




N = int(input()) #원판갯수 N, 옮긴횟수 k
print(2**N-1)
hannoi(N,1,3)