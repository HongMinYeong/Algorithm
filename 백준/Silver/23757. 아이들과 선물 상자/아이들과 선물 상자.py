import heapq as h

n, m = map(int, input().split())
box = list(map(int, input().split()))
child = list(map(int, input().split()))
boxH = []

# box를 최대 힙으로 구성
for b in box:
    h.heappush(boxH, -b)

# child를 순회하면서 처리
for c in child:
    if not boxH:  # boxH가 비어 있는 경우
        print(0)
        exit()
    b = -h.heappop(boxH)  # boxH에서 최댓값 가져오기
    if b >= c:
        h.heappush(boxH, -(b - c))  # 남은 크기 다시 힙에 삽입
    else:  # boxH의 최댓값이 child의 요구를 충족하지 못할 경우
        print(0)
        exit()

# 모든 child를 처리했다면 성공
print(1)
