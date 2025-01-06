import heapq

pq = []  # 최대 힙을 구현하기 위해 음수값을 저장
n = int(input())  # 입력받을 행의 수

for _ in range(n):
    row = list(map(int, input().split()))  # 입력된 한 줄을 리스트로 변환
    if row[0] == 0:  # 0이 입력되었을 경우
        if pq:  # 힙이 비어있지 않으면
            print(-heapq.heappop(pq))  # 최대값을 출력 (음수로 저장했으므로 부호 변경)
        else:  # 힙이 비어있으면
            print(-1)
    else:
        for value in row[1:]:  # 첫 번째 값 이후는 선물의 가치
            heapq.heappush(pq, -value)  # 최대 힙 구현을 위해 음수로 저장