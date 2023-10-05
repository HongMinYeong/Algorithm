def solution(array):
    # 최빈값이 여러개면 -1 return
    # 최빈값 return
    a_dict = {}
    
    for cur in array:
        if cur in a_dict:
            a_dict[cur] += 1
        else:
            a_dict[cur] = 1

    max_count = 0  # 가장 많이 나타난 횟수
    answer = None  # 최빈값 초기값을 None으로 설정

    for key, value in a_dict.items():
        if value > max_count:
            max_count = value
            answer = int(key)  # key를 정수로 변환하여 저장
        elif value == max_count:
            # 최빈값이 여러 개인 경우
            answer = -1

    
    return answer

print(solution([1, 2, 3, 3, 3, 4]))
