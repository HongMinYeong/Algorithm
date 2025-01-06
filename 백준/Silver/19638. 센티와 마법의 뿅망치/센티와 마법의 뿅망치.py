import heapq as h

N, H, T = map(int, input().split())
pq = []
ans = 0

for _ in range(N):
    h.heappush(pq, -int(input()))

for _ in range(T):
    if not pq:  # 힙이 비어있는지 확인
        break
    king = -h.heappop(pq)  # 제일 큰 거인의 키 
    if king < H:
        h.heappush(pq, -king)  # 다시 힙에 넣고 종료
        break
    if king == 1:  # 더 이상 줄일 수 없는 경우
        h.heappush(pq, -king)
        continue
    else:
        ans += 1
        king //= 2
        h.heappush(pq, -king)

if not pq or -pq[0] < H:
    print("YES")
    print(ans)
else:
    print("NO")
    print(-pq[0])
