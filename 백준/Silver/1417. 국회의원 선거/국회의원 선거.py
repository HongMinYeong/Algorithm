import heapq

N = int(input())
dasom = int(input())
pq = []
answer = 0

# 후보자의 득표 수를 최대 힙으로 삽입 (음수로 변환)
for _ in range(N-1):
    heapq.heappush(pq, -int(input()))

while pq and -pq[0] >= dasom:  # 가장 많은 득표 수가 다솜보다 큰 경우 반복
    # 최대 힙에서 가장 큰 값을 가져옴
    max_votes = -heapq.heappop(pq)
    # 5  7 8 
    #-8 -7
    # 다솜의 득표 증가 및 최대 득표 감소
    dasom += 1
    max_votes -= 1
    
    # 감소된 값을 다시 힙에 삽입
    heapq.heappush(pq, -max_votes)
    
    # 필요한 작업 수 증가
    answer += 1

print(answer)
