def solution(sizes):
    answer = 0
    w=sizes[0][0]
    h=sizes[0][1]
    for i in range(1,len(sizes)):
        if w <= sizes[i][0]:
            w=sizes[i][0]
            if h <= sizes[i][1]:
                h=sizes[i][1]
        else:
            if h <=sizes[i][1]:
                h=sizes[i][1]
    if w>h:
        h=0
        for i in range(len(sizes)):
            if sizes[i][0] <sizes[i][1]:
                temp=sizes[i][0]
                sizes[i][0]=sizes[i][1]
                sizes[i][1]=temp
            if h<sizes[i][1]:
                h=sizes[i][1]
    else:
        w=0
        for i in range(len(sizes)):
            if sizes[i][0] >sizes[i][1]:
                temp=sizes[i][0]
                sizes[i][0]=sizes[i][1]
                sizes[i][1]=temp
            if w<sizes[i][0]:
                w=sizes[i][0]
    answer = w*h      
        
    return answer