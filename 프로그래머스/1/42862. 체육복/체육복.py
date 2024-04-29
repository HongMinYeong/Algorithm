def solution(n, lost, reserve):
    	# 5, [2, 4], [1, 3, 5]
    set_reserve=set(reserve)-set(lost)
    set_lost=set(lost)-set(reserve)
    for i in set_reserve: #여벌 있는 애 중에서 
        if i-1 in set_lost: # 여벌 있는애 전애가 없다면 
            set_lost.remove(i-1) #전애를 lost에서 없애기 
        elif i+1 in set_lost:#여벌 있는애 뒤에 애가 없다면
            set_lost.remove(i+1) #뒤에 애 lost에서 없애기 
    answer = n-len(set_lost)
    return answer