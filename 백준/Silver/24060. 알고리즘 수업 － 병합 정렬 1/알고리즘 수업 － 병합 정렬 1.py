# 알고리즘 수업 - 병합정렬 1
def merge_sort(a,s,l):
    if s < l :
        q = ( s + l ) // 2
        merge_sort(a,s,q)
        merge_sort(a,q+1,l)
        merge(a,s,q,l)
    # else:
    #     return a
def merge(A,S,Q,L):
    global cnt,res
    i = S
    j = Q + 1
    temp = []

    while i <= Q and j <= L:
        if A[i] <= A[j]:
            temp.append(A[i])
            i+=1
        else:
            temp.append(A[j])
            j += 1

    while i <= Q: #왼쪽 배열 부분이 남은 경우
        temp.append(A[i])
        i+=1
    while j <= L: #오른쪽 배열 부분이 남은 경우
        temp.append(A[j])
        j+=1

    i=S
    t=0

    while i <= L: #결과값 저장
        A[i] = temp[t]
        cnt += 1
        if cnt==K:
            res = A[i] #찾으면 
            break
        i+=1
        t+=1


A,K = map(int,input().split())
array = list(map(int,input().split()))
cnt = 0
res = -1
merge_sort(array,0,A-1)
print(res)