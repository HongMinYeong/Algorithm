def solution(answers):
    answer = []
    one = [1,2,3,4,5]
    o_score = 0
    t_score = 0
    th_score = 0
    two = [2,1,2,3,2,4,2,5]
    three = [3,3,1,1,2,2,4,4,5,5]
    for i in range(len(answers)):
        if one[i % len(one)] == answers[i]:
            o_score +=1
        if two[i % len(two)] == answers[i]:
            t_score +=1
        if three[i % len(three)] == answers[i]:
            th_score +=1
    if max(o_score,t_score,th_score) == o_score:
        answer.append(1)
    if max(o_score,t_score,th_score) == t_score:
        answer.append(2)
    if max(o_score,t_score,th_score) == th_score:
        answer.append(3)
        
        
    return answer