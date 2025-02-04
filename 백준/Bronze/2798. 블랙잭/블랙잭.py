from itertools import combinations

N, M = map(int, input().split())
lst = list(map(int, input().split()))
answer = 0
min_diff = float('inf')  

for combi in combinations(lst, 3):
    total = sum(combi)
    
    if total <= M and M - total < min_diff:  # M보다 작거나 같고, 차이가 최소인 경우
        min_diff = M - total
        answer = total

print(answer)
