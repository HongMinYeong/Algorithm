

def dfs(s):
    if len(answer) == M:
        print(' '.join(map(str, answer)))
        return

    for i in range(s,N+1):
        answer.append(i)
        dfs(i)
        answer.pop()




N, M = list(map(int, input().split()))

answer = []
dfs(1)