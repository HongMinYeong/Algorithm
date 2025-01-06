import heapq as h

def solution(scoville, K):
    answer = 0
    pq = []
    for n in scoville:
        h.heappush(pq,n)
    for _ in range(len(scoville)-1):
        one = h.heappop(pq)
        if one >= K:
            break
        two = h.heappop(pq)
        h.heappush(pq,one+(two*2))
        answer +=1
    
    if h.heappop(pq) < K :
        answer = -1
        
    return answer

#최소 횟수 리턴 
[3,5,9,10,12]
[9,10,12,13,13]