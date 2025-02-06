#리프노드 찾기 
def solution():
    #6
    #2 3 3 5 2 -1 
    # 3 
    ## 1 
    N = int(input())
    parent = list(map(int, input().split())) #1 -1 
    e_node = int(input())
    ans = 0
    arr1 = [i for i in range (len(parent))]
    q = []

    #루트 노드 찾기  
    for i in range(N):
        if parent[i] == -1:
            q.append(i) #루프노드 큐에 넣기 
            break 
     

    if e_node == q[0]:
        return ans #지우려는 노드가 루트 노드라면 0 리턴 

    while q:
        curr = q.pop(0)
        found = False

        for i in range(len(parent)):
            if parent[i] == curr:
                if arr1[i] == e_node:
                    continue
                else:
                    q.append(arr1[i])
                    found = True
        if not found : 
            ans += 1
        
    return ans 

print(solution())
            
        
    