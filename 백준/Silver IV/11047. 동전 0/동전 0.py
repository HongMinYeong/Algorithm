N,K = map(int,input().split())
wallet = []
answer = 0
# N개의 줄에 동전의 가치가 오름차순으로 주어짐
for i in range(N):
    wallet.append(int(input()))

wallet.sort(reverse=True) #큰 수부터
for i in range(len(wallet)):
    answer+= K//wallet[i]
    K %= wallet[i]
    if K == 0:
        break

print(answer)