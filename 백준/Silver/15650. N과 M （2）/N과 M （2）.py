def dfs(s):
    if len(answer) == M:
        # sorted_answer = sorted(answer)
        print(' '.join(map(str, answer)))
        return

    for i in range(s,N+1):
        if visited[i]:
            break
        answer.append(i)
        # print(answer)
        visited[i]=True #방문 처리
        dfs(i+1)
        answer.pop()
        visited[i]=False




N, M = list(map(int, input().split()))
# 1 부터 N 까지 자연수 중 중복 없이 M 개 수열
# 수열은 오름차순

answer = []
visited = [False]*(N+1)
dfs(1)