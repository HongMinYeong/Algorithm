from itertools import combinations

while True:
    s = list(map(int, input().split()))
    if len(s) == 1 and s == [0]: #입력 0 받으면 그만
        break
    k = s.pop(0) #맨앞 숫자 제거
    for data in list(combinations(s, 6)):
        print(*data)
    print()